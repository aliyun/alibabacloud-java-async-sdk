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
 * {@link CompareImageFacesRequest} extends {@link RequestModel}
 *
 * <p>CompareImageFacesRequest</p>
 */
public class CompareImageFacesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Source")
    private Source source;

    private CompareImageFacesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credentialConfig = builder.credentialConfig;
        this.projectName = builder.projectName;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareImageFacesRequest create() {
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
     * @return source
     */
    public Source getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CompareImageFacesRequest, Builder> {
        private String regionId; 
        private CredentialConfig credentialConfig; 
        private String projectName; 
        private Source source; 

        private Builder() {
            super();
        } 

        private Builder(CompareImageFacesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credentialConfig = request.credentialConfig;
            this.projectName = request.projectName;
            this.source = request.source;
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
         * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
         * <p>The authorization chain settings. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
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
         * <p>The URLs of the two images for compression.</p>
         */
        public Builder source(Source source) {
            String sourceShrink = shrink(source, "Source", "json");
            this.putQueryParameter("Source", sourceShrink);
            this.source = source;
            return this;
        }

        @Override
        public CompareImageFacesRequest build() {
            return new CompareImageFacesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CompareImageFacesRequest} extends {@link TeaModel}
     *
     * <p>CompareImageFacesRequest</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("URI1")
        private String URI1;

        @com.aliyun.core.annotation.NameInMap("URI2")
        private String URI2;

        private Source(Builder builder) {
            this.URI1 = builder.URI1;
            this.URI2 = builder.URI2;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return URI1
         */
        public String getURI1() {
            return this.URI1;
        }

        /**
         * @return URI2
         */
        public String getURI2() {
            return this.URI2;
        }

        public static final class Builder {
            private String URI1; 
            private String URI2; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.URI1 = model.URI1;
                this.URI2 = model.URI2;
            } 

            /**
             * <p>The OSS URL of the image file.</p>
             * <p>Specify the URL in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format. <code>&lt;bucket&gt;</code> specifies the name of the OSS bucket that is in the same region as the current project. <code>&lt;object&gt;</code> specifies path of the object with the extension included.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-object1</p>
             */
            public Builder URI1(String URI1) {
                this.URI1 = URI1;
                return this;
            }

            /**
             * <p>The OSS URL of the image file.</p>
             * <p>Specify the URL in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format. <code>&lt;bucket&gt;</code> specifies the name of the OSS bucket that is in the same region as the current project, and <code>&lt;object&gt;</code> specifies the path of the object with the extension included.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-object2</p>
             */
            public Builder URI2(String URI2) {
                this.URI2 = URI2;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
}
