// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHoneyPotAuthResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHoneyPotAuthResponseBody</p>
 */
public class DescribeHoneyPotAuthResponseBody extends TeaModel {
    @NameInMap("HoneyPotAuthCount")
    private Long honeyPotAuthCount;

    @NameInMap("HoneyPotCount")
    private Integer honeyPotCount;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHoneyPotAuthResponseBody(Builder builder) {
        this.honeyPotAuthCount = builder.honeyPotAuthCount;
        this.honeyPotCount = builder.honeyPotCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHoneyPotAuthResponseBody create() {
        return builder().build();
    }

    /**
     * @return honeyPotAuthCount
     */
    public Long getHoneyPotAuthCount() {
        return this.honeyPotAuthCount;
    }

    /**
     * @return honeyPotCount
     */
    public Integer getHoneyPotCount() {
        return this.honeyPotCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long honeyPotAuthCount; 
        private Integer honeyPotCount; 
        private String requestId; 

        /**
         * HoneyPotAuthCount.
         */
        public Builder honeyPotAuthCount(Long honeyPotAuthCount) {
            this.honeyPotAuthCount = honeyPotAuthCount;
            return this;
        }

        /**
         * HoneyPotCount.
         */
        public Builder honeyPotCount(Integer honeyPotCount) {
            this.honeyPotCount = honeyPotCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHoneyPotAuthResponseBody build() {
            return new DescribeHoneyPotAuthResponseBody(this);
        } 

    } 

}
