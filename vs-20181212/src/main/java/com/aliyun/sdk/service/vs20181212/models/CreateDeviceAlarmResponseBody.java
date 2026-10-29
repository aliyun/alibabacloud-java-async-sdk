// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateDeviceAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeviceAlarmResponseBody</p>
 */
public class CreateDeviceAlarmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmDelay")
    private Long alarmDelay;

    @com.aliyun.core.annotation.NameInMap("AlarmId")
    private String alarmId;

    @com.aliyun.core.annotation.NameInMap("Expire")
    private Long expire;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Url")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateDeviceAlarmResponseBody model) {
            this.alarmDelay = model.alarmDelay;
            this.alarmId = model.alarmId;
            this.expire = model.expire;
            this.requestId = model.requestId;
            this.url = model.url;
        } 

        /**
         * <p>The minimum interval before the next identical alert. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder alarmDelay(Long alarmDelay) {
            this.alarmDelay = alarmDelay;
            return this;
        }

        /**
         * <p>The alert ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0hyNgTdgv2D000195842</p>
         */
        public Builder alarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }

        /**
         * <p>The expiration period of the URL. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder expire(Long expire) {
            this.expire = expire;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>76E11E6A-4441-51C9-AF60-D354362257A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The media upload URL. You can use the PUT method to upload media.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://demo.aliyundoc.com/live/310101<em><strong><strong>7542007?auth_key=1639130258-0-0-b2b04fe85ece6</strong></strong></em>a6b1a42bc7e</p>
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
