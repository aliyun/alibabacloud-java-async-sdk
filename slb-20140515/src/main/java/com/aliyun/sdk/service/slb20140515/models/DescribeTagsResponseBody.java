// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagsResponseBody</p>
 */
public class DescribeTagsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagSets")
    private TagSets tagSets;

    @NameInMap("TotalCount")
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
         * The number of the returned page. Minimum value: 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Default value: 50. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A list of tags.
         */
        public Builder tagSets(TagSets tagSets) {
            this.tagSets = tagSets;
            return this;
        }

        /**
         * The number of instances returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTagsResponseBody build() {
            return new DescribeTagsResponseBody(this);
        } 

    } 

    public static class TagSet extends TeaModel {
        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
             * The number of instances to which the tag is added.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
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
    public static class TagSets extends TeaModel {
        @NameInMap("TagSet")
        private java.util.List < TagSet> tagSet;

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
        public java.util.List < TagSet> getTagSet() {
            return this.tagSet;
        }

        public static final class Builder {
            private java.util.List < TagSet> tagSet; 

            /**
             * TagSet.
             */
            public Builder tagSet(java.util.List < TagSet> tagSet) {
                this.tagSet = tagSet;
                return this;
            }

            public TagSets build() {
                return new TagSets(this);
            } 

        } 

    }
}
