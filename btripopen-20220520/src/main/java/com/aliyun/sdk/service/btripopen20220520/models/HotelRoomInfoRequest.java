// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link HotelRoomInfoRequest} extends {@link RequestModel}
 *
 * <p>HotelRoomInfoRequest</p>
 */
public class HotelRoomInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("room_ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> roomIds;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelRoomInfoRequest(Builder builder) {
        super(builder);
        this.roomIds = builder.roomIds;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelRoomInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roomIds
     */
    public java.util.List<Long> getRoomIds() {
        return this.roomIds;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelRoomInfoRequest, Builder> {
        private java.util.List<Long> roomIds; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelRoomInfoRequest request) {
            super(request);
            this.roomIds = request.roomIds;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder roomIds(java.util.List<Long> roomIds) {
            String roomIdsShrink = shrink(roomIds, "room_ids", "json");
            this.putQueryParameter("room_ids", roomIdsShrink);
            this.roomIds = roomIds;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public HotelRoomInfoRequest build() {
            return new HotelRoomInfoRequest(this);
        } 

    } 

}
