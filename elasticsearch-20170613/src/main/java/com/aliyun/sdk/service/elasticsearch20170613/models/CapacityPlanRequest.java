// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link CapacityPlanRequest} extends {@link RequestModel}
 *
 * <p>CapacityPlanRequest</p>
 */
public class CapacityPlanRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("complexQueryAvailable")
    private Boolean complexQueryAvailable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataInfo")
    private java.util.List<DataInfo> dataInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metric")
    private java.util.List<Metric> metric;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("usageScenario")
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
    public java.util.List<DataInfo> getDataInfo() {
        return this.dataInfo;
    }

    /**
     * @return metric
     */
    public java.util.List<Metric> getMetric() {
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
        private java.util.List<DataInfo> dataInfo; 
        private java.util.List<Metric> metric; 
        private String usageScenario; 

        private Builder() {
            super();
        } 

        private Builder(CapacityPlanRequest request) {
            super(request);
            this.complexQueryAvailable = request.complexQueryAvailable;
            this.dataInfo = request.dataInfo;
            this.metric = request.metric;
            this.usageScenario = request.usageScenario;
        } 

        /**
         * <p>Indicates whether there is a need for complex aggregation queries. Options:</p>
         * <ul>
         * <li>true: Yes</li>
         * <li>false (default): No</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder complexQueryAvailable(Boolean complexQueryAvailable) {
            this.putBodyParameter("complexQueryAvailable", complexQueryAvailable);
            this.complexQueryAvailable = complexQueryAvailable;
            return this;
        }

        /**
         * <p>Disk usage status.</p>
         */
        public Builder dataInfo(java.util.List<DataInfo> dataInfo) {
            this.putBodyParameter("dataInfo", dataInfo);
            this.dataInfo = dataInfo;
            return this;
        }

        /**
         * <p>Metrics information including disk usage, search and write operations, aggregation requests, etc.</p>
         */
        public Builder metric(java.util.List<Metric> metric) {
            this.putBodyParameter("metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>Usage scenarios, options:</p>
         * <ul>
         * <li>general: General scenario</li>
         * <li>analysisVisualization: Data analysis scenario</li>
         * <li>dbAcceleration: Database acceleration scenario</li>
         * <li>search: Search scenario</li>
         * <li>log: Log scenario</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>general</p>
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

    /**
     * 
     * {@link CapacityPlanRequest} extends {@link TeaModel}
     *
     * <p>CapacityPlanRequest</p>
     */
    public static class DataInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("unit")
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

            private Builder() {
            } 

            private Builder(DataInfo model) {
                this.code = model.code;
                this.size = model.size;
                this.totalCount = model.totalCount;
                this.type = model.type;
                this.unit = model.unit;
            } 

            /**
             * <p>Disk data metric code. Options:</p>
             * <ul>
             * <li>totalRawData: Raw data information</li>
             * <li>document: Data document information, estimated document count</li>
             * <li>dailyIncrement: Daily data growth</li>
             * <li>dailyIncrementDoc: Daily incremental document count</li>
             * <li>retentionTime: Data retention period</li>
             * <li>replica: Replica settings</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>totalRawData</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Disk usage metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Total number of data entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>Disk data type. Options:</p>
             * <ul>
             * <li>hot: Hot data</li>
             * <li>warm: Cold data</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hot</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Data or time unit. Options:</p>
             * <ul>
             * <li>Data units: MiB, GiB, TB, PB</li>
             * <li>Time units: DAYS, WEEKS, MONTHS, YEARS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MiB</p>
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
    /**
     * 
     * {@link CapacityPlanRequest} extends {@link TeaModel}
     *
     * <p>CapacityPlanRequest</p>
     */
    public static class Metric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("averageQps")
        private Integer averageQps;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("concurrent")
        private Long concurrent;

        @com.aliyun.core.annotation.NameInMap("peakQps")
        private Integer peakQps;

        @com.aliyun.core.annotation.NameInMap("responseTime")
        private Integer responseTime;

        @com.aliyun.core.annotation.NameInMap("throughput")
        private Long throughput;

        @com.aliyun.core.annotation.NameInMap("type")
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

            private Builder() {
            } 

            private Builder(Metric model) {
                this.averageQps = model.averageQps;
                this.code = model.code;
                this.concurrent = model.concurrent;
                this.peakQps = model.peakQps;
                this.responseTime = model.responseTime;
                this.throughput = model.throughput;
                this.type = model.type;
            } 

            /**
             * <p>Average QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder averageQps(Integer averageQps) {
                this.averageQps = averageQps;
                return this;
            }

            /**
             * <p>Search or write metric code. Options:</p>
             * <ul>
             * <li>write: Write</li>
             * <li>search: Search</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>write</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Concurrent number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder concurrent(Long concurrent) {
                this.concurrent = concurrent;
                return this;
            }

            /**
             * <p>Peak QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder peakQps(Integer peakQps) {
                this.peakQps = peakQps;
                return this;
            }

            /**
             * <p>Expected average response time, unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder responseTime(Integer responseTime) {
                this.responseTime = responseTime;
                return this;
            }

            /**
             * <p>Throughput, unit: MB/S.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder throughput(Long throughput) {
                this.throughput = throughput;
                return this;
            }

            /**
             * <p>Search/write peak type. Options:</p>
             * <ul>
             * <li>common: Regular</li>
             * <li>peak: Peak</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>common</p>
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
