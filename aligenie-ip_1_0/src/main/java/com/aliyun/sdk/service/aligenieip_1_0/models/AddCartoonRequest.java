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
 * {@link AddCartoonRequest} extends {@link RequestModel}
 *
 * <p>AddCartoonRequest</p>
 */
public class AddCartoonRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartVideoMd5")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startVideoMd5;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartVideoUrl")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>520a0***eb</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40c804***697</p>
         */
        public Builder startVideoMd5(String startVideoMd5) {
            this.putBodyParameter("StartVideoMd5", startVideoMd5);
            this.startVideoMd5 = startVideoMd5;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>https://***.mp4</p>
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
