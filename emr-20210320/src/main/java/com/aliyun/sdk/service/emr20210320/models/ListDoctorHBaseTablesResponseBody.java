// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDoctorHBaseTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDoctorHBaseTablesResponseBody</p>
 */
public class ListDoctorHBaseTablesResponseBody extends TeaModel {
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

    private ListDoctorHBaseTablesResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorHBaseTablesResponseBody create() {
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
         * The response parameters.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The page number of the next page returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDoctorHBaseTablesResponseBody build() {
            return new ListDoctorHBaseTablesResponseBody(this);
        } 

    } 

    public static class Analysis extends TeaModel {
        @NameInMap("ReadRequestHotspotRegionList")
        private java.util.List < String > readRequestHotspotRegionList;

        @NameInMap("ReadRequestUnbalanceSuggestion")
        private String readRequestUnbalanceSuggestion;

        @NameInMap("RequestHotspotRegionList")
        private java.util.List < String > requestHotspotRegionList;

        @NameInMap("RequestUnbalanceSuggestion")
        private String requestUnbalanceSuggestion;

        @NameInMap("TableScore")
        private Integer tableScore;

        @NameInMap("WriteRequestHotspotRegionList")
        private java.util.List < String > writeRequestHotspotRegionList;

        @NameInMap("WriteRequestUnbalanceSuggestion")
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
             * The regions that have read hotspot issues.
             */
            public Builder readRequestHotspotRegionList(java.util.List < String > readRequestHotspotRegionList) {
                this.readRequestHotspotRegionList = readRequestHotspotRegionList;
                return this;
            }

            /**
             * The description of read imbalance.
             */
            public Builder readRequestUnbalanceSuggestion(String readRequestUnbalanceSuggestion) {
                this.readRequestUnbalanceSuggestion = readRequestUnbalanceSuggestion;
                return this;
            }

            /**
             * The regions that have read/write hotspot issues.
             */
            public Builder requestHotspotRegionList(java.util.List < String > requestHotspotRegionList) {
                this.requestHotspotRegionList = requestHotspotRegionList;
                return this;
            }

            /**
             * The description of read/write imbalance.
             */
            public Builder requestUnbalanceSuggestion(String requestUnbalanceSuggestion) {
                this.requestUnbalanceSuggestion = requestUnbalanceSuggestion;
                return this;
            }

            /**
             * The score of the table.
             */
            public Builder tableScore(Integer tableScore) {
                this.tableScore = tableScore;
                return this;
            }

            /**
             * The regions that have write hotspot issues.
             */
            public Builder writeRequestHotspotRegionList(java.util.List < String > writeRequestHotspotRegionList) {
                this.writeRequestHotspotRegionList = writeRequestHotspotRegionList;
                return this;
            }

            /**
             * The description of write imbalance.
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
    public static class ColdAccessDay extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class ColdConfigDay extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class ColdDataSize extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class FreezeConfigDay extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class FreezeDataSize extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class HotDataSize extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class Locality extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class ReadRequestBalance extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class RegionCountDayGrowthRatio extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class RequestBalance extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class StoreFileCountDayGrowthRatio extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class TableSize extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class TableSizeDayGrowthRatio extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class WarmConfigDay extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class WarmDataSize extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class WriteRequestBalance extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
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
    public static class Metrics extends TeaModel {
        @NameInMap("ColdAccessDay")
        private ColdAccessDay coldAccessDay;

        @NameInMap("ColdConfigDay")
        private ColdConfigDay coldConfigDay;

        @NameInMap("ColdDataSize")
        private ColdDataSize coldDataSize;

        @NameInMap("DailyReadRequest")
        private DailyReadRequest dailyReadRequest;

        @NameInMap("DailyReadRequestDayGrowthRatio")
        private DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio;

        @NameInMap("DailyWriteRequest")
        private DailyWriteRequest dailyWriteRequest;

        @NameInMap("DailyWriteRequestDayGrowthRatio")
        private DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio;

        @NameInMap("FreezeConfigDay")
        private FreezeConfigDay freezeConfigDay;

        @NameInMap("FreezeDataSize")
        private FreezeDataSize freezeDataSize;

        @NameInMap("HotDataSize")
        private HotDataSize hotDataSize;

        @NameInMap("Locality")
        private Locality locality;

        @NameInMap("ReadRequestBalance")
        private ReadRequestBalance readRequestBalance;

        @NameInMap("RegionBalance")
        private RegionBalance regionBalance;

        @NameInMap("RegionCount")
        private RegionCount regionCount;

        @NameInMap("RegionCountDayGrowthRatio")
        private RegionCountDayGrowthRatio regionCountDayGrowthRatio;

        @NameInMap("RegionServerCount")
        private RegionServerCount regionServerCount;

        @NameInMap("RequestBalance")
        private RequestBalance requestBalance;

        @NameInMap("StoreFileCount")
        private StoreFileCount storeFileCount;

        @NameInMap("StoreFileCountDayGrowthRatio")
        private StoreFileCountDayGrowthRatio storeFileCountDayGrowthRatio;

        @NameInMap("TableSize")
        private TableSize tableSize;

        @NameInMap("TableSizeDayGrowthRatio")
        private TableSizeDayGrowthRatio tableSizeDayGrowthRatio;

        @NameInMap("WarmConfigDay")
        private WarmConfigDay warmConfigDay;

        @NameInMap("WarmDataSize")
        private WarmDataSize warmDataSize;

        @NameInMap("WriteRequestBalance")
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
             * The number of days during which the table was not accessed.
             */
            public Builder coldAccessDay(ColdAccessDay coldAccessDay) {
                this.coldAccessDay = coldAccessDay;
                return this;
            }

