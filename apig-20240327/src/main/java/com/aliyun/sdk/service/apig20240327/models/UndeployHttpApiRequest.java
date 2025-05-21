// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UndeployHttpApiRequest} extends {@link RequestModel}
 *
 * <p>UndeployHttpApiRequest</p>
 */
public class UndeployHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operationId")
    private String operationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeId")
    private String routeId;

    private UndeployHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.operationId = builder.operationId;
        this.routeId = builder.routeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UndeployHttpApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    public static final class Builder extends Request.Builder<UndeployHttpApiRequest, Builder> {
        private String httpApiId; 
        private String environmentId; 
        private String gatewayId; 
        private String operationId; 
        private String routeId; 

        private Builder() {
            super();
        } 

        private Builder(UndeployHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.environmentId = request.environmentId;
            this.gatewayId = request.gatewayId;
            this.operationId = request.operationId;
            this.routeId = request.routeId;
        } 

        /**
         * <p>HTTP API ID。</p>
         * 
         * <strong>example:</strong>
         * <p>api-cqu95allhtgii6***</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cqsmtellhtgvo***</p>
         */
        public Builder environmentId(String environmentId) {
            this.putBodyParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * operationId.
         */
        public Builder operationId(String operationId) {
            this.putBodyParameter("operationId", operationId);
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>Route ID. This must be provided when publishing the route of an HTTP API.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-cr82undlhtgrle***</p>
         */
        public Builder routeId(String routeId) {
            this.putBodyParameter("routeId", routeId);
            this.routeId = routeId;
            return this;
        }

        @Override
        public UndeployHttpApiRequest build() {
            return new UndeployHttpApiRequest(this);
        } 

    } 

}
