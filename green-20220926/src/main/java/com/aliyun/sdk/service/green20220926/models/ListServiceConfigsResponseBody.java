// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ListServiceConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceConfigsResponseBody</p>
 */
public class ListServiceConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListServiceConfigsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListServiceConfigsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The request ID assigned by the backend, which uniquely identifies the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListServiceConfigsResponseBody build() {
            return new ListServiceConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceConfigsResponseBody</p>
     */
    public static class ImageScanRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Services")
        private java.util.List<String> services;

        private ImageScanRule(Builder builder) {
            this.services = builder.services;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageScanRule create() {
            return builder().build();
        }

        /**
         * @return services
         */
        public java.util.List<String> getServices() {
            return this.services;
        }

        public static final class Builder {
            private java.util.List<String> services; 

            private Builder() {
            } 

            private Builder(ImageScanRule model) {
                this.services = model.services;
            } 

            /**
             * <p>The image service.</p>
             */
            public Builder services(java.util.List<String> services) {
                this.services = services;
                return this;
            }

            public ImageScanRule build() {
                return new ImageScanRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceConfigsResponseBody</p>
     */
    public static class TextScanRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Services")
        private java.util.List<String> services;

        private TextScanRule(Builder builder) {
            this.services = builder.services;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextScanRule create() {
            return builder().build();
        }

        /**
         * @return services
         */
        public java.util.List<String> getServices() {
            return this.services;
        }

        public static final class Builder {
            private java.util.List<String> services; 

            private Builder() {
            } 

            private Builder(TextScanRule model) {
                this.services = model.services;
            } 

            /**
             * <p>The text services.</p>
             */
            public Builder services(java.util.List<String> services) {
                this.services = services;
                return this;
            }

            public TextScanRule build() {
                return new TextScanRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceConfigsResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageScanRule")
        private ImageScanRule imageScanRule;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("TextScanRule")
        private TextScanRule textScanRule;

        private Rules(Builder builder) {
            this.imageScanRule = builder.imageScanRule;
            this.index = builder.index;
            this.textScanRule = builder.textScanRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return imageScanRule
         */
        public ImageScanRule getImageScanRule() {
            return this.imageScanRule;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return textScanRule
         */
        public TextScanRule getTextScanRule() {
            return this.textScanRule;
        }

        public static final class Builder {
            private ImageScanRule imageScanRule; 
            private Integer index; 
            private TextScanRule textScanRule; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.imageScanRule = model.imageScanRule;
                this.index = model.index;
                this.textScanRule = model.textScanRule;
            } 

            /**
             * <p>The image moderation rule.</p>
             */
            public Builder imageScanRule(ImageScanRule imageScanRule) {
                this.imageScanRule = imageScanRule;
                return this;
            }

            /**
             * <p>The ordinal number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The text moderation rule.</p>
             */
            public Builder textScanRule(TextScanRule textScanRule) {
                this.textScanRule = textScanRule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceConfigsResponseBody</p>
     */
    public static class CustomServiceConf extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioService")
        private String audioService;

        @com.aliyun.core.annotation.NameInMap("ImageService")
        private java.util.List<String> imageService;

        @com.aliyun.core.annotation.NameInMap("KeywordFilterLibs")
        private java.util.List<String> keywordFilterLibs;

        @com.aliyun.core.annotation.NameInMap("KeywordHitLibs")
        private java.util.List<String> keywordHitLibs;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("SimilarTextHitLibs")
        private java.util.List<String> similarTextHitLibs;

        private CustomServiceConf(Builder builder) {
            this.audioService = builder.audioService;
            this.imageService = builder.imageService;
            this.keywordFilterLibs = builder.keywordFilterLibs;
            this.keywordHitLibs = builder.keywordHitLibs;
            this.rules = builder.rules;
            this.similarTextHitLibs = builder.similarTextHitLibs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomServiceConf create() {
            return builder().build();
        }

        /**
         * @return audioService
         */
        public String getAudioService() {
            return this.audioService;
        }

        /**
         * @return imageService
         */
        public java.util.List<String> getImageService() {
            return this.imageService;
        }

        /**
         * @return keywordFilterLibs
         */
        public java.util.List<String> getKeywordFilterLibs() {
            return this.keywordFilterLibs;
        }

        /**
         * @return keywordHitLibs
         */
        public java.util.List<String> getKeywordHitLibs() {
            return this.keywordHitLibs;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return similarTextHitLibs
         */
        public java.util.List<String> getSimilarTextHitLibs() {
            return this.similarTextHitLibs;
        }

        public static final class Builder {
            private String audioService; 
            private java.util.List<String> imageService; 
            private java.util.List<String> keywordFilterLibs; 
            private java.util.List<String> keywordHitLibs; 
            private java.util.List<Rules> rules; 
            private java.util.List<String> similarTextHitLibs; 

            private Builder() {
            } 

            private Builder(CustomServiceConf model) {
                this.audioService = model.audioService;
                this.imageService = model.imageService;
                this.keywordFilterLibs = model.keywordFilterLibs;
                this.keywordHitLibs = model.keywordHitLibs;
                this.rules = model.rules;
                this.similarTextHitLibs = model.similarTextHitLibs;
            } 

            /**
             * <p>The audio service.</p>
             * 
             * <strong>example:</strong>
             * <p>audio_media_detection</p>
             */
            public Builder audioService(String audioService) {
                this.audioService = audioService;
                return this;
            }

            /**
             * <p>The image service.</p>
             */
            public Builder imageService(java.util.List<String> imageService) {
                this.imageService = imageService;
                return this;
            }

            /**
             * <p>The ignored keyword library.</p>
             */
            public Builder keywordFilterLibs(java.util.List<String> keywordFilterLibs) {
                this.keywordFilterLibs = keywordFilterLibs;
                return this;
            }

            /**
             * <p>The hit keyword library.</p>
             */
            public Builder keywordHitLibs(java.util.List<String> keywordHitLibs) {
                this.keywordHitLibs = keywordHitLibs;
                return this;
            }

            /**
             * <p>The service rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The hit similar text library.</p>
             */
            public Builder similarTextHitLibs(java.util.List<String> similarTextHitLibs) {
                this.similarTextHitLibs = similarTextHitLibs;
                return this;
            }

            public CustomServiceConf build() {
                return new CustomServiceConf(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceConfigsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Classify")
        private String classify;

        @com.aliyun.core.annotation.NameInMap("CopyFrom")
        private String copyFrom;

        @com.aliyun.core.annotation.NameInMap("CustomServiceConf")
        private CustomServiceConf customServiceConf;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Option")
        private java.util.Map<String, ?> option;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SceneType")
        private String sceneType;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceDesc")
        private String serviceDesc;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("UseStatus")
        private String useStatus;

        private Data(Builder builder) {
            this.classify = builder.classify;
            this.copyFrom = builder.copyFrom;
            this.customServiceConf = builder.customServiceConf;
            this.gmtModified = builder.gmtModified;
            this.option = builder.option;
            this.resourceType = builder.resourceType;
            this.sceneType = builder.sceneType;
            this.serviceCode = builder.serviceCode;
            this.serviceDesc = builder.serviceDesc;
            this.serviceName = builder.serviceName;
            this.serviceType = builder.serviceType;
            this.uid = builder.uid;
            this.useStatus = builder.useStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return classify
         */
        public String getClassify() {
            return this.classify;
        }

        /**
         * @return copyFrom
         */
        public String getCopyFrom() {
            return this.copyFrom;
        }

        /**
         * @return customServiceConf
         */
        public CustomServiceConf getCustomServiceConf() {
            return this.customServiceConf;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return option
         */
        public java.util.Map<String, ?> getOption() {
            return this.option;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return sceneType
         */
        public String getSceneType() {
            return this.sceneType;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceDesc
         */
        public String getServiceDesc() {
            return this.serviceDesc;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return useStatus
         */
        public String getUseStatus() {
            return this.useStatus;
        }

        public static final class Builder {
            private String classify; 
            private String copyFrom; 
            private CustomServiceConf customServiceConf; 
            private String gmtModified; 
            private java.util.Map<String, ?> option; 
            private String resourceType; 
            private String sceneType; 
            private String serviceCode; 
            private String serviceDesc; 
            private String serviceName; 
            private String serviceType; 
            private String uid; 
            private String useStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.classify = model.classify;
                this.copyFrom = model.copyFrom;
                this.customServiceConf = model.customServiceConf;
                this.gmtModified = model.gmtModified;
                this.option = model.option;
                this.resourceType = model.resourceType;
                this.sceneType = model.sceneType;
                this.serviceCode = model.serviceCode;
                this.serviceDesc = model.serviceDesc;
                this.serviceName = model.serviceName;
                this.serviceType = model.serviceType;
                this.uid = model.uid;
                this.useStatus = model.useStatus;
            } 

            /**
             * <p>The classification.</p>
             * 
             * <strong>example:</strong>
             * <p>guard-scene</p>
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * <p>The primary service.</p>
             * 
             * <strong>example:</strong>
             * <p>nickname_detection</p>
             */
            public Builder copyFrom(String copyFrom) {
                this.copyFrom = copyFrom;
                return this;
            }

            /**
             * <p>The service configuration.</p>
             */
            public Builder customServiceConf(CustomServiceConf customServiceConf) {
                this.customServiceConf = customServiceConf;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-11 15:40:04</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The options.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder option(java.util.Map<String, ?> option) {
                this.option = option;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The scene type. Valid values:</p>
             * <ul>
             * <li><p>recommended_scene: recommended scenario.</p>
             * </li>
             * <li><p>all_scene: all scenarios.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all_scene</p>
             */
            public Builder sceneType(String sceneType) {
                this.sceneType = sceneType;
                return this;
            }

            /**
             * <p>The service code.</p>
             * 
             * <strong>example:</strong>
             * <p>nickname_detection</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>The service description.</p>
             * 
             * <strong>example:</strong>
             * <p>服务描述</p>
             */
            public Builder serviceDesc(String serviceDesc) {
                this.serviceDesc = serviceDesc;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>服务名称</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The service type.</p>
             * 
             * <strong>example:</strong>
             * <p>plus</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>UID。</p>
             * 
             * <strong>example:</strong>
             * <p>1674*****0071291</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * <p>The usage status.</p>
             * 
             * <strong>example:</strong>
             * <p>in</p>
             */
            public Builder useStatus(String useStatus) {
                this.useStatus = useStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