            /**
             * The number of consecutive days without access to data before the data is considered as very cold data.
             */
            public Builder coldConfigDay(ColdConfigDay coldConfigDay) {
                this.coldConfigDay = coldConfigDay;
                return this;
            }

            /**
             * The size of cold data.
             */
            public Builder coldDataSize(ColdDataSize coldDataSize) {
                this.coldDataSize = coldDataSize;
                return this;
            }

            /**
             * The total number of read requests for the table in a day.
             */
            public Builder dailyReadRequest(DailyReadRequest dailyReadRequest) {
                this.dailyReadRequest = dailyReadRequest;
                return this;
            }

            /**
             * The daily increment ratio of the number of read requests in a day.
             */
            public Builder dailyReadRequestDayGrowthRatio(DailyReadRequestDayGrowthRatio dailyReadRequestDayGrowthRatio) {
                this.dailyReadRequestDayGrowthRatio = dailyReadRequestDayGrowthRatio;
                return this;
            }

            /**
             * The total number of write requests for the table in a day.
             */
            public Builder dailyWriteRequest(DailyWriteRequest dailyWriteRequest) {
                this.dailyWriteRequest = dailyWriteRequest;
                return this;
            }

            /**
             * The daily increment ratio of the number of write requests in a day.
             */
            public Builder dailyWriteRequestDayGrowthRatio(DailyWriteRequestDayGrowthRatio dailyWriteRequestDayGrowthRatio) {
                this.dailyWriteRequestDayGrowthRatio = dailyWriteRequestDayGrowthRatio;
                return this;
            }

            /**
             * The number of consecutive days without access to data before the data was considered as very cold data.
             */
            public Builder freezeConfigDay(FreezeConfigDay freezeConfigDay) {
                this.freezeConfigDay = freezeConfigDay;
                return this;
            }

            /**
             * The size of very cold data.
             */
            public Builder freezeDataSize(FreezeDataSize freezeDataSize) {
                this.freezeDataSize = freezeDataSize;
                return this;
            }

            /**
             * The size of hot data.
             */
            public Builder hotDataSize(HotDataSize hotDataSize) {
                this.hotDataSize = hotDataSize;
                return this;
            }

            /**
             * The localization rate.
             */
            public Builder locality(Locality locality) {
                this.locality = locality;
                return this;
            }

            /**
             * The read balancing degree.
             */
            public Builder readRequestBalance(ReadRequestBalance readRequestBalance) {
                this.readRequestBalance = readRequestBalance;
                return this;
            }

            /**
             * The balancing degree.
             */
            public Builder regionBalance(RegionBalance regionBalance) {
                this.regionBalance = regionBalance;
                return this;
            }

            /**
             * The number of regions that host the table.
             */
            public Builder regionCount(RegionCount regionCount) {
                this.regionCount = regionCount;
                return this;
            }

            /**
             * The daily increment ratio of the number of regions.
             */
            public Builder regionCountDayGrowthRatio(RegionCountDayGrowthRatio regionCountDayGrowthRatio) {
                this.regionCountDayGrowthRatio = regionCountDayGrowthRatio;
                return this;
            }

            /**
             * The number of region servers that host the table.
             */
            public Builder regionServerCount(RegionServerCount regionServerCount) {
                this.regionServerCount = regionServerCount;
                return this;
            }

            /**
             * The request balancing degree.
             */
            public Builder requestBalance(RequestBalance requestBalance) {
                this.requestBalance = requestBalance;
                return this;
            }

            /**
             * The number of StoreFiles.
             */
            public Builder storeFileCount(StoreFileCount storeFileCount) {
                this.storeFileCount = storeFileCount;
                return this;
            }

            /**
             * The daily increment ratio of the number of StoreFiles.
             */
            public Builder storeFileCountDayGrowthRatio(StoreFileCountDayGrowthRatio storeFileCountDayGrowthRatio) {
                this.storeFileCountDayGrowthRatio = storeFileCountDayGrowthRatio;
                return this;
            }

            /**
             * The size of the table.
             */
            public Builder tableSize(TableSize tableSize) {
                this.tableSize = tableSize;
                return this;
            }

            /**
             * The daily increment ratio of the table size.
             */
            public Builder tableSizeDayGrowthRatio(TableSizeDayGrowthRatio tableSizeDayGrowthRatio) {
                this.tableSizeDayGrowthRatio = tableSizeDayGrowthRatio;
                return this;
            }

            /**
             * The number of consecutive days without access to data before the data is considered as cold data.
             */
            public Builder warmConfigDay(WarmConfigDay warmConfigDay) {
                this.warmConfigDay = warmConfigDay;
                return this;
            }

            /**
             * The size of warm data.
             */
            public Builder warmDataSize(WarmDataSize warmDataSize) {
                this.warmDataSize = warmDataSize;
                return this;
            }

            /**
             * The write balancing degree.
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
    public static class Data extends TeaModel {
        @NameInMap("Analysis")
        private Analysis analysis;

        @NameInMap("Metrics")
        private Metrics metrics;

        @NameInMap("TableName")
        private String tableName;

        private Data(Builder builder) {
            this.analysis = builder.analysis;
            this.metrics = builder.metrics;
            this.tableName = builder.tableName;
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

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Analysis analysis; 
            private Metrics metrics; 
            private String tableName; 

            /**
             * The diagnosis result.
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * The metric information.
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * The name of the table.
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
