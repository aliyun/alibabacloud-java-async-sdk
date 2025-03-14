// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link UpdateInstanceGroupImageRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceGroupImageRequest</p>
 */
public class UpdateInstanceGroupImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceGroupIds;

    private UpdateInstanceGroupImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.instanceGroupIds = builder.instanceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceGroupImageRequest create() {
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
     * @return instanceGroupIds
     */
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceGroupImageRequest, Builder> {
        private String imageId; 
        private java.util.List<String> instanceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceGroupImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.instanceGroupIds = request.instanceGroupIds;
        } 

        /**
         * <p>The ID of the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-075cllfeuazh****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The IDs of the instance groups.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceGroupIds(java.util.List<String> instanceGroupIds) {
            this.putBodyParameter("InstanceGroupIds", instanceGroupIds);
            this.instanceGroupIds = instanceGroupIds;
            return this;
        }

        @Override
        public UpdateInstanceGroupImageRequest build() {
            return new UpdateInstanceGroupImageRequest(this);
        } 

    } 

}
