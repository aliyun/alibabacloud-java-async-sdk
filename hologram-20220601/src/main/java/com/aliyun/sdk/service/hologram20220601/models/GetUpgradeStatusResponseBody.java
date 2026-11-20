// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link GetUpgradeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetUpgradeStatusResponseBody</p>
 */
public class GetUpgradeStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetUpgradeStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUpgradeStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private String httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetUpgradeStatusResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal server error.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D73E42D0-AA72-5880-B96F-548B43C84736</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. This parameter is unrelated to the business logic.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUpgradeStatusResponseBody build() {
            return new GetUpgradeStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUpgradeStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetUpgradeStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Details")
        private String details;

        @com.aliyun.core.annotation.NameInMap("FromVersion")
        private String fromVersion;

        @com.aliyun.core.annotation.NameInMap("PrepareFinishTime")
        private String prepareFinishTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ToVersion")
        private String toVersion;

        private Data(Builder builder) {
            this.details = builder.details;
            this.fromVersion = builder.fromVersion;
            this.prepareFinishTime = builder.prepareFinishTime;
            this.status = builder.status;
            this.toVersion = builder.toVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public String getDetails() {
            return this.details;
        }

        /**
         * @return fromVersion
         */
        public String getFromVersion() {
            return this.fromVersion;
        }

        /**
         * @return prepareFinishTime
         */
        public String getPrepareFinishTime() {
            return this.prepareFinishTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return toVersion
         */
        public String getToVersion() {
            return this.toVersion;
        }

        public static final class Builder {
            private String details; 
            private String fromVersion; 
            private String prepareFinishTime; 
            private String status; 
            private String toVersion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.details = model.details;
                this.fromVersion = model.fromVersion;
                this.prepareFinishTime = model.prepareFinishTime;
                this.status = model.status;
                this.toVersion = model.toVersion;
            } 

            /**
             * <p>The details.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;UpgradePhase&quot;:&quot;Upgrade&quot;,&quot;StatusCode&quot;:&quot;LeaderRestartFailed&quot;,&quot;FlightingReport&quot;:{&quot;SQLResultStat&quot;:{&quot;TotalExecuted&quot;:9000&quot;Exceptions&quot;:0,&quot;Incorrect&quot;:1,&quot;Slow&quot;:1,&quot;DQLSpeedup&quot;:2}&quot;SegmentFormatStat&quot;:[{&quot;Database&quot;:&quot;test_db&quot;,&quot;TableUsingSegmentCount&quot;:5},{&quot;Database&quot;:&quot;user_order&quot;,&quot;TableUsingSegmentCount&quot;:7}],&quot;EstimatedUpgradeTime&quot;:{&quot;StopInstance&quot;:30,&quot;BackupData&quot;:120,&quot;UpgradeInstance&quot;:600},&quot;ReadPermissionCheckStat&quot;:[{&quot;db&quot;:&quot;tst0&quot;,&quot;user&quot;:&quot;v4_300433463265624129&quot;,&quot;schema&quot;:&quot;dim_db&quot;,&quot;table&quot;:&quot;it_rpt_org_tree_info_partition_all&quot;},{&quot;db&quot;:&quot;tst1&quot;,&quot;user&quot;:&quot;v4_300433463265624129&quot;,&quot;schema&quot;:&quot;dim_db&quot;,&quot;table&quot;:&quot;it_rpt_org_tree_info_partition_all_2&quot;},]},&quot;UpgradingSteps&quot;:{&quot;Stop&quot;:{&quot;Status&quot;:&quot;Success&quot;,&quot;StartTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;,&quot;StopTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;},&quot;Backup&quot;:{&quot;Status&quot;:&quot;Success&quot;,&quot;StartTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;,&quot;StopTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;},&quot;DoUpgrade&quot;:{&quot;Status&quot;:&quot;Success&quot;,&quot;StartTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;,&quot;StopTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;},&quot;Rollback&quot;:{&quot;Status&quot;:&quot;Success&quot;,&quot;StartTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;,&quot;StopTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;}},&quot;Instances&quot;:{&quot;LeaderInstanceId&quot;:&quot;hgxxx&quot;,&quot;LeaderInstanceName&quot;:&quot;ERP instance&quot;,&quot;LeaderInstanceStatus&quot;:&quot;Running&quot;,&quot;FollowerInstances&quot;:[{&quot;InstanceId&quot;:&quot;hgxxx&quot;,&quot;InstanceName&quot;:&quot;TMSinstance&quot;,&quot;Status&quot;:&quot;Running&quot;},{&quot;InstanceId&quot;:&quot;hxxx&quot;&quot;InstanceName&quot;:&quot;WMS readonly&quot;,&quot;Status&quot;:&quot;Unavailable&quot;}]}}</p>
             */
            public Builder details(String details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The current version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.3.23</p>
             */
            public Builder fromVersion(String fromVersion) {
                this.fromVersion = fromVersion;
                return this;
            }

            /**
             * <p>The time when the preparation is completed. The time is in UTC and formatted in accordance with ISO 8601.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-09T06:48:28.843Z</p>
             */
            public Builder prepareFinishTime(String prepareFinishTime) {
                this.prepareFinishTime = prepareFinishTime;
                return this;
            }

            /**
             * <p>The status of the Airflow DAG used for the instance upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>archived</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The target version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.3.24</p>
             */
            public Builder toVersion(String toVersion) {
                this.toVersion = toVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
