// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecoverIndexRequest} extends {@link RequestModel}
 *
 * <p>RecoverIndexRequest</p>
 */
public class RecoverIndexRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("buildDeployId")
    private Integer buildDeployId;

    @Body
    @NameInMap("dataSourceName")
    private String dataSourceName;

    @Body
    @NameInMap("generation")
    private String generation;

    @Body
    @NameInMap("indexName")
    private String indexName;

    private RecoverIndexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.buildDeployId = builder.buildDeployId;
        this.dataSourceName = builder.dataSourceName;
        this.generation = builder.generation;
        this.indexName = builder.indexName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoverIndexRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return buildDeployId
     */
    public Integer getBuildDeployId() {
        return this.buildDeployId;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return generation
     */
    public String getGeneration() {
        return this.generation;
    }

    /**
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    public static final class Builder extends Request.Builder<RecoverIndexRequest, Builder> {
        private String instanceId; 
        private Integer buildDeployId; 
        private String dataSourceName; 
        private String generation; 
        private String indexName; 

        private Builder() {
            super();
        } 

        private Builder(RecoverIndexRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.buildDeployId = request.buildDeployId;
            this.dataSourceName = request.dataSourceName;
            this.generation = request.generation;
            this.indexName = request.indexName;
        } 

        /**
         * Restores data from an index.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * buildDeployId
         */
        public Builder buildDeployId(Integer buildDeployId) {
            this.putBodyParameter("buildDeployId", buildDeployId);
            this.buildDeployId = buildDeployId;
            return this;
        }

        /**
         * dataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putBodyParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * generation
         */
        public Builder generation(String generation) {
            this.putBodyParameter("generation", generation);
            this.generation = generation;
            return this;
        }

        /**
         * indexName.
         */
        public Builder indexName(String indexName) {
            this.putBodyParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        @Override
        public RecoverIndexRequest build() {
            return new RecoverIndexRequest(this);
        } 

    } 

}
