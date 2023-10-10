// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateK8sServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateK8sServiceRequest</p>
 */
public class CreateK8sServiceRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ExternalTrafficPolicy")
    private String externalTrafficPolicy;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ServicePorts")
    @Validation(required = true)
    private String servicePorts;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateK8sServiceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.externalTrafficPolicy = builder.externalTrafficPolicy;
        this.name = builder.name;
        this.servicePorts = builder.servicePorts;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateK8sServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return externalTrafficPolicy
     */
    public String getExternalTrafficPolicy() {
        return this.externalTrafficPolicy;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return servicePorts
     */
    public String getServicePorts() {
        return this.servicePorts;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateK8sServiceRequest, Builder> {
        private String appId; 
        private String externalTrafficPolicy; 
        private String name; 
        private String servicePorts; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateK8sServiceRequest request) {
            super(request);
            this.appId = request.appId;
            this.externalTrafficPolicy = request.externalTrafficPolicy;
            this.name = request.name;
            this.servicePorts = request.servicePorts;
            this.type = request.type;
        } 

        /**
         * The application ID.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The policy used for external traffic management. Valid values:
         * <p>
         * 
         * *   Local: The network traffic can be routed to pods on the node where the Service is deployed.
         * *   Cluster: The network traffic can be routed to pods on other nodes in the cluster.
         * 
         * Default value: Local.
         */
        public Builder externalTrafficPolicy(String externalTrafficPolicy) {
            this.putQueryParameter("ExternalTrafficPolicy", externalTrafficPolicy);
            this.externalTrafficPolicy = externalTrafficPolicy;
            return this;
        }

        /**
         * The name of the Kubernetes Service.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The port mapping of the Kubernetes Service. Set this parameter to a JSON array. The following parameters are included in the configurations:
         * <p>
         * 
         * *   **protocol**: the protocol used by the Service. Valid values: TCP and UDP. This parameter is mandatory.
         * *   **port**: the frontend service port. Valid values: 1 to 65535. This parameter is mandatory.
         * *   **targetPort**: the backend container port. Valid values: 1 to 65535. This parameter is mandatory.
         * 
         * Example: `[{"protocol": "TCP", "port": 80, "targetPort": 8080},{"protocol": "TCP", "port": 81, "targetPort": 8081}]`
         */
        public Builder servicePorts(String servicePorts) {
            this.putQueryParameter("ServicePorts", servicePorts);
            this.servicePorts = servicePorts;
            return this;
        }

        /**
         * The type of the Kubernetes Service. Set the value to ClusterIP.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateK8sServiceRequest build() {
            return new CreateK8sServiceRequest(this);
        } 

    } 

}
