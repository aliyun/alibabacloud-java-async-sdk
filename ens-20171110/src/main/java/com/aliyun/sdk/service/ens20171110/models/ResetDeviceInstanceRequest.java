// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDeviceInstanceRequest} extends {@link RequestModel}
 *
 * <p>ResetDeviceInstanceRequest</p>
 */
public class ResetDeviceInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ResetDeviceInstanceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.imageId = builder.imageId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetDeviceInstanceRequest create() {
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
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ResetDeviceInstanceRequest, Builder> {
        private String appId; 
        private String imageId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ResetDeviceInstanceRequest request) {
            super(request);
            this.appId = request.appId;
            this.imageId = request.imageId;
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
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
        public ResetDeviceInstanceRequest build() {
            return new ResetDeviceInstanceRequest(this);
        } 

    } 

}
