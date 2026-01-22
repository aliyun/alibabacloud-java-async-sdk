// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link GetEmbodiedAIPlatformResourceUsageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetEmbodiedAIPlatformResourceUsageInfoResponseBody</p>
 */
public class GetEmbodiedAIPlatformResourceUsageInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GpuDetails")
    private java.util.List<GpuDetails> gpuDetails;

    @com.aliyun.core.annotation.NameInMap("MaxRegisteredDevices")
    private Long maxRegisteredDevices;

    @com.aliyun.core.annotation.NameInMap("RegisteredDeviceCount")
    private Long registeredDeviceCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlbTraffic")
    private SlbTraffic slbTraffic;

    @com.aliyun.core.annotation.NameInMap("StorageUsage")
    private StorageUsage storageUsage;

    private GetEmbodiedAIPlatformResourceUsageInfoResponseBody(Builder builder) {
        this.gpuDetails = builder.gpuDetails;
        this.maxRegisteredDevices = builder.maxRegisteredDevices;
        this.registeredDeviceCount = builder.registeredDeviceCount;
        this.requestId = builder.requestId;
        this.slbTraffic = builder.slbTraffic;
        this.storageUsage = builder.storageUsage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEmbodiedAIPlatformResourceUsageInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gpuDetails
     */
    public java.util.List<GpuDetails> getGpuDetails() {
        return this.gpuDetails;
    }

    /**
     * @return maxRegisteredDevices
     */
    public Long getMaxRegisteredDevices() {
        return this.maxRegisteredDevices;
    }

    /**
     * @return registeredDeviceCount
     */
    public Long getRegisteredDeviceCount() {
        return this.registeredDeviceCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slbTraffic
     */
    public SlbTraffic getSlbTraffic() {
        return this.slbTraffic;
    }

    /**
     * @return storageUsage
     */
    public StorageUsage getStorageUsage() {
        return this.storageUsage;
    }

    public static final class Builder {
        private java.util.List<GpuDetails> gpuDetails; 
        private Long maxRegisteredDevices; 
        private Long registeredDeviceCount; 
        private String requestId; 
        private SlbTraffic slbTraffic; 
        private StorageUsage storageUsage; 

        private Builder() {
        } 

        private Builder(GetEmbodiedAIPlatformResourceUsageInfoResponseBody model) {
            this.gpuDetails = model.gpuDetails;
            this.maxRegisteredDevices = model.maxRegisteredDevices;
            this.registeredDeviceCount = model.registeredDeviceCount;
            this.requestId = model.requestId;
            this.slbTraffic = model.slbTraffic;
            this.storageUsage = model.storageUsage;
        } 

        /**
         * GpuDetails.
         */
        public Builder gpuDetails(java.util.List<GpuDetails> gpuDetails) {
            this.gpuDetails = gpuDetails;
            return this;
        }

        /**
         * MaxRegisteredDevices.
         */
        public Builder maxRegisteredDevices(Long maxRegisteredDevices) {
            this.maxRegisteredDevices = maxRegisteredDevices;
            return this;
        }

        /**
         * RegisteredDeviceCount.
         */
        public Builder registeredDeviceCount(Long registeredDeviceCount) {
            this.registeredDeviceCount = registeredDeviceCount;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B47EED99-BFA5-529D-8D85-A6642421D390</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlbTraffic.
         */
        public Builder slbTraffic(SlbTraffic slbTraffic) {
            this.slbTraffic = slbTraffic;
            return this;
        }

        /**
         * StorageUsage.
         */
        public Builder storageUsage(StorageUsage storageUsage) {
            this.storageUsage = storageUsage;
            return this;
        }

        public GetEmbodiedAIPlatformResourceUsageInfoResponseBody build() {
            return new GetEmbodiedAIPlatformResourceUsageInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEmbodiedAIPlatformResourceUsageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmbodiedAIPlatformResourceUsageInfoResponseBody</p>
     */
    public static class GpuDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GpuModel")
        private String gpuModel;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private GpuDetails(Builder builder) {
            this.gpuModel = builder.gpuModel;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GpuDetails create() {
            return builder().build();
        }

        /**
         * @return gpuModel
         */
        public String getGpuModel() {
            return this.gpuModel;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String gpuModel; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(GpuDetails model) {
                this.gpuModel = model.gpuModel;
                this.totalCount = model.totalCount;
            } 

            /**
             * GpuModel.
             */
            public Builder gpuModel(String gpuModel) {
                this.gpuModel = gpuModel;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public GpuDetails build() {
                return new GpuDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEmbodiedAIPlatformResourceUsageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmbodiedAIPlatformResourceUsageInfoResponseBody</p>
     */
    public static class SlbTraffic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalBytesIn")
        private Long totalBytesIn;

        @com.aliyun.core.annotation.NameInMap("TotalBytesOut")
        private Long totalBytesOut;

        private SlbTraffic(Builder builder) {
            this.totalBytesIn = builder.totalBytesIn;
            this.totalBytesOut = builder.totalBytesOut;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlbTraffic create() {
            return builder().build();
        }

        /**
         * @return totalBytesIn
         */
        public Long getTotalBytesIn() {
            return this.totalBytesIn;
        }

        /**
         * @return totalBytesOut
         */
        public Long getTotalBytesOut() {
            return this.totalBytesOut;
        }

        public static final class Builder {
            private Long totalBytesIn; 
            private Long totalBytesOut; 

            private Builder() {
            } 

            private Builder(SlbTraffic model) {
                this.totalBytesIn = model.totalBytesIn;
                this.totalBytesOut = model.totalBytesOut;
            } 

            /**
             * TotalBytesIn.
             */
            public Builder totalBytesIn(Long totalBytesIn) {
                this.totalBytesIn = totalBytesIn;
                return this;
            }

            /**
             * TotalBytesOut.
             */
            public Builder totalBytesOut(Long totalBytesOut) {
                this.totalBytesOut = totalBytesOut;
                return this;
            }

            public SlbTraffic build() {
                return new SlbTraffic(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEmbodiedAIPlatformResourceUsageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmbodiedAIPlatformResourceUsageInfoResponseBody</p>
     */
    public static class Nas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MeteredSize")
        private Long meteredSize;

        private Nas(Builder builder) {
            this.meteredSize = builder.meteredSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nas create() {
            return builder().build();
        }

        /**
         * @return meteredSize
         */
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public static final class Builder {
            private Long meteredSize; 

            private Builder() {
            } 

            private Builder(Nas model) {
                this.meteredSize = model.meteredSize;
            } 

            /**
             * MeteredSize.
             */
            public Builder meteredSize(Long meteredSize) {
                this.meteredSize = meteredSize;
                return this;
            }

            public Nas build() {
                return new Nas(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEmbodiedAIPlatformResourceUsageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmbodiedAIPlatformResourceUsageInfoResponseBody</p>
     */
    public static class Oss extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandardStorageSize")
        private Long standardStorageSize;

        private Oss(Builder builder) {
            this.standardStorageSize = builder.standardStorageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Oss create() {
            return builder().build();
        }

        /**
         * @return standardStorageSize
         */
        public Long getStandardStorageSize() {
            return this.standardStorageSize;
        }

        public static final class Builder {
            private Long standardStorageSize; 

            private Builder() {
            } 

            private Builder(Oss model) {
                this.standardStorageSize = model.standardStorageSize;
            } 

            /**
             * StandardStorageSize.
             */
            public Builder standardStorageSize(Long standardStorageSize) {
                this.standardStorageSize = standardStorageSize;
                return this;
            }

            public Oss build() {
                return new Oss(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEmbodiedAIPlatformResourceUsageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmbodiedAIPlatformResourceUsageInfoResponseBody</p>
     */
    public static class StorageUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nas")
        private Nas nas;

        @com.aliyun.core.annotation.NameInMap("Oss")
        private Oss oss;

        private StorageUsage(Builder builder) {
            this.nas = builder.nas;
            this.oss = builder.oss;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageUsage create() {
            return builder().build();
        }

        /**
         * @return nas
         */
        public Nas getNas() {
            return this.nas;
        }

        /**
         * @return oss
         */
        public Oss getOss() {
            return this.oss;
        }

        public static final class Builder {
            private Nas nas; 
            private Oss oss; 

            private Builder() {
            } 

            private Builder(StorageUsage model) {
                this.nas = model.nas;
                this.oss = model.oss;
            } 

            /**
             * Nas.
             */
            public Builder nas(Nas nas) {
                this.nas = nas;
                return this;
            }

            /**
             * Oss.
             */
            public Builder oss(Oss oss) {
                this.oss = oss;
                return this;
            }

            public StorageUsage build() {
                return new StorageUsage(this);
            } 

        } 

    }
}
