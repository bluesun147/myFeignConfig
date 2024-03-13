package com.haechan.feign.dto;

import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Component
public class ContractFeignResponse {
    private Long contractId;
//    private Ost ost;
    private Long ostId;
    // 간접 참조 (msa)
    private Long distributorId;

    // 제작사 퍼센트
    private Double producerPercent;

    // 가창자 퍼센트
    private Double singerPercent;

    // 시작일
    private LocalDateTime startDate;

    // 종료일
    private LocalDateTime endDate;

    // 생성 날짜
    private LocalDateTime createdAt;

    // 업데이트 날짜
    private LocalDateTime updatedAt;
}