// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScalingClusterRequest} extends {@link RequestModel}
 *
 * <p>ScalingClusterRequest</p>
 */
public class ScalingClusterRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterSpecification")
    private String clusterSpecification;

    @Query
    @NameInMap("Cpu")
    private Integer cpu;

    @Query
    @NameInMap("InstanceCount")
    private Integer instanceCount;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MemoryCapacity")
    private Long memoryCapacity;

    private ScalingClusterRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterSpecification = builder.clusterSpecification;
        this.cpu = builder.cpu;
        this.instanceCount = builder.instanceCount;
        this.instanceId = builder.instanceId;
        this.memoryCapacity = builder.memoryCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clusterSpecification
     */
    public String getClusterSpecification() {
        return this.clusterSpecification;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return memoryCapacity
     */
    public Long getMemoryCapacity() {
        return this.memoryCapacity;
    }

    public static final class Builder extends Request.Builder<ScalingClusterRequest, Builder> {
        private String acceptLanguage; 
        private String clusterSpecification; 
        private Integer cpu; 
        private Integer instanceCount; 
        private String instanceId; 
        private Long memoryCapacity; 

        private Builder() {
            super();
        } 

        private Builder(ScalingClusterRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.clusterSpecification = response.clusterSpecification;
            this.cpu = response.cpu;
            this.instanceCount = response.instanceCount;
            this.instanceId = response.instanceId;
            this.memoryCapacity = response.memoryCapacity;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ClusterSpecification.
         */
        public Builder clusterSpecification(String clusterSpecification) {
            this.putQueryParameter("ClusterSpecification", clusterSpecification);
            this.clusterSpecification = clusterSpecification;
            return this;
        }

        /**
         * Cpu.
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * InstanceCount.
         */
        public Builder instanceCount(Integer instanceCount) {
            this.putQueryParameter("InstanceCount", instanceCount);
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MemoryCapacity.
         */
        public Builder memoryCapacity(Long memoryCapacity) {
            this.putQueryParameter("MemoryCapacity", memoryCapacity);
            this.memoryCapacity = memoryCapacity;
            return this;
        }

        @Override
        public ScalingClusterRequest build() {
            return new ScalingClusterRequest(this);
        } 

    } 

}
