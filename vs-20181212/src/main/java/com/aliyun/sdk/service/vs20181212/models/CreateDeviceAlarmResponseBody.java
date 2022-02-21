// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeviceAlarmResponseBody</p>
 */
public class CreateDeviceAlarmResponseBody extends TeaModel {
    @NameInMap("AlarmDelay")
    private Long alarmDelay;

    @NameInMap("AlarmId")
    private String alarmId;

    @NameInMap("Expire")
    private Long expire;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Url")
    private String url;

    private CreateDeviceAlarmResponseBody(Builder builder) {
        this.alarmDelay = builder.alarmDelay;
        this.alarmId = builder.alarmId;
        this.expire = builder.expire;
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceAlarmResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmDelay
     */
    public Long getAlarmDelay() {
        return this.alarmDelay;
    }

    /**
     * @return alarmId
     */
    public String getAlarmId() {
        return this.alarmId;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private Long alarmDelay; 
        private String alarmId; 
        private Long expire; 
        private String requestId; 
        private String url; 

        /**
         * AlarmDelay.
         */
        public Builder alarmDelay(Long alarmDelay) {
            this.alarmDelay = alarmDelay;
            return this;
        }

        /**
         * AlarmId.
         */
        public Builder alarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }

        /**
         * Expire.
         */
        public Builder expire(Long expire) {
            this.expire = expire;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public CreateDeviceAlarmResponseBody build() {
            return new CreateDeviceAlarmResponseBody(this);
        } 

    } 

}
