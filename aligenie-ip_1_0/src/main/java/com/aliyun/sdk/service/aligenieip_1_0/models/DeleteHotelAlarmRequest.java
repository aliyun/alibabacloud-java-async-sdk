// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link DeleteHotelAlarmRequest} extends {@link RequestModel}
 *
 * <p>DeleteHotelAlarmRequest</p>
 */
public class DeleteHotelAlarmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Alarms")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Alarms> alarms;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<Alarms> getAlarms() {
        return this.alarms;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    public static final class Builder extends Request.Builder<DeleteHotelAlarmRequest, Builder> {
        private java.util.List<Alarms> alarms; 
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
         * <p>This parameter is required.</p>
         */
        public Builder alarms(java.util.List<Alarms> alarms) {
            String alarmsShrink = shrink(alarms, "Alarms", "json");
            this.putBodyParameter("Alarms", alarmsShrink);
            this.alarms = alarms;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a7***83</p>
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

    /**
     * 
     * {@link DeleteHotelAlarmRequest} extends {@link TeaModel}
     *
     * <p>DeleteHotelAlarmRequest</p>
     */
    public static class Alarms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long alarmId;

        @com.aliyun.core.annotation.NameInMap("DeviceOpenId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deviceOpenId;

        @com.aliyun.core.annotation.NameInMap("RoomNo")
        private String roomNo;

        @com.aliyun.core.annotation.NameInMap("UserOpenId")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Alarms model) {
                this.alarmId = model.alarmId;
                this.deviceOpenId = model.deviceOpenId;
                this.roomNo = model.roomNo;
                this.userOpenId = model.userOpenId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>5029</p>
             */
            public Builder alarmId(Long alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PvkB***TA==</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mgw/k***HQd</p>
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
