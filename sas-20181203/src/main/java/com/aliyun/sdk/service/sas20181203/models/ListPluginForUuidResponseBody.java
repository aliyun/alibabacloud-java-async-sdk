// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPluginForUuidResponseBody} extends {@link TeaModel}
 *
 * <p>ListPluginForUuidResponseBody</p>
 */
public class ListPluginForUuidResponseBody extends TeaModel {
    @NameInMap("AegisUuidTargetPluginConfigList")
    private java.util.List < AegisUuidTargetPluginConfigList> aegisUuidTargetPluginConfigList;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * An array that consists of the information about the plug-ins.
         */
        public Builder aegisUuidTargetPluginConfigList(java.util.List < AegisUuidTargetPluginConfigList> aegisUuidTargetPluginConfigList) {
            this.aegisUuidTargetPluginConfigList = aegisUuidTargetPluginConfigList;
            return this;
        }

        /**
         * The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPluginForUuidResponseBody build() {
            return new ListPluginForUuidResponseBody(this);
        } 

    } 

    public static class AegisSuspiciousConfigList extends TeaModel {
        @NameInMap("Config")
        private Boolean config;

        @NameInMap("Msg")
        private String msg;

        @NameInMap("OverallConfig")
        private Boolean overallConfig;

        @NameInMap("Type")
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
             * Indicates whether the plug-in is enabled. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder config(Boolean config) {
                this.config = config;
                return this;
            }

            /**
             * The message that indicates whether you are authorized to install the plug-in on your server or whether the plug-in is installed on your server. Valid values:
             * <p>
             * 
             * *   **authorized**: authorized
             * *   **unauthorized**: unauthorized
             * *   **unbind**: not installed
             * *   **nonsupport**: not supported
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * Indicates whether the plug-in is globally configured. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder overallConfig(Boolean overallConfig) {
                this.overallConfig = overallConfig;
                return this;
            }

            /**
             * The name of the plug-in. Valid values:
             * <p>
             * 
             * *   **alihips**: trojan-specific prevention
             * *   **alisecguard**: attack-specific prevention
             * *   **alinet**: defense against attacks on servers
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
    public static class AegisUuidTargetPluginConfigList extends TeaModel {
        @NameInMap("AegisSuspiciousConfigList")
        private java.util.List < AegisSuspiciousConfigList> aegisSuspiciousConfigList;

        @NameInMap("PluginInstallCode")
        private String pluginInstallCode;

        @NameInMap("PluginName")
        private String pluginName;

        @NameInMap("PluginOnlineInstalled")
        private Boolean pluginOnlineInstalled;

        @NameInMap("PluginOnlineStatus")
        private Boolean pluginOnlineStatus;

        @NameInMap("PluginVersion")
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
             * An array that consists of the configurations of plug-ins.
             */
            public Builder aegisSuspiciousConfigList(java.util.List < AegisSuspiciousConfigList> aegisSuspiciousConfigList) {
                this.aegisSuspiciousConfigList = aegisSuspiciousConfigList;
                return this;
            }

            /**
             * The installation code of the plug-in.
             */
            public Builder pluginInstallCode(String pluginInstallCode) {
                this.pluginInstallCode = pluginInstallCode;
                return this;
            }

            /**
             * The name of the plug-in. Valid values:
             * <p>
             * 
             * *   **alihips**: trojan-specific prevention
             * *   **alisecguard**: attack-specific prevention
             * *   **alinet**: defense against attacks on servers
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * Indicates whether the plug-in is installed. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder pluginOnlineInstalled(Boolean pluginOnlineInstalled) {
                this.pluginOnlineInstalled = pluginOnlineInstalled;
                return this;
            }

            /**
             * Indicates whether the plug-in is online. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder pluginOnlineStatus(Boolean pluginOnlineStatus) {
                this.pluginOnlineStatus = pluginOnlineStatus;
                return this;
            }

            /**
             * The version of the plug-in.
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
