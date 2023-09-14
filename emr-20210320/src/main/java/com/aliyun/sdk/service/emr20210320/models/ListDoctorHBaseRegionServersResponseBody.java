// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListDoctorHBaseRegionServersResponseBody</p>
 */
public class ListDoctorHBaseRegionServersResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDoctorHBaseRegionServersResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorHBaseRegionServersResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 本次请求所返回的最大记录条数。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 返回读取到的数据位置，空代表数据已经读取完毕。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 本次请求条件下的数据总量。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDoctorHBaseRegionServersResponseBody build() {
            return new ListDoctorHBaseRegionServersResponseBody(this);
        } 

    } 

    public static class AvgGc extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Float value;

        private AvgGc(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgGc create() {
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

            public AvgGc build() {
                return new AvgGc(this);
            } 

        } 

    }
    public static class CacheRatio extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Float value;

        private CacheRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CacheRatio create() {
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

            public CacheRatio build() {
                return new CacheRatio(this);
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
    public static class DailyReadRequestDayGrowthRatio extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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

            public DailyReadRequestDayGrowthRatio build() {
                return new DailyReadRequestDayGrowthRatio(this);
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
    public static class DailyWriteRequestDayGrowthRatio extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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

            public DailyWriteRequestDayGrowthRatio build() {
                return new DailyWriteRequestDayGrowthRatio(this);
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
        @NameInMap("AvgGc")
        private AvgGc avgGc;

        @NameInMap("CacheRatio")
        private CacheRatio cacheRatio;

        @NameInMap("DailyReadRequest")
        private DailyReadRequest dailyReadRequest;

        @NameInMap("DailyReadRequestDayGrowthRatio")
        private DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio;

        @NameInMap("DailyWriteRequest")
        private DailyWriteRequest dailyWriteRequest;

        @NameInMap("DailyWriteRequestDayGrowthRatio")
        private DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio;

        @NameInMap("RegionCount")
        private RegionCount regionCount;

        @NameInMap("TotalReadRequest")
        private TotalReadRequest totalReadRequest;

        @NameInMap("TotalRequest")
        private TotalRequest totalRequest;

        @NameInMap("TotalWriteRequest")
        private TotalWriteRequest totalWriteRequest;

        private Metrics(Builder builder) {
            this.avgGc = builder.avgGc;
            this.cacheRatio = builder.cacheRatio;
            this.dailyReadRequest = builder.dailyReadRequest;
            this.dailyReadRequestDayGrowthRatio = builder.dailyReadRequestDayGrowthRatio;
            this.dailyWriteRequest = builder.dailyWriteRequest;
            this.dailyWriteRequestDayGrowthRatio = builder.dailyWriteRequestDayGrowthRatio;
            this.regionCount = builder.regionCount;
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
         * @return avgGc
         */
        public AvgGc getAvgGc() {
            return this.avgGc;
        }

        /**
         * @return cacheRatio
         */
        public CacheRatio getCacheRatio() {
            return this.cacheRatio;
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
         * @return regionCount
         */
        public RegionCount getRegionCount() {
            return this.regionCount;
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
            private AvgGc avgGc; 
            private CacheRatio cacheRatio; 
            private DailyReadRequest dailyReadRequest; 
            private DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio; 
            private DailyWriteRequest dailyWriteRequest; 
            private DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio; 
            private RegionCount regionCount; 
            private TotalReadRequest totalReadRequest; 
            private TotalRequest totalRequest; 
            private TotalWriteRequest totalWriteRequest; 

            /**
             * AvgGc.
             */
            public Builder avgGc(AvgGc avgGc) {
                this.avgGc = avgGc;
                return this;
            }

            /**
             * CacheRatio.
             */
            public Builder cacheRatio(CacheRatio cacheRatio) {
                this.cacheRatio = cacheRatio;
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
             * DailyReadRequestDayGrowthRatio.
             */
            public Builder dailyReadRequestDayGrowthRatio(DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio) {
                this.dailyReadRequestDayGrowthRatio = dailyReadRequestDayGrowthRatio;
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
             * DailyWriteRequestDayGrowthRatio.
             */
            public Builder dailyWriteRequestDayGrowthRatio(DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio) {
                this.dailyWriteRequestDayGrowthRatio = dailyWriteRequestDayGrowthRatio;
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
        @NameInMap("Metrics")
        private Metrics metrics;

        @NameInMap("RegionServerHost")
        private String regionServerHost;

        private Data(Builder builder) {
            this.metrics = builder.metrics;
            this.regionServerHost = builder.regionServerHost;
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

        public static final class Builder {
            private Metrics metrics; 
            private String regionServerHost; 

            /**
             * Metrics.
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * RegionServerHost.
             */
            public Builder regionServerHost(String regionServerHost) {
                this.regionServerHost = regionServerHost;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
