// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCronClearConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCronClearConfigResponseBody</p>
 */
public class GetDataCronClearConfigResponseBody extends TeaModel {
    @NameInMap("DataCronClearConfig")
    private DataCronClearConfig dataCronClearConfig;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDataCronClearConfigResponseBody(Builder builder) {
        this.dataCronClearConfig = builder.dataCronClearConfig;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCronClearConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCronClearConfig
     */
    public DataCronClearConfig getDataCronClearConfig() {
        return this.dataCronClearConfig;
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
        private DataCronClearConfig dataCronClearConfig; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data configuration.
         */
        public Builder dataCronClearConfig(DataCronClearConfig dataCronClearConfig) {
            this.dataCronClearConfig = dataCronClearConfig;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataCronClearConfigResponseBody build() {
            return new GetDataCronClearConfigResponseBody(this);
        } 

    } 

    public static class DataCronClearConfig extends TeaModel {
        @NameInMap("CronCallTimes")
        private String cronCallTimes;

        @NameInMap("CronFormat")
        private String cronFormat;

        @NameInMap("CronLastCallStartTime")
        private String cronLastCallStartTime;

        @NameInMap("CronNextCallTime")
        private String cronNextCallTime;

        @NameInMap("CronStatus")
        private String cronStatus;

        @NameInMap("CurrentClearTaskCount")
        private Long currentClearTaskCount;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("OptimizeTableAfterEveryClearTimes")
        private Long optimizeTableAfterEveryClearTimes;

        private DataCronClearConfig(Builder builder) {
            this.cronCallTimes = builder.cronCallTimes;
            this.cronFormat = builder.cronFormat;
            this.cronLastCallStartTime = builder.cronLastCallStartTime;
            this.cronNextCallTime = builder.cronNextCallTime;
            this.cronStatus = builder.cronStatus;
            this.currentClearTaskCount = builder.currentClearTaskCount;
            this.duration = builder.duration;
            this.optimizeTableAfterEveryClearTimes = builder.optimizeTableAfterEveryClearTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCronClearConfig create() {
            return builder().build();
        }

        /**
         * @return cronCallTimes
         */
        public String getCronCallTimes() {
            return this.cronCallTimes;
        }

        /**
         * @return cronFormat
         */
        public String getCronFormat() {
            return this.cronFormat;
        }

        /**
         * @return cronLastCallStartTime
         */
        public String getCronLastCallStartTime() {
            return this.cronLastCallStartTime;
        }

        /**
         * @return cronNextCallTime
         */
        public String getCronNextCallTime() {
            return this.cronNextCallTime;
        }

        /**
         * @return cronStatus
         */
        public String getCronStatus() {
            return this.cronStatus;
        }

        /**
         * @return currentClearTaskCount
         */
        public Long getCurrentClearTaskCount() {
            return this.currentClearTaskCount;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return optimizeTableAfterEveryClearTimes
         */
        public Long getOptimizeTableAfterEveryClearTimes() {
            return this.optimizeTableAfterEveryClearTimes;
        }

        public static final class Builder {
            private String cronCallTimes; 
            private String cronFormat; 
            private String cronLastCallStartTime; 
            private String cronNextCallTime; 
            private String cronStatus; 
            private Long currentClearTaskCount; 
            private String duration; 
            private Long optimizeTableAfterEveryClearTimes; 

            /**
             * The number of times that the task is run.
             */
            public Builder cronCallTimes(String cronCallTimes) {
                this.cronCallTimes = cronCallTimes;
                return this;
            }

            /**
             * The crontab expression that you can use to run the task at a specified time. For more information, see [Crontab expression](~~206581~~).
             */
            public Builder cronFormat(String cronFormat) {
                this.cronFormat = cronFormat;
                return this;
            }

            /**
             * The time when the task was last run.
             */
            public Builder cronLastCallStartTime(String cronLastCallStartTime) {
                this.cronLastCallStartTime = cronLastCallStartTime;
                return this;
            }

            /**
             * The time when the task is run next time. This parameter is displayed only when the status of the scheduled task is SUCCESS.
             */
            public Builder cronNextCallTime(String cronNextCallTime) {
                this.cronNextCallTime = cronNextCallTime;
                return this;
            }

            /**
             * The status of the scheduled task. If this parameter is empty, it indicates the task is not run. Valid values:
             * <p>
             * 
             * *   PAUSE: The task is suspended.
             * *   WAITING: The task is waiting to be run.
             * *   SUCCESS: The task is complete.
             */
            public Builder cronStatus(String cronStatus) {
                this.cronStatus = cronStatus;
                return this;
            }

            /**
             * The number of times that the Optimize Table statement is automatically exeuted. This parameter is valid only when the value of the OptimizeTableAfterEveryClearTimes parameter is greater than 0.
             */
            public Builder currentClearTaskCount(Long currentClearTaskCount) {
                this.currentClearTaskCount = currentClearTaskCount;
                return this;
            }

            /**
             * The execution duration of the task. Unit: hours. If the value is 0, it indicates the duration is not specified.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Specifies whether to enable automatic execution of the OPTIMIZE TABLE statement. Valid values:
             * <p>
             * 
             * *   0: disables automatic execution
             * *   A number greater than 0: enables automatic execution. The number specifies the number of times that cleanup operations must be performed before the OPTIMIZE TABLE statement is automatically executed.
             */
            public Builder optimizeTableAfterEveryClearTimes(Long optimizeTableAfterEveryClearTimes) {
                this.optimizeTableAfterEveryClearTimes = optimizeTableAfterEveryClearTimes;
                return this;
            }

            public DataCronClearConfig build() {
                return new DataCronClearConfig(this);
            } 

        } 

    }
}
