// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeAvailableZoneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableZoneResponseBody</p>
 */
public class DescribeAvailableZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableZoneResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableZoneResponseBody create() {
        return builder().build();
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

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableZoneResponseBody build() {
            return new DescribeAvailableZoneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableZoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableZoneResponseBody</p>
     */
    public static class DiskSizeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private Long max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Long min;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Long step;

        private DiskSizeRange(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskSizeRange create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Long getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Long getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Long getStep() {
            return this.step;
        }

        public static final class Builder {
            private Long max; 
            private Long min; 
            private Long step; 

            /**
             * Max.
             */
            public Builder max(Long max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Long min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Long step) {
                this.step = step;
                return this;
            }

            public DiskSizeRange build() {
                return new DiskSizeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableZoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableZoneResponseBody</p>
     */
    public static class SupportEngineVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObVersion")
        private String obVersion;

        @com.aliyun.core.annotation.NameInMap("SupportIsolationOptimization")
        private Boolean supportIsolationOptimization;

        @com.aliyun.core.annotation.NameInMap("SupportReplicaModes")
        private java.util.List<String> supportReplicaModes;

        private SupportEngineVersions(Builder builder) {
            this.obVersion = builder.obVersion;
            this.supportIsolationOptimization = builder.supportIsolationOptimization;
            this.supportReplicaModes = builder.supportReplicaModes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportEngineVersions create() {
            return builder().build();
        }

        /**
         * @return obVersion
         */
        public String getObVersion() {
            return this.obVersion;
        }

        /**
         * @return supportIsolationOptimization
         */
        public Boolean getSupportIsolationOptimization() {
            return this.supportIsolationOptimization;
        }

        /**
         * @return supportReplicaModes
         */
        public java.util.List<String> getSupportReplicaModes() {
            return this.supportReplicaModes;
        }

        public static final class Builder {
            private String obVersion; 
            private Boolean supportIsolationOptimization; 
            private java.util.List<String> supportReplicaModes; 

            /**
             * ObVersion.
             */
            public Builder obVersion(String obVersion) {
                this.obVersion = obVersion;
                return this;
            }

            /**
             * SupportIsolationOptimization.
             */
            public Builder supportIsolationOptimization(Boolean supportIsolationOptimization) {
                this.supportIsolationOptimization = supportIsolationOptimization;
                return this;
            }

            /**
             * SupportReplicaModes.
             */
            public Builder supportReplicaModes(java.util.List<String> supportReplicaModes) {
                this.supportReplicaModes = supportReplicaModes;
                return this;
            }

            public SupportEngineVersions build() {
                return new SupportEngineVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableZoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableZoneResponseBody</p>
     */
    public static class SupportSpecifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskSizeRange")
        private DiskSizeRange diskSizeRange;

        @com.aliyun.core.annotation.NameInMap("DiskTypes")
        private java.util.List<String> diskTypes;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("SupportEngineVersions")
        private java.util.List<SupportEngineVersions> supportEngineVersions;

        private SupportSpecifications(Builder builder) {
            this.diskSizeRange = builder.diskSizeRange;
            this.diskTypes = builder.diskTypes;
            this.instanceClass = builder.instanceClass;
            this.spec = builder.spec;
            this.supportEngineVersions = builder.supportEngineVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportSpecifications create() {
            return builder().build();
        }

        /**
         * @return diskSizeRange
         */
        public DiskSizeRange getDiskSizeRange() {
            return this.diskSizeRange;
        }

        /**
         * @return diskTypes
         */
        public java.util.List<String> getDiskTypes() {
            return this.diskTypes;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return supportEngineVersions
         */
        public java.util.List<SupportEngineVersions> getSupportEngineVersions() {
            return this.supportEngineVersions;
        }

        public static final class Builder {
            private DiskSizeRange diskSizeRange; 
            private java.util.List<String> diskTypes; 
            private String instanceClass; 
            private String spec; 
            private java.util.List<SupportEngineVersions> supportEngineVersions; 

            /**
             * DiskSizeRange.
             */
            public Builder diskSizeRange(DiskSizeRange diskSizeRange) {
                this.diskSizeRange = diskSizeRange;
                return this;
            }

            /**
             * DiskTypes.
             */
            public Builder diskTypes(java.util.List<String> diskTypes) {
                this.diskTypes = diskTypes;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * SupportEngineVersions.
             */
            public Builder supportEngineVersions(java.util.List<SupportEngineVersions> supportEngineVersions) {
                this.supportEngineVersions = supportEngineVersions;
                return this;
            }

            public SupportSpecifications build() {
                return new SupportSpecifications(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableZoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableZoneResponseBody</p>
     */
    public static class AvailableZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("CpuArch")
        private String cpuArch;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Series")
        private String series;

        @com.aliyun.core.annotation.NameInMap("SupportSpecifications")
        private java.util.List<SupportSpecifications> supportSpecifications;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private String zones;

        private AvailableZones(Builder builder) {
            this.channel = builder.channel;
            this.cpuArch = builder.cpuArch;
            this.deployType = builder.deployType;
            this.instanceType = builder.instanceType;
            this.region = builder.region;
            this.series = builder.series;
            this.supportSpecifications = builder.supportSpecifications;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZones create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return cpuArch
         */
        public String getCpuArch() {
            return this.cpuArch;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return series
         */
        public String getSeries() {
            return this.series;
        }

        /**
         * @return supportSpecifications
         */
        public java.util.List<SupportSpecifications> getSupportSpecifications() {
            return this.supportSpecifications;
        }

        /**
         * @return zones
         */
        public String getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String channel; 
            private String cpuArch; 
            private String deployType; 
            private String instanceType; 
            private String region; 
            private String series; 
            private java.util.List<SupportSpecifications> supportSpecifications; 
            private String zones; 

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * CpuArch.
             */
            public Builder cpuArch(String cpuArch) {
                this.cpuArch = cpuArch;
                return this;
            }

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Series.
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * SupportSpecifications.
             */
            public Builder supportSpecifications(java.util.List<SupportSpecifications> supportSpecifications) {
                this.supportSpecifications = supportSpecifications;
                return this;
            }

            /**
             * Zones.
             */
            public Builder zones(String zones) {
                this.zones = zones;
                return this;
            }

            public AvailableZones build() {
                return new AvailableZones(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableZoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableZoneResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableZones")
        private java.util.List<AvailableZones> availableZones;

        private Data(Builder builder) {
            this.availableZones = builder.availableZones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return availableZones
         */
        public java.util.List<AvailableZones> getAvailableZones() {
            return this.availableZones;
        }

        public static final class Builder {
            private java.util.List<AvailableZones> availableZones; 

            /**
             * AvailableZones.
             */
            public Builder availableZones(java.util.List<AvailableZones> availableZones) {
                this.availableZones = availableZones;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
