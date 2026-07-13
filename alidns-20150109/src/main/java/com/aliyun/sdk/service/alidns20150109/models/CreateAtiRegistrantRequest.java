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
 * {@link CreateAtiRegistrantRequest} extends {@link RequestModel}
 *
 * <p>CreateAtiRegistrantRequest</p>
 */
public class CreateAtiRegistrantRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cc")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    @com.aliyun.core.annotation.Validation(required = true)
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentImage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    @com.aliyun.core.annotation.Validation(required = true)
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Street")
    private String street;

    private CreateAtiRegistrantRequest(Builder builder) {
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
        this.state = builder.state;
        this.street = builder.street;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAtiRegistrantRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAtiRegistrantRequest, Builder> {
        private String cc; 
        private String city; 
        private String clientToken; 
        private String documentCode; 
        private String documentImage; 
        private String documentType; 
        private String email; 
        private String name; 
        private String phone; 
        private String state; 
        private String street; 

        private Builder() {
            super();
        } 

        private Builder(CreateAtiRegistrantRequest request) {
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
            this.state = request.state;
            this.street = request.street;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder cc(String cc) {
            this.putQueryParameter("Cc", cc);
            this.cc = cc;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>110123456789122341</p>
         */
        public Builder documentCode(String documentCode) {
            this.putQueryParameter("DocumentCode", documentCode);
            this.documentCode = documentCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder documentImage(String documentImage) {
            this.putQueryParameter("DocumentImage", documentImage);
            this.documentImage = documentImage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SFZ</p>
         */
        public Builder documentType(String documentType) {
            this.putQueryParameter("DocumentType", documentType);
            this.documentType = documentType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:example@example.com">example@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13112345678</p>
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
        public CreateAtiRegistrantRequest build() {
            return new CreateAtiRegistrantRequest(this);
        } 

    } 

}
