// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserInfoResponseBody</p>
 */
public class GetUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("crmType")
    private String crmType;

    @com.aliyun.core.annotation.NameInMap("isAdmin")
    private Boolean isAdmin;

    @com.aliyun.core.annotation.NameInMap("isSystemTenant")
    private Boolean isSystemTenant;

    @com.aliyun.core.annotation.NameInMap("languagePreference")
    private String languagePreference;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("offering")
    private String offering;

    @com.aliyun.core.annotation.NameInMap("parsedOffering")
    private String parsedOffering;

    @com.aliyun.core.annotation.NameInMap("profileRole")
    private String profileRole;

    @com.aliyun.core.annotation.NameInMap("profileRoleInfo")
    private String profileRoleInfo;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("selfIntroduction")
    private String selfIntroduction;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private Long tenantId;

    @com.aliyun.core.annotation.NameInMap("tenantList")
    private java.util.List<TenantList> tenantList;

    @com.aliyun.core.annotation.NameInMap("tenantName")
    private String tenantName;

    @com.aliyun.core.annotation.NameInMap("tenantType")
    private String tenantType;

    @com.aliyun.core.annotation.NameInMap("userCode")
    private String userCode;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    private GetUserInfoResponseBody(Builder builder) {
        this.avatar = builder.avatar;
        this.code = builder.code;
        this.crmType = builder.crmType;
        this.isAdmin = builder.isAdmin;
        this.isSystemTenant = builder.isSystemTenant;
        this.languagePreference = builder.languagePreference;
        this.message = builder.message;
        this.name = builder.name;
        this.offering = builder.offering;
        this.parsedOffering = builder.parsedOffering;
        this.profileRole = builder.profileRole;
        this.profileRoleInfo = builder.profileRoleInfo;
        this.requestId = builder.requestId;
        this.selfIntroduction = builder.selfIntroduction;
        this.tenantId = builder.tenantId;
        this.tenantList = builder.tenantList;
        this.tenantName = builder.tenantName;
        this.tenantType = builder.tenantType;
        this.userCode = builder.userCode;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return crmType
     */
    public String getCrmType() {
        return this.crmType;
    }

    /**
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    /**
     * @return isSystemTenant
     */
    public Boolean getIsSystemTenant() {
        return this.isSystemTenant;
    }

    /**
     * @return languagePreference
     */
    public String getLanguagePreference() {
        return this.languagePreference;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return offering
     */
    public String getOffering() {
        return this.offering;
    }

    /**
     * @return parsedOffering
     */
    public String getParsedOffering() {
        return this.parsedOffering;
    }

    /**
     * @return profileRole
     */
    public String getProfileRole() {
        return this.profileRole;
    }

    /**
     * @return profileRoleInfo
     */
    public String getProfileRoleInfo() {
        return this.profileRoleInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return selfIntroduction
     */
    public String getSelfIntroduction() {
        return this.selfIntroduction;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return tenantList
     */
    public java.util.List<TenantList> getTenantList() {
        return this.tenantList;
    }

    /**
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    /**
     * @return tenantType
     */
    public String getTenantType() {
        return this.tenantType;
    }

    /**
     * @return userCode
     */
    public String getUserCode() {
        return this.userCode;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String avatar; 
        private String code; 
        private String crmType; 
        private Boolean isAdmin; 
        private Boolean isSystemTenant; 
        private String languagePreference; 
        private String message; 
        private String name; 
        private String offering; 
        private String parsedOffering; 
        private String profileRole; 
        private String profileRoleInfo; 
        private String requestId; 
        private String selfIntroduction; 
        private Long tenantId; 
        private java.util.List<TenantList> tenantList; 
        private String tenantName; 
        private String tenantType; 
        private String userCode; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(GetUserInfoResponseBody model) {
            this.avatar = model.avatar;
            this.code = model.code;
            this.crmType = model.crmType;
            this.isAdmin = model.isAdmin;
            this.isSystemTenant = model.isSystemTenant;
            this.languagePreference = model.languagePreference;
            this.message = model.message;
            this.name = model.name;
            this.offering = model.offering;
            this.parsedOffering = model.parsedOffering;
            this.profileRole = model.profileRole;
            this.profileRoleInfo = model.profileRoleInfo;
            this.requestId = model.requestId;
            this.selfIntroduction = model.selfIntroduction;
            this.tenantId = model.tenantId;
            this.tenantList = model.tenantList;
            this.tenantName = model.tenantName;
            this.tenantType = model.tenantType;
            this.userCode = model.userCode;
            this.userId = model.userId;
        } 

        /**
         * <p>用户头像URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/avatar.png">https://example.com/avatar.png</a></p>
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>CRM 类型</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder crmType(String crmType) {
            this.crmType = crmType;
            return this;
        }

        /**
         * <p>是否为超级管理员</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        /**
         * <p>当前登录租户是否为系统租户（tenantId=10000）</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSystemTenant(Boolean isSystemTenant) {
            this.isSystemTenant = isSystemTenant;
            return this;
        }

        /**
         * <p>用户语言偏好</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder languagePreference(String languagePreference) {
            this.languagePreference = languagePreference;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>用户服务描述</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder offering(String offering) {
            this.offering = offering;
            return this;
        }

        /**
         * <p>用户服务解析结果（JSON格式）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder parsedOffering(String parsedOffering) {
            this.parsedOffering = parsedOffering;
            return this;
        }

        /**
         * <p>用户角色</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder profileRole(String profileRole) {
            this.profileRole = profileRole;
            return this;
        }

        /**
         * <p>用户角色描述（当profileRole为Others时使用）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder profileRoleInfo(String profileRoleInfo) {
            this.profileRoleInfo = profileRoleInfo;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>用户自我介绍</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder selfIntroduction(String selfIntroduction) {
            this.selfIntroduction = selfIntroduction;
            return this;
        }

        /**
         * <p>当前租户ID</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * tenantList.
         */
        public Builder tenantList(java.util.List<TenantList> tenantList) {
            this.tenantList = tenantList;
            return this;
        }

        /**
         * <p>当前租户名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }

        /**
         * <p>租户类型</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder tenantType(String tenantType) {
            this.tenantType = tenantType;
            return this;
        }

        /**
         * <p>用户代码</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder userCode(String userCode) {
            this.userCode = userCode;
            return this;
        }

        /**
         * <p>用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public GetUserInfoResponseBody build() {
            return new GetUserInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserInfoResponseBody</p>
     */
    public static class TenantList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("crmType")
        private String crmType;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("tenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("tenantType")
        private String tenantType;

        private TenantList(Builder builder) {
            this.crmType = builder.crmType;
            this.tenantId = builder.tenantId;
            this.tenantName = builder.tenantName;
            this.tenantType = builder.tenantType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantList create() {
            return builder().build();
        }

        /**
         * @return crmType
         */
        public String getCrmType() {
            return this.crmType;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return tenantType
         */
        public String getTenantType() {
            return this.tenantType;
        }

        public static final class Builder {
            private String crmType; 
            private Long tenantId; 
            private String tenantName; 
            private String tenantType; 

            private Builder() {
            } 

            private Builder(TenantList model) {
                this.crmType = model.crmType;
                this.tenantId = model.tenantId;
                this.tenantName = model.tenantName;
                this.tenantType = model.tenantType;
            } 

            /**
             * <p>CRM 类型</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder crmType(String crmType) {
                this.crmType = crmType;
                return this;
            }

            /**
             * <p>租户ID</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>租户名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>租户类型</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder tenantType(String tenantType) {
                this.tenantType = tenantType;
                return this;
            }

            public TenantList build() {
                return new TenantList(this);
            } 

        } 

    }
}
