// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link UnbindPhoneRequest} extends {@link RequestModel}
 *
 * <p>UnbindPhoneRequest</p>
 */
public class UnbindPhoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    private UnbindPhoneRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.deviceId = builder.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindPhoneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    public static final class Builder extends Request.Builder<UnbindPhoneRequest, Builder> {
        private Long appKey; 
        private String deviceId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindPhoneRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.deviceId = request.deviceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23267207</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eb5f741d83d04d34807d229999eefa52</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public UnbindPhoneRequest build() {
            return new UnbindPhoneRequest(this);
        } 

    } 

}
