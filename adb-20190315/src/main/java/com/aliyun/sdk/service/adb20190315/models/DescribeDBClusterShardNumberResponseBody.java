// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeDBClusterShardNumberResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterShardNumberResponseBody</p>
 */
public class DescribeDBClusterShardNumberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableShardNumberList")
    private java.util.List<AvailableShardNumberList> availableShardNumberList;

    @com.aliyun.core.annotation.NameInMap("AvailableShardNumbers")
    private java.util.List<Integer> availableShardNumbers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShardNumber")
    private Integer shardNumber;

    private DescribeDBClusterShardNumberResponseBody(Builder builder) {
        this.availableShardNumberList = builder.availableShardNumberList;
        this.availableShardNumbers = builder.availableShardNumbers;
        this.requestId = builder.requestId;
        this.shardNumber = builder.shardNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterShardNumberResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableShardNumberList
     */
    public java.util.List<AvailableShardNumberList> getAvailableShardNumberList() {
        return this.availableShardNumberList;
    }

    /**
     * @return availableShardNumbers
     */
    public java.util.List<Integer> getAvailableShardNumbers() {
        return this.availableShardNumbers;
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
        private java.util.List<AvailableShardNumberList> availableShardNumberList; 
        private java.util.List<Integer> availableShardNumbers; 
        private String requestId; 
        private Integer shardNumber; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterShardNumberResponseBody model) {
            this.availableShardNumberList = model.availableShardNumberList;
            this.availableShardNumbers = model.availableShardNumbers;
            this.requestId = model.requestId;
            this.shardNumber = model.shardNumber;
        } 

        /**
         * <p>The supported numbers of shards, including the number of current shards and the number of desired shards.</p>
         */
        public Builder availableShardNumberList(java.util.List<AvailableShardNumberList> availableShardNumberList) {
            this.availableShardNumberList = availableShardNumberList;
            return this;
        }

        /**
         * <p>The number of desired shards, excluding the number of current shards.</p>
         */
        public Builder availableShardNumbers(java.util.List<Integer> availableShardNumbers) {
            this.availableShardNumbers = availableShardNumbers;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBE843D8-964D-5EA3-9D31-822125611B6E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of shards that you want to change during the data migration.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder shardNumber(Integer shardNumber) {
            this.shardNumber = shardNumber;
            return this;
        }

        public DescribeDBClusterShardNumberResponseBody build() {
            return new DescribeDBClusterShardNumberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterShardNumberResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterShardNumberResponseBody</p>
     */
    public static class AvailableShardNumberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShardNumber")
        private Integer shardNumber;

        private AvailableShardNumberList(Builder builder) {
            this.shardNumber = builder.shardNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableShardNumberList create() {
            return builder().build();
        }

        /**
         * @return shardNumber
         */
        public Integer getShardNumber() {
            return this.shardNumber;
        }

        public static final class Builder {
            private Integer shardNumber; 

            private Builder() {
            } 

            private Builder(AvailableShardNumberList model) {
                this.shardNumber = model.shardNumber;
            } 

            /**
             * <p>The number of shards.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder shardNumber(Integer shardNumber) {
                this.shardNumber = shardNumber;
                return this;
            }

            public AvailableShardNumberList build() {
                return new AvailableShardNumberList(this);
            } 

        } 

    }
}
