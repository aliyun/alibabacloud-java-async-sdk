// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link QuotaDetails} extends {@link TeaModel}
 *
 * <p>QuotaDetails</p>
 */
public class QuotaDetails extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActualMinQuota")
    private ResourceAmount actualMinQuota;

    @com.aliyun.core.annotation.NameInMap("AllocatableQuota")
    private ResourceAmount allocatableQuota;

    @com.aliyun.core.annotation.NameInMap("AllocatedQuota")
    private ResourceAmount allocatedQuota;

    @com.aliyun.core.annotation.NameInMap("AncestorsAllocatedQuota")
    private ResourceAmount ancestorsAllocatedQuota;

    @com.aliyun.core.annotation.NameInMap("DescendantsAllocatedQuota")
    private ResourceAmount descendantsAllocatedQuota;

    @com.aliyun.core.annotation.NameInMap("DesiredMinQuota")
    private ResourceAmount desiredMinQuota;

    @com.aliyun.core.annotation.NameInMap("NodeStatistics")
    private QuotaNodeStatistics nodeStatistics;

    @com.aliyun.core.annotation.NameInMap("RequestedQuota")
    private ResourceAmount requestedQuota;

    @com.aliyun.core.annotation.NameInMap("SelfAllocatedQuota")
    private ResourceAmount selfAllocatedQuota;

    @com.aliyun.core.annotation.NameInMap("SelfSubmittedQuota")
    private ResourceAmount selfSubmittedQuota;

    @com.aliyun.core.annotation.NameInMap("SystemReservedQuota")
    private ResourceAmount systemReservedQuota;

    @com.aliyun.core.annotation.NameInMap("UsedQuota")
    private ResourceAmount usedQuota;

    private QuotaDetails(Builder builder) {
        this.actualMinQuota = builder.actualMinQuota;
        this.allocatableQuota = builder.allocatableQuota;
        this.allocatedQuota = builder.allocatedQuota;
        this.ancestorsAllocatedQuota = builder.ancestorsAllocatedQuota;
        this.descendantsAllocatedQuota = builder.descendantsAllocatedQuota;
        this.desiredMinQuota = builder.desiredMinQuota;
        this.nodeStatistics = builder.nodeStatistics;
        this.requestedQuota = builder.requestedQuota;
        this.selfAllocatedQuota = builder.selfAllocatedQuota;
        this.selfSubmittedQuota = builder.selfSubmittedQuota;
        this.systemReservedQuota = builder.systemReservedQuota;
        this.usedQuota = builder.usedQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaDetails create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actualMinQuota
     */
    public ResourceAmount getActualMinQuota() {
        return this.actualMinQuota;
    }

    /**
     * @return allocatableQuota
     */
    public ResourceAmount getAllocatableQuota() {
        return this.allocatableQuota;
    }

    /**
     * @return allocatedQuota
     */
    public ResourceAmount getAllocatedQuota() {
        return this.allocatedQuota;
    }

    /**
     * @return ancestorsAllocatedQuota
     */
    public ResourceAmount getAncestorsAllocatedQuota() {
        return this.ancestorsAllocatedQuota;
    }

    /**
     * @return descendantsAllocatedQuota
     */
    public ResourceAmount getDescendantsAllocatedQuota() {
        return this.descendantsAllocatedQuota;
    }

    /**
     * @return desiredMinQuota
     */
    public ResourceAmount getDesiredMinQuota() {
        return this.desiredMinQuota;
    }

    /**
     * @return nodeStatistics
     */
    public QuotaNodeStatistics getNodeStatistics() {
        return this.nodeStatistics;
    }

    /**
     * @return requestedQuota
     */
    public ResourceAmount getRequestedQuota() {
        return this.requestedQuota;
    }

    /**
     * @return selfAllocatedQuota
     */
    public ResourceAmount getSelfAllocatedQuota() {
        return this.selfAllocatedQuota;
    }

    /**
     * @return selfSubmittedQuota
     */
    public ResourceAmount getSelfSubmittedQuota() {
        return this.selfSubmittedQuota;
    }

    /**
     * @return systemReservedQuota
     */
    public ResourceAmount getSystemReservedQuota() {
        return this.systemReservedQuota;
    }

    /**
     * @return usedQuota
     */
    public ResourceAmount getUsedQuota() {
        return this.usedQuota;
    }

    public static final class Builder {
        private ResourceAmount actualMinQuota; 
        private ResourceAmount allocatableQuota; 
        private ResourceAmount allocatedQuota; 
        private ResourceAmount ancestorsAllocatedQuota; 
        private ResourceAmount descendantsAllocatedQuota; 
        private ResourceAmount desiredMinQuota; 
        private QuotaNodeStatistics nodeStatistics; 
        private ResourceAmount requestedQuota; 
        private ResourceAmount selfAllocatedQuota; 
        private ResourceAmount selfSubmittedQuota; 
        private ResourceAmount systemReservedQuota; 
        private ResourceAmount usedQuota; 

        private Builder() {
        } 

        private Builder(QuotaDetails model) {
            this.actualMinQuota = model.actualMinQuota;
            this.allocatableQuota = model.allocatableQuota;
            this.allocatedQuota = model.allocatedQuota;
            this.ancestorsAllocatedQuota = model.ancestorsAllocatedQuota;
            this.descendantsAllocatedQuota = model.descendantsAllocatedQuota;
            this.desiredMinQuota = model.desiredMinQuota;
            this.nodeStatistics = model.nodeStatistics;
            this.requestedQuota = model.requestedQuota;
            this.selfAllocatedQuota = model.selfAllocatedQuota;
            this.selfSubmittedQuota = model.selfSubmittedQuota;
            this.systemReservedQuota = model.systemReservedQuota;
            this.usedQuota = model.usedQuota;
        } 

        /**
         * <p>The total MinQuota actually allocated. For example, if the user configured 10 nodes but only 8 nodes are actually bound, this value returns the total resources of the 8 nodes.</p>
         */
        public Builder actualMinQuota(ResourceAmount actualMinQuota) {
            this.actualMinQuota = actualMinQuota;
            return this;
        }

        /**
         * <p>The user-allocatable quota amount. For general computing resources, each node has system-reserved resources. This value represents the quota resources that user workloads can occupy.
         * ActualMin = AllocatableQuota + SystemReservedQuota.</p>
         */
        public Builder allocatableQuota(ResourceAmount allocatableQuota) {
            this.allocatableQuota = allocatableQuota;
            return this;
        }

        /**
         * <p>The total quota usage information, which is the total resources occupied by workloads after scheduling to nodes.</p>
         */
        public Builder allocatedQuota(ResourceAmount allocatedQuota) {
            this.allocatedQuota = allocatedQuota;
            return this;
        }

        /**
         * <p>The ancestor quota usage information, which is the total resources of workloads submitted using ancestor quotas after they are scheduled to nodes.</p>
         */
        public Builder ancestorsAllocatedQuota(ResourceAmount ancestorsAllocatedQuota) {
            this.ancestorsAllocatedQuota = ancestorsAllocatedQuota;
            return this;
        }

        /**
         * <p>The descendant quota usage information, which is the total resources of workloads submitted using descendant quotas after they are scheduled to nodes.</p>
         */
        public Builder descendantsAllocatedQuota(ResourceAmount descendantsAllocatedQuota) {
            this.descendantsAllocatedQuota = descendantsAllocatedQuota;
            return this;
        }

        /**
         * <p>The total MinQuota desired by the user.</p>
         */
        public Builder desiredMinQuota(ResourceAmount desiredMinQuota) {
            this.desiredMinQuota = desiredMinQuota;
            return this;
        }

        /**
         * <p>The statistics information of nodes within the quota.</p>
         */
        public Builder nodeStatistics(QuotaNodeStatistics nodeStatistics) {
            this.nodeStatistics = nodeStatistics;
            return this;
        }

        /**
         * <p>The quota requested amount, which is the total resources occupied by workloads after they are dequeued.</p>
         */
        public Builder requestedQuota(ResourceAmount requestedQuota) {
            this.requestedQuota = requestedQuota;
            return this;
        }

        /**
         * <p>The current-level quota usage information, which is the total resources of workloads submitted using this quota after they are scheduled to nodes.</p>
         */
        public Builder selfAllocatedQuota(ResourceAmount selfAllocatedQuota) {
            this.selfAllocatedQuota = selfAllocatedQuota;
            return this;
        }

        /**
         * <p>The amount submitted to this quota, which is the total resources of workloads submitted to this quota, including workloads that are queued.</p>
         */
        public Builder selfSubmittedQuota(ResourceAmount selfSubmittedQuota) {
            this.selfSubmittedQuota = selfSubmittedQuota;
            return this;
        }

        /**
         * <p>The system-reserved quota amount.</p>
         */
        public Builder systemReservedQuota(ResourceAmount systemReservedQuota) {
            this.systemReservedQuota = systemReservedQuota;
            return this;
        }

        /**
         * <p>The quota used amount. This field is deprecating. Use AllocatedQuota instead.</p>
         */
        public Builder usedQuota(ResourceAmount usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }

        public QuotaDetails build() {
            return new QuotaDetails(this);
        } 

    } 

}
