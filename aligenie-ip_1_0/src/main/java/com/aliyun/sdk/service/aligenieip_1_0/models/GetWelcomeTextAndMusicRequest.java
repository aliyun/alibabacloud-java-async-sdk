// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link GetWelcomeTextAndMusicRequest} extends {@link RequestModel}
 *
 * <p>GetWelcomeTextAndMusicRequest</p>
 */
public class GetWelcomeTextAndMusicRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    private GetWelcomeTextAndMusicRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWelcomeTextAndMusicRequest create() {
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

    public static final class Builder extends Request.Builder<GetWelcomeTextAndMusicRequest, Builder> {
        private String hotelId; 

        private Builder() {
            super();
        } 

        private Builder(GetWelcomeTextAndMusicRequest request) {
            super(request);
            this.hotelId = request.hotelId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a7a3***013</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        @Override
        public GetWelcomeTextAndMusicRequest build() {
            return new GetWelcomeTextAndMusicRequest(this);
        } 

    } 

}
