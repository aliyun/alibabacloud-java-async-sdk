// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetClientUserDefineRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientUserDefineRuleResponseBody</p>
 */
public class GetClientUserDefineRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserDefineRuleDetail")
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the custom defense rule.</p>
         */
        public Builder userDefineRuleDetail(UserDefineRuleDetail userDefineRuleDetail) {
            this.userDefineRuleDetail = userDefineRuleDetail;
            return this;
        }

        public GetClientUserDefineRuleResponseBody build() {
            return new GetClientUserDefineRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClientUserDefineRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientUserDefineRuleResponseBody</p>
     */
    public static class UserDefineRuleDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("Cmdline")
        private String cmdline;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Md5List")
        private String md5List;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewFilePath")
        private String newFilePath;

        @com.aliyun.core.annotation.NameInMap("ParentCmdline")
        private String parentCmdline;

        @com.aliyun.core.annotation.NameInMap("ParentProcPath")
        private String parentProcPath;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("PortStr")
        private String portStr;

        @com.aliyun.core.annotation.NameInMap("ProcPath")
        private String procPath;

        @com.aliyun.core.annotation.NameInMap("RegistryContent")
        private String registryContent;

        @com.aliyun.core.annotation.NameInMap("RegistryKey")
        private String registryKey;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private UserDefineRuleDetail(Builder builder) {
            this.actionType = builder.actionType;
            this.cmdline = builder.cmdline;
            this.domain = builder.domain;
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
         * @return domain
         */
        public String getDomain() {
            return this.domain;
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
            private String domain; 
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
             * <p>The action of the custom defense rule. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: allow</li>
             * <li><strong>1</strong>: block</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The command line.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/sbin/s****</p>
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>/etc/pam****</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The time when the custom defense rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>167118088****</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the custom defense rule was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>167118088****</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.240.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ID of the custom defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>200****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The hash values of processes.</p>
             * 
             * <strong>example:</strong>
             * <p>0c9045b5bec90f9825f1f3f64dd4****</p>
             */
            public Builder md5List(String md5List) {
                this.md5List = md5List;
                return this;
            }

            /**
             * <p>The name of the custom defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Rule****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The new file path after the file is renamed.</p>
             * 
             * <strong>example:</strong>
             * <p>/etc/pam****</p>
             */
            public Builder newFilePath(String newFilePath) {
                this.newFilePath = newFilePath;
                return this;
            }

            /**
             * <p>The parent command line.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/sbin/s****</p>
             */
            public Builder parentCmdline(String parentCmdline) {
                this.parentCmdline = parentCmdline;
                return this;
            }

            /**
             * <p>The path to the parent process.</p>
             * 
             * <strong>example:</strong>
             * <p>c:/windows/system32/i****</p>
             */
            public Builder parentProcPath(String parentProcPath) {
                this.parentProcPath = parentProcPath;
                return this;
            }

            /**
             * <p>The type of the operating system. Valid values:</p>
             * <ul>
             * <li><strong>linux</strong></li>
             * <li><strong>windows</strong></li>
             * <li><strong>all</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The port number. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder portStr(String portStr) {
                this.portStr = portStr;
                return this;
            }

            /**
             * <p>The path to the process.</p>
             * 
             * <strong>example:</strong>
             * <p>c:/windows/system32/i****</p>
             */
            public Builder procPath(String procPath) {
                this.procPath = procPath;
                return this;
            }

            /**
             * <p>The registry value.</p>
             * 
             * <strong>example:</strong>
             * <p><em>SECOH-QAD.exe</em></p>
             */
            public Builder registryContent(String registryContent) {
                this.registryContent = registryContent;
                return this;
            }

            /**
             * <p>The registry key.</p>
             * 
             * <strong>example:</strong>
             * <p>HKEY_DYN_****</p>
             */
            public Builder registryKey(String registryKey) {
                this.registryKey = registryKey;
                return this;
            }

            /**
             * <p>The type of the custom defense rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Process hash</li>
             * <li><strong>2</strong>: Command line</li>
             * <li><strong>3</strong>: Process Network</li>
             * <li><strong>4</strong>: File Read and Write</li>
             * <li><strong>5</strong>: Operation on Registry</li>
             * <li><strong>6</strong>: Dynamic-link Library Loading</li>
             * <li><strong>7</strong>: File Renaming</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
