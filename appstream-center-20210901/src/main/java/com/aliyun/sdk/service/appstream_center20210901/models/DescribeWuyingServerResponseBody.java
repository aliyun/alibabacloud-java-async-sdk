// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DescribeWuyingServerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWuyingServerResponseBody</p>
 */
public class DescribeWuyingServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWuyingServerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWuyingServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeWuyingServerResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the development host.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWuyingServerResponseBody build() {
            return new DescribeWuyingServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWuyingServerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWuyingServerResponseBody</p>
     */
    public static class PrivateIpSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        private PrivateIpSets(Builder builder) {
            this.primary = builder.primary;
            this.privateIpAddress = builder.privateIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSets create() {
            return builder().build();
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public static final class Builder {
            private Boolean primary; 
            private String privateIpAddress; 

            private Builder() {
            } 

            private Builder(PrivateIpSets model) {
                this.primary = model.primary;
                this.privateIpAddress = model.privateIpAddress;
            } 

            /**
             * <p>Indicates whether the IP address is the primary private IP address. Valid values: true: The IP address is the primary private IP address. false: The IP address is a secondary private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            public PrivateIpSets build() {
                return new PrivateIpSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWuyingServerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWuyingServerResponseBody</p>
     */
    public static class ServerInstanceTypeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private String gpu;

        @com.aliyun.core.annotation.NameInMap("GpuMemory")
        private Integer gpuMemory;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("ServerInstanceType")
        private String serverInstanceType;

        private ServerInstanceTypeInfo(Builder builder) {
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.gpuMemory = builder.gpuMemory;
            this.gpuSpec = builder.gpuSpec;
            this.memory = builder.memory;
            this.serverInstanceType = builder.serverInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerInstanceTypeInfo create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return gpu
         */
        public String getGpu() {
            return this.gpu;
        }

        /**
         * @return gpuMemory
         */
        public Integer getGpuMemory() {
            return this.gpuMemory;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return serverInstanceType
         */
        public String getServerInstanceType() {
            return this.serverInstanceType;
        }

        public static final class Builder {
            private String cpu; 
            private String gpu; 
            private Integer gpuMemory; 
            private String gpuSpec; 
            private Integer memory; 
            private String serverInstanceType; 

            private Builder() {
            } 

            private Builder(ServerInstanceTypeInfo model) {
                this.cpu = model.cpu;
                this.gpu = model.gpu;
                this.gpuMemory = model.gpuMemory;
                this.gpuSpec = model.gpuSpec;
                this.memory = model.memory;
                this.serverInstanceType = model.serverInstanceType;
            } 

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(String gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * GpuMemory.
             */
            public Builder gpuMemory(Integer gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * GpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * ServerInstanceType.
             */
            public Builder serverInstanceType(String serverInstanceType) {
                this.serverInstanceType = serverInstanceType;
                return this;
            }

            public ServerInstanceTypeInfo build() {
                return new ServerInstanceTypeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWuyingServerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWuyingServerResponseBody</p>
     */
    public static class ServerModelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InferenceEngine")
        private String inferenceEngine;

        @com.aliyun.core.annotation.NameInMap("InputModalities")
        private java.util.List<String> inputModalities;

        @com.aliyun.core.annotation.NameInMap("MaxModelLen")
        private Long maxModelLen;

        @com.aliyun.core.annotation.NameInMap("MaxNumSeqs")
        private Integer maxNumSeqs;

        @com.aliyun.core.annotation.NameInMap("ModelAccessMethod")
        private String modelAccessMethod;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelServiceInferenceStatus")
        private String modelServiceInferenceStatus;

        @com.aliyun.core.annotation.NameInMap("OutputModalities")
        private java.util.List<String> outputModalities;

        @com.aliyun.core.annotation.NameInMap("ServedModelName")
        private String servedModelName;

        private ServerModelInfo(Builder builder) {
            this.inferenceEngine = builder.inferenceEngine;
            this.inputModalities = builder.inputModalities;
            this.maxModelLen = builder.maxModelLen;
            this.maxNumSeqs = builder.maxNumSeqs;
            this.modelAccessMethod = builder.modelAccessMethod;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.modelServiceInferenceStatus = builder.modelServiceInferenceStatus;
            this.outputModalities = builder.outputModalities;
            this.servedModelName = builder.servedModelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerModelInfo create() {
            return builder().build();
        }

        /**
         * @return inferenceEngine
         */
        public String getInferenceEngine() {
            return this.inferenceEngine;
        }

        /**
         * @return inputModalities
         */
        public java.util.List<String> getInputModalities() {
            return this.inputModalities;
        }

        /**
         * @return maxModelLen
         */
        public Long getMaxModelLen() {
            return this.maxModelLen;
        }

        /**
         * @return maxNumSeqs
         */
        public Integer getMaxNumSeqs() {
            return this.maxNumSeqs;
        }

        /**
         * @return modelAccessMethod
         */
        public String getModelAccessMethod() {
            return this.modelAccessMethod;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelServiceInferenceStatus
         */
        public String getModelServiceInferenceStatus() {
            return this.modelServiceInferenceStatus;
        }

        /**
         * @return outputModalities
         */
        public java.util.List<String> getOutputModalities() {
            return this.outputModalities;
        }

        /**
         * @return servedModelName
         */
        public String getServedModelName() {
            return this.servedModelName;
        }

        public static final class Builder {
            private String inferenceEngine; 
            private java.util.List<String> inputModalities; 
            private Long maxModelLen; 
            private Integer maxNumSeqs; 
            private String modelAccessMethod; 
            private String modelId; 
            private String modelName; 
            private String modelServiceInferenceStatus; 
            private java.util.List<String> outputModalities; 
            private String servedModelName; 

            private Builder() {
            } 

            private Builder(ServerModelInfo model) {
                this.inferenceEngine = model.inferenceEngine;
                this.inputModalities = model.inputModalities;
                this.maxModelLen = model.maxModelLen;
                this.maxNumSeqs = model.maxNumSeqs;
                this.modelAccessMethod = model.modelAccessMethod;
                this.modelId = model.modelId;
                this.modelName = model.modelName;
                this.modelServiceInferenceStatus = model.modelServiceInferenceStatus;
                this.outputModalities = model.outputModalities;
                this.servedModelName = model.servedModelName;
            } 

            /**
             * InferenceEngine.
             */
            public Builder inferenceEngine(String inferenceEngine) {
                this.inferenceEngine = inferenceEngine;
                return this;
            }

            /**
             * InputModalities.
             */
            public Builder inputModalities(java.util.List<String> inputModalities) {
                this.inputModalities = inputModalities;
                return this;
            }

            /**
             * MaxModelLen.
             */
            public Builder maxModelLen(Long maxModelLen) {
                this.maxModelLen = maxModelLen;
                return this;
            }

            /**
             * MaxNumSeqs.
             */
            public Builder maxNumSeqs(Integer maxNumSeqs) {
                this.maxNumSeqs = maxNumSeqs;
                return this;
            }

            /**
             * ModelAccessMethod.
             */
            public Builder modelAccessMethod(String modelAccessMethod) {
                this.modelAccessMethod = modelAccessMethod;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * ModelServiceInferenceStatus.
             */
            public Builder modelServiceInferenceStatus(String modelServiceInferenceStatus) {
                this.modelServiceInferenceStatus = modelServiceInferenceStatus;
                return this;
            }

            /**
             * OutputModalities.
             */
            public Builder outputModalities(java.util.List<String> outputModalities) {
                this.outputModalities = outputModalities;
                return this;
            }

            /**
             * ServedModelName.
             */
            public Builder servedModelName(String servedModelName) {
                this.servedModelName = servedModelName;
                return this;
            }

            public ServerModelInfo build() {
                return new ServerModelInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWuyingServerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWuyingServerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BizRegionId")
        private String bizRegionId;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EniPrivateIpAddressQuantity")
        private Integer eniPrivateIpAddressQuantity;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIp")
        private String networkInterfaceIp;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
        private String officeSiteType;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PrivateIpSets")
        private java.util.List<PrivateIpSets> privateIpSets;

        @com.aliyun.core.annotation.NameInMap("ServerInstanceTypeInfo")
        private ServerInstanceTypeInfo serverInstanceTypeInfo;

        @com.aliyun.core.annotation.NameInMap("ServerModelInfo")
        private ServerModelInfo serverModelInfo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportASP")
        private Boolean supportASP;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("WuyingServerId")
        private String wuyingServerId;

        @com.aliyun.core.annotation.NameInMap("WuyingServerName")
        private String wuyingServerName;

        private Data(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bizRegionId = builder.bizRegionId;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.eniPrivateIpAddressQuantity = builder.eniPrivateIpAddressQuantity;
            this.expiredTime = builder.expiredTime;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.networkInterfaceIp = builder.networkInterfaceIp;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.osType = builder.osType;
            this.privateIpSets = builder.privateIpSets;
            this.serverInstanceTypeInfo = builder.serverInstanceTypeInfo;
            this.serverModelInfo = builder.serverModelInfo;
            this.status = builder.status;
            this.supportASP = builder.supportASP;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
            this.wuyingServerId = builder.wuyingServerId;
            this.wuyingServerName = builder.wuyingServerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bizRegionId
         */
        public String getBizRegionId() {
            return this.bizRegionId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return eniPrivateIpAddressQuantity
         */
        public Integer getEniPrivateIpAddressQuantity() {
            return this.eniPrivateIpAddressQuantity;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return networkInterfaceIp
         */
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteName
         */
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        /**
         * @return officeSiteType
         */
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return privateIpSets
         */
        public java.util.List<PrivateIpSets> getPrivateIpSets() {
            return this.privateIpSets;
        }

        /**
         * @return serverInstanceTypeInfo
         */
        public ServerInstanceTypeInfo getServerInstanceTypeInfo() {
            return this.serverInstanceTypeInfo;
        }

        /**
         * @return serverModelInfo
         */
        public ServerModelInfo getServerModelInfo() {
            return this.serverModelInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportASP
         */
        public Boolean getSupportASP() {
            return this.supportASP;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return wuyingServerId
         */
        public String getWuyingServerId() {
            return this.wuyingServerId;
        }

        /**
         * @return wuyingServerName
         */
        public String getWuyingServerName() {
            return this.wuyingServerName;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String bizRegionId; 
            private String chargeType; 
            private String createTime; 
            private Integer eniPrivateIpAddressQuantity; 
            private String expiredTime; 
            private String imageId; 
            private String imageName; 
            private String networkInterfaceIp; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String osType; 
            private java.util.List<PrivateIpSets> privateIpSets; 
            private ServerInstanceTypeInfo serverInstanceTypeInfo; 
            private ServerModelInfo serverModelInfo; 
            private String status; 
            private Boolean supportASP; 
            private String systemDiskCategory; 
            private Integer systemDiskSize; 
            private String wuyingServerId; 
            private String wuyingServerName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bandwidth = model.bandwidth;
                this.bizRegionId = model.bizRegionId;
                this.chargeType = model.chargeType;
                this.createTime = model.createTime;
                this.eniPrivateIpAddressQuantity = model.eniPrivateIpAddressQuantity;
                this.expiredTime = model.expiredTime;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.networkInterfaceIp = model.networkInterfaceIp;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.officeSiteType = model.officeSiteType;
                this.osType = model.osType;
                this.privateIpSets = model.privateIpSets;
                this.serverInstanceTypeInfo = model.serverInstanceTypeInfo;
                this.serverModelInfo = model.serverModelInfo;
                this.status = model.status;
                this.supportASP = model.supportASP;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskSize = model.systemDiskSize;
                this.wuyingServerId = model.wuyingServerId;
                this.wuyingServerName = model.wuyingServerName;
            } 

            /**
             * <p>The bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder bizRegionId(String bizRegionId) {
                this.bizRegionId = bizRegionId;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The creation time. The time is displayed in the 12-hour US English date and time format.</p>
             * 
             * <strong>example:</strong>
             * <p>Sep 2, 2026 1:46:41 PM</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The maximum number of private IP addresses per elastic network interface (ENI), including the primary IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder eniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
                this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
                return this;
            }

            /**
             * <p>The expiration time. The time is displayed in the 12-hour US English date and time format.</p>
             * 
             * <strong>example:</strong>
             * <p>Oct 3, 2026 12:00:00 AM</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>img-bp1234567890abcde</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>Ubuntu 22.04</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The internal IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1</p>
             */
            public Builder networkInterfaceIp(String networkInterfaceIp) {
                this.networkInterfaceIp = networkInterfaceIp;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-abc123</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The workspace name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default workspace</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The workspace type.</p>
             * 
             * <strong>example:</strong>
             * <p>Simple</p>
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * <p>The operating system type.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The set of private IP addresses, including the primary and secondary IP addresses.</p>
             */
            public Builder privateIpSets(java.util.List<PrivateIpSets> privateIpSets) {
                this.privateIpSets = privateIpSets;
                return this;
            }

            /**
             * ServerInstanceTypeInfo.
             */
            public Builder serverInstanceTypeInfo(ServerInstanceTypeInfo serverInstanceTypeInfo) {
                this.serverInstanceTypeInfo = serverInstanceTypeInfo;
                return this;
            }

            /**
             * ServerModelInfo.
             */
            public Builder serverModelInfo(ServerModelInfo serverModelInfo) {
                this.serverModelInfo = serverModelInfo;
                return this;
            }

            /**
             * <p>The status of the development host.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Whether ASP streaming connection is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportASP(Boolean supportASP) {
                this.supportASP = supportASP;
                return this;
            }

            /**
             * <p>The category of the system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The size of the system cloud disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The ID of the development host.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-bp1234567890abcde</p>
             */
            public Builder wuyingServerId(String wuyingServerId) {
                this.wuyingServerId = wuyingServerId;
                return this;
            }

            /**
             * <p>The name of the development host.</p>
             * 
             * <strong>example:</strong>
             * <p>my-dev-server</p>
             */
            public Builder wuyingServerName(String wuyingServerName) {
                this.wuyingServerName = wuyingServerName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
