// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWhiteListStrategyUuidCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWhiteListStrategyUuidCountResponseBody</p>
 */
public class DescribeWhiteListStrategyUuidCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UuidCount")
    private Integer uuidCount;

    private DescribeWhiteListStrategyUuidCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uuidCount = builder.uuidCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteListStrategyUuidCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uuidCount
     */
    public Integer getUuidCount() {
        return this.uuidCount;
    }

    public static final class Builder {
        private String requestId; 
        private Integer uuidCount; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of the servers on which the application whitelist policy takes effect.
         */
        public Builder uuidCount(Integer uuidCount) {
            this.uuidCount = uuidCount;
            return this;
        }

        public DescribeWhiteListStrategyUuidCountResponseBody build() {
            return new DescribeWhiteListStrategyUuidCountResponseBody(this);
        } 

    } 

}
