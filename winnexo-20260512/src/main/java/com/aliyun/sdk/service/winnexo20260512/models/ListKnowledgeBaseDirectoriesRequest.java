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
 * {@link ListKnowledgeBaseDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>ListKnowledgeBaseDirectoriesRequest</p>
 */
public class ListKnowledgeBaseDirectoriesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortField")
    private String sortField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListKnowledgeBaseDirectoriesRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.sortField = builder.sortField;
        this.sortOrder = builder.sortOrder;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBaseDirectoriesRequest create() {
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListKnowledgeBaseDirectoriesRequest, Builder> {
        private String directoryId; 
        private String sortField; 
        private String sortOrder; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListKnowledgeBaseDirectoriesRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>父分类 ID；不传时返回企业知识库根目录下的所有分类树</p>
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
         * <p>排序字段：name / gmt_create / gmt_modified</p>
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
         * <p>排序方向：asc / desc</p>
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
        public ListKnowledgeBaseDirectoriesRequest build() {
            return new ListKnowledgeBaseDirectoriesRequest(this);
        } 

    } 

}
