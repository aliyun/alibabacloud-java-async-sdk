// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetContextDatabaseSyncJobReadinessResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextDatabaseSyncJobReadinessResponseBody</p>
 */
public class GetContextDatabaseSyncJobReadinessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetContextDatabaseSyncJobReadinessResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextDatabaseSyncJobReadinessResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetContextDatabaseSyncJobReadinessResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetContextDatabaseSyncJobReadinessResponseBody build() {
            return new GetContextDatabaseSyncJobReadinessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContextDatabaseSyncJobReadinessResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextDatabaseSyncJobReadinessResponseBody</p>
     */
    public static class Checks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionReady")
        private Boolean connectionReady;

        @com.aliyun.core.annotation.NameInMap("JobEnabled")
        private Boolean jobEnabled;

        @com.aliyun.core.annotation.NameInMap("ScheduleConfigured")
        private Boolean scheduleConfigured;

        @com.aliyun.core.annotation.NameInMap("ScheduleNotAutoPaused")
        private Boolean scheduleNotAutoPaused;

        @com.aliyun.core.annotation.NameInMap("SelectionConfirmed")
        private Boolean selectionConfirmed;

        @com.aliyun.core.annotation.NameInMap("TargetReady")
        private Boolean targetReady;

        private Checks(Builder builder) {
            this.connectionReady = builder.connectionReady;
            this.jobEnabled = builder.jobEnabled;
            this.scheduleConfigured = builder.scheduleConfigured;
            this.scheduleNotAutoPaused = builder.scheduleNotAutoPaused;
            this.selectionConfirmed = builder.selectionConfirmed;
            this.targetReady = builder.targetReady;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Checks create() {
            return builder().build();
        }

        /**
         * @return connectionReady
         */
        public Boolean getConnectionReady() {
            return this.connectionReady;
        }

        /**
         * @return jobEnabled
         */
        public Boolean getJobEnabled() {
            return this.jobEnabled;
        }

        /**
         * @return scheduleConfigured
         */
        public Boolean getScheduleConfigured() {
            return this.scheduleConfigured;
        }

        /**
         * @return scheduleNotAutoPaused
         */
        public Boolean getScheduleNotAutoPaused() {
            return this.scheduleNotAutoPaused;
        }

        /**
         * @return selectionConfirmed
         */
        public Boolean getSelectionConfirmed() {
            return this.selectionConfirmed;
        }

        /**
         * @return targetReady
         */
        public Boolean getTargetReady() {
            return this.targetReady;
        }

        public static final class Builder {
            private Boolean connectionReady; 
            private Boolean jobEnabled; 
            private Boolean scheduleConfigured; 
            private Boolean scheduleNotAutoPaused; 
            private Boolean selectionConfirmed; 
            private Boolean targetReady; 

            private Builder() {
            } 

            private Builder(Checks model) {
                this.connectionReady = model.connectionReady;
                this.jobEnabled = model.jobEnabled;
                this.scheduleConfigured = model.scheduleConfigured;
                this.scheduleNotAutoPaused = model.scheduleNotAutoPaused;
                this.selectionConfirmed = model.selectionConfirmed;
                this.targetReady = model.targetReady;
            } 

            /**
             * <p>Indicates whether the data source is ready.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder connectionReady(Boolean connectionReady) {
                this.connectionReady = connectionReady;
                return this;
            }

            /**
             * <p>Indicates whether the import task is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder jobEnabled(Boolean jobEnabled) {
                this.jobEnabled = jobEnabled;
                return this;
            }

            /**
             * <p>Indicates whether scheduling is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder scheduleConfigured(Boolean scheduleConfigured) {
                this.scheduleConfigured = scheduleConfigured;
                return this;
            }

            /**
             * <p>Indicates whether scheduling is not automatically paused.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder scheduleNotAutoPaused(Boolean scheduleNotAutoPaused) {
                this.scheduleNotAutoPaused = scheduleNotAutoPaused;
                return this;
            }

            /**
             * <p>Indicates whether the selection is confirmed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder selectionConfirmed(Boolean selectionConfirmed) {
                this.selectionConfirmed = selectionConfirmed;
                return this;
            }

            /**
             * <p>Indicates whether the target is ready.</p>
             */
            public Builder targetReady(Boolean targetReady) {
                this.targetReady = targetReady;
                return this;
            }

            public Checks build() {
                return new Checks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextDatabaseSyncJobReadinessResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextDatabaseSyncJobReadinessResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPauseReason")
        private String autoPauseReason;

        @com.aliyun.core.annotation.NameInMap("Checks")
        private Checks checks;

        @com.aliyun.core.annotation.NameInMap("Ready")
        private Boolean ready;

        @com.aliyun.core.annotation.NameInMap("ReadyForManualRun")
        private Boolean readyForManualRun;

        @com.aliyun.core.annotation.NameInMap("ReadyForScheduledRun")
        private Boolean readyForScheduledRun;

        private Data(Builder builder) {
            this.autoPauseReason = builder.autoPauseReason;
            this.checks = builder.checks;
            this.ready = builder.ready;
            this.readyForManualRun = builder.readyForManualRun;
            this.readyForScheduledRun = builder.readyForScheduledRun;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoPauseReason
         */
        public String getAutoPauseReason() {
            return this.autoPauseReason;
        }

        /**
         * @return checks
         */
        public Checks getChecks() {
            return this.checks;
        }

        /**
         * @return ready
         */
        public Boolean getReady() {
            return this.ready;
        }

        /**
         * @return readyForManualRun
         */
        public Boolean getReadyForManualRun() {
            return this.readyForManualRun;
        }

        /**
         * @return readyForScheduledRun
         */
        public Boolean getReadyForScheduledRun() {
            return this.readyForScheduledRun;
        }

        public static final class Builder {
            private String autoPauseReason; 
            private Checks checks; 
            private Boolean ready; 
            private Boolean readyForManualRun; 
            private Boolean readyForScheduledRun; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoPauseReason = model.autoPauseReason;
                this.checks = model.checks;
                this.ready = model.ready;
                this.readyForManualRun = model.readyForManualRun;
                this.readyForScheduledRun = model.readyForScheduledRun;
            } 

            /**
             * <p>The reason for the automatic pause.</p>
             * 
             * <strong>example:</strong>
             * <p>Three consecutive execution failures</p>
             */
            public Builder autoPauseReason(String autoPauseReason) {
                this.autoPauseReason = autoPauseReason;
                return this;
            }

            /**
             * <p>The summary of check items.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;jobEnabled&quot;:true,&quot;connectionReady&quot;:true,&quot;selectionConfirmed&quot;:true,&quot;scheduleConfigured&quot;:true,&quot;scheduleNotAutoPaused&quot;:true}</p>
             */
            public Builder checks(Checks checks) {
                this.checks = checks;
                return this;
            }

            /**
             * <p>Indicates whether the task is ready.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ready(Boolean ready) {
                this.ready = ready;
                return this;
            }

            /**
             * <p>Indicates whether the task is ready for a manual run.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder readyForManualRun(Boolean readyForManualRun) {
                this.readyForManualRun = readyForManualRun;
                return this;
            }

            /**
             * <p>Indicates whether the task is ready for a scheduled run.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder readyForScheduledRun(Boolean readyForScheduledRun) {
                this.readyForScheduledRun = readyForScheduledRun;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
