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
         * <p>The common business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERR.Robject.Auth.TenantAccessDenied</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of items on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;collaborationGroupId&quot;:&quot;cg_9401&quot;,&quot;name&quot;:&quot;Product Collaboration Space&quot;,&quot;status&quot;:&quot;ACTIVE&quot;,&quot;currentUserRole&quot;:&quot;OWNER&quot;}]</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The common error message.</p>
         * 
         * <strong>example:</strong>
         * <p>You do not have permissions to access tenant 2147483647 because the user does not belong to the tenant</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c9cf6cb3-3f5c-4994-a8a1-c93379a6f5cf</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of filtered records.</p>
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
             * <p>The ID of the collaboration space.</p>
             * 
             * <strong>example:</strong>
             * <p>cg_9401</p>
             */
            public Builder collaborationGroupId(String collaborationGroupId) {
                this.collaborationGroupId = collaborationGroupId;
                return this;
            }

            /**
             * <p>The role of the current user in the space.</p>
             * 
             * <strong>example:</strong>
             * <p>ADMIN</p>
             */
            public Builder currentUserRole(String currentUserRole) {
                this.currentUserRole = currentUserRole;
                return this;
            }

            /**
             * <p>The name of the space.</p>
             * 
             * <strong>example:</strong>
             * <p>Workflow To-Do Test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the space. Currently, only ACTIVE is returned.</p>
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
