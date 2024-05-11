// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileCompressionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateFileCompressionTaskRequest</p>
 */
public class CreateFileCompressionTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompressedFormat")
    private String compressedFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceManifestURI")
    private String sourceManifestURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sources")
    private java.util.List < Sources> sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateFileCompressionTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.compressedFormat = builder.compressedFormat;
        this.credentialConfig = builder.credentialConfig;
        this.notification = builder.notification;
        this.projectName = builder.projectName;
        this.sourceManifestURI = builder.sourceManifestURI;
        this.sources = builder.sources;
        this.targetURI = builder.targetURI;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileCompressionTaskRequest create() {
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
     * @return compressedFormat
     */
    public String getCompressedFormat() {
        return this.compressedFormat;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sourceManifestURI
     */
    public String getSourceManifestURI() {
        return this.sourceManifestURI;
    }

    /**
     * @return sources
     */
    public java.util.List < Sources> getSources() {
        return this.sources;
    }

    /**
     * @return targetURI
     */
    public String getTargetURI() {
        return this.targetURI;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateFileCompressionTaskRequest, Builder> {
        private String regionId; 
        private String compressedFormat; 
        private CredentialConfig credentialConfig; 
        private Notification notification; 
        private String projectName; 
        private String sourceManifestURI; 
        private java.util.List < Sources> sources; 
        private String targetURI; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileCompressionTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.compressedFormat = request.compressedFormat;
            this.credentialConfig = request.credentialConfig;
            this.notification = request.notification;
            this.projectName = request.projectName;
            this.sourceManifestURI = request.sourceManifestURI;
            this.sources = request.sources;
            this.targetURI = request.targetURI;
            this.userData = request.userData;
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
         * CompressedFormat.
         */
        public Builder compressedFormat(String compressedFormat) {
            this.putQueryParameter("CompressedFormat", compressedFormat);
            this.compressedFormat = compressedFormat;
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
         * Notification.
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
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
         * SourceManifestURI.
         */
        public Builder sourceManifestURI(String sourceManifestURI) {
            this.putQueryParameter("SourceManifestURI", sourceManifestURI);
            this.sourceManifestURI = sourceManifestURI;
            return this;
        }

        /**
         * Sources.
         */
        public Builder sources(java.util.List < Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * TargetURI.
         */
        public Builder targetURI(String targetURI) {
            this.putQueryParameter("TargetURI", targetURI);
            this.targetURI = targetURI;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateFileCompressionTaskRequest build() {
            return new CreateFileCompressionTaskRequest(this);
        } 

    } 

    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private Sources(Builder builder) {
            this.alias = builder.alias;
            this.mode = builder.mode;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String alias; 
            private String mode; 
            private String URI; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * URI.
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
}
