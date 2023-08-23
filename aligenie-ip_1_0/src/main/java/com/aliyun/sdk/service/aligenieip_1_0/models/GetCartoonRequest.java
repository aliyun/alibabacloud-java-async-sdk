// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCartoonRequest} extends {@link RequestModel}
 *
 * <p>GetCartoonRequest</p>
 */
public class GetCartoonRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    private GetCartoonRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCartoonRequest create() {
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

    public static final class Builder extends Request.Builder<GetCartoonRequest, Builder> {
        private String hotelId; 

        private Builder() {
            super();
        } 

        private Builder(GetCartoonRequest request) {
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
        public GetCartoonRequest build() {
            return new GetCartoonRequest(this);
        } 

    } 

}
