// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogVMDeployMachineResponseBody} extends {@link TeaModel}
 *
 * <p>LogVMDeployMachineResponseBody</p>
 */
public class LogVMDeployMachineResponseBody extends TeaModel {
    @NameInMap("deployMachineLog")
    private DeployMachineLog deployMachineLog;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private LogVMDeployMachineResponseBody(Builder builder) {
        this.deployMachineLog = builder.deployMachineLog;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogVMDeployMachineResponseBody create() {
        return builder().build();
    }

    /**
     * @return deployMachineLog
     */
    public DeployMachineLog getDeployMachineLog() {
        return this.deployMachineLog;
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
        private DeployMachineLog deployMachineLog; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * deployMachineLog.
         */
        public Builder deployMachineLog(DeployMachineLog deployMachineLog) {
            this.deployMachineLog = deployMachineLog;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public LogVMDeployMachineResponseBody build() {
            return new LogVMDeployMachineResponseBody(this);
        } 

    } 

    public static class DeployMachineLog extends TeaModel {
        @NameInMap("aliyunRegion")
        private String aliyunRegion;

        @NameInMap("deployBeginTime")
        private Long deployBeginTime;

        @NameInMap("deployEndTime")
        private Long deployEndTime;

        @NameInMap("deployLog")
        private String deployLog;

        @NameInMap("deployLogPath")
        private String deployLogPath;

        private DeployMachineLog(Builder builder) {
            this.aliyunRegion = builder.aliyunRegion;
            this.deployBeginTime = builder.deployBeginTime;
            this.deployEndTime = builder.deployEndTime;
            this.deployLog = builder.deployLog;
            this.deployLogPath = builder.deployLogPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployMachineLog create() {
            return builder().build();
        }

        /**
         * @return aliyunRegion
         */
        public String getAliyunRegion() {
            return this.aliyunRegion;
        }

        /**
         * @return deployBeginTime
         */
        public Long getDeployBeginTime() {
            return this.deployBeginTime;
        }

        /**
         * @return deployEndTime
         */
        public Long getDeployEndTime() {
            return this.deployEndTime;
        }

        /**
         * @return deployLog
         */
        public String getDeployLog() {
            return this.deployLog;
        }

        /**
         * @return deployLogPath
         */
        public String getDeployLogPath() {
            return this.deployLogPath;
        }

        public static final class Builder {
            private String aliyunRegion; 
            private Long deployBeginTime; 
            private Long deployEndTime; 
            private String deployLog; 
            private String deployLogPath; 

            /**
             * aliyunRegion.
             */
            public Builder aliyunRegion(String aliyunRegion) {
                this.aliyunRegion = aliyunRegion;
                return this;
            }

            /**
             * deployBeginTime.
             */
            public Builder deployBeginTime(Long deployBeginTime) {
                this.deployBeginTime = deployBeginTime;
                return this;
            }

            /**
             * deployEndTime.
             */
            public Builder deployEndTime(Long deployEndTime) {
                this.deployEndTime = deployEndTime;
                return this;
            }

            /**
             * deployLog.
             */
            public Builder deployLog(String deployLog) {
                this.deployLog = deployLog;
                return this;
            }

            /**
             * deployLogPath.
             */
            public Builder deployLogPath(String deployLogPath) {
                this.deployLogPath = deployLogPath;
                return this;
            }

            public DeployMachineLog build() {
                return new DeployMachineLog(this);
            } 

        } 

    }
}
