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
 * {@link ListBaaSFabricChannelRequest} extends {@link RequestModel}
 *
 * <p>ListBaaSFabricChannelRequest</p>
 */
public class ListBaaSFabricChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaaSFabricConsortiumId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baaSFabricConsortiumId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListBaaSFabricChannelRequest(Builder builder) {
        super(builder);
        this.baaSFabricConsortiumId = builder.baaSFabricConsortiumId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBaaSFabricChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baaSFabricConsortiumId
     */
    public String getBaaSFabricConsortiumId() {
        return this.baaSFabricConsortiumId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListBaaSFabricChannelRequest, Builder> {
        private String baaSFabricConsortiumId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListBaaSFabricChannelRequest request) {
            super(request);
            this.baaSFabricConsortiumId = request.baaSFabricConsortiumId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder baaSFabricConsortiumId(String baaSFabricConsortiumId) {
            this.putQueryParameter("BaaSFabricConsortiumId", baaSFabricConsortiumId);
            this.baaSFabricConsortiumId = baaSFabricConsortiumId;
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
        public ListBaaSFabricChannelRequest build() {
            return new ListBaaSFabricChannelRequest(this);
        } 

    } 

}
