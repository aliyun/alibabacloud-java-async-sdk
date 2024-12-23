// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorHBaseClusterResponseBody</p>
 */
public class GetDoctorHBaseClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDoctorHBaseClusterResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHBaseClusterResponseBody create() {
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDoctorHBaseClusterResponseBody build() {
            return new GetDoctorHBaseClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class Analysis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HbaseScore")
        private Integer hbaseScore;

        private Analysis(Builder builder) {
            this.hbaseScore = builder.hbaseScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analysis create() {
            return builder().build();
        }

        /**
         * @return hbaseScore
         */
        public Integer getHbaseScore() {
            return this.hbaseScore;
        }

        public static final class Builder {
            private Integer hbaseScore; 

            /**
             * <p>The overall score of the HBase cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder hbaseScore(Integer hbaseScore) {
                this.hbaseScore = hbaseScore;
                return this;
            }

            public Analysis build() {
                return new Analysis(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class AvgLoad extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private AvgLoad(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgLoad create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The average load under normal working conditions</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>avgLoad</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>36.0</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AvgLoad build() {
                return new AvgLoad(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class DailyReadRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private DailyReadRequest(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyReadRequest create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of read requests per day</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>dailyReadRequest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>430</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public DailyReadRequest build() {
                return new DailyReadRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class DailyWriteRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private DailyWriteRequest(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyWriteRequest create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of write requests per day</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>dailyWriteRequest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public DailyWriteRequest build() {
                return new DailyWriteRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class MemHeap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private MemHeap(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemHeap create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Memory heap usage in megabytes (MB)</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>memHeap</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>240</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public MemHeap build() {
                return new MemHeap(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class NormalAvgLoad extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private NormalAvgLoad(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalAvgLoad create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The average load under normal working conditions</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>normalAvgLoad</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>526.4</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public NormalAvgLoad build() {
                return new NormalAvgLoad(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class RegionBalance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private RegionBalance(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionBalance create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The ability to evenly distribute Regions on different RegionServer nodes</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>regionBalance</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public RegionBalance build() {
                return new RegionBalance(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class RegionCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private RegionCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of regions count</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>regionCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>161</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public RegionCount build() {
                return new RegionCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class RegionServerCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private RegionServerCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionServerCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of region servers count</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>regionServerCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public RegionServerCount build() {
                return new RegionServerCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class StoreFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private StoreFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoreFileCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of store files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>storeFileCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>298</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public StoreFileCount build() {
                return new StoreFileCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class TableCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TableCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of tables</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>tableCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TableCount build() {
                return new TableCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class TotalDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalDataSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Total data size in megabytes (MB)</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalDataSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>256</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalDataSize build() {
                return new TotalDataSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class TotalReadRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalReadRequest(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalReadRequest create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Total number of read requests</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalReadRequest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>430</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalReadRequest build() {
                return new TotalReadRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class TotalRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalRequest(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalRequest create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Total number of requests</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalRequest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>576</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalRequest build() {
                return new TotalRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class TotalWriteRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalWriteRequest(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalWriteRequest create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Total number of write requests</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalWriteRequest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>520</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalWriteRequest build() {
                return new TotalWriteRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgLoad")
        private AvgLoad avgLoad;

        @com.aliyun.core.annotation.NameInMap("DailyReadRequest")
        private DailyReadRequest dailyReadRequest;

        @com.aliyun.core.annotation.NameInMap("DailyWriteRequest")
        private DailyWriteRequest dailyWriteRequest;

        @com.aliyun.core.annotation.NameInMap("MemHeap")
        private MemHeap memHeap;

        @com.aliyun.core.annotation.NameInMap("NormalAvgLoad")
        private NormalAvgLoad normalAvgLoad;

        @com.aliyun.core.annotation.NameInMap("RegionBalance")
        private RegionBalance regionBalance;

        @com.aliyun.core.annotation.NameInMap("RegionCount")
        private RegionCount regionCount;

        @com.aliyun.core.annotation.NameInMap("RegionServerCount")
        private RegionServerCount regionServerCount;

        @com.aliyun.core.annotation.NameInMap("StoreFileCount")
        private StoreFileCount storeFileCount;

        @com.aliyun.core.annotation.NameInMap("TableCount")
        private TableCount tableCount;

        @com.aliyun.core.annotation.NameInMap("TotalDataSize")
        private TotalDataSize totalDataSize;

        @com.aliyun.core.annotation.NameInMap("TotalReadRequest")
        private TotalReadRequest totalReadRequest;

        @com.aliyun.core.annotation.NameInMap("TotalRequest")
        private TotalRequest totalRequest;

        @com.aliyun.core.annotation.NameInMap("TotalWriteRequest")
        private TotalWriteRequest totalWriteRequest;

        private Metrics(Builder builder) {
            this.avgLoad = builder.avgLoad;
            this.dailyReadRequest = builder.dailyReadRequest;
            this.dailyWriteRequest = builder.dailyWriteRequest;
            this.memHeap = builder.memHeap;
            this.normalAvgLoad = builder.normalAvgLoad;
            this.regionBalance = builder.regionBalance;
            this.regionCount = builder.regionCount;
            this.regionServerCount = builder.regionServerCount;
            this.storeFileCount = builder.storeFileCount;
            this.tableCount = builder.tableCount;
            this.totalDataSize = builder.totalDataSize;
            this.totalReadRequest = builder.totalReadRequest;
            this.totalRequest = builder.totalRequest;
            this.totalWriteRequest = builder.totalWriteRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return avgLoad
         */
        public AvgLoad getAvgLoad() {
            return this.avgLoad;
        }

        /**
         * @return dailyReadRequest
         */
        public DailyReadRequest getDailyReadRequest() {
            return this.dailyReadRequest;
        }

        /**
         * @return dailyWriteRequest
         */
        public DailyWriteRequest getDailyWriteRequest() {
            return this.dailyWriteRequest;
        }

        /**
         * @return memHeap
         */
        public MemHeap getMemHeap() {
            return this.memHeap;
        }

        /**
         * @return normalAvgLoad
         */
        public NormalAvgLoad getNormalAvgLoad() {
            return this.normalAvgLoad;
        }

        /**
         * @return regionBalance
         */
        public RegionBalance getRegionBalance() {
            return this.regionBalance;
        }

        /**
         * @return regionCount
         */
        public RegionCount getRegionCount() {
            return this.regionCount;
        }

        /**
         * @return regionServerCount
         */
        public RegionServerCount getRegionServerCount() {
            return this.regionServerCount;
        }

        /**
         * @return storeFileCount
         */
        public StoreFileCount getStoreFileCount() {
            return this.storeFileCount;
        }

        /**
         * @return tableCount
         */
        public TableCount getTableCount() {
            return this.tableCount;
        }

        /**
         * @return totalDataSize
         */
        public TotalDataSize getTotalDataSize() {
            return this.totalDataSize;
        }

        /**
         * @return totalReadRequest
         */
        public TotalReadRequest getTotalReadRequest() {
            return this.totalReadRequest;
        }

        /**
         * @return totalRequest
         */
        public TotalRequest getTotalRequest() {
            return this.totalRequest;
        }

        /**
         * @return totalWriteRequest
         */
        public TotalWriteRequest getTotalWriteRequest() {
            return this.totalWriteRequest;
        }

        public static final class Builder {
            private AvgLoad avgLoad; 
            private DailyReadRequest dailyReadRequest; 
            private DailyWriteRequest dailyWriteRequest; 
            private MemHeap memHeap; 
            private NormalAvgLoad normalAvgLoad; 
            private RegionBalance regionBalance; 
            private RegionCount regionCount; 
            private RegionServerCount regionServerCount; 
            private StoreFileCount storeFileCount; 
            private TableCount tableCount; 
            private TotalDataSize totalDataSize; 
            private TotalReadRequest totalReadRequest; 
            private TotalRequest totalRequest; 
            private TotalWriteRequest totalWriteRequest; 

            /**
             * <p>The average load.</p>
             */
            public Builder avgLoad(AvgLoad avgLoad) {
                this.avgLoad = avgLoad;
                return this;
            }

            /**
             * <p>The number of read requests in a day.</p>
             */
            public Builder dailyReadRequest(DailyReadRequest dailyReadRequest) {
                this.dailyReadRequest = dailyReadRequest;
                return this;
            }

            /**
             * <p>The number of write requests in a day.</p>
             */
            public Builder dailyWriteRequest(DailyWriteRequest dailyWriteRequest) {
                this.dailyWriteRequest = dailyWriteRequest;
                return this;
            }

            /**
             * <p>The memory size.</p>
             */
            public Builder memHeap(MemHeap memHeap) {
                this.memHeap = memHeap;
                return this;
            }

            /**
             * <p>The normal average load.</p>
             */
            public Builder normalAvgLoad(NormalAvgLoad normalAvgLoad) {
                this.normalAvgLoad = normalAvgLoad;
                return this;
            }

            /**
             * <p>The region balance degree.</p>
             */
            public Builder regionBalance(RegionBalance regionBalance) {
                this.regionBalance = regionBalance;
                return this;
            }

            /**
             * <p>The number of regions.</p>
             */
            public Builder regionCount(RegionCount regionCount) {
                this.regionCount = regionCount;
                return this;
            }

            /**
             * <p>The number of region servers.</p>
             */
            public Builder regionServerCount(RegionServerCount regionServerCount) {
                this.regionServerCount = regionServerCount;
                return this;
            }

            /**
             * <p>The number of StoreFiles.</p>
             */
            public Builder storeFileCount(StoreFileCount storeFileCount) {
                this.storeFileCount = storeFileCount;
                return this;
            }

            /**
             * <p>The number of tables.</p>
             */
            public Builder tableCount(TableCount tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * <p>The size of the cluster.</p>
             */
            public Builder totalDataSize(TotalDataSize totalDataSize) {
                this.totalDataSize = totalDataSize;
                return this;
            }

            /**
             * <p>The total number of read requests.</p>
             */
            public Builder totalReadRequest(TotalReadRequest totalReadRequest) {
                this.totalReadRequest = totalReadRequest;
                return this;
            }

            /**
             * <p>The total number of requests in the cluster.</p>
             */
            public Builder totalRequest(TotalRequest totalRequest) {
                this.totalRequest = totalRequest;
                return this;
            }

            /**
             * <p>The total number of write requests.</p>
             */
            public Builder totalWriteRequest(TotalWriteRequest totalWriteRequest) {
                this.totalWriteRequest = totalWriteRequest;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseClusterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Analysis")
        private Analysis analysis;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private Metrics metrics;

        private Data(Builder builder) {
            this.analysis = builder.analysis;
            this.metrics = builder.metrics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analysis
         */
        public Analysis getAnalysis() {
            return this.analysis;
        }

        /**
         * @return metrics
         */
        public Metrics getMetrics() {
            return this.metrics;
        }

        public static final class Builder {
            private Analysis analysis; 
            private Metrics metrics; 

            /**
             * <p>The analysis result.</p>
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * <p>The metric information.</p>
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
