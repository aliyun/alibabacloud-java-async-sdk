// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AddWatermarkConsoleRequest} extends {@link RequestModel}
 *
 * <p>AddWatermarkConsoleRequest</p>
 */
public class AddWatermarkConsoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Active")
    private String active;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bucket")
    private String bucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Height")
    private String height;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HorizontalOffet")
    private String horizontalOffet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HorizontalOffset")
    private String horizontalOffset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Object")
    private String object;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Position")
    private String position;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRealOwnerId")
    private Long resourceRealOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScreenMode")
    private String screenMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerticalOffset")
    private String verticalOffset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoHeight")
    private Integer videoHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoWidth")
    private Integer videoWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkConfig")
    private String watermarkConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Width")
    private String width;

    private AddWatermarkConsoleRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.bucket = builder.bucket;
        this.fileName = builder.fileName;
        this.height = builder.height;
        this.horizontalOffet = builder.horizontalOffet;
        this.horizontalOffset = builder.horizontalOffset;
        this.name = builder.name;
        this.object = builder.object;
        this.ownerId = builder.ownerId;
        this.position = builder.position;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceRealOwnerId = builder.resourceRealOwnerId;
        this.screenMode = builder.screenMode;
        this.type = builder.type;
        this.verticalOffset = builder.verticalOffset;
        this.videoHeight = builder.videoHeight;
        this.videoWidth = builder.videoWidth;
        this.watermarkConfig = builder.watermarkConfig;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWatermarkConsoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public String getActive() {
        return this.active;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return height
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * @return horizontalOffet
     */
    public String getHorizontalOffet() {
        return this.horizontalOffet;
    }

    /**
     * @return horizontalOffset
     */
    public String getHorizontalOffset() {
        return this.horizontalOffset;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return position
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceRealOwnerId
     */
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    /**
     * @return screenMode
     */
    public String getScreenMode() {
        return this.screenMode;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return verticalOffset
     */
    public String getVerticalOffset() {
        return this.verticalOffset;
    }

    /**
     * @return videoHeight
     */
    public Integer getVideoHeight() {
        return this.videoHeight;
    }

    /**
     * @return videoWidth
     */
    public Integer getVideoWidth() {
        return this.videoWidth;
    }

    /**
     * @return watermarkConfig
     */
    public String getWatermarkConfig() {
        return this.watermarkConfig;
    }

    /**
     * @return width
     */
    public String getWidth() {
        return this.width;
    }

    public static final class Builder extends Request.Builder<AddWatermarkConsoleRequest, Builder> {
        private String active; 
        private String bucket; 
        private String fileName; 
        private String height; 
        private String horizontalOffet; 
        private String horizontalOffset; 
        private String name; 
        private String object; 
        private Long ownerId; 
        private String position; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long resourceRealOwnerId; 
        private String screenMode; 
        private String type; 
        private String verticalOffset; 
        private Integer videoHeight; 
        private Integer videoWidth; 
        private String watermarkConfig; 
        private String width; 

        private Builder() {
            super();
        } 

        private Builder(AddWatermarkConsoleRequest request) {
            super(request);
            this.active = request.active;
            this.bucket = request.bucket;
            this.fileName = request.fileName;
            this.height = request.height;
            this.horizontalOffet = request.horizontalOffet;
            this.horizontalOffset = request.horizontalOffset;
            this.name = request.name;
            this.object = request.object;
            this.ownerId = request.ownerId;
            this.position = request.position;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceRealOwnerId = request.resourceRealOwnerId;
            this.screenMode = request.screenMode;
            this.type = request.type;
            this.verticalOffset = request.verticalOffset;
            this.videoHeight = request.videoHeight;
            this.videoWidth = request.videoWidth;
            this.watermarkConfig = request.watermarkConfig;
            this.width = request.width;
        } 

        /**
         * Active.
         */
        public Builder active(String active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * Bucket.
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(String height) {
            this.putQueryParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * HorizontalOffet.
         */
        public Builder horizontalOffet(String horizontalOffet) {
            this.putQueryParameter("HorizontalOffet", horizontalOffet);
            this.horizontalOffet = horizontalOffet;
            return this;
        }

        /**
         * HorizontalOffset.
         */
        public Builder horizontalOffset(String horizontalOffset) {
            this.putQueryParameter("HorizontalOffset", horizontalOffset);
            this.horizontalOffset = horizontalOffset;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(String object) {
            this.putQueryParameter("Object", object);
            this.object = object;
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
         * Position.
         */
        public Builder position(String position) {
            this.putQueryParameter("Position", position);
            this.position = position;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ResourceRealOwnerId.
         */
        public Builder resourceRealOwnerId(Long resourceRealOwnerId) {
            this.putQueryParameter("ResourceRealOwnerId", resourceRealOwnerId);
            this.resourceRealOwnerId = resourceRealOwnerId;
            return this;
        }

        /**
         * ScreenMode.
         */
        public Builder screenMode(String screenMode) {
            this.putQueryParameter("ScreenMode", screenMode);
            this.screenMode = screenMode;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * VerticalOffset.
         */
        public Builder verticalOffset(String verticalOffset) {
            this.putQueryParameter("VerticalOffset", verticalOffset);
            this.verticalOffset = verticalOffset;
            return this;
        }

        /**
         * VideoHeight.
         */
        public Builder videoHeight(Integer videoHeight) {
            this.putQueryParameter("VideoHeight", videoHeight);
            this.videoHeight = videoHeight;
            return this;
        }

        /**
         * VideoWidth.
         */
        public Builder videoWidth(Integer videoWidth) {
            this.putQueryParameter("VideoWidth", videoWidth);
            this.videoWidth = videoWidth;
            return this;
        }

        /**
         * WatermarkConfig.
         */
        public Builder watermarkConfig(String watermarkConfig) {
            this.putQueryParameter("WatermarkConfig", watermarkConfig);
            this.watermarkConfig = watermarkConfig;
            return this;
        }

        /**
         * Width.
         */
        public Builder width(String width) {
            this.putQueryParameter("Width", width);
            this.width = width;
            return this;
        }

        @Override
        public AddWatermarkConsoleRequest build() {
            return new AddWatermarkConsoleRequest(this);
        } 

    } 

}
