// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link UpdateAntCloudAuthSceneRequest} extends {@link RequestModel}
 *
 * <p>UpdateAntCloudAuthSceneRequest</p>
 */
public class UpdateAntCloudAuthSceneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindMiniProgram")
    private String bindMiniProgram;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckFileBody")
    private String checkFileBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckFileName")
    private String checkFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceRiskPlus")
    private String deviceRiskPlus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MiniProgramName")
    private String miniProgramName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnPicCount")
    private Long returnPicCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnVideoLength")
    private Long returnVideoLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneName")
    private String sceneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoreImage")
    private String storeImage;

    private UpdateAntCloudAuthSceneRequest(Builder builder) {
        super(builder);
        this.bindMiniProgram = builder.bindMiniProgram;
        this.checkFileBody = builder.checkFileBody;
        this.checkFileName = builder.checkFileName;
        this.deviceRiskPlus = builder.deviceRiskPlus;
        this.miniProgramName = builder.miniProgramName;
        this.platform = builder.platform;
        this.returnPicCount = builder.returnPicCount;
        this.returnVideoLength = builder.returnVideoLength;
        this.sceneId = builder.sceneId;
        this.sceneName = builder.sceneName;
        this.status = builder.status;
        this.storeImage = builder.storeImage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAntCloudAuthSceneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindMiniProgram
     */
    public String getBindMiniProgram() {
        return this.bindMiniProgram;
    }

    /**
     * @return checkFileBody
     */
    public String getCheckFileBody() {
        return this.checkFileBody;
    }

    /**
     * @return checkFileName
     */
    public String getCheckFileName() {
        return this.checkFileName;
    }

    /**
     * @return deviceRiskPlus
     */
    public String getDeviceRiskPlus() {
        return this.deviceRiskPlus;
    }

    /**
     * @return miniProgramName
     */
    public String getMiniProgramName() {
        return this.miniProgramName;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return returnPicCount
     */
    public Long getReturnPicCount() {
        return this.returnPicCount;
    }

    /**
     * @return returnVideoLength
     */
    public Long getReturnVideoLength() {
        return this.returnVideoLength;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return storeImage
     */
    public String getStoreImage() {
        return this.storeImage;
    }

    public static final class Builder extends Request.Builder<UpdateAntCloudAuthSceneRequest, Builder> {
        private String bindMiniProgram; 
        private String checkFileBody; 
        private String checkFileName; 
        private String deviceRiskPlus; 
        private String miniProgramName; 
        private String platform; 
        private Long returnPicCount; 
        private Long returnVideoLength; 
        private Long sceneId; 
        private String sceneName; 
        private Integer status; 
        private String storeImage; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAntCloudAuthSceneRequest request) {
            super(request);
            this.bindMiniProgram = request.bindMiniProgram;
            this.checkFileBody = request.checkFileBody;
            this.checkFileName = request.checkFileName;
            this.deviceRiskPlus = request.deviceRiskPlus;
            this.miniProgramName = request.miniProgramName;
            this.platform = request.platform;
            this.returnPicCount = request.returnPicCount;
            this.returnVideoLength = request.returnVideoLength;
            this.sceneId = request.sceneId;
            this.sceneName = request.sceneName;
            this.status = request.status;
            this.storeImage = request.storeImage;
        } 

        /**
         * <p>Whether to enable binding to a mini program:</p>
         * <ul>
         * <li><strong>Y</strong>: Enable</li>
         * <li><strong>N (default)</strong>: Do not enable<blockquote>
         * <p>Notice: If enabling the binding of a mini program, please ensure all parameters for the mini program are passed.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder bindMiniProgram(String bindMiniProgram) {
            this.putQueryParameter("BindMiniProgram", bindMiniProgram);
            this.bindMiniProgram = bindMiniProgram;
            return this;
        }

        /**
         * <p>Content of the uploaded verification file.</p>
         * 
         * <strong>example:</strong>
         * <p>774c4aab45981ff4a86cde9255a11xxx</p>
         */
        public Builder checkFileBody(String checkFileBody) {
            this.putQueryParameter("CheckFileBody", checkFileBody);
            this.checkFileBody = checkFileBody;
            return this;
        }

        /**
         * <p>Name of the uploaded verification file.</p>
         * 
         * <strong>example:</strong>
         * <p>测试.txt</p>
         */
        public Builder checkFileName(String checkFileName) {
            this.putQueryParameter("CheckFileName", checkFileName);
            this.checkFileName = checkFileName;
            return this;
        }

        /**
         * DeviceRiskPlus.
         */
        public Builder deviceRiskPlus(String deviceRiskPlus) {
            this.putQueryParameter("DeviceRiskPlus", deviceRiskPlus);
            this.deviceRiskPlus = deviceRiskPlus;
            return this;
        }

        /**
         * <p>Mini program name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试APP</p>
         */
        public Builder miniProgramName(String miniProgramName) {
            this.putQueryParameter("MiniProgramName", miniProgramName);
            this.miniProgramName = miniProgramName;
            return this;
        }

        /**
         * <p>Binding mini program platform:</p>
         * <ul>
         * <li><strong>WECHAT</strong>: WeChat</li>
         * <li><strong>ALIPAY</strong>: Alipay</li>
         * <li><strong>TIKTOK</strong>: TikTok</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IOS</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * ReturnPicCount.
         */
        public Builder returnPicCount(Long returnPicCount) {
            this.putQueryParameter("ReturnPicCount", returnPicCount);
            this.returnPicCount = returnPicCount;
            return this;
        }

        /**
         * ReturnVideoLength.
         */
        public Builder returnVideoLength(Long returnVideoLength) {
            this.putQueryParameter("ReturnVideoLength", returnVideoLength);
            this.returnVideoLength = returnVideoLength;
            return this;
        }

        /**
         * <p>Scenario ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000013372</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>Scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sceneName(String sceneName) {
            this.putQueryParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        /**
         * <p>Currently meaningless, can be omitted.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Whether to enable delivering the authentication files generated during the authentication process to the user&quot;s OSS:</p>
         * <ul>
         * <li><strong>Y</strong>: Enable</li>
         * <li><strong>N (default)</strong>: Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder storeImage(String storeImage) {
            this.putQueryParameter("StoreImage", storeImage);
            this.storeImage = storeImage;
            return this;
        }

        @Override
        public UpdateAntCloudAuthSceneRequest build() {
            return new UpdateAntCloudAuthSceneRequest(this);
        } 

    } 

}
