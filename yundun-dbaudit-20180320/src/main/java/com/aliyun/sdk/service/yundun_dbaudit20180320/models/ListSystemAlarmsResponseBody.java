// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link ListSystemAlarmsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemAlarmsResponseBody</p>
 */
public class ListSystemAlarmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Alarms")
    private java.util.List<Alarms> alarms;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSystemAlarmsResponseBody(Builder builder) {
        this.alarms = builder.alarms;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemAlarmsResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Alarms> alarms; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSystemAlarmsResponseBody model) {
            this.alarms = model.alarms;
            this.requestId = model.requestId;
        } 

        /**
         * Alarms.
         */
        public Builder alarms(java.util.List<Alarms> alarms) {
            this.alarms = alarms;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSystemAlarmsResponseBody build() {
            return new ListSystemAlarmsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSystemAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSystemAlarmsResponseBody</p>
     */
    public static class Alarms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmDetail")
        private String alarmDetail;

        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private Integer alarmId;

        @com.aliyun.core.annotation.NameInMap("AlarmType")
        private String alarmType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ReadMark")
        private Integer readMark;

        private Alarms(Builder builder) {
            this.alarmDetail = builder.alarmDetail;
            this.alarmId = builder.alarmId;
            this.alarmType = builder.alarmType;
            this.createTime = builder.createTime;
            this.readMark = builder.readMark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarms create() {
            return builder().build();
        }

        /**
         * @return alarmDetail
         */
        public String getAlarmDetail() {
            return this.alarmDetail;
        }

        /**
         * @return alarmId
         */
        public Integer getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return alarmType
         */
        public String getAlarmType() {
            return this.alarmType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return readMark
         */
        public Integer getReadMark() {
            return this.readMark;
        }

        public static final class Builder {
            private String alarmDetail; 
            private Integer alarmId; 
            private String alarmType; 
            private String createTime; 
            private Integer readMark; 

            private Builder() {
            } 

            private Builder(Alarms model) {
                this.alarmDetail = model.alarmDetail;
                this.alarmId = model.alarmId;
                this.alarmType = model.alarmType;
                this.createTime = model.createTime;
                this.readMark = model.readMark;
            } 

            /**
             * AlarmDetail.
             */
            public Builder alarmDetail(String alarmDetail) {
                this.alarmDetail = alarmDetail;
                return this;
            }

            /**
             * AlarmId.
             */
            public Builder alarmId(Integer alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * AlarmType.
             */
            public Builder alarmType(String alarmType) {
                this.alarmType = alarmType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ReadMark.
             */
            public Builder readMark(Integer readMark) {
                this.readMark = readMark;
                return this;
            }

            public Alarms build() {
                return new Alarms(this);
            } 

        } 

    }
}
