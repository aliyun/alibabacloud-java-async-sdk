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
 * {@link ExportPptArtifactRequest} extends {@link RequestModel}
 *
 * <p>ExportPptArtifactRequest</p>
 */
public class ExportPptArtifactRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Edit")
    private Boolean edit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExportFileType")
    private String exportFileType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalUserId")
    private String externalUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PptArtifactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pptArtifactId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Zip")
    private Boolean zip;

    private ExportPptArtifactRequest(Builder builder) {
        super(builder);
        this.edit = builder.edit;
        this.exportFileType = builder.exportFileType;
        this.externalUserId = builder.externalUserId;
        this.pptArtifactId = builder.pptArtifactId;
        this.workspaceId = builder.workspaceId;
        this.zip = builder.zip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportPptArtifactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edit
     */
    public Boolean getEdit() {
        return this.edit;
    }

    /**
     * @return exportFileType
     */
    public String getExportFileType() {
        return this.exportFileType;
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return pptArtifactId
     */
    public Long getPptArtifactId() {
        return this.pptArtifactId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return zip
     */
    public Boolean getZip() {
        return this.zip;
    }

    public static final class Builder extends Request.Builder<ExportPptArtifactRequest, Builder> {
        private Boolean edit; 
        private String exportFileType; 
        private String externalUserId; 
        private Long pptArtifactId; 
        private String workspaceId; 
        private Boolean zip; 

        private Builder() {
            super();
        } 

        private Builder(ExportPptArtifactRequest request) {
            super(request);
            this.edit = request.edit;
            this.exportFileType = request.exportFileType;
            this.externalUserId = request.externalUserId;
            this.pptArtifactId = request.pptArtifactId;
            this.workspaceId = request.workspaceId;
            this.zip = request.zip;
        } 

        /**
         * Edit.
         */
        public Builder edit(Boolean edit) {
            this.putBodyParameter("Edit", edit);
            this.edit = edit;
            return this;
        }

        /**
         * ExportFileType.
         */
        public Builder exportFileType(String exportFileType) {
            this.putBodyParameter("ExportFileType", exportFileType);
            this.exportFileType = exportFileType;
            return this;
        }

        /**
         * ExternalUserId.
         */
        public Builder externalUserId(String externalUserId) {
            this.putBodyParameter("ExternalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        public Builder pptArtifactId(Long pptArtifactId) {
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

        /**
         * Zip.
         */
        public Builder zip(Boolean zip) {
            this.putBodyParameter("Zip", zip);
            this.zip = zip;
            return this;
        }

        @Override
        public ExportPptArtifactRequest build() {
            return new ExportPptArtifactRequest(this);
        } 

    } 

}
