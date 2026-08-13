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
 * {@link ListVisibleKnowledgeBaseContentsRequest} extends {@link RequestModel}
 *
 * <p>ListVisibleKnowledgeBaseContentsRequest</p>
 */
public class ListVisibleKnowledgeBaseContentsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatingObjectName;

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

    private ListVisibleKnowledgeBaseContentsRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.operatingObjectName = builder.operatingObjectName;
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

    public static ListVisibleKnowledgeBaseContentsRequest create() {
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
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
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

    public static final class Builder extends Request.Builder<ListVisibleKnowledgeBaseContentsRequest, Builder> {
        private String directoryId; 
        private String operatingObjectName; 
        private Long page; 
        private Long pageSize; 
        private String sortField; 
        private String sortOrder; 
        private java.util.List<String> sourceTypes; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListVisibleKnowledgeBaseContentsRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.operatingObjectName = request.operatingObjectName;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
            this.sourceTypes = request.sourceTypes;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>目录 ID（必传非空，必须在数字员工 linked_directories 及其子目录范围内）</p>
         * <p>This parameter is required.</p>
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
         * <p>数字员工名称（运营对象 name）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>页码（从 1 开始）</p>
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
         * <p>10</p>
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
         * <p>desc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("sortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>资源类型筛选列表（有值时仅返回资源，不包含子目录）</p>
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
         * <p>PiPklI1iSRTm6VFFqlY9VzbgiEiE</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListVisibleKnowledgeBaseContentsRequest build() {
            return new ListVisibleKnowledgeBaseContentsRequest(this);
        } 

    } 

}
