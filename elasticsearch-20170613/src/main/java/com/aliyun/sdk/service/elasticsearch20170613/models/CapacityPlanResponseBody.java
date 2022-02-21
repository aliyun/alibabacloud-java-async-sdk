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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
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
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * Disk.
             */
            public Builder disk(Long disk) {
                this.disk = disk;
                return this;
            }

            /**
             * DiskType.
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
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Disk.
             */
            public Builder disk(Long disk) {
                this.disk = disk;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NodeType.
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
             * ExtendConfigs.
             */
            public Builder extendConfigs(java.util.List < ExtendConfigs> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * InstanceCategory.
             */
            public Builder instanceCategory(String instanceCategory) {
                this.instanceCategory = instanceCategory;
                return this;
            }

            /**
             * NodeConfigurations.
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
