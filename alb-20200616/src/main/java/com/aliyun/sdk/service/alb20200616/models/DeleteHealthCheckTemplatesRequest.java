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

        private Builder(DeleteHealthCheckTemplatesRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.healthCheckTemplateIds = response.healthCheckTemplateIds;
        } 

        /**
         * 幂等token
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
         * 健康检查模板Id列表
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
