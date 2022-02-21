// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CapacityPlanRequest} extends {@link RequestModel}
 *
 * <p>CapacityPlanRequest</p>
 */
public class CapacityPlanRequest extends Request {
    @Body
    @NameInMap("complexQueryAvailable")
    private Boolean complexQueryAvailable;

    @Body
    @NameInMap("dataInfo")
    private java.util.List < DataInfo> dataInfo;

    @Body
    @NameInMap("metric")
    private java.util.List < Metric> metric;

    @Body
    @NameInMap("usageScenario")
    private String usageScenario;

    private CapacityPlanRequest(Builder builder) {
        super(builder);
        this.complexQueryAvailable = builder.complexQueryAvailable;
        this.dataInfo = builder.dataInfo;
        this.metric = builder.metric;
        this.usageScenario = builder.usageScenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CapacityPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return complexQueryAvailable
     */
    public Boolean getComplexQueryAvailable() {
        return this.complexQueryAvailable;
    }

    /**
     * @return dataInfo
     */
    public java.util.List < DataInfo> getDataInfo() {
        return this.dataInfo;
    }

    /**
     * @return metric
     */
    public java.util.List < Metric> getMetric() {
        return this.metric;
    }

    /**
     * @return usageScenario
     */
    public String getUsageScenario() {
        return this.usageScenario;
    }

    public static final class Builder extends Request.Builder<CapacityPlanRequest, Builder> {
        private Boolean complexQueryAvailable; 
        private java.util.List < DataInfo> dataInfo; 
        private java.util.List < Metric> metric; 
        private String usageScenario; 

        private Builder() {
            super();
        } 

        private Builder(CapacityPlanRequest response) {
            super(response);
            this.complexQueryAvailable = response.complexQueryAvailable;
            this.dataInfo = response.dataInfo;
            this.metric = response.metric;
            this.usageScenario = response.usageScenario;
        } 

        /**
         * complexQueryAvailable.
         */
        public Builder complexQueryAvailable(Boolean complexQueryAvailable) {
            this.putBodyParameter("complexQueryAvailable", complexQueryAvailable);
            this.complexQueryAvailable = complexQueryAvailable;
            return this;
        }

        /**
         * dataInfo.
         */
        public Builder dataInfo(java.util.List < DataInfo> dataInfo) {
            this.putBodyParameter("dataInfo", dataInfo);
            this.dataInfo = dataInfo;
            return this;
        }

        /**
         * metric.
         */
        public Builder metric(java.util.List < Metric> metric) {
            this.putBodyParameter("metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * usageScenario.
         */
        public Builder usageScenario(String usageScenario) {
            this.putBodyParameter("usageScenario", usageScenario);
            this.usageScenario = usageScenario;
            return this;
        }

        @Override
        public CapacityPlanRequest build() {
            return new CapacityPlanRequest(this);
        } 

    } 

    public static class DataInfo extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("size")
        private Long size;

        @NameInMap("totalCount")
        private Integer totalCount;

        @NameInMap("type")
        private String type;

        @NameInMap("unit")
        private String unit;

        private DataInfo(Builder builder) {
            this.code = builder.code;
            this.size = builder.size;
            this.totalCount = builder.totalCount;
            this.type = builder.type;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInfo create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String code; 
            private Long size; 
            private Integer totalCount; 
            private String type; 
            private String unit; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * totalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public DataInfo build() {
                return new DataInfo(this);
            } 

        } 

    }
    public static class Metric extends TeaModel {
        @NameInMap("averageQps")
        private Integer averageQps;

        @NameInMap("code")
        private String code;

        @NameInMap("concurrent")
        private Long concurrent;

        @NameInMap("peakQps")
        private Integer peakQps;

        @NameInMap("responseTime")
        private Integer responseTime;

        @NameInMap("throughput")
        private Long throughput;

        @NameInMap("type")
        private String type;

        private Metric(Builder builder) {
            this.averageQps = builder.averageQps;
            this.code = builder.code;
            this.concurrent = builder.concurrent;
            this.peakQps = builder.peakQps;
            this.responseTime = builder.responseTime;
            this.throughput = builder.throughput;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metric create() {
            return builder().build();
        }

        /**
         * @return averageQps
         */
        public Integer getAverageQps() {
            return this.averageQps;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return concurrent
         */
        public Long getConcurrent() {
            return this.concurrent;
        }

        /**
         * @return peakQps
         */
        public Integer getPeakQps() {
            return this.peakQps;
        }

        /**
         * @return responseTime
         */
        public Integer getResponseTime() {
            return this.responseTime;
        }

        /**
         * @return throughput
         */
        public Long getThroughput() {
            return this.throughput;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer averageQps; 
            private String code; 
            private Long concurrent; 
            private Integer peakQps; 
            private Integer responseTime; 
            private Long throughput; 
            private String type; 

            /**
             * averageQps.
             */
            public Builder averageQps(Integer averageQps) {
                this.averageQps = averageQps;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * concurrent.
             */
            public Builder concurrent(Long concurrent) {
                this.concurrent = concurrent;
                return this;
            }

            /**
             * peakQps.
             */
            public Builder peakQps(Integer peakQps) {
                this.peakQps = peakQps;
                return this;
            }

            /**
             * responseTime.
             */
            public Builder responseTime(Integer responseTime) {
                this.responseTime = responseTime;
                return this;
            }

            /**
             * throughput.
             */
            public Builder throughput(Long throughput) {
                this.throughput = throughput;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Metric build() {
                return new Metric(this);
            } 

        } 

    }
}
