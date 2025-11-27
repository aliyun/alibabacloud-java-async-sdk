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
 * {@link ExtractDocumentTextRequest} extends {@link RequestModel}
 *
 * <p>ExtractDocumentTextRequest</p>
 */
public class ExtractDocumentTextRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceURI;

    private ExtractDocumentTextRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credentialConfig = builder.credentialConfig;
        this.projectName = builder.projectName;
        this.sourceType = builder.sourceType;
        this.sourceURI = builder.sourceURI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExtractDocumentTextRequest create() {
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
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    public static final class Builder extends Request.Builder<ExtractDocumentTextRequest, Builder> {
        private String regionId; 
        private CredentialConfig credentialConfig; 
        private String projectName; 
        private String sourceType; 
        private String sourceURI; 

        private Builder() {
            super();
        } 

        private Builder(ExtractDocumentTextRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credentialConfig = request.credentialConfig;
            this.projectName = request.projectName;
            this.sourceType = request.sourceType;
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
         * <p><strong>If there are no special requirements, leave it blank.</strong></p>
         * <p>Chain authorization configuration, optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Using Chain Authorization to Access Other Entity Resources</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>Project name. For how to obtain it, see <a href="https://help.aliyun.com/document_detail/477051.html">Creating a Project</a>.</p>
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
         * <p>Suffix type of the source data. By default, the type of the source data is determined based on the suffix of the input object. When the input object does not have a suffix, you can set this parameter. The available values are as follows:</p>
         * <ul>
         * <li>Word Documents: doc, docx, wps, wpss, docm, dotm, dot, dotx, html</li>
         * <li>Presentation Documents (PPT): pptx, ppt, pot, potx, pps, ppsx, dps, dpt, pptm, potm, ppsm, dpss</li>
         * <li>Spreadsheet Documents (Excel): xls, xlt, et, ett, xlsx, xltx, csv, xlsb, xlsm, xltm, ets</li>
         * <li>PDF Documents: pdf</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>docx</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>Storage address of the source data.</p>
         * <p>The OSS address rule is oss://${Bucket}/${Object}, where <code>${Bucket}</code> is the name of the OSS Bucket in the same region (Region) as the current project, and <code>${Object}</code> is the complete path of the file including the file extension.</p>
         * <blockquote>
         * <p>Notice: Currently, only HTTP protocol addresses are supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
        public ExtractDocumentTextRequest build() {
            return new ExtractDocumentTextRequest(this);
        } 

    } 

}
