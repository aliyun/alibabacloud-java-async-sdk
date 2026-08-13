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
 * {@link ListRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRolesResponseBody</p>
 */
public class ListRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListRolesResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRolesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRolesResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
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
         * <p>系统内置角色列表（固定 7 个）</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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

        public ListRolesResponseBody build() {
            return new ListRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("roleCode")
        private String roleCode;

        @com.aliyun.core.annotation.NameInMap("roleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("toggleable")
        private Boolean toggleable;

        private Items(Builder builder) {
            this.description = builder.description;
            this.roleCode = builder.roleCode;
            this.roleName = builder.roleName;
            this.toggleable = builder.toggleable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        /**
         * @return toggleable
         */
        public Boolean getToggleable() {
            return this.toggleable;
        }

        public static final class Builder {
            private String description; 
            private String roleCode; 
            private String roleName; 
            private Boolean toggleable; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.description = model.description;
                this.roleCode = model.roleCode;
                this.roleName = model.roleName;
                this.toggleable = model.toggleable;
            } 

            /**
             * <p>角色说明（按请求 Accept-Language 国际化）</p>
             * 
             * <strong>example:</strong>
             * <p>示例描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>角色标识码，用于 createUser/updateUser 的 roleCodes 参数</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder roleCode(String roleCode) {
                this.roleCode = roleCode;
                return this;
            }

            /**
             * <p>角色显示名称（按请求 Accept-Language 国际化）</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>是否允许启用/停用操作（超级管理员和应用用户不可切换）</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder toggleable(Boolean toggleable) {
                this.toggleable = toggleable;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
