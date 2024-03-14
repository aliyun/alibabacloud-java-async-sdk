// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewayLogsRequest</p>
 */
public class DescribeGatewayLogsRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("LogFilePath")
    private String logFilePath;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeGatewayLogsRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.logFilePath = builder.logFilePath;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayLogsRequest create() {
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
     * @return logFilePath
     */
    public String getLogFilePath() {
        return this.logFilePath;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeGatewayLogsRequest, Builder> {
        private String gatewayId; 
        private String logFilePath; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewayLogsRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.logFilePath = request.logFilePath;
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
         * LogFilePath.
         */
        public Builder logFilePath(String logFilePath) {
            this.putQueryParameter("LogFilePath", logFilePath);
            this.logFilePath = logFilePath;
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
        public DescribeGatewayLogsRequest build() {
            return new DescribeGatewayLogsRequest(this);
        } 

    } 

}
