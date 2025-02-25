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
 * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListDoctorHBaseRegionServersResponseBody</p>
 */
public class ListDoctorHBaseRegionServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDoctorHBaseRegionServersResponseBody build() {
            return new ListDoctorHBaseRegionServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
     */
    public static class AvgGc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The efficiency of garbage collection in the system</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>avgGc</p>
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
             * <p>37.9</p>
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
    /**
     * 
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
     */
    public static class CacheRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of the BlockCache memory size</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>cacheRatio</p>
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
             * <p>96.7</p>
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
    /**
     * 
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
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
             * <p>42571</p>
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
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
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
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The growth rate of daily read request quantity.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
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
             * <p>1.0</p>
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
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
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
             * <p>23124</p>
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
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
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
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>The growth rate of daily write request quantity.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
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
             * <p>1.0</p>
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
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
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
             * <p>81</p>
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
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
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
             * <p>170500567</p>
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
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
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
             * <p>89499511</p>
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
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
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
             * <p>30109837</p>
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
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgGc")
        private AvgGc avgGc;

        @com.aliyun.core.annotation.NameInMap("CacheRatio")
        private CacheRatio cacheRatio;

        @com.aliyun.core.annotation.NameInMap("DailyReadRequest")
        private DailyReadRequest dailyReadRequest;

        @com.aliyun.core.annotation.NameInMap("DailyReadRequestDayGrowthRatio")
        private DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("DailyWriteRequest")
        private DailyWriteRequest dailyWriteRequest;

        @com.aliyun.core.annotation.NameInMap("DailyWriteRequestDayGrowthRatio")
        private DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("RegionCount")
        private RegionCount regionCount;

        @com.aliyun.core.annotation.NameInMap("TotalReadRequest")
        private TotalReadRequest totalReadRequest;

        @com.aliyun.core.annotation.NameInMap("TotalRequest")
        private TotalRequest totalRequest;

        @com.aliyun.core.annotation.NameInMap("TotalWriteRequest")
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
             * <p>The average garbage collection (GC) duration.</p>
             */
            public Builder avgGc(AvgGc avgGc) {
                this.avgGc = avgGc;
                return this;
            }

            /**
             * <p>The cache hit ratio.</p>
             */
            public Builder cacheRatio(CacheRatio cacheRatio) {
                this.cacheRatio = cacheRatio;
                return this;
            }

            /**
             * <p>The number of daily read requests.</p>
             */
            public Builder dailyReadRequest(DailyReadRequest dailyReadRequest) {
                this.dailyReadRequest = dailyReadRequest;
                return this;
            }

            /**
             * <p>The growth rate of the number of daily read requests.</p>
             */
            public Builder dailyReadRequestDayGrowthRatio(DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio) {
                this.dailyReadRequestDayGrowthRatio = dailyReadRequestDayGrowthRatio;
                return this;
            }

            /**
             * <p>The number of daily write requests.</p>
             */
            public Builder dailyWriteRequest(DailyWriteRequest dailyWriteRequest) {
                this.dailyWriteRequest = dailyWriteRequest;
                return this;
            }

            /**
             * <p>The growth rate of the number of daily write requests.</p>
             */
            public Builder dailyWriteRequestDayGrowthRatio(DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio) {
                this.dailyWriteRequestDayGrowthRatio = dailyWriteRequestDayGrowthRatio;
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
             * <p>The cumulative number of read requests.</p>
             */
            public Builder totalReadRequest(TotalReadRequest totalReadRequest) {
                this.totalReadRequest = totalReadRequest;
                return this;
            }

            /**
             * <p>The cumulative number of all requests.</p>
             */
            public Builder totalRequest(TotalRequest totalRequest) {
                this.totalRequest = totalRequest;
                return this;
            }

            /**
             * <p>The cumulative number of write requests.</p>
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
     * {@link ListDoctorHBaseRegionServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorHBaseRegionServersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metrics")
        private Metrics metrics;

        @com.aliyun.core.annotation.NameInMap("RegionServerHost")
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
             * <p>The metric information.</p>
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The RegionServer host.</p>
             * 
             * <strong>example:</strong>
             * <p>emr-worker-4.cluster-20****</p>
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
