// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageStatisticsResponseBody</p>
 */
public class DescribeImageStatisticsResponseBody extends TeaModel {
    @NameInMap("InstanceCount")
    private Integer instanceCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskInstanceCount")
    private Integer riskInstanceCount;

    private DescribeImageStatisticsResponseBody(Builder builder) {
        this.instanceCount = builder.instanceCount;
        this.requestId = builder.requestId;
        this.riskInstanceCount = builder.riskInstanceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskInstanceCount
     */
    public Integer getRiskInstanceCount() {
        return this.riskInstanceCount;
    }

    public static final class Builder {
        private Integer instanceCount; 
        private String requestId; 
        private Integer riskInstanceCount; 

        /**
         * The number of container images in your assets. Only Container Registry Enterprise Edition instances are counted.
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of container images that have security risks. Only Container Registry Enterprise Edition instances are counted.
         */
        public Builder riskInstanceCount(Integer riskInstanceCount) {
            this.riskInstanceCount = riskInstanceCount;
            return this;
        }

        public DescribeImageStatisticsResponseBody build() {
            return new DescribeImageStatisticsResponseBody(this);
        } 

    } 

}
