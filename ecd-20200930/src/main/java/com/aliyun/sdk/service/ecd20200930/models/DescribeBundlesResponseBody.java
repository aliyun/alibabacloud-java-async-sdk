// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeBundlesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBundlesResponseBody</p>
 */
public class DescribeBundlesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bundles")
    private java.util.List<Bundles> bundles;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBundlesResponseBody(Builder builder) {
        this.bundles = builder.bundles;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBundlesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bundles
     */
    public java.util.List<Bundles> getBundles() {
        return this.bundles;
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
        private java.util.List<Bundles> bundles; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The details of the queried cloud computer templates.</p>
         */
        public Builder bundles(java.util.List<Bundles> bundles) {
            this.bundles = bundles;
            return this;
        }

        /**
         * <p>The token that is used for the next query. If this parameter is empty, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6lu3PTF6h3zE8egwlYuv8M8</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BCC854D8-5D1E-46D3-96EF-797A5DD36789</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBundlesResponseBody build() {
            return new DescribeBundlesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBundlesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBundlesResponseBody</p>
     */
    public static class DesktopTypeAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuCount")
        private Integer cpuCount;

        @com.aliyun.core.annotation.NameInMap("GpuCount")
        private Float gpuCount;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private Integer memorySize;

        private DesktopTypeAttribute(Builder builder) {
            this.cpuCount = builder.cpuCount;
            this.gpuCount = builder.gpuCount;
            this.gpuSpec = builder.gpuSpec;
            this.memorySize = builder.memorySize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopTypeAttribute create() {
            return builder().build();
        }

        /**
         * @return cpuCount
         */
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        /**
         * @return gpuCount
         */
        public Float getGpuCount() {
            return this.gpuCount;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return memorySize
         */
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public static final class Builder {
            private Integer cpuCount; 
            private Float gpuCount; 
            private String gpuSpec; 
            private Integer memorySize; 

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cpuCount(Integer cpuCount) {
                this.cpuCount = cpuCount;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * <p>The GPU type.</p>
             * 
             * <strong>example:</strong>
             * <p>NVIDIA T4</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The memory size. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>47104</p>
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            public DesktopTypeAttribute build() {
                return new DesktopTypeAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBundlesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBundlesResponseBody</p>
     */
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskPerformanceLevel")
        private String diskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        private Disks(Builder builder) {
            this.diskPerformanceLevel = builder.diskPerformanceLevel;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return diskPerformanceLevel
         */
        public String getDiskPerformanceLevel() {
            return this.diskPerformanceLevel;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        public static final class Builder {
            private String diskPerformanceLevel; 
            private Integer diskSize; 
            private String diskType; 

            /**
             * <p>The PL of the disk.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>PL1</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>PL0</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>PL3</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>PL2</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder diskPerformanceLevel(String diskPerformanceLevel) {
                this.diskPerformanceLevel = diskPerformanceLevel;
                return this;
            }

            /**
             * <p>The size of the disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The type of the disk.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>SYSTEM: system disk</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>DATA: data disk</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBundlesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBundlesResponseBody</p>
     */
    public static class Bundles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BundleId")
        private String bundleId;

        @com.aliyun.core.annotation.NameInMap("BundleName")
        private String bundleName;

        @com.aliyun.core.annotation.NameInMap("BundleType")
        private String bundleType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesktopType")
        private String desktopType;

        @com.aliyun.core.annotation.NameInMap("DesktopTypeAttribute")
        private DesktopTypeAttribute desktopTypeAttribute;

        @com.aliyun.core.annotation.NameInMap("DesktopTypeFamily")
        private String desktopTypeFamily;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List<Disks> disks;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageStatus")
        private String imageStatus;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("SessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("StockState")
        private String stockState;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionKey")
        private String volumeEncryptionKey;

        private Bundles(Builder builder) {
            this.bundleId = builder.bundleId;
            this.bundleName = builder.bundleName;
            this.bundleType = builder.bundleType;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.desktopType = builder.desktopType;
            this.desktopTypeAttribute = builder.desktopTypeAttribute;
            this.desktopTypeFamily = builder.desktopTypeFamily;
            this.disks = builder.disks;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageStatus = builder.imageStatus;
            this.language = builder.language;
            this.osType = builder.osType;
            this.platform = builder.platform;
            this.protocolType = builder.protocolType;
            this.sessionType = builder.sessionType;
            this.stockState = builder.stockState;
            this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
            this.volumeEncryptionKey = builder.volumeEncryptionKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bundles create() {
            return builder().build();
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return bundleName
         */
        public String getBundleName() {
            return this.bundleName;
        }

        /**
         * @return bundleType
         */
        public String getBundleType() {
            return this.bundleType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return desktopType
         */
        public String getDesktopType() {
            return this.desktopType;
        }

        /**
         * @return desktopTypeAttribute
         */
        public DesktopTypeAttribute getDesktopTypeAttribute() {
            return this.desktopTypeAttribute;
        }

        /**
         * @return desktopTypeFamily
         */
        public String getDesktopTypeFamily() {
            return this.desktopTypeFamily;
        }

        /**
         * @return disks
         */
        public java.util.List<Disks> getDisks() {
            return this.disks;
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
         * @return imageStatus
         */
        public String getImageStatus() {
            return this.imageStatus;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return sessionType
         */
        public String getSessionType() {
            return this.sessionType;
        }

        /**
         * @return stockState
         */
        public String getStockState() {
            return this.stockState;
        }

        /**
         * @return volumeEncryptionEnabled
         */
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        /**
         * @return volumeEncryptionKey
         */
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

        public static final class Builder {
            private String bundleId; 
            private String bundleName; 
            private String bundleType; 
            private String creationTime; 
            private String description; 
            private String desktopType; 
            private DesktopTypeAttribute desktopTypeAttribute; 
            private String desktopTypeFamily; 
            private java.util.List<Disks> disks; 
            private String imageId; 
            private String imageName; 
            private String imageStatus; 
            private String language; 
            private String osType; 
            private String platform; 
            private String protocolType; 
            private String sessionType; 
            private String stockState; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 

            /**
             * <p>The ID of the cloud computer template.</p>
             * 
             * <strong>example:</strong>
             * <p>bundle_ecd_graphics.2xlarge_s15d15_win2019</p>
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * <p>The name of the cloud computer template.</p>
             * 
             * <strong>example:</strong>
             * <p>Advanced graphics with Windows 2019</p>
             */
            public Builder bundleName(String bundleName) {
                this.bundleName = bundleName;
                return this;
            }

            /**
             * <p>The type of the cloud computer template.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>SYSTEM: system template</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>CUSTOM: custom template</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder bundleType(String bundleType) {
                this.bundleType = bundleType;
                return this;
            }

            /**
             * <p>The time when the cloud computer template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-30T06:09Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the cloud computer template.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance type of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd.graphics.2xlarge</p>
             */
            public Builder desktopType(String desktopType) {
                this.desktopType = desktopType;
                return this;
            }

            /**
             * <p>The details of the cloud computer instance type.</p>
             */
            public Builder desktopTypeAttribute(DesktopTypeAttribute desktopTypeAttribute) {
                this.desktopTypeAttribute = desktopTypeAttribute;
                return this;
            }

            /**
             * <p>The instance family of the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>eds.graphics: graphical instance family</li>
             * <li>eds.hf: instance family with a high clock speed</li>
             * <li>eds.general: general-purpose instance family</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>eds.general</p>
             */
            public Builder desktopTypeFamily(String desktopTypeFamily) {
                this.desktopTypeFamily = desktopTypeFamily;
                return this;
            }

            /**
             * <p>Details of the disks.</p>
             */
            public Builder disks(java.util.List<Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>desktopimage-windows-server-2019-64-ch-vgpu</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows server 2019 Chinese</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The status of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder imageStatus(String imageStatus) {
                this.imageStatus = imageStatus;
                return this;
            }

            /**
             * <p>The OS language of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>en-US</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The type of the OS.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Linux</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Windows</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The OS.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Ubuntu</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Windows Server 2022</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>UOS</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>CentOS</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Windows Server 2019</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Windows Server 2016</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows Server 2019</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>HDX: HDX protocol</li>
             * <li>ASP: in-house ASP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The session type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: single-session</li>
             * <li>1: multi-session</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * <p>The inventory status of the cloud computer instance type. This parameter is returned only if you set the <code>CheckStock</code> parameter to <code>true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Sufficient</p>
             */
            public Builder stockState(String stockState) {
                this.stockState = stockState;
                return this;
            }

            /**
             * <p>Indicates whether disk encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
             */
            public Builder volumeEncryptionKey(String volumeEncryptionKey) {
                this.volumeEncryptionKey = volumeEncryptionKey;
                return this;
            }

            public Bundles build() {
                return new Bundles(this);
            } 

        } 

    }
}
