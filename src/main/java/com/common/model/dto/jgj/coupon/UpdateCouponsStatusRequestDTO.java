package com.common.model.dto.jgj.coupon;

import com.common.model.dto.jgj.common.RequestDTO;
import lombok.Data;

/**
 * Created by wangwei on 2018/8/15.
 */
@Data
public class UpdateCouponsStatusRequestDTO extends RequestDTO {

    private String couponBatchId;

    //channelType 平安RUN传01/ALS:00/多利:02
    private String channelType;

}