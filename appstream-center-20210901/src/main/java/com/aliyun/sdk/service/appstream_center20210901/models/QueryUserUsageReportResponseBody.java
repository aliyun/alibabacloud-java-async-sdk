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
 * {@link QueryUserUsageReportResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserUsageReportResponseBody</p>
 */
public class QueryUserUsageReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

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

    @com.aliyun.core.annotation.NameInMap("UserUsageReportDataModel")
    private java.util.List<UserUsageReportDataModel> userUsageReportDataModel;

    private QueryUserUsageReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.userUsageReportDataModel = builder.userUsageReportDataModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserUsageReportResponseBody create() {
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

    /**
     * @return userUsageReportDataModel
     */
    public java.util.List<UserUsageReportDataModel> getUserUsageReportDataModel() {
        return this.userUsageReportDataModel;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<UserUsageReportDataModel> userUsageReportDataModel; 

        private Builder() {
        } 

        private Builder(QueryUserUsageReportResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.userUsageReportDataModel = model.userUsageReportDataModel;
        } 

        /**
         * <p>The business status code. <code>200</code> indicates that the request is successful. Other values indicate that the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of user usage data, sorted in descending order of cumulative usage duration.</p>
         */
        public Builder userUsageReportDataModel(java.util.List<UserUsageReportDataModel> userUsageReportDataModel) {
            this.userUsageReportDataModel = userUsageReportDataModel;
            return this;
        }

        public QueryUserUsageReportResponseBody build() {
            return new QueryUserUsageReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUserUsageReportResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserUsageReportResponseBody</p>
     */
    public static class UserUsageReportDataModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
        private String appInstanceGroupName;

        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("LastConnectedTime")
        private String lastConnectedTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SessionsHoldDuration")
        private Double sessionsHoldDuration;

        @com.aliyun.core.annotation.NameInMap("UsageDuration")
        private Double usageDuration;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserUsageReportDataModel(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceGroupName = builder.appInstanceGroupName;
            this.connectionStatus = builder.connectionStatus;
            this.lastConnectedTime = builder.lastConnectedTime;
            this.regionId = builder.regionId;
            this.sessionsHoldDuration = builder.sessionsHoldDuration;
            this.usageDuration = builder.usageDuration;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserUsageReportDataModel create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceGroupName
         */
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return lastConnectedTime
         */
        public String getLastConnectedTime() {
            return this.lastConnectedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sessionsHoldDuration
         */
        public Double getSessionsHoldDuration() {
            return this.sessionsHoldDuration;
        }

        /**
         * @return usageDuration
         */
        public Double getUsageDuration() {
            return this.usageDuration;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String appInstanceGroupName; 
            private String connectionStatus; 
            private String lastConnectedTime; 
            private String regionId; 
            private Double sessionsHoldDuration; 
            private Double usageDuration; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserUsageReportDataModel model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceGroupName = model.appInstanceGroupName;
                this.connectionStatus = model.connectionStatus;
                this.lastConnectedTime = model.lastConnectedTime;
                this.regionId = model.regionId;
                this.sessionsHoldDuration = model.sessionsHoldDuration;
                this.usageDuration = model.usageDuration;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the app instance group to which the user usage record belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The name of the app instance group to which the user usage record belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D workstation group</p>
             */
            public Builder appInstanceGroupName(String appInstanceGroupName) {
                this.appInstanceGroupName = appInstanceGroupName;
                return this;
            }

            /**
             * <p>The current connection status of the user.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Connected: At least one currently connected session exists.</li>
             * <li>Disconnected: The session binding is retained, but no currently connected session exists.</li>
             * <li>Unbound: No session binding exists.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connected</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>The last connection time. Format: <code>yyyy-MM-dd HH:mm:ss</code>. If no current or historical connection record exists, <code>-</code> is returned. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01 10:00:00</p>
             */
            public Builder lastConnectedTime(String lastConnectedTime) {
                this.lastConnectedTime = lastConnectedTime;
                return this;
            }

            /**
             * <p>The current version does not return a valid region ID. Callers should not rely on this field. To filter by business region, use the BizRegionId request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The cumulative session persistence duration within the query range, which is the duration that the user occupies the session from the attach time to the session release time. Multiple sessions under the same app instance group are accumulated. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>3.5</p>
             */
            public Builder sessionsHoldDuration(Double sessionsHoldDuration) {
                this.sessionsHoldDuration = sessionsHoldDuration;
                return this;
            }

            /**
             * <p>The cumulative user usage duration within the query range. The usage duration of the same user under the same app instance group is aggregated by day. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder usageDuration(Double usageDuration) {
                this.usageDuration = usageDuration;
                return this;
            }

            /**
             * <p>The ID of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>user01</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserUsageReportDataModel build() {
                return new UserUsageReportDataModel(this);
            } 

        } 

    }
}
