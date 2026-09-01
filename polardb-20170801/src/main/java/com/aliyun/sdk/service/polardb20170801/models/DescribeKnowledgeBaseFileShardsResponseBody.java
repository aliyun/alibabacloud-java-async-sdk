// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeKnowledgeBaseFileShardsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKnowledgeBaseFileShardsResponseBody</p>
 */
public class DescribeKnowledgeBaseFileShardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Shards")
    private java.util.List<Shards> shards;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeKnowledgeBaseFileShardsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.shards = builder.shards;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeBaseFileShardsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shards
     */
    public java.util.List<Shards> getShards() {
        return this.shards;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Shards> shards; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeKnowledgeBaseFileShardsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.shards = model.shards;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-xxxx-xxxx-xxxx-20E0DE84B2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Shards.
         */
        public Builder shards(java.util.List<Shards> shards) {
            this.shards = shards;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeKnowledgeBaseFileShardsResponseBody build() {
            return new DescribeKnowledgeBaseFileShardsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKnowledgeBaseFileShardsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseFileShardsResponseBody</p>
     */
    public static class Shards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Headings")
        private java.util.List<String> headings;

        @com.aliyun.core.annotation.NameInMap("PageNumbers")
        private java.util.List<String> pageNumbers;

        @com.aliyun.core.annotation.NameInMap("ShardContent")
        private String shardContent;

        @com.aliyun.core.annotation.NameInMap("ShardIndex")
        private Integer shardIndex;

        private Shards(Builder builder) {
            this.headings = builder.headings;
            this.pageNumbers = builder.pageNumbers;
            this.shardContent = builder.shardContent;
            this.shardIndex = builder.shardIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Shards create() {
            return builder().build();
        }

        /**
         * @return headings
         */
        public java.util.List<String> getHeadings() {
            return this.headings;
        }

        /**
         * @return pageNumbers
         */
        public java.util.List<String> getPageNumbers() {
            return this.pageNumbers;
        }

        /**
         * @return shardContent
         */
        public String getShardContent() {
            return this.shardContent;
        }

        /**
         * @return shardIndex
         */
        public Integer getShardIndex() {
            return this.shardIndex;
        }

        public static final class Builder {
            private java.util.List<String> headings; 
            private java.util.List<String> pageNumbers; 
            private String shardContent; 
            private Integer shardIndex; 

            private Builder() {
            } 

            private Builder(Shards model) {
                this.headings = model.headings;
                this.pageNumbers = model.pageNumbers;
                this.shardContent = model.shardContent;
                this.shardIndex = model.shardIndex;
            } 

            /**
             * Headings.
             */
            public Builder headings(java.util.List<String> headings) {
                this.headings = headings;
                return this;
            }

            /**
             * PageNumbers.
             */
            public Builder pageNumbers(java.util.List<String> pageNumbers) {
                this.pageNumbers = pageNumbers;
                return this;
            }

            /**
             * ShardContent.
             */
            public Builder shardContent(String shardContent) {
                this.shardContent = shardContent;
                return this;
            }

            /**
             * ShardIndex.
             */
            public Builder shardIndex(Integer shardIndex) {
                this.shardIndex = shardIndex;
                return this;
            }

            public Shards build() {
                return new Shards(this);
            } 

        } 

    }
}
