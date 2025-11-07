// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeVerifyPersonasDeviceModelStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifyPersonasDeviceModelStatisticsResponseBody</p>
 */
public class DescribeVerifyPersonasDeviceModelStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeVerifyPersonasDeviceModelStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyPersonasDeviceModelStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeVerifyPersonasDeviceModelStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>026828A3-CC7E-5D85-85B6-08DF245C5A53</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Query result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeVerifyPersonasDeviceModelStatisticsResponseBody build() {
            return new DescribeVerifyPersonasDeviceModelStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifyPersonasDeviceModelStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyPersonasDeviceModelStatisticsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceCnt")
        private Long deviceCnt;

        @com.aliyun.core.annotation.NameInMap("DeviceModel")
        private String deviceModel;

        @com.aliyun.core.annotation.NameInMap("DeviceRate")
        private String deviceRate;

        private Items(Builder builder) {
            this.deviceCnt = builder.deviceCnt;
            this.deviceModel = builder.deviceModel;
            this.deviceRate = builder.deviceRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return deviceCnt
         */
        public Long getDeviceCnt() {
            return this.deviceCnt;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return deviceRate
         */
        public String getDeviceRate() {
            return this.deviceRate;
        }

        public static final class Builder {
            private Long deviceCnt; 
            private String deviceModel; 
            private String deviceRate; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.deviceCnt = model.deviceCnt;
                this.deviceModel = model.deviceModel;
                this.deviceRate = model.deviceRate;
            } 

            /**
             * <p>Number of devices.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder deviceCnt(Long deviceCnt) {
                this.deviceCnt = deviceCnt;
                return this;
            }

            /**
             * <p>Device model</p>
             * 
             * <strong>example:</strong>
             * <p>iPhone15,2</p>
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * <p>The ratio of this device model to the total number of devices.</p>
             * 
             * <strong>example:</strong>
             * <p>16.13</p>
             */
            public Builder deviceRate(String deviceRate) {
                this.deviceRate = deviceRate;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVerifyPersonasDeviceModelStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyPersonasDeviceModelStatisticsResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllDeviceCnt")
        private Long allDeviceCnt;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private ResultObject(Builder builder) {
            this.allDeviceCnt = builder.allDeviceCnt;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return allDeviceCnt
         */
        public Long getAllDeviceCnt() {
            return this.allDeviceCnt;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private Long allDeviceCnt; 
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.allDeviceCnt = model.allDeviceCnt;
                this.items = model.items;
            } 

            /**
             * <p>Total number of devices.</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder allDeviceCnt(Long allDeviceCnt) {
                this.allDeviceCnt = allDeviceCnt;
                return this;
            }

            /**
             * <p>List of data for different phone models.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
