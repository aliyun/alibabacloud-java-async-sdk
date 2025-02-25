// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChannelMembersRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricChannelMembersRequest</p>
 */
public class DescribeFabricChannelMembersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    private DescribeFabricChannelMembersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channelId = builder.channelId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricChannelMembersRequest, Builder> {
        private String regionId; 
        private String channelId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricChannelMembersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channelId = request.channelId;
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
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        @Override
        public DescribeFabricChannelMembersRequest build() {
            return new DescribeFabricChannelMembersRequest(this);
        } 

    } 

}
