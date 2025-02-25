// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutAlertContactRequest} extends {@link RequestModel}
 *
 * <p>PutAlertContactRequest</p>
 */
public class PutAlertContactRequest extends Request {
    @Body
    @NameInMap("Email")
    private String email;

    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("Phone")
    private String phone;

    @Body
    @NameInMap("Webhook")
    private String webhook;

    private PutAlertContactRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.id = builder.id;
        this.name = builder.name;
        this.operaUid = builder.operaUid;
        this.phone = builder.phone;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAlertContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return webhook
     */
    public String getWebhook() {
        return this.webhook;
    }

    public static final class Builder extends Request.Builder<PutAlertContactRequest, Builder> {
        private String email; 
        private Long id; 
        private String name; 
        private String operaUid; 
        private String phone; 
        private String webhook; 

        private Builder() {
            super();
        } 

        private Builder(PutAlertContactRequest request) {
            super(request);
            this.email = request.email;
            this.id = request.id;
            this.name = request.name;
            this.operaUid = request.operaUid;
            this.phone = request.phone;
            this.webhook = request.webhook;
        } 

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putBodyParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * Webhook.
         */
        public Builder webhook(String webhook) {
            this.putBodyParameter("Webhook", webhook);
            this.webhook = webhook;
            return this;
        }

        @Override
        public PutAlertContactRequest build() {
            return new PutAlertContactRequest(this);
        } 

    } 

}
