// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link GetPredictionRequest} extends {@link RequestModel}
 *
 * <p>GetPredictionRequest</p>
 */
public class GetPredictionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("deployment_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private GetPredictionRequest(Builder builder) {
        super(builder);
        this.deploymentId = builder.deploymentId;
        this.token = builder.token;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPredictionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GetPredictionRequest, Builder> {
        private String deploymentId; 
        private String token; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(GetPredictionRequest request) {
            super(request);
            this.deploymentId = request.deploymentId;
            this.token = request.token;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deploymentId(String deploymentId) {
            this.putPathParameter("deployment_id", deploymentId);
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putHeaderParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public GetPredictionRequest build() {
            return new GetPredictionRequest(this);
        } 

    } 

}
