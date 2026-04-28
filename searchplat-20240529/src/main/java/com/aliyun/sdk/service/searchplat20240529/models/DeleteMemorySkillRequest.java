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
 * {@link DeleteMemorySkillRequest} extends {@link RequestModel}
 *
 * <p>DeleteMemorySkillRequest</p>
 */
public class DeleteMemorySkillRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    private String serviceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("skill_id")
    private String skillId;

    private DeleteMemorySkillRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.skillId = builder.skillId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMemorySkillRequest create() {
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
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    public static final class Builder extends Request.Builder<DeleteMemorySkillRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private String skillId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMemorySkillRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.skillId = request.skillId;
        } 

        /**
         * workspace_name.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * service_id.
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * skill_id.
         */
        public Builder skillId(String skillId) {
            this.putPathParameter("skill_id", skillId);
            this.skillId = skillId;
            return this;
        }

        @Override
        public DeleteMemorySkillRequest build() {
            return new DeleteMemorySkillRequest(this);
        } 

    } 

}
