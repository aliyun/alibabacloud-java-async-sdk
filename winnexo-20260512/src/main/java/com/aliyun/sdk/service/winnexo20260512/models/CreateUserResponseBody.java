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
 * {@link CreateUserResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserResponseBody</p>
 */
public class CreateUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("isNewUser")
    private Boolean isNewUser;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("wnUserId")
    private String wnUserId;

    private CreateUserResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.code = builder.code;
        this.displayName = builder.displayName;
        this.isNewUser = builder.isNewUser;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.wnUserId = builder.wnUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserResponseBody create() {
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
     * @return isNewUser
     */
    public Boolean getIsNewUser() {
        return this.isNewUser;
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
     * @return wnUserId
     */
    public String getWnUserId() {
        return this.wnUserId;
    }

    public static final class Builder {
        private String accountId; 
        private String code; 
        private String displayName; 
        private Boolean isNewUser; 
        private String message; 
        private String requestId; 
        private String wnUserId; 

        private Builder() {
        } 

        private Builder(CreateUserResponseBody model) {
            this.accountId = model.accountId;
            this.code = model.code;
            this.displayName = model.displayName;
            this.isNewUser = model.isNewUser;
            this.message = model.message;
            this.requestId = model.requestId;
            this.wnUserId = model.wnUserId;
        } 

        /**
         * <p>登录账号唯一标识</p>
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
         * <p>是否为新创建的用户（false 表示已有用户加入租户）</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isNewUser(Boolean isNewUser) {
            this.isNewUser = isNewUser;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
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
         * <p>WINNEXO 平台用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder wnUserId(String wnUserId) {
            this.wnUserId = wnUserId;
            return this;
        }

        public CreateUserResponseBody build() {
            return new CreateUserResponseBody(this);
        } 

    } 

}
