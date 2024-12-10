// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * ClusterId.
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
