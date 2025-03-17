// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link DownloadDataTrackResultRequest} extends {@link RequestModel}
 *
 * <p>DownloadDataTrackResultRequest</p>
 */
public class DownloadDataTrackResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnFilter")
    private ColumnFilter columnFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventIdList")
    private java.util.List<Long> eventIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterEndTime")
    private String filterEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterStartTime")
    private String filterStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterTableList")
    private java.util.List<String> filterTableList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterTypeList")
    private java.util.List<String> filterTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RollbackSQLType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rollbackSQLType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private DownloadDataTrackResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columnFilter = builder.columnFilter;
        this.eventIdList = builder.eventIdList;
        this.filterEndTime = builder.filterEndTime;
        this.filterStartTime = builder.filterStartTime;
        this.filterTableList = builder.filterTableList;
        this.filterTypeList = builder.filterTypeList;
        this.orderId = builder.orderId;
        this.rollbackSQLType = builder.rollbackSQLType;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadDataTrackResultRequest create() {
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
     * @return eventIdList
     */
    public java.util.List<Long> getEventIdList() {
        return this.eventIdList;
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
    public java.util.List<String> getFilterTableList() {
        return this.filterTableList;
    }

    /**
     * @return filterTypeList
     */
    public java.util.List<String> getFilterTypeList() {
        return this.filterTypeList;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return rollbackSQLType
     */
    public String getRollbackSQLType() {
        return this.rollbackSQLType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<DownloadDataTrackResultRequest, Builder> {
        private String regionId; 
        private ColumnFilter columnFilter; 
        private java.util.List<Long> eventIdList; 
        private String filterEndTime; 
        private String filterStartTime; 
        private java.util.List<String> filterTableList; 
        private java.util.List<String> filterTypeList; 
        private Long orderId; 
        private String rollbackSQLType; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(DownloadDataTrackResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columnFilter = request.columnFilter;
            this.eventIdList = request.eventIdList;
            this.filterEndTime = request.filterEndTime;
            this.filterStartTime = request.filterStartTime;
            this.filterTableList = request.filterTableList;
            this.filterTypeList = request.filterTypeList;
            this.orderId = request.orderId;
            this.rollbackSQLType = request.rollbackSQLType;
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
         * <p>The condition to filter columns.</p>
         */
        public Builder columnFilter(ColumnFilter columnFilter) {
            String columnFilterShrink = shrink(columnFilter, "ColumnFilter", "json");
            this.putQueryParameter("ColumnFilter", columnFilterShrink);
            this.columnFilter = columnFilter;
            return this;
        }

        /**
         * <p>The IDs of the events.</p>
         */
        public Builder eventIdList(java.util.List<Long> eventIdList) {
            String eventIdListShrink = shrink(eventIdList, "EventIdList", "json");
            this.putQueryParameter("EventIdList", eventIdListShrink);
            this.eventIdList = eventIdList;
            return this;
        }

        /**
         * <p>The end time of the time range in which you want to track data operations. The time must be specified in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-23 10:00:00</p>
         */
        public Builder filterEndTime(String filterEndTime) {
            this.putQueryParameter("FilterEndTime", filterEndTime);
            this.filterEndTime = filterEndTime;
            return this;
        }

        /**
         * <p>The start time of the time range in which you want to track data operations. The time must be specified in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-23 00:00:00</p>
         */
        public Builder filterStartTime(String filterStartTime) {
            this.putQueryParameter("FilterStartTime", filterStartTime);
            this.filterStartTime = filterStartTime;
            return this;
        }

        /**
         * <p>The names of the tables for which you want to track data operations.</p>
         */
        public Builder filterTableList(java.util.List<String> filterTableList) {
            String filterTableListShrink = shrink(filterTableList, "FilterTableList", "json");
            this.putQueryParameter("FilterTableList", filterTableListShrink);
            this.filterTableList = filterTableList;
            return this;
        }

        /**
         * <p>The types of data operations that you want to track.</p>
         */
        public Builder filterTypeList(java.util.List<String> filterTypeList) {
            String filterTypeListShrink = shrink(filterTypeList, "FilterTypeList", "json");
            this.putQueryParameter("FilterTypeList", filterTypeListShrink);
            this.filterTypeList = filterTypeList;
            return this;
        }

        /**
         * <p>The ID of the ticket. You can call the <a href="https://help.aliyun.com/document_detail/144643.html">ListOrders</a> operation to obtain the ticket ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>406****</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The type of the SQL statement.</p>
         * <ul>
         * <li><strong>REVERSE</strong>: undoes or rolls back an executed SQL statement, which is equivalent to the UNDO SQL statement.</li>
         * <li><strong>FORWARD</strong>: redoes or re-executes an SQL statement that failed to be executed, which is equivalent to the REDO SQL statement.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REVERSE</p>
         */
        public Builder rollbackSQLType(String rollbackSQLType) {
            this.putQueryParameter("RollbackSQLType", rollbackSQLType);
            this.rollbackSQLType = rollbackSQLType;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public DownloadDataTrackResultRequest build() {
            return new DownloadDataTrackResultRequest(this);
        } 

    } 

    /**
     * 
     * {@link DownloadDataTrackResultRequest} extends {@link TeaModel}
     *
     * <p>DownloadDataTrackResultRequest</p>
     */
    public static class ColumnFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BetweenEnd")
        private String betweenEnd;

        @com.aliyun.core.annotation.NameInMap("BetweenStart")
        private String betweenStart;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("InList")
        private java.util.List<String> inList;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
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
        public java.util.List<String> getInList() {
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
            private java.util.List<String> inList; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(ColumnFilter model) {
                this.betweenEnd = model.betweenEnd;
                this.betweenStart = model.betweenStart;
                this.columnName = model.columnName;
                this.inList = model.inList;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>The end value of the range used in the filter condition. This parameter takes effect only when Operator is set to BETWEEN.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder betweenEnd(String betweenEnd) {
                this.betweenEnd = betweenEnd;
                return this;
            }

            /**
             * <p>The start value of the range used in the filter condition. This parameter takes effect only when Operator is set to BETWEEN.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder betweenStart(String betweenStart) {
                this.betweenStart = betweenStart;
                return this;
            }

            /**
             * <p>The name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>account_name</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The IN list used in the filter condition.</p>
             */
            public Builder inList(java.util.List<String> inList) {
                this.inList = inList;
                return this;
            }

            /**
             * <p>The type of the operator used to configure the filter condition. Valid values:</p>
             * <ul>
             * <li><strong>EQUAL</strong>: retrieves the column whose value is equal to the specified value.</li>
             * <li><strong>NOT_EQUAL</strong>: retrieves the column whose value is not equal to the specified value.</li>
             * <li><strong>IN</strong>: retrieves the column whose value is in the IN list.</li>
             * <li><strong>BETWEEN</strong>: retrieves the column whose value is in the specified range.</li>
             * <li><strong>LESS</strong>: retrieves the column whose value is less than the specified value.</li>
             * <li><strong>MORE</strong>: retrieves the column whose value is greater than the specified value.</li>
             * <li><strong>NOT_IN</strong>: retrieves the column whose value is not in the IN list.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EQUAL</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The value used in the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
