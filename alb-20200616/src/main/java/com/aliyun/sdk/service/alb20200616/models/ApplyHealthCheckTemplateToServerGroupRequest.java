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

        private Builder(ApplyHealthCheckTemplateToServerGroupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.healthCheckTemplateId = response.healthCheckTemplateId;
            this.serverGroupId = response.serverGroupId;
        } 

        /**
         * 幂等Token
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * dryRun
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 健康检查模板Id
         */
        public Builder healthCheckTemplateId(String healthCheckTemplateId) {
            this.putQueryParameter("HealthCheckTemplateId", healthCheckTemplateId);
            this.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }

        /**
         * 服务器组Id
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
