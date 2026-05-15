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
 * {@link DeleteDataAgentKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataAgentKnowledgeBaseRequest</p>
 */
public class DeleteDataAgentKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KbUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kbUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DeleteDataAgentKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.kbUuid = builder.kbUuid;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataAgentKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return kbUuid
     */
    public String getKbUuid() {
        return this.kbUuid;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteDataAgentKnowledgeBaseRequest, Builder> {
        private String DMSUnit; 
        private String kbUuid; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataAgentKnowledgeBaseRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.kbUuid = request.kbUuid;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-HZ-rtl5lwx********q32d3ux</p>
         */
        public Builder kbUuid(String kbUuid) {
            this.putQueryParameter("KbUuid", kbUuid);
            this.kbUuid = kbUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2dl4opo5vbh*******frxfsmw</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteDataAgentKnowledgeBaseRequest build() {
            return new DeleteDataAgentKnowledgeBaseRequest(this);
        } 

    } 

}
