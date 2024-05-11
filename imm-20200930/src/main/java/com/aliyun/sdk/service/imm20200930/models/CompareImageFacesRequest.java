// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * CredentialConfig.
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Source.
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

            /**
             * URI1.
             */
            public Builder URI1(String URI1) {
                this.URI1 = URI1;
                return this;
            }

            /**
             * URI2.
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
