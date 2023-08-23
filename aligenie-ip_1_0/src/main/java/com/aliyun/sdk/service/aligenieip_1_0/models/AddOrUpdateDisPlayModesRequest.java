// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddOrUpdateDisPlayModesRequest} extends {@link RequestModel}
 *
 * <p>AddOrUpdateDisPlayModesRequest</p>
 */
public class AddOrUpdateDisPlayModesRequest extends Request {
    @Body
    @NameInMap("HotelDeviceModeList")
    @Validation(required = true)
    private java.util.List < String > hotelDeviceModeList;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    private AddOrUpdateDisPlayModesRequest(Builder builder) {
        super(builder);
        this.hotelDeviceModeList = builder.hotelDeviceModeList;
        this.hotelId = builder.hotelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddOrUpdateDisPlayModesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelDeviceModeList
     */
    public java.util.List < String > getHotelDeviceModeList() {
        return this.hotelDeviceModeList;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    public static final class Builder extends Request.Builder<AddOrUpdateDisPlayModesRequest, Builder> {
        private java.util.List < String > hotelDeviceModeList; 
        private String hotelId; 

        private Builder() {
            super();
        } 

        private Builder(AddOrUpdateDisPlayModesRequest request) {
            super(request);
            this.hotelDeviceModeList = request.hotelDeviceModeList;
            this.hotelId = request.hotelId;
        } 

        /**
         * HotelDeviceModeList.
         */
        public Builder hotelDeviceModeList(java.util.List < String > hotelDeviceModeList) {
            String hotelDeviceModeListShrink = shrink(hotelDeviceModeList, "HotelDeviceModeList", "json");
            this.putBodyParameter("HotelDeviceModeList", hotelDeviceModeListShrink);
            this.hotelDeviceModeList = hotelDeviceModeList;
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

        @Override
        public AddOrUpdateDisPlayModesRequest build() {
            return new AddOrUpdateDisPlayModesRequest(this);
        } 

    } 

}
