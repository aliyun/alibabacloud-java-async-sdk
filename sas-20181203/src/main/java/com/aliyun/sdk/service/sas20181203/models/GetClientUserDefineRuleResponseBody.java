// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClientUserDefineRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientUserDefineRuleResponseBody</p>
 */
public class GetClientUserDefineRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserDefineRuleDetail")
    private UserDefineRuleDetail userDefineRuleDetail;

    private GetClientUserDefineRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userDefineRuleDetail = builder.userDefineRuleDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientUserDefineRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userDefineRuleDetail
     */
    public UserDefineRuleDetail getUserDefineRuleDetail() {
        return this.userDefineRuleDetail;
    }

    public static final class Builder {
        private String requestId; 
        private UserDefineRuleDetail userDefineRuleDetail; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the custom defense rule.
         */
        public Builder userDefineRuleDetail(UserDefineRuleDetail userDefineRuleDetail) {
            this.userDefineRuleDetail = userDefineRuleDetail;
            return this;
        }

        public GetClientUserDefineRuleResponseBody build() {
            return new GetClientUserDefineRuleResponseBody(this);
        } 

    } 

    public static class UserDefineRuleDetail extends TeaModel {
        @NameInMap("ActionType")
        private String actionType;

        @NameInMap("Cmdline")
        private String cmdline;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("IP")
        private String ip;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Md5List")
        private String md5List;

        @NameInMap("Name")
        private String name;

        @NameInMap("NewFilePath")
        private String newFilePath;

        @NameInMap("ParentCmdline")
        private String parentCmdline;

        @NameInMap("ParentProcPath")
        private String parentProcPath;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("PortStr")
        private String portStr;

        @NameInMap("ProcPath")
        private String procPath;

        @NameInMap("RegistryContent")
        private String registryContent;

        @NameInMap("RegistryKey")
        private String registryKey;

        @NameInMap("Type")
        private Integer type;

        private UserDefineRuleDetail(Builder builder) {
            this.actionType = builder.actionType;
            this.cmdline = builder.cmdline;
            this.filePath = builder.filePath;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.ip = builder.ip;
            this.id = builder.id;
            this.md5List = builder.md5List;
            this.name = builder.name;
            this.newFilePath = builder.newFilePath;
            this.parentCmdline = builder.parentCmdline;
            this.parentProcPath = builder.parentProcPath;
            this.platform = builder.platform;
            this.port = builder.port;
            this.portStr = builder.portStr;
            this.procPath = builder.procPath;
            this.registryContent = builder.registryContent;
            this.registryKey = builder.registryKey;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserDefineRuleDetail create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return cmdline
         */
        public String getCmdline() {
            return this.cmdline;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return md5List
         */
        public String getMd5List() {
            return this.md5List;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newFilePath
         */
        public String getNewFilePath() {
            return this.newFilePath;
        }

        /**
         * @return parentCmdline
         */
        public String getParentCmdline() {
            return this.parentCmdline;
        }

        /**
         * @return parentProcPath
         */
        public String getParentProcPath() {
            return this.parentProcPath;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return portStr
         */
        public String getPortStr() {
            return this.portStr;
        }

        /**
         * @return procPath
         */
        public String getProcPath() {
            return this.procPath;
        }

        /**
         * @return registryContent
         */
        public String getRegistryContent() {
            return this.registryContent;
        }

        /**
         * @return registryKey
         */
        public String getRegistryKey() {
            return this.registryKey;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String actionType; 
            private String cmdline; 
            private String filePath; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String ip; 
            private Long id; 
            private String md5List; 
            private String name; 
            private String newFilePath; 
            private String parentCmdline; 
            private String parentProcPath; 
            private String platform; 
            private Integer port; 
            private String portStr; 
            private String procPath; 
            private String registryContent; 
            private String registryKey; 
            private Integer type; 

            /**
             * The action of the custom defense rule. Valid values:
             * <p>
             * 
             * *   **0**: allow
             * *   **1**: block
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * The command line.
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * The file path.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * The time when the custom defense rule was created.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the custom defense rule was last modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The IP address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ID of the custom defense rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The hash values of processes.
             */
            public Builder md5List(String md5List) {
                this.md5List = md5List;
                return this;
            }

            /**
             * The name of the custom defense rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The new file path after the file is renamed.
             */
            public Builder newFilePath(String newFilePath) {
                this.newFilePath = newFilePath;
                return this;
            }

            /**
             * The parent command line.
             */
            public Builder parentCmdline(String parentCmdline) {
                this.parentCmdline = parentCmdline;
                return this;
            }

            /**
             * The path to the parent process.
             */
            public Builder parentProcPath(String parentProcPath) {
                this.parentProcPath = parentProcPath;
                return this;
            }

            /**
             * The type of the operating system. Valid values:
             * <p>
             * 
             * *   **linux**
             * *   **windows**
             * *   **all**
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The port number.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The port number. Valid values: 1 to 65535.
             */
            public Builder portStr(String portStr) {
                this.portStr = portStr;
                return this;
            }

            /**
             * The path to the process.
             */
            public Builder procPath(String procPath) {
                this.procPath = procPath;
                return this;
            }

            /**
             * The registry value.
             */
            public Builder registryContent(String registryContent) {
                this.registryContent = registryContent;
                return this;
            }

            /**
             * The registry key.
             */
            public Builder registryKey(String registryKey) {
                this.registryKey = registryKey;
                return this;
            }

            /**
             * The type of the custom defense rule. Valid values:
             * <p>
             * 
             * *   **1**: Process hash
             * *   **2**: Command line
             * *   **3**: Process Network
             * *   **4**: File Read and Write
             * *   **5**: Operation on Registry
             * *   **6**: Dynamic-link Library Loading
             * *   **7**: File Renaming
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public UserDefineRuleDetail build() {
                return new UserDefineRuleDetail(this);
            } 

        } 

    }
}
