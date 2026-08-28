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
 * {@link GetWorkspacePluginRequest} extends {@link RequestModel}
 *
 * <p>GetWorkspacePluginRequest</p>
 */
public class GetWorkspacePluginRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pluginName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginName;

    private GetWorkspacePluginRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.pluginName = builder.pluginName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspacePluginRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return pluginName
     */
    public String getPluginName() {
        return this.pluginName;
    }

    public static final class Builder extends Request.Builder<GetWorkspacePluginRequest, Builder> {
        private String workspaceId; 
        private String pluginName; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkspacePluginRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.pluginName = request.pluginName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>collaboration</p>
         */
        public Builder pluginName(String pluginName) {
            this.putPathParameter("pluginName", pluginName);
            this.pluginName = pluginName;
            return this;
        }

        @Override
        public GetWorkspacePluginRequest build() {
            return new GetWorkspacePluginRequest(this);
        } 

    } 

}
