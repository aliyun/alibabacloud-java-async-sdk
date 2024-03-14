// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayFileSharesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewayFileSharesRequest</p>
 */
public class DescribeGatewayFileSharesRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IndexId")
    private String indexId;

    @Query
    @NameInMap("Refresh")
    private Boolean refresh;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeGatewayFileSharesRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.indexId = builder.indexId;
        this.refresh = builder.refresh;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayFileSharesRequest create() {
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

    /**
     * @return refresh
     */
    public Boolean getRefresh() {
        return this.refresh;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeGatewayFileSharesRequest, Builder> {
        private String gatewayId; 
        private String indexId; 
        private Boolean refresh; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewayFileSharesRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.indexId = request.indexId;
            this.refresh = request.refresh;
            this.securityToken = request.securityToken;
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

        /**
         * Refresh.
         */
        public Builder refresh(Boolean refresh) {
            this.putQueryParameter("Refresh", refresh);
            this.refresh = refresh;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeGatewayFileSharesRequest build() {
            return new DescribeGatewayFileSharesRequest(this);
        } 

    } 

}
