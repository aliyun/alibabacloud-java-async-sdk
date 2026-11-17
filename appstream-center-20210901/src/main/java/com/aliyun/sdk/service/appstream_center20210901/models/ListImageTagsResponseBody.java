// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListImageTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageTagsResponseBody</p>
 */
public class ListImageTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListImageTagsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageTagsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListImageTagsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidAppInstanceGroup.NotFound</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of built-in image tags.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The error message returned when an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token used to start the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>ptnJAAAAAAAxNzE5OTEwNQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListImageTagsResponseBody build() {
            return new ListImageTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImageTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageTagsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private Data(Builder builder) {
            this.category = builder.category;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String category; 
            private String tag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.category = model.category;
                this.tag = model.tag;
            } 

            /**
             * <p>The tag categorization.</p>
             * 
             * <strong>example:</strong>
             * <p>Solution</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>AIGC</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
