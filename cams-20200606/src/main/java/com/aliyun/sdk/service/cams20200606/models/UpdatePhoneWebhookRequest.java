// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePhoneWebhookRequest} extends {@link RequestModel}
 *
 * <p>UpdatePhoneWebhookRequest</p>
 */
public class UpdatePhoneWebhookRequest extends Request {
    @Query
    @NameInMap("CustSpaceId")
    @Validation(required = true)
    private String custSpaceId;

    @Query
    @NameInMap("HttpFlag")
    private String httpFlag;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    @Query
    @NameInMap("QueueFlag")
    private String queueFlag;

    @Query
    @NameInMap("StatusCallbackUrl")
    private String statusCallbackUrl;

    @Query
    @NameInMap("UpCallbackUrl")
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
         * ISV子客户的SpaceId
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * 是否使用Http方式接收回执（Y: 是， N: 否）
         */
        public Builder httpFlag(String httpFlag) {
            this.putQueryParameter("HttpFlag", httpFlag);
            this.httpFlag = httpFlag;
            return this;
        }

        /**
         * 号码
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * 是否使用队列方式接收回执（Y: 是， N: 否）
         */
        public Builder queueFlag(String queueFlag) {
            this.putQueryParameter("QueueFlag", queueFlag);
            this.queueFlag = queueFlag;
            return this;
        }

        /**
         * http方式状态报告接口回调地址
         */
        public Builder statusCallbackUrl(String statusCallbackUrl) {
            this.putQueryParameter("StatusCallbackUrl", statusCallbackUrl);
            this.statusCallbackUrl = statusCallbackUrl;
            return this;
        }

        /**
         * http方式上行消息接口回调地址
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
