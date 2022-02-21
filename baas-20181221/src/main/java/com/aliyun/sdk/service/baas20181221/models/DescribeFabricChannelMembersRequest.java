// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChannelMembersRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricChannelMembersRequest</p>
 */
public class DescribeFabricChannelMembersRequest extends Request {
    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeFabricChannelMembersRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricChannelMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricChannelMembersRequest, Builder> {
        private String channelId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricChannelMembersRequest response) {
            super(response);
            this.channelId = response.channelId;
            this.regionId = response.regionId;
        } 

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
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

        @Override
        public DescribeFabricChannelMembersRequest build() {
            return new DescribeFabricChannelMembersRequest(this);
        } 

    } 

}
