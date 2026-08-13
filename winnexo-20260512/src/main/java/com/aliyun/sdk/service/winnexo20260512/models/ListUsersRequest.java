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
 * {@link ListUsersRequest} extends {@link RequestModel}
 *
 * <p>ListUsersRequest</p>
 */
public class ListUsersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("accountIds")
    private java.util.List<String> accountIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isActive")
    private Boolean isActive;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleCodes")
    private java.util.List<String> roleCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListUsersRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.isActive = builder.isActive;
        this.keyword = builder.keyword;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.roleCodes = builder.roleCodes;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return isActive
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return roleCodes
     */
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListUsersRequest, Builder> {
        private java.util.List<String> accountIds; 
        private Boolean isActive; 
        private String keyword; 
        private Long page; 
        private Long pageSize; 
        private java.util.List<String> roleCodes; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListUsersRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.isActive = request.isActive;
            this.keyword = request.keyword;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.roleCodes = request.roleCodes;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>按 WINNEXO 登录账号精确批量查询（多选）；与其他筛选条件取交集。不传或传空列表 [] 均视为不按账号筛选（返回全部符合其他条件的成员）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder accountIds(java.util.List<String> accountIds) {
            String accountIdsShrink = shrink(accountIds, "accountIds", "json");
            this.putBodyParameter("accountIds", accountIdsShrink);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>启用/停用状态筛选</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isActive(Boolean isActive) {
            this.putBodyParameter("isActive", isActive);
            this.isActive = isActive;
            return this;
        }

        /**
         * <p>搜索关键词（模糊匹配显示名和账号）</p>
         * 
         * <strong>example:</strong>
         * <p>示例关键词</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>页码（从1开始）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>每页数量（最大100）</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>按角色筛选，可选值: SUPER_ADMIN / SYSTEM_ADMIN / SEMANTIC_ADMIN / SKILL_ADMIN / KB_ADMIN / AGENT_ADMIN / APPLICATION_USER</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder roleCodes(java.util.List<String> roleCodes) {
            String roleCodesShrink = shrink(roleCodes, "roleCodes", "json");
            this.putBodyParameter("roleCodes", roleCodesShrink);
            this.roleCodes = roleCodes;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListUsersRequest build() {
            return new ListUsersRequest(this);
        } 

    } 

}
