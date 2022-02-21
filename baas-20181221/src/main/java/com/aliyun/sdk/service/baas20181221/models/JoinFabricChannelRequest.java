// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinFabricChannelRequest} extends {@link RequestModel}
 *
 * <p>JoinFabricChannelRequest</p>
 */
public class JoinFabricChannelRequest extends Request {
    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Query
    @NameInMap("Do")
    @Validation(required = true)
    private String _do;

    @Body
    @NameInMap("Location")
    private String location;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private JoinFabricChannelRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this._do = builder._do;
        this.location = builder.location;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinFabricChannelRequest create() {
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
     * @return _do
     */
    public String get_do() {
        return this._do;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<JoinFabricChannelRequest, Builder> {
        private String channelId; 
        private String _do; 
        private String location; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(JoinFabricChannelRequest response) {
            super(response);
            this.channelId = response.channelId;
            this._do = response._do;
            this.location = response.location;
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
         * Do.
         */
        public Builder _do(String _do) {
            this.putQueryParameter("Do", _do);
            this._do = _do;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
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
        public JoinFabricChannelRequest build() {
            return new JoinFabricChannelRequest(this);
        } 

    } 

}
