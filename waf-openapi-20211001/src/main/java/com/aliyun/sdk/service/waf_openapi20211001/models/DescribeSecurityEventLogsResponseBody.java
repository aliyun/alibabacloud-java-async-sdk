// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeSecurityEventLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityEventLogsResponseBody</p>
 */
public class DescribeSecurityEventLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEventLogs")
    private java.util.List<?> securityEventLogs;

    @com.aliyun.core.annotation.NameInMap("SecurityEventLogsTotalCount")
    private Long securityEventLogsTotalCount;

    @com.aliyun.core.annotation.NameInMap("SecurityEventMetaData")
    private SecurityEventMetaData securityEventMetaData;

    private DescribeSecurityEventLogsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEventLogs = builder.securityEventLogs;
        this.securityEventLogsTotalCount = builder.securityEventLogsTotalCount;
        this.securityEventMetaData = builder.securityEventMetaData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventLogsResponseBody create() {
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
     * @return securityEventLogs
     */
    public java.util.List<?> getSecurityEventLogs() {
        return this.securityEventLogs;
    }

    /**
     * @return securityEventLogsTotalCount
     */
    public Long getSecurityEventLogsTotalCount() {
        return this.securityEventLogsTotalCount;
    }

    /**
     * @return securityEventMetaData
     */
    public SecurityEventMetaData getSecurityEventMetaData() {
        return this.securityEventMetaData;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<?> securityEventLogs; 
        private Long securityEventLogsTotalCount; 
        private SecurityEventMetaData securityEventMetaData; 

        private Builder() {
        } 

        private Builder(DescribeSecurityEventLogsResponseBody model) {
            this.requestId = model.requestId;
            this.securityEventLogs = model.securityEventLogs;
            this.securityEventLogsTotalCount = model.securityEventLogsTotalCount;
            this.securityEventMetaData = model.securityEventMetaData;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D827FCFE-90A7-4330-9326-D33C8B4C7726</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The attack logs returned.</p>
         */
        public Builder securityEventLogs(java.util.List<?> securityEventLogs) {
            this.securityEventLogs = securityEventLogs;
            return this;
        }

        /**
         * <p>The total number of logs returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder securityEventLogsTotalCount(Long securityEventLogsTotalCount) {
            this.securityEventLogsTotalCount = securityEventLogsTotalCount;
            return this;
        }

        /**
         * <p>The metadata of logs returned.</p>
         */
        public Builder securityEventMetaData(SecurityEventMetaData securityEventMetaData) {
            this.securityEventMetaData = securityEventMetaData;
            return this;
        }

        public DescribeSecurityEventLogsResponseBody build() {
            return new DescribeSecurityEventLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityEventLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventLogsResponseBody</p>
     */
    public static class DateRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndDate")
        private Long endDate;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private Long startDate;

        private DateRange(Builder builder) {
            this.endDate = builder.endDate;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DateRange create() {
            return builder().build();
        }

        /**
         * @return endDate
         */
        public Long getEndDate() {
            return this.endDate;
        }

        /**
         * @return startDate
         */
        public Long getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private Long endDate; 
            private Long startDate; 

            private Builder() {
            } 

            private Builder(DateRange model) {
                this.endDate = model.endDate;
                this.startDate = model.startDate;
            } 

            /**
             * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds. This value is the same as the value of EndDate in the request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>1713888600</p>
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds. This value is the same as the value of StartDate in the request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>1713888000</p>
             */
            public Builder startDate(Long startDate) {
                this.startDate = startDate;
                return this;
            }

            public DateRange build() {
                return new DateRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityEventLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventLogsResponseBody</p>
     */
    public static class SecurityEventMetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateRange")
        private DateRange dateRange;

        @com.aliyun.core.annotation.NameInMap("Units")
        private String units;

        private SecurityEventMetaData(Builder builder) {
            this.dateRange = builder.dateRange;
            this.units = builder.units;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEventMetaData create() {
            return builder().build();
        }

        /**
         * @return dateRange
         */
        public DateRange getDateRange() {
            return this.dateRange;
        }

        /**
         * @return units
         */
        public String getUnits() {
            return this.units;
        }

        public static final class Builder {
            private DateRange dateRange; 
            private String units; 

            private Builder() {
            } 

            private Builder(SecurityEventMetaData model) {
                this.dateRange = model.dateRange;
                this.units = model.units;
            } 

            /**
             * <p>The time range that is used for the query.</p>
             */
            public Builder dateRange(DateRange dateRange) {
                this.dateRange = dateRange;
                return this;
            }

            /**
             * <p>The unit of the returned data. Defaults to the value: requests.</p>
             * 
             * <strong>example:</strong>
             * <p>requests</p>
             */
            public Builder units(String units) {
                this.units = units;
                return this;
            }

            public SecurityEventMetaData build() {
                return new SecurityEventMetaData(this);
            } 

        } 

    }
}
