// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link RestartDeviceInstanceRequest} extends {@link RequestModel}
 *
 * <p>RestartDeviceInstanceRequest</p>
 */
public class RestartDeviceInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private RestartDeviceInstanceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartDeviceInstanceRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<RestartDeviceInstanceRequest, Builder> {
        private String appId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(RestartDeviceInstanceRequest request) {
            super(request);
            this.appId = request.appId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The ID of the application. To obtain the application ID, call the ListApplications operation. For more information, see the API documentation of ListApplications.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f829265e-2f6f-4088-a4be-c1fb95ab45f9</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5slvdwcxf6ch81nl4r7p04j5q</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public RestartDeviceInstanceRequest build() {
            return new RestartDeviceInstanceRequest(this);
        } 

    } 

}
