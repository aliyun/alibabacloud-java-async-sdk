// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartDeviceInstanceRequest} extends {@link RequestModel}
 *
 * <p>RestartDeviceInstanceRequest</p>
 */
public class RestartDeviceInstanceRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
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
         * The ID of the application. To obtain the application ID, call the ListApplications operation. For more information, see the API documentation of ListApplications.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the instance.
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
