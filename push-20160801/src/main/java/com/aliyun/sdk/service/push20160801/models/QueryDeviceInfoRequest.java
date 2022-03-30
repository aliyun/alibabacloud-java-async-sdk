// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceInfoRequest</p>
 */
public class QueryDeviceInfoRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    private QueryDeviceInfoRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.deviceId = builder.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceInfoRequest create() {
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

    public static final class Builder extends Request.Builder<QueryDeviceInfoRequest, Builder> {
        private Long appKey; 
        private String deviceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceInfoRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.deviceId = request.deviceId;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public QueryDeviceInfoRequest build() {
            return new QueryDeviceInfoRequest(this);
        } 

    } 

}
