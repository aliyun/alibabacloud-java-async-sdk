// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClientUserDefineRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyClientUserDefineRuleRequest</p>
 */
public class ModifyClientUserDefineRuleRequest extends Request {
    @Query
    @NameInMap("ActionType")
    @Validation(required = true)
    private Integer actionType;

    @Query
    @NameInMap("Cmdline")
    private String cmdline;

    @Query
    @NameInMap("FilePath")
    private String filePath;

    @Query
    @NameInMap("IP")
    private String ip;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Md5List")
    private String md5List;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NewFilePath")
    private String newFilePath;

    @Query
    @NameInMap("ParentCmdline")
    private String parentCmdline;

    @Query
    @NameInMap("ParentProcPath")
    private String parentProcPath;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("Port")
    private Integer port;

    @Query
    @NameInMap("PortStr")
    private String portStr;

    @Query
    @NameInMap("ProcPath")
    private String procPath;

    @Query
    @NameInMap("RegistryContent")
    private String registryContent;

    @Query
    @NameInMap("RegistryKey")
    private String registryKey;

    @Query
    @NameInMap("Type")
    private Integer type;

    private ModifyClientUserDefineRuleRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.cmdline = builder.cmdline;
        this.filePath = builder.filePath;
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

    public static ModifyClientUserDefineRuleRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyClientUserDefineRuleRequest, Builder> {
        private Integer actionType; 
        private String cmdline; 
        private String filePath; 
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

        private Builder() {
            super();
        } 

        private Builder(ModifyClientUserDefineRuleRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.cmdline = request.cmdline;
            this.filePath = request.filePath;
            this.ip = request.ip;
            this.id = request.id;
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
         * ActionType.
         */
        public Builder actionType(Integer actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * Cmdline.
         */
        public Builder cmdline(String cmdline) {
            this.putQueryParameter("Cmdline", cmdline);
            this.cmdline = cmdline;
            return this;
        }

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * IP.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("IP", ip);
            this.ip = ip;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Md5List.
         */
        public Builder md5List(String md5List) {
            this.putQueryParameter("Md5List", md5List);
            this.md5List = md5List;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NewFilePath.
         */
        public Builder newFilePath(String newFilePath) {
            this.putQueryParameter("NewFilePath", newFilePath);
            this.newFilePath = newFilePath;
            return this;
        }

        /**
         * ParentCmdline.
         */
        public Builder parentCmdline(String parentCmdline) {
            this.putQueryParameter("ParentCmdline", parentCmdline);
            this.parentCmdline = parentCmdline;
            return this;
        }

        /**
         * ParentProcPath.
         */
        public Builder parentProcPath(String parentProcPath) {
            this.putQueryParameter("ParentProcPath", parentProcPath);
            this.parentProcPath = parentProcPath;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * PortStr.
         */
        public Builder portStr(String portStr) {
            this.putQueryParameter("PortStr", portStr);
            this.portStr = portStr;
            return this;
        }

        /**
         * ProcPath.
         */
        public Builder procPath(String procPath) {
            this.putQueryParameter("ProcPath", procPath);
            this.procPath = procPath;
            return this;
        }

        /**
         * RegistryContent.
         */
        public Builder registryContent(String registryContent) {
            this.putQueryParameter("RegistryContent", registryContent);
            this.registryContent = registryContent;
            return this;
        }

        /**
         * RegistryKey.
         */
        public Builder registryKey(String registryKey) {
            this.putQueryParameter("RegistryKey", registryKey);
            this.registryKey = registryKey;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyClientUserDefineRuleRequest build() {
            return new ModifyClientUserDefineRuleRequest(this);
        } 

    } 

}
