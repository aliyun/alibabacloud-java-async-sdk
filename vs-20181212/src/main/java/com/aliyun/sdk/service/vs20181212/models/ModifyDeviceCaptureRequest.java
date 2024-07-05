// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDeviceCaptureRequest} extends {@link RequestModel}
 *
 * <p>ModifyDeviceCaptureRequest</p>
 */
public class ModifyDeviceCaptureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Image")
    private Integer image;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Video")
    private Integer video;

    private ModifyDeviceCaptureRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.image = builder.image;
        this.ownerId = builder.ownerId;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDeviceCaptureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return image
     */
    public Integer getImage() {
        return this.image;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return video
     */
    public Integer getVideo() {
        return this.video;
    }

    public static final class Builder extends Request.Builder<ModifyDeviceCaptureRequest, Builder> {
        private String id; 
        private Integer image; 
        private Long ownerId; 
        private Integer video; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDeviceCaptureRequest request) {
            super(request);
            this.id = request.id;
            this.image = request.image;
            this.ownerId = request.ownerId;
            this.video = request.video;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Image.
         */
        public Builder image(Integer image) {
            this.putQueryParameter("Image", image);
            this.image = image;
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
         * Video.
         */
        public Builder video(Integer video) {
            this.putQueryParameter("Video", video);
            this.video = video;
            return this;
        }

        @Override
        public ModifyDeviceCaptureRequest build() {
            return new ModifyDeviceCaptureRequest(this);
        } 

    } 

}
