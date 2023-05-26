// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskFlowNotificationResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskFlowNotificationResponseBody</p>
 */
public class GetTaskFlowNotificationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Notification")
    private Notification notification;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetTaskFlowNotificationResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.notification = builder.notification;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskFlowNotificationResponseBody create() {
        return builder().build();
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
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
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
        private String errorCode; 
        private String errorMessage; 
        private Notification notification; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned if the request failed.
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
         * The notification settings specified by the user.
         */
        public Builder notification(Notification notification) {
            this.notification = notification;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTaskFlowNotificationResponseBody build() {
            return new GetTaskFlowNotificationResponseBody(this);
        } 

    } 

    public static class Notification extends TeaModel {
        @NameInMap("DagNotificationFail")
        private Boolean dagNotificationFail;

        @NameInMap("DagNotificationSla")
        private Boolean dagNotificationSla;

        @NameInMap("DagNotificationSuccess")
        private Boolean dagNotificationSuccess;

        private Notification(Builder builder) {
            this.dagNotificationFail = builder.dagNotificationFail;
            this.dagNotificationSla = builder.dagNotificationSla;
            this.dagNotificationSuccess = builder.dagNotificationSuccess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notification create() {
            return builder().build();
        }

        /**
         * @return dagNotificationFail
         */
        public Boolean getDagNotificationFail() {
            return this.dagNotificationFail;
        }

        /**
         * @return dagNotificationSla
         */
        public Boolean getDagNotificationSla() {
            return this.dagNotificationSla;
        }

        /**
         * @return dagNotificationSuccess
         */
        public Boolean getDagNotificationSuccess() {
            return this.dagNotificationSuccess;
        }

        public static final class Builder {
            private Boolean dagNotificationFail; 
            private Boolean dagNotificationSla; 
            private Boolean dagNotificationSuccess; 

            /**
             * Indicates whether notifications for failed task flows are enabled. Valid values:
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder dagNotificationFail(Boolean dagNotificationFail) {
                this.dagNotificationFail = dagNotificationFail;
                return this;
            }

            /**
             * Indicates whether service level agreement (SLA) global notifications for task flows are enabled. Valid values:
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder dagNotificationSla(Boolean dagNotificationSla) {
                this.dagNotificationSla = dagNotificationSla;
                return this;
            }

            /**
             * Indicates whether notifications for successful task flows are enabled. Valid values:
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder dagNotificationSuccess(Boolean dagNotificationSuccess) {
                this.dagNotificationSuccess = dagNotificationSuccess;
                return this;
            }

            public Notification build() {
                return new Notification(this);
            } 

        } 

    }
}
