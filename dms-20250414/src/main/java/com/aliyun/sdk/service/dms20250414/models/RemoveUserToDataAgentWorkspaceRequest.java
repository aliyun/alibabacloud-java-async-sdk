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
 * {@link RemoveUserToDataAgentWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>RemoveUserToDataAgentWorkspaceRequest</p>
 */
public class RemoveUserToDataAgentWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberId")
    private String memberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private RemoveUserToDataAgentWorkspaceRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.memberId = builder.memberId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUserToDataAgentWorkspaceRequest create() {
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
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RemoveUserToDataAgentWorkspaceRequest, Builder> {
        private String DMSUnit; 
        private String memberId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUserToDataAgentWorkspaceRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.memberId = request.memberId;
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
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
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
        public RemoveUserToDataAgentWorkspaceRequest build() {
            return new RemoveUserToDataAgentWorkspaceRequest(this);
        } 

    } 

}
