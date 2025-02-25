// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeGatewayRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewayRequest</p>
 */
public class DescribeGatewayRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    private DescribeGatewayRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    public static final class Builder extends Request.Builder<DescribeGatewayRequest, Builder> {
        private String clusterId; 
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewayRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.gatewayId = request.gatewayId;
        } 

        /**
         * <p>The region ID of the private gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the private gateway. For more information about the private gateway ID, see the private_gateway_id parameter returned by <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public DescribeGatewayRequest build() {
            return new DescribeGatewayRequest(this);
        } 

    } 

}
