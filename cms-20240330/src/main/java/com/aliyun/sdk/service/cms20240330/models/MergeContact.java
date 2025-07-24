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
 * {@link MergeContact} extends {@link TeaModel}
 *
 * <p>MergeContact</p>
 */
public class MergeContact extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("emailVerify")
    private Boolean emailVerify;

    @com.aliyun.core.annotation.NameInMap("extend")
    private java.util.Map<String, ?> extend;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("identifier")
    private String identifier;

    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("phoneCode")
    private String phoneCode;

    @com.aliyun.core.annotation.NameInMap("phoneVerify")
    private Boolean phoneVerify;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private MergeContact(Builder builder) {
        this.email = builder.email;
        this.emailVerify = builder.emailVerify;
        this.extend = builder.extend;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.identifier = builder.identifier;
        this.lang = builder.lang;
        this.name = builder.name;
        this.phone = builder.phone;
        this.phoneCode = builder.phoneCode;
        this.phoneVerify = builder.phoneVerify;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MergeContact create() {
        return builder().build();
    }

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
     * @return emailVerify
     */
    public Boolean getEmailVerify() {
        return this.emailVerify;
    }

    /**
     * @return extend
     */
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
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
     * @return phoneCode
     */
    public String getPhoneCode() {
        return this.phoneCode;
    }

    /**
     * @return phoneVerify
     */
    public Boolean getPhoneVerify() {
        return this.phoneVerify;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder {
        private String email; 
        private Boolean emailVerify; 
        private java.util.Map<String, ?> extend; 
        private String gmtCreate; 
        private String gmtModified; 
        private String identifier; 
        private String lang; 
        private String name; 
        private String phone; 
        private String phoneCode; 
        private Boolean phoneVerify; 
        private String source; 

        private Builder() {
        } 

        private Builder(MergeContact model) {
            this.email = model.email;
            this.emailVerify = model.emailVerify;
            this.extend = model.extend;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.identifier = model.identifier;
            this.lang = model.lang;
            this.name = model.name;
            this.phone = model.phone;
            this.phoneCode = model.phoneCode;
            this.phoneVerify = model.phoneVerify;
            this.source = model.source;
        } 

        /**
         * email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * emailVerify.
         */
        public Builder emailVerify(Boolean emailVerify) {
            this.emailVerify = emailVerify;
            return this;
        }

        /**
         * extend.
         */
        public Builder extend(java.util.Map<String, ?> extend) {
            this.extend = extend;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * identifier.
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * lang.
         */
        public Builder lang(String lang) {
            this.lang = lang;
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

        /**
         * phoneCode.
         */
        public Builder phoneCode(String phoneCode) {
            this.phoneCode = phoneCode;
            return this;
        }

        /**
         * phoneVerify.
         */
        public Builder phoneVerify(Boolean phoneVerify) {
            this.phoneVerify = phoneVerify;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public MergeContact build() {
            return new MergeContact(this);
        } 

    } 

}
