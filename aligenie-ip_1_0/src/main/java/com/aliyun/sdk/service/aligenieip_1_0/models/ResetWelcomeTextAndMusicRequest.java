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
 * {@link ResetWelcomeTextAndMusicRequest} extends {@link RequestModel}
 *
 * <p>ResetWelcomeTextAndMusicRequest</p>
 */
public class ResetWelcomeTextAndMusicRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    private ResetWelcomeTextAndMusicRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetWelcomeTextAndMusicRequest create() {
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

    public static final class Builder extends Request.Builder<ResetWelcomeTextAndMusicRequest, Builder> {
        private String hotelId; 

        private Builder() {
            super();
        } 

        private Builder(ResetWelcomeTextAndMusicRequest request) {
            super(request);
            this.hotelId = request.hotelId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af7***536</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        @Override
        public ResetWelcomeTextAndMusicRequest build() {
            return new ResetWelcomeTextAndMusicRequest(this);
        } 

    } 

}
