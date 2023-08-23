// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHotelAlarmRequest} extends {@link RequestModel}
 *
 * <p>DeleteHotelAlarmRequest</p>
 */
public class DeleteHotelAlarmRequest extends Request {
    @Body
    @NameInMap("Alarms")
    @Validation(required = true)
    private java.util.List < Alarms> alarms;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    private DeleteHotelAlarmRequest(Builder builder) {
        super(builder);
        this.alarms = builder.alarms;
        this.hotelId = builder.hotelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHotelAlarmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarms
     */
    public java.util.List < Alarms> getAlarms() {
        return this.alarms;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    public static final class Builder extends Request.Builder<DeleteHotelAlarmRequest, Builder> {
        private java.util.List < Alarms> alarms; 
        private String hotelId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHotelAlarmRequest request) {
            super(request);
            this.alarms = request.alarms;
            this.hotelId = request.hotelId;
        } 

        /**
         * Alarms.
         */
        public Builder alarms(java.util.List < Alarms> alarms) {
            String alarmsShrink = shrink(alarms, "Alarms", "json");
            this.putBodyParameter("Alarms", alarmsShrink);
            this.alarms = alarms;
            return this;
        }

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        @Override
        public DeleteHotelAlarmRequest build() {
            return new DeleteHotelAlarmRequest(this);
        } 

    } 

    public static class Alarms extends TeaModel {
        @NameInMap("AlarmId")
        @Validation(required = true)
        private Long alarmId;

        @NameInMap("DeviceOpenId")
        @Validation(required = true)
        private String deviceOpenId;

        @NameInMap("RoomNo")
        private String roomNo;

        @NameInMap("UserOpenId")
        @Validation(required = true)
        private String userOpenId;

        private Alarms(Builder builder) {
            this.alarmId = builder.alarmId;
            this.deviceOpenId = builder.deviceOpenId;
            this.roomNo = builder.roomNo;
            this.userOpenId = builder.userOpenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarms create() {
            return builder().build();
        }

        /**
         * @return alarmId
         */
        public Long getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return deviceOpenId
         */
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return userOpenId
         */
        public String getUserOpenId() {
            return this.userOpenId;
        }

        public static final class Builder {
            private Long alarmId; 
            private String deviceOpenId; 
            private String roomNo; 
            private String userOpenId; 

            /**
             * AlarmId.
             */
            public Builder alarmId(Long alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * DeviceOpenId.
             */
            public Builder deviceOpenId(String deviceOpenId) {
                this.deviceOpenId = deviceOpenId;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * UserOpenId.
             */
            public Builder userOpenId(String userOpenId) {
                this.userOpenId = userOpenId;
                return this;
            }

            public Alarms build() {
                return new Alarms(this);
            } 

        } 

    }
}
