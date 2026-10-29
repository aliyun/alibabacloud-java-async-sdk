// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link GetBillingOverviewRequest} extends {@link RequestModel}
 *
 * <p>GetBillingOverviewRequest</p>
 */
public class GetBillingOverviewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("billMonth")
    private String billMonth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private Filter filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("granularity")
    private String granularity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private java.util.List<GroupBy> groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("locale")
    private String locale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timePeriod")
    private TimePeriod timePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("topNum")
    private Integer topNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("zeroFilter")
    private Boolean zeroFilter;

    private GetBillingOverviewRequest(Builder builder) {
        super(builder);
        this.billMonth = builder.billMonth;
        this.filter = builder.filter;
        this.granularity = builder.granularity;
        this.groupBy = builder.groupBy;
        this.locale = builder.locale;
        this.regionId = builder.regionId;
        this.timePeriod = builder.timePeriod;
        this.topNum = builder.topNum;
        this.zeroFilter = builder.zeroFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBillingOverviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billMonth
     */
    public String getBillMonth() {
        return this.billMonth;
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return groupBy
     */
    public java.util.List<GroupBy> getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return locale
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return timePeriod
     */
    public TimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * @return topNum
     */
    public Integer getTopNum() {
        return this.topNum;
    }

    /**
     * @return zeroFilter
     */
    public Boolean getZeroFilter() {
        return this.zeroFilter;
    }

    public static final class Builder extends Request.Builder<GetBillingOverviewRequest, Builder> {
        private String billMonth; 
        private Filter filter; 
        private String granularity; 
        private java.util.List<GroupBy> groupBy; 
        private String locale; 
        private String regionId; 
        private TimePeriod timePeriod; 
        private Integer topNum; 
        private Boolean zeroFilter; 

        private Builder() {
            super();
        } 

        private Builder(GetBillingOverviewRequest request) {
            super(request);
            this.billMonth = request.billMonth;
            this.filter = request.filter;
            this.granularity = request.granularity;
            this.groupBy = request.groupBy;
            this.locale = request.locale;
            this.regionId = request.regionId;
            this.timePeriod = request.timePeriod;
            this.topNum = request.topNum;
            this.zeroFilter = request.zeroFilter;
        } 

        /**
         * <p>The billing month.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08</p>
         */
        public Builder billMonth(String billMonth) {
            this.putQueryParameter("billMonth", billMonth);
            this.billMonth = billMonth;
            return this;
        }

        /**
         * <p>The filter conditions.</p>
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "filter", "json");
            this.putQueryParameter("filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The time granularity.</p>
         * 
         * <strong>example:</strong>
         * <p>MONTH</p>
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The list of grouping conditions. Currently, you must specify exactly one grouping dimension.</p>
         */
        public Builder groupBy(java.util.List<GroupBy> groupBy) {
            String groupByShrink = shrink(groupBy, "groupBy", "json");
            this.putQueryParameter("groupBy", groupByShrink);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>The language of the response. Default value: en-US.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder locale(String locale) {
            this.putQueryParameter("locale", locale);
            this.locale = locale;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The query time range, which includes the start and end times. Both the start and end times are included in the query range. The time format must be consistent with the granularity, and the start time cannot be later than the end time.</p>
         */
        public Builder timePeriod(TimePeriod timePeriod) {
            String timePeriodShrink = shrink(timePeriod, "timePeriod", "json");
            this.putQueryParameter("timePeriod", timePeriodShrink);
            this.timePeriod = timePeriod;
            return this;
        }

        /**
         * <p>The number of groups to return. Valid values: 1 to 20. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder topNum(Integer topNum) {
            this.putQueryParameter("topNum", topNum);
            this.topNum = topNum;
            return this;
        }

        /**
         * <p>Specifies whether to filter out groups with an amount of 0. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder zeroFilter(Boolean zeroFilter) {
            this.putQueryParameter("zeroFilter", zeroFilter);
            this.zeroFilter = zeroFilter;
            return this;
        }

        @Override
        public GetBillingOverviewRequest build() {
            return new GetBillingOverviewRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetBillingOverviewRequest} extends {@link TeaModel}
     *
     * <p>GetBillingOverviewRequest</p>
     */
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("selectType")
        private String selectType;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<String> values;

        private Dimensions(Builder builder) {
            this.code = builder.code;
            this.selectType = builder.selectType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return selectType
         */
        public String getSelectType() {
            return this.selectType;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String code; 
            private String selectType; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Dimensions model) {
                this.code = model.code;
                this.selectType = model.selectType;
                this.values = model.values;
            } 

            /**
             * <p>The filter field. For more information, see the &quot;Additional notes&quot; section below.</p>
             * 
             * <strong>example:</strong>
             * <p>CHARGE_TYPE</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The filter type.</p>
             * 
             * <strong>example:</strong>
             * <p>IN</p>
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * <p>The list of filter values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingOverviewRequest} extends {@link TeaModel}
     *
     * <p>GetBillingOverviewRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dimensions")
        private java.util.List<Dimensions> dimensions;

        private Filter(Builder builder) {
            this.dimensions = builder.dimensions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public java.util.List<Dimensions> getDimensions() {
            return this.dimensions;
        }

        public static final class Builder {
            private java.util.List<Dimensions> dimensions; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.dimensions = model.dimensions;
            } 

            /**
             * <p>The list of dimension filters.</p>
             */
            public Builder dimensions(java.util.List<Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingOverviewRequest} extends {@link TeaModel}
     *
     * <p>GetBillingOverviewRequest</p>
     */
    public static class GroupBy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        private GroupBy(Builder builder) {
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupBy create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        public static final class Builder {
            private String code; 

            private Builder() {
            } 

            private Builder(GroupBy model) {
                this.code = model.code;
            } 

            /**
             * <p>The code of the grouping dimension. For more information, see the &quot;Additional notes&quot; section below.</p>
             * 
             * <strong>example:</strong>
             * <p>BASE_MODEL</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            public GroupBy build() {
                return new GroupBy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBillingOverviewRequest} extends {@link TeaModel}
     *
     * <p>GetBillingOverviewRequest</p>
     */
    public static class TimePeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("end")
        private String end;

        @com.aliyun.core.annotation.NameInMap("start")
        private String start;

        private TimePeriod(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimePeriod create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            private Builder() {
            } 

            private Builder(TimePeriod model) {
                this.end = model.end;
                this.start = model.start;
            } 

            /**
             * <p>The end time of the query. This time point is included in the query range. The format is determined by granularity.</p>
             * 
             * <strong>example:</strong>
             * <p>202609</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The start time of the query. This time point is included in the query range. The format is determined by granularity.</p>
             * 
             * <strong>example:</strong>
             * <p>202609</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public TimePeriod build() {
                return new TimePeriod(this);
            } 

        } 

    }
}
