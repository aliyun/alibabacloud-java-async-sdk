// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link RerankRequest} extends {@link RequestModel}
 *
 * <p>RerankRequest</p>
 */
public class RerankRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Documents")
    private java.util.List<String> documents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxChunksPerDoc")
    private Integer maxChunksPerDoc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReturnDocuments")
    private Boolean returnDocuments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    private RerankRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.documents = builder.documents;
        this.maxChunksPerDoc = builder.maxChunksPerDoc;
        this.model = builder.model;
        this.ownerId = builder.ownerId;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.returnDocuments = builder.returnDocuments;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RerankRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return documents
     */
    public java.util.List<String> getDocuments() {
        return this.documents;
    }

    /**
     * @return maxChunksPerDoc
     */
    public Integer getMaxChunksPerDoc() {
        return this.maxChunksPerDoc;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return returnDocuments
     */
    public Boolean getReturnDocuments() {
        return this.returnDocuments;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    public static final class Builder extends Request.Builder<RerankRequest, Builder> {
        private String DBInstanceId; 
        private java.util.List<String> documents; 
        private Integer maxChunksPerDoc; 
        private String model; 
        private Long ownerId; 
        private String query; 
        private String regionId; 
        private Boolean returnDocuments; 
        private Integer topK; 

        private Builder() {
            super();
        } 

        private Builder(RerankRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.documents = request.documents;
            this.maxChunksPerDoc = request.maxChunksPerDoc;
            this.model = request.model;
            this.ownerId = request.ownerId;
            this.query = request.query;
            this.regionId = request.regionId;
            this.returnDocuments = request.returnDocuments;
            this.topK = request.topK;
        } 

        /**
         * <p>Instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> API to view details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>List of documents to be re-ordered.</p>
         */
        public Builder documents(java.util.List<String> documents) {
            String documentsShrink = shrink(documents, "Documents", "json");
            this.putBodyParameter("Documents", documentsShrink);
            this.documents = documents;
            return this;
        }

        /**
         * <p>Maximum number of chunks allowed when the text exceeds the model window:</p>
         * <ul>
         * <li>bge-reranker-v2-m3: default value is 10.</li>
         * <li>bge-reranker-v2-minicpm-layerwise: default value is 5:</li>
         * </ul>
         * <blockquote>
         * <p>Example of splitting</p>
         * <ul>
         * <li>If using the bge-reranker-v2-minicpm-layerwise model, the maximum single inference window is 2048 tokens. If the query is 48 tokens and the content of a single document parameter is 9000 tokens, it will be divided as follows: 1-2000 for the first, 2001-4000 for the second, and so on. If the number of splits exceeds MaxChunksPerDoc, the remaining sentences will be discarded.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxChunksPerDoc(Integer maxChunksPerDoc) {
            this.putBodyParameter("MaxChunksPerDoc", maxChunksPerDoc);
            this.maxChunksPerDoc = maxChunksPerDoc;
            return this;
        }

        /**
         * <p>Rerank model, currently supports:</p>
         * <ul>
         * <li>bge-reranker-v2-m3: (default), better performance, supports 8192 tokens per inference, if exceeded, it will be split, which may reduce the effect.</li>
         * <li>bge-reranker-v2-minicpm-layerwise: better performance than v2-m3, supports 2048 tokens per inference, if exceeded, it will be split, which may reduce the effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bge-reranker-v2-m3</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Query statement for Rerank.</p>
         * 
         * <strong>example:</strong>
         * <p>What is ADBPG?</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Region ID where the instance is located.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>If set to false, does not return the Documents text, only returns the index of the document order and the rerank score.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder returnDocuments(Boolean returnDocuments) {
            this.putBodyParameter("ReturnDocuments", returnDocuments);
            this.returnDocuments = returnDocuments;
            return this;
        }

        /**
         * <p>Number of most relevant documents to return.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        @Override
        public RerankRequest build() {
            return new RerankRequest(this);
        } 

    } 

}
