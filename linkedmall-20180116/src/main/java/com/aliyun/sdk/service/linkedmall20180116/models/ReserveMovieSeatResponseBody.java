// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ReserveMovieSeatResponseBody} extends {@link TeaModel}
 *
 * <p>ReserveMovieSeatResponseBody</p>
 */
public class ReserveMovieSeatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReservedSeat")
    private ReservedSeat reservedSeat;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReserveMovieSeatResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.reservedSeat = builder.reservedSeat;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReserveMovieSeatResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
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
     * @return reservedSeat
     */
    public ReservedSeat getReservedSeat() {
        return this.reservedSeat;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private String requestId; 
        private ReservedSeat reservedSeat; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReservedSeat.
         */
        public Builder reservedSeat(ReservedSeat reservedSeat) {
            this.reservedSeat = reservedSeat;
            return this;
        }

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReserveMovieSeatResponseBody build() {
            return new ReserveMovieSeatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReserveMovieSeatResponseBody} extends {@link TeaModel}
     *
     * <p>ReserveMovieSeatResponseBody</p>
     */
    public static class ReservedSeat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyKey")
        private String applyKey;

        @com.aliyun.core.annotation.NameInMap("DefaultLockSecond")
        private Long defaultLockSecond;

        @com.aliyun.core.annotation.NameInMap("ReservedTime")
        private Long reservedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ReservedSeat(Builder builder) {
            this.applyKey = builder.applyKey;
            this.defaultLockSecond = builder.defaultLockSecond;
            this.reservedTime = builder.reservedTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservedSeat create() {
            return builder().build();
        }

        /**
         * @return applyKey
         */
        public String getApplyKey() {
            return this.applyKey;
        }

        /**
         * @return defaultLockSecond
         */
        public Long getDefaultLockSecond() {
            return this.defaultLockSecond;
        }

        /**
         * @return reservedTime
         */
        public Long getReservedTime() {
            return this.reservedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applyKey; 
            private Long defaultLockSecond; 
            private Long reservedTime; 
            private String status; 

            /**
             * ApplyKey.
             */
            public Builder applyKey(String applyKey) {
                this.applyKey = applyKey;
                return this;
            }

            /**
             * DefaultLockSecond.
             */
            public Builder defaultLockSecond(Long defaultLockSecond) {
                this.defaultLockSecond = defaultLockSecond;
                return this;
            }

            /**
             * ReservedTime.
             */
            public Builder reservedTime(Long reservedTime) {
                this.reservedTime = reservedTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReservedSeat build() {
                return new ReservedSeat(this);
            } 

        } 

    }
}
