// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link DeleteRuntimeRequest} extends {@link RequestModel}
 *
 * <p>DeleteRuntimeRequest</p>
 */
public class DeleteRuntimeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RuntimeId")
    private String runtimeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DeleteRuntimeRequest(Builder builder) {
        super(builder);
        this.runtimeId = builder.runtimeId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRuntimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return runtimeId
     */
    public String getRuntimeId() {
        return this.runtimeId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteRuntimeRequest, Builder> {
        private String runtimeId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRuntimeRequest request) {
            super(request);
            this.runtimeId = request.runtimeId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Runtime ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rtime-apje******beaz</p>
         */
        public Builder runtimeId(String runtimeId) {
            this.putPathParameter("RuntimeId", runtimeId);
            this.runtimeId = runtimeId;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteRuntimeRequest build() {
            return new DeleteRuntimeRequest(this);
        } 

    } 

}
