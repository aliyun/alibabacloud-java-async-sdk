// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DisassociateRenderingProjectInstancesRequest} extends {@link RequestModel}
 *
 * <p>DisassociateRenderingProjectInstancesRequest</p>
 */
public class DisassociateRenderingProjectInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> renderingInstanceIds;

    private DisassociateRenderingProjectInstancesRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.renderingInstanceIds = builder.renderingInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateRenderingProjectInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return renderingInstanceIds
     */
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

    public static final class Builder extends Request.Builder<DisassociateRenderingProjectInstancesRequest, Builder> {
        private String projectId; 
        private java.util.List<String> renderingInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DisassociateRenderingProjectInstancesRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.renderingInstanceIds = request.renderingInstanceIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder renderingInstanceIds(java.util.List<String> renderingInstanceIds) {
            String renderingInstanceIdsShrink = shrink(renderingInstanceIds, "RenderingInstanceIds", "json");
            this.putQueryParameter("RenderingInstanceIds", renderingInstanceIdsShrink);
            this.renderingInstanceIds = renderingInstanceIds;
            return this;
        }

        @Override
        public DisassociateRenderingProjectInstancesRequest build() {
            return new DisassociateRenderingProjectInstancesRequest(this);
        } 

    } 

}
