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
    @com.aliyun.core.annotation.NameInMap("DegradeAppScheme")
    private String degradeAppScheme;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DegradeSubCodes")
    private String degradeSubCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DegradeType")
    private String degradeType;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseDegrade")
    private String useDegrade;

    private CreateAntCloudAuthSceneRequest(Builder builder) {
        super(builder);
        this.bindMiniProgram = builder.bindMiniProgram;
        this.checkFileBody = builder.checkFileBody;
        this.checkFileName = builder.checkFileName;
        this.degradeAppScheme = builder.degradeAppScheme;
        this.degradeSubCodes = builder.degradeSubCodes;
        this.degradeType = builder.degradeType;
        this.deviceRiskPlus = builder.deviceRiskPlus;
        this.miniProgramName = builder.miniProgramName;
        this.platform = builder.platform;
        this.returnPicCount = builder.returnPicCount;
        this.returnVideoLength = builder.returnVideoLength;
        this.sceneName = builder.sceneName;
        this.storeImage = builder.storeImage;
        this.useDegrade = builder.useDegrade;
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
     * @return degradeAppScheme
     */
    public String getDegradeAppScheme() {
        return this.degradeAppScheme;
    }

    /**
     * @return degradeSubCodes
     */
    public String getDegradeSubCodes() {
        return this.degradeSubCodes;
    }

    /**
     * @return degradeType
     */
    public String getDegradeType() {
        return this.degradeType;
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

    /**
     * @return useDegrade
     */
    public String getUseDegrade() {
        return this.useDegrade;
    }

    public static final class Builder extends Request.Builder<CreateAntCloudAuthSceneRequest, Builder> {
        private String bindMiniProgram; 
        private String checkFileBody; 
        private String checkFileName; 
        private String degradeAppScheme; 
        private String degradeSubCodes; 
        private String degradeType; 
        private String deviceRiskPlus; 
        private String miniProgramName; 
        private String platform; 
        private Long returnPicCount; 
        private Long returnVideoLength; 
        private String sceneName; 
        private String storeImage; 
        private String useDegrade; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntCloudAuthSceneRequest request) {
            super(request);
            this.bindMiniProgram = request.bindMiniProgram;
            this.checkFileBody = request.checkFileBody;
            this.checkFileName = request.checkFileName;
            this.degradeAppScheme = request.degradeAppScheme;
            this.degradeSubCodes = request.degradeSubCodes;
            this.degradeType = request.degradeType;
            this.deviceRiskPlus = request.deviceRiskPlus;
            this.miniProgramName = request.miniProgramName;
            this.platform = request.platform;
            this.returnPicCount = request.returnPicCount;
            this.returnVideoLength = request.returnVideoLength;
            this.sceneName = request.sceneName;
            this.storeImage = request.storeImage;
            this.useDegrade = request.useDegrade;
        } 

        /**
         * <p>Specifies whether to enable mini program binding. Valid values:</p>
         * <ul>
         * <li><strong>Y</strong>: Enabled.</li>
         * <li><strong>N (default)</strong>: Disabled.</li>
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
         * <p>The content of the uploaded verification file.</p>
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
         * <p>The name of the uploaded verification file.</p>
         * 
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        public Builder checkFileName(String checkFileName) {
            this.putQueryParameter("CheckFileName", checkFileName);
            this.checkFileName = checkFileName;
            return this;
        }

        /**
         * <p>The iOS app scheme for degradation redirect.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudauth://callback</p>
         */
        public Builder degradeAppScheme(String degradeAppScheme) {
            this.putQueryParameter("DegradeAppScheme", degradeAppScheme);
            this.degradeAppScheme = degradeAppScheme;
            return this;
        }

        /**
         * <p>The SubCode that triggers degradation.</p>
         * 
         * <strong>example:</strong>
         * <p>201,202</p>
         */
        public Builder degradeSubCodes(String degradeSubCodes) {
            this.putQueryParameter("DegradeSubCodes", degradeSubCodes);
            this.degradeSubCodes = degradeSubCodes;
            return this;
        }

        /**
         * <p>The degradation verification type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIPAY</p>
         */
        public Builder degradeType(String degradeType) {
            this.putQueryParameter("DegradeType", degradeType);
            this.degradeType = degradeType;
            return this;
        }

        /**
         * <p>Specifies whether to enable enhanced device risk detection. Valid values:</p>
         * <ul>
         * <li><strong>Y</strong>: Enabled.</li>
         * <li><strong>N</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder deviceRiskPlus(String deviceRiskPlus) {
            this.putQueryParameter("DeviceRiskPlus", deviceRiskPlus);
            this.deviceRiskPlus = deviceRiskPlus;
            return this;
        }

        /**
         * <p>The mini program name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestApp</p>
         */
        public Builder miniProgramName(String miniProgramName) {
            this.putQueryParameter("MiniProgramName", miniProgramName);
            this.miniProgramName = miniProgramName;
            return this;
        }

        /**
         * <p>The mini program platform to bind. Valid values:</p>
         * <ul>
         * <li><strong>WECHAT</strong>: WeChat.</li>
         * <li><strong>ALIPAY</strong>: Alipay.</li>
         * <li><strong>TIKTOK</strong>: TikTok.</li>
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
         * <p>The number of face photos for evidence storage (1-5).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder returnPicCount(Long returnPicCount) {
            this.putQueryParameter("ReturnPicCount", returnPicCount);
            this.returnPicCount = returnPicCount;
            return this;
        }

        /**
         * <p>The duration of the evidence storage video, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder returnVideoLength(Long returnVideoLength) {
            this.putQueryParameter("ReturnVideoLength", returnVideoLength);
            this.returnVideoLength = returnVideoLength;
            return this;
        }

        /**
         * <p>The scenario name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestScenario</p>
         */
        public Builder sceneName(String sceneName) {
            this.putQueryParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        /**
         * <p>Specifies whether to deliver files generated during verification to the customer\&quot;s OSS. Valid values:</p>
         * <ul>
         * <li><strong>Y</strong>: Yes.</li>
         * <li><strong>N</strong>: No.</li>
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

        /**
         * <p>Specifies whether to enable degradation.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder useDegrade(String useDegrade) {
            this.putQueryParameter("UseDegrade", useDegrade);
            this.useDegrade = useDegrade;
            return this;
        }

        @Override
        public CreateAntCloudAuthSceneRequest build() {
            return new CreateAntCloudAuthSceneRequest(this);
        } 

    } 

}
