// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeVsDevicesDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsDevicesDataResponseBody</p>
 */
public class DescribeVsDevicesDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DevicesDataPerInterval")
    private DevicesDataPerInterval devicesDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVsDevicesDataResponseBody(Builder builder) {
        this.devicesDataPerInterval = builder.devicesDataPerInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsDevicesDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return devicesDataPerInterval
     */
    public DevicesDataPerInterval getDevicesDataPerInterval() {
        return this.devicesDataPerInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DevicesDataPerInterval devicesDataPerInterval; 
        private String requestId; 

        /**
         * DevicesDataPerInterval.
         */
        public Builder devicesDataPerInterval(DevicesDataPerInterval devicesDataPerInterval) {
            this.devicesDataPerInterval = devicesDataPerInterval;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVsDevicesDataResponseBody build() {
            return new DescribeVsDevicesDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVsDevicesDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsDevicesDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DevicesDataValue")
        private String devicesDataValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.devicesDataValue = builder.devicesDataValue;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return devicesDataValue
         */
        public String getDevicesDataValue() {
            return this.devicesDataValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String devicesDataValue; 
            private String timeStamp; 

            /**
             * DevicesDataValue.
             */
            public Builder devicesDataValue(String devicesDataValue) {
                this.devicesDataValue = devicesDataValue;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVsDevicesDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsDevicesDataResponseBody</p>
     */
    public static class DevicesDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private DevicesDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DevicesDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List<DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List<DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public DevicesDataPerInterval build() {
                return new DevicesDataPerInterval(this);
            } 

        } 

    }
}
