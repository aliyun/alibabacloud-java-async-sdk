// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
    @com.aliyun.core.annotation.NameInMap("error_message")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("precheck_report_id")
    private String precheckReportId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("upgrade_step")
    private String upgradeStep;

    @com.aliyun.core.annotation.NameInMap("upgrade_task")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetUpgradeStatusResponseBody model) {
            this.errorMessage = model.errorMessage;
            this.precheckReportId = model.precheckReportId;
            this.status = model.status;
            this.upgradeStep = model.upgradeStep;
            this.upgradeTask = model.upgradeTask;
        } 

        /**
         * <p>The error message during the cluster upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>subject to actual return</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the precheck report.</p>
         * 
         * <strong>example:</strong>
         * <p>be4c8eb72de94d459ea7ace7c811d119</p>
         */
        public Builder precheckReportId(String precheckReportId) {
            this.precheckReportId = precheckReportId;
            return this;
        }

        /**
         * <p>The current upgrade status of the cluster. Valid values:</p>
         * <ul>
         * <li><code>success</code>: Upgrade succeeded.</li>
         * <li><code>fail</code>: Upgrade failed.</li>
         * <li><code>pause</code>: Upgrade paused.</li>
         * <li><code>running</code>: Upgrade in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The current upgrade stage of the cluster. Valid values:</p>
         * <ul>
         * <li><code>not_start</code>: Not started.</li>
         * <li><code>prechecking</code>: Prechecking.</li>
         * <li><code>upgrading</code>: Upgrading.</li>
         * <li><code>pause</code>: Paused.</li>
         * <li><code>success</code>: Upgrade succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>prechecking</p>
         */
        public Builder upgradeStep(String upgradeStep) {
            this.upgradeStep = upgradeStep;
            return this;
        }

        /**
         * <p>The details of the upgrade task.</p>
         */
        public Builder upgradeTask(UpgradeTask upgradeTask) {
            this.upgradeTask = upgradeTask;
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
    public static class UpgradeTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("status")
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

            private Builder() {
            } 

            private Builder(UpgradeTask model) {
                this.message = model.message;
                this.status = model.status;
            } 

            /**
             * <p>The description of the upgrade task.</p>
             * 
             * <strong>example:</strong>
             * <p>subject to actual return</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The status of the upgrade task. Valid values:</p>
             * <ul>
             * <li><code>running</code>: Running.</li>
             * <li><code>Success</code>: Succeeded.</li>
             * <li><code>Failed</code>: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
