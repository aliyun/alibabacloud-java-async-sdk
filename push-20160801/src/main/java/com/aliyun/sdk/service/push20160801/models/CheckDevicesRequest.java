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
 * {@link CheckDevicesRequest} extends {@link RequestModel}
 *
 * <p>CheckDevicesRequest</p>
 */
public class CheckDevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceIds;

    private CheckDevicesRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.deviceIds = builder.deviceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDevicesRequest create() {
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
     * @return deviceIds
     */
    public String getDeviceIds() {
        return this.deviceIds;
    }

    public static final class Builder extends Request.Builder<CheckDevicesRequest, Builder> {
        private Long appKey; 
        private String deviceIds; 

        private Builder() {
            super();
        } 

        private Builder(CheckDevicesRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.deviceIds = request.deviceIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23419851</p>
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
         * <p>ae296f3b04a58a05b30c95f****,ae296f3b04a58a05b30c95f****,ae296f3b04a58a05b30c95f****</p>
         */
        public Builder deviceIds(String deviceIds) {
            this.putQueryParameter("DeviceIds", deviceIds);
            this.deviceIds = deviceIds;
            return this;
        }

        @Override
        public CheckDevicesRequest build() {
            return new CheckDevicesRequest(this);
        } 

    } 

}
