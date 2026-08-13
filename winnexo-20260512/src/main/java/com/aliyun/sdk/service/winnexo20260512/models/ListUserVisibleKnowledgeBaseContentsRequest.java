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
 * {@link ListUserVisibleKnowledgeBaseContentsRequest} extends {@link RequestModel}
 *
 * <p>ListUserVisibleKnowledgeBaseContentsRequest</p>
 */
public class ListUserVisibleKnowledgeBaseContentsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    private String sourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListUserVisibleKnowledgeBaseContentsRequest(Builder builder) {
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

    public static ListUserVisibleKnowledgeBaseContentsRequest create() {
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
    public String getSourceTypes() {
        return this.sourceTypes;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListUserVisibleKnowledgeBaseContentsRequest, Builder> {
        private String directoryId; 
        private String keyword; 
        private Long page; 
        private Long pageSize; 
        private String sortField; 
        private String sortOrder; 
        private String sourceTypes; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListUserVisibleKnowledgeBaseContentsRequest request) {
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
         * <p>目标知识库根目录或其子目录的唯一标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dir_example</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>当前目录下的目录或资源名称关键词</p>
         * 
         * <strong>example:</strong>
         * <p>产品说明</p>
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
         * <p>每页数量，范围 1-200</p>
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
         * <p>排序字段，可选 name / gmt_create / gmt_modified</p>
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
         * <p>排序方向，可选 asc / desc</p>
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
         * <p>资源类型过滤，多个类型使用逗号分隔；传入后只返回资源</p>
         * 
         * <strong>example:</strong>
         * <p>FILE,WEB_PAGE</p>
         */
        public Builder sourceTypes(String sourceTypes) {
            this.putBodyParameter("sourceTypes", sourceTypes);
            this.sourceTypes = sourceTypes;
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
        public ListUserVisibleKnowledgeBaseContentsRequest build() {
            return new ListUserVisibleKnowledgeBaseContentsRequest(this);
        } 

    } 

}
