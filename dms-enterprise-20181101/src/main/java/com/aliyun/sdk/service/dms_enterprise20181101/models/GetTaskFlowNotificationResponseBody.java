// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetTaskFlowNotificationResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskFlowNotificationResponseBody</p>
 */
public class GetTaskFlowNotificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code returned if the request failed.</p>
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
         * <p>The notification settings specified by the user.</p>
         */
        public Builder notification(Notification notification) {
            this.notification = notification;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F19D575F-EBEA-5683-AFA3-A8F6D9A7DE03</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTaskFlowNotificationResponseBody build() {
            return new GetTaskFlowNotificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskFlowNotificationResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskFlowNotificationResponseBody</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagNotificationFail")
        private Boolean dagNotificationFail;

        @com.aliyun.core.annotation.NameInMap("DagNotificationSla")
        private Boolean dagNotificationSla;

        @com.aliyun.core.annotation.NameInMap("DagNotificationSuccess")
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
             * <p>Indicates whether notifications for failed task flows are enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dagNotificationFail(Boolean dagNotificationFail) {
                this.dagNotificationFail = dagNotificationFail;
                return this;
            }

            /**
             * <p>Indicates whether service level agreement (SLA) global notifications for task flows are enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dagNotificationSla(Boolean dagNotificationSla) {
                this.dagNotificationSla = dagNotificationSla;
                return this;
            }

            /**
             * <p>Indicates whether notifications for successful task flows are enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
