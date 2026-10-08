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
    @com.aliyun.core.annotation.NameInMap("InclusionHints")
    private java.util.List<String> inclusionHints;

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
        this.inclusionHints = builder.inclusionHints;
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
     * @return inclusionHints
     */
    public java.util.List<String> getInclusionHints() {
        return this.inclusionHints;
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
        private java.util.List<String> inclusionHints; 
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
            this.inclusionHints = request.inclusionHints;
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
         * <p>The list of cropping aspect ratios. You can specify up to 5 ratios. Each ratio must meet the following requirements:</p>
         * <ul>
         * <li><p>The ratio must consist of integers in the range of (0, 20).</p>
         * </li>
         * <li><p>The ratio value must be in the range of [0.5, 2].</p>
         * </li>
         * <li><p>If you do not specify this parameter, the default value <code>[&quot;auto&quot;]</code> is used.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The following cases cause an error:<br>- More than 5 ratios are specified.<br>- An empty list is passed.<br>- The ratio contains non-integer values, such as <code>4.1:3</code>.<br>- The ratio value is less than 0.5 or greater than 2.</p>
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
         * <p><strong>Leave this parameter empty unless otherwise required.</strong></p>
         * <p>The China authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The list of semantic text descriptions for objects that you want the cropping result to include. Each element is free-form text, such as &quot;signboard&quot; or &quot;dish&quot;.</p>
         * <blockquote>
         * <p>Usage limits of the InclusionHints parameter:
         * <br>- You can pass in up to 1 hint in the array to specify the type of object to include in the cropping result, such as &quot;signboard&quot;.
         * <br>- The algorithm detects all objects in the image that match the hint and generates cropping regions that include as many matched objects as possible.
         * <br>- Each cropping region includes up to 10 matched objects. If more than 10 objects match in the image, the cropping region includes up to 10 of them.
         * <br>- You can use the MatchedInclusionHints response field to determine whether the hint was successfully matched.
         * <br>- This parameter is supported only in regions in the Chinese mainland.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sign&quot;]</p>
         */
        public Builder inclusionHints(java.util.List<String> inclusionHints) {
            String inclusionHintsShrink = shrink(inclusionHints, "InclusionHints", "json");
            this.putQueryParameter("InclusionHints", inclusionHintsShrink);
            this.inclusionHints = inclusionHints;
            return this;
        }

        /**
         * <p>The project name.</p>
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
         * <p>The OSS URI of the image.</p>
         * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where <code>${Bucket}</code> is the name of an OSS bucket in the same region as the current project, and <code>${Object}</code> is the full path of the file including the file name extension.</p>
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
