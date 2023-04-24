// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchDataTrackResultRequest} extends {@link RequestModel}
 *
 * <p>SearchDataTrackResultRequest</p>
 */
public class SearchDataTrackResultRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ColumnFilter")
    private ColumnFilter columnFilter;

    @Query
    @NameInMap("FilterEndTime")
    private String filterEndTime;

    @Query
    @NameInMap("FilterStartTime")
    private String filterStartTime;

    @Query
    @NameInMap("FilterTableList")
    private java.util.List < String > filterTableList;

    @Query
    @NameInMap("FilterTypeList")
    private java.util.List < String > filterTypeList;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true, minimum = 1)
    private Long orderId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private SearchDataTrackResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columnFilter = builder.columnFilter;
        this.filterEndTime = builder.filterEndTime;
        this.filterStartTime = builder.filterStartTime;
        this.filterTableList = builder.filterTableList;
        this.filterTypeList = builder.filterTypeList;
        this.orderId = builder.orderId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchDataTrackResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return columnFilter
     */
    public ColumnFilter getColumnFilter() {
        return this.columnFilter;
    }

    /**
     * @return filterEndTime
     */
    public String getFilterEndTime() {
        return this.filterEndTime;
    }

    /**
     * @return filterStartTime
     */
    public String getFilterStartTime() {
        return this.filterStartTime;
    }

    /**
     * @return filterTableList
     */
    public java.util.List < String > getFilterTableList() {
        return this.filterTableList;
    }

    /**
     * @return filterTypeList
     */
    public java.util.List < String > getFilterTypeList() {
        return this.filterTypeList;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<SearchDataTrackResultRequest, Builder> {
        private String regionId; 
        private ColumnFilter columnFilter; 
        private String filterEndTime; 
        private String filterStartTime; 
        private java.util.List < String > filterTableList; 
        private java.util.List < String > filterTypeList; 
        private Long orderId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SearchDataTrackResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columnFilter = request.columnFilter;
            this.filterEndTime = request.filterEndTime;
            this.filterStartTime = request.filterStartTime;
            this.filterTableList = request.filterTableList;
            this.filterTypeList = request.filterTypeList;
            this.orderId = request.orderId;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ColumnFilter.
         */
        public Builder columnFilter(ColumnFilter columnFilter) {
            String columnFilterShrink = shrink(columnFilter, "ColumnFilter", "json");
            this.putQueryParameter("ColumnFilter", columnFilterShrink);
            this.columnFilter = columnFilter;
            return this;
        }

        /**
         * FilterEndTime.
         */
        public Builder filterEndTime(String filterEndTime) {
            this.putQueryParameter("FilterEndTime", filterEndTime);
            this.filterEndTime = filterEndTime;
            return this;
        }

        /**
         * FilterStartTime.
         */
        public Builder filterStartTime(String filterStartTime) {
            this.putQueryParameter("FilterStartTime", filterStartTime);
            this.filterStartTime = filterStartTime;
            return this;
        }

        /**
         * FilterTableList.
         */
        public Builder filterTableList(java.util.List < String > filterTableList) {
            String filterTableListShrink = shrink(filterTableList, "FilterTableList", "json");
            this.putQueryParameter("FilterTableList", filterTableListShrink);
            this.filterTableList = filterTableList;
            return this;
        }

        /**
         * FilterTypeList.
         */
        public Builder filterTypeList(java.util.List < String > filterTypeList) {
            String filterTypeListShrink = shrink(filterTypeList, "FilterTypeList", "json");
            this.putQueryParameter("FilterTypeList", filterTypeListShrink);
            this.filterTypeList = filterTypeList;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public SearchDataTrackResultRequest build() {
            return new SearchDataTrackResultRequest(this);
        } 

    } 

    public static class ColumnFilter extends TeaModel {
        @NameInMap("BetweenEnd")
        private String betweenEnd;

        @NameInMap("BetweenStart")
        private String betweenStart;

        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("InList")
        private java.util.List < String > inList;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
        private String value;

        private ColumnFilter(Builder builder) {
            this.betweenEnd = builder.betweenEnd;
            this.betweenStart = builder.betweenStart;
            this.columnName = builder.columnName;
            this.inList = builder.inList;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnFilter create() {
            return builder().build();
        }

        /**
         * @return betweenEnd
         */
        public String getBetweenEnd() {
            return this.betweenEnd;
        }

        /**
         * @return betweenStart
         */
        public String getBetweenStart() {
            return this.betweenStart;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return inList
         */
        public java.util.List < String > getInList() {
            return this.inList;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String betweenEnd; 
            private String betweenStart; 
            private String columnName; 
            private java.util.List < String > inList; 
            private String operator; 
            private String value; 

            /**
             * BetweenEnd.
             */
            public Builder betweenEnd(String betweenEnd) {
                this.betweenEnd = betweenEnd;
                return this;
            }

            /**
             * BetweenStart.
             */
            public Builder betweenStart(String betweenStart) {
                this.betweenStart = betweenStart;
                return this;
            }

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * InList.
             */
            public Builder inList(java.util.List < String > inList) {
                this.inList = inList;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ColumnFilter build() {
                return new ColumnFilter(this);
            } 

        } 

    }
}
