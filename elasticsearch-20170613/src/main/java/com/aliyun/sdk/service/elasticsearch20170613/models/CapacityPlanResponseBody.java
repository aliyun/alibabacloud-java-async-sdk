// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CapacityPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CapacityPlanResponseBody</p>
 */
public class CapacityPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CapacityPlanResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CapacityPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The response of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The extension configuration information.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CapacityPlanResponseBody build() {
            return new CapacityPlanResponseBody(this);
        } 

    } 

    public static class ExtendConfigs extends TeaModel {
        @NameInMap("ConfigType")
        private String configType;

        @NameInMap("Disk")
        private Long disk;

        @NameInMap("DiskType")
        private String diskType;

        private ExtendConfigs(Builder builder) {
            this.configType = builder.configType;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendConfigs create() {
            return builder().build();
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return disk
         */
        public Long getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        public static final class Builder {
            private String configType; 
            private Long disk; 
            private String diskType; 

            /**
             * The size of the disk. Unit: GiB.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * The type of the disk. Valid value: CPFS_PREMIUM.
             * <p>
             * 
             * >  The extendConfigs attribute that may occur when the planned instance type is enhanced (advanced).
             */
            public Builder disk(Long disk) {
                this.disk = disk;
                return this;
            }

            /**
             * The version type. Valid values:
             * <p>
             * 
             * *   advanced: enhanced edition
             * *   x-pack: Commercial Edition
             * *   community: community version
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            public ExtendConfigs build() {
                return new ExtendConfigs(this);
            } 

        } 

    }
    public static class NodeConfigurations extends TeaModel {
        @NameInMap("Amount")
        private Long amount;

        @NameInMap("Cpu")
        private Long cpu;

        @NameInMap("Disk")
        private Long disk;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("Memory")
        private Long memory;

        @NameInMap("NodeType")
        private String nodeType;

        private NodeConfigurations(Builder builder) {
            this.amount = builder.amount;
            this.cpu = builder.cpu;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.memory = builder.memory;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeConfigurations create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return cpu
         */
        public Long getCpu() {
            return this.cpu;
        }

        /**
         * @return disk
         */
        public Long getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private Long amount; 
            private Long cpu; 
            private Long disk; 
            private String diskType; 
            private Long memory; 
            private String nodeType; 

            /**
             * The number of CPUs of the cloud desktop.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * The size of the disk. Unit: GiB.
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The type of the hard disk. Valid values:
             * <p>
             * 
             * *   cloud_essd: enhanced SSD (ESSD)
             * *   cloud_ssd: standard SSD
             * *   cloud_efficiency: ultra disk
             * *   local_ssd: local SSD
             * *   local_efficiency: local ultra disk
             */
            public Builder disk(Long disk) {
                this.disk = disk;
                return this;
            }

            /**
             * The memory size of the current node role.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The type of the node. Supported types are as follows:
             * <p>
             * 
             * *   WORKER: data node
             * *   WORKER_WARM: cold data node
             * *   MASTER: dedicated master node
             * *   KIBANA: Kibana node
             * *   COORDINATING: client node
             * *   ELASTIC_WORKER: elastic node
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The result calculated based on the capacity planning. No default value is available. The values are as follows:
             * <p>
             * 
             * *   true: indicates that the number of data nodes calculated by capacity planning exceeds the threshold of 50.
             * *   false: The number of data nodes calculated by capacity planning is less than 50.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public NodeConfigurations build() {
                return new NodeConfigurations(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("ExtendConfigs")
        private java.util.List < ExtendConfigs> extendConfigs;

        @NameInMap("InstanceCategory")
        private String instanceCategory;

        @NameInMap("NodeConfigurations")
        private java.util.List < NodeConfigurations> nodeConfigurations;

        @NameInMap("OversizedCluster")
        private Boolean oversizedCluster;

        private Result(Builder builder) {
            this.extendConfigs = builder.extendConfigs;
            this.instanceCategory = builder.instanceCategory;
            this.nodeConfigurations = builder.nodeConfigurations;
            this.oversizedCluster = builder.oversizedCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return extendConfigs
         */
        public java.util.List < ExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        /**
         * @return instanceCategory
         */
        public String getInstanceCategory() {
            return this.instanceCategory;
        }

        /**
         * @return nodeConfigurations
         */
        public java.util.List < NodeConfigurations> getNodeConfigurations() {
            return this.nodeConfigurations;
        }

        /**
         * @return oversizedCluster
         */
        public Boolean getOversizedCluster() {
            return this.oversizedCluster;
        }

        public static final class Builder {
            private java.util.List < ExtendConfigs> extendConfigs; 
            private String instanceCategory; 
            private java.util.List < NodeConfigurations> nodeConfigurations; 
            private Boolean oversizedCluster; 

            /**
             * The type of the configuration. Set the value to sharedDisk.
             * <p>
             * 
             * >  The extendConfigs attribute that may occur when the planned instance type is enhanced (advanced).
             */
            public Builder extendConfigs(java.util.List < ExtendConfigs> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * The node information.
             */
            public Builder instanceCategory(String instanceCategory) {
                this.instanceCategory = instanceCategory;
                return this;
            }

            /**
             * The number of cores.
             */
            public Builder nodeConfigurations(java.util.List < NodeConfigurations> nodeConfigurations) {
                this.nodeConfigurations = nodeConfigurations;
                return this;
            }

            /**
             * OversizedCluster.
             */
            public Builder oversizedCluster(Boolean oversizedCluster) {
                this.oversizedCluster = oversizedCluster;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
