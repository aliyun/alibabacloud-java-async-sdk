// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstTransInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstTransInfoResponseBody</p>
 */
public class GetInstTransInfoResponseBody extends TeaModel {
    @NameInMap("chargeType")
    private String chargeType;

    @NameInMap("endTime")
    private Long endTime;

    @NameInMap("instanceId")
    private String instanceId;

    @NameInMap("isAutoRenew")
    private Boolean isAutoRenew;

    @NameInMap("renewCycle")
    private Integer renewCycle;

    @NameInMap("startTime")
    private Long startTime;

    private GetInstTransInfoResponseBody(Builder builder) {
        this.chargeType = builder.chargeType;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.isAutoRenew = builder.isAutoRenew;
        this.renewCycle = builder.renewCycle;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstTransInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    /**
     * @return renewCycle
     */
    public Integer getRenewCycle() {
        return this.renewCycle;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String chargeType; 
        private Long endTime; 
        private String instanceId; 
        private Boolean isAutoRenew; 
        private Integer renewCycle; 
        private Long startTime; 

        /**
         * chargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * isAutoRenew.
         */
        public Builder isAutoRenew(Boolean isAutoRenew) {
            this.isAutoRenew = isAutoRenew;
            return this;
        }

        /**
         * renewCycle.
         */
        public Builder renewCycle(Integer renewCycle) {
            this.renewCycle = renewCycle;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public GetInstTransInfoResponseBody build() {
            return new GetInstTransInfoResponseBody(this);
        } 

    } 

}
