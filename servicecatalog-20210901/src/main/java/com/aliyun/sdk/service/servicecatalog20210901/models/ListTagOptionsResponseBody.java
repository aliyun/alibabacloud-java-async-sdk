// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagOptionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagOptionsResponseBody</p>
 */
public class ListTagOptionsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagOptionDetails")
    private java.util.List < TagOptionDetails> tagOptionDetails;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListTagOptionsResponseBody(Builder builder) {
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
    public java.util.List < TagOptionDetails> getTagOptionDetails() {
        return this.tagOptionDetails;
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
        private java.util.List < TagOptionDetails> tagOptionDetails; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         * <p>
         * 
         * Valid values: 1 to 100. Minimum value: 1. Default value: 10.
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
         * An array that consists of the details of the tag option.
         */
        public Builder tagOptionDetails(java.util.List < TagOptionDetails> tagOptionDetails) {
            this.tagOptionDetails = tagOptionDetails;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTagOptionsResponseBody build() {
            return new ListTagOptionsResponseBody(this);
        } 

    } 

    public static class TagOptionDetails extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("Key")
        private String key;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("TagOptionId")
        private String tagOptionId;

        @NameInMap("Value")
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

            /**
             * Indicates whether the tag option is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The key of the tag option.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the tag option belongs.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The ID of the tag option.
             */
            public Builder tagOptionId(String tagOptionId) {
                this.tagOptionId = tagOptionId;
                return this;
            }

            /**
             * The value of the tag option.
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
