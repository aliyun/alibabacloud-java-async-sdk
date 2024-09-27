// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
    private java.util.List < String > documents;

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
    public java.util.List < String > getDocuments() {
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
        private java.util.List < String > documents; 
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
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Documents.
         */
        public Builder documents(java.util.List < String > documents) {
            String documentsShrink = shrink(documents, "Documents", "json");
            this.putBodyParameter("Documents", documentsShrink);
            this.documents = documents;
            return this;
        }

        /**
         * MaxChunksPerDoc.
         */
        public Builder maxChunksPerDoc(Integer maxChunksPerDoc) {
            this.putBodyParameter("MaxChunksPerDoc", maxChunksPerDoc);
            this.maxChunksPerDoc = maxChunksPerDoc;
            return this;
        }

        /**
         * Model.
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
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReturnDocuments.
         */
        public Builder returnDocuments(Boolean returnDocuments) {
            this.putBodyParameter("ReturnDocuments", returnDocuments);
            this.returnDocuments = returnDocuments;
            return this;
        }

        /**
         * TopK.
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
