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
    @com.aliyun.core.annotation.NameInMap("Instruct")
    private String instruct;

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
        this.instruct = builder.instruct;
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
     * @return instruct
     */
    public String getInstruct() {
        return this.instruct;
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
        private String instruct; 
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
            this.instruct = request.instruct;
            this.maxChunksPerDoc = request.maxChunksPerDoc;
            this.model = request.model;
            this.ownerId = request.ownerId;
            this.query = request.query;
            this.regionId = request.regionId;
            this.returnDocuments = request.returnDocuments;
            this.topK = request.topK;
        } 

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to view the details of all AnalyticDB for PostgreSQL instances in the specified region, including instance IDs.</p>
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
         * <p>The list of documents to be reranked.</p>
         * 
         * <strong>example:</strong>
         * <p>ADBPG is an Alibaba Cloud OLAP database.</p>
         */
        public Builder documents(java.util.List<String> documents) {
            String documentsShrink = shrink(documents, "Documents", "json");
            this.putBodyParameter("Documents", documentsShrink);
            this.documents = documents;
            return this;
        }

        /**
         * <p>The description of the custom ranking task type. This parameter can be set when RerankModel.Name is qwen3-rerank. It guides the model to use different ranking strategies.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        public Builder instruct(String instruct) {
            this.putBodyParameter("Instruct", instruct);
            this.instruct = instruct;
            return this;
        }

        /**
         * <p>The maximum number of chunks allowed when the text exceeds the model window. Valid values:</p>
         * <ul>
         * <li>bge-reranker-v2-m3: 10. This is the default value.</li>
         * <li>bge-reranker-v2-minicpm-layerwise: 5. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p>Chunking example</p>
         * <ul>
         * <li>If you use the bge-reranker-v2-minicpm-layerwise model, the maximum single inference window is 2,048 tokens. If the query is 48 tokens and a single document parameter contains 9,000 tokens, the document is split into chunks: tokens 1 to 2,000 form the first chunk, tokens 2,001 to 4,000 form the second chunk, and so on. If the number of chunks exceeds the value of MaxChunksPerDoc, the subsequent text is discarded.</li>
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
         * <p>The rerank model. Valid values:</p>
         * <ul>
         * <li>bge-reranker-v2-m3: provides good performance and supports up to 8,192 tokens for a single inference. Text that exceeds this limit is split into chunks, which may degrade performance. This is the default value.</li>
         * <li>bge-reranker-v2-minicpm-layerwise: provides better performance than bge-reranker-v2-m3 and supports up to 2,048 tokens for a single inference. Text that exceeds this limit is split into chunks, which may degrade performance.</li>
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
         * <p>The query statement for reranking.</p>
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
         * <p>The region ID of the instance.</p>
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
         * <p>Specifies whether to return the document text. If this parameter is set to false, the document text is not returned. Only the indexes and rerank scores of the sorted documents are returned.</p>
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
         * <p>The number of most relevant documents to return.</p>
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
