// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigWebIpSetRequest} extends {@link RequestModel}
 *
 * <p>ConfigWebIpSetRequest</p>
 */
public class ConfigWebIpSetRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BlackList")
    private java.util.List < String > blackList;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("WhiteList")
    private java.util.List < String > whiteList;

    private ConfigWebIpSetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.blackList = builder.blackList;
        this.domain = builder.domain;
        this.resourceGroupId = builder.resourceGroupId;
        this.whiteList = builder.whiteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigWebIpSetRequest create() {
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
     * @return blackList
     */
    public java.util.List < String > getBlackList() {
        return this.blackList;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return whiteList
     */
    public java.util.List < String > getWhiteList() {
        return this.whiteList;
    }

    public static final class Builder extends Request.Builder<ConfigWebIpSetRequest, Builder> {
        private String regionId; 
        private java.util.List < String > blackList; 
        private String domain; 
        private String resourceGroupId; 
        private java.util.List < String > whiteList; 

        private Builder() {
            super();
        } 

        private Builder(ConfigWebIpSetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.blackList = request.blackList;
            this.domain = request.domain;
            this.resourceGroupId = request.resourceGroupId;
            this.whiteList = request.whiteList;
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
         * IP address N or CIDR block N that you want to add to the blacklist. The maximum value of N is 200. You can add up to 200 IP addresses or CIDR blocks to the blacklist.
         */
        public Builder blackList(java.util.List < String > blackList) {
            this.putQueryParameter("BlackList", blackList);
            this.blackList = blackList;
            return this;
        }

        /**
         * The domain name of the website.
         * <p>
         * 
         * > A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * IP address N or CIDR block N that you want to add to the whitelist. The maximum value of N is 200. You can add up to 200 IP addresses or CIDR blocks to the whitelist.
         */
        public Builder whiteList(java.util.List < String > whiteList) {
            this.putQueryParameter("WhiteList", whiteList);
            this.whiteList = whiteList;
            return this;
        }

        @Override
        public ConfigWebIpSetRequest build() {
            return new ConfigWebIpSetRequest(this);
        } 

    } 

}
