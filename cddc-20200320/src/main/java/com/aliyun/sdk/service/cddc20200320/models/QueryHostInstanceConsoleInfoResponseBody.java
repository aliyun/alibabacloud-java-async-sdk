// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryHostInstanceConsoleInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHostInstanceConsoleInfoResponseBody</p>
 */
public class QueryHostInstanceConsoleInfoResponseBody extends TeaModel {
    @NameInMap("HostInstanceConsoleInfos")
    private java.util.List < HostInstanceConsoleInfos> hostInstanceConsoleInfos;

    @NameInMap("RequestId")
    private String requestId;

    private QueryHostInstanceConsoleInfoResponseBody(Builder builder) {
        this.hostInstanceConsoleInfos = builder.hostInstanceConsoleInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHostInstanceConsoleInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostInstanceConsoleInfos
     */
    public java.util.List < HostInstanceConsoleInfos> getHostInstanceConsoleInfos() {
        return this.hostInstanceConsoleInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < HostInstanceConsoleInfos> hostInstanceConsoleInfos; 
        private String requestId; 

        /**
         * HostInstanceConsoleInfos.
         */
        public Builder hostInstanceConsoleInfos(java.util.List < HostInstanceConsoleInfos> hostInstanceConsoleInfos) {
            this.hostInstanceConsoleInfos = hostInstanceConsoleInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryHostInstanceConsoleInfoResponseBody build() {
            return new QueryHostInstanceConsoleInfoResponseBody(this);
        } 

    } 

    public static class PerfInfo extends TeaModel {
        @NameInMap("CpuRatio")
        private Float cpuRatio;

        @NameInMap("DiskCurr")
        private Float diskCurr;

        @NameInMap("MemRatio")
        private Float memRatio;

        @NameInMap("PerfIdbPio")
        private Float perfIdbPio;

        private PerfInfo(Builder builder) {
            this.cpuRatio = builder.cpuRatio;
            this.diskCurr = builder.diskCurr;
            this.memRatio = builder.memRatio;
            this.perfIdbPio = builder.perfIdbPio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerfInfo create() {
            return builder().build();
        }

        /**
         * @return cpuRatio
         */
        public Float getCpuRatio() {
            return this.cpuRatio;
        }

        /**
         * @return diskCurr
         */
        public Float getDiskCurr() {
            return this.diskCurr;
        }

        /**
         * @return memRatio
         */
        public Float getMemRatio() {
            return this.memRatio;
        }

        /**
         * @return perfIdbPio
         */
        public Float getPerfIdbPio() {
            return this.perfIdbPio;
        }

        public static final class Builder {
            private Float cpuRatio; 
            private Float diskCurr; 
            private Float memRatio; 
            private Float perfIdbPio; 

            /**
             * CpuRatio.
             */
            public Builder cpuRatio(Float cpuRatio) {
                this.cpuRatio = cpuRatio;
                return this;
            }

            /**
             * DiskCurr.
             */
            public Builder diskCurr(Float diskCurr) {
                this.diskCurr = diskCurr;
                return this;
            }

            /**
             * MemRatio.
             */
            public Builder memRatio(Float memRatio) {
                this.memRatio = memRatio;
                return this;
            }

            /**
             * PerfIdbPio.
             */
            public Builder perfIdbPio(Float perfIdbPio) {
                this.perfIdbPio = perfIdbPio;
                return this;
            }

            public PerfInfo build() {
                return new PerfInfo(this);
            } 

        } 

    }
    public static class HostInstanceConsoleInfos extends TeaModel {
        @NameInMap("CpuCores")
        private Integer cpuCores;

        @NameInMap("CpuIncreaseRatioValue")
        private Integer cpuIncreaseRatioValue;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DiskSize")
        private Integer diskSize;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("LevelName")
        private String levelName;

        @NameInMap("MaxConnIncreaseRatioValue")
        private Integer maxConnIncreaseRatioValue;

        @NameInMap("MemSize")
        private Integer memSize;

        @NameInMap("MemoryIncreaseRatioValue")
        private Integer memoryIncreaseRatioValue;

        @NameInMap("PerfInfo")
        private PerfInfo perfInfo;

        @NameInMap("Port")
        private String port;

        @NameInMap("Role")
        private String role;

        @NameInMap("Status")
        private String status;

        private HostInstanceConsoleInfos(Builder builder) {
            this.cpuCores = builder.cpuCores;
            this.cpuIncreaseRatioValue = builder.cpuIncreaseRatioValue;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.diskSize = builder.diskSize;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.ip = builder.ip;
            this.levelName = builder.levelName;
            this.maxConnIncreaseRatioValue = builder.maxConnIncreaseRatioValue;
            this.memSize = builder.memSize;
            this.memoryIncreaseRatioValue = builder.memoryIncreaseRatioValue;
            this.perfInfo = builder.perfInfo;
            this.port = builder.port;
            this.role = builder.role;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostInstanceConsoleInfos create() {
            return builder().build();
        }

        /**
         * @return cpuCores
         */
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return cpuIncreaseRatioValue
         */
        public Integer getCpuIncreaseRatioValue() {
            return this.cpuIncreaseRatioValue;
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return levelName
         */
        public String getLevelName() {
            return this.levelName;
        }

        /**
         * @return maxConnIncreaseRatioValue
         */
        public Integer getMaxConnIncreaseRatioValue() {
            return this.maxConnIncreaseRatioValue;
        }

        /**
         * @return memSize
         */
        public Integer getMemSize() {
            return this.memSize;
        }

        /**
         * @return memoryIncreaseRatioValue
         */
        public Integer getMemoryIncreaseRatioValue() {
            return this.memoryIncreaseRatioValue;
        }

        /**
         * @return perfInfo
         */
        public PerfInfo getPerfInfo() {
            return this.perfInfo;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer cpuCores; 
            private Integer cpuIncreaseRatioValue; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private Integer diskSize; 
            private String engine; 
            private String engineVersion; 
            private String ip; 
            private String levelName; 
            private Integer maxConnIncreaseRatioValue; 
            private Integer memSize; 
            private Integer memoryIncreaseRatioValue; 
            private PerfInfo perfInfo; 
            private String port; 
            private String role; 
            private String status; 

            /**
             * CpuCores.
             */
            public Builder cpuCores(Integer cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * CpuIncreaseRatioValue.
             */
            public Builder cpuIncreaseRatioValue(Integer cpuIncreaseRatioValue) {
                this.cpuIncreaseRatioValue = cpuIncreaseRatioValue;
                return this;
            }

            /**
             * DBInstanceDescription.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * LevelName.
             */
            public Builder levelName(String levelName) {
                this.levelName = levelName;
                return this;
            }

            /**
             * MaxConnIncreaseRatioValue.
             */
            public Builder maxConnIncreaseRatioValue(Integer maxConnIncreaseRatioValue) {
                this.maxConnIncreaseRatioValue = maxConnIncreaseRatioValue;
                return this;
            }

            /**
             * MemSize.
             */
            public Builder memSize(Integer memSize) {
                this.memSize = memSize;
                return this;
            }

            /**
             * MemoryIncreaseRatioValue.
             */
            public Builder memoryIncreaseRatioValue(Integer memoryIncreaseRatioValue) {
                this.memoryIncreaseRatioValue = memoryIncreaseRatioValue;
                return this;
            }

            /**
             * PerfInfo.
             */
            public Builder perfInfo(PerfInfo perfInfo) {
                this.perfInfo = perfInfo;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public HostInstanceConsoleInfos build() {
                return new HostInstanceConsoleInfos(this);
            } 

        } 

    }
}
