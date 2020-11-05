package cs.carrot.springbasic.repository;

import cs.carrot.springbasic.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void ae() {
        System.out.println("after each");
    }

    @Test
    void save() {
        // given
        Member member = new Member();
        member.setName("spring");

        // when
        repository.save(member);

        //then
        Member result = repository.findById(member.getId()).get();
        Assertions.assertThat(member).isEqualTo(result);
    }

    @Test
    void findById() {
        // given
        Member member = new Member();
        member.setName("spring");
        repository.save(member);

        // when
        Member member1 = repository.findById(member.getId()).get();

        // then
        Assertions.assertThat(member).isEqualTo(member1);
    }

    @Test
    void findByName() {
    }

    @Test
    void findAll() {
    }

    @Test
    void clearStore() {
    }
}