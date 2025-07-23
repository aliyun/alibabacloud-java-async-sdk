// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
 * {@link RestoreInstanceRequest} extends {@link RequestModel}
 *
 * <p>RestoreInstanceRequest</p>
 */
public class RestoreInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private RestoreInstanceRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<RestoreInstanceRequest, Builder> {
        private String imageId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(RestoreInstanceRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The ID of the image that you want to use to restore the HSM.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image-eaOGHkRDQgh4****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The ID of the HSM.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-cn-mp90fxef****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public RestoreInstanceRequest build() {
            return new RestoreInstanceRequest(this);
        } 

    } 

}
