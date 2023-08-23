// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelSettingRequest} extends {@link RequestModel}
 *
 * <p>GetHotelSettingRequest</p>
 */
public class GetHotelSettingRequest extends Request {
    @Body
    @NameInMap("HotelId")
    private String hotelId;

    @Body
    @NameInMap("SettingType")
    private String settingType;

    private GetHotelSettingRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.settingType = builder.settingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotelSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return settingType
     */
    public String getSettingType() {
        return this.settingType;
    }

    public static final class Builder extends Request.Builder<GetHotelSettingRequest, Builder> {
        private String hotelId; 
        private String settingType; 

        private Builder() {
            super();
        } 

        private Builder(GetHotelSettingRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.settingType = request.settingType;
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
         * SettingType.
         */
        public Builder settingType(String settingType) {
            this.putBodyParameter("SettingType", settingType);
            this.settingType = settingType;
            return this;
        }

        @Override
        public GetHotelSettingRequest build() {
            return new GetHotelSettingRequest(this);
        } 

    } 

}
