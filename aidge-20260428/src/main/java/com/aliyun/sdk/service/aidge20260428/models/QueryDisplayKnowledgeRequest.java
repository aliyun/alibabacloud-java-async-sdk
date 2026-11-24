// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link QueryDisplayKnowledgeRequest} extends {@link RequestModel}
 *
 * <p>QueryDisplayKnowledgeRequest</p>
 */
public class QueryDisplayKnowledgeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ragId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkuId")
    private String skuId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkuName")
    private String skuName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    private QueryDisplayKnowledgeRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.ragId = builder.ragId;
        this.skuId = builder.skuId;
        this.skuName = builder.skuName;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDisplayKnowledgeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ragId
     */
    public String getRagId() {
        return this.ragId;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    /**
     * @return skuName
     */
    public String getSkuName() {
        return this.skuName;
    }

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<QueryDisplayKnowledgeRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 
        private String ragId; 
        private String skuId; 
        private String skuName; 
        private java.util.List<String> statuses; 

        private Builder() {
            super();
        } 

        private Builder(QueryDisplayKnowledgeRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.ragId = request.ragId;
            this.skuId = request.skuId;
            this.skuName = request.skuName;
            this.statuses = request.statuses;
        } 

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The knowledge base ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rag_xxx</p>
         */
        public Builder ragId(String ragId) {
            this.putQueryParameter("RagId", ragId);
            this.ragId = ragId;
            return this;
        }

        /**
         * <p>The SKU ID for exact match.</p>
         * 
         * <strong>example:</strong>
         * <p>sku-001</p>
         */
        public Builder skuId(String skuId) {
            this.putQueryParameter("SkuId", skuId);
            this.skuId = skuId;
            return this;
        }

        /**
         * <p>The keyword in the SKU name.</p>
         * 
         * <strong>example:</strong>
         * <p>Product front image</p>
         */
        public Builder skuName(String skuName) {
            this.putQueryParameter("SkuName", skuName);
            this.skuName = skuName;
            return this;
        }

        /**
         * <p>The list of record statuses. Valid values: UPDATING, EMBEDDED, and FAILED.</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            String statusesShrink = shrink(statuses, "Statuses", "json");
            this.putQueryParameter("Statuses", statusesShrink);
            this.statuses = statuses;
            return this;
        }

        @Override
        public QueryDisplayKnowledgeRequest build() {
            return new QueryDisplayKnowledgeRequest(this);
        } 

    } 

}
