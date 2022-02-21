// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLocalFileUploadJobRequest} extends {@link RequestModel}
 *
 * <p>CreateLocalFileUploadJobRequest</p>
 */
public class CreateLocalFileUploadJobRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("TimeSlot")
    private java.util.List < TimeSlot> timeSlot;

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
    public java.util.List < TimeSlot> getTimeSlot() {
        return this.timeSlot;
    }

    public static final class Builder extends Request.Builder<CreateLocalFileUploadJobRequest, Builder> {
        private String iotInstanceId; 
        private java.util.List < TimeSlot> timeSlot; 

        private Builder() {
            super();
        } 

        private Builder(CreateLocalFileUploadJobRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.timeSlot = response.timeSlot;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * TimeSlot.
         */
        public Builder timeSlot(java.util.List < TimeSlot> timeSlot) {
            this.putQueryParameter("TimeSlot", timeSlot);
            this.timeSlot = timeSlot;
            return this;
        }

        @Override
        public CreateLocalFileUploadJobRequest build() {
            return new CreateLocalFileUploadJobRequest(this);
        } 

    } 

    public static class TimeSlot extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("EndTime")
        @Validation(required = true)
        private Integer endTime;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("StartTime")
        @Validation(required = true)
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

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * StartTime.
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
