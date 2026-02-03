// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ListTagOptionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagOptionsResponseBody</p>
 */
public class ListTagOptionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagOptionDetails")
    private java.util.List<TagOptionDetails> tagOptionDetails;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTagOptionsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tagOptionDetails = builder.tagOptionDetails;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagOptionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return tagOptionDetails
     */
    public java.util.List<TagOptionDetails> getTagOptionDetails() {
        return this.tagOptionDetails;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<TagOptionDetails> tagOptionDetails; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTagOptionsResponseBody model) {
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.tagOptionDetails = model.tagOptionDetails;
            this.totalCount = model.totalCount;
        } 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>37C9C1DF-EFFC-5D8A-80D0-8657B1F3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the details of the tag option.</p>
         */
        public Builder tagOptionDetails(java.util.List<TagOptionDetails> tagOptionDetails) {
            this.tagOptionDetails = tagOptionDetails;
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

        public ListTagOptionsResponseBody build() {
            return new ListTagOptionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTagOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagOptionsResponseBody</p>
     */
    public static class TagOptionDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("TagOptionId")
        private String tagOptionId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagOptionDetails(Builder builder) {
            this.active = builder.active;
            this.key = builder.key;
            this.owner = builder.owner;
            this.tagOptionId = builder.tagOptionId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagOptionDetails create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return tagOptionId
         */
        public String getTagOptionId() {
            return this.tagOptionId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean active; 
            private String key; 
            private String owner; 
            private String tagOptionId; 
            private String value; 

            private Builder() {
            } 

            private Builder(TagOptionDetails model) {
                this.active = model.active;
                this.key = model.key;
                this.owner = model.owner;
                this.tagOptionId = model.tagOptionId;
                this.value = model.value;
            } 

            /**
             * <p>Indicates whether the tag option is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The key of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the tag option belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>133413081827****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-bp1r3mxq3t****</p>
             */
            public Builder tagOptionId(String tagOptionId) {
                this.tagOptionId = tagOptionId;
                return this;
            }

            /**
             * <p>The value of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagOptionDetails build() {
                return new TagOptionDetails(this);
            } 

        } 

    }
}
