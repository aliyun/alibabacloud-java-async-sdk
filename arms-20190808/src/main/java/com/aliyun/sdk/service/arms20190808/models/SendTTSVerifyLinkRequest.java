// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendTTSVerifyLinkRequest} extends {@link RequestModel}
 *
 * <p>SendTTSVerifyLinkRequest</p>
 */
public class SendTTSVerifyLinkRequest extends Request {
    @Body
    @NameInMap("ContactId")
    @Validation(required = true)
    private Long contactId;

    @Body
    @NameInMap("Phone")
    @Validation(required = true)
    private String phone;

    private SendTTSVerifyLinkRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.phone = builder.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendTTSVerifyLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    public static final class Builder extends Request.Builder<SendTTSVerifyLinkRequest, Builder> {
        private Long contactId; 
        private String phone; 

        private Builder() {
            super();
        } 

        private Builder(SendTTSVerifyLinkRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.phone = request.phone;
        } 

        /**
         * 告警联系人ID
         */
        public Builder contactId(Long contactId) {
            this.putBodyParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * 告警联系人手机号码
         */
        public Builder phone(String phone) {
            this.putBodyParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        @Override
        public SendTTSVerifyLinkRequest build() {
            return new SendTTSVerifyLinkRequest(this);
        } 

    } 

}
