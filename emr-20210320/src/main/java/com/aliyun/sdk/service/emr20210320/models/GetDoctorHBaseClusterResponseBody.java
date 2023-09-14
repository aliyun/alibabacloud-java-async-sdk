// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDoctorHBaseClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorHBaseClusterResponseBody</p>
 */
public class GetDoctorHBaseClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDoctorHBaseClusterResponseBody build() {
            return new GetDoctorHBaseClusterResponseBody(this);
        } 

    } 

    public static class Analysis extends TeaModel {
        @NameInMap("HbaseScore")
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
             * HbaseScore.
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
    public static class AvgLoad extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class DailyReadRequest extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class DailyWriteRequest extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class MemHeap extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class NormalAvgLoad extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class RegionBalance extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class RegionCount extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class RegionServerCount extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class StoreFileCount extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class TableCount extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class TotalDataSize extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class TotalReadRequest extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class TotalRequest extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class TotalWriteRequest extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class Metrics extends TeaModel {
        @NameInMap("AvgLoad")
        private AvgLoad avgLoad;

        @NameInMap("DailyReadRequest")
        private DailyReadRequest dailyReadRequest;

        @NameInMap("DailyWriteRequest")
        private DailyWriteRequest dailyWriteRequest;

        @NameInMap("MemHeap")
        private MemHeap memHeap;

        @NameInMap("NormalAvgLoad")
        private NormalAvgLoad normalAvgLoad;

        @NameInMap("RegionBalance")
        private RegionBalance regionBalance;

        @NameInMap("RegionCount")
        private RegionCount regionCount;

        @NameInMap("RegionServerCount")
        private RegionServerCount regionServerCount;

        @NameInMap("StoreFileCount")
        private StoreFileCount storeFileCount;

        @NameInMap("TableCount")
        private TableCount tableCount;

        @NameInMap("TotalDataSize")
        private TotalDataSize totalDataSize;

        @NameInMap("TotalReadRequest")
        private TotalReadRequest totalReadRequest;

        @NameInMap("TotalRequest")
        private TotalRequest totalRequest;

        @NameInMap("TotalWriteRequest")
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
             * AvgLoad.
             */
            public Builder avgLoad(AvgLoad avgLoad) {
                this.avgLoad = avgLoad;
                return this;
            }

            /**
             * DailyReadRequest.
             */
            public Builder dailyReadRequest(DailyReadRequest dailyReadRequest) {
                this.dailyReadRequest = dailyReadRequest;
                return this;
            }

            /**
             * DailyWriteRequest.
             */
            public Builder dailyWriteRequest(DailyWriteRequest dailyWriteRequest) {
                this.dailyWriteRequest = dailyWriteRequest;
                return this;
            }

            /**
             * MemHeap.
             */
            public Builder memHeap(MemHeap memHeap) {
                this.memHeap = memHeap;
                return this;
            }

            /**
             * NormalAvgLoad.
             */
            public Builder normalAvgLoad(NormalAvgLoad normalAvgLoad) {
                this.normalAvgLoad = normalAvgLoad;
                return this;
            }

            /**
             * RegionBalance.
             */
            public Builder regionBalance(RegionBalance regionBalance) {
                this.regionBalance = regionBalance;
                return this;
            }

            /**
             * RegionCount.
             */
            public Builder regionCount(RegionCount regionCount) {
                this.regionCount = regionCount;
                return this;
            }

            /**
             * RegionServerCount.
             */
            public Builder regionServerCount(RegionServerCount regionServerCount) {
                this.regionServerCount = regionServerCount;
                return this;
            }

            /**
             * StoreFileCount.
             */
            public Builder storeFileCount(StoreFileCount storeFileCount) {
                this.storeFileCount = storeFileCount;
                return this;
            }

            /**
             * TableCount.
             */
            public Builder tableCount(TableCount tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * TotalDataSize.
             */
            public Builder totalDataSize(TotalDataSize totalDataSize) {
                this.totalDataSize = totalDataSize;
                return this;
            }

            /**
             * TotalReadRequest.
             */
            public Builder totalReadRequest(TotalReadRequest totalReadRequest) {
                this.totalReadRequest = totalReadRequest;
                return this;
            }

            /**
             * TotalRequest.
             */
            public Builder totalRequest(TotalRequest totalRequest) {
                this.totalRequest = totalRequest;
                return this;
            }

            /**
             * TotalWriteRequest.
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
    public static class Data extends TeaModel {
        @NameInMap("Analysis")
        private Analysis analysis;

        @NameInMap("Metrics")
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
             * Analysis.
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * Metrics.
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
