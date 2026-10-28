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
 * {@link NodeSnapshot} extends {@link TeaModel}
 *
 * <p>NodeSnapshot</p>
 */
public class NodeSnapshot extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AncestorQuotaWorkloadNum")
    private Integer ancestorQuotaWorkloadNum;

    @com.aliyun.core.annotation.NameInMap("DescendantQuotaWorkloadNum")
    private Integer descendantQuotaWorkloadNum;

    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.NameInMap("RequestCPU")
    private String requestCPU;

    @com.aliyun.core.annotation.NameInMap("RequestGPU")
    private String requestGPU;

    @com.aliyun.core.annotation.NameInMap("RequestMemory")
    private String requestMemory;

    @com.aliyun.core.annotation.NameInMap("SelfQuotaWorkloadNum")
    private Integer selfQuotaWorkloadNum;

    @com.aliyun.core.annotation.NameInMap("WorkloadNum")
    private Integer workloadNum;

    @com.aliyun.core.annotation.NameInMap("Workloads")
    private java.util.List<Workloads> workloads;

    private NodeSnapshot(Builder builder) {
        this.ancestorQuotaWorkloadNum = builder.ancestorQuotaWorkloadNum;
        this.descendantQuotaWorkloadNum = builder.descendantQuotaWorkloadNum;
        this.nodeName = builder.nodeName;
        this.requestCPU = builder.requestCPU;
        this.requestGPU = builder.requestGPU;
        this.requestMemory = builder.requestMemory;
        this.selfQuotaWorkloadNum = builder.selfQuotaWorkloadNum;
        this.workloadNum = builder.workloadNum;
        this.workloads = builder.workloads;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeSnapshot create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ancestorQuotaWorkloadNum
     */
    public Integer getAncestorQuotaWorkloadNum() {
        return this.ancestorQuotaWorkloadNum;
    }

    /**
     * @return descendantQuotaWorkloadNum
     */
    public Integer getDescendantQuotaWorkloadNum() {
        return this.descendantQuotaWorkloadNum;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return requestCPU
     */
    public String getRequestCPU() {
        return this.requestCPU;
    }

    /**
     * @return requestGPU
     */
    public String getRequestGPU() {
        return this.requestGPU;
    }

    /**
     * @return requestMemory
     */
    public String getRequestMemory() {
        return this.requestMemory;
    }

    /**
     * @return selfQuotaWorkloadNum
     */
    public Integer getSelfQuotaWorkloadNum() {
        return this.selfQuotaWorkloadNum;
    }

    /**
     * @return workloadNum
     */
    public Integer getWorkloadNum() {
        return this.workloadNum;
    }

    /**
     * @return workloads
     */
    public java.util.List<Workloads> getWorkloads() {
        return this.workloads;
    }

    public static final class Builder {
        private Integer ancestorQuotaWorkloadNum; 
        private Integer descendantQuotaWorkloadNum; 
        private String nodeName; 
        private String requestCPU; 
        private String requestGPU; 
        private String requestMemory; 
        private Integer selfQuotaWorkloadNum; 
        private Integer workloadNum; 
        private java.util.List<Workloads> workloads; 

        private Builder() {
        } 

        private Builder(NodeSnapshot model) {
            this.ancestorQuotaWorkloadNum = model.ancestorQuotaWorkloadNum;
            this.descendantQuotaWorkloadNum = model.descendantQuotaWorkloadNum;
            this.nodeName = model.nodeName;
            this.requestCPU = model.requestCPU;
            this.requestGPU = model.requestGPU;
            this.requestMemory = model.requestMemory;
            this.selfQuotaWorkloadNum = model.selfQuotaWorkloadNum;
            this.workloadNum = model.workloadNum;
            this.workloads = model.workloads;
        } 

        /**
         * <p>The number of workloads using ancestor quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ancestorQuotaWorkloadNum(Integer ancestorQuotaWorkloadNum) {
            this.ancestorQuotaWorkloadNum = ancestorQuotaWorkloadNum;
            return this;
        }

        /**
         * <p>The number of workloads using descendant quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder descendantQuotaWorkloadNum(Integer descendantQuotaWorkloadNum) {
            this.descendantQuotaWorkloadNum = descendantQuotaWorkloadNum;
            return this;
        }

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>trains930928remn-master-0</p>
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The CPU usage.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder requestCPU(String requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }

        /**
         * <p>The GPU usage.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder requestGPU(String requestGPU) {
            this.requestGPU = requestGPU;
            return this;
        }

        /**
         * <p>The memory usage.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder requestMemory(String requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }

        /**
         * <p>The number of workloads using the current quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder selfQuotaWorkloadNum(Integer selfQuotaWorkloadNum) {
            this.selfQuotaWorkloadNum = selfQuotaWorkloadNum;
            return this;
        }

        /**
         * <p>The number of node workloads.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder workloadNum(Integer workloadNum) {
            this.workloadNum = workloadNum;
            return this;
        }

        /**
         * <p>The node workload snapshot.</p>
         */
        public Builder workloads(java.util.List<Workloads> workloads) {
            this.workloads = workloads;
            return this;
        }

        public NodeSnapshot build() {
            return new NodeSnapshot(this);
        } 

    } 

    /**
     * 
     * {@link NodeSnapshot} extends {@link TeaModel}
     *
     * <p>NodeSnapshot</p>
     */
    public static class Workloads extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("WorkloadId")
        private String workloadId;

        @com.aliyun.core.annotation.NameInMap("WorkloadType")
        private String workloadType;

        private Workloads(Builder builder) {
            this.name = builder.name;
            this.workloadId = builder.workloadId;
            this.workloadType = builder.workloadType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workloads create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return workloadId
         */
        public String getWorkloadId() {
            return this.workloadId;
        }

        /**
         * @return workloadType
         */
        public String getWorkloadType() {
            return this.workloadType;
        }

        public static final class Builder {
            private String name; 
            private String workloadId; 
            private String workloadType; 

            private Builder() {
            } 

            private Builder(Workloads model) {
                this.name = model.name;
                this.workloadId = model.workloadId;
                this.workloadType = model.workloadType;
            } 

            /**
             * <p>The corresponding queue unit name.</p>
             * 
             * <strong>example:</strong>
             * <p>dlc1yhisjtmqh15s-master-0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The workload ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dlcxxxx</p>
             */
            public Builder workloadId(String workloadId) {
                this.workloadId = workloadId;
                return this;
            }

            /**
             * <p>The workload type.</p>
             * 
             * <strong>example:</strong>
             * <p>dlc</p>
             */
            public Builder workloadType(String workloadType) {
                this.workloadType = workloadType;
                return this;
            }

            public Workloads build() {
                return new Workloads(this);
            } 

        } 

    }
}
