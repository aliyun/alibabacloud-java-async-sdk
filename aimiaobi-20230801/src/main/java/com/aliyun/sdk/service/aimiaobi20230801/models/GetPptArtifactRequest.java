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
 * {@link GetPptArtifactRequest} extends {@link RequestModel}
 *
 * <p>GetPptArtifactRequest</p>
 */
public class GetPptArtifactRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PptArtifactId")
    private Integer pptArtifactId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetPptArtifactRequest(Builder builder) {
        super(builder);
        this.pptArtifactId = builder.pptArtifactId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPptArtifactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pptArtifactId
     */
    public Integer getPptArtifactId() {
        return this.pptArtifactId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetPptArtifactRequest, Builder> {
        private Integer pptArtifactId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetPptArtifactRequest request) {
            super(request);
            this.pptArtifactId = request.pptArtifactId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * PptArtifactId.
         */
        public Builder pptArtifactId(Integer pptArtifactId) {
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
        public GetPptArtifactRequest build() {
            return new GetPptArtifactRequest(this);
        } 

    } 

}
