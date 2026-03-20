// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryResponseBody</p>
 */
public class GetMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("expirationDate")
    private String expirationDate;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("immutable")
    private String immutable;

    @com.aliyun.core.annotation.NameInMap("memory")
    private String memory;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private String metadata;

    @com.aliyun.core.annotation.NameInMap("organization")
    private String organization;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private GetMemoryResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.appId = builder.appId;
        this.createdAt = builder.createdAt;
        this.expirationDate = builder.expirationDate;
        this.id = builder.id;
        this.immutable = builder.immutable;
        this.memory = builder.memory;
        this.metadata = builder.metadata;
        this.organization = builder.organization;
        this.owner = builder.owner;
        this.requestId = builder.requestId;
        this.runId = builder.runId;
        this.updatedAt = builder.updatedAt;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return expirationDate
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return immutable
     */
    public String getImmutable() {
        return this.immutable;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    /**
     * @return metadata
     */
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * @return organization
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String agentId; 
        private String appId; 
        private String createdAt; 
        private String expirationDate; 
        private String id; 
        private String immutable; 
        private String memory; 
        private String metadata; 
        private String organization; 
        private String owner; 
        private String requestId; 
        private String runId; 
        private String updatedAt; 
        private String userId; 

        private Builder() {
        } 

        private Builder(GetMemoryResponseBody model) {
            this.agentId = model.agentId;
            this.appId = model.appId;
            this.createdAt = model.createdAt;
            this.expirationDate = model.expirationDate;
            this.id = model.id;
            this.immutable = model.immutable;
            this.memory = model.memory;
            this.metadata = model.metadata;
            this.organization = model.organization;
            this.owner = model.owner;
            this.requestId = model.requestId;
            this.runId = model.runId;
            this.updatedAt = model.updatedAt;
            this.userId = model.userId;
        } 

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
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
         * expirationDate.
         */
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * immutable.
         */
        public Builder immutable(String immutable) {
            this.immutable = immutable;
            return this;
        }

        /**
         * memory.
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * organization.
         */
        public Builder organization(String organization) {
            this.organization = organization;
            return this;
        }

        /**
         * owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
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
         * runId.
         */
        public Builder runId(String runId) {
            this.runId = runId;
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
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetMemoryResponseBody build() {
            return new GetMemoryResponseBody(this);
        } 

    } 

}
