// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListKnowledgeBaseAdministratorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListKnowledgeBaseAdministratorsResponseBody</p>
 */
public class ListKnowledgeBaseAdministratorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListKnowledgeBaseAdministratorsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBaseAdministratorsResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListKnowledgeBaseAdministratorsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business error code, which is used to determine the error type when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data returned when the request is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The security error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The request parameters are invalid</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListKnowledgeBaseAdministratorsResponseBody build() {
            return new ListKnowledgeBaseAdministratorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKnowledgeBaseAdministratorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseAdministratorsResponseBody</p>
     */
    public static class KnowledgeBaseAdministrators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private KnowledgeBaseAdministrators(Builder builder) {
            this.createTime = builder.createTime;
            this.displayName = builder.displayName;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeBaseAdministrators create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long createTime; 
            private String displayName; 
            private String knowledgeBaseId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(KnowledgeBaseAdministrators model) {
                this.createTime = model.createTime;
                this.displayName = model.displayName;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.userId = model.userId;
            } 

            /**
             * <p>The creation time of the record, represented as a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1790200400000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The display name of the user. This field is optional and is not used to verify the user’s identity.</p>
             * 
             * <strong>example:</strong>
             * <p>User A</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The DataWorks user ID of the administrator.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000000000000</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public KnowledgeBaseAdministrators build() {
                return new KnowledgeBaseAdministrators(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeBaseAdministratorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseAdministratorsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseAdministrators")
        private java.util.List<KnowledgeBaseAdministrators> knowledgeBaseAdministrators;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.knowledgeBaseAdministrators = builder.knowledgeBaseAdministrators;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return knowledgeBaseAdministrators
         */
        public java.util.List<KnowledgeBaseAdministrators> getKnowledgeBaseAdministrators() {
            return this.knowledgeBaseAdministrators;
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

        public static final class Builder {
            private java.util.List<KnowledgeBaseAdministrators> knowledgeBaseAdministrators; 
            private Integer maxResults; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.knowledgeBaseAdministrators = model.knowledgeBaseAdministrators;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The administrators on the current page, excluding the owner.</p>
             */
            public Builder knowledgeBaseAdministrators(java.util.List<KnowledgeBaseAdministrators> knowledgeBaseAdministrators) {
                this.knowledgeBaseAdministrators = knowledgeBaseAdministrators;
                return this;
            }

            /**
             * <p>The maximum number of entries per page used for the current request. If the input parameter is omitted, the value is 20. This is not the actual number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The cursor for the next page. If no subsequent pages exist, null is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJvZmZzZXQiOjIwfQ</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
