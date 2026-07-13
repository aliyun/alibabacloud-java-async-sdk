// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link UpdateAtiRegistrantRequest} extends {@link RequestModel}
 *
 * <p>UpdateAtiRegistrantRequest</p>
 */
public class UpdateAtiRegistrantRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cc")
    private String cc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentCode")
    private String documentCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentImage")
    private String documentImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentType")
    private String documentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantId")
    private String registrantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Street")
    private String street;

    private UpdateAtiRegistrantRequest(Builder builder) {
        super(builder);
        this.cc = builder.cc;
        this.city = builder.city;
        this.clientToken = builder.clientToken;
        this.documentCode = builder.documentCode;
        this.documentImage = builder.documentImage;
        this.documentType = builder.documentType;
        this.email = builder.email;
        this.name = builder.name;
        this.phone = builder.phone;
        this.registrantId = builder.registrantId;
        this.state = builder.state;
        this.street = builder.street;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAtiRegistrantRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cc
     */
    public String getCc() {
        return this.cc;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return documentCode
     */
    public String getDocumentCode() {
        return this.documentCode;
    }

    /**
     * @return documentImage
     */
    public String getDocumentImage() {
        return this.documentImage;
    }

    /**
     * @return documentType
     */
    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
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
     * @return registrantId
     */
    public String getRegistrantId() {
        return this.registrantId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return street
     */
    public String getStreet() {
        return this.street;
    }

    public static final class Builder extends Request.Builder<UpdateAtiRegistrantRequest, Builder> {
        private String cc; 
        private String city; 
        private String clientToken; 
        private String documentCode; 
        private String documentImage; 
        private String documentType; 
        private String email; 
        private String name; 
        private String phone; 
        private String registrantId; 
        private String state; 
        private String street; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAtiRegistrantRequest request) {
            super(request);
            this.cc = request.cc;
            this.city = request.city;
            this.clientToken = request.clientToken;
            this.documentCode = request.documentCode;
            this.documentImage = request.documentImage;
            this.documentType = request.documentType;
            this.email = request.email;
            this.name = request.name;
            this.phone = request.phone;
            this.registrantId = request.registrantId;
            this.state = request.state;
            this.street = request.street;
        } 

        /**
         * Cc.
         */
        public Builder cc(String cc) {
            this.putQueryParameter("Cc", cc);
            this.cc = cc;
            return this;
        }

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DocumentCode.
         */
        public Builder documentCode(String documentCode) {
            this.putQueryParameter("DocumentCode", documentCode);
            this.documentCode = documentCode;
            return this;
        }

        /**
         * DocumentImage.
         */
        public Builder documentImage(String documentImage) {
            this.putQueryParameter("DocumentImage", documentImage);
            this.documentImage = documentImage;
            return this;
        }

        /**
         * DocumentType.
         */
        public Builder documentType(String documentType) {
            this.putQueryParameter("DocumentType", documentType);
            this.documentType = documentType;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * RegistrantId.
         */
        public Builder registrantId(String registrantId) {
            this.putQueryParameter("RegistrantId", registrantId);
            this.registrantId = registrantId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * Street.
         */
        public Builder street(String street) {
            this.putQueryParameter("Street", street);
            this.street = street;
            return this;
        }

        @Override
        public UpdateAtiRegistrantRequest build() {
            return new UpdateAtiRegistrantRequest(this);
        } 

    } 

}
