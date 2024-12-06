// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CapacityPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CapacityPlanResponseBody</p>
 */
public class CapacityPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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
         * <p>ID of the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>E91B7129-A669-4D9D-A743-F90A0FF1F5EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result of the request.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CapacityPlanResponseBody build() {
            return new CapacityPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CapacityPlanResponseBody} extends {@link TeaModel}
     *
     * <p>CapacityPlanResponseBody</p>
     */
    public static class ExtendConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("Disk")
        private Long disk;

        @com.aliyun.core.annotation.NameInMap("DiskType")
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
             * <p>Configuration type, with a single value: sharedDisk.</p>
             * <blockquote>
             * <p>This extendConfigs attribute may appear when the planned instance type is Advanced.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sharedDisk</p>
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * <p>Disk size, in GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder disk(Long disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>Disk type, with a single value: CPFS_PREMIUM.</p>
             * <blockquote>
             * <p>This extendConfigs attribute may appear when the planned instance type is Advanced.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CPFS_PREMIUM</p>
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
    /**
     * 
     * {@link CapacityPlanResponseBody} extends {@link TeaModel}
     *
     * <p>CapacityPlanResponseBody</p>
     */
    public static class NodeConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Long cpu;

        @com.aliyun.core.annotation.NameInMap("Disk")
        private Long disk;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("NodeType")
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
             * <p>Number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>Number of CPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>Disk size, in GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder disk(Long disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>Disk type, with meanings as follows:</p>
             * <ul>
             * <li><p>cloud_essd: ESSD Cloud Disk</p>
             * </li>
             * <li><p>cloud_ssd: SSD Cloud Disk</p>
             * </li>
             * <li><p>cloud_efficiency: Efficient Cloud Disk</p>
             * </li>
             * <li><p>local_ssd: Local SSD Disk</p>
             * </li>
             * <li><p>local_efficiency: Local Efficient Disk</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>Specified memory size for the current node role.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Node type, with supported types as follows:</p>
             * <ul>
             * <li><p>WORKER: Data Node</p>
             * </li>
             * <li><p>WORKER_WARM: Cold Data Node</p>
             * </li>
             * <li><p>MASTER: Dedicated Master Node</p>
             * </li>
             * <li><p>KIBANA: Kibana Node</p>
             * </li>
             * <li><p>COORDINATING: Coordinator Node</p>
             * </li>
             * <li><p>ELASTIC_WORKER: Elastic Node</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WORKER</p>
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
    /**
     * 
     * {@link CapacityPlanResponseBody} extends {@link TeaModel}
     *
     * <p>CapacityPlanResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtendConfigs")
        private java.util.List < ExtendConfigs> extendConfigs;

        @com.aliyun.core.annotation.NameInMap("InstanceCategory")
        private String instanceCategory;

        @com.aliyun.core.annotation.NameInMap("NodeConfigurations")
        private java.util.List < NodeConfigurations> nodeConfigurations;

        @com.aliyun.core.annotation.NameInMap("OversizedCluster")
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
             * <p>Extended configuration information.</p>
             */
            public Builder extendConfigs(java.util.List < ExtendConfigs> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * <p>Edition type, with values meaning as follows:</p>
             * <ul>
             * <li><p>advanced: Enhanced Edition</p>
             * </li>
             * <li><p>x-pack: Commercial Edition</p>
             * </li>
             * <li><p>community: Community Edition</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>advanced</p>
             */
            public Builder instanceCategory(String instanceCategory) {
                this.instanceCategory = instanceCategory;
                return this;
            }

            /**
             * <p>Node information.</p>
             */
            public Builder nodeConfigurations(java.util.List < NodeConfigurations> nodeConfigurations) {
                this.nodeConfigurations = nodeConfigurations;
                return this;
            }

            /**
             * <p>Based on the capacity planning calculation, there is no default value. The meanings of the values are as follows:</p>
             * <ul>
             * <li><p>true: Represents an oversized cluster, indicating that the number of data nodes calculated by the capacity planning exceeds the threshold of 50.</p>
             * </li>
             * <li><p>false: The number of data nodes calculated by the capacity planning is within 50.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
