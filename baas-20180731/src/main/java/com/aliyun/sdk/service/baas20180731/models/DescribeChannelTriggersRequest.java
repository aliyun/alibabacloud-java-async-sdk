// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelTriggersRequest} extends {@link RequestModel}
 *
 * <p>DescribeChannelTriggersRequest</p>
 */
public class DescribeChannelTriggersRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Query
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    private DescribeChannelTriggersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channelId = builder.channelId;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelTriggersRequest create() {
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

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<DescribeChannelTriggersRequest, Builder> {
        private String regionId; 
        private String channelId; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChannelTriggersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channelId = request.channelId;
            this.organizationId = request.organizationId;
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

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public DescribeChannelTriggersRequest build() {
            return new DescribeChannelTriggersRequest(this);
        } 

    } 

}
