// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExcpetionCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExcpetionCountResponseBody</p>
 */
public class DescribeExcpetionCountResponseBody extends TeaModel {
    @NameInMap("ExceptionIpCount")
    private Integer exceptionIpCount;

    @NameInMap("ExpireTimeCount")
    private Integer expireTimeCount;

    @NameInMap("RequestId")
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

        /**
         * WB269094
         */
        public Builder exceptionIpCount(Integer exceptionIpCount) {
            this.exceptionIpCount = exceptionIpCount;
            return this;
        }

        /**
         * ExpireTimeCount.
         */
        public Builder expireTimeCount(Integer expireTimeCount) {
            this.expireTimeCount = expireTimeCount;
            return this;
        }

        /**
         * RequestId.
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
