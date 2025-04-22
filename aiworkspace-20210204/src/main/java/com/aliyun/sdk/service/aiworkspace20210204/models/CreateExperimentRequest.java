// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateExperimentRequest} extends {@link RequestModel}
 *
 * <p>CreateExperimentRequest</p>
 */
public class CreateExperimentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ArtifactUri")
    private String artifactUri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<LabelInfo> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateExperimentRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.artifactUri = builder.artifactUri;
        this.labels = builder.labels;
        this.name = builder.name;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return artifactUri
     */
    public String getArtifactUri() {
        return this.artifactUri;
    }

    /**
     * @return labels
     */
    public java.util.List<LabelInfo> getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateExperimentRequest, Builder> {
        private String accessibility; 
        private String artifactUri; 
        private java.util.List<LabelInfo> labels; 
        private String name; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExperimentRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.artifactUri = request.artifactUri;
            this.labels = request.labels;
            this.name = request.name;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The visibility of the experiment. Valid values: PRIVATE (the experiment is visible only to the creator and the Alibaba Cloud account) and PUBLIC (the experiment is visible to all users). This parameter is optional and the default value is PRIVATE.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The default artifact output path of all jobs that are associated with the experiment. Only Object Storage Service (OSS) paths are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket.oss-cn-hangzhou.aliyuncs.com/test</p>
         */
        public Builder artifactUri(String artifactUri) {
            this.putBodyParameter("ArtifactUri", artifactUri);
            this.artifactUri = artifactUri;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder labels(java.util.List<LabelInfo> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The experiment name. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must start with a letter.</li>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must be 1 to 63 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateExperimentRequest build() {
            return new CreateExperimentRequest(this);
        } 

    } 

}
