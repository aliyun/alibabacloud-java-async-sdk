// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageStatisticsResponseBody</p>
 */
public class DescribeImageStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceCount")
    private Integer instanceCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskInstanceCount")
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
         * <p>The number of container images in your assets. Only Container Registry Enterprise Edition instances are counted.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4E5BFDCF-B9DD-430D-9DA4-151BCB581C9D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of container images that have security risks. Only Container Registry Enterprise Edition instances are counted.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
