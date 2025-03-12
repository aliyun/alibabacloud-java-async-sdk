// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link LinkImageRequest} extends {@link RequestModel}
 *
 * <p>LinkImageRequest</p>
 */
public class LinkImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CameraHeight")
    private Integer cameraHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSceneId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(LinkImageRequest request) {
            super(request);
            this.cameraHeight = request.cameraHeight;
            this.fileName = request.fileName;
            this.platform = request.platform;
            this.subSceneId = request.subSceneId;
        } 

        /**
         * CameraHeight.
         */
        public Builder cameraHeight(Integer cameraHeight) {
            this.putQueryParameter("CameraHeight", cameraHeight);
            this.cameraHeight = cameraHeight;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>****.jpg</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234****</p>
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
