// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlarmRecordResponseBody</p>
 */
public class ListAlarmRecordResponseBody extends TeaModel {
    @NameInMap("RecordList")
    private java.util.List < RecordList> recordList;

    @NameInMap("RequestId")
    private String requestId;

    private ListAlarmRecordResponseBody(Builder builder) {
        this.recordList = builder.recordList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordList
     */
    public java.util.List < RecordList> getRecordList() {
        return this.recordList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < RecordList> recordList; 
        private String requestId; 

        /**
         * RecordList.
         */
        public Builder recordList(java.util.List < RecordList> recordList) {
            this.recordList = recordList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAlarmRecordResponseBody build() {
            return new ListAlarmRecordResponseBody(this);
        } 

    } 

    public static class RecordList extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("AlarmPointLatitude")
        private Float alarmPointLatitude;

        @NameInMap("AlarmPointLongitude")
        private Float alarmPointLongitude;

        @NameInMap("Ctime")
        private Long ctime;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("Mtime")
        private Long mtime;

        private RecordList(Builder builder) {
            this.action = builder.action;
            this.alarmPointLatitude = builder.alarmPointLatitude;
            this.alarmPointLongitude = builder.alarmPointLongitude;
            this.ctime = builder.ctime;
            this.deviceId = builder.deviceId;
            this.mtime = builder.mtime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordList create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return alarmPointLatitude
         */
        public Float getAlarmPointLatitude() {
            return this.alarmPointLatitude;
        }

        /**
         * @return alarmPointLongitude
         */
        public Float getAlarmPointLongitude() {
            return this.alarmPointLongitude;
        }

        /**
         * @return ctime
         */
        public Long getCtime() {
            return this.ctime;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return mtime
         */
        public Long getMtime() {
            return this.mtime;
        }

        public static final class Builder {
            private String action; 
            private Float alarmPointLatitude; 
            private Float alarmPointLongitude; 
            private Long ctime; 
            private String deviceId; 
            private Long mtime; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * AlarmPointLatitude.
             */
            public Builder alarmPointLatitude(Float alarmPointLatitude) {
                this.alarmPointLatitude = alarmPointLatitude;
                return this;
            }

            /**
             * AlarmPointLongitude.
             */
            public Builder alarmPointLongitude(Float alarmPointLongitude) {
                this.alarmPointLongitude = alarmPointLongitude;
                return this;
            }

            /**
             * Ctime.
             */
            public Builder ctime(Long ctime) {
                this.ctime = ctime;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Mtime.
             */
            public Builder mtime(Long mtime) {
                this.mtime = mtime;
                return this;
            }

            public RecordList build() {
                return new RecordList(this);
            } 

        } 

    }
}
