// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link GisSearchDeviceTraceResponseBody} extends {@link TeaModel}
 *
 * <p>GisSearchDeviceTraceResponseBody</p>
 */
public class GisSearchDeviceTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GisSearchDeviceTraceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GisSearchDeviceTraceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GisSearchDeviceTraceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GisSearchDeviceTraceResponseBody build() {
            return new GisSearchDeviceTraceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GisSearchDeviceTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GisSearchDeviceTraceResponseBody</p>
     */
    public static class Points extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocateTime")
        private Long locateTime;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        private Points(Builder builder) {
            this.locateTime = builder.locateTime;
            this.location = builder.location;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Points create() {
            return builder().build();
        }

        /**
         * @return locateTime
         */
        public Long getLocateTime() {
            return this.locateTime;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        public static final class Builder {
            private Long locateTime; 
            private String location; 

            private Builder() {
            } 

            private Builder(Points model) {
                this.locateTime = model.locateTime;
                this.location = model.location;
            } 

            /**
             * LocateTime.
             */
            public Builder locateTime(Long locateTime) {
                this.locateTime = locateTime;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            public Points build() {
                return new Points(this);
            } 

        } 

    }
    /**
     * 
     * {@link GisSearchDeviceTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GisSearchDeviceTraceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("Points")
        private java.util.List<Points> points;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        private Data(Builder builder) {
            this.deviceName = builder.deviceName;
            this.points = builder.points;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return points
         */
        public java.util.List<Points> getPoints() {
            return this.points;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String deviceName; 
            private java.util.List<Points> points; 
            private String productKey; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deviceName = model.deviceName;
                this.points = model.points;
                this.productKey = model.productKey;
            } 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * Points.
             */
            public Builder points(java.util.List<Points> points) {
                this.points = points;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
