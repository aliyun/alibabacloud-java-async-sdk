// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckTrialFixCountResponseBody} extends {@link TeaModel}
 *
 * <p>CheckTrialFixCountResponseBody</p>
 */
public class CheckTrialFixCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanFix")
    private Boolean canFix;

    @com.aliyun.core.annotation.NameInMap("ExpendCount")
    private Integer expendCount;

    @com.aliyun.core.annotation.NameInMap("RemainCount")
    private Integer remainCount;

    @com.aliyun.core.annotation.NameInMap("RepairedCount")
    private Integer repairedCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("isTrial")
    private Boolean isTrial;

    private CheckTrialFixCountResponseBody(Builder builder) {
        this.canFix = builder.canFix;
        this.expendCount = builder.expendCount;
        this.remainCount = builder.remainCount;
        this.repairedCount = builder.repairedCount;
        this.requestId = builder.requestId;
        this.isTrial = builder.isTrial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckTrialFixCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return canFix
     */
    public Boolean getCanFix() {
        return this.canFix;
    }

    /**
     * @return expendCount
     */
    public Integer getExpendCount() {
        return this.expendCount;
    }

    /**
     * @return remainCount
     */
    public Integer getRemainCount() {
        return this.remainCount;
    }

    /**
     * @return repairedCount
     */
    public Integer getRepairedCount() {
        return this.repairedCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return isTrial
     */
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    public static final class Builder {
        private Boolean canFix; 
        private Integer expendCount; 
        private Integer remainCount; 
        private Integer repairedCount; 
        private String requestId; 
        private Boolean isTrial; 

        /**
         * CanFix.
         */
        public Builder canFix(Boolean canFix) {
            this.canFix = canFix;
            return this;
        }

        /**
         * ExpendCount.
         */
        public Builder expendCount(Integer expendCount) {
            this.expendCount = expendCount;
            return this;
        }

        /**
         * RemainCount.
         */
        public Builder remainCount(Integer remainCount) {
            this.remainCount = remainCount;
            return this;
        }

        /**
         * RepairedCount.
         */
        public Builder repairedCount(Integer repairedCount) {
            this.repairedCount = repairedCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * isTrial.
         */
        public Builder isTrial(Boolean isTrial) {
            this.isTrial = isTrial;
            return this;
        }

        public CheckTrialFixCountResponseBody build() {
            return new CheckTrialFixCountResponseBody(this);
        } 

    } 

}
