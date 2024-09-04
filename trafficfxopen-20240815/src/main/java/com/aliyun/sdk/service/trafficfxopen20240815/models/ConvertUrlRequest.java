// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trafficfxopen20240815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConvertUrlRequest} extends {@link RequestModel}
 *
 * <p>ConvertUrlRequest</p>
 */
public class ConvertUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("countryCallingCode")
    private String countryCallingCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jumpUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jumpUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thirdId")
    private String thirdId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("xAcsAirticketAccessToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("xAcsAirticketLanguage")
    private String xAcsAirticketLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("xenv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xenv;

    private ConvertUrlRequest(Builder builder) {
        super(builder);
        this.countryCallingCode = builder.countryCallingCode;
        this.jumpUrl = builder.jumpUrl;
        this.phone = builder.phone;
        this.scene = builder.scene;
        this.source = builder.source;
        this.thirdId = builder.thirdId;
        this.uid = builder.uid;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
        this.xenv = builder.xenv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return countryCallingCode
     */
    public String getCountryCallingCode() {
        return this.countryCallingCode;
    }

    /**
     * @return jumpUrl
     */
    public String getJumpUrl() {
        return this.jumpUrl;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return thirdId
     */
    public String getThirdId() {
        return this.thirdId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return xAcsAirticketAccessToken
     */
    public String getXAcsAirticketAccessToken() {
        return this.xAcsAirticketAccessToken;
    }

    /**
     * @return xAcsAirticketLanguage
     */
    public String getXAcsAirticketLanguage() {
        return this.xAcsAirticketLanguage;
    }

    /**
     * @return xenv
     */
    public String getXenv() {
        return this.xenv;
    }

    public static final class Builder extends Request.Builder<ConvertUrlRequest, Builder> {
        private String countryCallingCode; 
        private String jumpUrl; 
        private String phone; 
        private String scene; 
        private String source; 
        private String thirdId; 
        private String uid; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 
        private String xenv; 

        private Builder() {
            super();
        } 

        private Builder(ConvertUrlRequest request) {
            super(request);
            this.countryCallingCode = request.countryCallingCode;
            this.jumpUrl = request.jumpUrl;
            this.phone = request.phone;
            this.scene = request.scene;
            this.source = request.source;
            this.thirdId = request.thirdId;
            this.uid = request.uid;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
            this.xenv = request.xenv;
        } 

        /**
         * countryCallingCode.
         */
        public Builder countryCallingCode(String countryCallingCode) {
            this.putBodyParameter("countryCallingCode", countryCallingCode);
            this.countryCallingCode = countryCallingCode;
            return this;
        }

        /**
         * jumpUrl.
         */
        public Builder jumpUrl(String jumpUrl) {
            this.putBodyParameter("jumpUrl", jumpUrl);
            this.jumpUrl = jumpUrl;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.putBodyParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * thirdId.
         */
        public Builder thirdId(String thirdId) {
            this.putBodyParameter("thirdId", thirdId);
            this.thirdId = thirdId;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putBodyParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * token
         */
        public Builder xAcsAirticketAccessToken(String xAcsAirticketAccessToken) {
            this.putHeaderParameter("xAcsAirticketAccessToken", xAcsAirticketAccessToken);
            this.xAcsAirticketAccessToken = xAcsAirticketAccessToken;
            return this;
        }

        /**
         * xAcsAirticketLanguage.
         */
        public Builder xAcsAirticketLanguage(String xAcsAirticketLanguage) {
            this.putHeaderParameter("xAcsAirticketLanguage", xAcsAirticketLanguage);
            this.xAcsAirticketLanguage = xAcsAirticketLanguage;
            return this;
        }

        /**
         * xenv.
         */
        public Builder xenv(String xenv) {
            this.putBodyParameter("xenv", xenv);
            this.xenv = xenv;
            return this;
        }

        @Override
        public ConvertUrlRequest build() {
            return new ConvertUrlRequest(this);
        } 

    } 

}
