// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTypesResponseBody</p>
 */
public class DescribeInstanceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private InstanceTypes instanceTypes;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceTypesResponseBody(Builder builder) {
        this.instanceTypes = builder.instanceTypes;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceTypes
     */
    public InstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceTypes instanceTypes; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceTypesResponseBody model) {
            this.instanceTypes = model.instanceTypes;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the instance types.</p>
         */
        public Builder instanceTypes(InstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The query token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>e71d8a535bd9cc11</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>00827261-20B7-4562-83F2-4DF39876A45A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTypesResponseBody build() {
            return new DescribeInstanceTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class Attribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Attribute(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attribute create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Attribute model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Attribute build() {
                return new Attribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private java.util.List<Attribute> attribute;

        private Attributes(Builder builder) {
            this.attribute = builder.attribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public java.util.List<Attribute> getAttribute() {
            return this.attribute;
        }

        public static final class Builder {
            private java.util.List<Attribute> attribute; 

            private Builder() {
            } 

            private Builder(Attributes model) {
                this.attribute = model.attribute;
            } 

            /**
             * Attribute.
             */
            public Builder attribute(java.util.List<Attribute> attribute) {
                this.attribute = attribute;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class Clock extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PtpSupport")
        private String ptpSupport;

        private Clock(Builder builder) {
            this.ptpSupport = builder.ptpSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clock create() {
            return builder().build();
        }

        /**
         * @return ptpSupport
         */
        public String getPtpSupport() {
            return this.ptpSupport;
        }

        public static final class Builder {
            private String ptpSupport; 

            private Builder() {
            } 

            private Builder(Clock model) {
                this.ptpSupport = model.ptpSupport;
            } 

            /**
             * PtpSupport.
             */
            public Builder ptpSupport(String ptpSupport) {
                this.ptpSupport = ptpSupport;
                return this;
            }

            public Clock build() {
                return new Clock(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class SupportedTopologyTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedTopologyType")
        private java.util.List<String> supportedTopologyType;

        private SupportedTopologyTypes(Builder builder) {
            this.supportedTopologyType = builder.supportedTopologyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedTopologyTypes create() {
            return builder().build();
        }

        /**
         * @return supportedTopologyType
         */
        public java.util.List<String> getSupportedTopologyType() {
            return this.supportedTopologyType;
        }

        public static final class Builder {
            private java.util.List<String> supportedTopologyType; 

            private Builder() {
            } 

            private Builder(SupportedTopologyTypes model) {
                this.supportedTopologyType = model.supportedTopologyType;
            } 

            /**
             * SupportedTopologyType.
             */
            public Builder supportedTopologyType(java.util.List<String> supportedTopologyType) {
                this.supportedTopologyType = supportedTopologyType;
                return this;
            }

            public SupportedTopologyTypes build() {
                return new SupportedTopologyTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class CpuOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Core")
        private Integer core;

        @com.aliyun.core.annotation.NameInMap("CoreFactor")
        private Integer coreFactor;

        @com.aliyun.core.annotation.NameInMap("HyperThreadingAdjustable")
        private Boolean hyperThreadingAdjustable;

        @com.aliyun.core.annotation.NameInMap("SupportedTopologyTypes")
        private SupportedTopologyTypes supportedTopologyTypes;

        @com.aliyun.core.annotation.NameInMap("ThreadsPerCore")
        private Integer threadsPerCore;

        private CpuOptions(Builder builder) {
            this.core = builder.core;
            this.coreFactor = builder.coreFactor;
            this.hyperThreadingAdjustable = builder.hyperThreadingAdjustable;
            this.supportedTopologyTypes = builder.supportedTopologyTypes;
            this.threadsPerCore = builder.threadsPerCore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuOptions create() {
            return builder().build();
        }

        /**
         * @return core
         */
        public Integer getCore() {
            return this.core;
        }

        /**
         * @return coreFactor
         */
        public Integer getCoreFactor() {
            return this.coreFactor;
        }

        /**
         * @return hyperThreadingAdjustable
         */
        public Boolean getHyperThreadingAdjustable() {
            return this.hyperThreadingAdjustable;
        }

        /**
         * @return supportedTopologyTypes
         */
        public SupportedTopologyTypes getSupportedTopologyTypes() {
            return this.supportedTopologyTypes;
        }

        /**
         * @return threadsPerCore
         */
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

        public static final class Builder {
            private Integer core; 
            private Integer coreFactor; 
            private Boolean hyperThreadingAdjustable; 
            private SupportedTopologyTypes supportedTopologyTypes; 
            private Integer threadsPerCore; 

            private Builder() {
            } 

            private Builder(CpuOptions model) {
                this.core = model.core;
                this.coreFactor = model.coreFactor;
                this.hyperThreadingAdjustable = model.hyperThreadingAdjustable;
                this.supportedTopologyTypes = model.supportedTopologyTypes;
                this.threadsPerCore = model.threadsPerCore;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder core(Integer core) {
                this.core = core;
                return this;
            }

            /**
             * <p>The CPU option step size.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder coreFactor(Integer coreFactor) {
                this.coreFactor = coreFactor;
                return this;
            }

            /**
             * <p>Indicates whether HT can be enabled or disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hyperThreadingAdjustable(Boolean hyperThreadingAdjustable) {
                this.hyperThreadingAdjustable = hyperThreadingAdjustable;
                return this;
            }

            /**
             * <p>The CPU topology types of the instance type.</p>
             */
            public Builder supportedTopologyTypes(SupportedTopologyTypes supportedTopologyTypes) {
                this.supportedTopologyTypes = supportedTopologyTypes;
                return this;
            }

            /**
             * <p>The number of threads per CPU core.</p>
             * <blockquote>
             * <p> <code>If the value of CpuOptions.ThreadPerCore is 1, Hyper-Threading (HT) is disabled.</code></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder threadsPerCore(Integer threadsPerCore) {
                this.threadsPerCore = threadsPerCore;
                return this;
            }

            public CpuOptions build() {
                return new CpuOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class EnhancedNetwork extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RssSupport")
        private Boolean rssSupport;

        @com.aliyun.core.annotation.NameInMap("SriovSupport")
        private Boolean sriovSupport;

        @com.aliyun.core.annotation.NameInMap("VfQueueNumberPerEni")
        private Integer vfQueueNumberPerEni;

        private EnhancedNetwork(Builder builder) {
            this.rssSupport = builder.rssSupport;
            this.sriovSupport = builder.sriovSupport;
            this.vfQueueNumberPerEni = builder.vfQueueNumberPerEni;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnhancedNetwork create() {
            return builder().build();
        }

        /**
         * @return rssSupport
         */
        public Boolean getRssSupport() {
            return this.rssSupport;
        }

        /**
         * @return sriovSupport
         */
        public Boolean getSriovSupport() {
            return this.sriovSupport;
        }

        /**
         * @return vfQueueNumberPerEni
         */
        public Integer getVfQueueNumberPerEni() {
            return this.vfQueueNumberPerEni;
        }

        public static final class Builder {
            private Boolean rssSupport; 
            private Boolean sriovSupport; 
            private Integer vfQueueNumberPerEni; 

            private Builder() {
            } 

            private Builder(EnhancedNetwork model) {
                this.rssSupport = model.rssSupport;
                this.sriovSupport = model.sriovSupport;
                this.vfQueueNumberPerEni = model.vfQueueNumberPerEni;
            } 

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder rssSupport(Boolean rssSupport) {
                this.rssSupport = rssSupport;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sriovSupport(Boolean sriovSupport) {
                this.sriovSupport = sriovSupport;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder vfQueueNumberPerEni(Integer vfQueueNumberPerEni) {
                this.vfQueueNumberPerEni = vfQueueNumberPerEni;
                return this;
            }

            public EnhancedNetwork build() {
                return new EnhancedNetwork(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class NetworkCardInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkCardIndex")
        private Integer networkCardIndex;

        private NetworkCardInfo(Builder builder) {
            this.networkCardIndex = builder.networkCardIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkCardInfo create() {
            return builder().build();
        }

        /**
         * @return networkCardIndex
         */
        public Integer getNetworkCardIndex() {
            return this.networkCardIndex;
        }

        public static final class Builder {
            private Integer networkCardIndex; 

            private Builder() {
            } 

            private Builder(NetworkCardInfo model) {
                this.networkCardIndex = model.networkCardIndex;
            } 

            /**
             * <p>The index of the network card.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder networkCardIndex(Integer networkCardIndex) {
                this.networkCardIndex = networkCardIndex;
                return this;
            }

            public NetworkCardInfo build() {
                return new NetworkCardInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class NetworkCards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkCardInfo")
        private java.util.List<NetworkCardInfo> networkCardInfo;

        private NetworkCards(Builder builder) {
            this.networkCardInfo = builder.networkCardInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkCards create() {
            return builder().build();
        }

        /**
         * @return networkCardInfo
         */
        public java.util.List<NetworkCardInfo> getNetworkCardInfo() {
            return this.networkCardInfo;
        }

        public static final class Builder {
            private java.util.List<NetworkCardInfo> networkCardInfo; 

            private Builder() {
            } 

            private Builder(NetworkCards model) {
                this.networkCardInfo = model.networkCardInfo;
            } 

            /**
             * NetworkCardInfo.
             */
            public Builder networkCardInfo(java.util.List<NetworkCardInfo> networkCardInfo) {
                this.networkCardInfo = networkCardInfo;
                return this;
            }

            public NetworkCards build() {
                return new NetworkCards(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class SupportedBootModes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedBootMode")
        private java.util.List<String> supportedBootMode;

        private SupportedBootModes(Builder builder) {
            this.supportedBootMode = builder.supportedBootMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedBootModes create() {
            return builder().build();
        }

        /**
         * @return supportedBootMode
         */
        public java.util.List<String> getSupportedBootMode() {
            return this.supportedBootMode;
        }

        public static final class Builder {
            private java.util.List<String> supportedBootMode; 

            private Builder() {
            } 

            private Builder(SupportedBootModes model) {
                this.supportedBootMode = model.supportedBootMode;
            } 

            /**
             * SupportedBootMode.
             */
            public Builder supportedBootMode(java.util.List<String> supportedBootMode) {
                this.supportedBootMode = supportedBootMode;
                return this;
            }

            public SupportedBootModes build() {
                return new SupportedBootModes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class InstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private Attributes attributes;

        @com.aliyun.core.annotation.NameInMap("BaselineCredit")
        private Integer baselineCredit;

        @com.aliyun.core.annotation.NameInMap("Clock")
        private Clock clock;

        @com.aliyun.core.annotation.NameInMap("CpuArchitecture")
        private String cpuArchitecture;

        @com.aliyun.core.annotation.NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("CpuOptions")
        private CpuOptions cpuOptions;

        @com.aliyun.core.annotation.NameInMap("CpuSpeedFrequency")
        private Float cpuSpeedFrequency;

        @com.aliyun.core.annotation.NameInMap("CpuTurboFrequency")
        private Float cpuTurboFrequency;

        @com.aliyun.core.annotation.NameInMap("DiskQuantity")
        private Integer diskQuantity;

        @com.aliyun.core.annotation.NameInMap("EnhancedNetwork")
        private EnhancedNetwork enhancedNetwork;

        @com.aliyun.core.annotation.NameInMap("EniIpv6AddressQuantity")
        private Integer eniIpv6AddressQuantity;

        @com.aliyun.core.annotation.NameInMap("EniPrivateIpAddressQuantity")
        private Integer eniPrivateIpAddressQuantity;

        @com.aliyun.core.annotation.NameInMap("EniQuantity")
        private Integer eniQuantity;

        @com.aliyun.core.annotation.NameInMap("EniTotalQuantity")
        private Integer eniTotalQuantity;

        @com.aliyun.core.annotation.NameInMap("EniTrunkSupported")
        private Boolean eniTrunkSupported;

        @com.aliyun.core.annotation.NameInMap("EriQuantity")
        private Integer eriQuantity;

        @com.aliyun.core.annotation.NameInMap("GPUAmount")
        private Integer GPUAmount;

        @com.aliyun.core.annotation.NameInMap("GPUMemorySize")
        private Float GPUMemorySize;

        @com.aliyun.core.annotation.NameInMap("GPUSpec")
        private String GPUSpec;

        @com.aliyun.core.annotation.NameInMap("InitialCredit")
        private Integer initialCredit;

        @com.aliyun.core.annotation.NameInMap("InstanceBandwidthRx")
        private Integer instanceBandwidthRx;

        @com.aliyun.core.annotation.NameInMap("InstanceBandwidthTx")
        private Integer instanceBandwidthTx;

        @com.aliyun.core.annotation.NameInMap("InstanceCategory")
        private String instanceCategory;

        @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @com.aliyun.core.annotation.NameInMap("InstancePpsRx")
        private Long instancePpsRx;

        @com.aliyun.core.annotation.NameInMap("InstancePpsTx")
        private Long instancePpsTx;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @com.aliyun.core.annotation.NameInMap("JumboFrameSupport")
        private Boolean jumboFrameSupport;

        @com.aliyun.core.annotation.NameInMap("LocalStorageAmount")
        private Integer localStorageAmount;

        @com.aliyun.core.annotation.NameInMap("LocalStorageCapacity")
        private Long localStorageCapacity;

        @com.aliyun.core.annotation.NameInMap("LocalStorageCategory")
        private String localStorageCategory;

        @com.aliyun.core.annotation.NameInMap("MaximumQueueNumberPerEni")
        private Integer maximumQueueNumberPerEni;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private Float memorySize;

        @com.aliyun.core.annotation.NameInMap("NetworkCardQuantity")
        private Integer networkCardQuantity;

        @com.aliyun.core.annotation.NameInMap("NetworkCards")
        private NetworkCards networkCards;

        @com.aliyun.core.annotation.NameInMap("NetworkEncryptionSupport")
        private Boolean networkEncryptionSupport;

        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        private String nvmeSupport;

        @com.aliyun.core.annotation.NameInMap("PhysicalProcessorModel")
        private String physicalProcessorModel;

        @com.aliyun.core.annotation.NameInMap("PrimaryEniQueueNumber")
        private Integer primaryEniQueueNumber;

        @com.aliyun.core.annotation.NameInMap("QueuePairNumber")
        private Integer queuePairNumber;

        @com.aliyun.core.annotation.NameInMap("SecondaryEniQueueNumber")
        private Integer secondaryEniQueueNumber;

        @com.aliyun.core.annotation.NameInMap("SupportedBootModes")
        private SupportedBootModes supportedBootModes;

        @com.aliyun.core.annotation.NameInMap("TotalEniQueueQuantity")
        private Integer totalEniQueueQuantity;

        private InstanceType(Builder builder) {
            this.attributes = builder.attributes;
            this.baselineCredit = builder.baselineCredit;
            this.clock = builder.clock;
            this.cpuArchitecture = builder.cpuArchitecture;
            this.cpuCoreCount = builder.cpuCoreCount;
            this.cpuOptions = builder.cpuOptions;
            this.cpuSpeedFrequency = builder.cpuSpeedFrequency;
            this.cpuTurboFrequency = builder.cpuTurboFrequency;
            this.diskQuantity = builder.diskQuantity;
            this.enhancedNetwork = builder.enhancedNetwork;
            this.eniIpv6AddressQuantity = builder.eniIpv6AddressQuantity;
            this.eniPrivateIpAddressQuantity = builder.eniPrivateIpAddressQuantity;
            this.eniQuantity = builder.eniQuantity;
            this.eniTotalQuantity = builder.eniTotalQuantity;
            this.eniTrunkSupported = builder.eniTrunkSupported;
            this.eriQuantity = builder.eriQuantity;
            this.GPUAmount = builder.GPUAmount;
            this.GPUMemorySize = builder.GPUMemorySize;
            this.GPUSpec = builder.GPUSpec;
            this.initialCredit = builder.initialCredit;
            this.instanceBandwidthRx = builder.instanceBandwidthRx;
            this.instanceBandwidthTx = builder.instanceBandwidthTx;
            this.instanceCategory = builder.instanceCategory;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.instancePpsRx = builder.instancePpsRx;
            this.instancePpsTx = builder.instancePpsTx;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.instanceTypeId = builder.instanceTypeId;
            this.jumboFrameSupport = builder.jumboFrameSupport;
            this.localStorageAmount = builder.localStorageAmount;
            this.localStorageCapacity = builder.localStorageCapacity;
            this.localStorageCategory = builder.localStorageCategory;
            this.maximumQueueNumberPerEni = builder.maximumQueueNumberPerEni;
            this.memorySize = builder.memorySize;
            this.networkCardQuantity = builder.networkCardQuantity;
            this.networkCards = builder.networkCards;
            this.networkEncryptionSupport = builder.networkEncryptionSupport;
            this.nvmeSupport = builder.nvmeSupport;
            this.physicalProcessorModel = builder.physicalProcessorModel;
            this.primaryEniQueueNumber = builder.primaryEniQueueNumber;
            this.queuePairNumber = builder.queuePairNumber;
            this.secondaryEniQueueNumber = builder.secondaryEniQueueNumber;
            this.supportedBootModes = builder.supportedBootModes;
            this.totalEniQueueQuantity = builder.totalEniQueueQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public Attributes getAttributes() {
            return this.attributes;
        }

        /**
         * @return baselineCredit
         */
        public Integer getBaselineCredit() {
            return this.baselineCredit;
        }

        /**
         * @return clock
         */
        public Clock getClock() {
            return this.clock;
        }

        /**
         * @return cpuArchitecture
         */
        public String getCpuArchitecture() {
            return this.cpuArchitecture;
        }

        /**
         * @return cpuCoreCount
         */
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        /**
         * @return cpuOptions
         */
        public CpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        /**
         * @return cpuSpeedFrequency
         */
        public Float getCpuSpeedFrequency() {
            return this.cpuSpeedFrequency;
        }

        /**
         * @return cpuTurboFrequency
         */
        public Float getCpuTurboFrequency() {
            return this.cpuTurboFrequency;
        }

        /**
         * @return diskQuantity
         */
        public Integer getDiskQuantity() {
            return this.diskQuantity;
        }

        /**
         * @return enhancedNetwork
         */
        public EnhancedNetwork getEnhancedNetwork() {
            return this.enhancedNetwork;
        }

        /**
         * @return eniIpv6AddressQuantity
         */
        public Integer getEniIpv6AddressQuantity() {
            return this.eniIpv6AddressQuantity;
        }

        /**
         * @return eniPrivateIpAddressQuantity
         */
        public Integer getEniPrivateIpAddressQuantity() {
            return this.eniPrivateIpAddressQuantity;
        }

        /**
         * @return eniQuantity
         */
        public Integer getEniQuantity() {
            return this.eniQuantity;
        }

        /**
         * @return eniTotalQuantity
         */
        public Integer getEniTotalQuantity() {
            return this.eniTotalQuantity;
        }

        /**
         * @return eniTrunkSupported
         */
        public Boolean getEniTrunkSupported() {
            return this.eniTrunkSupported;
        }

        /**
         * @return eriQuantity
         */
        public Integer getEriQuantity() {
            return this.eriQuantity;
        }

        /**
         * @return GPUAmount
         */
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        /**
         * @return GPUMemorySize
         */
        public Float getGPUMemorySize() {
            return this.GPUMemorySize;
        }

        /**
         * @return GPUSpec
         */
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        /**
         * @return initialCredit
         */
        public Integer getInitialCredit() {
            return this.initialCredit;
        }

        /**
         * @return instanceBandwidthRx
         */
        public Integer getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
        }

        /**
         * @return instanceBandwidthTx
         */
        public Integer getInstanceBandwidthTx() {
            return this.instanceBandwidthTx;
        }

        /**
         * @return instanceCategory
         */
        public String getInstanceCategory() {
            return this.instanceCategory;
        }

        /**
         * @return instanceFamilyLevel
         */
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        /**
         * @return instancePpsRx
         */
        public Long getInstancePpsRx() {
            return this.instancePpsRx;
        }

        /**
         * @return instancePpsTx
         */
        public Long getInstancePpsTx() {
            return this.instancePpsTx;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return instanceTypeId
         */
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        /**
         * @return jumboFrameSupport
         */
        public Boolean getJumboFrameSupport() {
            return this.jumboFrameSupport;
        }

        /**
         * @return localStorageAmount
         */
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        /**
         * @return localStorageCapacity
         */
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        /**
         * @return localStorageCategory
         */
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        /**
         * @return maximumQueueNumberPerEni
         */
        public Integer getMaximumQueueNumberPerEni() {
            return this.maximumQueueNumberPerEni;
        }

        /**
         * @return memorySize
         */
        public Float getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return networkCardQuantity
         */
        public Integer getNetworkCardQuantity() {
            return this.networkCardQuantity;
        }

        /**
         * @return networkCards
         */
        public NetworkCards getNetworkCards() {
            return this.networkCards;
        }

        /**
         * @return networkEncryptionSupport
         */
        public Boolean getNetworkEncryptionSupport() {
            return this.networkEncryptionSupport;
        }

        /**
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        /**
         * @return physicalProcessorModel
         */
        public String getPhysicalProcessorModel() {
            return this.physicalProcessorModel;
        }

        /**
         * @return primaryEniQueueNumber
         */
        public Integer getPrimaryEniQueueNumber() {
            return this.primaryEniQueueNumber;
        }

        /**
         * @return queuePairNumber
         */
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
        }

        /**
         * @return secondaryEniQueueNumber
         */
        public Integer getSecondaryEniQueueNumber() {
            return this.secondaryEniQueueNumber;
        }

        /**
         * @return supportedBootModes
         */
        public SupportedBootModes getSupportedBootModes() {
            return this.supportedBootModes;
        }

        /**
         * @return totalEniQueueQuantity
         */
        public Integer getTotalEniQueueQuantity() {
            return this.totalEniQueueQuantity;
        }

        public static final class Builder {
            private Attributes attributes; 
            private Integer baselineCredit; 
            private Clock clock; 
            private String cpuArchitecture; 
            private Integer cpuCoreCount; 
            private CpuOptions cpuOptions; 
            private Float cpuSpeedFrequency; 
            private Float cpuTurboFrequency; 
            private Integer diskQuantity; 
            private EnhancedNetwork enhancedNetwork; 
            private Integer eniIpv6AddressQuantity; 
            private Integer eniPrivateIpAddressQuantity; 
            private Integer eniQuantity; 
            private Integer eniTotalQuantity; 
            private Boolean eniTrunkSupported; 
            private Integer eriQuantity; 
            private Integer GPUAmount; 
            private Float GPUMemorySize; 
            private String GPUSpec; 
            private Integer initialCredit; 
            private Integer instanceBandwidthRx; 
            private Integer instanceBandwidthTx; 
            private String instanceCategory; 
            private String instanceFamilyLevel; 
            private Long instancePpsRx; 
            private Long instancePpsTx; 
            private String instanceTypeFamily; 
            private String instanceTypeId; 
            private Boolean jumboFrameSupport; 
            private Integer localStorageAmount; 
            private Long localStorageCapacity; 
            private String localStorageCategory; 
            private Integer maximumQueueNumberPerEni; 
            private Float memorySize; 
            private Integer networkCardQuantity; 
            private NetworkCards networkCards; 
            private Boolean networkEncryptionSupport; 
            private String nvmeSupport; 
            private String physicalProcessorModel; 
            private Integer primaryEniQueueNumber; 
            private Integer queuePairNumber; 
            private Integer secondaryEniQueueNumber; 
            private SupportedBootModes supportedBootModes; 
            private Integer totalEniQueueQuantity; 

            private Builder() {
            } 

            private Builder(InstanceType model) {
                this.attributes = model.attributes;
                this.baselineCredit = model.baselineCredit;
                this.clock = model.clock;
                this.cpuArchitecture = model.cpuArchitecture;
                this.cpuCoreCount = model.cpuCoreCount;
                this.cpuOptions = model.cpuOptions;
                this.cpuSpeedFrequency = model.cpuSpeedFrequency;
                this.cpuTurboFrequency = model.cpuTurboFrequency;
                this.diskQuantity = model.diskQuantity;
                this.enhancedNetwork = model.enhancedNetwork;
                this.eniIpv6AddressQuantity = model.eniIpv6AddressQuantity;
                this.eniPrivateIpAddressQuantity = model.eniPrivateIpAddressQuantity;
                this.eniQuantity = model.eniQuantity;
                this.eniTotalQuantity = model.eniTotalQuantity;
                this.eniTrunkSupported = model.eniTrunkSupported;
                this.eriQuantity = model.eriQuantity;
                this.GPUAmount = model.GPUAmount;
                this.GPUMemorySize = model.GPUMemorySize;
                this.GPUSpec = model.GPUSpec;
                this.initialCredit = model.initialCredit;
                this.instanceBandwidthRx = model.instanceBandwidthRx;
                this.instanceBandwidthTx = model.instanceBandwidthTx;
                this.instanceCategory = model.instanceCategory;
                this.instanceFamilyLevel = model.instanceFamilyLevel;
                this.instancePpsRx = model.instancePpsRx;
                this.instancePpsTx = model.instancePpsTx;
                this.instanceTypeFamily = model.instanceTypeFamily;
                this.instanceTypeId = model.instanceTypeId;
                this.jumboFrameSupport = model.jumboFrameSupport;
                this.localStorageAmount = model.localStorageAmount;
                this.localStorageCapacity = model.localStorageCapacity;
                this.localStorageCategory = model.localStorageCategory;
                this.maximumQueueNumberPerEni = model.maximumQueueNumberPerEni;
                this.memorySize = model.memorySize;
                this.networkCardQuantity = model.networkCardQuantity;
                this.networkCards = model.networkCards;
                this.networkEncryptionSupport = model.networkEncryptionSupport;
                this.nvmeSupport = model.nvmeSupport;
                this.physicalProcessorModel = model.physicalProcessorModel;
                this.primaryEniQueueNumber = model.primaryEniQueueNumber;
                this.queuePairNumber = model.queuePairNumber;
                this.secondaryEniQueueNumber = model.secondaryEniQueueNumber;
                this.supportedBootModes = model.supportedBootModes;
                this.totalEniQueueQuantity = model.totalEniQueueQuantity;
            } 

            /**
             * Attributes.
             */
            public Builder attributes(Attributes attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The baseline vCPU computing performance (overall baseline performance of all vCPUs) per t5 or t6 burstable instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder baselineCredit(Integer baselineCredit) {
                this.baselineCredit = baselineCredit;
                return this;
            }

            /**
             * Clock.
             */
            public Builder clock(Clock clock) {
                this.clock = clock;
                return this;
            }

            /**
             * <p>The CPU architecture. Valid values:</p>
             * <ul>
             * <li>X86</li>
             * <li>ARM</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>X86</p>
             */
            public Builder cpuArchitecture(String cpuArchitecture) {
                this.cpuArchitecture = cpuArchitecture;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * <p>The CPU options.</p>
             */
            public Builder cpuOptions(CpuOptions cpuOptions) {
                this.cpuOptions = cpuOptions;
                return this;
            }

            /**
             * <p>The CPU base frequency. Unit: GHz.</p>
             * 
             * <strong>example:</strong>
             * <p>2.7</p>
             */
            public Builder cpuSpeedFrequency(Float cpuSpeedFrequency) {
                this.cpuSpeedFrequency = cpuSpeedFrequency;
                return this;
            }

            /**
             * <p>The CPU turbo frequency. Unit: GHz.</p>
             * 
             * <strong>example:</strong>
             * <p>3.5</p>
             */
            public Builder cpuTurboFrequency(Float cpuTurboFrequency) {
                this.cpuTurboFrequency = cpuTurboFrequency;
                return this;
            }

            /**
             * <p>The maximum number of cloud disks per instance.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder diskQuantity(Integer diskQuantity) {
                this.diskQuantity = diskQuantity;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             */
            public Builder enhancedNetwork(EnhancedNetwork enhancedNetwork) {
                this.enhancedNetwork = enhancedNetwork;
                return this;
            }

            /**
             * <p>The maximum number of IPv6 addresses per ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
                this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
                return this;
            }

            /**
             * <p>The maximum number of IPv4 addresses per ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder eniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
                this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
                return this;
            }

            /**
             * <p>The maximum number of ENIs per instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder eniQuantity(Integer eniQuantity) {
                this.eniQuantity = eniQuantity;
                return this;
            }

            /**
             * <p>The maximum number of ENIs, including primary, secondary, and trunk ENIs.</p>
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder eniTotalQuantity(Integer eniTotalQuantity) {
                this.eniTotalQuantity = eniTotalQuantity;
                return this;
            }

            /**
             * <p>Indicates whether trunk ENIs are supported.</p>
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder eniTrunkSupported(Boolean eniTrunkSupported) {
                this.eniTrunkSupported = eniTrunkSupported;
                return this;
            }

            /**
             * <p>The number of ERIs.</p>
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder eriQuantity(Integer eriQuantity) {
                this.eriQuantity = eriQuantity;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder GPUAmount(Integer GPUAmount) {
                this.GPUAmount = GPUAmount;
                return this;
            }

            /**
             * <p>The amount of GPU memory per GPU. Unit: GiB</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder GPUMemorySize(Float GPUMemorySize) {
                this.GPUMemorySize = GPUMemorySize;
                return this;
            }

            /**
             * <p>The GPU model.</p>
             * 
             * <strong>example:</strong>
             * <p>NVIDIA V100</p>
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * <p>The initial vCPU credits per t5 or t6 burstable instance.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder initialCredit(Integer initialCredit) {
                this.initialCredit = initialCredit;
                return this;
            }

            /**
             * <p>The maximum inbound internal bandwidth. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1024000</p>
             */
            public Builder instanceBandwidthRx(Integer instanceBandwidthRx) {
                this.instanceBandwidthRx = instanceBandwidthRx;
                return this;
            }

            /**
             * <p>The maximum outbound internal bandwidth. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1024000</p>
             */
            public Builder instanceBandwidthTx(Integer instanceBandwidthTx) {
                this.instanceBandwidthTx = instanceBandwidthTx;
                return this;
            }

            /**
             * <p>The category of the instance type. Valid values:</p>
             * <ul>
             * <li>General-purpose</li>
             * <li>Compute-optimized</li>
             * <li>Memory-optimized</li>
             * <li>Big data</li>
             * <li>Local SSDs</li>
             * <li>High Clock Speed</li>
             * <li>Enhanced</li>
             * <li>Shared</li>
             * <li>Compute-optimized with GPU</li>
             * <li>Visual Compute-optimized</li>
             * <li>Heterogeneous Service</li>
             * <li>Compute-optimized with FPGA</li>
             * <li>Compute-optimized with NPU</li>
             * <li>ECS Bare Metal</li>
             * <li>Super Computing Cluster</li>
             * <li>High Performance Compute</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Big data</p>
             */
            public Builder instanceCategory(String instanceCategory) {
                this.instanceCategory = instanceCategory;
                return this;
            }

            /**
             * <p>The level of the instance family. Valid values:</p>
             * <ul>
             * <li>EntryLevel: entry level (shared).</li>
             * <li>EnterpriseLevel: enterprise level.</li>
             * <li>CreditEntryLevel: credit-based entry level. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EnterpriseLevel</p>
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * <p>The inbound packet forwarding rate over the internal network. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>500000</p>
             */
            public Builder instancePpsRx(Long instancePpsRx) {
                this.instancePpsRx = instancePpsRx;
                return this;
            }

            /**
             * <p>The outbound packet forwarding rate over the internal network. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>500000</p>
             */
            public Builder instancePpsTx(Long instancePpsTx) {
                this.instancePpsTx = instancePpsTx;
                return this;
            }

            /**
             * <p>The instance family.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6</p>
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * <p>The ID of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6.large</p>
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * <p>Indicates whether jumbo frames are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder jumboFrameSupport(Boolean jumboFrameSupport) {
                this.jumboFrameSupport = jumboFrameSupport;
                return this;
            }

            /**
             * <p>The number of local disks per instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder localStorageAmount(Integer localStorageAmount) {
                this.localStorageAmount = localStorageAmount;
                return this;
            }

            /**
             * <p>The capacity of each local disk. Unit: GiB</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder localStorageCapacity(Long localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            /**
             * <p>The category of local disks. For more information, see <a href="https://help.aliyun.com/document_detail/63138.html">Local disks</a>. Valid values:</p>
             * <ul>
             * <li>local_hdd_pro: local SATA HDDs, which are attached to d1ne or d1 instances</li>
             * <li>local_ssd_pro: local NVMe SSDs, which are attached to i2, i2g, i1, ga1, or gn5 instances</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>local_ssd_pro</p>
             */
            public Builder localStorageCategory(String localStorageCategory) {
                this.localStorageCategory = localStorageCategory;
                return this;
            }

            /**
             * <p>The maximum number of queues per ENI, including primary and secondary ENIs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder maximumQueueNumberPerEni(Integer maximumQueueNumberPerEni) {
                this.maximumQueueNumberPerEni = maximumQueueNumberPerEni;
                return this;
            }

            /**
             * <p>The memory size. Unit: GiB</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memorySize(Float memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * <p>The maximum number of network cards that the instance type supports.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder networkCardQuantity(Integer networkCardQuantity) {
                this.networkCardQuantity = networkCardQuantity;
                return this;
            }

            /**
             * <p>The information about the network cards.</p>
             */
            public Builder networkCards(NetworkCards networkCards) {
                this.networkCards = networkCards;
                return this;
            }

            /**
             * <p>Indicates whether to allow network traffic transmitted over virtual private clouds (VPCs) to be encrypted. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder networkEncryptionSupport(Boolean networkEncryptionSupport) {
                this.networkEncryptionSupport = networkEncryptionSupport;
                return this;
            }

            /**
             * <p>Indicates whether cloud disks can be attached by using the NVMe protocol. Valid values:</p>
             * <ul>
             * <li>required: Cloud disks can be attached by using the NVMe protocol.</li>
             * <li>unsupported: Cloud disks cannot be attached by using the NVMe protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>unsupported</p>
             */
            public Builder nvmeSupport(String nvmeSupport) {
                this.nvmeSupport = nvmeSupport;
                return this;
            }

            /**
             * <p>The CPU model.</p>
             * 
             * <strong>example:</strong>
             * <p>Intel Xeon(Ice Lake) Platinum 8369B</p>
             */
            public Builder physicalProcessorModel(String physicalProcessorModel) {
                this.physicalProcessorModel = physicalProcessorModel;
                return this;
            }

            /**
             * <p>The default number of queues per primary ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder primaryEniQueueNumber(Integer primaryEniQueueNumber) {
                this.primaryEniQueueNumber = primaryEniQueueNumber;
                return this;
            }

            /**
             * <p>The maximum number of QPs per instance, which varies based on the instance type.</p>
             * <ul>
             * <li>For enterprise-level CPU-based instance types, the value of <code>QueuePairNumber</code> is the maximum number of QPs per instance.</li>
             * <li>For GPU-accelerated instance types, the maximum number of QPs per instance is calculated by using the following formula: Value of <code>QueuePairNumber</code> × Value of NetworkCardQuantity.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder queuePairNumber(Integer queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
                return this;
            }

            /**
             * <p>The default number of queues per secondary ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder secondaryEniQueueNumber(Integer secondaryEniQueueNumber) {
                this.secondaryEniQueueNumber = secondaryEniQueueNumber;
                return this;
            }

            /**
             * <p>The boot modes supported by the instance type.</p>
             */
            public Builder supportedBootModes(SupportedBootModes supportedBootModes) {
                this.supportedBootModes = supportedBootModes;
                return this;
            }

            /**
             * <p>The maximum number of queues on ENIs that the instance type supports.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalEniQueueQuantity(Integer totalEniQueueQuantity) {
                this.totalEniQueueQuantity = totalEniQueueQuantity;
                return this;
            }

            public InstanceType build() {
                return new InstanceType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTypesResponseBody</p>
     */
    public static class InstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private java.util.List<InstanceType> instanceType;

        private InstanceTypes(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public java.util.List<InstanceType> getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private java.util.List<InstanceType> instanceType; 

            private Builder() {
            } 

            private Builder(InstanceTypes model) {
                this.instanceType = model.instanceType;
            } 

            /**
             * InstanceType.
             */
            public Builder instanceType(java.util.List<InstanceType> instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
}
