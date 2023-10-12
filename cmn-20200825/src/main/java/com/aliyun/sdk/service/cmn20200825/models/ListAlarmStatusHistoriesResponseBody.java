// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmStatusHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlarmStatusHistoriesResponseBody</p>
 */
public class ListAlarmStatusHistoriesResponseBody extends TeaModel {
    @NameInMap("AlarmStatusHistories")
    private java.util.List < AlarmStatusHistories> alarmStatusHistories;

    @NameInMap("RequestId")
    private String requestId;

    private ListAlarmStatusHistoriesResponseBody(Builder builder) {
        this.alarmStatusHistories = builder.alarmStatusHistories;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmStatusHistoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmStatusHistories
     */
    public java.util.List < AlarmStatusHistories> getAlarmStatusHistories() {
        return this.alarmStatusHistories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AlarmStatusHistories> alarmStatusHistories; 
        private String requestId; 

        /**
         * AlarmStatusHistories.
         */
        public Builder alarmStatusHistories(java.util.List < AlarmStatusHistories> alarmStatusHistories) {
            this.alarmStatusHistories = alarmStatusHistories;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAlarmStatusHistoriesResponseBody build() {
            return new ListAlarmStatusHistoriesResponseBody(this);
        } 

    } 

    public static class AlarmStatusHistories extends TeaModel {
        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("Value")
        private String value;

        private AlarmStatusHistories(Builder builder) {
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmStatusHistories create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long timestamp; 
            private String value; 

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AlarmStatusHistories build() {
                return new AlarmStatusHistories(this);
            } 

        } 

    }
}
