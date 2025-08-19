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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ModifyDeviceInfoResponseBody model) {
            this.beginDay = model.beginDay;
            this.bizType = model.bizType;
            this.deviceId = model.deviceId;
            this.expiredDay = model.expiredDay;
            this.requestId = model.requestId;
            this.userDeviceId = model.userDeviceId;
        } 

        /**
         * <p>If the Duration in the request parameters is not empty, this field represents the start time of the authorization after the device validity period has been extended. One year of Duration is calculated as 365 days. Example: 20180101.</p>
         * 
         * <strong>example:</strong>
         * <p>20190401</p>
         */
        public Builder beginDay(String beginDay) {
            this.beginDay = beginDay;
            return this;
        }

        /**
         * <p>Corresponds to the BizType in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>FACE_TEST</p>
         */
        public Builder bizType(String bizType) {
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>Corresponds to the DeviceId in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>wd.6ziUffspAeW5FVYbaqmexR-1qwNjM</p>
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>If the Duration in the request parameters is not empty, this field represents the expiration time of the authorization after the device validity period has been extended. One year of Duration is calculated as 365 days. Example: 20180101.</p>
         * 
         * <strong>example:</strong>
         * <p>20200330</p>
         */
        public Builder expiredDay(String expiredDay) {
            this.expiredDay = expiredDay;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Corresponds to the UserDeviceId in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>3iJ1AY$oHcu7mC69</p>
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
