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
         * The timestamp when the last check was performed. Unit: milliseconds.
         */
        public Builder lastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of virus detection risks on the server.
         */
        public Builder riskNum(Integer riskNum) {
            this.riskNum = riskNum;
            return this;
        }

        /**
         * The information about the asset on which the virus scan task runs. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:
         * <p>
         * 
         * *   **type**: the type of the asset on which the virus scan task runs. Valid values:
         * 
         *     *   **groupId**: server group
         *     *   **uuid**: server
         * 
         * *   **name**: the name of the server group or server
         * 
         * *   **target**: the asset on which the virus scan task runs The value of this field varies based on the value of the type field.
         * 
         *     *   If the value of **type** is **groupId**, the value of this field is the ID of the server group.
         *     *   If the value of **type** is **uuid**, the value of this field is the UUID of the server.
         */
        public Builder targetInfo(String targetInfo) {
            this.targetInfo = targetInfo;
            return this;
        }

        /**
         * The ID of the asset.
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
