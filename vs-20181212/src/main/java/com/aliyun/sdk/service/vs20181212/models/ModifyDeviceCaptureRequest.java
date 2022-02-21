// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDeviceCaptureRequest} extends {@link RequestModel}
 *
 * <p>ModifyDeviceCaptureRequest</p>
 */
public class ModifyDeviceCaptureRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Image")
    private Integer image;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Video")
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

        private Builder(ModifyDeviceCaptureRequest response) {
            super(response);
            this.id = response.id;
            this.image = response.image;
            this.ownerId = response.ownerId;
            this.video = response.video;
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
