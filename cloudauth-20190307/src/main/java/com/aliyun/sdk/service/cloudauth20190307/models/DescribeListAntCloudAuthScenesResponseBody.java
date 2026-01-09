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
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>CC1AB3F5-22A2-589F-ABDD-B766694AA671</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of scenarios.</p>
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

        private Scenes(Builder builder) {
            this.appId = builder.appId;
            this.bindMiniProgram = builder.bindMiniProgram;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
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

        public static final class Builder {
            private Long appId; 
            private String bindMiniProgram; 
            private String createTime; 
            private String creator; 
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

            private Builder() {
            } 

            private Builder(Scenes model) {
                this.appId = model.appId;
                this.bindMiniProgram = model.bindMiniProgram;
                this.createTime = model.createTime;
                this.creator = model.creator;
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
            } 

            /**
             * <p>Application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2a3a13b6-ee85-457e-bd15-b48115cb396e</p>
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>Whether to enable binding to a mini program:</p>
             * <ul>
             * <li><strong>Y</strong>: Enabled</li>
             * <li><strong>N (default)</strong>: Not enabled</li>
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
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1260051251634779</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Creator.</p>
             * 
             * <strong>example:</strong>
             * <p>189884094677xxxx</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DeviceRiskPlus.
             */
            public Builder deviceRiskPlus(String deviceRiskPlus) {
                this.deviceRiskPlus = deviceRiskPlus;
                return this;
            }

            /**
             * <p>Bound domain.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.ddos.com">www.ddos.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Mini program name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试APP</p>
             */
            public Builder miniProgramName(String miniProgramName) {
                this.miniProgramName = miniProgramName;
                return this;
            }

            /**
             * <p>Modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>189884094677xxxx</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>Platform for binding the mini program:</p>
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
                this.platform = platform;
                return this;
            }

            /**
             * ReturnPicCount.
             */
            public Builder returnPicCount(Long returnPicCount) {
                this.returnPicCount = returnPicCount;
                return this;
            }

            /**
             * ReturnVideoLength.
             */
            public Builder returnVideoLength(Long returnVideoLength) {
                this.returnVideoLength = returnVideoLength;
                return this;
            }

            /**
             * <p>Scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100001xxxx</p>
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>Scenario name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试场景</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>Whether it is enabled, with 1 indicating yes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Whether to deliver the files generated by the authentication to the customer&quot;s OSS:</p>
             * <ul>
             * <li><strong>Y</strong>: Enabled</li>
             * <li><strong>N</strong>: Disabled</li>
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
             * <p>The last update time of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1260051251634779</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Scenes build() {
                return new Scenes(this);
            } 

        } 

    }
}
