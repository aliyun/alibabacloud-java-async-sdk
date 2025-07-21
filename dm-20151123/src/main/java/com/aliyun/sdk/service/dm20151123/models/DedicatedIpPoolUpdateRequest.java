// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link DedicatedIpPoolUpdateRequest} extends {@link RequestModel}
 *
 * <p>DedicatedIpPoolUpdateRequest</p>
 */
public class DedicatedIpPoolUpdateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuyResourceIds")
    private String buyResourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateResource")
    private Boolean updateResource;

    private DedicatedIpPoolUpdateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buyResourceIds = builder.buyResourceIds;
        this.id = builder.id;
        this.updateResource = builder.updateResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DedicatedIpPoolUpdateRequest create() {
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
     * @return buyResourceIds
     */
    public String getBuyResourceIds() {
        return this.buyResourceIds;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return updateResource
     */
    public Boolean getUpdateResource() {
        return this.updateResource;
    }

    public static final class Builder extends Request.Builder<DedicatedIpPoolUpdateRequest, Builder> {
        private String regionId; 
        private String buyResourceIds; 
        private String id; 
        private Boolean updateResource; 

        private Builder() {
            super();
        } 

        private Builder(DedicatedIpPoolUpdateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.buyResourceIds = request.buyResourceIds;
            this.id = request.id;
            this.updateResource = request.updateResource;
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
         * <p>Purchased IP instance IDs, separated by commas; sourced from the DedicatedIpNonePoolList API&quot;s returned IP purchase instance IDs</p>
         * 
         * <strong>example:</strong>
         * <p>xxx,xxx</p>
         */
        public Builder buyResourceIds(String buyResourceIds) {
            this.putQueryParameter("BuyResourceIds", buyResourceIds);
            this.buyResourceIds = buyResourceIds;
            return this;
        }

        /**
         * <p>IP pool ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Whether to change the associated IP, enter true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder updateResource(Boolean updateResource) {
            this.putQueryParameter("UpdateResource", updateResource);
            this.updateResource = updateResource;
            return this;
        }

        @Override
        public DedicatedIpPoolUpdateRequest build() {
            return new DedicatedIpPoolUpdateRequest(this);
        } 

    } 

}
