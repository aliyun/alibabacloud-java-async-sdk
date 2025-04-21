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
 * {@link ModifyDeviceInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyDeviceInfoRequest</p>
 */
public class ModifyDeviceInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiredDay")
    private String expiredDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDeviceId")
    private String userDeviceId;

    private ModifyDeviceInfoRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.deviceId = builder.deviceId;
        this.duration = builder.duration;
        this.expiredDay = builder.expiredDay;
        this.userDeviceId = builder.userDeviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDeviceInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return expiredDay
     */
    public String getExpiredDay() {
        return this.expiredDay;
    }

    /**
     * @return userDeviceId
     */
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

    public static final class Builder extends Request.Builder<ModifyDeviceInfoRequest, Builder> {
        private String bizType; 
        private String deviceId; 
        private String duration; 
        private String expiredDay; 
        private String userDeviceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDeviceInfoRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.deviceId = request.deviceId;
            this.duration = request.duration;
            this.expiredDay = request.expiredDay;
            this.userDeviceId = request.userDeviceId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wd.6ziUffspAeW5FVYbaqmexR-1qwNjM</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * ExpiredDay.
         */
        public Builder expiredDay(String expiredDay) {
            this.putQueryParameter("ExpiredDay", expiredDay);
            this.expiredDay = expiredDay;
            return this;
        }

        /**
         * UserDeviceId.
         */
        public Builder userDeviceId(String userDeviceId) {
            this.putQueryParameter("UserDeviceId", userDeviceId);
            this.userDeviceId = userDeviceId;
            return this;
        }

        @Override
        public ModifyDeviceInfoRequest build() {
            return new ModifyDeviceInfoRequest(this);
        } 

    } 

}
