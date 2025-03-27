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
 * {@link AddOrUpdateWelcomeTextRequest} extends {@link RequestModel}
 *
 * <p>AddOrUpdateWelcomeTextRequest</p>
 */
public class AddOrUpdateWelcomeTextRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MusicUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String musicUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WelcomeText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String welcomeText;

    private AddOrUpdateWelcomeTextRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.musicUrl = builder.musicUrl;
        this.welcomeText = builder.welcomeText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddOrUpdateWelcomeTextRequest create() {
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
     * @return musicUrl
     */
    public String getMusicUrl() {
        return this.musicUrl;
    }

    /**
     * @return welcomeText
     */
    public String getWelcomeText() {
        return this.welcomeText;
    }

    public static final class Builder extends Request.Builder<AddOrUpdateWelcomeTextRequest, Builder> {
        private String hotelId; 
        private String musicUrl; 
        private String welcomeText; 

        private Builder() {
            super();
        } 

        private Builder(AddOrUpdateWelcomeTextRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.musicUrl = request.musicUrl;
            this.welcomeText = request.welcomeText;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ailabsaicloudservice.alicdn.com/tmp/a.wav">http://ailabsaicloudservice.alicdn.com/tmp/a.wav</a></p>
         */
        public Builder musicUrl(String musicUrl) {
            this.putBodyParameter("MusicUrl", musicUrl);
            this.musicUrl = musicUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder welcomeText(String welcomeText) {
            this.putBodyParameter("WelcomeText", welcomeText);
            this.welcomeText = welcomeText;
            return this;
        }

        @Override
        public AddOrUpdateWelcomeTextRequest build() {
            return new AddOrUpdateWelcomeTextRequest(this);
        } 

    } 

}
