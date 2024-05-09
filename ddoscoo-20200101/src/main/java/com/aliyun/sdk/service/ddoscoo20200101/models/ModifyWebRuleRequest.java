// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebRuleRequest</p>
 */
public class ModifyWebRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsExt")
    private String httpsExt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > realServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rsType;

    private ModifyWebRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.httpsExt = builder.httpsExt;
        this.instanceIds = builder.instanceIds;
        this.proxyTypes = builder.proxyTypes;
        this.realServers = builder.realServers;
        this.resourceGroupId = builder.resourceGroupId;
        this.rsType = builder.rsType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
    public String getProxyTypes() {
        return this.proxyTypes;
    }

    /**
     * @return realServers
     */
    public java.util.List < String > getRealServers() {
        return this.realServers;
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

    public static final class Builder extends Request.Builder<ModifyWebRuleRequest, Builder> {
        private String regionId; 
        private String domain; 
        private String httpsExt; 
        private java.util.List < String > instanceIds; 
        private String proxyTypes; 
        private java.util.List < String > realServers; 
        private String resourceGroupId; 
        private Integer rsType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.httpsExt = request.httpsExt;
            this.instanceIds = request.instanceIds;
            this.proxyTypes = request.proxyTypes;
            this.realServers = request.realServers;
            this.resourceGroupId = request.resourceGroupId;
            this.rsType = request.rsType;
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
        public Builder proxyTypes(String proxyTypes) {
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
        public ModifyWebRuleRequest build() {
            return new ModifyWebRuleRequest(this);
        } 

    } 

}
