// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePhoneWebhookRequest} extends {@link RequestModel}
 *
 * <p>UpdatePhoneWebhookRequest</p>
 */
public class UpdatePhoneWebhookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpFlag")
    private String httpFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueFlag")
    private String queueFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusCallbackUrl")
    private String statusCallbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpCallbackUrl")
    private String upCallbackUrl;

    private UpdatePhoneWebhookRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.httpFlag = builder.httpFlag;
        this.phoneNumber = builder.phoneNumber;
        this.queueFlag = builder.queueFlag;
        this.statusCallbackUrl = builder.statusCallbackUrl;
        this.upCallbackUrl = builder.upCallbackUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePhoneWebhookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return httpFlag
     */
    public String getHttpFlag() {
        return this.httpFlag;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return queueFlag
     */
    public String getQueueFlag() {
        return this.queueFlag;
    }

    /**
     * @return statusCallbackUrl
     */
    public String getStatusCallbackUrl() {
        return this.statusCallbackUrl;
    }

    /**
     * @return upCallbackUrl
     */
    public String getUpCallbackUrl() {
        return this.upCallbackUrl;
    }

    public static final class Builder extends Request.Builder<UpdatePhoneWebhookRequest, Builder> {
        private String custSpaceId; 
        private String httpFlag; 
        private String phoneNumber; 
        private String queueFlag; 
        private String statusCallbackUrl; 
        private String upCallbackUrl; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePhoneWebhookRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.httpFlag = request.httpFlag;
            this.phoneNumber = request.phoneNumber;
            this.queueFlag = request.queueFlag;
            this.statusCallbackUrl = request.statusCallbackUrl;
            this.upCallbackUrl = request.upCallbackUrl;
        } 

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * HttpFlag.
         */
        public Builder httpFlag(String httpFlag) {
            this.putQueryParameter("HttpFlag", httpFlag);
            this.httpFlag = httpFlag;
            return this;
        }

        /**
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * QueueFlag.
         */
        public Builder queueFlag(String queueFlag) {
            this.putQueryParameter("QueueFlag", queueFlag);
            this.queueFlag = queueFlag;
            return this;
        }

        /**
         * StatusCallbackUrl.
         */
        public Builder statusCallbackUrl(String statusCallbackUrl) {
            this.putQueryParameter("StatusCallbackUrl", statusCallbackUrl);
            this.statusCallbackUrl = statusCallbackUrl;
            return this;
        }

        /**
         * UpCallbackUrl.
         */
        public Builder upCallbackUrl(String upCallbackUrl) {
            this.putQueryParameter("UpCallbackUrl", upCallbackUrl);
            this.upCallbackUrl = upCallbackUrl;
            return this;
        }

        @Override
        public UpdatePhoneWebhookRequest build() {
            return new UpdatePhoneWebhookRequest(this);
        } 

    } 

}
