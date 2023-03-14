// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer7RuleRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer7RuleRequest</p>
 */
public class ConfigLayer7RuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("ProxyTypeList")
    private String proxyTypeList;

    @Query
    @NameInMap("ProxyTypes")
    private java.util.List < String > proxyTypes;

    @Query
    @NameInMap("RealServers")
    @Validation(required = true)
    private java.util.List < String > realServers;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RsType")
    @Validation(required = true)
    private Integer rsType;

    private ConfigLayer7RuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.instanceIds = builder.instanceIds;
        this.proxyTypeList = builder.proxyTypeList;
        this.proxyTypes = builder.proxyTypes;
        this.realServers = builder.realServers;
        this.resourceGroupId = builder.resourceGroupId;
        this.rsType = builder.rsType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigLayer7RuleRequest create() {
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
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return proxyTypeList
     */
    public String getProxyTypeList() {
        return this.proxyTypeList;
    }

    /**
     * @return proxyTypes
     */
    public java.util.List < String > getProxyTypes() {
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

    public static final class Builder extends Request.Builder<ConfigLayer7RuleRequest, Builder> {
        private String regionId; 
        private String domain; 
        private java.util.List < String > instanceIds; 
        private String proxyTypeList; 
        private java.util.List < String > proxyTypes; 
        private java.util.List < String > realServers; 
        private String resourceGroupId; 
        private Integer rsType; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer7RuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.instanceIds = request.instanceIds;
            this.proxyTypeList = request.proxyTypeList;
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
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * ProxyTypeList.
         */
        public Builder proxyTypeList(String proxyTypeList) {
            this.putQueryParameter("ProxyTypeList", proxyTypeList);
            this.proxyTypeList = proxyTypeList;
            return this;
        }

        /**
         * ProxyTypes.
         */
        public Builder proxyTypes(java.util.List < String > proxyTypes) {
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
        public ConfigLayer7RuleRequest build() {
            return new ConfigLayer7RuleRequest(this);
        } 

    } 

}
