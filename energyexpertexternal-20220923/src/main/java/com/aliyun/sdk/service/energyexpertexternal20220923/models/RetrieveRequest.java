// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link RetrieveRequest} extends {@link RequestModel}
 *
 * <p>RetrieveRequest</p>
 */
public class RetrieveRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("documentIds")
    private java.util.List<Long> documentIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("folderIds")
    private java.util.List<String> folderIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("preRetrieveTopK")
    private Integer preRetrieveTopK;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rerankerThreshold")
    private Float rerankerThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topK")
    private Integer topK;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("useReranker")
    private Boolean useReranker;

    private RetrieveRequest(Builder builder) {
        super(builder);
        this.documentIds = builder.documentIds;
        this.folderIds = builder.folderIds;
        this.preRetrieveTopK = builder.preRetrieveTopK;
        this.query = builder.query;
        this.rerankerThreshold = builder.rerankerThreshold;
        this.topK = builder.topK;
        this.useReranker = builder.useReranker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return documentIds
     */
    public java.util.List<Long> getDocumentIds() {
        return this.documentIds;
    }

    /**
     * @return folderIds
     */
    public java.util.List<String> getFolderIds() {
        return this.folderIds;
    }

    /**
     * @return preRetrieveTopK
     */
    public Integer getPreRetrieveTopK() {
        return this.preRetrieveTopK;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return rerankerThreshold
     */
    public Float getRerankerThreshold() {
        return this.rerankerThreshold;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return useReranker
     */
    public Boolean getUseReranker() {
        return this.useReranker;
    }

    public static final class Builder extends Request.Builder<RetrieveRequest, Builder> {
        private java.util.List<Long> documentIds; 
        private java.util.List<String> folderIds; 
        private Integer preRetrieveTopK; 
        private String query; 
        private Float rerankerThreshold; 
        private Integer topK; 
        private Boolean useReranker; 

        private Builder() {
            super();
        } 

        private Builder(RetrieveRequest request) {
            super(request);
            this.documentIds = request.documentIds;
            this.folderIds = request.folderIds;
            this.preRetrieveTopK = request.preRetrieveTopK;
            this.query = request.query;
            this.rerankerThreshold = request.rerankerThreshold;
            this.topK = request.topK;
            this.useReranker = request.useReranker;
        } 

        /**
         * documentIds.
         */
        public Builder documentIds(java.util.List<Long> documentIds) {
            this.putBodyParameter("documentIds", documentIds);
            this.documentIds = documentIds;
            return this;
        }

        /**
         * folderIds.
         */
        public Builder folderIds(java.util.List<String> folderIds) {
            this.putBodyParameter("folderIds", folderIds);
            this.folderIds = folderIds;
            return this;
        }

        /**
         * preRetrieveTopK.
         */
        public Builder preRetrieveTopK(Integer preRetrieveTopK) {
            this.putBodyParameter("preRetrieveTopK", preRetrieveTopK);
            this.preRetrieveTopK = preRetrieveTopK;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;What&quot;s the meaning of the file?&quot;</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * rerankerThreshold.
         */
        public Builder rerankerThreshold(Float rerankerThreshold) {
            this.putBodyParameter("rerankerThreshold", rerankerThreshold);
            this.rerankerThreshold = rerankerThreshold;
            return this;
        }

        /**
         * topK.
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("topK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * useReranker.
         */
        public Builder useReranker(Boolean useReranker) {
            this.putBodyParameter("useReranker", useReranker);
            this.useReranker = useReranker;
            return this;
        }

        @Override
        public RetrieveRequest build() {
            return new RetrieveRequest(this);
        } 

    } 

}
