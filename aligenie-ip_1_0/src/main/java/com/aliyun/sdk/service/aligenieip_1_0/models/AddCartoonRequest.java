// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCartoonRequest} extends {@link RequestModel}
 *
 * <p>AddCartoonRequest</p>
 */
public class AddCartoonRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("StartVideoMd5")
    @Validation(required = true)
    private String startVideoMd5;

    @Body
    @NameInMap("StartVideoUrl")
    @Validation(required = true)
    private String startVideoUrl;

    private AddCartoonRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.startVideoMd5 = builder.startVideoMd5;
        this.startVideoUrl = builder.startVideoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCartoonRequest create() {
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
     * @return startVideoMd5
     */
    public String getStartVideoMd5() {
        return this.startVideoMd5;
    }

    /**
     * @return startVideoUrl
     */
    public String getStartVideoUrl() {
        return this.startVideoUrl;
    }

    public static final class Builder extends Request.Builder<AddCartoonRequest, Builder> {
        private String hotelId; 
        private String startVideoMd5; 
        private String startVideoUrl; 

        private Builder() {
            super();
        } 

        private Builder(AddCartoonRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.startVideoMd5 = request.startVideoMd5;
            this.startVideoUrl = request.startVideoUrl;
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
         * StartVideoMd5.
         */
        public Builder startVideoMd5(String startVideoMd5) {
            this.putBodyParameter("StartVideoMd5", startVideoMd5);
            this.startVideoMd5 = startVideoMd5;
            return this;
        }

        /**
         * StartVideoUrl.
         */
        public Builder startVideoUrl(String startVideoUrl) {
            this.putBodyParameter("StartVideoUrl", startVideoUrl);
            this.startVideoUrl = startVideoUrl;
            return this;
        }

        @Override
        public AddCartoonRequest build() {
            return new AddCartoonRequest(this);
        } 

    } 

}
