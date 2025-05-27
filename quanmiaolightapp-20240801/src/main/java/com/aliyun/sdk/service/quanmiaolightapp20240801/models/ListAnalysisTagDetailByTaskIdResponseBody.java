// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link ListAnalysisTagDetailByTaskIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnalysisTagDetailByTaskIdResponseBody</p>
 */
public class ListAnalysisTagDetailByTaskIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListAnalysisTagDetailByTaskIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnalysisTagDetailByTaskIdResponseBody create() {
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAnalysisTagDetailByTaskIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAnalysisTagDetailByTaskIdResponseBody build() {
            return new ListAnalysisTagDetailByTaskIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAnalysisTagDetailByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnalysisTagDetailByTaskIdResponseBody</p>
     */
    public static class ContentTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<String> tags;

        private ContentTags(Builder builder) {
            this.tagName = builder.tagName;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentTags create() {
            return builder().build();
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String tagName; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(ContentTags model) {
                this.tagName = model.tagName;
                this.tags = model.tags;
            } 

            /**
             * tagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            public ContentTags build() {
                return new ContentTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnalysisTagDetailByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnalysisTagDetailByTaskIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("contentTags")
        private java.util.List<ContentTags> contentTags;

        @com.aliyun.core.annotation.NameInMap("originResponse")
        private String originResponse;

        @com.aliyun.core.annotation.NameInMap("sourceList")
        private java.util.List<String> sourceList;

        private Data(Builder builder) {
            this.content = builder.content;
            this.contentTags = builder.contentTags;
            this.originResponse = builder.originResponse;
            this.sourceList = builder.sourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentTags
         */
        public java.util.List<ContentTags> getContentTags() {
            return this.contentTags;
        }

        /**
         * @return originResponse
         */
        public String getOriginResponse() {
            return this.originResponse;
        }

        /**
         * @return sourceList
         */
        public java.util.List<String> getSourceList() {
            return this.sourceList;
        }

        public static final class Builder {
            private String content; 
            private java.util.List<ContentTags> contentTags; 
            private String originResponse; 
            private java.util.List<String> sourceList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.contentTags = model.contentTags;
                this.originResponse = model.originResponse;
                this.sourceList = model.sourceList;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * contentTags.
             */
            public Builder contentTags(java.util.List<ContentTags> contentTags) {
                this.contentTags = contentTags;
                return this;
            }

            /**
             * originResponse.
             */
            public Builder originResponse(String originResponse) {
                this.originResponse = originResponse;
                return this;
            }

            /**
             * sourceList.
             */
            public Builder sourceList(java.util.List<String> sourceList) {
                this.sourceList = sourceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
