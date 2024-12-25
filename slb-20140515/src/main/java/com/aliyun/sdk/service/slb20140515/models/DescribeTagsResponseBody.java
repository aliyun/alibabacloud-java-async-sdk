// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link DescribeTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagsResponseBody</p>
 */
public class DescribeTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagSets")
    private TagSets tagSets;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTagsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tagSets = builder.tagSets;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return tagSets
     */
    public TagSets getTagSets() {
        return this.tagSets;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private TagSets tagSets; 
        private Integer totalCount; 

        /**
         * <p>The number of the returned page. Minimum value: 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Default value: 50. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tags that are queried.</p>
         */
        public Builder tagSets(TagSets tagSets) {
            this.tagSets = tagSets;
            return this;
        }

        /**
         * <p>The number of instances returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTagsResponseBody build() {
            return new DescribeTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTagsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagsResponseBody</p>
     */
    public static class TagSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TagSet(Builder builder) {
            this.instanceCount = builder.instanceCount;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagSet create() {
            return builder().build();
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private Integer instanceCount; 
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The number of instances to which the tag is added.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>api</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagSet build() {
                return new TagSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTagsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagsResponseBody</p>
     */
    public static class TagSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagSet")
        private java.util.List<TagSet> tagSet;

        private TagSets(Builder builder) {
            this.tagSet = builder.tagSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagSets create() {
            return builder().build();
        }

        /**
         * @return tagSet
         */
        public java.util.List<TagSet> getTagSet() {
            return this.tagSet;
        }

        public static final class Builder {
            private java.util.List<TagSet> tagSet; 

            /**
             * TagSet.
             */
            public Builder tagSet(java.util.List<TagSet> tagSet) {
                this.tagSet = tagSet;
                return this;
            }

            public TagSets build() {
                return new TagSets(this);
            } 

        } 

    }
}
