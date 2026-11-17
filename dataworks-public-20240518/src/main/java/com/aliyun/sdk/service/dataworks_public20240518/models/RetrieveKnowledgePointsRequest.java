// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link RetrieveKnowledgePointsRequest} extends {@link RequestModel}
 *
 * <p>RetrieveKnowledgePointsRequest</p>
 */
public class RetrieveKnowledgePointsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FocusObjects")
    private java.util.List<FocusObjects> focusObjects;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseIds")
    private java.util.List<String> knowledgeBaseIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 4096)
    private String query;

    private RetrieveKnowledgePointsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.focusObjects = builder.focusObjects;
        this.knowledgeBaseIds = builder.knowledgeBaseIds;
        this.maxResults = builder.maxResults;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveKnowledgePointsRequest create() {
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
     * @return focusObjects
     */
    public java.util.List<FocusObjects> getFocusObjects() {
        return this.focusObjects;
    }

    /**
     * @return knowledgeBaseIds
     */
    public java.util.List<String> getKnowledgeBaseIds() {
        return this.knowledgeBaseIds;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<RetrieveKnowledgePointsRequest, Builder> {
        private String regionId; 
        private java.util.List<FocusObjects> focusObjects; 
        private java.util.List<String> knowledgeBaseIds; 
        private Integer maxResults; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(RetrieveKnowledgePointsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.focusObjects = request.focusObjects;
            this.knowledgeBaseIds = request.knowledgeBaseIds;
            this.maxResults = request.maxResults;
            this.query = request.query;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The graph objects to focus the search on. You can specify up to 2 unique objects. The objects must be within the current authorized search scope and do not expand permissions.</p>
         */
        public Builder focusObjects(java.util.List<FocusObjects> focusObjects) {
            String focusObjectsShrink = shrink(focusObjects, "FocusObjects", "json");
            this.putBodyParameter("FocusObjects", focusObjectsShrink);
            this.focusObjects = focusObjects;
            return this;
        }

        /**
         * <p>A list of 1 to 50 unique knowledge base IDs that restricts the search. If you omit this parameter, the operation discovers knowledge bases within the caller’s authorized scope. If you provide IDs, the operation checks access to each knowledge base and the entire request fails if the caller lacks access to any of them.</p>
         */
        public Builder knowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
            String knowledgeBaseIdsShrink = shrink(knowledgeBaseIds, "KnowledgeBaseIds", "json");
            this.putBodyParameter("KnowledgeBaseIds", knowledgeBaseIdsShrink);
            this.knowledgeBaseIds = knowledgeBaseIds;
            return this;
        }

        /**
         * <p>The maximum number of hits across all knowledge bases. Default value: 10. Valid values: 1 to 50. This parameter does not specify the quota for each knowledge base or the page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The natural language question. The length cannot exceed 256 Unicode code points after leading and trailing whitespaces are removed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>How is sales revenue calculated, and which tables does it come from?</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        @Override
        public RetrieveKnowledgePointsRequest build() {
            return new RetrieveKnowledgePointsRequest(this);
        } 

    } 

    /**
     * 
     * {@link RetrieveKnowledgePointsRequest} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgePointsRequest</p>
     */
    public static class FocusObjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private FocusObjects(Builder builder) {
            this.id = builder.id;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FocusObjects create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String knowledgeBaseId; 
            private String type; 

            private Builder() {
            } 

            private Builder(FocusObjects model) {
                this.id = model.id;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.type = model.type;
            } 

            /**
             * <p>The location ID of the knowledge point. Copy this value exactly as it appears in the search results and use it together with the corresponding KnowledgeBaseId and Type. Do not parse or convert this value.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>node-sales</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The read category of the knowledge point. Use GRAPH for the current focus objects and graph nodes.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>GRAPH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FocusObjects build() {
                return new FocusObjects(this);
            } 

        } 

    }
}
