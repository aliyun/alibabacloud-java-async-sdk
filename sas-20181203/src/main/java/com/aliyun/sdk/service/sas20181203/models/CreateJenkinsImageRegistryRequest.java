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
 * {@link CreateJenkinsImageRegistryRequest} extends {@link RequestModel}
 *
 * <p>CreateJenkinsImageRegistryRequest</p>
 */
public class CreateJenkinsImageRegistryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtraParam")
    private String extraParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetType")
    private Integer netType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PersistenceDay")
    private Integer persistenceDay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private Integer protocolType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryHostIp")
    private String registryHostIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryName")
    private String registryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryType")
    private String registryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryVersion")
    private String registryVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransPerHour")
    private Integer transPerHour;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WhiteList")
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

        private Builder(CreateJenkinsImageRegistryRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.extraParam = request.extraParam;
            this.netType = request.netType;
            this.password = request.password;
            this.persistenceDay = request.persistenceDay;
            this.protocolType = request.protocolType;
            this.regionId = request.regionId;
            this.registryHostIp = request.registryHostIp;
            this.registryName = request.registryName;
            this.registryType = request.registryType;
            this.registryVersion = request.registryVersion;
            this.sourceIp = request.sourceIp;
            this.transPerHour = request.transPerHour;
            this.userName = request.userName;
            this.vpcId = request.vpcId;
            this.whiteList = request.whiteList;
        } 

        /**
         * <p>The domain name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The additional parameters of the image repository. The value of this parameter contains the following fields:</p>
         * <ul>
         * <li><strong>namespace</strong>: the namespace</li>
         * <li><strong>authToken</strong>: the authorization token</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;namespace&quot;:&quot;aa&quot;,&quot;authToken&quot;:&quot;aa&quot;}]</p>
         */
        public Builder extraParam(String extraParam) {
            this.putBodyParameter("ExtraParam", extraParam);
            this.extraParam = extraParam;
            return this;
        }

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Internet</li>
         * <li><strong>2</strong>: Virtual Private Cloud (VPC)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder netType(Integer netType) {
            this.putBodyParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <p>Harbor********</p>
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The number of days during which assets can be retained.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder persistenceDay(Integer persistenceDay) {
            this.putBodyParameter("PersistenceDay", persistenceDay);
            this.persistenceDay = persistenceDay;
            return this;
        }

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: HTTP</li>
         * <li><strong>2</strong>: HTTPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder protocolType(Integer protocolType) {
            this.putBodyParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The region ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IP address of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>114.55.XXX.XXX</p>
         */
        public Builder registryHostIp(String registryHostIp) {
            this.putBodyParameter("RegistryHostIp", registryHostIp);
            this.registryHostIp = registryHostIp;
            return this;
        }

        /**
         * <p>The alias of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>testRepo</p>
         */
        public Builder registryName(String registryName) {
            this.putBodyParameter("RegistryName", registryName);
            this.registryName = registryName;
            return this;
        }

        /**
         * <p>The type of the image repository. Valid values:</p>
         * <ul>
         * <li><strong>CI/CD</strong>: Jenkins</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CI/CD</p>
         */
        public Builder registryType(String registryType) {
            this.putBodyParameter("RegistryType", registryType);
            this.registryType = registryType;
            return this;
        }

        /**
         * <p>The version of the image repository. Default value: -. Valid values:</p>
         * <ul>
         * <li><strong>-</strong>: the default version</li>
         * <li><strong>V1</strong>: V1.0</li>
         * <li><strong>V2</strong>: V2.0</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
        public Builder registryVersion(String registryVersion) {
            this.putBodyParameter("RegistryVersion", registryVersion);
            this.registryVersion = registryVersion;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>41.121.XXX.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The number of images that can be scanned per hour.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder transPerHour(Integer transPerHour) {
            this.putBodyParameter("TransPerHour", transPerHour);
            this.transPerHour = transPerHour;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>RegistryUser</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze4aoqgeu51ydfb8****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The whitelist of IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XXX.XXX</p>
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
