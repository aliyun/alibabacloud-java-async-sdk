// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListBuildPackResponseBody} extends {@link TeaModel}
 *
 * <p>ListBuildPackResponseBody</p>
 */
public class ListBuildPackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuildPackList")
    private BuildPackList buildPackList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListBuildPackResponseBody model) {
            this.buildPackList = model.buildPackList;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * BuildPackList.
         */
        public Builder buildPackList(BuildPackList buildPackList) {
            this.buildPackList = buildPackList;
            return this;
        }

        /**
         * <p>code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4FD4-*************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBuildPackResponseBody build() {
            return new ListBuildPackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBuildPackResponseBody} extends {@link TeaModel}
     *
     * <p>ListBuildPackResponseBody</p>
     */
    public static class BuildPack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("Feature")
        private String feature;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("MultipleTenant")
        private Boolean multipleTenant;

        @com.aliyun.core.annotation.NameInMap("PackVersion")
        private String packVersion;

        @com.aliyun.core.annotation.NameInMap("PandoraDesc")
        private String pandoraDesc;

        @com.aliyun.core.annotation.NameInMap("PandoraDownloadUrl")
        private String pandoraDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("PandoraVersion")
        private String pandoraVersion;

        @com.aliyun.core.annotation.NameInMap("PluginInfo")
        private String pluginInfo;

        @com.aliyun.core.annotation.NameInMap("ScriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("ScriptVersion")
        private String scriptVersion;

        @com.aliyun.core.annotation.NameInMap("SupportFeatures")
        private String supportFeatures;

        @com.aliyun.core.annotation.NameInMap("TengineDownloadUrl")
        private String tengineDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("TengineImageId")
        private String tengineImageId;

        @com.aliyun.core.annotation.NameInMap("TomcatDesc")
        private String tomcatDesc;

        @com.aliyun.core.annotation.NameInMap("TomcatDownloadUrl")
        private String tomcatDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("TomcatPath")
        private String tomcatPath;

        @com.aliyun.core.annotation.NameInMap("TomcatVersion")
        private String tomcatVersion;

        @com.aliyun.core.annotation.NameInMap("WithTengine")
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

            private Builder() {
            } 

            private Builder(BuildPack model) {
                this.configId = model.configId;
                this.disabled = model.disabled;
                this.feature = model.feature;
                this.imageId = model.imageId;
                this.multipleTenant = model.multipleTenant;
                this.packVersion = model.packVersion;
                this.pandoraDesc = model.pandoraDesc;
                this.pandoraDownloadUrl = model.pandoraDownloadUrl;
                this.pandoraVersion = model.pandoraVersion;
                this.pluginInfo = model.pluginInfo;
                this.scriptName = model.scriptName;
                this.scriptVersion = model.scriptVersion;
                this.supportFeatures = model.supportFeatures;
                this.tengineDownloadUrl = model.tengineDownloadUrl;
                this.tengineImageId = model.tengineImageId;
                this.tomcatDesc = model.tomcatDesc;
                this.tomcatDownloadUrl = model.tomcatDownloadUrl;
                this.tomcatPath = model.tomcatPath;
                this.tomcatVersion = model.tomcatVersion;
                this.withTengine = model.withTengine;
            } 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * Feature.
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * MultipleTenant.
             */
            public Builder multipleTenant(Boolean multipleTenant) {
                this.multipleTenant = multipleTenant;
                return this;
            }

            /**
             * PackVersion.
             */
            public Builder packVersion(String packVersion) {
                this.packVersion = packVersion;
                return this;
            }

            /**
             * PandoraDesc.
             */
            public Builder pandoraDesc(String pandoraDesc) {
                this.pandoraDesc = pandoraDesc;
                return this;
            }

            /**
             * PandoraDownloadUrl.
             */
            public Builder pandoraDownloadUrl(String pandoraDownloadUrl) {
                this.pandoraDownloadUrl = pandoraDownloadUrl;
                return this;
            }

            /**
             * PandoraVersion.
             */
            public Builder pandoraVersion(String pandoraVersion) {
                this.pandoraVersion = pandoraVersion;
                return this;
            }

            /**
             * PluginInfo.
             */
            public Builder pluginInfo(String pluginInfo) {
                this.pluginInfo = pluginInfo;
                return this;
            }

            /**
             * ScriptName.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * ScriptVersion.
             */
            public Builder scriptVersion(String scriptVersion) {
                this.scriptVersion = scriptVersion;
                return this;
            }

            /**
             * SupportFeatures.
             */
            public Builder supportFeatures(String supportFeatures) {
                this.supportFeatures = supportFeatures;
                return this;
            }

            /**
             * TengineDownloadUrl.
             */
            public Builder tengineDownloadUrl(String tengineDownloadUrl) {
                this.tengineDownloadUrl = tengineDownloadUrl;
                return this;
            }

            /**
             * TengineImageId.
             */
            public Builder tengineImageId(String tengineImageId) {
                this.tengineImageId = tengineImageId;
                return this;
            }

            /**
             * TomcatDesc.
             */
            public Builder tomcatDesc(String tomcatDesc) {
                this.tomcatDesc = tomcatDesc;
                return this;
            }

            /**
             * TomcatDownloadUrl.
             */
            public Builder tomcatDownloadUrl(String tomcatDownloadUrl) {
                this.tomcatDownloadUrl = tomcatDownloadUrl;
                return this;
            }

            /**
             * TomcatPath.
             */
            public Builder tomcatPath(String tomcatPath) {
                this.tomcatPath = tomcatPath;
                return this;
            }

            /**
             * TomcatVersion.
             */
            public Builder tomcatVersion(String tomcatVersion) {
                this.tomcatVersion = tomcatVersion;
                return this;
            }

            /**
             * WithTengine.
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
    /**
     * 
     * {@link ListBuildPackResponseBody} extends {@link TeaModel}
     *
     * <p>ListBuildPackResponseBody</p>
     */
    public static class BuildPackList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildPack")
        private java.util.List<BuildPack> buildPack;

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
        public java.util.List<BuildPack> getBuildPack() {
            return this.buildPack;
        }

        public static final class Builder {
            private java.util.List<BuildPack> buildPack; 

            private Builder() {
            } 

            private Builder(BuildPackList model) {
                this.buildPack = model.buildPack;
            } 

            /**
             * BuildPack.
             */
            public Builder buildPack(java.util.List<BuildPack> buildPack) {
                this.buildPack = buildPack;
                return this;
            }

            public BuildPackList build() {
                return new BuildPackList(this);
            } 

        } 

    }
}
