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
    @Query
    @NameInMap("BlackList")
    private java.util.List < String > blackList;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("WhiteList")
    private java.util.List < String > whiteList;

    private ConfigWebIpSetRequest(Builder builder) {
        super(builder);
        this.blackList = builder.blackList;
        this.domain = builder.domain;
        this.regionId = builder.regionId;
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
     * @return whiteList
     */
    public java.util.List < String > getWhiteList() {
        return this.whiteList;
    }

    public static final class Builder extends Request.Builder<ConfigWebIpSetRequest, Builder> {
        private java.util.List < String > blackList; 
        private String domain; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < String > whiteList; 

        private Builder() {
            super();
        } 

        private Builder(ConfigWebIpSetRequest response) {
            super(response);
            this.blackList = response.blackList;
            this.domain = response.domain;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.whiteList = response.whiteList;
        } 

        /**
         * BlackList.
         */
        public Builder blackList(java.util.List < String > blackList) {
            this.putQueryParameter("BlackList", blackList);
            this.blackList = blackList;
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
         * WhiteList.
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
