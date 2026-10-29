// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateContactRequest} extends {@link RequestModel}
 *
 * <p>CreateContactRequest</p>
 */
public class CreateContactRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contactId")
    private String contactId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imUserIds")
    private java.util.Map<String, String> imUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private CreateContactRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contactId = builder.contactId;
        this.email = builder.email;
        this.imUserIds = builder.imUserIds;
        this.lang = builder.lang;
        this.name = builder.name;
        this.phone = builder.phone;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return imUserIds
     */
    public java.util.Map<String, String> getImUserIds() {
        return this.imUserIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<CreateContactRequest, Builder> {
        private String regionId; 
        private String contactId; 
        private String email; 
        private java.util.Map<String, String> imUserIds; 
        private String lang; 
        private String name; 
        private String phone; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreateContactRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contactId = request.contactId;
            this.email = request.email;
            this.imUserIds = request.imUserIds;
            this.lang = request.lang;
            this.name = request.name;
            this.phone = request.phone;
            this.workspace = request.workspace;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * contactId.
         */
        public Builder contactId(String contactId) {
            this.putBodyParameter("contactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * email.
         */
        public Builder email(String email) {
            this.putBodyParameter("email", email);
            this.email = email;
            return this;
        }

        /**
         * imUserIds.
         */
        public Builder imUserIds(java.util.Map<String, String> imUserIds) {
            this.putBodyParameter("imUserIds", imUserIds);
            this.imUserIds = imUserIds;
            return this;
        }

        /**
         * lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
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
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putBodyParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public CreateContactRequest build() {
            return new CreateContactRequest(this);
        } 

    } 

}
