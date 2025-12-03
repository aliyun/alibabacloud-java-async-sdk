// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenOperateInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScreenOperateInfoResponseBody</p>
 */
public class DescribeScreenOperateInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DateArray")
    private java.util.List<String> dateArray;

    @com.aliyun.core.annotation.NameInMap("HealthCheckDealedCount")
    private Integer healthCheckDealedCount;

    @com.aliyun.core.annotation.NameInMap("HealthCheckValueArray")
    private java.util.List<String> healthCheckValueArray;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEventDealedCount")
    private Integer securityEventDealedCount;

    @com.aliyun.core.annotation.NameInMap("SuspEventValueArray")
    private java.util.List<String> suspEventValueArray;

    @com.aliyun.core.annotation.NameInMap("VulValueArray")
    private java.util.List<String> vulValueArray;

    @com.aliyun.core.annotation.NameInMap("VulnerabilityDealedCount")
    private Integer vulnerabilityDealedCount;

    private DescribeScreenOperateInfoResponseBody(Builder builder) {
        this.dateArray = builder.dateArray;
        this.healthCheckDealedCount = builder.healthCheckDealedCount;
        this.healthCheckValueArray = builder.healthCheckValueArray;
        this.requestId = builder.requestId;
        this.securityEventDealedCount = builder.securityEventDealedCount;
        this.suspEventValueArray = builder.suspEventValueArray;
        this.vulValueArray = builder.vulValueArray;
        this.vulnerabilityDealedCount = builder.vulnerabilityDealedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenOperateInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dateArray
     */
    public java.util.List<String> getDateArray() {
        return this.dateArray;
    }

    /**
     * @return healthCheckDealedCount
     */
    public Integer getHealthCheckDealedCount() {
        return this.healthCheckDealedCount;
    }

    /**
     * @return healthCheckValueArray
     */
    public java.util.List<String> getHealthCheckValueArray() {
        return this.healthCheckValueArray;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEventDealedCount
     */
    public Integer getSecurityEventDealedCount() {
        return this.securityEventDealedCount;
    }

    /**
     * @return suspEventValueArray
     */
    public java.util.List<String> getSuspEventValueArray() {
        return this.suspEventValueArray;
    }

    /**
     * @return vulValueArray
     */
    public java.util.List<String> getVulValueArray() {
        return this.vulValueArray;
    }

    /**
     * @return vulnerabilityDealedCount
     */
    public Integer getVulnerabilityDealedCount() {
        return this.vulnerabilityDealedCount;
    }

    public static final class Builder {
        private java.util.List<String> dateArray; 
        private Integer healthCheckDealedCount; 
        private java.util.List<String> healthCheckValueArray; 
        private String requestId; 
        private Integer securityEventDealedCount; 
        private java.util.List<String> suspEventValueArray; 
        private java.util.List<String> vulValueArray; 
        private Integer vulnerabilityDealedCount; 

        private Builder() {
        } 

        private Builder(DescribeScreenOperateInfoResponseBody model) {
            this.dateArray = model.dateArray;
            this.healthCheckDealedCount = model.healthCheckDealedCount;
            this.healthCheckValueArray = model.healthCheckValueArray;
            this.requestId = model.requestId;
            this.securityEventDealedCount = model.securityEventDealedCount;
            this.suspEventValueArray = model.suspEventValueArray;
            this.vulValueArray = model.vulValueArray;
            this.vulnerabilityDealedCount = model.vulnerabilityDealedCount;
        } 

        /**
         * DateArray.
         */
        public Builder dateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }

        /**
         * HealthCheckDealedCount.
         */
        public Builder healthCheckDealedCount(Integer healthCheckDealedCount) {
            this.healthCheckDealedCount = healthCheckDealedCount;
            return this;
        }

        /**
         * HealthCheckValueArray.
         */
        public Builder healthCheckValueArray(java.util.List<String> healthCheckValueArray) {
            this.healthCheckValueArray = healthCheckValueArray;
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
         * SecurityEventDealedCount.
         */
        public Builder securityEventDealedCount(Integer securityEventDealedCount) {
            this.securityEventDealedCount = securityEventDealedCount;
            return this;
        }

        /**
         * SuspEventValueArray.
         */
        public Builder suspEventValueArray(java.util.List<String> suspEventValueArray) {
            this.suspEventValueArray = suspEventValueArray;
            return this;
        }

        /**
         * VulValueArray.
         */
        public Builder vulValueArray(java.util.List<String> vulValueArray) {
            this.vulValueArray = vulValueArray;
            return this;
        }

        /**
         * VulnerabilityDealedCount.
         */
        public Builder vulnerabilityDealedCount(Integer vulnerabilityDealedCount) {
            this.vulnerabilityDealedCount = vulnerabilityDealedCount;
            return this;
        }

        public DescribeScreenOperateInfoResponseBody build() {
            return new DescribeScreenOperateInfoResponseBody(this);
        } 

    } 

}
