// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVmAppToMeshRequest} extends {@link RequestModel}
 *
 * <p>AddVmAppToMeshRequest</p>
 */
public class AddVmAppToMeshRequest extends Request {
    @Query
    @NameInMap("Annotations")
    private String annotations;

    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("Ips")
    @Validation(required = true)
    private String ips;

    @Query
    @NameInMap("Labels")
    @Validation(required = true)
    private String labels;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("Ports")
    @Validation(required = true)
    private String ports;

    @Query
    @NameInMap("ServiceAccount")
    private String serviceAccount;

    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    private AddVmAppToMeshRequest(Builder builder) {
        super(builder);
        this.annotations = builder.annotations;
        this.force = builder.force;
        this.ips = builder.ips;
        this.labels = builder.labels;
        this.namespace = builder.namespace;
        this.ports = builder.ports;
        this.serviceAccount = builder.serviceAccount;
        this.serviceMeshId = builder.serviceMeshId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVmAppToMeshRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotations
     */
    public String getAnnotations() {
        return this.annotations;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return ips
     */
    public String getIps() {
        return this.ips;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return ports
     */
    public String getPorts() {
        return this.ports;
    }

    /**
     * @return serviceAccount
     */
    public String getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<AddVmAppToMeshRequest, Builder> {
        private String annotations; 
        private Boolean force; 
        private String ips; 
        private String labels; 
        private String namespace; 
        private String ports; 
        private String serviceAccount; 
        private String serviceMeshId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(AddVmAppToMeshRequest response) {
            super(response);
            this.annotations = response.annotations;
            this.force = response.force;
            this.ips = response.ips;
            this.labels = response.labels;
            this.namespace = response.namespace;
            this.ports = response.ports;
            this.serviceAccount = response.serviceAccount;
            this.serviceMeshId = response.serviceMeshId;
            this.serviceName = response.serviceName;
        } 

        /**
         * Annotations.
         */
        public Builder annotations(String annotations) {
            this.putQueryParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * Ips.
         */
        public Builder ips(String ips) {
            this.putQueryParameter("Ips", ips);
            this.ips = ips;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Ports.
         */
        public Builder ports(String ports) {
            this.putQueryParameter("Ports", ports);
            this.ports = ports;
            return this;
        }

        /**
         * ServiceAccount.
         */
        public Builder serviceAccount(String serviceAccount) {
            this.putQueryParameter("ServiceAccount", serviceAccount);
            this.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public AddVmAppToMeshRequest build() {
            return new AddVmAppToMeshRequest(this);
        } 

    } 

}
