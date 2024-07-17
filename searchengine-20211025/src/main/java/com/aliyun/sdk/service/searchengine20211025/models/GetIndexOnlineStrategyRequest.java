// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndexOnlineStrategyRequest} extends {@link RequestModel}
 *
 * <p>GetIndexOnlineStrategyRequest</p>
 */
public class GetIndexOnlineStrategyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("deployName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deployName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("indexName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexName;

    private GetIndexOnlineStrategyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceName = builder.dataSourceName;
        this.deployName = builder.deployName;
        this.indexName = builder.indexName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexOnlineStrategyRequest create() {
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
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return deployName
     */
    public String getDeployName() {
        return this.deployName;
    }

    /**
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    public static final class Builder extends Request.Builder<GetIndexOnlineStrategyRequest, Builder> {
        private String instanceId; 
        private String dataSourceName; 
        private String deployName; 
        private String indexName; 

        private Builder() {
            super();
        } 

        private Builder(GetIndexOnlineStrategyRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceName = request.dataSourceName;
            this.deployName = request.deployName;
            this.indexName = request.indexName;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the data source.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putPathParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * The data center in which the data source is deployed.
         */
        public Builder deployName(String deployName) {
            this.putPathParameter("deployName", deployName);
            this.deployName = deployName;
            return this;
        }

        /**
         * The index name.
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        @Override
        public GetIndexOnlineStrategyRequest build() {
            return new GetIndexOnlineStrategyRequest(this);
        } 

    } 

}
