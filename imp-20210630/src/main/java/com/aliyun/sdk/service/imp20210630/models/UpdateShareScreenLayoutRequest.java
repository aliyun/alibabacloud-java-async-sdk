// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateShareScreenLayoutRequest} extends {@link RequestModel}
 *
 * <p>UpdateShareScreenLayoutRequest</p>
 */
public class UpdateShareScreenLayoutRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("ClassId")
    @Validation(required = true)
    private String classId;

    @Body
    @NameInMap("EnableOverlay")
    @Validation(required = true)
    private Boolean enableOverlay;

    @Body
    @NameInMap("OverlayHeight")
    private Float overlayHeight;

    @Body
    @NameInMap("OverlayWidth")
    private Float overlayWidth;

    @Body
    @NameInMap("OverlayX")
    private Float overlayX;

    @Body
    @NameInMap("OverlayY")
    private Float overlayY;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateShareScreenLayoutRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.classId = builder.classId;
        this.enableOverlay = builder.enableOverlay;
        this.overlayHeight = builder.overlayHeight;
        this.overlayWidth = builder.overlayWidth;
        this.overlayX = builder.overlayX;
        this.overlayY = builder.overlayY;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateShareScreenLayoutRequest create() {
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
     * @return classId
     */
    public String getClassId() {
        return this.classId;
    }

    /**
     * @return enableOverlay
     */
    public Boolean getEnableOverlay() {
        return this.enableOverlay;
    }

    /**
     * @return overlayHeight
     */
    public Float getOverlayHeight() {
        return this.overlayHeight;
    }

    /**
     * @return overlayWidth
     */
    public Float getOverlayWidth() {
        return this.overlayWidth;
    }

    /**
     * @return overlayX
     */
    public Float getOverlayX() {
        return this.overlayX;
    }

    /**
     * @return overlayY
     */
    public Float getOverlayY() {
        return this.overlayY;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateShareScreenLayoutRequest, Builder> {
        private String appId; 
        private String classId; 
        private Boolean enableOverlay; 
        private Float overlayHeight; 
        private Float overlayWidth; 
        private Float overlayX; 
        private Float overlayY; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateShareScreenLayoutRequest request) {
            super(request);
            this.appId = request.appId;
            this.classId = request.classId;
            this.enableOverlay = request.enableOverlay;
            this.overlayHeight = request.overlayHeight;
            this.overlayWidth = request.overlayWidth;
            this.overlayX = request.overlayX;
            this.overlayY = request.overlayY;
            this.regionId = request.regionId;
        } 

        /**
         * 应用唯一标识，由6位小写字母、数字组成。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 课堂唯一标识，由调用CreateClass返回。
         */
        public Builder classId(String classId) {
            this.putBodyParameter("ClassId", classId);
            this.classId = classId;
            return this;
        }

        /**
         * 是否开启叠加老师画面
         */
        public Builder enableOverlay(Boolean enableOverlay) {
            this.putBodyParameter("EnableOverlay", enableOverlay);
            this.enableOverlay = enableOverlay;
            return this;
        }

        /**
         * 叠加画面高度，归一化为1
         */
        public Builder overlayHeight(Float overlayHeight) {
            this.putBodyParameter("OverlayHeight", overlayHeight);
            this.overlayHeight = overlayHeight;
            return this;
        }

        /**
         * 叠加画面宽度，归一化为1
         */
        public Builder overlayWidth(Float overlayWidth) {
            this.putBodyParameter("OverlayWidth", overlayWidth);
            this.overlayWidth = overlayWidth;
            return this;
        }

        /**
         * 叠加画面X坐标，归一化为1
         */
        public Builder overlayX(Float overlayX) {
            this.putBodyParameter("OverlayX", overlayX);
            this.overlayX = overlayX;
            return this;
        }

        /**
         * 叠加画面Y坐标，归一化为1
         */
        public Builder overlayY(Float overlayY) {
            this.putBodyParameter("OverlayY", overlayY);
            this.overlayY = overlayY;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateShareScreenLayoutRequest build() {
            return new UpdateShareScreenLayoutRequest(this);
        } 

    } 

}
