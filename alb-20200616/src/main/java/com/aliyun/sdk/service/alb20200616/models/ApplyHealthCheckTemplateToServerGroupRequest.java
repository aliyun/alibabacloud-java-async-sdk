// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyHealthCheckTemplateToServerGroupRequest} extends {@link RequestModel}
 *
 * <p>ApplyHealthCheckTemplateToServerGroupRequest</p>
 */
public class ApplyHealthCheckTemplateToServerGroupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("HealthCheckTemplateId")
    @Validation(required = true)
    private String healthCheckTemplateId;

    @Query
    @NameInMap("ServerGroupId")
    @Validation(required = true)
    private String serverGroupId;

    private ApplyHealthCheckTemplateToServerGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.healthCheckTemplateId = builder.healthCheckTemplateId;
        this.serverGroupId = builder.serverGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyHealthCheckTemplateToServerGroupRequest create() {
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
     * @return healthCheckTemplateId
     */
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    /**
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public static final class Builder extends Request.Builder<ApplyHealthCheckTemplateToServerGroupRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String healthCheckTemplateId; 
        private String serverGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyHealthCheckTemplateToServerGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.healthCheckTemplateId = request.healthCheckTemplateId;
            this.serverGroupId = request.serverGroupId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The template ID.
         */
        public Builder healthCheckTemplateId(String healthCheckTemplateId) {
            this.putQueryParameter("HealthCheckTemplateId", healthCheckTemplateId);
            this.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }

        /**
         * The server group ID.
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putQueryParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        @Override
        public ApplyHealthCheckTemplateToServerGroupRequest build() {
            return new ApplyHealthCheckTemplateToServerGroupRequest(this);
        } 

    } 

}
