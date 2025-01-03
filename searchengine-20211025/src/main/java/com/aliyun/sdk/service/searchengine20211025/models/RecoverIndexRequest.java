// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link RecoverIndexRequest} extends {@link RequestModel}
 *
 * <p>RecoverIndexRequest</p>
 */
public class RecoverIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("buildDeployId")
    private Integer buildDeployId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("generation")
    private String generation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("indexName")
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-zvp2jlr2g03</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The deployment ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>277</p>
         */
        public Builder buildDeployId(Integer buildDeployId) {
            this.putBodyParameter("buildDeployId", buildDeployId);
            this.buildDeployId = buildDeployId;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0js04_odps_first</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putBodyParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>The ID of the full index version.</p>
         * 
         * <strong>example:</strong>
         * <p>1653018575</p>
         */
        public Builder generation(String generation) {
            this.putBodyParameter("generation", generation);
            this.generation = generation;
            return this;
        }

        /**
         * <p>The index name.</p>
         * 
         * <strong>example:</strong>
         * <p>main_index</p>
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
