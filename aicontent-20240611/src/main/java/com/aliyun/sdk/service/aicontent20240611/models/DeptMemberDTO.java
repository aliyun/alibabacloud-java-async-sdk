// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link DeptMemberDTO} extends {@link TeaModel}
 *
 * <p>DeptMemberDTO</p>
 */
public class DeptMemberDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowedModels")
    private String allowedModels;

    @com.aliyun.core.annotation.NameInMap("authConfig")
    private String authConfig;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("keyCount")
    private Integer keyCount;

    @com.aliyun.core.annotation.NameInMap("loginName")
    private String loginName;

    @com.aliyun.core.annotation.NameInMap("monthlyBalance")
    private Double monthlyBalance;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("permanentBalance")
    private Double permanentBalance;

    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("roleCode")
    private String roleCode;

    @com.aliyun.core.annotation.NameInMap("roleName")
    private String roleName;

    private DeptMemberDTO(Builder builder) {
        this.allowedModels = builder.allowedModels;
        this.authConfig = builder.authConfig;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.keyCount = builder.keyCount;
        this.loginName = builder.loginName;
        this.monthlyBalance = builder.monthlyBalance;
        this.name = builder.name;
        this.permanentBalance = builder.permanentBalance;
        this.phone = builder.phone;
        this.roleCode = builder.roleCode;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeptMemberDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedModels
     */
    public String getAllowedModels() {
        return this.allowedModels;
    }

    /**
     * @return authConfig
     */
    public String getAuthConfig() {
        return this.authConfig;
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
     * @return keyCount
     */
    public Integer getKeyCount() {
        return this.keyCount;
    }

    /**
     * @return loginName
     */
    public String getLoginName() {
        return this.loginName;
    }

    /**
     * @return monthlyBalance
     */
    public Double getMonthlyBalance() {
        return this.monthlyBalance;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return permanentBalance
     */
    public Double getPermanentBalance() {
        return this.permanentBalance;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return roleCode
     */
    public String getRoleCode() {
        return this.roleCode;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder {
        private String allowedModels; 
        private String authConfig; 
        private String gmtCreate; 
        private Long id; 
        private Integer keyCount; 
        private String loginName; 
        private Double monthlyBalance; 
        private String name; 
        private Double permanentBalance; 
        private String phone; 
        private String roleCode; 
        private String roleName; 

        private Builder() {
        } 

        private Builder(DeptMemberDTO model) {
            this.allowedModels = model.allowedModels;
            this.authConfig = model.authConfig;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.keyCount = model.keyCount;
            this.loginName = model.loginName;
            this.monthlyBalance = model.monthlyBalance;
            this.name = model.name;
            this.permanentBalance = model.permanentBalance;
            this.phone = model.phone;
            this.roleCode = model.roleCode;
            this.roleName = model.roleName;
        } 

        /**
         * <p>The comma-separated list of authorized model IDs. This field is valid only when include_authorization is specified. An empty value indicates that the models are inherited or all models are authorized.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        public Builder allowedModels(String allowedModels) {
            this.allowedModels = allowedModels;
            return this;
        }

        /**
         * <p>The authorization configuration. Valid values: inherit: Inherited from the department. custom: Customized. This field is valid only when include_authorization is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>inherit</p>
         */
        public Builder authConfig(String authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The member user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The number of active keys that belong to the member. This field is valid only when include_authorization is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder keyCount(Integer keyCount) {
            this.keyCount = keyCount;
            return this;
        }

        /**
         * <p>The logon name.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        public Builder loginName(String loginName) {
            this.loginName = loginName;
            return this;
        }

        /**
         * <p>The monthly balance. This field is valid only when include_balance is specified. The value is 0 if the feature is not activated.</p>
         * 
         * <strong>example:</strong>
         * <p>10.00</p>
         */
        public Builder monthlyBalance(Double monthlyBalance) {
            this.monthlyBalance = monthlyBalance;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The permanent balance. This field is valid only when include_balance is specified. The value is 0 if the feature is not activated.</p>
         * 
         * <strong>example:</strong>
         * <p>20.00</p>
         */
        public Builder permanentBalance(Double permanentBalance) {
            this.permanentBalance = permanentBalance;
            return this;
        }

        /**
         * <p>The mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>138****0000</p>
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * <p>The role code.</p>
         * 
         * <strong>example:</strong>
         * <p>member</p>
         */
        public Builder roleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>Member</p>
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public DeptMemberDTO build() {
            return new DeptMemberDTO(this);
        } 

    } 

}
