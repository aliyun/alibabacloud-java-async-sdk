// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBuildPackResponseBody} extends {@link TeaModel}
 *
 * <p>ListBuildPackResponseBody</p>
 */
public class ListBuildPackResponseBody extends TeaModel {
    @NameInMap("BuildPackList")
    private BuildPackList buildPackList;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListBuildPackResponseBody(Builder builder) {
        this.buildPackList = builder.buildPackList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBuildPackResponseBody create() {
        return builder().build();
    }

    /**
     * @return buildPackList
     */
    public BuildPackList getBuildPackList() {
        return this.buildPackList;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BuildPackList buildPackList; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The returned versions of EDAS Container.
         */
        public Builder buildPackList(BuildPackList buildPackList) {
            this.buildPackList = buildPackList;
            return this;
        }

        /**
         * code
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBuildPackResponseBody build() {
            return new ListBuildPackResponseBody(this);
        } 

    } 

    public static class BuildPack extends TeaModel {
        @NameInMap("ConfigId")
        private Long configId;

        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("Feature")
        private String feature;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("MultipleTenant")
        private Boolean multipleTenant;

        @NameInMap("PackVersion")
        private String packVersion;

        @NameInMap("PandoraDesc")
        private String pandoraDesc;

        @NameInMap("PandoraDownloadUrl")
        private String pandoraDownloadUrl;

        @NameInMap("PandoraVersion")
        private String pandoraVersion;

        @NameInMap("PluginInfo")
        private String pluginInfo;

        @NameInMap("ScriptName")
        private String scriptName;

        @NameInMap("ScriptVersion")
        private String scriptVersion;

        @NameInMap("SupportFeatures")
        private String supportFeatures;

        @NameInMap("TengineDownloadUrl")
        private String tengineDownloadUrl;

        @NameInMap("TengineImageId")
        private String tengineImageId;

        @NameInMap("TomcatDesc")
        private String tomcatDesc;

        @NameInMap("TomcatDownloadUrl")
        private String tomcatDownloadUrl;

        @NameInMap("TomcatPath")
        private String tomcatPath;

        @NameInMap("TomcatVersion")
        private String tomcatVersion;

        @NameInMap("WithTengine")
        private Boolean withTengine;

        private BuildPack(Builder builder) {
            this.configId = builder.configId;
            this.disabled = builder.disabled;
            this.feature = builder.feature;
            this.imageId = builder.imageId;
            this.multipleTenant = builder.multipleTenant;
            this.packVersion = builder.packVersion;
            this.pandoraDesc = builder.pandoraDesc;
            this.pandoraDownloadUrl = builder.pandoraDownloadUrl;
            this.pandoraVersion = builder.pandoraVersion;
            this.pluginInfo = builder.pluginInfo;
            this.scriptName = builder.scriptName;
            this.scriptVersion = builder.scriptVersion;
            this.supportFeatures = builder.supportFeatures;
            this.tengineDownloadUrl = builder.tengineDownloadUrl;
            this.tengineImageId = builder.tengineImageId;
            this.tomcatDesc = builder.tomcatDesc;
            this.tomcatDownloadUrl = builder.tomcatDownloadUrl;
            this.tomcatPath = builder.tomcatPath;
            this.tomcatVersion = builder.tomcatVersion;
            this.withTengine = builder.withTengine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildPack create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return feature
         */
        public String getFeature() {
            return this.feature;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return multipleTenant
         */
        public Boolean getMultipleTenant() {
            return this.multipleTenant;
        }

        /**
         * @return packVersion
         */
        public String getPackVersion() {
            return this.packVersion;
        }

        /**
         * @return pandoraDesc
         */
        public String getPandoraDesc() {
            return this.pandoraDesc;
        }

        /**
         * @return pandoraDownloadUrl
         */
        public String getPandoraDownloadUrl() {
            return this.pandoraDownloadUrl;
        }

        /**
         * @return pandoraVersion
         */
        public String getPandoraVersion() {
            return this.pandoraVersion;
        }

        /**
         * @return pluginInfo
         */
        public String getPluginInfo() {
            return this.pluginInfo;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return scriptVersion
         */
        public String getScriptVersion() {
            return this.scriptVersion;
        }

        /**
         * @return supportFeatures
         */
        public String getSupportFeatures() {
            return this.supportFeatures;
        }

        /**
         * @return tengineDownloadUrl
         */
        public String getTengineDownloadUrl() {
            return this.tengineDownloadUrl;
        }

        /**
         * @return tengineImageId
         */
        public String getTengineImageId() {
            return this.tengineImageId;
        }

        /**
         * @return tomcatDesc
         */
        public String getTomcatDesc() {
            return this.tomcatDesc;
        }

        /**
         * @return tomcatDownloadUrl
         */
        public String getTomcatDownloadUrl() {
            return this.tomcatDownloadUrl;
        }

        /**
         * @return tomcatPath
         */
        public String getTomcatPath() {
            return this.tomcatPath;
        }

        /**
         * @return tomcatVersion
         */
        public String getTomcatVersion() {
            return this.tomcatVersion;
        }

        /**
         * @return withTengine
         */
        public Boolean getWithTengine() {
            return this.withTengine;
        }

        public static final class Builder {
            private Long configId; 
            private Boolean disabled; 
            private String feature; 
            private String imageId; 
            private Boolean multipleTenant; 
            private String packVersion; 
            private String pandoraDesc; 
            private String pandoraDownloadUrl; 
            private String pandoraVersion; 
            private String pluginInfo; 
            private String scriptName; 
            private String scriptVersion; 
            private String supportFeatures; 
            private String tengineDownloadUrl; 
            private String tengineImageId; 
            private String tomcatDesc; 
            private String tomcatDownloadUrl; 
            private String tomcatPath; 
            private String tomcatVersion; 
            private Boolean withTengine; 

            /**
             * The build package number of EDAS Container.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Indicates whether the EDAS Container version is disabled. A disabled version cannot be configured for use.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * The features of the EDAS Container version, which are released for public preview.
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            /**
             * The ID of the base image that corresponds to EDAS Container.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Indicates whether EDAS Container supports multitenancy.
             */
            public Builder multipleTenant(Boolean multipleTenant) {
                this.multipleTenant = multipleTenant;
                return this;
            }

            /**
             * The version of the application.
             */
            public Builder packVersion(String packVersion) {
                this.packVersion = packVersion;
                return this;
            }

            /**
             * The description of the Pandora container.
             */
            public Builder pandoraDesc(String pandoraDesc) {
                this.pandoraDesc = pandoraDesc;
                return this;
            }

            /**
             * The download URL of the Pandora installer.
             */
            public Builder pandoraDownloadUrl(String pandoraDownloadUrl) {
                this.pandoraDownloadUrl = pandoraDownloadUrl;
                return this;
            }

            /**
             * The version of the Pandora container.
             */
            public Builder pandoraVersion(String pandoraVersion) {
                this.pandoraVersion = pandoraVersion;
                return this;
            }

            /**
             * The description of the plug-in.
             */
            public Builder pluginInfo(String pluginInfo) {
                this.pluginInfo = pluginInfo;
                return this;
            }

            /**
             * The name of the Shell script that runs EDAS Container.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * The version of the Shell script that runs EDAS Container.
             */
            public Builder scriptVersion(String scriptVersion) {
                this.scriptVersion = scriptVersion;
                return this;
            }

            /**
             * The features supported by EDAS Container.
             */
            public Builder supportFeatures(String supportFeatures) {
                this.supportFeatures = supportFeatures;
                return this;
            }

            /**
             * The download URL of the Tengine installer.
             */
            public Builder tengineDownloadUrl(String tengineDownloadUrl) {
                this.tengineDownloadUrl = tengineDownloadUrl;
                return this;
            }

            /**
             * The ID of the Tengine image that corresponds to EDAS Container.
             */
            public Builder tengineImageId(String tengineImageId) {
                this.tengineImageId = tengineImageId;
                return this;
            }

            /**
             * The description of the Tomcat container.
             */
            public Builder tomcatDesc(String tomcatDesc) {
                this.tomcatDesc = tomcatDesc;
                return this;
            }

            /**
             * The download URL of the Tomcat installer.
             */
            public Builder tomcatDownloadUrl(String tomcatDownloadUrl) {
                this.tomcatDownloadUrl = tomcatDownloadUrl;
                return this;
            }

            /**
             * The directory of the Tomcat container.
             */
            public Builder tomcatPath(String tomcatPath) {
                this.tomcatPath = tomcatPath;
                return this;
            }

            /**
             * The version of the Tomcat container.
             */
            public Builder tomcatVersion(String tomcatVersion) {
                this.tomcatVersion = tomcatVersion;
                return this;
            }

            /**
             * Indicates whether EDAS Container supports traffic management.
             */
            public Builder withTengine(Boolean withTengine) {
                this.withTengine = withTengine;
                return this;
            }

            public BuildPack build() {
                return new BuildPack(this);
            } 

        } 

    }
    public static class BuildPackList extends TeaModel {
        @NameInMap("BuildPack")
        private java.util.List < BuildPack> buildPack;

        private BuildPackList(Builder builder) {
            this.buildPack = builder.buildPack;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildPackList create() {
            return builder().build();
        }

        /**
         * @return buildPack
         */
        public java.util.List < BuildPack> getBuildPack() {
            return this.buildPack;
        }

        public static final class Builder {
            private java.util.List < BuildPack> buildPack; 

            /**
             * BuildPack.
             */
            public Builder buildPack(java.util.List < BuildPack> buildPack) {
                this.buildPack = buildPack;
                return this;
            }

            public BuildPackList build() {
                return new BuildPackList(this);
            } 

        } 

    }
}
