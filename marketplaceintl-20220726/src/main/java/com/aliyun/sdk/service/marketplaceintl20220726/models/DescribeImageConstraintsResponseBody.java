// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageConstraintsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageConstraintsResponseBody</p>
 */
public class DescribeImageConstraintsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeImageConstraintsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageConstraintsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String errorCode; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeImageConstraintsResponseBody build() {
            return new DescribeImageConstraintsResponseBody(this);
        } 

    } 

    public static class Bandwidth extends TeaModel {
        @NameInMap("Max")
        private Integer max;

        @NameInMap("Min")
        private Integer min;

        @NameInMap("Step")
        private Integer step;

        @NameInMap("Unit")
        private String unit;

        private Bandwidth(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bandwidth create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Integer max; 
            private Integer min; 
            private Integer step; 
            private String unit; 

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Bandwidth build() {
                return new Bandwidth(this);
            } 

        } 

    }
    public static class CpuMemoryRange extends TeaModel {
        @NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @NameInMap("MemorySizeList")
        private java.util.List < Float > memorySizeList;

        private CpuMemoryRange(Builder builder) {
            this.cpuCoreCount = builder.cpuCoreCount;
            this.memorySizeList = builder.memorySizeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuMemoryRange create() {
            return builder().build();
        }

        /**
         * @return cpuCoreCount
         */
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        /**
         * @return memorySizeList
         */
        public java.util.List < Float > getMemorySizeList() {
            return this.memorySizeList;
        }

        public static final class Builder {
            private Integer cpuCoreCount; 
            private java.util.List < Float > memorySizeList; 

            /**
             * CpuCoreCount.
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * MemorySizeList.
             */
            public Builder memorySizeList(java.util.List < Float > memorySizeList) {
                this.memorySizeList = memorySizeList;
                return this;
            }

            public CpuMemoryRange build() {
                return new CpuMemoryRange(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
        @NameInMap("Max")
        private Integer max;

        @NameInMap("Min")
        private Integer min;

        @NameInMap("Step")
        private Integer step;

        @NameInMap("Unit")
        private String unit;

        private DataDisk(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Integer max; 
            private Integer min; 
            private Integer step; 
            private String unit; 

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class SystemDisk extends TeaModel {
        @NameInMap("Max")
        private Integer max;

        @NameInMap("Min")
        private Integer min;

        @NameInMap("Step")
        private Integer step;

        @NameInMap("Unit")
        private String unit;

        private SystemDisk(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Integer max; 
            private Integer min; 
            private Integer step; 
            private String unit; 

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Bandwidth")
        private Bandwidth bandwidth;

        @NameInMap("CpuMemoryRange")
        private java.util.List < CpuMemoryRange> cpuMemoryRange;

        @NameInMap("DataDisk")
        private DataDisk dataDisk;

        @NameInMap("SystemDisk")
        private SystemDisk systemDisk;

        @NameInMap("TrackId")
        private String trackId;

        private Data(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.cpuMemoryRange = builder.cpuMemoryRange;
            this.dataDisk = builder.dataDisk;
            this.systemDisk = builder.systemDisk;
            this.trackId = builder.trackId;
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
        public Bandwidth getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return cpuMemoryRange
         */
        public java.util.List < CpuMemoryRange> getCpuMemoryRange() {
            return this.cpuMemoryRange;
        }

        /**
         * @return dataDisk
         */
        public DataDisk getDataDisk() {
            return this.dataDisk;
        }

        /**
         * @return systemDisk
         */
        public SystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        /**
         * @return trackId
         */
        public String getTrackId() {
            return this.trackId;
        }

        public static final class Builder {
            private Bandwidth bandwidth; 
            private java.util.List < CpuMemoryRange> cpuMemoryRange; 
            private DataDisk dataDisk; 
            private SystemDisk systemDisk; 
            private String trackId; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Bandwidth bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * CpuMemoryRange.
             */
            public Builder cpuMemoryRange(java.util.List < CpuMemoryRange> cpuMemoryRange) {
                this.cpuMemoryRange = cpuMemoryRange;
                return this;
            }

            /**
             * DataDisk.
             */
            public Builder dataDisk(DataDisk dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            /**
             * SystemDisk.
             */
            public Builder systemDisk(SystemDisk systemDisk) {
                this.systemDisk = systemDisk;
                return this;
            }

            /**
             * TrackId.
             */
            public Builder trackId(String trackId) {
                this.trackId = trackId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
