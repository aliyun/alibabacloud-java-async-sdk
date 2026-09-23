// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link SearchKgBySemanticRequest} extends {@link RequestModel}
 *
 * <p>SearchKgBySemanticRequest</p>
 */
public class SearchKgBySemanticRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private SearchCommand searchCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SearchKgBySemanticRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.searchCommand = builder.searchCommand;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchKgBySemanticRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return searchCommand
     */
    public SearchCommand getSearchCommand() {
        return this.searchCommand;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SearchKgBySemanticRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private SearchCommand searchCommand; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SearchKgBySemanticRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.searchCommand = request.searchCommand;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The search command.</p>
         * <p>This parameter is required.</p>
         */
        public Builder searchCommand(SearchCommand searchCommand) {
            String searchCommandShrink = shrink(searchCommand, "SearchCommand", "json");
            this.putBodyParameter("SearchCommand", searchCommandShrink);
            this.searchCommand = searchCommand;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1d4559a4db044158305e2d89bccf81f</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SearchKgBySemanticRequest build() {
            return new SearchKgBySemanticRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchKgBySemanticRequest} extends {@link TeaModel}
     *
     * <p>SearchKgBySemanticRequest</p>
     */
    public static class SearchCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityTypeCodes")
        private java.util.List<String> entityTypeCodes;

        @com.aliyun.core.annotation.NameInMap("MinSimilarity")
        private Float minSimilarity;

        @com.aliyun.core.annotation.NameInMap("PropertyCode")
        private String propertyCode;

        @com.aliyun.core.annotation.NameInMap("QueryText")
        @com.aliyun.core.annotation.Validation(required = true)
        private String queryText;

        @com.aliyun.core.annotation.NameInMap("TopK")
        private Integer topK;

        private SearchCommand(Builder builder) {
            this.entityTypeCodes = builder.entityTypeCodes;
            this.minSimilarity = builder.minSimilarity;
            this.propertyCode = builder.propertyCode;
            this.queryText = builder.queryText;
            this.topK = builder.topK;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchCommand create() {
            return builder().build();
        }

        /**
         * @return entityTypeCodes
         */
        public java.util.List<String> getEntityTypeCodes() {
            return this.entityTypeCodes;
        }

        /**
         * @return minSimilarity
         */
        public Float getMinSimilarity() {
            return this.minSimilarity;
        }

        /**
         * @return propertyCode
         */
        public String getPropertyCode() {
            return this.propertyCode;
        }

        /**
         * @return queryText
         */
        public String getQueryText() {
            return this.queryText;
        }

        /**
         * @return topK
         */
        public Integer getTopK() {
            return this.topK;
        }

        public static final class Builder {
            private java.util.List<String> entityTypeCodes; 
            private Float minSimilarity; 
            private String propertyCode; 
            private String queryText; 
            private Integer topK; 

            private Builder() {
            } 

            private Builder(SearchCommand model) {
                this.entityTypeCodes = model.entityTypeCodes;
                this.minSimilarity = model.minSimilarity;
                this.propertyCode = model.propertyCode;
                this.queryText = model.queryText;
                this.topK = model.topK;
            } 

            /**
             * <p>The entity type codes used for filtering. If this parameter is not specified, all entity types are searched.</p>
             */
            public Builder entityTypeCodes(java.util.List<String> entityTypeCodes) {
                this.entityTypeCodes = entityTypeCodes;
                return this;
            }

            /**
             * <p>The minimum similarity threshold. Valid values: 0.0 to 1.0. Default value: 0.0 (no filtering). This parameter takes effect only for the semantic search path.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder minSimilarity(Float minSimilarity) {
                this.minSimilarity = minSimilarity;
                return this;
            }

            /**
             * <p>The property code for semantic search. If this parameter is not specified, all properties with semantic search enabled are searched.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder propertyCode(String propertyCode) {
                this.propertyCode = propertyCode;
                return this;
            }

            /**
             * <p>The natural language query text. The value can be 0 to 500 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Query students in Beijing</p>
             */
            public Builder queryText(String queryText) {
                this.queryText = queryText;
                return this;
            }

            /**
             * <p>The maximum number of results to return. Default value: 20. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            public SearchCommand build() {
                return new SearchCommand(this);
            } 

        } 

    }
}
