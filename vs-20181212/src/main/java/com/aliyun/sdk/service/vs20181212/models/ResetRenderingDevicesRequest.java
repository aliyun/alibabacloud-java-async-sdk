// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetRenderingDevicesRequest} extends {@link RequestModel}
 *
 * <p>ResetRenderingDevicesRequest</p>
 */
public class ResetRenderingDevicesRequest extends Request {
    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PodId")
    private String podId;

    private ResetRenderingDevicesRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.instanceIds = builder.instanceIds;
        this.ownerId = builder.ownerId;
        this.podId = builder.podId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetRenderingDevicesRequest create() {
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

    /**
     * @return podId
     */
    public String getPodId() {
        return this.podId;
    }

    public static final class Builder extends Request.Builder<ResetRenderingDevicesRequest, Builder> {
        private String imageId; 
        private String instanceIds; 
        private Long ownerId; 
        private String podId; 

        private Builder() {
            super();
        } 

        private Builder(ResetRenderingDevicesRequest response) {
            super(response);
            this.imageId = response.imageId;
            this.instanceIds = response.instanceIds;
            this.ownerId = response.ownerId;
            this.podId = response.podId;
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

        /**
         * PodId.
         */
        public Builder podId(String podId) {
            this.putQueryParameter("PodId", podId);
            this.podId = podId;
            return this;
        }

        @Override
        public ResetRenderingDevicesRequest build() {
            return new ResetRenderingDevicesRequest(this);
        } 

    } 

}
