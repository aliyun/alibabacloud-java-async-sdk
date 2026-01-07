// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link SendAsyncMobileCaptchaRequest} extends {@link RequestModel}
 *
 * <p>SendAsyncMobileCaptchaRequest</p>
 */
public class SendAsyncMobileCaptchaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactInfo")
    private String contactInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactorId")
    private String contactorId;

    private SendAsyncMobileCaptchaRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.contactInfo = builder.contactInfo;
        this.contactorId = builder.contactorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendAsyncMobileCaptchaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return contactInfo
     */
    public String getContactInfo() {
        return this.contactInfo;
    }

    /**
     * @return contactorId
     */
    public String getContactorId() {
        return this.contactorId;
    }

    public static final class Builder extends Request.Builder<SendAsyncMobileCaptchaRequest, Builder> {
        private String appName; 
        private String contactInfo; 
        private String contactorId; 

        private Builder() {
            super();
        } 

        private Builder(SendAsyncMobileCaptchaRequest request) {
            super(request);
            this.appName = request.appName;
            this.contactInfo = request.contactInfo;
            this.contactorId = request.contactorId;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * ContactInfo.
         */
        public Builder contactInfo(String contactInfo) {
            this.putBodyParameter("ContactInfo", contactInfo);
            this.contactInfo = contactInfo;
            return this;
        }

        /**
         * ContactorId.
         */
        public Builder contactorId(String contactorId) {
            this.putBodyParameter("ContactorId", contactorId);
            this.contactorId = contactorId;
            return this;
        }

        @Override
        public SendAsyncMobileCaptchaRequest build() {
            return new SendAsyncMobileCaptchaRequest(this);
        } 

    } 

}
