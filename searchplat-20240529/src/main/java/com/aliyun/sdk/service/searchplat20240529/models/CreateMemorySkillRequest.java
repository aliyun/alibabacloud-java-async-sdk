// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link CreateMemorySkillRequest} extends {@link RequestModel}
 *
 * <p>CreateMemorySkillRequest</p>
 */
public class CreateMemorySkillRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agent_id")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zip_base64")
    private String zipBase64;

    private CreateMemorySkillRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.agentId = builder.agentId;
        this.userId = builder.userId;
        this.zipBase64 = builder.zipBase64;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemorySkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return zipBase64
     */
    public String getZipBase64() {
        return this.zipBase64;
    }

    public static final class Builder extends Request.Builder<CreateMemorySkillRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private String agentId; 
        private String userId; 
        private String zipBase64; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemorySkillRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.agentId = request.agentId;
            this.userId = request.userId;
            this.zipBase64 = request.zipBase64;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * agent_id.
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agent_id", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * zip_base64.
         */
        public Builder zipBase64(String zipBase64) {
            this.putBodyParameter("zip_base64", zipBase64);
            this.zipBase64 = zipBase64;
            return this;
        }

        @Override
        public CreateMemorySkillRequest build() {
            return new CreateMemorySkillRequest(this);
        } 

    } 

}
