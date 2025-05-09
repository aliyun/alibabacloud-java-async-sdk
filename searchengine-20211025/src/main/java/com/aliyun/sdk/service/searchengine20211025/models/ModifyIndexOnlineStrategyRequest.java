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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2rps6c08</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2rps6c08_api_test</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putPathParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>The name of the data center in which the data source is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_hz_domain_1</p>
         */
        public Builder deployName(String deployName) {
            this.putPathParameter("deployName", deployName);
            this.deployName = deployName;
            return this;
        }

        /**
         * <p>The index name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tusou_v2</p>
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * <p>The index change rate.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
