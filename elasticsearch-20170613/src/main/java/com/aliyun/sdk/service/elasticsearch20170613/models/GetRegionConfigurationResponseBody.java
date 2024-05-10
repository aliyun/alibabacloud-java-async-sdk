// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegionConfigurationResponseBody</p>
 */
public class GetRegionConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetRegionConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionConfigurationResponseBody create() {
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

        public GetRegionConfigurationResponseBody build() {
            return new GetRegionConfigurationResponseBody(this);
        } 

    } 

    public static class ClientNodeAmountRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxAmount")
        private Integer maxAmount;

        @com.aliyun.core.annotation.NameInMap("minAmount")
        private Integer minAmount;

        private ClientNodeAmountRange(Builder builder) {
            this.maxAmount = builder.maxAmount;
            this.minAmount = builder.minAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientNodeAmountRange create() {
            return builder().build();
        }

        /**
         * @return maxAmount
         */
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        /**
         * @return minAmount
         */
        public Integer getMinAmount() {
            return this.minAmount;
        }

        public static final class Builder {
            private Integer maxAmount; 
            private Integer minAmount; 

            /**
             * maxAmount.
             */
            public Builder maxAmount(Integer maxAmount) {
                this.maxAmount = maxAmount;
                return this;
            }

            /**
             * minAmount.
             */
            public Builder minAmount(Integer minAmount) {
                this.minAmount = minAmount;
                return this;
            }

            public ClientNodeAmountRange build() {
                return new ClientNodeAmountRange(this);
            } 

        } 

    }
    public static class ClientNodeDiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("scaleLimit")
        private Integer scaleLimit;

        private ClientNodeDiskList(Builder builder) {
            this.diskType = builder.diskType;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.scaleLimit = builder.scaleLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientNodeDiskList create() {
            return builder().build();
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scaleLimit
         */
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        public static final class Builder {
            private String diskType; 
            private Integer maxSize; 
            private Integer minSize; 
            private Integer scaleLimit; 

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * scaleLimit.
             */
            public Builder scaleLimit(Integer scaleLimit) {
                this.scaleLimit = scaleLimit;
                return this;
            }

            public ClientNodeDiskList build() {
                return new ClientNodeDiskList(this);
            } 

        } 

    }
    public static class DataDiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("scaleLimit")
        private Integer scaleLimit;

        @com.aliyun.core.annotation.NameInMap("valueLimitSet")
        private java.util.List < String > valueLimitSet;

        private DataDiskList(Builder builder) {
            this.diskType = builder.diskType;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.scaleLimit = builder.scaleLimit;
            this.valueLimitSet = builder.valueLimitSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDiskList create() {
            return builder().build();
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scaleLimit
         */
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        /**
         * @return valueLimitSet
         */
        public java.util.List < String > getValueLimitSet() {
            return this.valueLimitSet;
        }

        public static final class Builder {
            private String diskType; 
            private Integer maxSize; 
            private Integer minSize; 
            private Integer scaleLimit; 
            private java.util.List < String > valueLimitSet; 

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * scaleLimit.
             */
            public Builder scaleLimit(Integer scaleLimit) {
                this.scaleLimit = scaleLimit;
                return this;
            }

            /**
             * valueLimitSet.
             */
            public Builder valueLimitSet(java.util.List < String > valueLimitSet) {
                this.valueLimitSet = valueLimitSet;
                return this;
            }

            public DataDiskList build() {
                return new DataDiskList(this);
            } 

        } 

    }
    public static class AmountRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxAmount")
        private Integer maxAmount;

        @com.aliyun.core.annotation.NameInMap("minAmount")
        private Integer minAmount;

        private AmountRange(Builder builder) {
            this.maxAmount = builder.maxAmount;
            this.minAmount = builder.minAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AmountRange create() {
            return builder().build();
        }

        /**
         * @return maxAmount
         */
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        /**
         * @return minAmount
         */
        public Integer getMinAmount() {
            return this.minAmount;
        }

        public static final class Builder {
            private Integer maxAmount; 
            private Integer minAmount; 

            /**
             * maxAmount.
             */
            public Builder maxAmount(Integer maxAmount) {
                this.maxAmount = maxAmount;
                return this;
            }

            /**
             * minAmount.
             */
            public Builder minAmount(Integer minAmount) {
                this.minAmount = minAmount;
                return this;
            }

            public AmountRange build() {
                return new AmountRange(this);
            } 

        } 

    }
    public static class DiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("diskEncryption")
        private Boolean diskEncryption;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("scaleLimit")
        private Integer scaleLimit;

        @com.aliyun.core.annotation.NameInMap("valueLimitSet")
        private java.util.List < String > valueLimitSet;

        private DiskList(Builder builder) {
            this.diskEncryption = builder.diskEncryption;
            this.diskType = builder.diskType;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.scaleLimit = builder.scaleLimit;
            this.valueLimitSet = builder.valueLimitSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskList create() {
            return builder().build();
        }

        /**
         * @return diskEncryption
         */
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scaleLimit
         */
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        /**
         * @return valueLimitSet
         */
        public java.util.List < String > getValueLimitSet() {
            return this.valueLimitSet;
        }

        public static final class Builder {
            private Boolean diskEncryption; 
            private String diskType; 
            private Integer maxSize; 
            private Integer minSize; 
            private Integer scaleLimit; 
            private java.util.List < String > valueLimitSet; 

            /**
             * diskEncryption.
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * scaleLimit.
             */
            public Builder scaleLimit(Integer scaleLimit) {
                this.scaleLimit = scaleLimit;
                return this;
            }

            /**
             * valueLimitSet.
             */
            public Builder valueLimitSet(java.util.List < String > valueLimitSet) {
                this.valueLimitSet = valueLimitSet;
                return this;
            }

            public DiskList build() {
                return new DiskList(this);
            } 

        } 

    }
    public static class ElasticNodeProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amountRange")
        private AmountRange amountRange;

        @com.aliyun.core.annotation.NameInMap("diskList")
        private java.util.List < DiskList> diskList;

        @com.aliyun.core.annotation.NameInMap("spec")
        private java.util.List < String > spec;

        private ElasticNodeProperties(Builder builder) {
            this.amountRange = builder.amountRange;
            this.diskList = builder.diskList;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticNodeProperties create() {
            return builder().build();
        }

        /**
         * @return amountRange
         */
        public AmountRange getAmountRange() {
            return this.amountRange;
        }

        /**
         * @return diskList
         */
        public java.util.List < DiskList> getDiskList() {
            return this.diskList;
        }

        /**
         * @return spec
         */
        public java.util.List < String > getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private AmountRange amountRange; 
            private java.util.List < DiskList> diskList; 
            private java.util.List < String > spec; 

            /**
             * amountRange.
             */
            public Builder amountRange(AmountRange amountRange) {
                this.amountRange = amountRange;
                return this;
            }

            /**
             * diskList.
             */
            public Builder diskList(java.util.List < DiskList> diskList) {
                this.diskList = diskList;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(java.util.List < String > spec) {
                this.spec = spec;
                return this;
            }

            public ElasticNodeProperties build() {
                return new ElasticNodeProperties(this);
            } 

        } 

    }
    public static class EsVersionsLatestList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private EsVersionsLatestList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EsVersionsLatestList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EsVersionsLatestList build() {
                return new EsVersionsLatestList(this);
            } 

        } 

    }
    public static class JvmConfine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("supportEsVersions")
        private java.util.List < String > supportEsVersions;

        @com.aliyun.core.annotation.NameInMap("supportGcs")
        private java.util.List < String > supportGcs;

        private JvmConfine(Builder builder) {
            this.memory = builder.memory;
            this.supportEsVersions = builder.supportEsVersions;
            this.supportGcs = builder.supportGcs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JvmConfine create() {
            return builder().build();
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return supportEsVersions
         */
        public java.util.List < String > getSupportEsVersions() {
            return this.supportEsVersions;
        }

        /**
         * @return supportGcs
         */
        public java.util.List < String > getSupportGcs() {
            return this.supportGcs;
        }

        public static final class Builder {
            private Integer memory; 
            private java.util.List < String > supportEsVersions; 
            private java.util.List < String > supportGcs; 

            /**
             * memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * supportEsVersions.
             */
            public Builder supportEsVersions(java.util.List < String > supportEsVersions) {
                this.supportEsVersions = supportEsVersions;
                return this;
            }

            /**
             * supportGcs.
             */
            public Builder supportGcs(java.util.List < String > supportGcs) {
                this.supportGcs = supportGcs;
                return this;
            }

            public JvmConfine build() {
                return new JvmConfine(this);
            } 

        } 

    }
    public static class KibanaNodePropertiesAmountRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxAmount")
        private Integer maxAmount;

        @com.aliyun.core.annotation.NameInMap("minAmount")
        private Integer minAmount;

        private KibanaNodePropertiesAmountRange(Builder builder) {
            this.maxAmount = builder.maxAmount;
            this.minAmount = builder.minAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KibanaNodePropertiesAmountRange create() {
            return builder().build();
        }

        /**
         * @return maxAmount
         */
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        /**
         * @return minAmount
         */
        public Integer getMinAmount() {
            return this.minAmount;
        }

        public static final class Builder {
            private Integer maxAmount; 
            private Integer minAmount; 

            /**
             * maxAmount.
             */
            public Builder maxAmount(Integer maxAmount) {
                this.maxAmount = maxAmount;
                return this;
            }

            /**
             * minAmount.
             */
            public Builder minAmount(Integer minAmount) {
                this.minAmount = minAmount;
                return this;
            }

            public KibanaNodePropertiesAmountRange build() {
                return new KibanaNodePropertiesAmountRange(this);
            } 

        } 

    }
    public static class KibanaNodeProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amountRange")
        private KibanaNodePropertiesAmountRange amountRange;

        @com.aliyun.core.annotation.NameInMap("spec")
        private java.util.List < String > spec;

        private KibanaNodeProperties(Builder builder) {
            this.amountRange = builder.amountRange;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KibanaNodeProperties create() {
            return builder().build();
        }

        /**
         * @return amountRange
         */
        public KibanaNodePropertiesAmountRange getAmountRange() {
            return this.amountRange;
        }

        /**
         * @return spec
         */
        public java.util.List < String > getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private KibanaNodePropertiesAmountRange amountRange; 
            private java.util.List < String > spec; 

            /**
             * amountRange.
             */
            public Builder amountRange(KibanaNodePropertiesAmountRange amountRange) {
                this.amountRange = amountRange;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(java.util.List < String > spec) {
                this.spec = spec;
                return this;
            }

            public KibanaNodeProperties build() {
                return new KibanaNodeProperties(this);
            } 

        } 

    }
    public static class MasterDiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("scaleLimit")
        private Integer scaleLimit;

        private MasterDiskList(Builder builder) {
            this.diskType = builder.diskType;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.scaleLimit = builder.scaleLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterDiskList create() {
            return builder().build();
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scaleLimit
         */
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        public static final class Builder {
            private String diskType; 
            private Integer maxSize; 
            private Integer minSize; 
            private Integer scaleLimit; 

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * scaleLimit.
             */
            public Builder scaleLimit(Integer scaleLimit) {
                this.scaleLimit = scaleLimit;
                return this;
            }

            public MasterDiskList build() {
                return new MasterDiskList(this);
            } 

        } 

    }
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxAmount")
        private Integer maxAmount;

        @com.aliyun.core.annotation.NameInMap("minAmount")
        private Integer minAmount;

        private Node(Builder builder) {
            this.maxAmount = builder.maxAmount;
            this.minAmount = builder.minAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return maxAmount
         */
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        /**
         * @return minAmount
         */
        public Integer getMinAmount() {
            return this.minAmount;
        }

        public static final class Builder {
            private Integer maxAmount; 
            private Integer minAmount; 

            /**
             * maxAmount.
             */
            public Builder maxAmount(Integer maxAmount) {
                this.maxAmount = maxAmount;
                return this;
            }

            /**
             * minAmount.
             */
            public Builder minAmount(Integer minAmount) {
                this.minAmount = minAmount;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
    public static class NodeSpecList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpuCount")
        private Integer cpuCount;

        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("memorySize")
        private Integer memorySize;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("specGroupType")
        private String specGroupType;

        private NodeSpecList(Builder builder) {
            this.cpuCount = builder.cpuCount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.enable = builder.enable;
            this.memorySize = builder.memorySize;
            this.spec = builder.spec;
            this.specGroupType = builder.specGroupType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeSpecList create() {
            return builder().build();
        }

        /**
         * @return cpuCount
         */
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return memorySize
         */
        public Integer getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return specGroupType
         */
        public String getSpecGroupType() {
            return this.specGroupType;
        }

        public static final class Builder {
            private Integer cpuCount; 
            private Integer disk; 
            private String diskType; 
            private Boolean enable; 
            private Integer memorySize; 
            private String spec; 
            private String specGroupType; 

            /**
             * cpuCount.
             */
            public Builder cpuCount(Integer cpuCount) {
                this.cpuCount = cpuCount;
                return this;
            }

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * memorySize.
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * specGroupType.
             */
            public Builder specGroupType(String specGroupType) {
                this.specGroupType = specGroupType;
                return this;
            }

            public NodeSpecList build() {
                return new NodeSpecList(this);
            } 

        } 

    }
    public static class SupportVersionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private SupportVersionList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportVersionList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SupportVersionList build() {
                return new SupportVersionList(this);
            } 

        } 

    }
    public static class SupportVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceCategory")
        private String instanceCategory;

        @com.aliyun.core.annotation.NameInMap("supportVersionList")
        private java.util.List < SupportVersionList> supportVersionList;

        private SupportVersions(Builder builder) {
            this.instanceCategory = builder.instanceCategory;
            this.supportVersionList = builder.supportVersionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportVersions create() {
            return builder().build();
        }

        /**
         * @return instanceCategory
         */
        public String getInstanceCategory() {
            return this.instanceCategory;
        }

        /**
         * @return supportVersionList
         */
        public java.util.List < SupportVersionList> getSupportVersionList() {
            return this.supportVersionList;
        }

        public static final class Builder {
            private String instanceCategory; 
            private java.util.List < SupportVersionList> supportVersionList; 

            /**
             * instanceCategory.
             */
            public Builder instanceCategory(String instanceCategory) {
                this.instanceCategory = instanceCategory;
                return this;
            }

            /**
             * supportVersionList.
             */
            public Builder supportVersionList(java.util.List < SupportVersionList> supportVersionList) {
                this.supportVersionList = supportVersionList;
                return this;
            }

            public SupportVersions build() {
                return new SupportVersions(this);
            } 

        } 

    }
    public static class WarmNodePropertiesAmountRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxAmount")
        private Integer maxAmount;

        @com.aliyun.core.annotation.NameInMap("minAmount")
        private Integer minAmount;

        private WarmNodePropertiesAmountRange(Builder builder) {
            this.maxAmount = builder.maxAmount;
            this.minAmount = builder.minAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmNodePropertiesAmountRange create() {
            return builder().build();
        }

        /**
         * @return maxAmount
         */
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        /**
         * @return minAmount
         */
        public Integer getMinAmount() {
            return this.minAmount;
        }

        public static final class Builder {
            private Integer maxAmount; 
            private Integer minAmount; 

            /**
             * maxAmount.
             */
            public Builder maxAmount(Integer maxAmount) {
                this.maxAmount = maxAmount;
                return this;
            }

            /**
             * minAmount.
             */
            public Builder minAmount(Integer minAmount) {
                this.minAmount = minAmount;
                return this;
            }

            public WarmNodePropertiesAmountRange build() {
                return new WarmNodePropertiesAmountRange(this);
            } 

        } 

    }
    public static class WarmNodePropertiesDiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("diskEncryption")
        private Boolean diskEncryption;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("scaleLimit")
        private Integer scaleLimit;

        @com.aliyun.core.annotation.NameInMap("valueLimitSet")
        private java.util.List < String > valueLimitSet;

        private WarmNodePropertiesDiskList(Builder builder) {
            this.diskEncryption = builder.diskEncryption;
            this.diskType = builder.diskType;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.scaleLimit = builder.scaleLimit;
            this.valueLimitSet = builder.valueLimitSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmNodePropertiesDiskList create() {
            return builder().build();
        }

        /**
         * @return diskEncryption
         */
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scaleLimit
         */
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        /**
         * @return valueLimitSet
         */
        public java.util.List < String > getValueLimitSet() {
            return this.valueLimitSet;
        }

        public static final class Builder {
            private Boolean diskEncryption; 
            private String diskType; 
            private Integer maxSize; 
            private Integer minSize; 
            private Integer scaleLimit; 
            private java.util.List < String > valueLimitSet; 

            /**
             * diskEncryption.
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * scaleLimit.
             */
            public Builder scaleLimit(Integer scaleLimit) {
                this.scaleLimit = scaleLimit;
                return this;
            }

            /**
             * valueLimitSet.
             */
            public Builder valueLimitSet(java.util.List < String > valueLimitSet) {
                this.valueLimitSet = valueLimitSet;
                return this;
            }

            public WarmNodePropertiesDiskList build() {
                return new WarmNodePropertiesDiskList(this);
            } 

        } 

    }
    public static class WarmNodeProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amountRange")
        private WarmNodePropertiesAmountRange amountRange;

        @com.aliyun.core.annotation.NameInMap("diskList")
        private java.util.List < WarmNodePropertiesDiskList> diskList;

        @com.aliyun.core.annotation.NameInMap("spec")
        private java.util.List < String > spec;

        private WarmNodeProperties(Builder builder) {
            this.amountRange = builder.amountRange;
            this.diskList = builder.diskList;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmNodeProperties create() {
            return builder().build();
        }

        /**
         * @return amountRange
         */
        public WarmNodePropertiesAmountRange getAmountRange() {
            return this.amountRange;
        }

        /**
         * @return diskList
         */
        public java.util.List < WarmNodePropertiesDiskList> getDiskList() {
            return this.diskList;
        }

        /**
         * @return spec
         */
        public java.util.List < String > getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private WarmNodePropertiesAmountRange amountRange; 
            private java.util.List < WarmNodePropertiesDiskList> diskList; 
            private java.util.List < String > spec; 

            /**
             * amountRange.
             */
            public Builder amountRange(WarmNodePropertiesAmountRange amountRange) {
                this.amountRange = amountRange;
                return this;
            }

            /**
             * diskList.
             */
            public Builder diskList(java.util.List < WarmNodePropertiesDiskList> diskList) {
                this.diskList = diskList;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(java.util.List < String > spec) {
                this.spec = spec;
                return this;
            }

            public WarmNodeProperties build() {
                return new WarmNodeProperties(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientNodeAmountRange")
        private ClientNodeAmountRange clientNodeAmountRange;

        @com.aliyun.core.annotation.NameInMap("clientNodeDiskList")
        private java.util.List < ClientNodeDiskList> clientNodeDiskList;

        @com.aliyun.core.annotation.NameInMap("clientNodeSpec")
        private java.util.List < String > clientNodeSpec;

        @com.aliyun.core.annotation.NameInMap("createUrl")
        private String createUrl;

        @com.aliyun.core.annotation.NameInMap("dataDiskList")
        private java.util.List < DataDiskList> dataDiskList;

        @com.aliyun.core.annotation.NameInMap("elasticNodeProperties")
        private ElasticNodeProperties elasticNodeProperties;

        @com.aliyun.core.annotation.NameInMap("env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("esVersions")
        private java.util.List < String > esVersions;

        @com.aliyun.core.annotation.NameInMap("esVersionsLatestList")
        private java.util.List < EsVersionsLatestList> esVersionsLatestList;

        @com.aliyun.core.annotation.NameInMap("instanceSupportNodes")
        private java.util.List < String > instanceSupportNodes;

        @com.aliyun.core.annotation.NameInMap("jvmConfine")
        private JvmConfine jvmConfine;

        @com.aliyun.core.annotation.NameInMap("kibanaNodeProperties")
        private KibanaNodeProperties kibanaNodeProperties;

        @com.aliyun.core.annotation.NameInMap("masterDiskList")
        private java.util.List < MasterDiskList> masterDiskList;

        @com.aliyun.core.annotation.NameInMap("masterSpec")
        private java.util.List < String > masterSpec;

        @com.aliyun.core.annotation.NameInMap("node")
        private Node node;

        @com.aliyun.core.annotation.NameInMap("nodeSpecList")
        private java.util.List < NodeSpecList> nodeSpecList;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("supportVersions")
        private java.util.List < SupportVersions> supportVersions;

        @com.aliyun.core.annotation.NameInMap("warmNodeProperties")
        private WarmNodeProperties warmNodeProperties;

        @com.aliyun.core.annotation.NameInMap("zones")
        private java.util.List < String > zones;

        private Result(Builder builder) {
            this.clientNodeAmountRange = builder.clientNodeAmountRange;
            this.clientNodeDiskList = builder.clientNodeDiskList;
            this.clientNodeSpec = builder.clientNodeSpec;
            this.createUrl = builder.createUrl;
            this.dataDiskList = builder.dataDiskList;
            this.elasticNodeProperties = builder.elasticNodeProperties;
            this.env = builder.env;
            this.esVersions = builder.esVersions;
            this.esVersionsLatestList = builder.esVersionsLatestList;
            this.instanceSupportNodes = builder.instanceSupportNodes;
            this.jvmConfine = builder.jvmConfine;
            this.kibanaNodeProperties = builder.kibanaNodeProperties;
            this.masterDiskList = builder.masterDiskList;
            this.masterSpec = builder.masterSpec;
            this.node = builder.node;
            this.nodeSpecList = builder.nodeSpecList;
            this.regionId = builder.regionId;
            this.supportVersions = builder.supportVersions;
            this.warmNodeProperties = builder.warmNodeProperties;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return clientNodeAmountRange
         */
        public ClientNodeAmountRange getClientNodeAmountRange() {
            return this.clientNodeAmountRange;
        }

        /**
         * @return clientNodeDiskList
         */
        public java.util.List < ClientNodeDiskList> getClientNodeDiskList() {
            return this.clientNodeDiskList;
        }

        /**
         * @return clientNodeSpec
         */
        public java.util.List < String > getClientNodeSpec() {
            return this.clientNodeSpec;
        }

        /**
         * @return createUrl
         */
        public String getCreateUrl() {
            return this.createUrl;
        }

        /**
         * @return dataDiskList
         */
        public java.util.List < DataDiskList> getDataDiskList() {
            return this.dataDiskList;
        }

        /**
         * @return elasticNodeProperties
         */
        public ElasticNodeProperties getElasticNodeProperties() {
            return this.elasticNodeProperties;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return esVersions
         */
        public java.util.List < String > getEsVersions() {
            return this.esVersions;
        }

        /**
         * @return esVersionsLatestList
         */
        public java.util.List < EsVersionsLatestList> getEsVersionsLatestList() {
            return this.esVersionsLatestList;
        }

        /**
         * @return instanceSupportNodes
         */
        public java.util.List < String > getInstanceSupportNodes() {
            return this.instanceSupportNodes;
        }

        /**
         * @return jvmConfine
         */
        public JvmConfine getJvmConfine() {
            return this.jvmConfine;
        }

        /**
         * @return kibanaNodeProperties
         */
        public KibanaNodeProperties getKibanaNodeProperties() {
            return this.kibanaNodeProperties;
        }

        /**
         * @return masterDiskList
         */
        public java.util.List < MasterDiskList> getMasterDiskList() {
            return this.masterDiskList;
        }

        /**
         * @return masterSpec
         */
        public java.util.List < String > getMasterSpec() {
            return this.masterSpec;
        }

        /**
         * @return node
         */
        public Node getNode() {
            return this.node;
        }

        /**
         * @return nodeSpecList
         */
        public java.util.List < NodeSpecList> getNodeSpecList() {
            return this.nodeSpecList;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return supportVersions
         */
        public java.util.List < SupportVersions> getSupportVersions() {
            return this.supportVersions;
        }

        /**
         * @return warmNodeProperties
         */
        public WarmNodeProperties getWarmNodeProperties() {
            return this.warmNodeProperties;
        }

        /**
         * @return zones
         */
        public java.util.List < String > getZones() {
            return this.zones;
        }

        public static final class Builder {
            private ClientNodeAmountRange clientNodeAmountRange; 
            private java.util.List < ClientNodeDiskList> clientNodeDiskList; 
            private java.util.List < String > clientNodeSpec; 
            private String createUrl; 
            private java.util.List < DataDiskList> dataDiskList; 
            private ElasticNodeProperties elasticNodeProperties; 
            private String env; 
            private java.util.List < String > esVersions; 
            private java.util.List < EsVersionsLatestList> esVersionsLatestList; 
            private java.util.List < String > instanceSupportNodes; 
            private JvmConfine jvmConfine; 
            private KibanaNodeProperties kibanaNodeProperties; 
            private java.util.List < MasterDiskList> masterDiskList; 
            private java.util.List < String > masterSpec; 
            private Node node; 
            private java.util.List < NodeSpecList> nodeSpecList; 
            private String regionId; 
            private java.util.List < SupportVersions> supportVersions; 
            private WarmNodeProperties warmNodeProperties; 
            private java.util.List < String > zones; 

            /**
             * clientNodeAmountRange.
             */
            public Builder clientNodeAmountRange(ClientNodeAmountRange clientNodeAmountRange) {
                this.clientNodeAmountRange = clientNodeAmountRange;
                return this;
            }

            /**
             * clientNodeDiskList.
             */
            public Builder clientNodeDiskList(java.util.List < ClientNodeDiskList> clientNodeDiskList) {
                this.clientNodeDiskList = clientNodeDiskList;
                return this;
            }

            /**
             * clientNodeSpec.
             */
            public Builder clientNodeSpec(java.util.List < String > clientNodeSpec) {
                this.clientNodeSpec = clientNodeSpec;
                return this;
            }

            /**
             * createUrl.
             */
            public Builder createUrl(String createUrl) {
                this.createUrl = createUrl;
                return this;
            }

            /**
             * dataDiskList.
             */
            public Builder dataDiskList(java.util.List < DataDiskList> dataDiskList) {
                this.dataDiskList = dataDiskList;
                return this;
            }

            /**
             * elasticNodeProperties.
             */
            public Builder elasticNodeProperties(ElasticNodeProperties elasticNodeProperties) {
                this.elasticNodeProperties = elasticNodeProperties;
                return this;
            }

            /**
             * env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * esVersions.
             */
            public Builder esVersions(java.util.List < String > esVersions) {
                this.esVersions = esVersions;
                return this;
            }

            /**
             * esVersionsLatestList.
             */
            public Builder esVersionsLatestList(java.util.List < EsVersionsLatestList> esVersionsLatestList) {
                this.esVersionsLatestList = esVersionsLatestList;
                return this;
            }

            /**
             * instanceSupportNodes.
             */
            public Builder instanceSupportNodes(java.util.List < String > instanceSupportNodes) {
                this.instanceSupportNodes = instanceSupportNodes;
                return this;
            }

            /**
             * jvmConfine.
             */
            public Builder jvmConfine(JvmConfine jvmConfine) {
                this.jvmConfine = jvmConfine;
                return this;
            }

            /**
             * kibanaNodeProperties.
             */
            public Builder kibanaNodeProperties(KibanaNodeProperties kibanaNodeProperties) {
                this.kibanaNodeProperties = kibanaNodeProperties;
                return this;
            }

            /**
             * masterDiskList.
             */
            public Builder masterDiskList(java.util.List < MasterDiskList> masterDiskList) {
                this.masterDiskList = masterDiskList;
                return this;
            }

            /**
             * masterSpec.
             */
            public Builder masterSpec(java.util.List < String > masterSpec) {
                this.masterSpec = masterSpec;
                return this;
            }

            /**
             * node.
             */
            public Builder node(Node node) {
                this.node = node;
                return this;
            }

            /**
             * nodeSpecList.
             */
            public Builder nodeSpecList(java.util.List < NodeSpecList> nodeSpecList) {
                this.nodeSpecList = nodeSpecList;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * supportVersions.
             */
            public Builder supportVersions(java.util.List < SupportVersions> supportVersions) {
                this.supportVersions = supportVersions;
                return this;
            }

            /**
             * warmNodeProperties.
             */
            public Builder warmNodeProperties(WarmNodeProperties warmNodeProperties) {
                this.warmNodeProperties = warmNodeProperties;
                return this;
            }

            /**
             * zones.
             */
            public Builder zones(java.util.List < String > zones) {
                this.zones = zones;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
