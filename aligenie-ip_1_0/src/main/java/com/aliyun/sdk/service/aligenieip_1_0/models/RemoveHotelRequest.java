// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveHotelRequest} extends {@link RequestModel}
 *
 * <p>RemoveHotelRequest</p>
 */
public class RemoveHotelRequest extends Request {
    @Body
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("TbOpenId")
    @Validation(required = true)
    private String tbOpenId;

    private RemoveHotelRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.hotelId = builder.hotelId;
        this.tbOpenId = builder.tbOpenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveHotelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return tbOpenId
     */
    public String getTbOpenId() {
        return this.tbOpenId;
    }

    public static final class Builder extends Request.Builder<RemoveHotelRequest, Builder> {
        private String appKey; 
        private String hotelId; 
        private String tbOpenId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveHotelRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.hotelId = request.hotelId;
            this.tbOpenId = request.tbOpenId;
        } 

        /**
         * appkey
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * TbOpenId.
         */
        public Builder tbOpenId(String tbOpenId) {
            this.putBodyParameter("TbOpenId", tbOpenId);
            this.tbOpenId = tbOpenId;
            return this;
        }

        @Override
        public RemoveHotelRequest build() {
            return new RemoveHotelRequest(this);
        } 

    } 

}
