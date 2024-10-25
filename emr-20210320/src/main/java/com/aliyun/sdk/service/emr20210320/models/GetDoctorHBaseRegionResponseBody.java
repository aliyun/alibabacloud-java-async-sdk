// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDoctorHBaseRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorHBaseRegionResponseBody</p>
 */
public class GetDoctorHBaseRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDoctorHBaseRegionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHBaseRegionResponseBody create() {
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

        public GetDoctorHBaseRegionResponseBody build() {
            return new GetDoctorHBaseRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDoctorHBaseRegionResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseRegionResponseBody</p>
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
             * <p>Number of read requests per day</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the metric.</p>
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
     * {@link GetDoctorHBaseRegionResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseRegionResponseBody</p>
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
     * {@link GetDoctorHBaseRegionResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseRegionResponseBody</p>
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
             * <p>Number of store file</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
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
             * <p>100</p>
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
     * {@link GetDoctorHBaseRegionResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseRegionResponseBody</p>
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
             * <p>Metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>Total read request</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>totalReadRequest</p>
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

            public TotalReadRequest build() {
                return new TotalReadRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseRegionResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseRegionResponseBody</p>
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
             * <p>Metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>Total Write Request</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>totalWriteRequest</p>
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

            public TotalWriteRequest build() {
                return new TotalWriteRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHBaseRegionResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseRegionResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DailyReadRequest")
        private DailyReadRequest dailyReadRequest;

        @com.aliyun.core.annotation.NameInMap("DailyWriteRequest")
        private DailyWriteRequest dailyWriteRequest;

        @com.aliyun.core.annotation.NameInMap("StoreFileCount")
        private StoreFileCount storeFileCount;

        @com.aliyun.core.annotation.NameInMap("TotalReadRequest")
        private TotalReadRequest totalReadRequest;

        @com.aliyun.core.annotation.NameInMap("TotalWriteRequest")
        private TotalWriteRequest totalWriteRequest;

        private Metrics(Builder builder) {
            this.dailyReadRequest = builder.dailyReadRequest;
            this.dailyWriteRequest = builder.dailyWriteRequest;
            this.storeFileCount = builder.storeFileCount;
            this.totalReadRequest = builder.totalReadRequest;
            this.totalWriteRequest = builder.totalWriteRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
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
         * @return storeFileCount
         */
        public StoreFileCount getStoreFileCount() {
            return this.storeFileCount;
        }

        /**
         * @return totalReadRequest
         */
        public TotalReadRequest getTotalReadRequest() {
            return this.totalReadRequest;
        }

        /**
         * @return totalWriteRequest
         */
        public TotalWriteRequest getTotalWriteRequest() {
            return this.totalWriteRequest;
        }

        public static final class Builder {
            private DailyReadRequest dailyReadRequest; 
            private DailyWriteRequest dailyWriteRequest; 
            private StoreFileCount storeFileCount; 
            private TotalReadRequest totalReadRequest; 
            private TotalWriteRequest totalWriteRequest; 

            /**
             * <p>Number of read requests in a single day.</p>
             */
            public Builder dailyReadRequest(DailyReadRequest dailyReadRequest) {
                this.dailyReadRequest = dailyReadRequest;
                return this;
            }

            /**
             * <p>Number of write requests in a single day.</p>
             */
            public Builder dailyWriteRequest(DailyWriteRequest dailyWriteRequest) {
                this.dailyWriteRequest = dailyWriteRequest;
                return this;
            }

            /**
             * <p>Store file count.</p>
             */
            public Builder storeFileCount(StoreFileCount storeFileCount) {
                this.storeFileCount = storeFileCount;
                return this;
            }

            /**
             * <p>Total read request count</p>
             */
            public Builder totalReadRequest(TotalReadRequest totalReadRequest) {
                this.totalReadRequest = totalReadRequest;
                return this;
            }

            /**
             * <p>Total write request count</p>
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
     * {@link GetDoctorHBaseRegionResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHBaseRegionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metrics")
        private Metrics metrics;

        @com.aliyun.core.annotation.NameInMap("RegionServerHost")
        private String regionServerHost;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Data(Builder builder) {
            this.metrics = builder.metrics;
            this.regionServerHost = builder.regionServerHost;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return metrics
         */
        public Metrics getMetrics() {
            return this.metrics;
        }

        /**
         * @return regionServerHost
         */
        public String getRegionServerHost() {
            return this.regionServerHost;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Metrics metrics; 
            private String regionServerHost; 
            private String tableName; 

            /**
             * <p>Metrics information.</p>
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>Host of the RegionServer.</p>
             * 
             * <strong>example:</strong>
             * <p>emr-worker-2.cluster-20****</p>
             */
            public Builder regionServerHost(String regionServerHost) {
                this.regionServerHost = regionServerHost;
                return this;
            }

            /**
             * <p>Table name.</p>
             * 
             * <strong>example:</strong>
             * <p>tb_item</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
