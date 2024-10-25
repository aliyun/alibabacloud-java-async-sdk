// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBClusterShardNumberResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterShardNumberResponseBody</p>
 */
public class DescribeDBClusterShardNumberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShardNumber")
    private Integer shardNumber;

    private DescribeDBClusterShardNumberResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.shardNumber = builder.shardNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterShardNumberResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shardNumber
     */
    public Integer getShardNumber() {
        return this.shardNumber;
    }

    public static final class Builder {
        private String requestId; 
        private Integer shardNumber; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShardNumber.
         */
        public Builder shardNumber(Integer shardNumber) {
            this.shardNumber = shardNumber;
            return this;
        }

        public DescribeDBClusterShardNumberResponseBody build() {
            return new DescribeDBClusterShardNumberResponseBody(this);
        } 

    } 

}
