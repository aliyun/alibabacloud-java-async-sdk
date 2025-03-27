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
 * {@link ListGatewayIntranetSupportedZoneRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayIntranetSupportedZoneRequest</p>
 */
public class ListGatewayIntranetSupportedZoneRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    private ListGatewayIntranetSupportedZoneRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayIntranetSupportedZoneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<ListGatewayIntranetSupportedZoneRequest, Builder> {
        private String gatewayId; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayIntranetSupportedZoneRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The private gateway ID. For more information about how to obtain the private gateway ID, see the GatewayId parameter in the response parameters of the <a href="https://apiworkbench.aliyun-inc.com/document/eas/2021-07-01/ListGateway?spm=openapi-amp.newDocPublishment.0.0.765e281fL2IcjJ&ampEnv=online">ListGateway</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The region ID of the private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public ListGatewayIntranetSupportedZoneRequest build() {
            return new ListGatewayIntranetSupportedZoneRequest(this);
        } 

    } 

}
