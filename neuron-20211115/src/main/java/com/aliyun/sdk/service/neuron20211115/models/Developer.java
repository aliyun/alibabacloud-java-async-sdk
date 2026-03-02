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
 * {@link Developer} extends {@link TeaModel}
 *
 * <p>Developer</p>
 */
public class Developer extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("codeupAccountId")
    private String codeupAccountId;

    @com.aliyun.core.annotation.NameInMap("email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("phone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phone;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private Developer(Builder builder) {
        this.accountId = builder.accountId;
        this.codeupAccountId = builder.codeupAccountId;
        this.email = builder.email;
        this.enterpriseId = builder.enterpriseId;
        this.name = builder.name;
        this.phone = builder.phone;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Developer create() {
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
     * @return codeupAccountId
     */
    public String getCodeupAccountId() {
        return this.codeupAccountId;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accountId; 
        private String codeupAccountId; 
        private String email; 
        private Long enterpriseId; 
        private String name; 
        private String phone; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(Developer model) {
            this.accountId = model.accountId;
            this.codeupAccountId = model.codeupAccountId;
            this.email = model.email;
            this.enterpriseId = model.enterpriseId;
            this.name = model.name;
            this.phone = model.phone;
            this.requestId = model.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>121321412341</p>
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * codeupAccountId.
         */
        public Builder codeupAccountId(String codeupAccountId) {
            this.codeupAccountId = codeupAccountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@alibaba.com">xxx@alibaba.com</a></p>
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>尚仁</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15113456789</p>
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

        public Developer build() {
            return new Developer(this);
        } 

    } 

}
