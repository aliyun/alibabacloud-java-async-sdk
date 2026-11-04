// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QueryConnectionReportResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConnectionReportResponseBody</p>
 */
public class QueryConnectionReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ConnectionReportDataModel")
    private java.util.List<ConnectionReportDataModel> connectionReportDataModel;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryConnectionReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.connectionReportDataModel = builder.connectionReportDataModel;
        this.count = builder.count;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConnectionReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return connectionReportDataModel
     */
    public java.util.List<ConnectionReportDataModel> getConnectionReportDataModel() {
        return this.connectionReportDataModel;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<ConnectionReportDataModel> connectionReportDataModel; 
        private Integer count; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryConnectionReportResponseBody model) {
            this.code = model.code;
            this.connectionReportDataModel = model.connectionReportDataModel;
            this.count = model.count;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of <code>200</code> indicates that the request is processed successfully. Other values indicate that the request fails to be processed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of connection report data.</p>
         */
        public Builder connectionReportDataModel(java.util.List<ConnectionReportDataModel> connectionReportDataModel) {
            this.connectionReportDataModel = connectionReportDataModel;
            return this;
        }

        /**
         * <p>The total number of records that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The description of the request processing result. <code>success</code> is usually returned when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number corresponding to the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page used in the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the current request, which can be used to troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryConnectionReportResponseBody build() {
            return new QueryConnectionReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryConnectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConnectionReportResponseBody</p>
     */
    public static class ConnectionReportDataModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("ConnectionAvgDurationSeconds")
        private Double connectionAvgDurationSeconds;

        @com.aliyun.core.annotation.NameInMap("ConnectionFailureCount")
        private Long connectionFailureCount;

        @com.aliyun.core.annotation.NameInMap("ConnectionSuccessCount")
        private Long connectionSuccessCount;

        @com.aliyun.core.annotation.NameInMap("ConnectionSuccessRate")
        private Double connectionSuccessRate;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StatEndDate")
        private String statEndDate;

        @com.aliyun.core.annotation.NameInMap("StatStartDate")
        private String statStartDate;

        private ConnectionReportDataModel(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.connectionAvgDurationSeconds = builder.connectionAvgDurationSeconds;
            this.connectionFailureCount = builder.connectionFailureCount;
            this.connectionSuccessCount = builder.connectionSuccessCount;
            this.connectionSuccessRate = builder.connectionSuccessRate;
            this.regionId = builder.regionId;
            this.statEndDate = builder.statEndDate;
            this.statStartDate = builder.statStartDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionReportDataModel create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return connectionAvgDurationSeconds
         */
        public Double getConnectionAvgDurationSeconds() {
            return this.connectionAvgDurationSeconds;
        }

        /**
         * @return connectionFailureCount
         */
        public Long getConnectionFailureCount() {
            return this.connectionFailureCount;
        }

        /**
         * @return connectionSuccessCount
         */
        public Long getConnectionSuccessCount() {
            return this.connectionSuccessCount;
        }

        /**
         * @return connectionSuccessRate
         */
        public Double getConnectionSuccessRate() {
            return this.connectionSuccessRate;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return statEndDate
         */
        public String getStatEndDate() {
            return this.statEndDate;
        }

        /**
         * @return statStartDate
         */
        public String getStatStartDate() {
            return this.statStartDate;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private Double connectionAvgDurationSeconds; 
            private Long connectionFailureCount; 
            private Long connectionSuccessCount; 
            private Double connectionSuccessRate; 
            private String regionId; 
            private String statEndDate; 
            private String statStartDate; 

            private Builder() {
            } 

            private Builder(ConnectionReportDataModel model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.connectionAvgDurationSeconds = model.connectionAvgDurationSeconds;
                this.connectionFailureCount = model.connectionFailureCount;
                this.connectionSuccessCount = model.connectionSuccessCount;
                this.connectionSuccessRate = model.connectionSuccessRate;
                this.regionId = model.regionId;
                this.statEndDate = model.statEndDate;
                this.statStartDate = model.statStartDate;
            } 

            /**
             * <p>The ID of the app instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The average duration of successful connections. In the current version, the return value is in milliseconds. Parse it as milliseconds. The <code>Seconds</code> in the field name is retained for compatibility and cannot be used as the unit basis. This value may not be returned when there are no successful connections.</p>
             * 
             * <strong>example:</strong>
             * <p>1250</p>
             */
            public Builder connectionAvgDurationSeconds(Double connectionAvgDurationSeconds) {
                this.connectionAvgDurationSeconds = connectionAvgDurationSeconds;
                return this;
            }

            /**
             * <p>The number of failed connections within the statistical window. Unit: count.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder connectionFailureCount(Long connectionFailureCount) {
                this.connectionFailureCount = connectionFailureCount;
                return this;
            }

            /**
             * <p>The number of successful connections within the statistical window. Unit: count.</p>
             * 
             * <strong>example:</strong>
             * <p>98</p>
             */
            public Builder connectionSuccessCount(Long connectionSuccessCount) {
                this.connectionSuccessCount = connectionSuccessCount;
                return this;
            }

            /**
             * <p>The connection success rate, which is calculated by dividing the number of successful connections by the sum of successful and failed connections. The value ranges from 0 to 1. Multiply by 100 to get the percentage. This value may not be returned when there are no connection records.</p>
             * 
             * <strong>example:</strong>
             * <p>0.98</p>
             */
            public Builder connectionSuccessRate(Double connectionSuccessRate) {
                this.connectionSuccessRate = connectionSuccessRate;
                return this;
            }

            /**
             * <p>The ID of the business region to which the report data belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The end time of the statistical window. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01 10:05:00</p>
             */
            public Builder statEndDate(String statEndDate) {
                this.statEndDate = statEndDate;
                return this;
            }

            /**
             * <p>The start time of the statistical window. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01 10:00:00</p>
             */
            public Builder statStartDate(String statStartDate) {
                this.statStartDate = statStartDate;
                return this;
            }

            public ConnectionReportDataModel build() {
                return new ConnectionReportDataModel(this);
            } 

        } 

    }
}
