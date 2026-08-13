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
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListUsersResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
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
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListUsersResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
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
         * <p>成员列表</p>
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
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>每页数量</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * <p>符合条件的总记录数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("isActive")
        private Boolean isActive;

        @com.aliyun.core.annotation.NameInMap("lastLoginTime")
        private String lastLoginTime;

        @com.aliyun.core.annotation.NameInMap("roleCodes")
        private java.util.List<String> roleCodes;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        private Items(Builder builder) {
            this.accountId = builder.accountId;
            this.displayName = builder.displayName;
            this.gmtCreate = builder.gmtCreate;
            this.isActive = builder.isActive;
            this.lastLoginTime = builder.lastLoginTime;
            this.roleCodes = builder.roleCodes;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
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
         * @return roleCodes
         */
        public java.util.List<String> getRoleCodes() {
            return this.roleCodes;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String accountId; 
            private String displayName; 
            private String gmtCreate; 
            private Boolean isActive; 
            private String lastLoginTime; 
            private java.util.List<String> roleCodes; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.accountId = model.accountId;
                this.displayName = model.displayName;
                this.gmtCreate = model.gmtCreate;
                this.isActive = model.isActive;
                this.lastLoginTime = model.lastLoginTime;
                this.roleCodes = model.roleCodes;
                this.userId = model.userId;
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
             * <p>用户ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
