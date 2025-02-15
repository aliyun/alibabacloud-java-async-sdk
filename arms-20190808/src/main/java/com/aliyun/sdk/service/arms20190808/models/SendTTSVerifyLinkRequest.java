// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link SendTTSVerifyLinkRequest} extends {@link RequestModel}
 *
 * <p>SendTTSVerifyLinkRequest</p>
 */
public class SendTTSVerifyLinkRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Phone")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the alert contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder contactId(Long contactId) {
            this.putBodyParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>The mobile number of the alert contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
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
