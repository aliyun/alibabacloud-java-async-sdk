// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Create2dAvatarRequest} extends {@link RequestModel}
 *
 * <p>Create2dAvatarRequest</p>
 */
public class Create2dAvatarRequest extends Request {
    @Query
    @NameInMap("Callback")
    private Boolean callback;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Image")
    private String image;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Orientation")
    @Validation(required = true)
    private Integer orientation;

    @Query
    @NameInMap("Portrait")
    @Validation(required = true)
    private String portrait;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    @Query
    @NameInMap("Transparent")
    @Validation(required = true)
    private Boolean transparent;

    @Query
    @NameInMap("Video")
    @Validation(required = true)
    private String video;

    private Create2dAvatarRequest(Builder builder) {
        super(builder);
        this.callback = builder.callback;
        this.description = builder.description;
        this.image = builder.image;
        this.name = builder.name;
        this.orientation = builder.orientation;
        this.portrait = builder.portrait;
        this.tenantId = builder.tenantId;
        this.transparent = builder.transparent;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Create2dAvatarRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callback
     */
    public Boolean getCallback() {
        return this.callback;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orientation
     */
    public Integer getOrientation() {
        return this.orientation;
    }

    /**
     * @return portrait
     */
    public String getPortrait() {
        return this.portrait;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return transparent
     */
    public Boolean getTransparent() {
        return this.transparent;
    }

    /**
     * @return video
     */
    public String getVideo() {
        return this.video;
    }

    public static final class Builder extends Request.Builder<Create2dAvatarRequest, Builder> {
        private Boolean callback; 
        private String description; 
        private String image; 
        private String name; 
        private Integer orientation; 
        private String portrait; 
        private Long tenantId; 
        private Boolean transparent; 
        private String video; 

        private Builder() {
            super();
        } 

        private Builder(Create2dAvatarRequest request) {
            super(request);
            this.callback = request.callback;
            this.description = request.description;
            this.image = request.image;
            this.name = request.name;
            this.orientation = request.orientation;
            this.portrait = request.portrait;
            this.tenantId = request.tenantId;
            this.transparent = request.transparent;
            this.video = request.video;
        } 

        /**
         * Callback.
         */
        public Builder callback(Boolean callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Image.
         */
        public Builder image(String image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Orientation.
         */
        public Builder orientation(Integer orientation) {
            this.putQueryParameter("Orientation", orientation);
            this.orientation = orientation;
            return this;
        }

        /**
         * Portrait.
         */
        public Builder portrait(String portrait) {
            this.putQueryParameter("Portrait", portrait);
            this.portrait = portrait;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Transparent.
         */
        public Builder transparent(Boolean transparent) {
            this.putQueryParameter("Transparent", transparent);
            this.transparent = transparent;
            return this;
        }

        /**
         * Video.
         */
        public Builder video(String video) {
            this.putQueryParameter("Video", video);
            this.video = video;
            return this;
        }

        @Override
        public Create2dAvatarRequest build() {
            return new Create2dAvatarRequest(this);
        } 

    } 

}
