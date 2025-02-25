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
 * {@link ModifyDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDeviceInfoResponseBody</p>
 */
public class ModifyDeviceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BeginDay")
    private String beginDay;

    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.NameInMap("ExpiredDay")
    private String expiredDay;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserDeviceId")
    private String userDeviceId;

    private ModifyDeviceInfoResponseBody(Builder builder) {
        this.beginDay = builder.beginDay;
        this.bizType = builder.bizType;
        this.deviceId = builder.deviceId;
        this.expiredDay = builder.expiredDay;
        this.requestId = builder.requestId;
        this.userDeviceId = builder.userDeviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDeviceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return beginDay
     */
    public String getBeginDay() {
        return this.beginDay;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return expiredDay
     */
    public String getExpiredDay() {
        return this.expiredDay;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userDeviceId
     */
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

    public static final class Builder {
        private String beginDay; 
        private String bizType; 
        private String deviceId; 
        private String expiredDay; 
        private String requestId; 
        private String userDeviceId; 

        /**
         * BeginDay.
         */
        public Builder beginDay(String beginDay) {
            this.beginDay = beginDay;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.bizType = bizType;
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
         * ExpiredDay.
         */
        public Builder expiredDay(String expiredDay) {
            this.expiredDay = expiredDay;
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
         * UserDeviceId.
         */
        public Builder userDeviceId(String userDeviceId) {
            this.userDeviceId = userDeviceId;
            return this;
        }

        public ModifyDeviceInfoResponseBody build() {
            return new ModifyDeviceInfoResponseBody(this);
        } 

    } 

}
