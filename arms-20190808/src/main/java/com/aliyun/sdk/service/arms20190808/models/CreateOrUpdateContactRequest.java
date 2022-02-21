// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateContactRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateContactRequest</p>
 */
public class CreateOrUpdateContactRequest extends Request {
    @Body
    @NameInMap("ContactId")
    private Long contactId;

    @Body
    @NameInMap("ContactName")
    @Validation(required = true)
    private String contactName;

    @Body
    @NameInMap("Email")
    private String email;

    @Body
    @NameInMap("Phone")
    private String phone;

    private CreateOrUpdateContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.contactName = builder.contactName;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateContactRequest create() {
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
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateContactRequest, Builder> {
        private Long contactId; 
        private String contactName; 
        private String email; 
        private String phone; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateContactRequest response) {
            super(response);
            this.contactId = response.contactId;
            this.contactName = response.contactName;
            this.email = response.email;
            this.phone = response.phone;
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
         * 告警联系人名称
         */
        public Builder contactName(String contactName) {
            this.putBodyParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * 告警联系人邮箱
         */
        public Builder email(String email) {
            this.putBodyParameter("Email", email);
            this.email = email;
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
        public CreateOrUpdateContactRequest build() {
            return new CreateOrUpdateContactRequest(this);
        } 

    } 

}
