// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWaypointRequest} extends {@link RequestModel}
 *
 * <p>UpdateWaypointRequest</p>
 */
public class UpdateWaypointRequest extends Request {
    @Body
    @NameInMap("ClusterId")
    @Validation(required = true, minLength = 1)
    private String clusterId;

    @Body
    @NameInMap("HPAEnabled")
    private Boolean HPAEnabled;

    @Body
    @NameInMap("HPAMaxReplicas")
    private Integer HPAMaxReplicas;

    @Body
    @NameInMap("HPAMinReplicas")
    private Integer HPAMinReplicas;

    @Body
    @NameInMap("HPATargetCPU")
    @Validation(maximum = 100)
    private Integer HPATargetCPU;

    @Body
    @NameInMap("HPATargetMemory")
    @Validation(maximum = 100)
    private Integer HPATargetMemory;

    @Body
    @NameInMap("LimitCPU")
    private String limitCPU;

    @Body
    @NameInMap("LimitMemory")
    private String limitMemory;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("PreferECI")
    private Boolean preferECI;

    @Body
    @NameInMap("Replicas")
    private Integer replicas;

    @Body
    @NameInMap("RequestCPU")
    private String requestCPU;

    @Body
    @NameInMap("RequestMemory")
    private String requestMemory;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true, minLength = 1)
    private String serviceMeshId;

    private UpdateWaypointRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.HPAEnabled = builder.HPAEnabled;
        this.HPAMaxReplicas = builder.HPAMaxReplicas;
        this.HPAMinReplicas = builder.HPAMinReplicas;
        this.HPATargetCPU = builder.HPATargetCPU;
        this.HPATargetMemory = builder.HPATargetMemory;
        this.limitCPU = builder.limitCPU;
        this.limitMemory = builder.limitMemory;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.preferECI = builder.preferECI;
        this.replicas = builder.replicas;
        this.requestCPU = builder.requestCPU;
        this.requestMemory = builder.requestMemory;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWaypointRequest create() {
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
     * @return HPAEnabled
     */
    public Boolean getHPAEnabled() {
        return this.HPAEnabled;
    }

    /**
     * @return HPAMaxReplicas
     */
    public Integer getHPAMaxReplicas() {
        return this.HPAMaxReplicas;
    }

    /**
     * @return HPAMinReplicas
     */
    public Integer getHPAMinReplicas() {
        return this.HPAMinReplicas;
    }

    /**
     * @return HPATargetCPU
     */
    public Integer getHPATargetCPU() {
        return this.HPATargetCPU;
    }

    /**
     * @return HPATargetMemory
     */
    public Integer getHPATargetMemory() {
        return this.HPATargetMemory;
    }

    /**
     * @return limitCPU
     */
    public String getLimitCPU() {
        return this.limitCPU;
    }

    /**
     * @return limitMemory
     */
    public String getLimitMemory() {
        return this.limitMemory;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return preferECI
     */
    public Boolean getPreferECI() {
        return this.preferECI;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return requestCPU
     */
    public String getRequestCPU() {
        return this.requestCPU;
    }

    /**
     * @return requestMemory
     */
    public String getRequestMemory() {
        return this.requestMemory;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<UpdateWaypointRequest, Builder> {
        private String clusterId; 
        private Boolean HPAEnabled; 
        private Integer HPAMaxReplicas; 
        private Integer HPAMinReplicas; 
        private Integer HPATargetCPU; 
        private Integer HPATargetMemory; 
        private String limitCPU; 
        private String limitMemory; 
        private String name; 
        private String namespace; 
        private Boolean preferECI; 
        private Integer replicas; 
        private String requestCPU; 
        private String requestMemory; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWaypointRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.HPAEnabled = request.HPAEnabled;
            this.HPAMaxReplicas = request.HPAMaxReplicas;
            this.HPAMinReplicas = request.HPAMinReplicas;
            this.HPATargetCPU = request.HPATargetCPU;
            this.HPATargetMemory = request.HPATargetMemory;
            this.limitCPU = request.limitCPU;
            this.limitMemory = request.limitMemory;
            this.name = request.name;
            this.namespace = request.namespace;
            this.preferECI = request.preferECI;
            this.replicas = request.replicas;
            this.requestCPU = request.requestCPU;
            this.requestMemory = request.requestMemory;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The ID of the cluster on the data plane.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to enable Horizontal Pod Autoscaling (HPA).
         */
        public Builder HPAEnabled(Boolean HPAEnabled) {
            this.putBodyParameter("HPAEnabled", HPAEnabled);
            this.HPAEnabled = HPAEnabled;
            return this;
        }

        /**
         * The maximum number of waypoint proxy pods when HPA is enabled.
         */
        public Builder HPAMaxReplicas(Integer HPAMaxReplicas) {
            this.putBodyParameter("HPAMaxReplicas", HPAMaxReplicas);
            this.HPAMaxReplicas = HPAMaxReplicas;
            return this;
        }

        /**
         * The minimum number of waypoint proxy pods when HPA is enabled.
         */
        public Builder HPAMinReplicas(Integer HPAMinReplicas) {
            this.putBodyParameter("HPAMinReplicas", HPAMinReplicas);
            this.HPAMinReplicas = HPAMinReplicas;
            return this;
        }

        /**
         * The expected CPU utilization when HPA is enabled.
         */
        public Builder HPATargetCPU(Integer HPATargetCPU) {
            this.putBodyParameter("HPATargetCPU", HPATargetCPU);
            this.HPATargetCPU = HPATargetCPU;
            return this;
        }

        /**
         * The expected memory usage when HPA is enabled.
         */
        public Builder HPATargetMemory(Integer HPATargetMemory) {
            this.putBodyParameter("HPATargetMemory", HPATargetMemory);
            this.HPATargetMemory = HPATargetMemory;
            return this;
        }

        /**
         * The maximum number of CPU cores that are available to the waypoint proxy pods.
         */
        public Builder limitCPU(String limitCPU) {
            this.putBodyParameter("LimitCPU", limitCPU);
            this.limitCPU = limitCPU;
            return this;
        }

        /**
         * The maximum size of the memory that is available to the waypoint proxy pods.
         */
        public Builder limitMemory(String limitMemory) {
            this.putBodyParameter("LimitMemory", limitMemory);
            this.limitMemory = limitMemory;
            return this;
        }

        /**
         * Waypoint名称。
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Specifies whether to deploy waypoint proxy pods based on Elastic Container Instance (ECI).
         */
        public Builder preferECI(Boolean preferECI) {
            this.putBodyParameter("PreferECI", preferECI);
            this.preferECI = preferECI;
            return this;
        }

        /**
         * The number of waypoint proxy pods.
         */
        public Builder replicas(Integer replicas) {
            this.putBodyParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * The number of CPU cores requested by the waypoint proxy pods.
         */
        public Builder requestCPU(String requestCPU) {
            this.putBodyParameter("RequestCPU", requestCPU);
            this.requestCPU = requestCPU;
            return this;
        }

        /**
         * The size of the memory requested by the waypoint proxy pods.
         */
        public Builder requestMemory(String requestMemory) {
            this.putBodyParameter("RequestMemory", requestMemory);
            this.requestMemory = requestMemory;
            return this;
        }

        /**
         * The Service Mesh (ASM) instance ID.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public UpdateWaypointRequest build() {
            return new UpdateWaypointRequest(this);
        } 

    } 

}
