// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveMetricRuleListRequest} extends {@link RequestModel}
 *
 * <p>DescribeActiveMetricRuleListRequest</p>
 */
public class DescribeActiveMetricRuleListRequest extends Request {
    @Query
    @NameInMap("Product")
    @Validation(required = true)
    private String product;

    private DescribeActiveMetricRuleListRequest(Builder builder) {
        super(builder);
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveMetricRuleListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeActiveMetricRuleListRequest, Builder> {
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(DescribeActiveMetricRuleListRequest request) {
            super(request);
            this.product = request.product;
        } 

        /**
         * The abbreviation of the service name. The following services support one-click alert:
         * <p>
         * 
         * *   ecs: Elastic Compute Service (ECS)
         * *   rds: ApsaraDB for RDS
         * *   slb: Server Load Balancer (SLB)
         * *   redis_standard: ApsaraDB for Redis of the standard architecture
         * *   redis_sharding: ApsaraDB for Redis of the cluster architecture
         * *   redis_splitrw: ApsaraDB for Redis of the read/write splitting architecture
         * *   mongodb: ApsaraDB for MongoDB of the replica set architecture
         * *   mongodb_sharding: ApsaraDB for MongoDB of the sharded cluster architecture
         * *   hbase: ApsaraDB for HBase
         * *   elasticsearch: Elasticsearch
         * *   opensearch: Open Search
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        @Override
        public DescribeActiveMetricRuleListRequest build() {
            return new DescribeActiveMetricRuleListRequest(this);
        } 

    } 

}
