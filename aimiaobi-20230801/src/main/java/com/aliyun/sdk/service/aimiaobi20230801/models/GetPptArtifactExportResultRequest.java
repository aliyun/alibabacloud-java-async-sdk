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
 * {@link GetPptArtifactExportResultRequest} extends {@link RequestModel}
 *
 * <p>GetPptArtifactExportResultRequest</p>
 */
public class GetPptArtifactExportResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExportTaskId")
    private String exportTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetPptArtifactExportResultRequest(Builder builder) {
        super(builder);
        this.exportTaskId = builder.exportTaskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPptArtifactExportResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportTaskId
     */
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetPptArtifactExportResultRequest, Builder> {
        private String exportTaskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetPptArtifactExportResultRequest request) {
            super(request);
            this.exportTaskId = request.exportTaskId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ExportTaskId.
         */
        public Builder exportTaskId(String exportTaskId) {
            this.putBodyParameter("ExportTaskId", exportTaskId);
            this.exportTaskId = exportTaskId;
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
        public GetPptArtifactExportResultRequest build() {
            return new GetPptArtifactExportResultRequest(this);
        } 

    } 

}
