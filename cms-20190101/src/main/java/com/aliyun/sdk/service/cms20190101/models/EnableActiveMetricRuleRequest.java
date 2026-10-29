// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link EnableActiveMetricRuleRequest} extends {@link RequestModel}
 *
 * <p>EnableActiveMetricRuleRequest</p>
 */
public class EnableActiveMetricRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    private EnableActiveMetricRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableActiveMetricRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<EnableActiveMetricRuleRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(EnableActiveMetricRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.product = request.product;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the value of this parameter on the client side. Make sure that the value is unique across different requests. The value can be up to 64 ASCII characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>00000-xxxx-xxxxx--xxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to check the availability of the webhook.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The name of the Alibaba Cloud service that supports one-click alert rules. Valid values:</p>
         * <ul>
         * <li>ecs: Elastic Compute Service (ECS).</li>
         * <li>rds: ApsaraDB RDS.</li>
         * <li>slb: Server Load Balancer (SLB).</li>
         * <li>redis_standard: Standard architecture of open-source Redis.</li>
         * <li>redis_sharding: Cluster architecture of open-source Redis.</li>
         * <li>redis_splitrw: Read/write splitting architecture of open-source Redis.</li>
         * <li>mongodb: ApsaraDB for MongoDB (replica set).</li>
         * <li>mongodb_sharding: ApsaraDB for MongoDB (sharded cluster).</li>
         * <li>hbase: ApsaraDB for HBase.</li>
         * <li>elasticsearch: Elasticsearch.</li>
         * <li>opensearch: OpenSearch.</li>
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
        public EnableActiveMetricRuleRequest build() {
            return new EnableActiveMetricRuleRequest(this);
        } 

    } 

}
