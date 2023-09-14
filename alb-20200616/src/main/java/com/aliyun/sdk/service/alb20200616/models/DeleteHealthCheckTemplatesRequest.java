// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHealthCheckTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DeleteHealthCheckTemplatesRequest</p>
 */
public class DeleteHealthCheckTemplatesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("HealthCheckTemplateIds")
    @Validation(required = true)
    private java.util.List < String > healthCheckTemplateIds;

    private DeleteHealthCheckTemplatesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.healthCheckTemplateIds = builder.healthCheckTemplateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHealthCheckTemplatesRequest create() {
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
     * @return healthCheckTemplateIds
     */
    public java.util.List < String > getHealthCheckTemplateIds() {
        return this.healthCheckTemplateIds;
    }

    public static final class Builder extends Request.Builder<DeleteHealthCheckTemplatesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < String > healthCheckTemplateIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHealthCheckTemplatesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.healthCheckTemplateIds = request.healthCheckTemplateIds;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
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
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a **2xx HTTP** status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the health check template.
         */
        public Builder healthCheckTemplateIds(java.util.List < String > healthCheckTemplateIds) {
            this.putQueryParameter("HealthCheckTemplateIds", healthCheckTemplateIds);
            this.healthCheckTemplateIds = healthCheckTemplateIds;
            return this;
        }

        @Override
        public DeleteHealthCheckTemplatesRequest build() {
            return new DeleteHealthCheckTemplatesRequest(this);
        } 

    } 

}
