// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link OpenClawInstanceVO} extends {@link TeaModel}
 *
 * <p>OpenClawInstanceVO</p>
 */
public class OpenClawInstanceVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunAccountUid")
    private String aliyunAccountUid;

    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.NameInMap("BasicAuthPassword")
    private String basicAuthPassword;

    @com.aliyun.core.annotation.NameInMap("BasicAuthUsername")
    private String basicAuthUsername;

    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Double cpu;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("ImageInfo")
    private ImageInfo imageInfo;

    @com.aliyun.core.annotation.NameInMap("InstanceDesc")
    private String instanceDesc;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("InstanceRegion")
    private String instanceRegion;

    @com.aliyun.core.annotation.NameInMap("LastActiveTime")
    private String lastActiveTime;

    @com.aliyun.core.annotation.NameInMap("MemorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.NameInMap("OpenclawToken")
    private String openclawToken;

    @com.aliyun.core.annotation.NameInMap("OwnerUid")
    private String ownerUid;

    @com.aliyun.core.annotation.NameInMap("PublicDomain")
    private String publicDomain;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("StatusDesc")
    private String statusDesc;

    @com.aliyun.core.annotation.NameInMap("StatusMessage")
    private String statusMessage;

    @com.aliyun.core.annotation.NameInMap("Variables")
    private String variables;

    private OpenClawInstanceVO(Builder builder) {
        this.aliyunAccountUid = builder.aliyunAccountUid;
        this.authType = builder.authType;
        this.basicAuthPassword = builder.basicAuthPassword;
        this.basicAuthUsername = builder.basicAuthUsername;
        this.cpu = builder.cpu;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.imageInfo = builder.imageInfo;
        this.instanceDesc = builder.instanceDesc;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.instanceRegion = builder.instanceRegion;
        this.lastActiveTime = builder.lastActiveTime;
        this.memorySize = builder.memorySize;
        this.openclawToken = builder.openclawToken;
        this.ownerUid = builder.ownerUid;
        this.publicDomain = builder.publicDomain;
        this.status = builder.status;
        this.statusDesc = builder.statusDesc;
        this.statusMessage = builder.statusMessage;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenClawInstanceVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunAccountUid
     */
    public String getAliyunAccountUid() {
        return this.aliyunAccountUid;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return basicAuthPassword
     */
    public String getBasicAuthPassword() {
        return this.basicAuthPassword;
    }

    /**
     * @return basicAuthUsername
     */
    public String getBasicAuthUsername() {
        return this.basicAuthUsername;
    }

    /**
     * @return cpu
     */
    public Double getCpu() {
        return this.cpu;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return imageInfo
     */
    public ImageInfo getImageInfo() {
        return this.imageInfo;
    }

    /**
     * @return instanceDesc
     */
    public String getInstanceDesc() {
        return this.instanceDesc;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceRegion
     */
    public String getInstanceRegion() {
        return this.instanceRegion;
    }

    /**
     * @return lastActiveTime
     */
    public String getLastActiveTime() {
        return this.lastActiveTime;
    }

    /**
     * @return memorySize
     */
    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * @return openclawToken
     */
    public String getOpenclawToken() {
        return this.openclawToken;
    }

    /**
     * @return ownerUid
     */
    public String getOwnerUid() {
        return this.ownerUid;
    }

    /**
     * @return publicDomain
     */
    public String getPublicDomain() {
        return this.publicDomain;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return statusDesc
     */
    public String getStatusDesc() {
        return this.statusDesc;
    }

    /**
     * @return statusMessage
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * @return variables
     */
    public String getVariables() {
        return this.variables;
    }

    public static final class Builder {
        private String aliyunAccountUid; 
        private String authType; 
        private String basicAuthPassword; 
        private String basicAuthUsername; 
        private Double cpu; 
        private String gmtCreate; 
        private String gmtModified; 
        private ImageInfo imageInfo; 
        private String instanceDesc; 
        private String instanceId; 
        private String instanceName; 
        private String instanceRegion; 
        private String lastActiveTime; 
        private Integer memorySize; 
        private String openclawToken; 
        private String ownerUid; 
        private String publicDomain; 
        private Integer status; 
        private String statusDesc; 
        private String statusMessage; 
        private String variables; 

        private Builder() {
        } 

        private Builder(OpenClawInstanceVO model) {
            this.aliyunAccountUid = model.aliyunAccountUid;
            this.authType = model.authType;
            this.basicAuthPassword = model.basicAuthPassword;
            this.basicAuthUsername = model.basicAuthUsername;
            this.cpu = model.cpu;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.imageInfo = model.imageInfo;
            this.instanceDesc = model.instanceDesc;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.instanceRegion = model.instanceRegion;
            this.lastActiveTime = model.lastActiveTime;
            this.memorySize = model.memorySize;
            this.openclawToken = model.openclawToken;
            this.ownerUid = model.ownerUid;
            this.publicDomain = model.publicDomain;
            this.status = model.status;
            this.statusDesc = model.statusDesc;
            this.statusMessage = model.statusMessage;
            this.variables = model.variables;
        } 

        /**
         * AliyunAccountUid.
         */
        public Builder aliyunAccountUid(String aliyunAccountUid) {
            this.aliyunAccountUid = aliyunAccountUid;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * BasicAuthPassword.
         */
        public Builder basicAuthPassword(String basicAuthPassword) {
            this.basicAuthPassword = basicAuthPassword;
            return this;
        }

        /**
         * BasicAuthUsername.
         */
        public Builder basicAuthUsername(String basicAuthUsername) {
            this.basicAuthUsername = basicAuthUsername;
            return this;
        }

        /**
         * Cpu.
         */
        public Builder cpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * ImageInfo.
         */
        public Builder imageInfo(ImageInfo imageInfo) {
            this.imageInfo = imageInfo;
            return this;
        }

        /**
         * InstanceDesc.
         */
        public Builder instanceDesc(String instanceDesc) {
            this.instanceDesc = instanceDesc;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstanceRegion.
         */
        public Builder instanceRegion(String instanceRegion) {
            this.instanceRegion = instanceRegion;
            return this;
        }

        /**
         * LastActiveTime.
         */
        public Builder lastActiveTime(String lastActiveTime) {
            this.lastActiveTime = lastActiveTime;
            return this;
        }

        /**
         * MemorySize.
         */
        public Builder memorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        /**
         * OpenclawToken.
         */
        public Builder openclawToken(String openclawToken) {
            this.openclawToken = openclawToken;
            return this;
        }

        /**
         * OwnerUid.
         */
        public Builder ownerUid(String ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }

        /**
         * PublicDomain.
         */
        public Builder publicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * StatusDesc.
         */
        public Builder statusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }

        /**
         * StatusMessage.
         */
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        /**
         * Variables.
         */
        public Builder variables(String variables) {
            this.variables = variables;
            return this;
        }

        public OpenClawInstanceVO build() {
            return new OpenClawInstanceVO(this);
        } 

    } 

    /**
     * 
     * {@link OpenClawInstanceVO} extends {@link TeaModel}
     *
     * <p>OpenClawInstanceVO</p>
     */
    public static class ImageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private Long imageId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("VersionDesc")
        private String versionDesc;

        private ImageInfo(Builder builder) {
            this.imageId = builder.imageId;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.tag = builder.tag;
            this.versionDesc = builder.versionDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInfo create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public Long getImageId() {
            return this.imageId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return versionDesc
         */
        public String getVersionDesc() {
            return this.versionDesc;
        }

        public static final class Builder {
            private Long imageId; 
            private String name; 
            private String namespace; 
            private String tag; 
            private String versionDesc; 

            private Builder() {
            } 

            private Builder(ImageInfo model) {
                this.imageId = model.imageId;
                this.name = model.name;
                this.namespace = model.namespace;
                this.tag = model.tag;
                this.versionDesc = model.versionDesc;
            } 

            /**
             * ImageId.
             */
            public Builder imageId(Long imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * VersionDesc.
             */
            public Builder versionDesc(String versionDesc) {
                this.versionDesc = versionDesc;
                return this;
            }

            public ImageInfo build() {
                return new ImageInfo(this);
            } 

        } 

    }
}
