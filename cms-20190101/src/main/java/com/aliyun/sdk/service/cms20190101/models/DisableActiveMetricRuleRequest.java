// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisableActiveMetricRuleRequest} extends {@link RequestModel}
 *
 * <p>DisableActiveMetricRuleRequest</p>
 */
public class DisableActiveMetricRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    private DisableActiveMetricRuleRequest(Builder builder) {
        super(builder);
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableActiveMetricRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<DisableActiveMetricRuleRequest, Builder> {
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(DisableActiveMetricRuleRequest request) {
            super(request);
            this.product = request.product;
        } 

        /**
         * <p>The service for which you want to disable one-click alert. Valid values:</p>
         * <ul>
         * <li>ecs: Elastic Compute Service (ECS)</li>
         * <li>rds: ApsaraDB RDS</li>
         * <li>slb: Server Load Balancer (SLB)</li>
         * <li>redis_standard: ApsaraDB for Redis of the standard architecture</li>
         * <li>redis_sharding: ApsaraDB for Redis of the cluster architecture</li>
         * <li>redis_splitrw: ApsaraDB for Redis of the read/write splitting architecture</li>
         * <li>mongodb: ApsaraDB for MongoDB of the replica set architecture</li>
         * <li>mongodb_sharding: ApsaraDB for MongoDB of the sharded cluster architecture</li>
         * <li>hbase: ApsaraDB for HBase</li>
         * <li>elasticsearch: Elasticsearch</li>
         * <li>opensearch: Open Search</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        @Override
        public DisableActiveMetricRuleRequest build() {
            return new DisableActiveMetricRuleRequest(this);
        } 

    } 

}
