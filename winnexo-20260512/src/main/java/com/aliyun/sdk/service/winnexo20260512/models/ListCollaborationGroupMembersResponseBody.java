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
 * {@link ListCollaborationGroupMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListCollaborationGroupMembersResponseBody</p>
 */
public class ListCollaborationGroupMembersResponseBody extends TeaModel {
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

    private ListCollaborationGroupMembersResponseBody(Builder builder) {
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

    public static ListCollaborationGroupMembersResponseBody create() {
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

        private Builder(ListCollaborationGroupMembersResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>公共业务状态码，由后端Code字段映射；错误时用于识别失败原因。</p>
         * 
         * <strong>example:</strong>
         * <p>ERR.Robject.Auth.TenantAccessDenied</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>当前页记录列表；没有匹配记录时返回空数组。</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;userId&quot;:&quot;5&quot;,&quot;displayName&quot;:&quot;张三&quot;,&quot;role&quot;:&quot;OWNER&quot;,&quot;isActive&quot;:true}]</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>公共错误说明，由后端Message字段映射；错误时描述失败原因。</p>
         * 
         * <strong>example:</strong>
         * <p>无权访问租户 2147483647，用户不属于该租户</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>当前返回页的页码，从1开始。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>当前分页设置的每页记录数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>请求追踪ID，由后端RequestId字段映射，用于排查调用失败。</p>
         * 
         * <strong>example:</strong>
         * <p>c9cf6cb3-3f5c-4994-a8a1-c93379a6f5cf</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>满足查询条件的记录总数，不是当前页记录数。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListCollaborationGroupMembersResponseBody build() {
            return new ListCollaborationGroupMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCollaborationGroupMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListCollaborationGroupMembersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("isActive")
        private Boolean isActive;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Items(Builder builder) {
            this.displayName = builder.displayName;
            this.isActive = builder.isActive;
            this.role = builder.role;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return isActive
         */
        public Boolean getIsActive() {
            return this.isActive;
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
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private Boolean isActive; 
            private String role; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.displayName = model.displayName;
                this.isActive = model.isActive;
                this.role = model.role;
                this.userId = model.userId;
            } 

            /**
             * <p>成员显示名称；未设置时为空。</p>
             * 
             * <strong>example:</strong>
             * <p>TEST001</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>租户账号是否启用。本接口只返回有效且账号启用的成员，值为true；不代表HR在职状态。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isActive(Boolean isActive) {
                this.isActive = isActive;
                return this;
            }

            /**
             * <p>成员在空间内的角色：ADMIN为管理员，MEMBER为普通成员。</p>
             * 
             * <strong>example:</strong>
             * <p>ADMIN</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>平台用户ID，字符串形式，可用作转交待办的目标用户ID。</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
