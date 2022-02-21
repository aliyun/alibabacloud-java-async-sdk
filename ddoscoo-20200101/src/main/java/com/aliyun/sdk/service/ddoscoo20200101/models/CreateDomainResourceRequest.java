// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainResourceRequest</p>
 */
public class CreateDomainResourceRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("HttpsExt")
    private String httpsExt;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("ProxyTypes")
    @Validation(required = true)
    private java.util.List < ProxyTypes> proxyTypes;

    @Query
    @NameInMap("RealServers")
    @Validation(required = true)
    private java.util.List < String > realServers;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RsType")
    @Validation(required = true)
    private Integer rsType;

    private CreateDomainResourceRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.httpsExt = builder.httpsExt;
        this.instanceIds = builder.instanceIds;
        this.proxyTypes = builder.proxyTypes;
        this.realServers = builder.realServers;
        this.regionId = builder.regionId;
        this.rsType = builder.rsType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return rsType
     */
    public Integer getRsType() {
        return this.rsType;
    }

    public static final class Builder extends Request.Builder<CreateDomainResourceRequest, Builder> {
        private String domain; 
        private String httpsExt; 
        private java.util.List < String > instanceIds; 
        private java.util.List < ProxyTypes> proxyTypes; 
        private java.util.List < String > realServers; 
        private String regionId; 
        private Integer rsType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainResourceRequest response) {
            super(response);
            this.domain = response.domain;
            this.httpsExt = response.httpsExt;
            this.instanceIds = response.instanceIds;
            this.proxyTypes = response.proxyTypes;
            this.realServers = response.realServers;
            this.regionId = response.regionId;
            this.rsType = response.rsType;
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
         * RsType.
         */
        public Builder rsType(Integer rsType) {
            this.putQueryParameter("RsType", rsType);
            this.rsType = rsType;
            return this;
        }

        @Override
        public CreateDomainResourceRequest build() {
            return new CreateDomainResourceRequest(this);
        } 

    } 

    public static class ProxyTypes extends TeaModel {
        @NameInMap("ProxyPorts")
        @Validation(required = true)
        private java.util.List < Integer > proxyPorts;

        @NameInMap("ProxyType")
        private String proxyType;

        private ProxyTypes(Builder builder) {
            this.proxyPorts = builder.proxyPorts;
            this.proxyType = builder.proxyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyTypes create() {
            return builder().build();
        }

        /**
         * @return proxyPorts
         */
        public java.util.List < Integer > getProxyPorts() {
            return this.proxyPorts;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        public static final class Builder {
            private java.util.List < Integer > proxyPorts; 
            private String proxyType; 

            /**
             * ProxyPorts.
             */
            public Builder proxyPorts(java.util.List < Integer > proxyPorts) {
                this.proxyPorts = proxyPorts;
                return this;
            }

            /**
             * ProxyType.
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            public ProxyTypes build() {
                return new ProxyTypes(this);
            } 

        } 

    }
}
