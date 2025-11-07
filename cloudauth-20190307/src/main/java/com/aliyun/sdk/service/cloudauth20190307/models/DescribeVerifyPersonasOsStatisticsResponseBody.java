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
 * {@link DescribeVerifyPersonasOsStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifyPersonasOsStatisticsResponseBody</p>
 */
public class DescribeVerifyPersonasOsStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeVerifyPersonasOsStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyPersonasOsStatisticsResponseBody create() {
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

        private Builder(DescribeVerifyPersonasOsStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>123906BE-752B-51E3-A8FF-52F53B659CE6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Processing result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeVerifyPersonasOsStatisticsResponseBody build() {
            return new DescribeVerifyPersonasOsStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifyPersonasOsStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyPersonasOsStatisticsResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllDeviceCnt")
        private Long allDeviceCnt;

        @com.aliyun.core.annotation.NameInMap("DeviceAndroidCnt")
        private Long deviceAndroidCnt;

        @com.aliyun.core.annotation.NameInMap("DeviceAndroidRate")
        private String deviceAndroidRate;

        @com.aliyun.core.annotation.NameInMap("DeviceIosCnt")
        private Long deviceIosCnt;

        @com.aliyun.core.annotation.NameInMap("DeviceIosRate")
        private String deviceIosRate;

        private ResultObject(Builder builder) {
            this.allDeviceCnt = builder.allDeviceCnt;
            this.deviceAndroidCnt = builder.deviceAndroidCnt;
            this.deviceAndroidRate = builder.deviceAndroidRate;
            this.deviceIosCnt = builder.deviceIosCnt;
            this.deviceIosRate = builder.deviceIosRate;
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
         * @return deviceAndroidCnt
         */
        public Long getDeviceAndroidCnt() {
            return this.deviceAndroidCnt;
        }

        /**
         * @return deviceAndroidRate
         */
        public String getDeviceAndroidRate() {
            return this.deviceAndroidRate;
        }

        /**
         * @return deviceIosCnt
         */
        public Long getDeviceIosCnt() {
            return this.deviceIosCnt;
        }

        /**
         * @return deviceIosRate
         */
        public String getDeviceIosRate() {
            return this.deviceIosRate;
        }

        public static final class Builder {
            private Long allDeviceCnt; 
            private Long deviceAndroidCnt; 
            private String deviceAndroidRate; 
            private Long deviceIosCnt; 
            private String deviceIosRate; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.allDeviceCnt = model.allDeviceCnt;
                this.deviceAndroidCnt = model.deviceAndroidCnt;
                this.deviceAndroidRate = model.deviceAndroidRate;
                this.deviceIosCnt = model.deviceIosCnt;
                this.deviceIosRate = model.deviceIosRate;
            } 

            /**
             * <p>Total number of authenticated devices.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder allDeviceCnt(Long allDeviceCnt) {
                this.allDeviceCnt = allDeviceCnt;
                return this;
            }

            /**
             * <p>Number of authenticated Android devices.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder deviceAndroidCnt(Long deviceAndroidCnt) {
                this.deviceAndroidCnt = deviceAndroidCnt;
                return this;
            }

            /**
             * <p>Proportion of Android devices.</p>
             * 
             * <strong>example:</strong>
             * <p>58.33</p>
             */
            public Builder deviceAndroidRate(String deviceAndroidRate) {
                this.deviceAndroidRate = deviceAndroidRate;
                return this;
            }

            /**
             * <p>Number of authenticated iOS devices.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder deviceIosCnt(Long deviceIosCnt) {
                this.deviceIosCnt = deviceIosCnt;
                return this;
            }

            /**
             * <p>Proportion of iOS devices.</p>
             * 
             * <strong>example:</strong>
             * <p>41.67</p>
             */
            public Builder deviceIosRate(String deviceIosRate) {
                this.deviceIosRate = deviceIosRate;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
