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
 * {@link ListAdminKnowledgeBasesRequest} extends {@link RequestModel}
 *
 * <p>ListAdminKnowledgeBasesRequest</p>
 */
public class ListAdminKnowledgeBasesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

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
    @com.aliyun.core.annotation.NameInMap("sortField")
    private String sortField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTypes")
    private java.util.List<String> sourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListAdminKnowledgeBasesRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.keyword = builder.keyword;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.sortField = builder.sortField;
        this.sortOrder = builder.sortOrder;
        this.sourceTypes = builder.sourceTypes;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAdminKnowledgeBasesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return sourceTypes
     */
    public java.util.List<String> getSourceTypes() {
        return this.sourceTypes;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListAdminKnowledgeBasesRequest, Builder> {
        private String directoryId; 
        private String keyword; 
        private Long page; 
        private Long pageSize; 
        private String sortField; 
        private String sortOrder; 
        private java.util.List<String> sourceTypes; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListAdminKnowledgeBasesRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.keyword = request.keyword;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
            this.sourceTypes = request.sourceTypes;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>目录 ID；为空或 &quot;root&quot; 时返回 KB 顶层列表，传具体值时下钻返回该目录的子目录 + 资源（混合分页，由 itemType 区分）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>搜索关键词，仅在 directoryId 为空/root 时生效，模糊匹配 KB 名称或描述（忽略大小写）</p>
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
         * <p>页码，从 1 开始</p>
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
         * <p>每页数量，范围 1-100</p>
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
         * <p>排序字段：name / gmtCreate / gmtModified；非法值回退为 name</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("sortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * <p>排序方向：asc / desc；非法值回退为 asc</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("sortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>资源类型过滤，仅在下钻（directoryId 非空）时生效；命中时仅返回匹配类型的资源，不含子目录</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceTypes(java.util.List<String> sourceTypes) {
            String sourceTypesShrink = shrink(sourceTypes, "sourceTypes", "json");
            this.putBodyParameter("sourceTypes", sourceTypesShrink);
            this.sourceTypes = sourceTypes;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
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
        public ListAdminKnowledgeBasesRequest build() {
            return new ListAdminKnowledgeBasesRequest(this);
        } 

    } 

}
