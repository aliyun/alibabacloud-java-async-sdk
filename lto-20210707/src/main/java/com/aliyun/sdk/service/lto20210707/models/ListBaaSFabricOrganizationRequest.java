// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link ListBaaSFabricOrganizationRequest} extends {@link RequestModel}
 *
 * <p>ListBaaSFabricOrganizationRequest</p>
 */
public class ListBaaSFabricOrganizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaaSFabricChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baaSFabricChannelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListBaaSFabricOrganizationRequest(Builder builder) {
        super(builder);
        this.baaSFabricChannelId = builder.baaSFabricChannelId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBaaSFabricOrganizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baaSFabricChannelId
     */
    public String getBaaSFabricChannelId() {
        return this.baaSFabricChannelId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListBaaSFabricOrganizationRequest, Builder> {
        private String baaSFabricChannelId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListBaaSFabricOrganizationRequest request) {
            super(request);
            this.baaSFabricChannelId = request.baaSFabricChannelId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder baaSFabricChannelId(String baaSFabricChannelId) {
            this.putQueryParameter("BaaSFabricChannelId", baaSFabricChannelId);
            this.baaSFabricChannelId = baaSFabricChannelId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListBaaSFabricOrganizationRequest build() {
            return new ListBaaSFabricOrganizationRequest(this);
        } 

    } 

}
