// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLatestScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLatestScanTaskResponseBody</p>
 */
public class DescribeLatestScanTaskResponseBody extends TeaModel {
    @NameInMap("LastCheckTime")
    private Long lastCheckTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskNum")
    private Integer riskNum;

    @NameInMap("TargetInfo")
    private String targetInfo;

    @NameInMap("Uuids")
    private java.util.List < String > uuids;

    private DescribeLatestScanTaskResponseBody(Builder builder) {
        this.lastCheckTime = builder.lastCheckTime;
        this.requestId = builder.requestId;
        this.riskNum = builder.riskNum;
        this.targetInfo = builder.targetInfo;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLatestScanTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return lastCheckTime
     */
    public Long getLastCheckTime() {
        return this.lastCheckTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskNum
     */
    public Integer getRiskNum() {
        return this.riskNum;
    }

    /**
     * @return targetInfo
     */
    public String getTargetInfo() {
        return this.targetInfo;
    }

    /**
     * @return uuids
     */
    public java.util.List < String > getUuids() {
        return this.uuids;
    }

    public static final class Builder {
        private Long lastCheckTime; 
        private String requestId; 
        private Integer riskNum; 
        private String targetInfo; 
        private java.util.List < String > uuids; 

        /**
         * LastCheckTime.
         */
        public Builder lastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
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
         * RiskNum.
         */
        public Builder riskNum(Integer riskNum) {
            this.riskNum = riskNum;
            return this;
        }

        /**
         * TargetInfo.
         */
        public Builder targetInfo(String targetInfo) {
            this.targetInfo = targetInfo;
            return this;
        }

        /**
         * Uuids.
         */
        public Builder uuids(java.util.List < String > uuids) {
            this.uuids = uuids;
            return this;
        }

        public DescribeLatestScanTaskResponseBody build() {
            return new DescribeLatestScanTaskResponseBody(this);
        } 

    } 

}
