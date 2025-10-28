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
         * <p>The returned versions of EDAS Container.</p>
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
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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
             * <p>The build package number of EDAS Container.</p>
             * 
             * <strong>example:</strong>
             * <p>57</p>
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>Indicates whether the EDAS Container version is disabled. A disabled version cannot be configured for use.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>The features of the EDAS Container version, which are released for public preview.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            /**
             * <p>The ID of the base image that corresponds to EDAS Container.</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>Indicates whether EDAS Container supports multitenancy.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder multipleTenant(Boolean multipleTenant) {
                this.multipleTenant = multipleTenant;
                return this;
            }

            /**
             * <p>The version of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>3.5.6</p>
             */
            public Builder packVersion(String packVersion) {
                this.packVersion = packVersion;
                return this;
            }

            /**
             * <p>The description of the Pandora container.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder pandoraDesc(String pandoraDesc) {
                this.pandoraDesc = pandoraDesc;
                return this;
            }

            /**
             * <p>The download URL of the Pandora installer.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://edas.oss-cn-hangzhou.aliyuncs.com/edas-plugins/edas.sar.V3.5.6/taobao-hsf.tgz">http://edas.oss-cn-hangzhou.aliyuncs.com/edas-plugins/edas.sar.V3.5.6/taobao-hsf.tgz</a></p>
             */
            public Builder pandoraDownloadUrl(String pandoraDownloadUrl) {
                this.pandoraDownloadUrl = pandoraDownloadUrl;
                return this;
            }

            /**
             * <p>The version of the Pandora container.</p>
             * 
             * <strong>example:</strong>
             * <p>edas.public.sar.V3.5.6</p>
             */
            public Builder pandoraVersion(String pandoraVersion) {
                this.pandoraVersion = pandoraVersion;
                return this;
            }

            /**
             * <p>The description of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pluginInfo(String pluginInfo) {
                this.pluginInfo = pluginInfo;
                return this;
            }

            /**
             * <p>The name of the Shell script that runs EDAS Container.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * <p>The version of the Shell script that runs EDAS Container.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.3</p>
             */
            public Builder scriptVersion(String scriptVersion) {
                this.scriptVersion = scriptVersion;
                return this;
            }

            /**
             * <p>The features supported by EDAS Container.</p>
             * 
             * <strong>example:</strong>
             * <p>tengine,fatjar,restful,eip_nodeport,dpath</p>
             */
            public Builder supportFeatures(String supportFeatures) {
                this.supportFeatures = supportFeatures;
                return this;
            }

            /**
             * <p>The download URL of the Tengine installer.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://edas.oss-cn-hangzhou.aliyuncs.com/components/tengine/3.4.7/tengine.sh">http://edas.oss-cn-hangzhou.aliyuncs.com/components/tengine/3.4.7/tengine.sh</a></p>
             */
            public Builder tengineDownloadUrl(String tengineDownloadUrl) {
                this.tengineDownloadUrl = tengineDownloadUrl;
                return this;
            }

            /**
             * <p>The ID of the Tengine image that corresponds to EDAS Container.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.aliyuncs.com/edas/<strong><strong>-</strong></strong><em><strong><strong>-</strong></strong></em>:<em>.</em>.*</p>
             */
            public Builder tengineImageId(String tengineImageId) {
                this.tengineImageId = tengineImageId;
                return this;
            }

            /**
             * <p>The description of the Tomcat container.</p>
             * 
             * <strong>example:</strong>
             * <p>1. The config-client plug-in is updated. The issue of unread cache in multitenancy scenarios is fixed. 2. The High-Speed Service Framework (HSF) plug-in is updated to fix the issue that the qos command of the Pandora container cannot be executed and the issue that the service address cannot be found if the HSF plug-in subscribes to an excessive number of services. 3. The Fastjson package is updated to the sec06 secure version in all plug-ins that use this package.</p>
             */
            public Builder tomcatDesc(String tomcatDesc) {
                this.tomcatDesc = tomcatDesc;
                return this;
            }

            /**
             * <p>The download URL of the Tomcat installer.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://edas.oss-cn-hangzhou.aliyuncs.com/edas-container/7.0.92/taobao-tomcat-production-7.0.92.tar.gz">http://edas.oss-cn-hangzhou.aliyuncs.com/edas-container/7.0.92/taobao-tomcat-production-7.0.92.tar.gz</a></p>
             */
            public Builder tomcatDownloadUrl(String tomcatDownloadUrl) {
                this.tomcatDownloadUrl = tomcatDownloadUrl;
                return this;
            }

            /**
             * <p>The directory of the Tomcat container.</p>
             * 
             * <strong>example:</strong>
             * <p>taobao-tomcat-production-7.0.59.3</p>
             */
            public Builder tomcatPath(String tomcatPath) {
                this.tomcatPath = tomcatPath;
                return this;
            }

            /**
             * <p>The version of the Tomcat container.</p>
             * 
             * <strong>example:</strong>
             * <p>8.5.63</p>
             */
            public Builder tomcatVersion(String tomcatVersion) {
                this.tomcatVersion = tomcatVersion;
                return this;
            }

            /**
             * <p>Indicates whether EDAS Container supports traffic management.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
