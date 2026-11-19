// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link DescribeSavingsPlansCoverageTotalRequest} extends {@link RequestModel}
 *
 * <p>DescribeSavingsPlansCoverageTotalRequest</p>
 */
public class DescribeSavingsPlansCoverageTotalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillOwnerId")
    @com.aliyun.core.annotation.Validation()
    private Long billOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndPeriod")
    private String endPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterParam")
    private FilterParam filterParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startPeriod;

    private DescribeSavingsPlansCoverageTotalRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.endPeriod = builder.endPeriod;
        this.filterParam = builder.filterParam;
        this.periodType = builder.periodType;
        this.startPeriod = builder.startPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSavingsPlansCoverageTotalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billOwnerId
     */
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    /**
     * @return endPeriod
     */
    public String getEndPeriod() {
        return this.endPeriod;
    }

    /**
     * @return filterParam
     */
    public FilterParam getFilterParam() {
        return this.filterParam;
    }

    /**
     * @return periodType
     */
    public String getPeriodType() {
        return this.periodType;
    }

    /**
     * @return startPeriod
     */
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public static final class Builder extends Request.Builder<DescribeSavingsPlansCoverageTotalRequest, Builder> {
        private Long billOwnerId; 
        private String endPeriod; 
        private FilterParam filterParam; 
        private String periodType; 
        private String startPeriod; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSavingsPlansCoverageTotalRequest request) {
            super(request);
            this.billOwnerId = request.billOwnerId;
            this.endPeriod = request.endPeriod;
            this.filterParam = request.filterParam;
            this.periodType = request.periodType;
            this.startPeriod = request.startPeriod;
        } 

        /**
         * <p>The ID of the resource ownership account. The resource ownership account is the account that actually uses the resources.</p>
         * 
         * <strong>example:</strong>
         * <p>123745698925000</p>
         */
        public Builder billOwnerId(Long billOwnerId) {
            this.putQueryParameter("BillOwnerId", billOwnerId);
            this.billOwnerId = billOwnerId;
            return this;
        }

        /**
         * <p>The end time of the query. Format: yyyy-MM-dd HH:mm:ss. The specified end time is excluded from the query. If this parameter is left empty, the current time is used as the end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-20 00:00:00</p>
         */
        public Builder endPeriod(String endPeriod) {
            this.putQueryParameter("EndPeriod", endPeriod);
            this.endPeriod = endPeriod;
            return this;
        }

        /**
         * <p>The filter parameters.</p>
         */
        public Builder filterParam(FilterParam filterParam) {
            String filterParamShrink = shrink(filterParam, "FilterParam", "json");
            this.putQueryParameter("FilterParam", filterParamShrink);
            this.filterParam = filterParam;
            return this;
        }

        /**
         * <p>The time granularity. Valid values:</p>
         * <ul>
         * <li>MONTH: month</li>
         * <li>DAY: day</li>
         * <li>HOUR: hour</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        public Builder periodType(String periodType) {
            this.putQueryParameter("PeriodType", periodType);
            this.periodType = periodType;
            return this;
        }

        /**
         * <p>The start time of the query. Format: yyyy-MM-dd HH:mm:ss. The specified start time is included in the query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-15 00:00:00</p>
         */
        public Builder startPeriod(String startPeriod) {
            this.putQueryParameter("StartPeriod", startPeriod);
            this.startPeriod = startPeriod;
            return this;
        }

        @Override
        public DescribeSavingsPlansCoverageTotalRequest build() {
            return new DescribeSavingsPlansCoverageTotalRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSavingsPlansCoverageTotalRequest} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansCoverageTotalRequest</p>
     */
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("SelectType")
        private String selectType;

        @com.aliyun.core.annotation.NameInMap("Values")
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
             * <p>The dimension code.</p>
             * 
             * <strong>example:</strong>
             * <p>COMMODITY</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The selection method for dimension filtering.</p>
             * 
             * <strong>example:</strong>
             * <p>IN</p>
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * <p>The list of dimension filter values.</p>
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
     * {@link DescribeSavingsPlansCoverageTotalRequest} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansCoverageTotalRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("SelectType")
        private String selectType;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private Tags(Builder builder) {
            this.code = builder.code;
            this.selectType = builder.selectType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.code = model.code;
                this.selectType = model.selectType;
                this.values = model.values;
            } 

            /**
             * <p>The tag code.</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The selection method for tag filtering.</p>
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * <p>The list of tag filter values.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSavingsPlansCoverageTotalRequest} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansCoverageTotalRequest</p>
     */
    public static class FilterParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List<Dimensions> dimensions;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private FilterParam(Builder builder) {
            this.dimensions = builder.dimensions;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterParam create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public java.util.List<Dimensions> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<Dimensions> dimensions; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(FilterParam model) {
                this.dimensions = model.dimensions;
                this.tags = model.tags;
            } 

            /**
             * <p>The list of dimension filter conditions.</p>
             */
            public Builder dimensions(java.util.List<Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The list of tag filter conditions.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public FilterParam build() {
                return new FilterParam(this);
            } 

        } 

    }
}
