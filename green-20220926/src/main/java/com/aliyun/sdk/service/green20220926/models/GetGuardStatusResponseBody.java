// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetGuardStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetGuardStatusResponseBody</p>
 */
public class GetGuardStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogScanStatus")
    private java.util.List<LogScanStatus> logScanStatus;

    @com.aliyun.core.annotation.NameInMap("ProtectionStatus")
    private java.util.List<ProtectionStatus> protectionStatus;

    @com.aliyun.core.annotation.NameInMap("RealTimeStatus")
    private java.util.List<RealTimeStatus> realTimeStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetGuardStatusResponseBody(Builder builder) {
        this.logScanStatus = builder.logScanStatus;
        this.protectionStatus = builder.protectionStatus;
        this.realTimeStatus = builder.realTimeStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGuardStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logScanStatus
     */
    public java.util.List<LogScanStatus> getLogScanStatus() {
        return this.logScanStatus;
    }

    /**
     * @return protectionStatus
     */
    public java.util.List<ProtectionStatus> getProtectionStatus() {
        return this.protectionStatus;
    }

    /**
     * @return realTimeStatus
     */
    public java.util.List<RealTimeStatus> getRealTimeStatus() {
        return this.realTimeStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<LogScanStatus> logScanStatus; 
        private java.util.List<ProtectionStatus> protectionStatus; 
        private java.util.List<RealTimeStatus> realTimeStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGuardStatusResponseBody model) {
            this.logScanStatus = model.logScanStatus;
            this.protectionStatus = model.protectionStatus;
            this.realTimeStatus = model.realTimeStatus;
            this.requestId = model.requestId;
        } 

        /**
         * LogScanStatus.
         */
        public Builder logScanStatus(java.util.List<LogScanStatus> logScanStatus) {
            this.logScanStatus = logScanStatus;
            return this;
        }

        /**
         * ProtectionStatus.
         */
        public Builder protectionStatus(java.util.List<ProtectionStatus> protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        /**
         * RealTimeStatus.
         */
        public Builder realTimeStatus(java.util.List<RealTimeStatus> realTimeStatus) {
            this.realTimeStatus = realTimeStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGuardStatusResponseBody build() {
            return new GetGuardStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGuardStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetGuardStatusResponseBody</p>
     */
    public static class LogScanStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private LogScanStatus(Builder builder) {
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogScanStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(LogScanStatus model) {
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LogScanStatus build() {
                return new LogScanStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGuardStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetGuardStatusResponseBody</p>
     */
    public static class ProtectionStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ProtectionStatus(Builder builder) {
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtectionStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(ProtectionStatus model) {
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ProtectionStatus build() {
                return new ProtectionStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGuardStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetGuardStatusResponseBody</p>
     */
    public static class RealTimeStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RealTimeStatus(Builder builder) {
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTimeStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(RealTimeStatus model) {
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RealTimeStatus build() {
                return new RealTimeStatus(this);
            } 

        } 

    }
}
