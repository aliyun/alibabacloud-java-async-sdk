// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveAIStudioResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveAIStudioResponseBody</p>
 */
public class DescribeLiveAIStudioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StudioConfigs")
    private StudioConfigs studioConfigs;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeLiveAIStudioResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.studioConfigs = builder.studioConfigs;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveAIStudioResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return studioConfigs
     */
    public StudioConfigs getStudioConfigs() {
        return this.studioConfigs;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private StudioConfigs studioConfigs; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeLiveAIStudioResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.studioConfigs = model.studioConfigs;
            this.total = model.total;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Valid values: 1 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The virtual studio templates.</p>
         */
        public Builder studioConfigs(StudioConfigs studioConfigs) {
            this.studioConfigs = studioConfigs;
            return this;
        }

        /**
         * <p>The total number of templates.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeLiveAIStudioResponseBody build() {
            return new DescribeLiveAIStudioResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveAIStudioResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAIStudioResponseBody</p>
     */
    public static class RuleIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ruleId")
        private java.util.List<String> ruleId;

        private RuleIds(Builder builder) {
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleIds create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private java.util.List<String> ruleId; 

            private Builder() {
            } 

            private Builder(RuleIds model) {
                this.ruleId = model.ruleId;
            } 

            /**
             * ruleId.
             */
            public Builder ruleId(java.util.List<String> ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public RuleIds build() {
                return new RuleIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveAIStudioResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAIStudioResponseBody</p>
     */
    public static class SubtitleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundResourceId")
        private String backgroundResourceId;

        @com.aliyun.core.annotation.NameInMap("BackgroundResourceUrl")
        private String backgroundResourceUrl;

        @com.aliyun.core.annotation.NameInMap("BackgroundType")
        private String backgroundType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("MattingLayout")
        private String mattingLayout;

        @com.aliyun.core.annotation.NameInMap("MattingType")
        private String mattingType;

        @com.aliyun.core.annotation.NameInMap("MediaLayout")
        private String mediaLayout;

        @com.aliyun.core.annotation.NameInMap("MediaResourceId")
        private String mediaResourceId;

        @com.aliyun.core.annotation.NameInMap("MediaResourceUrl")
        private String mediaResourceUrl;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private RuleIds ruleIds;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private SubtitleConfig(Builder builder) {
            this.backgroundResourceId = builder.backgroundResourceId;
            this.backgroundResourceUrl = builder.backgroundResourceUrl;
            this.backgroundType = builder.backgroundType;
            this.description = builder.description;
            this.height = builder.height;
            this.mattingLayout = builder.mattingLayout;
            this.mattingType = builder.mattingType;
            this.mediaLayout = builder.mediaLayout;
            this.mediaResourceId = builder.mediaResourceId;
            this.mediaResourceUrl = builder.mediaResourceUrl;
            this.mediaType = builder.mediaType;
            this.ruleIds = builder.ruleIds;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleConfig create() {
            return builder().build();
        }

        /**
         * @return backgroundResourceId
         */
        public String getBackgroundResourceId() {
            return this.backgroundResourceId;
        }

        /**
         * @return backgroundResourceUrl
         */
        public String getBackgroundResourceUrl() {
            return this.backgroundResourceUrl;
        }

        /**
         * @return backgroundType
         */
        public String getBackgroundType() {
            return this.backgroundType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return mattingLayout
         */
        public String getMattingLayout() {
            return this.mattingLayout;
        }

        /**
         * @return mattingType
         */
        public String getMattingType() {
            return this.mattingType;
        }

        /**
         * @return mediaLayout
         */
        public String getMediaLayout() {
            return this.mediaLayout;
        }

        /**
         * @return mediaResourceId
         */
        public String getMediaResourceId() {
            return this.mediaResourceId;
        }

        /**
         * @return mediaResourceUrl
         */
        public String getMediaResourceUrl() {
            return this.mediaResourceUrl;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return ruleIds
         */
        public RuleIds getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String backgroundResourceId; 
            private String backgroundResourceUrl; 
            private String backgroundType; 
            private String description; 
            private String height; 
            private String mattingLayout; 
            private String mattingType; 
            private String mediaLayout; 
            private String mediaResourceId; 
            private String mediaResourceUrl; 
            private String mediaType; 
            private RuleIds ruleIds; 
            private String templateId; 
            private String templateName; 
            private String width; 

            private Builder() {
            } 

            private Builder(SubtitleConfig model) {
                this.backgroundResourceId = model.backgroundResourceId;
                this.backgroundResourceUrl = model.backgroundResourceUrl;
                this.backgroundType = model.backgroundType;
                this.description = model.description;
                this.height = model.height;
                this.mattingLayout = model.mattingLayout;
                this.mattingType = model.mattingType;
                this.mediaLayout = model.mediaLayout;
                this.mediaResourceId = model.mediaResourceId;
                this.mediaResourceUrl = model.mediaResourceUrl;
                this.mediaType = model.mediaType;
                this.ruleIds = model.ruleIds;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.width = model.width;
            } 

            /**
             * <p>The ID of the background material.</p>
             * 
             * <strong>example:</strong>
             * <p>d0eb493192c771efba644531858c0102</p>
             */
            public Builder backgroundResourceId(String backgroundResourceId) {
                this.backgroundResourceId = backgroundResourceId;
                return this;
            }

            /**
             * <p>The URL of the background material. Make sure that the URL is accessible over the Internet. Either this parameter or the BackgroundResourceId parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://testbucket.xx.com/2.jpg">https://testbucket.xx.com/2.jpg</a></p>
             */
            public Builder backgroundResourceUrl(String backgroundResourceUrl) {
                this.backgroundResourceUrl = backgroundResourceUrl;
                return this;
            }

            /**
             * <p>The type of the background material. Valid values:</p>
             * <ul>
             * <li>VOD: a video in ApsaraVideo VOD</li>
             * <li>PIC: an image</li>
             * <li>LIVE: a live stream</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VOD</p>
             */
            public Builder backgroundType(String backgroundType) {
                this.backgroundType = backgroundType;
                return this;
            }

            /**
             * <p>The custom description.</p>
             * 
             * <strong>example:</strong>
             * <p>user defined description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The preview height. Unit: pixels.</p>
             * <p>The following preview specifications (width × height) are supported:</p>
             * <ul>
             * <li>Landscape low definition 360p (640×360)</li>
             * <li>Portrait low definition 360p (360×640)</li>
             * <li>Landscape standard definition 480p (854×480)</li>
             * <li>Portrait standard definition 480p (480×854)</li>
             * <li>Landscape high definition 720p (1280×720)</li>
             * <li>Portrait high definition 720p (720×1280)</li>
             * <li>Landscape ultra-high definition 1080p (1920×1080)</li>
             * <li>Portrait ultra-high definition 1080p (1080×1920)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The layout information of the multimedia material.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;positionY&quot;:&quot;0.0&quot;,&quot;positionX&quot;:&quot;0.0&quot;,&quot;heightNormalized&quot;:&quot;0.5&quot;}&quot;</p>
             */
            public Builder mattingLayout(String mattingLayout) {
                this.mattingLayout = mattingLayout;
                return this;
            }

            /**
             * <p>The type of chroma key that is performed on ingested streams. Valid values:</p>
             * <ul>
             * <li>green: green-key chroma key</li>
             * <li>blue: blue-screen chroma key</li>
             * <li>complex: background replacement</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>complex</p>
             */
            public Builder mattingType(String mattingType) {
                this.mattingType = mattingType;
                return this;
            }

            /**
             * <p>LIVE, live streaming</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;positionY&quot;:&quot;0.0&quot;,&quot;positionX&quot;:&quot;0.0&quot;,&quot;heightNormalized&quot;:&quot;0.5&quot;}&quot;</p>
             */
            public Builder mediaLayout(String mediaLayout) {
                this.mediaLayout = mediaLayout;
                return this;
            }

            /**
             * <p>The ID of the multimedia material in ApsaraVideo VOD.</p>
             * 
             * <strong>example:</strong>
             * <p>d0eb493192c771efba644531858c0102</p>
             */
            public Builder mediaResourceId(String mediaResourceId) {
                this.mediaResourceId = mediaResourceId;
                return this;
            }

            /**
             * <p>The URL of the multimedia material.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://testbucket.xx.com/2.jpg">https://testbucket.xx.com/2.jpg</a></p>
             */
            public Builder mediaResourceUrl(String mediaResourceUrl) {
                this.mediaResourceUrl = mediaResourceUrl;
                return this;
            }

            /**
             * <p>The type of the multimedia material. Valid values:</p>
             * <ul>
             * <li>VOD: a video in ApsaraVideo VOD</li>
             * <li>PIC: an image</li>
             * <li>LIVE: a live stream</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VOD</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The IDs of the bound rules.</p>
             */
            public Builder ruleIds(RuleIds ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * <p>The ID of the virtual studio template.</p>
             * 
             * <strong>example:</strong>
             * <p>24654384-f5ac-40ea-823b-74e85a61dd9f</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the virtual studio template. The name is the same as the value of the StudioName parameter that was specified when you called the CreateLiveAiStudio operation to create the virtual studio template.</p>
             * 
             * <strong>example:</strong>
             * <p>studio1</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The preview width.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public SubtitleConfig build() {
                return new SubtitleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveAIStudioResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAIStudioResponseBody</p>
     */
    public static class StudioConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubtitleConfig")
        private java.util.List<SubtitleConfig> subtitleConfig;

        private StudioConfigs(Builder builder) {
            this.subtitleConfig = builder.subtitleConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StudioConfigs create() {
            return builder().build();
        }

        /**
         * @return subtitleConfig
         */
        public java.util.List<SubtitleConfig> getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public static final class Builder {
            private java.util.List<SubtitleConfig> subtitleConfig; 

            private Builder() {
            } 

            private Builder(StudioConfigs model) {
                this.subtitleConfig = model.subtitleConfig;
            } 

            /**
             * SubtitleConfig.
             */
            public Builder subtitleConfig(java.util.List<SubtitleConfig> subtitleConfig) {
                this.subtitleConfig = subtitleConfig;
                return this;
            }

            public StudioConfigs build() {
                return new StudioConfigs(this);
            } 

        } 

    }
}
