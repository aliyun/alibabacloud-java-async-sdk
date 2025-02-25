// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link DeleteHealthCheckTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DeleteHealthCheckTemplatesRequest</p>
 */
public class DeleteHealthCheckTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTemplateIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> healthCheckTemplateIds;

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
    public java.util.List<String> getHealthCheckTemplateIds() {
        return this.healthCheckTemplateIds;
    }

    public static final class Builder extends Request.Builder<DeleteHealthCheckTemplatesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List<String> healthCheckTemplateIds; 

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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a <strong>2xx HTTP</strong> status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The IDs of health check templates. You can specify at most 10 IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-123</p>
         */
        public Builder healthCheckTemplateIds(java.util.List<String> healthCheckTemplateIds) {
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
