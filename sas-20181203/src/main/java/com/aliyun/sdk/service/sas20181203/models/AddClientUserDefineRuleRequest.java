// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddClientUserDefineRuleRequest} extends {@link RequestModel}
 *
 * <p>AddClientUserDefineRuleRequest</p>
 */
public class AddClientUserDefineRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer actionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cmdline")
    private String cmdline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IP")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5List")
    private String md5List;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewFilePath")
    private String newFilePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentCmdline")
    private String parentCmdline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentProcPath")
    private String parentProcPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortStr")
    private String portStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcPath")
    private String procPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryContent")
    private String registryContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryKey")
    private String registryKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    private AddClientUserDefineRuleRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.cmdline = builder.cmdline;
        this.domain = builder.domain;
        this.filePath = builder.filePath;
        this.ip = builder.ip;
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

    public static AddClientUserDefineRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public Integer getActionType() {
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
     * @return ip
     */
    public String getIp() {
        return this.ip;
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

    public static final class Builder extends Request.Builder<AddClientUserDefineRuleRequest, Builder> {
        private Integer actionType; 
        private String cmdline; 
        private String domain; 
        private String filePath; 
        private String ip; 
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

        private Builder() {
            super();
        } 

        private Builder(AddClientUserDefineRuleRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.cmdline = request.cmdline;
            this.domain = request.domain;
            this.filePath = request.filePath;
            this.ip = request.ip;
            this.md5List = request.md5List;
            this.name = request.name;
            this.newFilePath = request.newFilePath;
            this.parentCmdline = request.parentCmdline;
            this.parentProcPath = request.parentProcPath;
            this.platform = request.platform;
            this.port = request.port;
            this.portStr = request.portStr;
            this.procPath = request.procPath;
            this.registryContent = request.registryContent;
            this.registryKey = request.registryKey;
            this.type = request.type;
        } 

        /**
         * <p>The action of the custom defense rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: allow</li>
         * <li><strong>1</strong>: block</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder actionType(Integer actionType) {
            this.putQueryParameter("ActionType", actionType);
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
            this.putQueryParameter("Cmdline", cmdline);
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
            this.putQueryParameter("Domain", domain);
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
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.240.XX.XX</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("IP", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The hash values of processes.</p>
         * 
         * <strong>example:</strong>
         * <p>0c9045b5bec90f9825f1f3f64dd4****</p>
         */
        public Builder md5List(String md5List) {
            this.putQueryParameter("Md5List", md5List);
            this.md5List = md5List;
            return this;
        }

        /**
         * <p>The name of the custom defense rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Rule 1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
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
            this.putQueryParameter("NewFilePath", newFilePath);
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
            this.putQueryParameter("ParentCmdline", parentCmdline);
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
            this.putQueryParameter("ParentProcPath", parentProcPath);
            this.parentProcPath = parentProcPath;
            return this;
        }

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows</li>
         * <li><strong>linux</strong>: Linux</li>
         * <li><strong>all</strong>: all types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The port number. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The port number. Valid values: <strong>1 to 65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder portStr(String portStr) {
            this.putQueryParameter("PortStr", portStr);
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
            this.putQueryParameter("ProcPath", procPath);
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
            this.putQueryParameter("RegistryContent", registryContent);
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
            this.putQueryParameter("RegistryKey", registryKey);
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddClientUserDefineRuleRequest build() {
            return new AddClientUserDefineRuleRequest(this);
        } 

    } 

}
