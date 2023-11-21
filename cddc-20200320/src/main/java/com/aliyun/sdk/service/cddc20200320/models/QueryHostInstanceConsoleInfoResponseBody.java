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
         * The queried instances.
         */
        public Builder hostInstanceConsoleInfos(java.util.List < HostInstanceConsoleInfos> hostInstanceConsoleInfos) {
            this.hostInstanceConsoleInfos = hostInstanceConsoleInfos;
            return this;
        }

        /**
         * The request ID.
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
             * The number of CPU cores of the host.
             */
            public Builder cpuRatio(Float cpuRatio) {
                this.cpuRatio = cpuRatio;
                return this;
            }

            /**
             * The disk storage of the host. Unit: GB.
             */
            public Builder diskCurr(Float diskCurr) {
                this.diskCurr = diskCurr;
                return this;
            }

            /**
             * The memory size of the host. Unit: GB.
             */
            public Builder memRatio(Float memRatio) {
                this.memRatio = memRatio;
                return this;
            }

            /**
             * The number of physical I/O operations performed on the host.
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
             * The number of CPU cores of the instance.
             */
            public Builder cpuCores(Integer cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * The maximum number of CPU cores of the instance.
             */
            public Builder cpuIncreaseRatioValue(Integer cpuIncreaseRatioValue) {
                this.cpuIncreaseRatioValue = cpuIncreaseRatioValue;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The storage capacity of the instance. Unit: GB.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The database engine of the instance.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The version of the database engine.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The IP address of the host on which the instance is deployed.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The instance type of the instance.
             */
            public Builder levelName(String levelName) {
                this.levelName = levelName;
                return this;
            }

            /**
             * The maximum number of connections to the instance.
             */
            public Builder maxConnIncreaseRatioValue(Integer maxConnIncreaseRatioValue) {
                this.maxConnIncreaseRatioValue = maxConnIncreaseRatioValue;
                return this;
            }

            /**
             * The memory size of the instance. Unit: GB.
             */
            public Builder memSize(Integer memSize) {
                this.memSize = memSize;
                return this;
            }

            /**
             * The maximum memory size of the instance.
             */
            public Builder memoryIncreaseRatioValue(Integer memoryIncreaseRatioValue) {
                this.memoryIncreaseRatioValue = memoryIncreaseRatioValue;
                return this;
            }

            /**
             * The performance information of the host on which the instance is deployed.
             */
            public Builder perfInfo(PerfInfo perfInfo) {
                this.perfInfo = perfInfo;
                return this;
            }

            /**
             * The port number of the host.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The role of the instance.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The state of the instance.
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
