// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayFileStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewayFileStatusRequest</p>
 */
public class DescribeGatewayFileStatusRequest extends Request {
    @Query
    @NameInMap("FilePath")
    @Validation(required = true)
    private String filePath;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IndexId")
    @Validation(required = true)
    private String indexId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeGatewayFileStatusRequest(Builder builder) {
        super(builder);
        this.filePath = builder.filePath;
        this.gatewayId = builder.gatewayId;
        this.indexId = builder.indexId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayFileStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeGatewayFileStatusRequest, Builder> {
        private String filePath; 
        private String gatewayId; 
        private String indexId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewayFileStatusRequest request) {
            super(request);
            this.filePath = request.filePath;
            this.gatewayId = request.gatewayId;
            this.indexId = request.indexId;
            this.securityToken = request.securityToken;
        } 

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeGatewayFileStatusRequest build() {
            return new DescribeGatewayFileStatusRequest(this);
        } 

    } 

}
