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
 * {@link CreateAntCloudAuthSceneRequest} extends {@link RequestModel}
 *
 * <p>CreateAntCloudAuthSceneRequest</p>
 */
public class CreateAntCloudAuthSceneRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SceneName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoreImage")
    private String storeImage;

    private CreateAntCloudAuthSceneRequest(Builder builder) {
        super(builder);
        this.bindMiniProgram = builder.bindMiniProgram;
        this.checkFileBody = builder.checkFileBody;
        this.checkFileName = builder.checkFileName;
        this.deviceRiskPlus = builder.deviceRiskPlus;
        this.miniProgramName = builder.miniProgramName;
        this.platform = builder.platform;
        this.returnPicCount = builder.returnPicCount;
        this.returnVideoLength = builder.returnVideoLength;
        this.sceneName = builder.sceneName;
        this.storeImage = builder.storeImage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntCloudAuthSceneRequest create() {
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
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return storeImage
     */
    public String getStoreImage() {
        return this.storeImage;
    }

    public static final class Builder extends Request.Builder<CreateAntCloudAuthSceneRequest, Builder> {
        private String bindMiniProgram; 
        private String checkFileBody; 
        private String checkFileName; 
        private String deviceRiskPlus; 
        private String miniProgramName; 
        private String platform; 
        private Long returnPicCount; 
        private Long returnVideoLength; 
        private String sceneName; 
        private String storeImage; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntCloudAuthSceneRequest request) {
            super(request);
            this.bindMiniProgram = request.bindMiniProgram;
            this.checkFileBody = request.checkFileBody;
            this.checkFileName = request.checkFileName;
            this.deviceRiskPlus = request.deviceRiskPlus;
            this.miniProgramName = request.miniProgramName;
            this.platform = request.platform;
            this.returnPicCount = request.returnPicCount;
            this.returnVideoLength = request.returnVideoLength;
            this.sceneName = request.sceneName;
            this.storeImage = request.storeImage;
        } 

        /**
         * <p>Whether to enable binding of the mini program:</p>
         * <ul>
         * <li><strong>Y</strong>: Enable</li>
         * <li><strong>N (default)</strong>: Not enabled</li>
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
         * <p>Binding platform for the mini program:</p>
         * <ul>
         * <li><strong>WECHAT</strong>: WeChat</li>
         * <li><strong>ALIPAY</strong>: Alipay</li>
         * <li><strong>TIKTOK</strong>: TikTok</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WECHAT</p>
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
         * <p>Scene name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试场景</p>
         */
        public Builder sceneName(String sceneName) {
            this.putQueryParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        /**
         * <p>Whether to deliver the files generated from the authentication to the customer&quot;s OSS:</p>
         * <ul>
         * <li><strong>Y</strong>: Yes</li>
         * <li><strong>N</strong>: No</li>
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
        public CreateAntCloudAuthSceneRequest build() {
            return new CreateAntCloudAuthSceneRequest(this);
        } 

    } 

}
