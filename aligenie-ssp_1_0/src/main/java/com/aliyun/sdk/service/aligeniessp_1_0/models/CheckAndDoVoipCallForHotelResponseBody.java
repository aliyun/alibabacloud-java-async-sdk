// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link CheckAndDoVoipCallForHotelResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAndDoVoipCallForHotelResponseBody</p>
 */
public class CheckAndDoVoipCallForHotelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private CheckAndDoVoipCallForHotelResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAndDoVoipCallForHotelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(CheckAndDoVoipCallForHotelResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CheckAndDoVoipCallForHotelResponseBody build() {
            return new CheckAndDoVoipCallForHotelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckAndDoVoipCallForHotelResponseBody} extends {@link TeaModel}
     *
     * <p>CheckAndDoVoipCallForHotelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceIcon")
        private String deviceIcon;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.deviceIcon = builder.deviceIcon;
            this.deviceName = builder.deviceName;
            this.deviceType = builder.deviceType;
            this.online = builder.online;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceIcon
         */
        public String getDeviceIcon() {
            return this.deviceIcon;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String deviceIcon; 
            private String deviceName; 
            private String deviceType; 
            private Boolean online; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deviceIcon = model.deviceIcon;
                this.deviceName = model.deviceName;
                this.deviceType = model.deviceType;
                this.online = model.online;
                this.uuid = model.uuid;
            } 

            /**
             * DeviceIcon.
             */
            public Builder deviceIcon(String deviceIcon) {
                this.deviceIcon = deviceIcon;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * Online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckAndDoVoipCallForHotelResponseBody} extends {@link TeaModel}
     *
     * <p>CheckAndDoVoipCallForHotelResponseBody</p>
     */
    public static class DeviceTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        private DeviceTargets(Builder builder) {
            this.code = builder.code;
            this.data = builder.data;
            this.msg = builder.msg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceTargets create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        public static final class Builder {
            private Integer code; 
            private java.util.List<Data> data; 
            private String msg; 

            private Builder() {
            } 

            private Builder(DeviceTargets model) {
                this.code = model.code;
                this.data = model.data;
                this.msg = model.msg;
            } 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            public DeviceTargets build() {
                return new DeviceTargets(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckAndDoVoipCallForHotelResponseBody} extends {@link TeaModel}
     *
     * <p>CheckAndDoVoipCallForHotelResponseBody</p>
     */
    public static class StartCallResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RetCode")
        private Integer retCode;

        @com.aliyun.core.annotation.NameInMap("RetValue")
        private String retValue;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private StartCallResult(Builder builder) {
            this.message = builder.message;
            this.retCode = builder.retCode;
            this.retValue = builder.retValue;
            this.success = builder.success;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartCallResult create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return retCode
         */
        public Integer getRetCode() {
            return this.retCode;
        }

        /**
         * @return retValue
         */
        public String getRetValue() {
            return this.retValue;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String message; 
            private Integer retCode; 
            private String retValue; 
            private Boolean success; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(StartCallResult model) {
                this.message = model.message;
                this.retCode = model.retCode;
                this.retValue = model.retValue;
                this.success = model.success;
                this.traceId = model.traceId;
            } 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * RetCode.
             */
            public Builder retCode(Integer retCode) {
                this.retCode = retCode;
                return this;
            }

            /**
             * RetValue.
             */
            public Builder retValue(String retValue) {
                this.retValue = retValue;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public StartCallResult build() {
                return new StartCallResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckAndDoVoipCallForHotelResponseBody} extends {@link TeaModel}
     *
     * <p>CheckAndDoVoipCallForHotelResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceTargets")
        private DeviceTargets deviceTargets;

        @com.aliyun.core.annotation.NameInMap("IsStartCall")
        private Boolean isStartCall;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private Boolean passed;

        @com.aliyun.core.annotation.NameInMap("StartCallResult")
        private StartCallResult startCallResult;

        private Result(Builder builder) {
            this.deviceTargets = builder.deviceTargets;
            this.isStartCall = builder.isStartCall;
            this.passed = builder.passed;
            this.startCallResult = builder.startCallResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return deviceTargets
         */
        public DeviceTargets getDeviceTargets() {
            return this.deviceTargets;
        }

        /**
         * @return isStartCall
         */
        public Boolean getIsStartCall() {
            return this.isStartCall;
        }

        /**
         * @return passed
         */
        public Boolean getPassed() {
            return this.passed;
        }

        /**
         * @return startCallResult
         */
        public StartCallResult getStartCallResult() {
            return this.startCallResult;
        }

        public static final class Builder {
            private DeviceTargets deviceTargets; 
            private Boolean isStartCall; 
            private Boolean passed; 
            private StartCallResult startCallResult; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.deviceTargets = model.deviceTargets;
                this.isStartCall = model.isStartCall;
                this.passed = model.passed;
                this.startCallResult = model.startCallResult;
            } 

            /**
             * DeviceTargets.
             */
            public Builder deviceTargets(DeviceTargets deviceTargets) {
                this.deviceTargets = deviceTargets;
                return this;
            }

            /**
             * IsStartCall.
             */
            public Builder isStartCall(Boolean isStartCall) {
                this.isStartCall = isStartCall;
                return this;
            }

            /**
             * Passed.
             */
            public Builder passed(Boolean passed) {
                this.passed = passed;
                return this;
            }

            /**
             * StartCallResult.
             */
            public Builder startCallResult(StartCallResult startCallResult) {
                this.startCallResult = startCallResult;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
