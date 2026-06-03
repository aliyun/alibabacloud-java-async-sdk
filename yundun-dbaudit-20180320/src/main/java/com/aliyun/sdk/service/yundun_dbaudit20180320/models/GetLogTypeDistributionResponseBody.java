// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link GetLogTypeDistributionResponseBody} extends {@link TeaModel}
 *
 * <p>GetLogTypeDistributionResponseBody</p>
 */
public class GetLogTypeDistributionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeList")
    private java.util.List<TimeList> timeList;

    private GetLogTypeDistributionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timeList = builder.timeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogTypeDistributionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeList
     */
    public java.util.List<TimeList> getTimeList() {
        return this.timeList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TimeList> timeList; 

        private Builder() {
        } 

        private Builder(GetLogTypeDistributionResponseBody model) {
            this.requestId = model.requestId;
            this.timeList = model.timeList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TimeList.
         */
        public Builder timeList(java.util.List<TimeList> timeList) {
            this.timeList = timeList;
            return this;
        }

        public GetLogTypeDistributionResponseBody build() {
            return new GetLogTypeDistributionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLogTypeDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>GetLogTypeDistributionResponseBody</p>
     */
    public static class TimeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginDate")
        private String beginDate;

        @com.aliyun.core.annotation.NameInMap("DeleteSqlCount")
        private Long deleteSqlCount;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("ExecCostUS")
        private String execCostUS;

        @com.aliyun.core.annotation.NameInMap("InsertSqlCount")
        private Long insertSqlCount;

        @com.aliyun.core.annotation.NameInMap("OtherSqlCount")
        private Long otherSqlCount;

        @com.aliyun.core.annotation.NameInMap("SelectSqlCount")
        private Long selectSqlCount;

        @com.aliyun.core.annotation.NameInMap("SqlCount")
        private Long sqlCount;

        @com.aliyun.core.annotation.NameInMap("UpdateSqlCount")
        private Long updateSqlCount;

        private TimeList(Builder builder) {
            this.beginDate = builder.beginDate;
            this.deleteSqlCount = builder.deleteSqlCount;
            this.endDate = builder.endDate;
            this.execCostUS = builder.execCostUS;
            this.insertSqlCount = builder.insertSqlCount;
            this.otherSqlCount = builder.otherSqlCount;
            this.selectSqlCount = builder.selectSqlCount;
            this.sqlCount = builder.sqlCount;
            this.updateSqlCount = builder.updateSqlCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeList create() {
            return builder().build();
        }

        /**
         * @return beginDate
         */
        public String getBeginDate() {
            return this.beginDate;
        }

        /**
         * @return deleteSqlCount
         */
        public Long getDeleteSqlCount() {
            return this.deleteSqlCount;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return execCostUS
         */
        public String getExecCostUS() {
            return this.execCostUS;
        }

        /**
         * @return insertSqlCount
         */
        public Long getInsertSqlCount() {
            return this.insertSqlCount;
        }

        /**
         * @return otherSqlCount
         */
        public Long getOtherSqlCount() {
            return this.otherSqlCount;
        }

        /**
         * @return selectSqlCount
         */
        public Long getSelectSqlCount() {
            return this.selectSqlCount;
        }

        /**
         * @return sqlCount
         */
        public Long getSqlCount() {
            return this.sqlCount;
        }

        /**
         * @return updateSqlCount
         */
        public Long getUpdateSqlCount() {
            return this.updateSqlCount;
        }

        public static final class Builder {
            private String beginDate; 
            private Long deleteSqlCount; 
            private String endDate; 
            private String execCostUS; 
            private Long insertSqlCount; 
            private Long otherSqlCount; 
            private Long selectSqlCount; 
            private Long sqlCount; 
            private Long updateSqlCount; 

            private Builder() {
            } 

            private Builder(TimeList model) {
                this.beginDate = model.beginDate;
                this.deleteSqlCount = model.deleteSqlCount;
                this.endDate = model.endDate;
                this.execCostUS = model.execCostUS;
                this.insertSqlCount = model.insertSqlCount;
                this.otherSqlCount = model.otherSqlCount;
                this.selectSqlCount = model.selectSqlCount;
                this.sqlCount = model.sqlCount;
                this.updateSqlCount = model.updateSqlCount;
            } 

            /**
             * BeginDate.
             */
            public Builder beginDate(String beginDate) {
                this.beginDate = beginDate;
                return this;
            }

            /**
             * DeleteSqlCount.
             */
            public Builder deleteSqlCount(Long deleteSqlCount) {
                this.deleteSqlCount = deleteSqlCount;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * ExecCostUS.
             */
            public Builder execCostUS(String execCostUS) {
                this.execCostUS = execCostUS;
                return this;
            }

            /**
             * InsertSqlCount.
             */
            public Builder insertSqlCount(Long insertSqlCount) {
                this.insertSqlCount = insertSqlCount;
                return this;
            }

            /**
             * OtherSqlCount.
             */
            public Builder otherSqlCount(Long otherSqlCount) {
                this.otherSqlCount = otherSqlCount;
                return this;
            }

            /**
             * SelectSqlCount.
             */
            public Builder selectSqlCount(Long selectSqlCount) {
                this.selectSqlCount = selectSqlCount;
                return this;
            }

            /**
             * SqlCount.
             */
            public Builder sqlCount(Long sqlCount) {
                this.sqlCount = sqlCount;
                return this;
            }

            /**
             * UpdateSqlCount.
             */
            public Builder updateSqlCount(Long updateSqlCount) {
                this.updateSqlCount = updateSqlCount;
                return this;
            }

            public TimeList build() {
                return new TimeList(this);
            } 

        } 

    }
}
