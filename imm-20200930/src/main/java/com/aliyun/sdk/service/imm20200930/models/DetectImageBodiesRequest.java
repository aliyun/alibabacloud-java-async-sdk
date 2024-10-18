// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetectImageBodiesRequest} extends {@link RequestModel}
 *
 * <p>DetectImageBodiesRequest</p>
 */
public class DetectImageBodiesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sensitivity")
    private Float sensitivity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    private String sourceURI;

    private DetectImageBodiesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credentialConfig = builder.credentialConfig;
        this.projectName = builder.projectName;
        this.sensitivity = builder.sensitivity;
        this.sourceURI = builder.sourceURI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageBodiesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sensitivity
     */
    public Float getSensitivity() {
        return this.sensitivity;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    public static final class Builder extends Request.Builder<DetectImageBodiesRequest, Builder> {
        private String regionId; 
        private CredentialConfig credentialConfig; 
        private String projectName; 
        private Float sensitivity; 
        private String sourceURI; 

        private Builder() {
            super();
        } 

        private Builder(DetectImageBodiesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credentialConfig = request.credentialConfig;
            this.projectName = request.projectName;
            this.sensitivity = request.sensitivity;
            this.sourceURI = request.sourceURI;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
         * <p>The authorization chain. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The accuracy level of detecting and recognizing specific content in the image. Valid values: 0 to 1. Default value: 0.6. A higher sensitivity specifies that more image details can be detected.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        public Builder sensitivity(Float sensitivity) {
            this.putQueryParameter("Sensitivity", sensitivity);
            this.sensitivity = sensitivity;
            return this;
        }

        /**
         * <p>The URI of the Object Storage Service (OSS) bucket in which the image file is stored.</p>
         * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the complete path to the file that has an extension.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        @Override
        public DetectImageBodiesRequest build() {
            return new DetectImageBodiesRequest(this);
        } 

    } 

}
