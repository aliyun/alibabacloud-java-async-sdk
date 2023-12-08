// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alicloudproc20240104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Contact} extends {@link TeaModel}
 *
 * <p>Contact</p>
 */
public class Contact extends TeaModel {
    @NameInMap("email")
    private String email;

    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("phone")
    @Validation(required = true)
    private String phone;

    private Contact(Builder builder) {
        this.email = builder.email;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Contact create() {
        return builder().build();
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

    public static final class Builder {
        private String email; 
        private String name; 
        private String phone; 

        /**
         * email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        } 

    } 

}
