// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link UpdateWaypointRequest} extends {@link RequestModel}
 *
 * <p>UpdateWaypointRequest</p>
 */
public class UpdateWaypointRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HPAEnabled")
    private Boolean HPAEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HPAMaxReplicas")
    private Integer HPAMaxReplicas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HPAMinReplicas")
    private Integer HPAMinReplicas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HPATargetCPU")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer HPATargetCPU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HPATargetMemory")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer HPATargetMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LimitCPU")
    private String limitCPU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LimitMemory")
    private String limitMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreferECI")
    private Boolean preferECI;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Integer replicas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestCPU")
    private String requestCPU;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestMemory")
    private String requestMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
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
         * <p>The ID of the cluster on the data plane.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce3c25e247da24f3aab9b7edfae83****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to enable Horizontal Pod Autoscaling (HPA).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder HPAEnabled(Boolean HPAEnabled) {
            this.putBodyParameter("HPAEnabled", HPAEnabled);
            this.HPAEnabled = HPAEnabled;
            return this;
        }

        /**
         * <p>The maximum number of waypoint proxy pods when HPA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder HPAMaxReplicas(Integer HPAMaxReplicas) {
            this.putBodyParameter("HPAMaxReplicas", HPAMaxReplicas);
            this.HPAMaxReplicas = HPAMaxReplicas;
            return this;
        }

        /**
         * <p>The minimum number of waypoint proxy pods when HPA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder HPAMinReplicas(Integer HPAMinReplicas) {
            this.putBodyParameter("HPAMinReplicas", HPAMinReplicas);
            this.HPAMinReplicas = HPAMinReplicas;
            return this;
        }

        /**
         * <p>The expected CPU utilization when HPA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>91</p>
         */
        public Builder HPATargetCPU(Integer HPATargetCPU) {
            this.putBodyParameter("HPATargetCPU", HPATargetCPU);
            this.HPATargetCPU = HPATargetCPU;
            return this;
        }

        /**
         * <p>The expected memory usage when HPA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        public Builder HPATargetMemory(Integer HPATargetMemory) {
            this.putBodyParameter("HPATargetMemory", HPATargetMemory);
            this.HPATargetMemory = HPATargetMemory;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores that are available to the waypoint proxy pods.</p>
         * 
         * <strong>example:</strong>
         * <p>2000m</p>
         */
        public Builder limitCPU(String limitCPU) {
            this.putBodyParameter("LimitCPU", limitCPU);
            this.limitCPU = limitCPU;
            return this;
        }

        /**
         * <p>The maximum size of the memory that is available to the waypoint proxy pods.</p>
         * 
         * <strong>example:</strong>
         * <p>1024Mi</p>
         */
        public Builder limitMemory(String limitMemory) {
            this.putBodyParameter("LimitMemory", limitMemory);
            this.limitMemory = limitMemory;
            return this;
        }

        /**
         * <p>Waypoint名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bookinfo-reviews</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Specifies whether to deploy waypoint proxy pods based on Elastic Container Instance (ECI).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder preferECI(Boolean preferECI) {
            this.putBodyParameter("PreferECI", preferECI);
            this.preferECI = preferECI;
            return this;
        }

        /**
         * <p>The number of waypoint proxy pods.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder replicas(Integer replicas) {
            this.putBodyParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * <p>The number of CPU cores requested by the waypoint proxy pods.</p>
         * 
         * <strong>example:</strong>
         * <p>100m</p>
         */
        public Builder requestCPU(String requestCPU) {
            this.putBodyParameter("RequestCPU", requestCPU);
            this.requestCPU = requestCPU;
            return this;
        }

        /**
         * <p>The size of the memory requested by the waypoint proxy pods.</p>
         * 
         * <strong>example:</strong>
         * <p>128Mi</p>
         */
        public Builder requestMemory(String requestMemory) {
            this.putBodyParameter("RequestMemory", requestMemory);
            this.requestMemory = requestMemory;
            return this;
        }

        /**
         * <p>The Service Mesh (ASM) instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
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
