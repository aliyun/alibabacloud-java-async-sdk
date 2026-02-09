// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link DeletePptArtifactRequest} extends {@link RequestModel}
 *
 * <p>DeletePptArtifactRequest</p>
 */
public class DeletePptArtifactRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PptArtifactId")
    private String pptArtifactId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DeletePptArtifactRequest(Builder builder) {
        super(builder);
        this.pptArtifactId = builder.pptArtifactId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePptArtifactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pptArtifactId
     */
    public String getPptArtifactId() {
        return this.pptArtifactId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeletePptArtifactRequest, Builder> {
        private String pptArtifactId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePptArtifactRequest request) {
            super(request);
            this.pptArtifactId = request.pptArtifactId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * PptArtifactId.
         */
        public Builder pptArtifactId(String pptArtifactId) {
            this.putBodyParameter("PptArtifactId", pptArtifactId);
            this.pptArtifactId = pptArtifactId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeletePptArtifactRequest build() {
            return new DeletePptArtifactRequest(this);
        } 

    } 

}
