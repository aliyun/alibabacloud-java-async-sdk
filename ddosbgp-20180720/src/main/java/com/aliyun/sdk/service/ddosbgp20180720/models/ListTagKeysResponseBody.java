// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTagKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagKeysResponseBody</p>
 */
public class ListTagKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagKeys")
    private java.util.List < TagKeys> tagKeys;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTagKeysResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tagKeys = builder.tagKeys;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return tagKeys
     */
    public java.util.List < TagKeys> getTagKeys() {
        return this.tagKeys;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < TagKeys> tagKeys; 
        private Integer totalCount; 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>97935DF1-0289-4AA2-9DD1-72377838B16B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the tags.</p>
         */
        public Builder tagKeys(java.util.List < TagKeys> tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }

        /**
         * <p>The total number of tags returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTagKeysResponseBody build() {
            return new ListTagKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTagKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagKeysResponseBody</p>
     */
    public static class TagKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagCount")
        private Integer tagCount;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        private TagKeys(Builder builder) {
            this.tagCount = builder.tagCount;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagKeys create() {
            return builder().build();
        }

        /**
         * @return tagCount
         */
        public Integer getTagCount() {
            return this.tagCount;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private Integer tagCount; 
            private String tagKey; 

            /**
             * <p>The total number of tag values that correspond to each key.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tagCount(Integer tagCount) {
                this.tagCount = tagCount;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public TagKeys build() {
                return new TagKeys(this);
            } 

        } 

    }
}
