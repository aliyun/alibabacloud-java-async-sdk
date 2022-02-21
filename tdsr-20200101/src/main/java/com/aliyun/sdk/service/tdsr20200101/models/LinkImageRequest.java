// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LinkImageRequest} extends {@link RequestModel}
 *
 * <p>LinkImageRequest</p>
 */
public class LinkImageRequest extends Request {
    @Query
    @NameInMap("CameraHeight")
    private Integer cameraHeight;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("SubSceneId")
    @Validation(required = true)
    private String subSceneId;

    private LinkImageRequest(Builder builder) {
        super(builder);
        this.cameraHeight = builder.cameraHeight;
        this.fileName = builder.fileName;
        this.platform = builder.platform;
        this.subSceneId = builder.subSceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LinkImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cameraHeight
     */
    public Integer getCameraHeight() {
        return this.cameraHeight;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return subSceneId
     */
    public String getSubSceneId() {
        return this.subSceneId;
    }

    public static final class Builder extends Request.Builder<LinkImageRequest, Builder> {
        private Integer cameraHeight; 
        private String fileName; 
        private String platform; 
        private String subSceneId; 

        private Builder() {
            super();
        } 

        private Builder(LinkImageRequest response) {
            super(response);
            this.cameraHeight = response.cameraHeight;
            this.fileName = response.fileName;
            this.platform = response.platform;
            this.subSceneId = response.subSceneId;
        } 

        /**
         * 相机高度 单位 cm
         */
        public Builder cameraHeight(Integer cameraHeight) {
            this.putQueryParameter("CameraHeight", cameraHeight);
            this.cameraHeight = cameraHeight;
            return this;
        }

        /**
         * 图片或者视频名称xxx.jpg
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * 平台标识，默认PC
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * 子场景ID
         */
        public Builder subSceneId(String subSceneId) {
            this.putQueryParameter("SubSceneId", subSceneId);
            this.subSceneId = subSceneId;
            return this;
        }

        @Override
        public LinkImageRequest build() {
            return new LinkImageRequest(this);
        } 

    } 

}
