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
 * {@link DescribeSavingsPlansCoverageDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeSavingsPlansCoverageDetailRequest</p>
 */
public class DescribeSavingsPlansCoverageDetailRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private DescribeSavingsPlansCoverageDetailRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.endPeriod = builder.endPeriod;
        this.filterParam = builder.filterParam;
        this.maxResults = builder.maxResults;
        this.periodType = builder.periodType;
        this.startPeriod = builder.startPeriod;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSavingsPlansCoverageDetailRequest create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<DescribeSavingsPlansCoverageDetailRequest, Builder> {
        private Long billOwnerId; 
        private String endPeriod; 
        private FilterParam filterParam; 
        private Integer maxResults; 
        private String periodType; 
        private String startPeriod; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSavingsPlansCoverageDetailRequest request) {
            super(request);
            this.billOwnerId = request.billOwnerId;
            this.endPeriod = request.endPeriod;
            this.filterParam = request.filterParam;
            this.maxResults = request.maxResults;
            this.periodType = request.periodType;
            this.startPeriod = request.startPeriod;
            this.token = request.token;
        } 

        /**
         * <p>The ID of the account for which you want to query coverage details.</p>
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
         * <p>The end of the time range to query. The end is excluded from the time range. If you do not set this parameter, the end time is the current time. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-09 00:00:00</p>
         */
        public Builder endPeriod(String endPeriod) {
            this.putQueryParameter("EndPeriod", endPeriod);
            this.endPeriod = endPeriod;
            return this;
        }

        /**
         * FilterParam.
         */
        public Builder filterParam(FilterParam filterParam) {
            String filterParamShrink = shrink(filterParam, "FilterParam", "json");
            this.putQueryParameter("FilterParam", filterParamShrink);
            this.filterParam = filterParam;
            return this;
        }

        /**
         * <p>The maximum number of entries to return. Default value: 20. Maximum value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The time granularity at which coverage details are queried. Valid values: MONTH, DAY, and HOUR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        public Builder periodType(String periodType) {
            this.putQueryParameter("PeriodType", periodType);
            this.periodType = periodType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The beginning is included in the time range. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-15 13:40:45</p>
         */
        public Builder startPeriod(String startPeriod) {
            this.putQueryParameter("StartPeriod", startPeriod);
            this.startPeriod = startPeriod;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results. You do not need to set this parameter if you query coverage details within a specific time range for the first time. The response returns a token that you can use to query coverage details that are displayed on the next page. If a null value is returned for the NextToken parameter, no more coverage details can be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public DescribeSavingsPlansCoverageDetailRequest build() {
            return new DescribeSavingsPlansCoverageDetailRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSavingsPlansCoverageDetailRequest} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansCoverageDetailRequest</p>
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * SelectType.
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * Values.
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
     * {@link DescribeSavingsPlansCoverageDetailRequest} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansCoverageDetailRequest</p>
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * SelectType.
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * Values.
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
     * {@link DescribeSavingsPlansCoverageDetailRequest} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansCoverageDetailRequest</p>
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
             * Dimensions.
             */
            public Builder dimensions(java.util.List<Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * Tags.
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
