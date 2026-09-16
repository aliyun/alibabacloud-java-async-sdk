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
 * {@link DescribeListAntCloudAuthScenesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeListAntCloudAuthScenesResponseBody</p>
 */
public class DescribeListAntCloudAuthScenesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scenes")
    private java.util.List<Scenes> scenes;

    private DescribeListAntCloudAuthScenesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scenes = builder.scenes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListAntCloudAuthScenesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scenes
     */
    public java.util.List<Scenes> getScenes() {
        return this.scenes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Scenes> scenes; 

        private Builder() {
        } 

        private Builder(DescribeListAntCloudAuthScenesResponseBody model) {
            this.requestId = model.requestId;
            this.scenes = model.scenes;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CC1AB3F5-22A2-589F-ABDD-B766694AA671</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of scenarios.</p>
         */
        public Builder scenes(java.util.List<Scenes> scenes) {
            this.scenes = scenes;
            return this;
        }

        public DescribeListAntCloudAuthScenesResponseBody build() {
            return new DescribeListAntCloudAuthScenesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeListAntCloudAuthScenesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeListAntCloudAuthScenesResponseBody</p>
     */
    public static class Scenes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("BindMiniProgram")
        private String bindMiniProgram;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DegradeAppScheme")
        private String degradeAppScheme;

        @com.aliyun.core.annotation.NameInMap("DegradeSubCodes")
        private String degradeSubCodes;

        @com.aliyun.core.annotation.NameInMap("DegradeType")
        private String degradeType;

        @com.aliyun.core.annotation.NameInMap("DeviceRiskPlus")
        private String deviceRiskPlus;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("MiniProgramName")
        private String miniProgramName;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ReturnPicCount")
        private Long returnPicCount;

        @com.aliyun.core.annotation.NameInMap("ReturnVideoLength")
        private Long returnVideoLength;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private Long sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StoreImage")
        private String storeImage;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UseDegrade")
        private String useDegrade;

        private Scenes(Builder builder) {
            this.appId = builder.appId;
            this.bindMiniProgram = builder.bindMiniProgram;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.degradeAppScheme = builder.degradeAppScheme;
            this.degradeSubCodes = builder.degradeSubCodes;
            this.degradeType = builder.degradeType;
            this.deviceRiskPlus = builder.deviceRiskPlus;
            this.domain = builder.domain;
            this.miniProgramName = builder.miniProgramName;
            this.modifier = builder.modifier;
            this.platform = builder.platform;
            this.returnPicCount = builder.returnPicCount;
            this.returnVideoLength = builder.returnVideoLength;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.status = builder.status;
            this.storeImage = builder.storeImage;
            this.updateTime = builder.updateTime;
            this.useDegrade = builder.useDegrade;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenes create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return bindMiniProgram
         */
        public String getBindMiniProgram() {
            return this.bindMiniProgram;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
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
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return miniProgramName
         */
        public String getMiniProgramName() {
            return this.miniProgramName;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
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

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return useDegrade
         */
        public String getUseDegrade() {
            return this.useDegrade;
        }

        public static final class Builder {
            private Long appId; 
            private String bindMiniProgram; 
            private String createTime; 
            private String creator; 
            private String degradeAppScheme; 
            private String degradeSubCodes; 
            private String degradeType; 
            private String deviceRiskPlus; 
            private String domain; 
            private String miniProgramName; 
            private String modifier; 
            private String platform; 
            private Long returnPicCount; 
            private Long returnVideoLength; 
            private Long sceneId; 
            private String sceneName; 
            private Integer status; 
            private String storeImage; 
            private String updateTime; 
            private String useDegrade; 

            private Builder() {
            } 

            private Builder(Scenes model) {
                this.appId = model.appId;
                this.bindMiniProgram = model.bindMiniProgram;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.degradeAppScheme = model.degradeAppScheme;
                this.degradeSubCodes = model.degradeSubCodes;
                this.degradeType = model.degradeType;
                this.deviceRiskPlus = model.deviceRiskPlus;
                this.domain = model.domain;
                this.miniProgramName = model.miniProgramName;
                this.modifier = model.modifier;
                this.platform = model.platform;
                this.returnPicCount = model.returnPicCount;
                this.returnVideoLength = model.returnVideoLength;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.status = model.status;
                this.storeImage = model.storeImage;
                this.updateTime = model.updateTime;
                this.useDegrade = model.useDegrade;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2a3a13b6-ee85-457e-bd15-b48115cb396e</p>
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
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
                this.bindMiniProgram = bindMiniProgram;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds (ms), such as 1740389697000.</p>
             * 
             * <strong>example:</strong>
             * <p>1740389697000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>189884094677xxxx</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The iOS scheme for degradation.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudauth://callback</p>
             */
            public Builder degradeAppScheme(String degradeAppScheme) {
                this.degradeAppScheme = degradeAppScheme;
                return this;
            }

            /**
             * <p>The list of SubCodes that trigger degradation.</p>
             * 
             * <strong>example:</strong>
             * <p>201,202</p>
             */
            public Builder degradeSubCodes(String degradeSubCodes) {
                this.degradeSubCodes = degradeSubCodes;
                return this;
            }

            /**
             * <p>The degraded authentication type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIPAY</p>
             */
            public Builder degradeType(String degradeType) {
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
                this.deviceRiskPlus = deviceRiskPlus;
                return this;
            }

            /**
             * <p>The bound domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.ddos.com">www.ddos.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The mini program name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestApp</p>
             */
            public Builder miniProgramName(String miniProgramName) {
                this.miniProgramName = miniProgramName;
                return this;
            }

            /**
             * <p>The modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>189884094677xxxx</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The mini program platform. Valid values:</p>
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
                this.platform = platform;
                return this;
            }

            /**
             * <p>The number of evidence face photos (1-5).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder returnPicCount(Long returnPicCount) {
                this.returnPicCount = returnPicCount;
                return this;
            }

            /**
             * <p>The evidence video duration in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder returnVideoLength(Long returnVideoLength) {
                this.returnVideoLength = returnVideoLength;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100001xxxx</p>
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The scenario name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestScenario</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>Indicates whether the scenario is enabled. The value is 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Specifies whether to deliver files generated during authentication to the customer\&quot;s OSS. Valid values:</p>
             * <ul>
             * <li><strong>Y</strong>: Enabled.</li>
             * <li><strong>N</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder storeImage(String storeImage) {
                this.storeImage = storeImage;
                return this;
            }

            /**
             * <p>The last update time of the instance. The value is a UNIX timestamp in milliseconds (ms), such as 1740541510000.</p>
             * 
             * <strong>example:</strong>
             * <p>1740541510000</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Specifies whether to enable degraded authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder useDegrade(String useDegrade) {
                this.useDegrade = useDegrade;
                return this;
            }

            public Scenes build() {
                return new Scenes(this);
            } 

        } 

    }
}
