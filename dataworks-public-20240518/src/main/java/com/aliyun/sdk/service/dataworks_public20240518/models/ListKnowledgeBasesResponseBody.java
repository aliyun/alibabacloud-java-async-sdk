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
 * {@link ListKnowledgeBasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListKnowledgeBasesResponseBody</p>
 */
public class ListKnowledgeBasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListKnowledgeBasesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBasesResponseBody create() {
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
        private Integer maxResults; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListKnowledgeBasesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business error code. This field may be omitted if the request succeeds. If the request fails, the common error response protocol applies.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of knowledge bases on the current page and the cursor for the next page.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of knowledge bases to return per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A human-readable description of the business error. This field may be omitted if the request succeeds. Provide the RequestId when troubleshooting failures.</p>
         * 
         * <strong>example:</strong>
         * <p>The request parameters are invalid.</p>
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

        public ListKnowledgeBasesResponseBody build() {
            return new ListKnowledgeBasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKnowledgeBasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBasesResponseBody</p>
     */
    public static class KnowledgeBases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessRole")
        private String accessRole;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private KnowledgeBases(Builder builder) {
            this.accessRole = builder.accessRole;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeBases create() {
            return builder().build();
        }

        /**
         * @return accessRole
         */
        public String getAccessRole() {
            return this.accessRole;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String accessRole; 
            private Long createTime; 
            private String description; 
            private String knowledgeBaseId; 
            private Long modifyTime; 
            private String name; 
            private String owner; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(KnowledgeBases model) {
                this.accessRole = model.accessRole;
                this.createTime = model.createTime;
                this.description = model.description;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.owner = model.owner;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The read-only access role of the current caller for the knowledge base. Valid values:</p>
             * <ul>
             * <li>OWNER: owner</li>
             * <li>ADMIN: administrator</li>
             * <li>VIEWER: viewer</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OWNER</p>
             */
            public Builder accessRole(String accessRole) {
                this.accessRole = accessRole;
                return this;
            }

            /**
             * <p>The creation time of the knowledge base. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1794369600000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the knowledge base. This field can be empty if no description is set.</p>
             * 
             * <strong>example:</strong>
             * <p>Knowledge about sales metrics, orders, and business policies</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The stable ID of the knowledge base, which can be used to limit the search scope.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The last modification time of the knowledge base. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1794373200000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales knowledge base</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The DataWorks user ID of the knowledge base owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000000000000</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The public status of the knowledge base. This list returns only normally visible knowledge bases, and the value is ACTIVE.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the knowledge base. Valid values:</p>
             * <ul>
             * <li>PERSONAL: personal knowledge base</li>
             * <li>ENTERPRISE: enterprise knowledge base</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PERSONAL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public KnowledgeBases build() {
                return new KnowledgeBases(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKnowledgeBasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBasesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgeBases")
        private java.util.List<KnowledgeBases> knowledgeBases;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.knowledgeBases = builder.knowledgeBases;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return knowledgeBases
         */
        public java.util.List<KnowledgeBases> getKnowledgeBases() {
            return this.knowledgeBases;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List<KnowledgeBases> knowledgeBases; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.knowledgeBases = model.knowledgeBases;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The list of knowledge bases that the current caller has permission to view in the current region.</p>
             */
            public Builder knowledgeBases(java.util.List<KnowledgeBases> knowledgeBases) {
                this.knowledgeBases = knowledgeBases;
                return this;
            }

            /**
             * <p>The pagination cursor. Do not specify this parameter when you request the first page. For subsequent pages, use the NextToken value returned in the previous response as is. An empty response indicates that no more pages are available. If the current page is empty but the cursor is not empty, continue pagination. Keep the same MaxResults value during pagination.</p>
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
