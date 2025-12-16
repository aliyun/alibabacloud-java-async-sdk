// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link GetPassThroughAuthInfoRequest} extends {@link RequestModel}
 *
 * <p>GetPassThroughAuthInfoRequest</p>
 */
public class GetPassThroughAuthInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deviceName")
    private String deviceName;

    private GetPassThroughAuthInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deviceName = builder.deviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPassThroughAuthInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    public static final class Builder extends Request.Builder<GetPassThroughAuthInfoRequest, Builder> {
        private String appId; 
        private String deviceName; 

        private Builder() {
            super();
        } 

        private Builder(GetPassThroughAuthInfoRequest request) {
            super(request);
            this.appId = request.appId;
            this.deviceName = request.deviceName;
        } 

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * deviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("deviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        @Override
        public GetPassThroughAuthInfoRequest build() {
            return new GetPassThroughAuthInfoRequest(this);
        } 

    } 

}
