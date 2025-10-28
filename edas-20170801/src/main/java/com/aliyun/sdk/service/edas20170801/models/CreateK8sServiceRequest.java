// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link CreateK8sServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateK8sServiceRequest</p>
 */
public class CreateK8sServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalTrafficPolicy")
    private String externalTrafficPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicePorts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String servicePorts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5a166fbd-<strong><strong>-</strong></strong>-a286-781659d9f54c</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The policy used for external traffic management. Valid values:</p>
         * <ul>
         * <li>Local: The network traffic can be routed to pods on the node where the Service is deployed.</li>
         * <li>Cluster: The network traffic can be routed to pods on other nodes in the cluster.</li>
         * </ul>
         * <p>Default value: Local.</p>
         * 
         * <strong>example:</strong>
         * <p>Local</p>
         */
        public Builder externalTrafficPolicy(String externalTrafficPolicy) {
            this.putQueryParameter("ExternalTrafficPolicy", externalTrafficPolicy);
            this.externalTrafficPolicy = externalTrafficPolicy;
            return this;
        }

        /**
         * <p>The name of the Kubernetes Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-http</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The port mapping of the Kubernetes Service. Set this parameter to a JSON array. The following parameters are included in the configurations:</p>
         * <ul>
         * <li><strong>protocol</strong>: the protocol used by the Service. Valid values: TCP and UDP. This parameter is mandatory.</li>
         * <li><strong>port</strong>: the frontend service port. Valid values: 1 to 65535. This parameter is mandatory.</li>
         * <li><strong>targetPort</strong>: the backend container port. Valid values: 1 to 65535. This parameter is mandatory.</li>
         * </ul>
         * <p>Example: <code>[{&quot;protocol&quot;: &quot;TCP&quot;, &quot;port&quot;: 80, &quot;targetPort&quot;: 8080},{&quot;protocol&quot;: &quot;TCP&quot;, &quot;port&quot;: 81, &quot;targetPort&quot;: 8081}]</code></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;protocol&quot;:&quot;TCP&quot;,&quot;port&quot;:80,&quot;targetPort&quot;:8080}]</p>
         */
        public Builder servicePorts(String servicePorts) {
            this.putQueryParameter("ServicePorts", servicePorts);
            this.servicePorts = servicePorts;
            return this;
        }

        /**
         * <p>The type of the Kubernetes Service. Set the value to ClusterIP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterIP</p>
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
