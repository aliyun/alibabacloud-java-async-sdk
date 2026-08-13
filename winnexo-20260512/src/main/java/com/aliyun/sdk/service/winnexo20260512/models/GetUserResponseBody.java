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
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("isActive")
    private Boolean isActive;

    @com.aliyun.core.annotation.NameInMap("lastLoginTime")
    private String lastLoginTime;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("roleCodes")
    private java.util.List<String> roleCodes;

    @com.aliyun.core.annotation.NameInMap("userGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.NameInMap("wnUserId")
    private String wnUserId;

    private GetUserResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.code = builder.code;
        this.displayName = builder.displayName;
        this.gmtCreate = builder.gmtCreate;
        this.isActive = builder.isActive;
        this.lastLoginTime = builder.lastLoginTime;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.roleCodes = builder.roleCodes;
        this.userGroupIds = builder.userGroupIds;
        this.wnUserId = builder.wnUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return isActive
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * @return lastLoginTime
     */
    public String getLastLoginTime() {
        return this.lastLoginTime;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleCodes
     */
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return wnUserId
     */
    public String getWnUserId() {
        return this.wnUserId;
    }

    public static final class Builder {
        private String accountId; 
        private String code; 
        private String displayName; 
        private String gmtCreate; 
        private Boolean isActive; 
        private String lastLoginTime; 
        private String message; 
        private String requestId; 
        private java.util.List<String> roleCodes; 
        private java.util.List<String> userGroupIds; 
        private String wnUserId; 

        private Builder() {
        } 

        private Builder(GetUserResponseBody model) {
            this.accountId = model.accountId;
            this.code = model.code;
            this.displayName = model.displayName;
            this.gmtCreate = model.gmtCreate;
            this.isActive = model.isActive;
            this.lastLoginTime = model.lastLoginTime;
            this.message = model.message;
            this.requestId = model.requestId;
            this.roleCodes = model.roleCodes;
            this.userGroupIds = model.userGroupIds;
            this.wnUserId = model.wnUserId;
        } 

        /**
         * <p>WINNEXO 登录账号</p>
         * 
         * <strong>example:</strong>
         * <p>exampleAccountId</p>
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
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
         * <p>用户显示名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>加入租户时间</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>启用/停用状态</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        /**
         * <p>最后登录时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        public Builder lastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
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
         * <p>用户拥有的系统角色 code 列表</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder roleCodes(java.util.List<String> roleCodes) {
            this.roleCodes = roleCodes;
            return this;
        }

        /**
         * <p>用户所属用户组ID列表</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>WINNEXO 平台用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder wnUserId(String wnUserId) {
            this.wnUserId = wnUserId;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

}
