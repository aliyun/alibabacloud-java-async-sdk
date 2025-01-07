// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TrainStopoverSearchResponseBody} extends {@link TeaModel}
 *
 * <p>TrainStopoverSearchResponseBody</p>
 */
public class TrainStopoverSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List<Module> module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TrainStopoverSearchResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainStopoverSearchResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public java.util.List<Module> getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<Module> module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>module</p>
         */
        public Builder module(java.util.List<Module> module) {
            this.module = module;
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

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>21041ce316577904808056433edbb2</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TrainStopoverSearchResponseBody build() {
            return new TrainStopoverSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TrainStopoverSearchResponseBody} extends {@link TeaModel}
     *
     * <p>TrainStopoverSearchResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("station_name")
        private String stationName;

        @com.aliyun.core.annotation.NameInMap("station_no")
        private String stationNo;

        @com.aliyun.core.annotation.NameInMap("station_type")
        private String stationType;

        @com.aliyun.core.annotation.NameInMap("stop_over_time")
        private String stopOverTime;

        private Module(Builder builder) {
            this.arrTime = builder.arrTime;
            this.depTime = builder.depTime;
            this.stationName = builder.stationName;
            this.stationNo = builder.stationNo;
            this.stationType = builder.stationType;
            this.stopOverTime = builder.stopOverTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return stationName
         */
        public String getStationName() {
            return this.stationName;
        }

        /**
         * @return stationNo
         */
        public String getStationNo() {
            return this.stationNo;
        }

        /**
         * @return stationType
         */
        public String getStationType() {
            return this.stationType;
        }

        /**
         * @return stopOverTime
         */
        public String getStopOverTime() {
            return this.stopOverTime;
        }

        public static final class Builder {
            private String arrTime; 
            private String depTime; 
            private String stationName; 
            private String stationNo; 
            private String stationType; 
            private String stopOverTime; 

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * station_name.
             */
            public Builder stationName(String stationName) {
                this.stationName = stationName;
                return this;
            }

            /**
             * station_no.
             */
            public Builder stationNo(String stationNo) {
                this.stationNo = stationNo;
                return this;
            }

            /**
             * station_type.
             */
            public Builder stationType(String stationType) {
                this.stationType = stationType;
                return this;
            }

            /**
             * stop_over_time.
             */
            public Builder stopOverTime(String stopOverTime) {
                this.stopOverTime = stopOverTime;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
