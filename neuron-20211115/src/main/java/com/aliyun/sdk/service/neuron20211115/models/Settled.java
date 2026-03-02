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
 * {@link Settled} extends {@link TeaModel}
 *
 * <p>Settled</p>
 */
public class Settled extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("usage")
    private String usage;

    private Settled(Builder builder) {
        this.accountId = builder.accountId;
        this.application = builder.application;
        this.developerName = builder.developerName;
        this.email = builder.email;
        this.enterpriseName = builder.enterpriseName;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.phone = builder.phone;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.type = builder.type;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Settled create() {
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
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
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
        private String gmtCreate; 
        private Long id; 
        private String phone; 
        private String requestId; 
        private String status; 
        private String type; 
        private String usage; 

        private Builder() {
        } 

        private Builder(Settled model) {
            this.accountId = model.accountId;
            this.application = model.application;
            this.developerName = model.developerName;
            this.email = model.email;
            this.enterpriseName = model.enterpriseName;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.phone = model.phone;
            this.requestId = model.requestId;
            this.status = model.status;
            this.type = model.type;
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
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        public Settled build() {
            return new Settled(this);
        } 

    } 

}
