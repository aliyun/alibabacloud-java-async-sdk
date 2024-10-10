// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPluginForUuidResponseBody} extends {@link TeaModel}
 *
 * <p>ListPluginForUuidResponseBody</p>
 */
public class ListPluginForUuidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AegisUuidTargetPluginConfigList")
    private java.util.List < AegisUuidTargetPluginConfigList> aegisUuidTargetPluginConfigList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPluginForUuidResponseBody(Builder builder) {
        this.aegisUuidTargetPluginConfigList = builder.aegisUuidTargetPluginConfigList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginForUuidResponseBody create() {
        return builder().build();
    }

    /**
     * @return aegisUuidTargetPluginConfigList
     */
    public java.util.List < AegisUuidTargetPluginConfigList> getAegisUuidTargetPluginConfigList() {
        return this.aegisUuidTargetPluginConfigList;
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
        private java.util.List < AegisUuidTargetPluginConfigList> aegisUuidTargetPluginConfigList; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * <p>An array that consists of the information about the plug-ins.</p>
         */
        public Builder aegisUuidTargetPluginConfigList(java.util.List < AegisUuidTargetPluginConfigList> aegisUuidTargetPluginConfigList) {
            this.aegisUuidTargetPluginConfigList = aegisUuidTargetPluginConfigList;
            return this;
        }

        /**
         * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPluginForUuidResponseBody build() {
            return new ListPluginForUuidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPluginForUuidResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginForUuidResponseBody</p>
     */
    public static class AegisSuspiciousConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private Boolean config;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("OverallConfig")
        private Boolean overallConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AegisSuspiciousConfigList(Builder builder) {
            this.config = builder.config;
            this.msg = builder.msg;
            this.overallConfig = builder.overallConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AegisSuspiciousConfigList create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Boolean getConfig() {
            return this.config;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return overallConfig
         */
        public Boolean getOverallConfig() {
            return this.overallConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean config; 
            private String msg; 
            private Boolean overallConfig; 
            private String type; 

            /**
             * <p>Indicates whether the plug-in is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder config(Boolean config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The message that indicates whether you are authorized to install the plug-in on your server or whether the plug-in is installed on your server. Valid values:</p>
             * <ul>
             * <li><strong>authorized</strong>: authorized</li>
             * <li><strong>unauthorized</strong>: unauthorized</li>
             * <li><strong>unbind</strong>: not installed</li>
             * <li><strong>nonsupport</strong>: not supported</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>authorized</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>Indicates whether the plug-in is globally configured. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder overallConfig(Boolean overallConfig) {
                this.overallConfig = overallConfig;
                return this;
            }

            /**
             * <p>The name of the plug-in. Valid values:</p>
             * <ul>
             * <li><strong>alihips</strong>: trojan-specific prevention</li>
             * <li><strong>alisecguard</strong>: attack-specific prevention</li>
             * <li><strong>alinet</strong>: defense against attacks on servers</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alisecguard</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AegisSuspiciousConfigList build() {
                return new AegisSuspiciousConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPluginForUuidResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginForUuidResponseBody</p>
     */
    public static class AegisUuidTargetPluginConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AegisSuspiciousConfigList")
        private java.util.List < AegisSuspiciousConfigList> aegisSuspiciousConfigList;

        @com.aliyun.core.annotation.NameInMap("PluginInstallCode")
        private String pluginInstallCode;

        @com.aliyun.core.annotation.NameInMap("PluginName")
        private String pluginName;

        @com.aliyun.core.annotation.NameInMap("PluginOnlineInstalled")
        private Boolean pluginOnlineInstalled;

        @com.aliyun.core.annotation.NameInMap("PluginOnlineStatus")
        private Boolean pluginOnlineStatus;

        @com.aliyun.core.annotation.NameInMap("PluginVersion")
        private String pluginVersion;

        private AegisUuidTargetPluginConfigList(Builder builder) {
            this.aegisSuspiciousConfigList = builder.aegisSuspiciousConfigList;
            this.pluginInstallCode = builder.pluginInstallCode;
            this.pluginName = builder.pluginName;
            this.pluginOnlineInstalled = builder.pluginOnlineInstalled;
            this.pluginOnlineStatus = builder.pluginOnlineStatus;
            this.pluginVersion = builder.pluginVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AegisUuidTargetPluginConfigList create() {
            return builder().build();
        }

        /**
         * @return aegisSuspiciousConfigList
         */
        public java.util.List < AegisSuspiciousConfigList> getAegisSuspiciousConfigList() {
            return this.aegisSuspiciousConfigList;
        }

        /**
         * @return pluginInstallCode
         */
        public String getPluginInstallCode() {
            return this.pluginInstallCode;
        }

        /**
         * @return pluginName
         */
        public String getPluginName() {
            return this.pluginName;
        }

        /**
         * @return pluginOnlineInstalled
         */
        public Boolean getPluginOnlineInstalled() {
            return this.pluginOnlineInstalled;
        }

        /**
         * @return pluginOnlineStatus
         */
        public Boolean getPluginOnlineStatus() {
            return this.pluginOnlineStatus;
        }

        /**
         * @return pluginVersion
         */
        public String getPluginVersion() {
            return this.pluginVersion;
        }

        public static final class Builder {
            private java.util.List < AegisSuspiciousConfigList> aegisSuspiciousConfigList; 
            private String pluginInstallCode; 
            private String pluginName; 
            private Boolean pluginOnlineInstalled; 
            private Boolean pluginOnlineStatus; 
            private String pluginVersion; 

            /**
             * <p>An array that consists of the configurations of plug-ins.</p>
             */
            public Builder aegisSuspiciousConfigList(java.util.List < AegisSuspiciousConfigList> aegisSuspiciousConfigList) {
                this.aegisSuspiciousConfigList = aegisSuspiciousConfigList;
                return this;
            }

            /**
             * <p>The installation code of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>k5O5nd</p>
             */
            public Builder pluginInstallCode(String pluginInstallCode) {
                this.pluginInstallCode = pluginInstallCode;
                return this;
            }

            /**
             * <p>The name of the plug-in. Valid values:</p>
             * <ul>
             * <li><strong>alihips</strong>: trojan-specific prevention</li>
             * <li><strong>alisecguard</strong>: attack-specific prevention</li>
             * <li><strong>alinet</strong>: defense against attacks on servers</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alisecguard</p>
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * <p>Indicates whether the plug-in is installed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pluginOnlineInstalled(Boolean pluginOnlineInstalled) {
                this.pluginOnlineInstalled = pluginOnlineInstalled;
                return this;
            }

            /**
             * <p>Indicates whether the plug-in is online. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pluginOnlineStatus(Boolean pluginOnlineStatus) {
                this.pluginOnlineStatus = pluginOnlineStatus;
                return this;
            }

            /**
             * <p>The version of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>00_10</p>
             */
            public Builder pluginVersion(String pluginVersion) {
                this.pluginVersion = pluginVersion;
                return this;
            }

            public AegisUuidTargetPluginConfigList build() {
                return new AegisUuidTargetPluginConfigList(this);
            } 

        } 

    }
}
