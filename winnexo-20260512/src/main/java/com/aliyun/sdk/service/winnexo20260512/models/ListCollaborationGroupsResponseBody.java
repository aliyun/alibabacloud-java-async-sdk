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
 * {@link ListCollaborationGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCollaborationGroupsResponseBody</p>
 */
public class ListCollaborationGroupsResponseBody extends TeaModel {
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

    private ListCollaborationGroupsResponseBody(Builder builder) {
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

    public static ListCollaborationGroupsResponseBody create() {
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

        private Builder(ListCollaborationGroupsResponseBody model) {
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
         * <p>[{&quot;collaborationGroupId&quot;:&quot;cg_9401&quot;,&quot;name&quot;:&quot;产品协作空间&quot;,&quot;status&quot;:&quot;ACTIVE&quot;,&quot;currentUserRole&quot;:&quot;OWNER&quot;}]</p>
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
         * <p>满足查询条件的有效空间总数，不是当前页记录数。</p>
         * 
         * <strong>example:</strong>
         * <p>39</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListCollaborationGroupsResponseBody build() {
            return new ListCollaborationGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCollaborationGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCollaborationGroupsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
        private String collaborationGroupId;

        @com.aliyun.core.annotation.NameInMap("currentUserRole")
        private String currentUserRole;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Items(Builder builder) {
            this.collaborationGroupId = builder.collaborationGroupId;
            this.currentUserRole = builder.currentUserRole;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return collaborationGroupId
         */
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        /**
         * @return currentUserRole
         */
        public String getCurrentUserRole() {
            return this.currentUserRole;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String collaborationGroupId; 
            private String currentUserRole; 
            private String name; 
            private String status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.collaborationGroupId = model.collaborationGroupId;
                this.currentUserRole = model.currentUserRole;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * <p>协作空间ID，可用于查询空间成员、查询节点详情及预览对话文件。</p>
             * 
             * <strong>example:</strong>
             * <p>cg_9401</p>
             */
            public Builder collaborationGroupId(String collaborationGroupId) {
                this.collaborationGroupId = collaborationGroupId;
                return this;
            }

            /**
             * <p>当前调用用户在空间内的角色：ADMIN为管理员，MEMBER为普通成员。</p>
             * 
             * <strong>example:</strong>
             * <p>ADMIN</p>
             */
            public Builder currentUserRole(String currentUserRole) {
                this.currentUserRole = currentUserRole;
                return this;
            }

            /**
             * <p>协作空间显示名称。</p>
             * 
             * <strong>example:</strong>
             * <p>工作流待办测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>协作空间状态，当前接口只返回ACTIVE。</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
