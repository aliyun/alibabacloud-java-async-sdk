// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRumOcuStatisticDataRequest} extends {@link RequestModel}
 *
 * <p>GetRumOcuStatisticDataRequest</p>
 */
public class GetRumOcuStatisticDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List < Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    private java.util.List < String > group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private GetRumOcuStatisticDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.filter = builder.filter;
        this.group = builder.group;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.queryType = builder.queryType;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumOcuStatisticDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return group
     */
    public java.util.List < String > getGroup() {
        return this.group;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetRumOcuStatisticDataRequest, Builder> {
        private Long endTime; 
        private java.util.List < Filter> filter; 
        private java.util.List < String > group; 
        private Integer page; 
        private Integer pageSize; 
        private String queryType; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetRumOcuStatisticDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.filter = request.filter;
            this.group = request.group;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1687849260000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The filter condition. Three types of filter conditions are provided:</p>
         * <ul>
         * <li>Application name: pid (Note that the application name is displayed, but the application ID is actually specified)</li>
         * <li>Application type: siteType</li>
         * <li>Data type: dataType</li>
         * </ul>
         */
        public Builder filter(java.util.List < Filter> filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The grouping fields. Valid values:</p>
         * <ul>
         * <li>siteType: The total number of OCUs is grouped by application type.</li>
         * <li>dataType: The total number of OCUs is grouped by data type.</li>
         * <li>pid: The total number of OCUs is grouped by application ID.</li>
         * <li>appName: The total number of OCUs is grouped by application name.</li>
         * <li>startTime: The total number of OCUs is grouped by start time.</li>
         * </ul>
         */
        public Builder group(java.util.List < String > group) {
            String groupShrink = shrink(group, "Group", "json");
            this.putQueryParameter("Group", groupShrink);
            this.group = group;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of the query. To query non-time series data, set the value to INSTANT. To query time series data, set the value to TIME_SERIES.</p>
         * 
         * <strong>example:</strong>
         * <p>TIME_SERIES</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1600063200000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetRumOcuStatisticDataRequest build() {
            return new GetRumOcuStatisticDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetRumOcuStatisticDataRequest} extends {@link TeaModel}
     *
     * <p>GetRumOcuStatisticDataRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.opType = builder.opType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String opType; 
            private Object value; 

            /**
             * <p>The key of the filter condition. Three types of filter conditions are provided:</p>
             * <ul>
             * <li>Application name: pid (Note that the application name is displayed, but the application ID is actually specified)</li>
             * <li>Application type: siteType</li>
             * <li>Data type: dataType</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pid</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The type of the operator. Valid value: in.</p>
             * 
             * <strong>example:</strong>
             * <p>in</p>
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * <p>The value of the filter condition. The value is a JSON array of strings.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;b590xxxxx@2dcbxxxxx9&quot;, &quot;b590xxxxx@2dcbxxxxx8&quot;]</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
