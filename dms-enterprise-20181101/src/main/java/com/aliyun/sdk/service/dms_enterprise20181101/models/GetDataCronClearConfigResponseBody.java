// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataCronClearConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCronClearConfigResponseBody</p>
 */
public class GetDataCronClearConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCronClearConfig")
    private DataCronClearConfig dataCronClearConfig;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>Data configuration.</p>
         */
        public Builder dataCronClearConfig(DataCronClearConfig dataCronClearConfig) {
            this.dataCronClearConfig = dataCronClearConfig;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>283C461F-11D8-48AA-B695-DF092DA32AF3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataCronClearConfigResponseBody build() {
            return new GetDataCronClearConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataCronClearConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCronClearConfigResponseBody</p>
     */
    public static class DataCronClearConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronCallTimes")
        private String cronCallTimes;

        @com.aliyun.core.annotation.NameInMap("CronFormat")
        private String cronFormat;

        @com.aliyun.core.annotation.NameInMap("CronLastCallStartTime")
        private String cronLastCallStartTime;

        @com.aliyun.core.annotation.NameInMap("CronNextCallTime")
        private String cronNextCallTime;

        @com.aliyun.core.annotation.NameInMap("CronStatus")
        private String cronStatus;

        @com.aliyun.core.annotation.NameInMap("CurrentClearTaskCount")
        private Long currentClearTaskCount;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("OptimizeTableAfterEveryClearTimes")
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
             * <p>The number of times that the task is run.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cronCallTimes(String cronCallTimes) {
                this.cronCallTimes = cronCallTimes;
                return this;
            }

            /**
             * <p>The crontab expression that you can use to run the task at a specified time. For more information, see <a href="https://help.aliyun.com/document_detail/206581.html">Crontab expression</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 23 ? * 7,1</p>
             */
            public Builder cronFormat(String cronFormat) {
                this.cronFormat = cronFormat;
                return this;
            }

            /**
             * <p>The time when the task was last run.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-18 00:00:00</p>
             */
            public Builder cronLastCallStartTime(String cronLastCallStartTime) {
                this.cronLastCallStartTime = cronLastCallStartTime;
                return this;
            }

            /**
             * <p>The time when the task is run next time. This parameter is displayed only when the status of the scheduled task is SUCCESS.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-19 00:00:00</p>
             */
            public Builder cronNextCallTime(String cronNextCallTime) {
                this.cronNextCallTime = cronNextCallTime;
                return this;
            }

            /**
             * <p>The status of the scheduled task. If this parameter is empty, it indicates the task is not run. Valid values:</p>
             * <ul>
             * <li>PAUSE: The task is suspended.</li>
             * <li>WAITING: The task is waiting to be run.</li>
             * <li>SUCCESS: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PAUSE</p>
             */
            public Builder cronStatus(String cronStatus) {
                this.cronStatus = cronStatus;
                return this;
            }

            /**
             * <p>The number of times that the Optimize Table statement is automatically exeuted. This parameter is valid only when the value of the OptimizeTableAfterEveryClearTimes parameter is greater than 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentClearTaskCount(Long currentClearTaskCount) {
                this.currentClearTaskCount = currentClearTaskCount;
                return this;
            }

            /**
             * <p>The execution duration of the task. Unit: hours. If the value is 0, it indicates the duration is not specified.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic execution of the OPTIMIZE TABLE statement. Valid values:</p>
             * <ul>
             * <li>0: disables automatic execution</li>
             * <li>A number greater than 0: enables automatic execution. The number specifies the number of times that cleanup operations must be performed before the OPTIMIZE TABLE statement is automatically executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
