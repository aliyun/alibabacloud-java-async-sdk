// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SimpleUser} extends {@link TeaModel}
 *
 * <p>SimpleUser</p>
 */
public class SimpleUser extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    private String accountNo;

    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private SimpleUser(Builder builder) {
        this.accountNo = builder.accountNo;
        this.accountType = builder.accountType;
        this.role = builder.role;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimpleUser create() {
        return builder().build();
    }

    /**
     * @return accountNo
     */
    public String getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private String accountNo; 
        private String accountType; 
        private String role; 
        private Long userId; 
        private String userName; 

        /**
         * AccountNo.
         */
        public Builder accountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public SimpleUser build() {
            return new SimpleUser(this);
        } 

    } 

}
