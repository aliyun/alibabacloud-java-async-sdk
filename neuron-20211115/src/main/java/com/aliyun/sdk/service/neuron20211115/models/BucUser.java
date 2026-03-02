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
 * {@link BucUser} extends {@link TeaModel}
 *
 * <p>BucUser</p>
 */
public class BucUser extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("account")
    private String account;

    @com.aliyun.core.annotation.NameInMap("empId")
    private String empId;

    @com.aliyun.core.annotation.NameInMap("empType")
    private String empType;

    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("nickName")
    private String nickName;

    @com.aliyun.core.annotation.NameInMap("personalPhotoUrl")
    private String personalPhotoUrl;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private BucUser(Builder builder) {
        this.account = builder.account;
        this.empId = builder.empId;
        this.empType = builder.empType;
        this.enterpriseId = builder.enterpriseId;
        this.name = builder.name;
        this.nickName = builder.nickName;
        this.personalPhotoUrl = builder.personalPhotoUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BucUser create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return empId
     */
    public String getEmpId() {
        return this.empId;
    }

    /**
     * @return empType
     */
    public String getEmpType() {
        return this.empType;
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
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return personalPhotoUrl
     */
    public String getPersonalPhotoUrl() {
        return this.personalPhotoUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String account; 
        private String empId; 
        private String empType; 
        private Long enterpriseId; 
        private String name; 
        private String nickName; 
        private String personalPhotoUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BucUser model) {
            this.account = model.account;
            this.empId = model.empId;
            this.empType = model.empType;
            this.enterpriseId = model.enterpriseId;
            this.name = model.name;
            this.nickName = model.nickName;
            this.personalPhotoUrl = model.personalPhotoUrl;
            this.requestId = model.requestId;
        } 

        /**
         * account.
         */
        public Builder account(String account) {
            this.account = account;
            return this;
        }

        /**
         * empId.
         */
        public Builder empId(String empId) {
            this.empId = empId;
            return this;
        }

        /**
         * empType.
         */
        public Builder empType(String empType) {
            this.empType = empType;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * nickName.
         */
        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        /**
         * personalPhotoUrl.
         */
        public Builder personalPhotoUrl(String personalPhotoUrl) {
            this.personalPhotoUrl = personalPhotoUrl;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BucUser build() {
            return new BucUser(this);
        } 

    } 

}
