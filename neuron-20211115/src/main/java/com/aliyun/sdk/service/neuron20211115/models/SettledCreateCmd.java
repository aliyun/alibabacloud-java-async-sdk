// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link SettledCreateCmd} extends {@link TeaModel}
 *
 * <p>SettledCreateCmd</p>
 */
public class SettledCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("application")
    private String application;

    @com.aliyun.core.annotation.NameInMap("developerName")
    private String developerName;

    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("enterpriseName")
    private String enterpriseName;

    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("usage")
    private String usage;

    private SettledCreateCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.application = builder.application;
        this.developerName = builder.developerName;
        this.email = builder.email;
        this.enterpriseName = builder.enterpriseName;
        this.phone = builder.phone;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SettledCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return application
     */
    public String getApplication() {
        return this.application;
    }

    /**
     * @return developerName
     */
    public String getDeveloperName() {
        return this.developerName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return enterpriseName
     */
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private String accountId; 
        private String application; 
        private String developerName; 
        private String email; 
        private String enterpriseName; 
        private String phone; 
        private String usage; 

        private Builder() {
        } 

        private Builder(SettledCreateCmd model) {
            this.accountId = model.accountId;
            this.application = model.application;
            this.developerName = model.developerName;
            this.email = model.email;
            this.enterpriseName = model.enterpriseName;
            this.phone = model.phone;
            this.usage = model.usage;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * application.
         */
        public Builder application(String application) {
            this.application = application;
            return this;
        }

        /**
         * developerName.
         */
        public Builder developerName(String developerName) {
            this.developerName = developerName;
            return this;
        }

        /**
         * email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * enterpriseName.
         */
        public Builder enterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
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
         * usage.
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        public SettledCreateCmd build() {
            return new SettledCreateCmd(this);
        } 

    } 

}
