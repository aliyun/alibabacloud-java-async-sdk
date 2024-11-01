// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagKeys")
    private java.util.List < TagKeys> tagKeys;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTagKeysResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < TagKeys> tagKeys; 
        private Integer totalCount; 

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tag keys.</p>
         */
        public Builder tagKeys(java.util.List < TagKeys> tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        private TagKeys(Builder builder) {
            this.category = builder.category;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagKeys create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String category; 
            private String tagKey; 

            /**
             * <p>The type of the tag.</p>
             * <p>Valid values: <strong>Custom</strong>, <strong>System</strong>, and <strong>All</strong>.</p>
             * <p>Default value: <strong>All</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The tag that matches all filter conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
