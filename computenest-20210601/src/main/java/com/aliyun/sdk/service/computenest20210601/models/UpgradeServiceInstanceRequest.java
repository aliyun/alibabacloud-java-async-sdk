// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link UpgradeServiceInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpgradeServiceInstanceRequest</p>
 */
public class UpgradeServiceInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    private UpgradeServiceInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.serviceVersion = builder.serviceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeServiceInstanceRequest create() {
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
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public static final class Builder extends Request.Builder<UpgradeServiceInstanceRequest, Builder> {
        private String clientToken; 
        private String dryRun; 
        private java.util.Map<String, ?> parameters; 
        private String regionId; 
        private String serviceInstanceId; 
        private String serviceVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeServiceInstanceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.serviceInstanceId = request.serviceInstanceId;
            this.serviceVersion = request.serviceVersion;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run for the request to check information such as the permissions and instance status. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run for the request, but does not upgrade service instance.</li>
         * <li><strong>false</strong>: performs a dry run for the request, and upgrade service instance if the request passes the dry run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The parameters required for the upgrade. This parameter is required if the destination version of the service has new parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;RegionId&quot;: &quot;cn-hangzhou&quot;, &quot;InstanceType&quot;: &quot;ecs.g5.large&quot;}</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4bxxxxxx</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * <p>The destination version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        @Override
        public UpgradeServiceInstanceRequest build() {
            return new UpgradeServiceInstanceRequest(this);
        } 

    } 

}
