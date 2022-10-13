// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceGroupsRequest</p>
 */
public class ListResourceGroupsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("BizExtKey")
    private String bizExtKey;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("ResourceGroupType")
    @Validation(required = true)
    private Integer resourceGroupType;

    private ListResourceGroupsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizExtKey = builder.bizExtKey;
        this.keyword = builder.keyword;
        this.resourceGroupType = builder.resourceGroupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsRequest create() {
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
     * @return bizExtKey
     */
    public String getBizExtKey() {
        return this.bizExtKey;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return resourceGroupType
     */
    public Integer getResourceGroupType() {
        return this.resourceGroupType;
    }

    public static final class Builder extends Request.Builder<ListResourceGroupsRequest, Builder> {
        private String regionId; 
        private String bizExtKey; 
        private String keyword; 
        private Integer resourceGroupType; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceGroupsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizExtKey = request.bizExtKey;
            this.keyword = request.keyword;
            this.resourceGroupType = request.resourceGroupType;
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
         * BizExtKey.
         */
        public Builder bizExtKey(String bizExtKey) {
            this.putQueryParameter("BizExtKey", bizExtKey);
            this.bizExtKey = bizExtKey;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * ResourceGroupType.
         */
        public Builder resourceGroupType(Integer resourceGroupType) {
            this.putQueryParameter("ResourceGroupType", resourceGroupType);
            this.resourceGroupType = resourceGroupType;
            return this;
        }

        @Override
        public ListResourceGroupsRequest build() {
            return new ListResourceGroupsRequest(this);
        } 

    } 

}
