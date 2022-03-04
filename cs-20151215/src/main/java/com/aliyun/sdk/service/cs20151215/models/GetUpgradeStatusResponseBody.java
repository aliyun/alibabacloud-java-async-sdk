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
         * The error message during Cluster Upgrade.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the precheck.
         */
        public Builder precheckReportId(String precheckReportId) {
            this.precheckReportId = precheckReportId;
            return this;
        }

        /**
         * The status of the cluster upgrade. Valid values:
         * <p>
         * 
         * -"success": the upgrade is successful.
         * -"fail": the upgrade failed.
         * -"pause": the upgrade is suspended.
         * -"running": the upgrade is in progress.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The current upgrade stage of the cluster. Valid values:
         * <p>
         * 
         * -"Not_start": not started yet.
         * -"prechecking": precheck.
         * -"Renewing": upgrading.
         * -"pause": paused.
         * -"success": the upgrade is successful.
         */
        public Builder upgradeStep(String upgradeStep) {
            this.upgradeStep = upgradeStep;
            return this;
        }

        /**
         * The details of the upgrade task.
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
        @NameInMap("status")
        private String status;

        @NameInMap("message")
        private String message;

        private UpgradeTask(Builder builder) {
            this.status = builder.status;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeTask create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String status; 
            private String message; 

            /**
             * The status of the upgrade task. Valid values:
             * <p>
             * 
             * -"running": running.
             * -"Success": successful execution.
             * -"Failed": The execution failed.
             * 
             * 
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The description of the upgrade task.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public UpgradeTask build() {
                return new UpgradeTask(this);
            } 

        } 

    }
}
