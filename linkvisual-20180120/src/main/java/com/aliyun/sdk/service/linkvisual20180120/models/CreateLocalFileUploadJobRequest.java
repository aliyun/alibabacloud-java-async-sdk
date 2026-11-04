// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link CreateLocalFileUploadJobRequest} extends {@link RequestModel}
 *
 * <p>CreateLocalFileUploadJobRequest</p>
 */
public class CreateLocalFileUploadJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeSlot")
    private java.util.List<TimeSlot> timeSlot;

    private CreateLocalFileUploadJobRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.timeSlot = builder.timeSlot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLocalFileUploadJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return timeSlot
     */
    public java.util.List<TimeSlot> getTimeSlot() {
        return this.timeSlot;
    }

    public static final class Builder extends Request.Builder<CreateLocalFileUploadJobRequest, Builder> {
        private String iotInstanceId; 
        private java.util.List<TimeSlot> timeSlot; 

        private Builder() {
            super();
        } 

        private Builder(CreateLocalFileUploadJobRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.timeSlot = request.timeSlot;
        } 

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>If the instance has an ID, you must specify the ID. Otherwise, the call fails.</li>
         * <li>If the instance does not have an &lt;props=&quot;intl&quot;&gt;<ph><strong>Instance Overview</strong> page or </ph>ID, you do not need to specify this parameter.</li>
         * </ul>
         * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-n6w1y59****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The list of time slots.</p>
         */
        public Builder timeSlot(java.util.List<TimeSlot> timeSlot) {
            this.putQueryParameter("TimeSlot", timeSlot);
            this.timeSlot = timeSlot;
            return this;
        }

        @Override
        public CreateLocalFileUploadJobRequest build() {
            return new CreateLocalFileUploadJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLocalFileUploadJobRequest} extends {@link TeaModel}
     *
     * <p>CreateLocalFileUploadJobRequest</p>
     */
    public static class TimeSlot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer startTime;

        private TimeSlot(Builder builder) {
            this.deviceName = builder.deviceName;
            this.endTime = builder.endTime;
            this.iotId = builder.iotId;
            this.productKey = builder.productKey;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSlot create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String deviceName; 
            private Integer endTime; 
            private String iotId; 
            private String productKey; 
            private Integer startTime; 

            private Builder() {
            } 

            private Builder(TimeSlot model) {
                this.deviceName = model.deviceName;
                this.endTime = model.endTime;
                this.iotId = model.iotId;
                this.productKey = model.productKey;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The name of the video device.
             * You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
             * <blockquote>
             * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>camera1</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The end time for uploading the local video recording. The time is a 10-digit UNIX timestamp in seconds.</p>
             * <blockquote>
             * <p>The maximum time range for a single local video recording upload job is 1 hour.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1631019775</p>
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the video device. The ID is issued by IoT Platform and uniquely identifies the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the ID.</p>
             * <blockquote>
             * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> uniquely identifies the device and has a one-to-one mapping with the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>d7XmBoJhAr88C6PelXDF00****</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The ProductKey of the product to which the video device belongs.
             * You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information about all products under the current account.</p>
             * <blockquote>
             * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The start time for uploading the local video recording. The time is a 10-digit UNIX timestamp in seconds.</p>
             * <blockquote>
             * <p>The maximum time range for a single local video recording upload job is 1 hour.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1631019675</p>
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimeSlot build() {
                return new TimeSlot(this);
            } 

        } 

    }
}
