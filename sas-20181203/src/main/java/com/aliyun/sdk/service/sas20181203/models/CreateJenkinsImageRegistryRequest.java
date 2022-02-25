// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJenkinsImageRegistryRequest} extends {@link RequestModel}
 *
 * <p>CreateJenkinsImageRegistryRequest</p>
 */
public class CreateJenkinsImageRegistryRequest extends Request {
    @Body
    @NameInMap("DomainName")
    private String domainName;

    @Body
    @NameInMap("ExtraParam")
    private String extraParam;

    @Body
    @NameInMap("NetType")
    private Integer netType;

    @Body
    @NameInMap("Password")
    private String password;

    @Body
    @NameInMap("PersistenceDay")
    private Integer persistenceDay;

    @Body
    @NameInMap("ProtocolType")
    private Integer protocolType;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RegistryHostIp")
    private String registryHostIp;

    @Body
    @NameInMap("RegistryName")
    private String registryName;

    @Body
    @NameInMap("RegistryType")
    private String registryType;

    @Body
    @NameInMap("RegistryVersion")
    private String registryVersion;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Body
    @NameInMap("TransPerHour")
    private Integer transPerHour;

    @Body
    @NameInMap("UserName")
    private String userName;

    @Body
    @NameInMap("VpcId")
    private String vpcId;

    @Body
    @NameInMap("WhiteList")
    private String whiteList;

    private CreateJenkinsImageRegistryRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.extraParam = builder.extraParam;
        this.netType = builder.netType;
        this.password = builder.password;
        this.persistenceDay = builder.persistenceDay;
        this.protocolType = builder.protocolType;
        this.regionId = builder.regionId;
        this.registryHostIp = builder.registryHostIp;
        this.registryName = builder.registryName;
        this.registryType = builder.registryType;
        this.registryVersion = builder.registryVersion;
        this.sourceIp = builder.sourceIp;
        this.transPerHour = builder.transPerHour;
        this.userName = builder.userName;
        this.vpcId = builder.vpcId;
        this.whiteList = builder.whiteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJenkinsImageRegistryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return extraParam
     */
    public String getExtraParam() {
        return this.extraParam;
    }

    /**
     * @return netType
     */
    public Integer getNetType() {
        return this.netType;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return persistenceDay
     */
    public Integer getPersistenceDay() {
        return this.persistenceDay;
    }

    /**
     * @return protocolType
     */
    public Integer getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return registryHostIp
     */
    public String getRegistryHostIp() {
        return this.registryHostIp;
    }

    /**
     * @return registryName
     */
    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * @return registryType
     */
    public String getRegistryType() {
        return this.registryType;
    }

    /**
     * @return registryVersion
     */
    public String getRegistryVersion() {
        return this.registryVersion;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return transPerHour
     */
    public Integer getTransPerHour() {
        return this.transPerHour;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return whiteList
     */
    public String getWhiteList() {
        return this.whiteList;
    }

    public static final class Builder extends Request.Builder<CreateJenkinsImageRegistryRequest, Builder> {
        private String domainName; 
        private String extraParam; 
        private Integer netType; 
        private String password; 
        private Integer persistenceDay; 
        private Integer protocolType; 
        private String regionId; 
        private String registryHostIp; 
        private String registryName; 
        private String registryType; 
        private String registryVersion; 
        private String sourceIp; 
        private Integer transPerHour; 
        private String userName; 
        private String vpcId; 
        private String whiteList; 

        private Builder() {
            super();
        } 

        private Builder(CreateJenkinsImageRegistryRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.extraParam = response.extraParam;
            this.netType = response.netType;
            this.password = response.password;
            this.persistenceDay = response.persistenceDay;
            this.protocolType = response.protocolType;
            this.regionId = response.regionId;
            this.registryHostIp = response.registryHostIp;
            this.registryName = response.registryName;
            this.registryType = response.registryType;
            this.registryVersion = response.registryVersion;
            this.sourceIp = response.sourceIp;
            this.transPerHour = response.transPerHour;
            this.userName = response.userName;
            this.vpcId = response.vpcId;
            this.whiteList = response.whiteList;
        } 

        /**
         * 主机域名
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * 镜像仓库附加参数
         */
        public Builder extraParam(String extraParam) {
            this.putBodyParameter("ExtraParam", extraParam);
            this.extraParam = extraParam;
            return this;
        }

        /**
         * 网络类型 1：公网 2：vpc
         */
        public Builder netType(Integer netType) {
            this.putBodyParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * 密码
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * 资产有效天数
         */
        public Builder persistenceDay(Integer persistenceDay) {
            this.putBodyParameter("PersistenceDay", persistenceDay);
            this.persistenceDay = persistenceDay;
            return this;
        }

        /**
         * 协议类型 1：http 2:https
         */
        public Builder protocolType(Integer protocolType) {
            this.putBodyParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * 镜像仓库所在的regionId
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 主机Ip地址
         */
        public Builder registryHostIp(String registryHostIp) {
            this.putBodyParameter("RegistryHostIp", registryHostIp);
            this.registryHostIp = registryHostIp;
            return this;
        }

        /**
         * 镜像仓别名
         */
        public Builder registryName(String registryName) {
            this.putBodyParameter("RegistryName", registryName);
            this.registryName = registryName;
            return this;
        }

        /**
         * 容器镜像服务类型 harbor，quory
         */
        public Builder registryType(String registryType) {
            this.putBodyParameter("RegistryType", registryType);
            this.registryType = registryType;
            return this;
        }

        /**
         * 私有库版本
         */
        public Builder registryVersion(String registryVersion) {
            this.putBodyParameter("RegistryVersion", registryVersion);
            this.registryVersion = registryVersion;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * 每小时扫描的镜像数
         */
        public Builder transPerHour(Integer transPerHour) {
            this.putBodyParameter("TransPerHour", transPerHour);
            this.transPerHour = transPerHour;
            return this;
        }

        /**
         * 用户名
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * vpcId 类型
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * 白名单
         */
        public Builder whiteList(String whiteList) {
            this.putBodyParameter("WhiteList", whiteList);
            this.whiteList = whiteList;
            return this;
        }

        @Override
        public CreateJenkinsImageRegistryRequest build() {
            return new CreateJenkinsImageRegistryRequest(this);
        } 

    } 

}
