// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link UpdateContactRequest} extends {@link RequestModel}
 *
 * <p>UpdateContactRequest</p>
 */
public class UpdateContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Idcard")
    private String idcard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Webhooks")
    private String webhooks;

    private UpdateContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.email = builder.email;
        this.idcard = builder.idcard;
        this.mobile = builder.mobile;
        this.name = builder.name;
        this.webhooks = builder.webhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContactRequest create() {
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
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return idcard
     */
    public String getIdcard() {
        return this.idcard;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return webhooks
     */
    public String getWebhooks() {
        return this.webhooks;
    }

    public static final class Builder extends Request.Builder<UpdateContactRequest, Builder> {
        private Long contactId; 
        private String email; 
        private String idcard; 
        private String mobile; 
        private String name; 
        private String webhooks; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContactRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.email = request.email;
            this.idcard = request.idcard;
            this.mobile = request.mobile;
            this.name = request.name;
            this.webhooks = request.webhooks;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1397591</p>
         */
        public Builder contactId(Long contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Idcard.
         */
        public Builder idcard(String idcard) {
            this.putQueryParameter("Idcard", idcard);
            this.idcard = idcard;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Webhooks.
         */
        public Builder webhooks(String webhooks) {
            this.putQueryParameter("Webhooks", webhooks);
            this.webhooks = webhooks;
            return this;
        }

        @Override
        public UpdateContactRequest build() {
            return new UpdateContactRequest(this);
        } 

    } 

}
