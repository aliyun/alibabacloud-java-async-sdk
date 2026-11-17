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
 * {@link ListKnowledgeBaseRetrievalGrantsResponseBody} extends {@link TeaModel}
 *
 * <p>ListKnowledgeBaseRetrievalGrantsResponseBody</p>
 */
public class ListKnowledgeBaseRetrievalGrantsResponseBody extends TeaModel {
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

    private ListKnowledgeBaseRetrievalGrantsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBaseRetrievalGrantsResponseBody create() {
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

        private Builder(ListKnowledgeBaseRetrievalGrantsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business error code. You can use this code to determine the error type when the request fails.</p>
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
         * <p>The error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The request parameters are invalid</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can use this ID to troubleshoot issues.</p>
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

        public ListKnowledgeBaseRetrievalGrantsResponseBody build() {
            return new ListKnowledgeBaseRetrievalGrantsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKnowledgeBaseRetrievalGrantsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseRetrievalGrantsResponseBody</p>
     */
    public static class KnowledgeBaseRetrievalGrants extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        private KnowledgeBaseRetrievalGrants(Builder builder) {
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.principalId = builder.principalId;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeBaseRetrievalGrants create() {
            return builder().build();
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String knowledgeBaseId; 
            private String principalId; 
            private String principalType; 

            private Builder() {
            } 

            private Builder(KnowledgeBaseRetrievalGrants model) {
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.principalId = model.principalId;
                this.principalType = model.principalType;
            } 

            /**
             * <p>The knowledge base ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The DataWorks user ID of the principal that receives the share. When a principal is added, the system verifies whether the user is a member of the same tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000000000000</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The type of principal that receives the share. Default value: USER. Only USER is supported in the initial release.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public KnowledgeBaseRetrievalGrants build() {
                return new KnowledgeBaseRetrievalGrants(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeBaseRetrievalGrantsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseRetrievalGrantsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseRetrievalGrants")
        private java.util.List<KnowledgeBaseRetrievalGrants> knowledgeBaseRetrievalGrants;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.knowledgeBaseRetrievalGrants = builder.knowledgeBaseRetrievalGrants;
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
         * @return knowledgeBaseRetrievalGrants
         */
        public java.util.List<KnowledgeBaseRetrievalGrants> getKnowledgeBaseRetrievalGrants() {
            return this.knowledgeBaseRetrievalGrants;
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
            private java.util.List<KnowledgeBaseRetrievalGrants> knowledgeBaseRetrievalGrants; 
            private Integer maxResults; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.knowledgeBaseRetrievalGrants = model.knowledgeBaseRetrievalGrants;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The user grants on the current page.</p>
             */
            public Builder knowledgeBaseRetrievalGrants(java.util.List<KnowledgeBaseRetrievalGrants> knowledgeBaseRetrievalGrants) {
                this.knowledgeBaseRetrievalGrants = knowledgeBaseRetrievalGrants;
                return this;
            }

            /**
             * <p>The maximum number of entries per page used in the current request. If you do not specify this parameter in the request, the value is 20. This value is not the actual number of entries returned on the current page.</p>
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
