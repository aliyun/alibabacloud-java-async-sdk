// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceCaptureStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceCaptureStrategyResponseBody</p>
 */
public class GetDeviceCaptureStrategyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetDeviceCaptureStrategyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceCaptureStrategyResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * 错误码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 响应数据内容
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceCaptureStrategyResponseBody build() {
            return new GetDeviceCaptureStrategyResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DeviceCode")
        private String deviceCode;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("FridayCaptureStrategy")
        private String fridayCaptureStrategy;

        @NameInMap("MondayCaptureStrategy")
        private String mondayCaptureStrategy;

        @NameInMap("SaturdayCaptureStrategy")
        private String saturdayCaptureStrategy;

        @NameInMap("SundayCaptureStrategy")
        private String sundayCaptureStrategy;

        @NameInMap("ThursdayCaptureStrategy")
        private String thursdayCaptureStrategy;

        @NameInMap("TuesdayCaptureStrategy")
        private String tuesdayCaptureStrategy;

        @NameInMap("WednesdayCaptureStrategy")
        private String wednesdayCaptureStrategy;

        private Data(Builder builder) {
            this.deviceCode = builder.deviceCode;
            this.deviceType = builder.deviceType;
            this.fridayCaptureStrategy = builder.fridayCaptureStrategy;
            this.mondayCaptureStrategy = builder.mondayCaptureStrategy;
            this.saturdayCaptureStrategy = builder.saturdayCaptureStrategy;
            this.sundayCaptureStrategy = builder.sundayCaptureStrategy;
            this.thursdayCaptureStrategy = builder.thursdayCaptureStrategy;
            this.tuesdayCaptureStrategy = builder.tuesdayCaptureStrategy;
            this.wednesdayCaptureStrategy = builder.wednesdayCaptureStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceCode
         */
        public String getDeviceCode() {
            return this.deviceCode;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return fridayCaptureStrategy
         */
        public String getFridayCaptureStrategy() {
            return this.fridayCaptureStrategy;
        }

        /**
         * @return mondayCaptureStrategy
         */
        public String getMondayCaptureStrategy() {
            return this.mondayCaptureStrategy;
        }

        /**
         * @return saturdayCaptureStrategy
         */
        public String getSaturdayCaptureStrategy() {
            return this.saturdayCaptureStrategy;
        }

        /**
         * @return sundayCaptureStrategy
         */
        public String getSundayCaptureStrategy() {
            return this.sundayCaptureStrategy;
        }

        /**
         * @return thursdayCaptureStrategy
         */
        public String getThursdayCaptureStrategy() {
            return this.thursdayCaptureStrategy;
        }

        /**
         * @return tuesdayCaptureStrategy
         */
        public String getTuesdayCaptureStrategy() {
            return this.tuesdayCaptureStrategy;
        }

        /**
         * @return wednesdayCaptureStrategy
         */
        public String getWednesdayCaptureStrategy() {
            return this.wednesdayCaptureStrategy;
        }

        public static final class Builder {
            private String deviceCode; 
            private String deviceType; 
            private String fridayCaptureStrategy; 
            private String mondayCaptureStrategy; 
            private String saturdayCaptureStrategy; 
            private String sundayCaptureStrategy; 
            private String thursdayCaptureStrategy; 
            private String tuesdayCaptureStrategy; 
            private String wednesdayCaptureStrategy; 

            /**
             * 设备通道
             */
            public Builder deviceCode(String deviceCode) {
                this.deviceCode = deviceCode;
                return this;
            }

            /**
             * 设备类型
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * 星期五抓取策略
             */
            public Builder fridayCaptureStrategy(String fridayCaptureStrategy) {
                this.fridayCaptureStrategy = fridayCaptureStrategy;
                return this;
            }

            /**
             * 星期一抓取策略
             */
            public Builder mondayCaptureStrategy(String mondayCaptureStrategy) {
                this.mondayCaptureStrategy = mondayCaptureStrategy;
                return this;
            }

            /**
             * 星期六抓取策略
             */
            public Builder saturdayCaptureStrategy(String saturdayCaptureStrategy) {
                this.saturdayCaptureStrategy = saturdayCaptureStrategy;
                return this;
            }

            /**
             * 星期日抓取策略
             */
            public Builder sundayCaptureStrategy(String sundayCaptureStrategy) {
                this.sundayCaptureStrategy = sundayCaptureStrategy;
                return this;
            }

            /**
             * 星期四抓取策略
             */
            public Builder thursdayCaptureStrategy(String thursdayCaptureStrategy) {
                this.thursdayCaptureStrategy = thursdayCaptureStrategy;
                return this;
            }

            /**
             * 星期二抓取策略
             */
            public Builder tuesdayCaptureStrategy(String tuesdayCaptureStrategy) {
                this.tuesdayCaptureStrategy = tuesdayCaptureStrategy;
                return this;
            }

            /**
             * 星期三抓取策略
             */
            public Builder wednesdayCaptureStrategy(String wednesdayCaptureStrategy) {
                this.wednesdayCaptureStrategy = wednesdayCaptureStrategy;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
