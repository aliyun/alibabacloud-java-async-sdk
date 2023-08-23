// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicInfoQARequest} extends {@link RequestModel}
 *
 * <p>GetBasicInfoQARequest</p>
 */
public class GetBasicInfoQARequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    private GetBasicInfoQARequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicInfoQARequest create() {
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

    public static final class Builder extends Request.Builder<GetBasicInfoQARequest, Builder> {
        private String hotelId; 

        private Builder() {
            super();
        } 

        private Builder(GetBasicInfoQARequest request) {
            super(request);
            this.hotelId = request.hotelId;
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
        public GetBasicInfoQARequest build() {
            return new GetBasicInfoQARequest(this);
        } 

    } 

}
