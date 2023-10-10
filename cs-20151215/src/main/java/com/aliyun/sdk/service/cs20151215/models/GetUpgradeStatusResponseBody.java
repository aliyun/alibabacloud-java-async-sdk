// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUpgradeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetUpgradeStatusResponseBody</p>
 */
public class GetUpgradeStatusResponseBody extends TeaModel {
    @NameInMap("error_message")
    private String errorMessage;

    @NameInMap("precheck_report_id")
    private String precheckReportId;

    @NameInMap("status")
    private String status;

    @NameInMap("upgrade_step")
    private String upgradeStep;

    @NameInMap("upgrade_task")
    private UpgradeTask upgradeTask;

    private GetUpgradeStatusResponseBody(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.precheckReportId = builder.precheckReportId;
        this.status = builder.status;
        this.upgradeStep = builder.upgradeStep;
        this.upgradeTask = builder.upgradeTask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUpgradeStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return precheckReportId
     */
    public String getPrecheckReportId() {
        return this.precheckReportId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return upgradeStep
     */
    public String getUpgradeStep() {
        return this.upgradeStep;
    }

    /**
     * @return upgradeTask
     */
    public UpgradeTask getUpgradeTask() {
        return this.upgradeTask;
    }

    public static final class Builder {
        private String errorMessage; 
        private String precheckReportId; 
        private String status; 
        private String upgradeStep; 
        private UpgradeTask upgradeTask; 

        /**
         * The error message returned during the update.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the precheck report.
         */
        public Builder precheckReportId(String precheckReportId) {
            this.precheckReportId = precheckReportId;
            return this;
        }

        /**
         * The status of the update. Valid values:
         * <p>
         * 
         * *   `success`: The update is successful.
         * *   `fail`: The update failed.
         * *   `pause`: The update is paused.
         * *   `running`: The update is in progress.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The current phase of the update. Valid values:
         * <p>
         * 
         * *   `not_start`: The update is not started.
         * *   `prechecking`: The precheck is in progress.
         * *   `upgrading`: The cluster is being updated.
         * *   `pause`: The update is paused.
         * *   `success`: The update is successful.
         */
        public Builder upgradeStep(String upgradeStep) {
            this.upgradeStep = upgradeStep;
            return this;
        }

        /**
         * The details of the update task.
         */
        public Builder upgradeTask(UpgradeTask upgradeTask) {
            this.upgradeTask = upgradeTask;
            return this;
        }

        public GetUpgradeStatusResponseBody build() {
            return new GetUpgradeStatusResponseBody(this);
        } 

    } 

    public static class UpgradeTask extends TeaModel {
        @NameInMap("message")
        private String message;

        @NameInMap("status")
        private String status;

        private UpgradeTask(Builder builder) {
            this.message = builder.message;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeTask create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String status; 

            /**
             * The description of the update task.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The status of the update task. Valid values:
             * <p>
             * 
             * *   `running`: The update task is being executed.
             * *   `Success`: The update task is successfully executed.
             * *   `Failed`: The update task failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public UpgradeTask build() {
                return new UpgradeTask(this);
            } 

        } 

    }
}
