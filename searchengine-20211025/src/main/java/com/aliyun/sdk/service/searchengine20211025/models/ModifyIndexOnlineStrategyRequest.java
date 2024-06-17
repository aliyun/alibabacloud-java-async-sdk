// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIndexOnlineStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyIndexOnlineStrategyRequest</p>
 */
public class ModifyIndexOnlineStrategyRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("changeRate")
    private Integer changeRate;

    private ModifyIndexOnlineStrategyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceName = builder.dataSourceName;
        this.deployName = builder.deployName;
        this.indexName = builder.indexName;
        this.changeRate = builder.changeRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIndexOnlineStrategyRequest create() {
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

    /**
     * @return changeRate
     */
    public Integer getChangeRate() {
        return this.changeRate;
    }

    public static final class Builder extends Request.Builder<ModifyIndexOnlineStrategyRequest, Builder> {
        private String instanceId; 
        private String dataSourceName; 
        private String deployName; 
        private String indexName; 
        private Integer changeRate; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIndexOnlineStrategyRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceName = request.dataSourceName;
            this.deployName = request.deployName;
            this.indexName = request.indexName;
            this.changeRate = request.changeRate;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * dataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putPathParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * deployName.
         */
        public Builder deployName(String deployName) {
            this.putPathParameter("deployName", deployName);
            this.deployName = deployName;
            return this;
        }

        /**
         * indexName.
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * changeRate.
         */
        public Builder changeRate(Integer changeRate) {
            this.putBodyParameter("changeRate", changeRate);
            this.changeRate = changeRate;
            return this;
        }

        @Override
        public ModifyIndexOnlineStrategyRequest build() {
            return new ModifyIndexOnlineStrategyRequest(this);
        } 

    } 

}
