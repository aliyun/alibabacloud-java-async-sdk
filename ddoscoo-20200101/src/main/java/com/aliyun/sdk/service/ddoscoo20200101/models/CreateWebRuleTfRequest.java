// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWebRuleTfRequest} extends {@link RequestModel}
 *
 * <p>CreateWebRuleTfRequest</p>
 */
public class CreateWebRuleTfRequest extends Request {
    @Query
    @NameInMap("DefenseId")
    private String defenseId;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("HttpsExt")
    private String httpsExt;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("ProxyTypes")
    @Validation(required = true)
    private java.util.List < ProxyTypes> proxyTypes;

    @Query
    @NameInMap("RealServers")
    private java.util.List < String > realServers;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RsType")
    @Validation(required = true)
    private Integer rsType;

    private CreateWebRuleTfRequest(Builder builder) {
        super(builder);
        this.defenseId = builder.defenseId;
        this.domain = builder.domain;
        this.httpsExt = builder.httpsExt;
        this.instanceIds = builder.instanceIds;
        this.proxyTypes = builder.proxyTypes;
        this.realServers = builder.realServers;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.rsType = builder.rsType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebRuleTfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenseId
     */
    public String getDefenseId() {
        return this.defenseId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return httpsExt
     */
    public String getHttpsExt() {
        return this.httpsExt;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return proxyTypes
     */
    public java.util.List < ProxyTypes> getProxyTypes() {
        return this.proxyTypes;
    }

    /**
     * @return realServers
     */
    public java.util.List < String > getRealServers() {
        return this.realServers;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return rsType
     */
    public Integer getRsType() {
        return this.rsType;
    }

    public static final class Builder extends Request.Builder<CreateWebRuleTfRequest, Builder> {
        private String defenseId; 
        private String domain; 
        private String httpsExt; 
        private java.util.List < String > instanceIds; 
        private java.util.List < ProxyTypes> proxyTypes; 
        private java.util.List < String > realServers; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer rsType; 

        private Builder() {
            super();
        } 

        private Builder(CreateWebRuleTfRequest response) {
            super(response);
            this.defenseId = response.defenseId;
            this.domain = response.domain;
            this.httpsExt = response.httpsExt;
            this.instanceIds = response.instanceIds;
            this.proxyTypes = response.proxyTypes;
            this.realServers = response.realServers;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.rsType = response.rsType;
        } 

        /**
         * DefenseId.
         */
        public Builder defenseId(String defenseId) {
            this.putQueryParameter("DefenseId", defenseId);
            this.defenseId = defenseId;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * HttpsExt.
         */
        public Builder httpsExt(String httpsExt) {
            this.putQueryParameter("HttpsExt", httpsExt);
            this.httpsExt = httpsExt;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * ProxyTypes.
         */
        public Builder proxyTypes(java.util.List < ProxyTypes> proxyTypes) {
            this.putQueryParameter("ProxyTypes", proxyTypes);
            this.proxyTypes = proxyTypes;
            return this;
        }

        /**
         * RealServers.
         */
        public Builder realServers(java.util.List < String > realServers) {
            this.putQueryParameter("RealServers", realServers);
            this.realServers = realServers;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * RsType.
         */
        public Builder rsType(Integer rsType) {
            this.putQueryParameter("RsType", rsType);
            this.rsType = rsType;
            return this;
        }

        @Override
        public CreateWebRuleTfRequest build() {
            return new CreateWebRuleTfRequest(this);
        } 

    } 

    public static class ProxyTypes extends TeaModel {
        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("ProxyPorts")
        @Validation(required = true)
        private java.util.List < Integer > proxyPorts;

        private ProxyTypes(Builder builder) {
            this.protocol = builder.protocol;
            this.proxyPorts = builder.proxyPorts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyTypes create() {
            return builder().build();
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return proxyPorts
         */
        public java.util.List < Integer > getProxyPorts() {
            return this.proxyPorts;
        }

        public static final class Builder {
            private String protocol; 
            private java.util.List < Integer > proxyPorts; 

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * ProxyPorts.
             */
            public Builder proxyPorts(java.util.List < Integer > proxyPorts) {
                this.proxyPorts = proxyPorts;
                return this;
            }

            public ProxyTypes build() {
                return new ProxyTypes(this);
            } 

        } 

    }
}
