// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DeleteDataAgentSkillMetaRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataAgentSkillMetaRequest</p>
 */
public class DeleteDataAgentSkillMetaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DeleteDataAgentSkillMetaRequest(Builder builder) {
        super(builder);
        this.skillId = builder.skillId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataAgentSkillMetaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteDataAgentSkillMetaRequest, Builder> {
        private String skillId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataAgentSkillMetaRequest request) {
            super(request);
            this.skillId = request.skillId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ski-04pomiln*************j0</p>
         */
        public Builder skillId(String skillId) {
            this.putQueryParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteDataAgentSkillMetaRequest build() {
            return new DeleteDataAgentSkillMetaRequest(this);
        } 

    } 

}
