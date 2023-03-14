// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer7BlackWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer7BlackWhiteListRequest</p>
 */
public class ConfigLayer7BlackWhiteListRequest extends Request {
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

    private ConfigLayer7BlackWhiteListRequest(Builder builder) {
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

    public static ConfigLayer7BlackWhiteListRequest create() {
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

    public static final class Builder extends Request.Builder<ConfigLayer7BlackWhiteListRequest, Builder> {
        private String regionId; 
        private java.util.List < String > blackList; 
        private String domain; 
        private String resourceGroupId; 
        private java.util.List < String > whiteList; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer7BlackWhiteListRequest request) {
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
        public ConfigLayer7BlackWhiteListRequest build() {
            return new ConfigLayer7BlackWhiteListRequest(this);
        } 

    } 

}
