// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSandboxRecoveryTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSandboxRecoveryTimeResponseBody</p>
 */
public class DescribeSandboxRecoveryTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private DescribeSandboxRecoveryTimeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSandboxRecoveryTimeResponseBody create() {
        return builder().build();
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
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The error code returned if the request fails.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request fails.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the request fails.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The error message returned if the request fails.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSandboxRecoveryTimeResponseBody build() {
            return new DescribeSandboxRecoveryTimeResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BackupPlanId")
        private String backupPlanId;

        @NameInMap("RecoveryBeginTime")
        private String recoveryBeginTime;

        @NameInMap("RecoveryEndTime")
        private String recoveryEndTime;

        private Data(Builder builder) {
            this.backupPlanId = builder.backupPlanId;
            this.recoveryBeginTime = builder.recoveryBeginTime;
            this.recoveryEndTime = builder.recoveryEndTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backupPlanId
         */
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        /**
         * @return recoveryBeginTime
         */
        public String getRecoveryBeginTime() {
            return this.recoveryBeginTime;
        }

        /**
         * @return recoveryEndTime
         */
        public String getRecoveryEndTime() {
            return this.recoveryEndTime;
        }

        public static final class Builder {
            private String backupPlanId; 
            private String recoveryBeginTime; 
            private String recoveryEndTime; 

            /**
             * The backup schedule of the sandbox instance.
             */
            public Builder backupPlanId(String backupPlanId) {
                this.backupPlanId = backupPlanId;
                return this;
            }

            /**
             * The beginning of the time range during which the sandbox instance can be restored. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder recoveryBeginTime(String recoveryBeginTime) {
                this.recoveryBeginTime = recoveryBeginTime;
                return this;
            }

            /**
             * The end of the time range during which the sandbox instance can be restored. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder recoveryEndTime(String recoveryEndTime) {
                this.recoveryEndTime = recoveryEndTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
