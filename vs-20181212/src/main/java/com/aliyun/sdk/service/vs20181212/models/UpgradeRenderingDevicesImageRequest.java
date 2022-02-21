// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeRenderingDevicesImageRequest} extends {@link RequestModel}
 *
 * <p>UpgradeRenderingDevicesImageRequest</p>
 */
public class UpgradeRenderingDevicesImageRequest extends Request {
    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private UpgradeRenderingDevicesImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.instanceIds = builder.instanceIds;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeRenderingDevicesImageRequest create() {
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
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<UpgradeRenderingDevicesImageRequest, Builder> {
        private String imageId; 
        private String instanceIds; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeRenderingDevicesImageRequest response) {
            super(response);
            this.imageId = response.imageId;
            this.instanceIds = response.instanceIds;
            this.ownerId = response.ownerId;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public UpgradeRenderingDevicesImageRequest build() {
            return new UpgradeRenderingDevicesImageRequest(this);
        } 

    } 

}
