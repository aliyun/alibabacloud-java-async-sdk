// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>GetCredentialResponseBody</p>
 */
public class GetCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetCredentialResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCredentialResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * requestId.
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

        public GetCredentialResponseBody build() {
            return new GetCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetCredentialResponseBody</p>
     */
    public static class BoundAgents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("agentName")
        private String agentName;

        private BoundAgents(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BoundAgents create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 

            private Builder() {
            } 

            private Builder(BoundAgents model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
            } 

            /**
             * agentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * agentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            public BoundAgents build() {
                return new BoundAgents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetCredentialResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("boundAgents")
        private java.util.List<BoundAgents> boundAgents;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("credentialId")
        private String credentialId;

        @com.aliyun.core.annotation.NameInMap("credentialMetadata")
        private String credentialMetadata;

        @com.aliyun.core.annotation.NameInMap("credentialType")
        private String credentialType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.boundAgents = builder.boundAgents;
            this.createdAt = builder.createdAt;
            this.credentialId = builder.credentialId;
            this.credentialMetadata = builder.credentialMetadata;
            this.credentialType = builder.credentialType;
            this.description = builder.description;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return boundAgents
         */
        public java.util.List<BoundAgents> getBoundAgents() {
            return this.boundAgents;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return credentialMetadata
         */
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private java.util.List<BoundAgents> boundAgents; 
            private String createdAt; 
            private String credentialId; 
            private String credentialMetadata; 
            private String credentialType; 
            private String description; 
            private String name; 
            private String regionId; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.boundAgents = model.boundAgents;
                this.createdAt = model.createdAt;
                this.credentialId = model.credentialId;
                this.credentialMetadata = model.credentialMetadata;
                this.credentialType = model.credentialType;
                this.description = model.description;
                this.name = model.name;
                this.regionId = model.regionId;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * boundAgents.
             */
            public Builder boundAgents(java.util.List<BoundAgents> boundAgents) {
                this.boundAgents = boundAgents;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * credentialId.
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * credentialMetadata.
             */
            public Builder credentialMetadata(String credentialMetadata) {
                this.credentialMetadata = credentialMetadata;
                return this;
            }

            /**
             * credentialType.
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
