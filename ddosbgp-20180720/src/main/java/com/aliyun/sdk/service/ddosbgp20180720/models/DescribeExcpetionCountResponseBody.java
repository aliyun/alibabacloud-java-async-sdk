// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
 * {@link DescribeExcpetionCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExcpetionCountResponseBody</p>
 */
public class DescribeExcpetionCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExceptionIpCount")
    private Integer exceptionIpCount;

    @com.aliyun.core.annotation.NameInMap("ExpireTimeCount")
    private Integer expireTimeCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeExcpetionCountResponseBody(Builder builder) {
        this.exceptionIpCount = builder.exceptionIpCount;
        this.expireTimeCount = builder.expireTimeCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExcpetionCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exceptionIpCount
     */
    public Integer getExceptionIpCount() {
        return this.exceptionIpCount;
    }

    /**
     * @return expireTimeCount
     */
    public Integer getExpireTimeCount() {
        return this.expireTimeCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer exceptionIpCount; 
        private Integer expireTimeCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeExcpetionCountResponseBody model) {
            this.exceptionIpCount = model.exceptionIpCount;
            this.expireTimeCount = model.expireTimeCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of abnormal IP addresses (such as those in the Black Hole Activated state) among protected assets that are assigned public IP addresses (such as a cloud server ECS instance, a Server Load Balancer (SLB) instance, and an elastic IP address (EIP)).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder exceptionIpCount(Integer exceptionIpCount) {
            this.exceptionIpCount = exceptionIpCount;
            return this;
        }

        /**
         * <p>The number of Anti-DDoS Origin instances that are about to expire (with a remaining validity period of less than 7 days).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder expireTimeCount(Integer expireTimeCount) {
            this.expireTimeCount = expireTimeCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4B45279A-B1BE-5EEE-87CA-58AF4183EA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExcpetionCountResponseBody build() {
            return new DescribeExcpetionCountResponseBody(this);
        } 

    } 

}
