// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link DetectImageCroppingRequest} extends {@link RequestModel}
 *
 * <p>DetectImageCroppingRequest</p>
 */
public class DetectImageCroppingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AspectRatios")
    private String aspectRatios;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    private String sourceURI;

    private DetectImageCroppingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aspectRatios = builder.aspectRatios;
        this.credentialConfig = builder.credentialConfig;
        this.projectName = builder.projectName;
        this.sourceURI = builder.sourceURI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageCroppingRequest create() {
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
     * @return aspectRatios
     */
    public String getAspectRatios() {
        return this.aspectRatios;
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
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    public static final class Builder extends Request.Builder<DetectImageCroppingRequest, Builder> {
        private String regionId; 
        private String aspectRatios; 
        private CredentialConfig credentialConfig; 
        private String projectName; 
        private String sourceURI; 

        private Builder() {
            super();
        } 

        private Builder(DetectImageCroppingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aspectRatios = request.aspectRatios;
            this.credentialConfig = request.credentialConfig;
            this.projectName = request.projectName;
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
         * <p>The cropping ratios. You can specify up to five cropping ratios. Take note of the following requirements:</p>
         * <ul>
         * <li>The ratio must be an integer between 0 and 20.</li>
         * <li>The ratio must range from 0.5 to 2.</li>
         * <li>If you leave this parameter empty, the default processing logic is <code>[&quot;auto&quot;]</code>.</li>
         * </ul>
         * <blockquote>
         * <p> Errors are reported in one of the following cases:<br>You specify more than five cropping ratios.<br>You pass an empty list to the system.<br>You specify a ratio that is not an integer, such as <code>4.1:3</code>.<br>The ratio is beyond the range of 0.5 to 2.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1:1&quot;]</p>
         */
        public Builder aspectRatios(String aspectRatios) {
            this.putQueryParameter("AspectRatios", aspectRatios);
            this.aspectRatios = aspectRatios;
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
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The URI of the Object Storage Service (OSS) bucket in which you store the image.</p>
         * <p>Specify the value in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region as the current project. <code>${Object}</code> specifies the complete path to the image file that has an extension.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://imm-test/testcases/facetest.jpg</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        @Override
        public DetectImageCroppingRequest build() {
            return new DetectImageCroppingRequest(this);
        } 

    } 

}
