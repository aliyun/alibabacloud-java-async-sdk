// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorHBaseTableResponseBody</p>
 */
public class GetDoctorHBaseTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDoctorHBaseTableResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHBaseTableResponseBody create() {
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
         * <p>Returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDoctorHBaseTableResponseBody build() {
            return new GetDoctorHBaseTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class Analysis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadRequestHotspotRegionList")
        private java.util.List < String > readRequestHotspotRegionList;

        @com.aliyun.core.annotation.NameInMap("ReadRequestUnbalanceSuggestion")
        private String readRequestUnbalanceSuggestion;

        @com.aliyun.core.annotation.NameInMap("RequestHotspotRegionList")
        private java.util.List < String > requestHotspotRegionList;

        @com.aliyun.core.annotation.NameInMap("RequestUnbalanceSuggestion")
        private String requestUnbalanceSuggestion;

        @com.aliyun.core.annotation.NameInMap("TableScore")
        private Integer tableScore;

        @com.aliyun.core.annotation.NameInMap("WriteRequestHotspotRegionList")
        private java.util.List < String > writeRequestHotspotRegionList;

        @com.aliyun.core.annotation.NameInMap("WriteRequestUnbalanceSuggestion")
        private String writeRequestUnbalanceSuggestion;

        private Analysis(Builder builder) {
            this.readRequestHotspotRegionList = builder.readRequestHotspotRegionList;
            this.readRequestUnbalanceSuggestion = builder.readRequestUnbalanceSuggestion;
            this.requestHotspotRegionList = builder.requestHotspotRegionList;
            this.requestUnbalanceSuggestion = builder.requestUnbalanceSuggestion;
            this.tableScore = builder.tableScore;
            this.writeRequestHotspotRegionList = builder.writeRequestHotspotRegionList;
            this.writeRequestUnbalanceSuggestion = builder.writeRequestUnbalanceSuggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analysis create() {
            return builder().build();
        }

        /**
         * @return readRequestHotspotRegionList
         */
        public java.util.List < String > getReadRequestHotspotRegionList() {
            return this.readRequestHotspotRegionList;
        }

        /**
         * @return readRequestUnbalanceSuggestion
         */
        public String getReadRequestUnbalanceSuggestion() {
            return this.readRequestUnbalanceSuggestion;
        }

        /**
         * @return requestHotspotRegionList
         */
        public java.util.List < String > getRequestHotspotRegionList() {
            return this.requestHotspotRegionList;
        }

        /**
         * @return requestUnbalanceSuggestion
         */
        public String getRequestUnbalanceSuggestion() {
            return this.requestUnbalanceSuggestion;
        }

        /**
         * @return tableScore
         */
        public Integer getTableScore() {
            return this.tableScore;
        }

        /**
         * @return writeRequestHotspotRegionList
         */
        public java.util.List < String > getWriteRequestHotspotRegionList() {
            return this.writeRequestHotspotRegionList;
        }

        /**
         * @return writeRequestUnbalanceSuggestion
         */
        public String getWriteRequestUnbalanceSuggestion() {
            return this.writeRequestUnbalanceSuggestion;
        }

        public static final class Builder {
            private java.util.List < String > readRequestHotspotRegionList; 
            private String readRequestUnbalanceSuggestion; 
            private java.util.List < String > requestHotspotRegionList; 
            private String requestUnbalanceSuggestion; 
            private Integer tableScore; 
            private java.util.List < String > writeRequestHotspotRegionList; 
            private String writeRequestUnbalanceSuggestion; 

            /**
             * <p>List of read hotspot regions.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder readRequestHotspotRegionList(java.util.List < String > readRequestHotspotRegionList) {
                this.readRequestHotspotRegionList = readRequestHotspotRegionList;
                return this;
            }

            /**
             * <p>Description of read imbalance.</p>
             * 
             * <strong>example:</strong>
             * <p>read request unbalance is &lt;p class=&quot;report-detail-topic&quot;&gt;表分区总数量为14，分区平均读请求数量为5032486，以下分区存在读请求热点访问：</p>&lt;ul class=&quot;report-detail-ul&quot;&gt;&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-4 Region Id： 4ac818a3ab3fd727490a5b4d4dac7667 读请求数量： 15485664</li>&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-2 Region Id： 021b387ae92959def65041e25eade3aa 读请求数量： 7731980</li>&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-2 Region Id： d58f33abfe857e5fd0045eaa31c93df8 读请求数量： 7705237</li>&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-2 Region Id： 4ca84757a7d0948b8552cfeebefa25a9 读请求数量： 7703492</li>&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-4 Region Id： 1018192dae42995fc75c6d5b5981a9b7 读请求数量： 7695284</li></ul>&lt;p style=&quot;line-height： 16px; font-size： 16px; margin： 0 auto&quot;&gt;&nbsp;</p></p>
             */
            public Builder readRequestUnbalanceSuggestion(String readRequestUnbalanceSuggestion) {
                this.readRequestUnbalanceSuggestion = readRequestUnbalanceSuggestion;
                return this;
            }

            /**
             * <p>List of read/write hotspot regions.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder requestHotspotRegionList(java.util.List < String > requestHotspotRegionList) {
                this.requestHotspotRegionList = requestHotspotRegionList;
                return this;
            }

            /**
             * <p>Description of read/write imbalance.</p>
             * 
             * <strong>example:</strong>
             * <p>read request unbalance is &lt;p class=&quot;report-detail-topic&quot;&gt;表分区总数量为14，分区平均读请求数量为5032486，以下分区存在读请求热点访问：</p>&lt;ul class=&quot;report-detail-ul&quot;&gt;&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-4 Region Id： 4ac818a3ab3fd727490a5b4d4dac7667 读请求数量： 15485664</li>&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-2 Region Id： 021b387ae92959def65041e25eade3aa 读请求数量： 7731980</li>&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-2 Region Id： d58f33abfe857e5fd0045eaa31c93df8 读请求数量： 7705237</li>&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-2 Region Id： 4ca84757a7d0948b8552cfeebefa25a9 读请求数量： 7703492</li>&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-4 Region Id： 1018192dae42995fc75c6d5b5981a9b7 读请求数量： 7695284</li></ul>&lt;p style=&quot;line-height： 16px; font-size： 16px; margin： 0 auto&quot;&gt;&nbsp;</p></p>
             */
            public Builder requestUnbalanceSuggestion(String requestUnbalanceSuggestion) {
                this.requestUnbalanceSuggestion = requestUnbalanceSuggestion;
                return this;
            }

            /**
             * <p>Table score.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder tableScore(Integer tableScore) {
                this.tableScore = tableScore;
                return this;
            }

            /**
             * <p>List of write hotspot regions.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder writeRequestHotspotRegionList(java.util.List < String > writeRequestHotspotRegionList) {
                this.writeRequestHotspotRegionList = writeRequestHotspotRegionList;
                return this;
            }

            /**
             * <p>Description of write imbalance.</p>
             * 
             * <strong>example:</strong>
             * <p>write request unbalance is &lt;p class=&quot;report-detail-topic&quot;&gt;表分区总数量为15，分区平均写请求数量为769954，以下分区存在写请求热点访问：</p>&lt;ul class=&quot;report-detail-ul&quot;&gt;&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-2 Region Id： 4a938c08750869c47b7a92edeeec2ccc 写请求数量： 2115051</li>&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-2 Region Id： b4d21974df92bdf3589e63e4da1fc923 写请求数量： 1592509</li>&lt;li class=&quot;.report-detail-li&quot;&gt;RegionServer： emr-worker-2 Region Id： 25eb6717470f4ddbabe9187ff0fc0cb3 写请求数量： 1585420</li></ul>&lt;p style=&quot;line-height： 16px; font-size： 16px; margin： 0 auto&quot;&gt;&nbsp;</p></p>
             */
            public Builder writeRequestUnbalanceSuggestion(String writeRequestUnbalanceSuggestion) {
                this.writeRequestUnbalanceSuggestion = writeRequestUnbalanceSuggestion;
                return this;
            }

            public Analysis build() {
                return new Analysis(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class ColdAccessDay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private ColdAccessDay(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdAccessDay create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Cold access day</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>coldAccessDay</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public ColdAccessDay build() {
                return new ColdAccessDay(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class ColdConfigDay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private ColdConfigDay(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdConfigDay create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Cold config day</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>coldConfigDay</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public ColdConfigDay build() {
                return new ColdConfigDay(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class ColdDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private ColdDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdDataSize create() {
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
             * <p>Metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>Size of the cold data size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>coldDataSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Metric unit.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public ColdDataSize build() {
                return new ColdDataSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>test-update</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>dailyReadRequest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class DailyReadRequestDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private DailyReadRequestDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyReadRequestDayGrowthRatio create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of table size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>dailyReadRequestDayGrowthRatio</p>
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
             * <p>1.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public DailyReadRequestDayGrowthRatio build() {
                return new DailyReadRequestDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of write requests per day</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>dailyWriteRequest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class DailyWriteRequestDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private DailyWriteRequestDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyWriteRequestDayGrowthRatio create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The balance of distributing requests</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>dailyWriteRequestDayGrowthRatio</p>
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
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public DailyWriteRequestDayGrowthRatio build() {
                return new DailyWriteRequestDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class FreezeConfigDay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private FreezeConfigDay(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreezeConfigDay create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Freeze config day</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>freezeConfigDay</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public FreezeConfigDay build() {
                return new FreezeConfigDay(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class FreezeDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private FreezeDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreezeDataSize create() {
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
             * <p>Metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>Size of the freeze data size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>freezeDataSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Metric unit.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public FreezeDataSize build() {
                return new FreezeDataSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class HotDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private HotDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotDataSize create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Size of the hot data size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>hotDataSize</p>
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
             * <p>The metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public HotDataSize build() {
                return new HotDataSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class Locality extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private Locality(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Locality create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The locality of data</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>locality</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public Locality build() {
                return new Locality(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class ReadRequestBalance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private ReadRequestBalance(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadRequestBalance create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The balance of distributing read requests</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>readRequestBalance</p>
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
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public ReadRequestBalance build() {
                return new ReadRequestBalance(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The ability to evenly distribute Regions on different RegionServer nodes</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
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
             * <p>The metric value.</p>
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
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
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
             * <p>Metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of regions count</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>regionCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Metric unit.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class RegionCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private RegionCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionCountDayGrowthRatio create() {
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
             * <p>Metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of region count</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>regionCountDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Metric unit.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public RegionCountDayGrowthRatio build() {
                return new RegionCountDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
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
             * <p>Metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of region servers count</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>regionServerCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Metric unit.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Usage.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class RequestBalance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private RequestBalance(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestBalance create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The balance of distributing requests</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>requestBalance</p>
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
             * <p>The metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public RequestBalance build() {
                return new RequestBalance(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of store files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>storeFileCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class StoreFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private StoreFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoreFileCountDayGrowthRatio create() {
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
             * <p>Metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of store file count</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>storeFileCountDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Metric unit.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public StoreFileCountDayGrowthRatio build() {
                return new StoreFileCountDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class TableSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TableSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableSize create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Size of the table</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>tableSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Unit of the metric</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>tb_item</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TableSize build() {
                return new TableSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class TableSizeDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TableSizeDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableSizeDayGrowthRatio create() {
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
             * <p>Metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>Day growth ratio of table size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>tableSizeDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Metric unit.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public TableSizeDayGrowthRatio build() {
                return new TableSizeDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class WarmConfigDay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private WarmConfigDay(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmConfigDay create() {
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
             * <p>Metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>Size of the warm data size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>warmConfigDay</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Metric unit.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>Metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public WarmConfigDay build() {
                return new WarmConfigDay(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class WarmDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private WarmDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmDataSize create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Size of the warm data size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>warmDataSize</p>
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
             * <p>Usage rate.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public WarmDataSize build() {
                return new WarmDataSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class WriteRequestBalance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private WriteRequestBalance(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WriteRequestBalance create() {
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
             * <p>Description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The balance of distributing write requests</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>writeRequestBalance</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Unit of the metric.</p>
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
             * <p>0.5</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public WriteRequestBalance build() {
                return new WriteRequestBalance(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdAccessDay")
        private ColdAccessDay coldAccessDay;

        @com.aliyun.core.annotation.NameInMap("ColdConfigDay")
        private ColdConfigDay coldConfigDay;

        @com.aliyun.core.annotation.NameInMap("ColdDataSize")
        private ColdDataSize coldDataSize;

        @com.aliyun.core.annotation.NameInMap("DailyReadRequest")
        private DailyReadRequest dailyReadRequest;

        @com.aliyun.core.annotation.NameInMap("DailyReadRequestDayGrowthRatio")
        private DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("DailyWriteRequest")
        private DailyWriteRequest dailyWriteRequest;

        @com.aliyun.core.annotation.NameInMap("DailyWriteRequestDayGrowthRatio")
        private DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("FreezeConfigDay")
        private FreezeConfigDay freezeConfigDay;

        @com.aliyun.core.annotation.NameInMap("FreezeDataSize")
        private FreezeDataSize freezeDataSize;

        @com.aliyun.core.annotation.NameInMap("HotDataSize")
        private HotDataSize hotDataSize;

        @com.aliyun.core.annotation.NameInMap("Locality")
        private Locality locality;

        @com.aliyun.core.annotation.NameInMap("ReadRequestBalance")
        private ReadRequestBalance readRequestBalance;

        @com.aliyun.core.annotation.NameInMap("RegionBalance")
        private RegionBalance regionBalance;

        @com.aliyun.core.annotation.NameInMap("RegionCount")
        private RegionCount regionCount;

        @com.aliyun.core.annotation.NameInMap("RegionCountDayGrowthRatio")
        private RegionCountDayGrowthRatio regionCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("RegionServerCount")
        private RegionServerCount regionServerCount;

        @com.aliyun.core.annotation.NameInMap("RequestBalance")
        private RequestBalance requestBalance;

        @com.aliyun.core.annotation.NameInMap("StoreFileCount")
        private StoreFileCount storeFileCount;

        @com.aliyun.core.annotation.NameInMap("StoreFileCountDayGrowthRatio")
        private StoreFileCountDayGrowthRatio storeFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("TableSize")
        private TableSize tableSize;

        @com.aliyun.core.annotation.NameInMap("TableSizeDayGrowthRatio")
        private TableSizeDayGrowthRatio tableSizeDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("WarmConfigDay")
        private WarmConfigDay warmConfigDay;

        @com.aliyun.core.annotation.NameInMap("WarmDataSize")
        private WarmDataSize warmDataSize;

        @com.aliyun.core.annotation.NameInMap("WriteRequestBalance")
        private WriteRequestBalance writeRequestBalance;

        private Metrics(Builder builder) {
            this.coldAccessDay = builder.coldAccessDay;
            this.coldConfigDay = builder.coldConfigDay;
            this.coldDataSize = builder.coldDataSize;
            this.dailyReadRequest = builder.dailyReadRequest;
            this.dailyReadRequestDayGrowthRatio = builder.dailyReadRequestDayGrowthRatio;
            this.dailyWriteRequest = builder.dailyWriteRequest;
            this.dailyWriteRequestDayGrowthRatio = builder.dailyWriteRequestDayGrowthRatio;
            this.freezeConfigDay = builder.freezeConfigDay;
            this.freezeDataSize = builder.freezeDataSize;
            this.hotDataSize = builder.hotDataSize;
            this.locality = builder.locality;
            this.readRequestBalance = builder.readRequestBalance;
            this.regionBalance = builder.regionBalance;
            this.regionCount = builder.regionCount;
            this.regionCountDayGrowthRatio = builder.regionCountDayGrowthRatio;
            this.regionServerCount = builder.regionServerCount;
            this.requestBalance = builder.requestBalance;
            this.storeFileCount = builder.storeFileCount;
            this.storeFileCountDayGrowthRatio = builder.storeFileCountDayGrowthRatio;
            this.tableSize = builder.tableSize;
            this.tableSizeDayGrowthRatio = builder.tableSizeDayGrowthRatio;
            this.warmConfigDay = builder.warmConfigDay;
            this.warmDataSize = builder.warmDataSize;
            this.writeRequestBalance = builder.writeRequestBalance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return coldAccessDay
         */
        public ColdAccessDay getColdAccessDay() {
            return this.coldAccessDay;
        }

        /**
         * @return coldConfigDay
         */
        public ColdConfigDay getColdConfigDay() {
            return this.coldConfigDay;
        }

        /**
         * @return coldDataSize
         */
        public ColdDataSize getColdDataSize() {
            return this.coldDataSize;
        }

        /**
         * @return dailyReadRequest
         */
        public DailyReadRequest getDailyReadRequest() {
            return this.dailyReadRequest;
        }

        /**
         * @return dailyReadRequestDayGrowthRatio
         */
        public DailyReadRequestDayGrowthRatio getDailyReadRequestDayGrowthRatio() {
            return this.dailyReadRequestDayGrowthRatio;
        }

        /**
         * @return dailyWriteRequest
         */
        public DailyWriteRequest getDailyWriteRequest() {
            return this.dailyWriteRequest;
        }

        /**
         * @return dailyWriteRequestDayGrowthRatio
         */
        public DailyWriteRequestDayGrowthRatio getDailyWriteRequestDayGrowthRatio() {
            return this.dailyWriteRequestDayGrowthRatio;
        }

        /**
         * @return freezeConfigDay
         */
        public FreezeConfigDay getFreezeConfigDay() {
            return this.freezeConfigDay;
        }

        /**
         * @return freezeDataSize
         */
        public FreezeDataSize getFreezeDataSize() {
            return this.freezeDataSize;
        }

        /**
         * @return hotDataSize
         */
        public HotDataSize getHotDataSize() {
            return this.hotDataSize;
        }

        /**
         * @return locality
         */
        public Locality getLocality() {
            return this.locality;
        }

        /**
         * @return readRequestBalance
         */
        public ReadRequestBalance getReadRequestBalance() {
            return this.readRequestBalance;
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
         * @return regionCountDayGrowthRatio
         */
        public RegionCountDayGrowthRatio getRegionCountDayGrowthRatio() {
            return this.regionCountDayGrowthRatio;
        }

        /**
         * @return regionServerCount
         */
        public RegionServerCount getRegionServerCount() {
            return this.regionServerCount;
        }

        /**
         * @return requestBalance
         */
        public RequestBalance getRequestBalance() {
            return this.requestBalance;
        }

        /**
         * @return storeFileCount
         */
        public StoreFileCount getStoreFileCount() {
            return this.storeFileCount;
        }

        /**
         * @return storeFileCountDayGrowthRatio
         */
        public StoreFileCountDayGrowthRatio getStoreFileCountDayGrowthRatio() {
            return this.storeFileCountDayGrowthRatio;
        }

        /**
         * @return tableSize
         */
        public TableSize getTableSize() {
            return this.tableSize;
        }

        /**
         * @return tableSizeDayGrowthRatio
         */
        public TableSizeDayGrowthRatio getTableSizeDayGrowthRatio() {
            return this.tableSizeDayGrowthRatio;
        }

        /**
         * @return warmConfigDay
         */
        public WarmConfigDay getWarmConfigDay() {
            return this.warmConfigDay;
        }

        /**
         * @return warmDataSize
         */
        public WarmDataSize getWarmDataSize() {
            return this.warmDataSize;
        }

        /**
         * @return writeRequestBalance
         */
        public WriteRequestBalance getWriteRequestBalance() {
            return this.writeRequestBalance;
        }

        public static final class Builder {
            private ColdAccessDay coldAccessDay; 
            private ColdConfigDay coldConfigDay; 
            private ColdDataSize coldDataSize; 
            private DailyReadRequest dailyReadRequest; 
            private DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio; 
            private DailyWriteRequest dailyWriteRequest; 
            private DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio; 
            private FreezeConfigDay freezeConfigDay; 
            private FreezeDataSize freezeDataSize; 
            private HotDataSize hotDataSize; 
            private Locality locality; 
            private ReadRequestBalance readRequestBalance; 
            private RegionBalance regionBalance; 
            private RegionCount regionCount; 
            private RegionCountDayGrowthRatio regionCountDayGrowthRatio; 
            private RegionServerCount regionServerCount; 
            private RequestBalance requestBalance; 
            private StoreFileCount storeFileCount; 
            private StoreFileCountDayGrowthRatio storeFileCountDayGrowthRatio; 
            private TableSize tableSize; 
            private TableSizeDayGrowthRatio tableSizeDayGrowthRatio; 
            private WarmConfigDay warmConfigDay; 
            private WarmDataSize warmDataSize; 
            private WriteRequestBalance writeRequestBalance; 

            /**
             * <p>Number of days the table has not been accessed.</p>
             */
            public Builder coldAccessDay(ColdAccessDay coldAccessDay) {
                this.coldAccessDay = coldAccessDay;
                return this;
            }

            /**
             * <p>Cold data access days configuration.</p>
             */
            public Builder coldConfigDay(ColdConfigDay coldConfigDay) {
                this.coldConfigDay = coldConfigDay;
                return this;
            }

            /**
             * <p>Cold data size.</p>
             */
            public Builder coldDataSize(ColdDataSize coldDataSize) {
                this.coldDataSize = coldDataSize;
                return this;
            }

            /**
             * <p>Number of read requests per day.</p>
             */
            public Builder dailyReadRequest(DailyReadRequest dailyReadRequest) {
                this.dailyReadRequest = dailyReadRequest;
                return this;
            }

            /**
             * <p>Daily growth ratio of daily read requests.</p>
             */
            public Builder dailyReadRequestDayGrowthRatio(DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio) {
                this.dailyReadRequestDayGrowthRatio = dailyReadRequestDayGrowthRatio;
                return this;
            }

            /**
             * <p>Number of write requests per day.</p>
             */
            public Builder dailyWriteRequest(DailyWriteRequest dailyWriteRequest) {
                this.dailyWriteRequest = dailyWriteRequest;
                return this;
            }

            /**
             * <p>Daily write request growth ratio.</p>
             */
            public Builder dailyWriteRequestDayGrowthRatio(DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio) {
                this.dailyWriteRequestDayGrowthRatio = dailyWriteRequestDayGrowthRatio;
                return this;
            }

            /**
             * <p>Configuration for the number of days cold data is accessed.</p>
             */
            public Builder freezeConfigDay(FreezeConfigDay freezeConfigDay) {
                this.freezeConfigDay = freezeConfigDay;
                return this;
            }

            /**
             * <p>Frozen data size.</p>
             */
            public Builder freezeDataSize(FreezeDataSize freezeDataSize) {
                this.freezeDataSize = freezeDataSize;
                return this;
            }

            /**
             * <p>Hot data size.</p>
             */
            public Builder hotDataSize(HotDataSize hotDataSize) {
                this.hotDataSize = hotDataSize;
                return this;
            }

            /**
             * <p>Locality rate.</p>
             */
            public Builder locality(Locality locality) {
                this.locality = locality;
                return this;
            }

            /**
             * <p>Read request balance.</p>
             */
            public Builder readRequestBalance(ReadRequestBalance readRequestBalance) {
                this.readRequestBalance = readRequestBalance;
                return this;
            }

            /**
             * <p>Region balance.</p>
             */
            public Builder regionBalance(RegionBalance regionBalance) {
                this.regionBalance = regionBalance;
                return this;
            }

            /**
             * <p>Number of regions.</p>
             */
            public Builder regionCount(RegionCount regionCount) {
                this.regionCount = regionCount;
                return this;
            }

            /**
             * <p>Daily incremental ratio of regions</p>
             */
            public Builder regionCountDayGrowthRatio(RegionCountDayGrowthRatio regionCountDayGrowthRatio) {
                this.regionCountDayGrowthRatio = regionCountDayGrowthRatio;
                return this;
            }

            /**
             * <p>Number of RegionServers.</p>
             */
            public Builder regionServerCount(RegionServerCount regionServerCount) {
                this.regionServerCount = regionServerCount;
                return this;
            }

            /**
             * <p>Request balance.</p>
             */
            public Builder requestBalance(RequestBalance requestBalance) {
                this.requestBalance = requestBalance;
                return this;
            }

            /**
             * <p>Number of store files.</p>
             */
            public Builder storeFileCount(StoreFileCount storeFileCount) {
                this.storeFileCount = storeFileCount;
                return this;
            }

            /**
             * <p>Daily growth ratio of store file count.</p>
             */
            public Builder storeFileCountDayGrowthRatio(StoreFileCountDayGrowthRatio storeFileCountDayGrowthRatio) {
                this.storeFileCountDayGrowthRatio = storeFileCountDayGrowthRatio;
                return this;
            }

            /**
             * <p>Table size.</p>
             */
            public Builder tableSize(TableSize tableSize) {
                this.tableSize = tableSize;
                return this;
            }

            /**
             * <p>Daily growth ratio of table size.</p>
             */
            public Builder tableSizeDayGrowthRatio(TableSizeDayGrowthRatio tableSizeDayGrowthRatio) {
                this.tableSizeDayGrowthRatio = tableSizeDayGrowthRatio;
                return this;
            }

            /**
             * <p>Warm data access days configuration.</p>
             */
            public Builder warmConfigDay(WarmConfigDay warmConfigDay) {
                this.warmConfigDay = warmConfigDay;
                return this;
            }

            /**
             * <p>Warm data size.</p>
             */
            public Builder warmDataSize(WarmDataSize warmDataSize) {
                this.warmDataSize = warmDataSize;
                return this;
            }

            /**
             * <p>Write request balance.</p>
             */
            public Builder writeRequestBalance(WriteRequestBalance writeRequestBalance) {
                this.writeRequestBalance = writeRequestBalance;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseTableResponseBody</p>
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
             * <p>Diagnostic results.</p>
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * <p>Metrics information.</p>
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
