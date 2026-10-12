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
 * {@link CreateMigrationTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMigrationTaskRequest</p>
 */
public class CreateMigrationTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environmentId")
    @Deprecated
    private String environmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ingressClass")
    private String ingressClass;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("migrationType")
    private String migrationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("watchNamespace")
    private String watchNamespace;

    private CreateMigrationTaskRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.httpApiId = builder.httpApiId;
        this.ingressClass = builder.ingressClass;
        this.migrationType = builder.migrationType;
        this.watchNamespace = builder.watchNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrationTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return ingressClass
     */
    public String getIngressClass() {
        return this.ingressClass;
    }

    /**
     * @return migrationType
     */
    public String getMigrationType() {
        return this.migrationType;
    }

    /**
     * @return watchNamespace
     */
    public String getWatchNamespace() {
        return this.watchNamespace;
    }

    public static final class Builder extends Request.Builder<CreateMigrationTaskRequest, Builder> {
        private String clusterId; 
        private String description; 
        private String environmentId; 
        private String gatewayId; 
        private String httpApiId; 
        private String ingressClass; 
        private String migrationType; 
        private String watchNamespace; 

        private Builder() {
            super();
        } 

        private Builder(CreateMigrationTaskRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.description = request.description;
            this.environmentId = request.environmentId;
            this.gatewayId = request.gatewayId;
            this.httpApiId = request.httpApiId;
            this.ingressClass = request.ingressClass;
            this.migrationType = request.migrationType;
            this.watchNamespace = request.watchNamespace;
        } 

        /**
         * <p>The ID of the source ACK cluster. The value must be the same as the cluster specified in the IngressInfo of the API. Note: This parameter is actually required. If this parameter is not specified, the API returns 400 InvalidParameter.IsEmpty.</p>
         * 
         * <strong>example:</strong>
         * <p>c-xxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The description of the task. The description is stored only when the task is created.</p>
         * 
         * <strong>example:</strong>
         * <p>migration from Nginx</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the destination environment. The value must be the same as the Ingress import environment of the API. Note: This parameter is actually required. If this parameter is not specified, the API returns 400 InvalidParameter.IsEmpty. You can call ListEnvironments to query existing environment IDs. CreateEnvironment has been deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxxx</p>
         */
        public Builder environmentId(String environmentId) {
            this.putBodyParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>The ID of the destination gateway to which traffic is migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The HTTP API ID. The API must have been imported as an Ingress type (HttpIngress) API. Note: This parameter is actually required. If this parameter is not specified, the API returns 400 InvalidParameter.IsEmpty.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxxx</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putBodyParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>The Ingress class. If specified, the value must be the same as the API import configuration. Otherwise, an ingress class conflict error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        public Builder ingressClass(String ingressClass) {
            this.putBodyParameter("ingressClass", ingressClass);
            this.ingressClass = ingressClass;
            return this;
        }

        /**
         * <p>The migration type.
         * [_single.params.body.props.migrationType.enum.Nginx Ingress]Nginx Ingress migration.</p>
         * 
         * <strong>example:</strong>
         * <p>Nginx Ingress</p>
         */
        public Builder migrationType(String migrationType) {
            this.putBodyParameter("migrationType", migrationType);
            this.migrationType = migrationType;
            return this;
        }

        /**
         * <p>The watched namespace. If specified, the value must be the same as the API import configuration. Otherwise, a watchNamespace conflict error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder watchNamespace(String watchNamespace) {
            this.putBodyParameter("watchNamespace", watchNamespace);
            this.watchNamespace = watchNamespace;
            return this;
        }

        @Override
        public CreateMigrationTaskRequest build() {
            return new CreateMigrationTaskRequest(this);
        } 

    } 

}
