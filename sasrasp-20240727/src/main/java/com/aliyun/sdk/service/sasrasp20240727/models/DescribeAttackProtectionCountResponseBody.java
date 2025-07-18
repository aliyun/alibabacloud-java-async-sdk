// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasrasp20240727.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAttackProtectionCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttackProtectionCountResponseBody</p>
 */
public class DescribeAttackProtectionCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BlockHighCount")
    private Long blockHighCount;

    @com.aliyun.core.annotation.NameInMap("BlockLowCount")
    private Long blockLowCount;

    @com.aliyun.core.annotation.NameInMap("BlockMediumCount")
    private Long blockMediumCount;

    @com.aliyun.core.annotation.NameInMap("MonitorHighCount")
    private Long monitorHighCount;

    @com.aliyun.core.annotation.NameInMap("MonitorLowCount")
    private Long monitorLowCount;

    @com.aliyun.core.annotation.NameInMap("MonitorMediumCount")
    private Long monitorMediumCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRequestCount")
    private Long totalRequestCount;

    private DescribeAttackProtectionCountResponseBody(Builder builder) {
        this.blockHighCount = builder.blockHighCount;
        this.blockLowCount = builder.blockLowCount;
        this.blockMediumCount = builder.blockMediumCount;
        this.monitorHighCount = builder.monitorHighCount;
        this.monitorLowCount = builder.monitorLowCount;
        this.monitorMediumCount = builder.monitorMediumCount;
        this.requestId = builder.requestId;
        this.totalRequestCount = builder.totalRequestCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttackProtectionCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockHighCount
     */
    public Long getBlockHighCount() {
        return this.blockHighCount;
    }

    /**
     * @return blockLowCount
     */
    public Long getBlockLowCount() {
        return this.blockLowCount;
    }

    /**
     * @return blockMediumCount
     */
    public Long getBlockMediumCount() {
        return this.blockMediumCount;
    }

    /**
     * @return monitorHighCount
     */
    public Long getMonitorHighCount() {
        return this.monitorHighCount;
    }

    /**
     * @return monitorLowCount
     */
    public Long getMonitorLowCount() {
        return this.monitorLowCount;
    }

    /**
     * @return monitorMediumCount
     */
    public Long getMonitorMediumCount() {
        return this.monitorMediumCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRequestCount
     */
    public Long getTotalRequestCount() {
        return this.totalRequestCount;
    }

    public static final class Builder {
        private Long blockHighCount; 
        private Long blockLowCount; 
        private Long blockMediumCount; 
        private Long monitorHighCount; 
        private Long monitorLowCount; 
        private Long monitorMediumCount; 
        private String requestId; 
        private Long totalRequestCount; 

        private Builder() {
        } 

        private Builder(DescribeAttackProtectionCountResponseBody model) {
            this.blockHighCount = model.blockHighCount;
            this.blockLowCount = model.blockLowCount;
            this.blockMediumCount = model.blockMediumCount;
            this.monitorHighCount = model.monitorHighCount;
            this.monitorLowCount = model.monitorLowCount;
            this.monitorMediumCount = model.monitorMediumCount;
            this.requestId = model.requestId;
            this.totalRequestCount = model.totalRequestCount;
        } 

        /**
         * BlockHighCount.
         */
        public Builder blockHighCount(Long blockHighCount) {
            this.blockHighCount = blockHighCount;
            return this;
        }

        /**
         * BlockLowCount.
         */
        public Builder blockLowCount(Long blockLowCount) {
            this.blockLowCount = blockLowCount;
            return this;
        }

        /**
         * BlockMediumCount.
         */
        public Builder blockMediumCount(Long blockMediumCount) {
            this.blockMediumCount = blockMediumCount;
            return this;
        }

        /**
         * MonitorHighCount.
         */
        public Builder monitorHighCount(Long monitorHighCount) {
            this.monitorHighCount = monitorHighCount;
            return this;
        }

        /**
         * MonitorLowCount.
         */
        public Builder monitorLowCount(Long monitorLowCount) {
            this.monitorLowCount = monitorLowCount;
            return this;
        }

        /**
         * MonitorMediumCount.
         */
        public Builder monitorMediumCount(Long monitorMediumCount) {
            this.monitorMediumCount = monitorMediumCount;
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
         * TotalRequestCount.
         */
        public Builder totalRequestCount(Long totalRequestCount) {
            this.totalRequestCount = totalRequestCount;
            return this;
        }

        public DescribeAttackProtectionCountResponseBody build() {
            return new DescribeAttackProtectionCountResponseBody(this);
        } 

    } 

}
