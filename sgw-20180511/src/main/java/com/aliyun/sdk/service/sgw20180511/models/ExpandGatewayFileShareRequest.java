// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpandGatewayFileShareRequest} extends {@link RequestModel}
 *
 * <p>ExpandGatewayFileShareRequest</p>
 */
public class ExpandGatewayFileShareRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    private String gatewayId;

    @Query
    @NameInMap("IndexId")
    private String indexId;

    private ExpandGatewayFileShareRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.indexId = builder.indexId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpandGatewayFileShareRequest create() {
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
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    public static final class Builder extends Request.Builder<ExpandGatewayFileShareRequest, Builder> {
        private String gatewayId; 
        private String indexId; 

        private Builder() {
            super();
        } 

        private Builder(ExpandGatewayFileShareRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.indexId = request.indexId;
        } 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * IndexId.
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        @Override
        public ExpandGatewayFileShareRequest build() {
            return new ExpandGatewayFileShareRequest(this);
        } 

    } 

}
