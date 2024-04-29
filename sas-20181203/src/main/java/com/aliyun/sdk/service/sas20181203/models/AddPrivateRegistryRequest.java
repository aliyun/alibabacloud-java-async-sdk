// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPrivateRegistryRequest} extends {@link RequestModel}
 *
 * <p>AddPrivateRegistryRequest</p>
 */
public class AddPrivateRegistryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraParam")
    private String extraParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long netType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryHostIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String registryHostIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String registryRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String registryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String registryVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransPerHour")
    private Integer transPerHour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private AddPrivateRegistryRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.extraParam = builder.extraParam;
        this.netType = builder.netType;
        this.password = builder.password;
        this.port = builder.port;
        this.protocolType = builder.protocolType;
        this.registryHostIp = builder.registryHostIp;
        this.registryRegionId = builder.registryRegionId;
        this.registryType = builder.registryType;
        this.registryVersion = builder.registryVersion;
        this.transPerHour = builder.transPerHour;
        this.userName = builder.userName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPrivateRegistryRequest create() {
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
    public Long getNetType() {
        return this.netType;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return protocolType
     */
    public Long getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return registryHostIp
     */
    public String getRegistryHostIp() {
        return this.registryHostIp;
    }

    /**
     * @return registryRegionId
     */
    public String getRegistryRegionId() {
        return this.registryRegionId;
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

    public static final class Builder extends Request.Builder<AddPrivateRegistryRequest, Builder> {
        private String domainName; 
        private String extraParam; 
        private Long netType; 
        private String password; 
        private Integer port; 
        private Long protocolType; 
        private String registryHostIp; 
        private String registryRegionId; 
        private String registryType; 
        private String registryVersion; 
        private Integer transPerHour; 
        private String userName; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(AddPrivateRegistryRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.extraParam = request.extraParam;
            this.netType = request.netType;
            this.password = request.password;
            this.port = request.port;
            this.protocolType = request.protocolType;
            this.registryHostIp = request.registryHostIp;
            this.registryRegionId = request.registryRegionId;
            this.registryType = request.registryType;
            this.registryVersion = request.registryVersion;
            this.transPerHour = request.transPerHour;
            this.userName = request.userName;
            this.vpcId = request.vpcId;
        } 

        /**
         * The domain name of the image repository.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The additional parameter of the image repository. This parameter is required when you set the RegistryType parameter to **quay**. Valid values:
         * <p>
         * 
         * *   **namespace**
         * *   **authToken**
         */
        public Builder extraParam(String extraParam) {
            this.putQueryParameter("ExtraParam", extraParam);
            this.extraParam = extraParam;
            return this;
        }

        /**
         * The network type. Valid values:
         * <p>
         * 
         * *   **1**: Internet
         * *   **2**: virtual private cloud (VPC)
         */
        public Builder netType(Long netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * The password that is used to log on to the image repository.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The port number.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The type of the protocol. Valid values:
         * <p>
         * 
         * *   **1**: HTTP
         * *   **2**: HTTPS
         */
        public Builder protocolType(Long protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * The IP address of the image repository.
         */
        public Builder registryHostIp(String registryHostIp) {
            this.putQueryParameter("RegistryHostIp", registryHostIp);
            this.registryHostIp = registryHostIp;
            return this;
        }

        /**
         * The region ID.
         * <p>
         * 
         * >  You can call the [ListImageRegistryRegion](~~ListImageRegistryRegion~~) operation to query the IDs of supported regions.
         */
        public Builder registryRegionId(String registryRegionId) {
            this.putQueryParameter("RegistryRegionId", registryRegionId);
            this.registryRegionId = registryRegionId;
            return this;
        }

        /**
         * The type of the private image repository. Valid values:
         * <p>
         * 
         * *   **harbor**
         * *   **quay**
         */
        public Builder registryType(String registryType) {
            this.putQueryParameter("RegistryType", registryType);
            this.registryType = registryType;
            return this;
        }

        /**
         * The version of the image repository. Valid values:
         * <p>
         * 
         * *   **V1**
         * *   **V2**
         */
        public Builder registryVersion(String registryVersion) {
            this.putQueryParameter("RegistryVersion", registryVersion);
            this.registryVersion = registryVersion;
            return this;
        }

        /**
         * The number of images that are scanned per hour.
         */
        public Builder transPerHour(Integer transPerHour) {
            this.putQueryParameter("TransPerHour", transPerHour);
            this.transPerHour = transPerHour;
            return this;
        }

        /**
         * The username that is used to log on to the image repository.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * The ID of the VPC.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public AddPrivateRegistryRequest build() {
            return new AddPrivateRegistryRequest(this);
        } 

    } 

}
