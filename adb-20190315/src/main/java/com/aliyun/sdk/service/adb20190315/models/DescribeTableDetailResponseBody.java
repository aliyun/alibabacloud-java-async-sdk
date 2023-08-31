// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTableDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTableDetailResponseBody</p>
 */
public class DescribeTableDetailResponseBody extends TeaModel {
    @NameInMap("AvgSize")
    private Long avgSize;

    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeTableDetailResponseBody(Builder builder) {
        this.avgSize = builder.avgSize;
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTableDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return avgSize
     */
    public Long getAvgSize() {
        return this.avgSize;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long avgSize; 
        private Items items; 
        private String requestId; 

        /**
         * The average number of rows in partitions.
         */
        public Builder avgSize(Long avgSize) {
            this.avgSize = avgSize;
            return this;
        }

        /**
         * The list of partitions.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTableDetailResponseBody build() {
            return new DescribeTableDetailResponseBody(this);
        } 

    } 

    public static class Shard extends TeaModel {
        @NameInMap("Id")
        private Integer id;

        @NameInMap("Size")
        private Long size;

        private Shard(Builder builder) {
            this.id = builder.id;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Shard create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer id; 
            private Long size; 

            /**
             * The ID of the partition. Only the numeric part of the partition name is returned.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The number of rows in the table.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Shard build() {
                return new Shard(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Shard")
        private java.util.List < Shard> shard;

        private Items(Builder builder) {
            this.shard = builder.shard;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return shard
         */
        public java.util.List < Shard> getShard() {
            return this.shard;
        }

        public static final class Builder {
            private java.util.List < Shard> shard; 

            /**
             * Shard.
             */
            public Builder shard(java.util.List < Shard> shard) {
                this.shard = shard;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
