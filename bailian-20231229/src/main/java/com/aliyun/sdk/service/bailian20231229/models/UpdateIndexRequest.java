// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link UpdateIndexRequest} extends {@link RequestModel}
 *
 * <p>UpdateIndexRequest</p>
 */
public class UpdateIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DenseSimilarityTopK")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer denseSimilarityTopK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineCommercialCu")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer pipelineCommercialCu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineCommercialType")
    private String pipelineCommercialType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankMinScore")
    private String rerankMinScore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SparseSimilarityTopK")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer sparseSimilarityTopK;

    private UpdateIndexRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.denseSimilarityTopK = builder.denseSimilarityTopK;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.pipelineCommercialCu = builder.pipelineCommercialCu;
        this.pipelineCommercialType = builder.pipelineCommercialType;
        this.rerankMinScore = builder.rerankMinScore;
        this.sparseSimilarityTopK = builder.sparseSimilarityTopK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIndexRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return denseSimilarityTopK
     */
    public Integer getDenseSimilarityTopK() {
        return this.denseSimilarityTopK;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pipelineCommercialCu
     */
    public Integer getPipelineCommercialCu() {
        return this.pipelineCommercialCu;
    }

    /**
     * @return pipelineCommercialType
     */
    public String getPipelineCommercialType() {
        return this.pipelineCommercialType;
    }

    /**
     * @return rerankMinScore
     */
    public String getRerankMinScore() {
        return this.rerankMinScore;
    }

    /**
     * @return sparseSimilarityTopK
     */
    public Integer getSparseSimilarityTopK() {
        return this.sparseSimilarityTopK;
    }

    public static final class Builder extends Request.Builder<UpdateIndexRequest, Builder> {
        private String workspaceId; 
        private Integer denseSimilarityTopK; 
        private String description; 
        private String id; 
        private String name; 
        private Integer pipelineCommercialCu; 
        private String pipelineCommercialType; 
        private String rerankMinScore; 
        private Integer sparseSimilarityTopK; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIndexRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.denseSimilarityTopK = request.denseSimilarityTopK;
            this.description = request.description;
            this.id = request.id;
            this.name = request.name;
            this.pipelineCommercialCu = request.pipelineCommercialCu;
            this.pipelineCommercialType = request.pipelineCommercialType;
            this.rerankMinScore = request.rerankMinScore;
            this.sparseSimilarityTopK = request.sparseSimilarityTopK;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3shx2gu255oqxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The top K value for AISearch. The system generates a vector for the input text and retrieves the K text chunks with the most similar vector representations from the knowledge base. Valid values: 0 to 100.
         * The sum of <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> must be less than or equal to 200.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder denseSimilarityTopK(Integer denseSimilarityTopK) {
            this.putQueryParameter("DenseSimilarityTopK", denseSimilarityTopK);
            this.denseSimilarityTopK = denseSimilarityTopK;
            return this;
        }

        /**
         * <p>The knowledge base description.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise knowledge base</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The knowledge base ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>79c0alxxxx</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The knowledge base name.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise help documentation library</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of RCUs for an Ultimate Edition knowledge base. This parameter is required only when pipelineCommercialType is set to enterprise.</p>
         * <p>Valid values: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder pipelineCommercialCu(Integer pipelineCommercialCu) {
            this.putQueryParameter("PipelineCommercialCu", pipelineCommercialCu);
            this.pipelineCommercialCu = pipelineCommercialCu;
            return this;
        }

        /**
         * <p>The specification type of the knowledge base. Valid values:</p>
         * <ul>
         * <li><p>standard: Standard Edition.</p>
         * </li>
         * <li><p>enterprise: Ultimate Edition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder pipelineCommercialType(String pipelineCommercialType) {
            this.putQueryParameter("PipelineCommercialType", pipelineCommercialType);
            this.pipelineCommercialType = pipelineCommercialType;
            return this;
        }

        /**
         * <p>The minimum reranking score. Valid values: 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        public Builder rerankMinScore(String rerankMinScore) {
            this.putQueryParameter("RerankMinScore", rerankMinScore);
            this.rerankMinScore = rerankMinScore;
            return this;
        }

        /**
         * <p>The top K value for keyword retrieval. The system retrieves text chunks in the knowledge base that are an exact match for the keywords of the input text. This helps filter out irrelevant text chunks and provides more accurate results.
         * Valid values: 0 to 100.
         * The sum of <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> must be less than or equal to 200.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder sparseSimilarityTopK(Integer sparseSimilarityTopK) {
            this.putQueryParameter("SparseSimilarityTopK", sparseSimilarityTopK);
            this.sparseSimilarityTopK = sparseSimilarityTopK;
            return this;
        }

        @Override
        public UpdateIndexRequest build() {
            return new UpdateIndexRequest(this);
        } 

    } 

}
