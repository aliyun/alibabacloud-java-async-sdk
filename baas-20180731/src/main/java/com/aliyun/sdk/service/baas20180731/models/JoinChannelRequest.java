// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinChannelRequest} extends {@link RequestModel}
 *
 * <p>JoinChannelRequest</p>
 */
public class JoinChannelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private JoinChannelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channelId = builder.channelId;
        this._do = builder._do;
        this.location = builder.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinChannelRequest create() {
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

    public static final class Builder extends Request.Builder<JoinChannelRequest, Builder> {
        private String regionId; 
        private String channelId; 
        private String _do; 
        private String location; 

        private Builder() {
            super();
        } 

        private Builder(JoinChannelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channelId = request.channelId;
            this._do = request._do;
            this.location = request.location;
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

        @Override
        public JoinChannelRequest build() {
            return new JoinChannelRequest(this);
        } 

    } 

}
