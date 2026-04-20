// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link RemoveWorkspaceUserRequest} extends {@link RequestModel}
 *
 * <p>RemoveWorkspaceUserRequest</p>
 */
public class RemoveWorkspaceUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmsUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dmsUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String workspaceId;

    private RemoveWorkspaceUserRequest(Builder builder) {
        super(builder);
        this.dmsUserIds = builder.dmsUserIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveWorkspaceUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dmsUserIds
     */
    public String getDmsUserIds() {
        return this.dmsUserIds;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RemoveWorkspaceUserRequest, Builder> {
        private String dmsUserIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveWorkspaceUserRequest request) {
            super(request);
            this.dmsUserIds = request.dmsUserIds;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
         */
        public Builder dmsUserIds(String dmsUserIds) {
            this.putQueryParameter("DmsUserIds", dmsUserIds);
            this.dmsUserIds = dmsUserIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RemoveWorkspaceUserRequest build() {
            return new RemoveWorkspaceUserRequest(this);
        } 

    } 

}
