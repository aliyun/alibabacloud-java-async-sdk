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
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:zhangsan@company.com">zhangsan@company.com</a></p>
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * <p>Specifies whether the email address is authenticated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder emailVerify(Boolean emailVerify) {
            this.emailVerify = emailVerify;
            return this;
        }

        /**
         * <p>An extension field used to store additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;department&quot;: &quot;运维部&quot;, &quot;role&quot;: &quot;工程师&quot; }</p>
         */
        public Builder extend(java.util.Map<String, ?> extend) {
            this.extend = extend;
            return this;
        }

        /**
         * <p>The time when the contact was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58.789Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The time when the contact was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58.789Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The unique identifier of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>user-12345</p>
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The language preference.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder lang(String lang) {
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>13800138000</p>
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * <p>The country code for the mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder phoneCode(String phoneCode) {
            this.phoneCode = phoneCode;
            return this;
        }

        /**
         * <p>Specifies whether the mobile phone number is authenticated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder phoneVerify(Boolean phoneVerify) {
            this.phoneVerify = phoneVerify;
            return this;
        }

        /**
         * <p>The source system of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
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
