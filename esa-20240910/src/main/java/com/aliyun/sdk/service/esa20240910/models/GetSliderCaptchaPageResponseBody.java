// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetSliderCaptchaPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetSliderCaptchaPageResponseBody</p>
 */
public class GetSliderCaptchaPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private Configs configs;

    @com.aliyun.core.annotation.NameInMap("CustomContent")
    private String customContent;

    @com.aliyun.core.annotation.NameInMap("ForceLanguage")
    private String forceLanguage;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteIds")
    private java.util.List<Long> siteIds;

    private GetSliderCaptchaPageResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.customContent = builder.customContent;
        this.forceLanguage = builder.forceLanguage;
        this.id = builder.id;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.siteIds = builder.siteIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSliderCaptchaPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public Configs getConfigs() {
        return this.configs;
    }

    /**
     * @return customContent
     */
    public String getCustomContent() {
        return this.customContent;
    }

    /**
     * @return forceLanguage
     */
    public String getForceLanguage() {
        return this.forceLanguage;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteIds
     */
    public java.util.List<Long> getSiteIds() {
        return this.siteIds;
    }

    public static final class Builder {
        private Configs configs; 
        private String customContent; 
        private String forceLanguage; 
        private Long id; 
        private String name; 
        private String requestId; 
        private java.util.List<Long> siteIds; 

        private Builder() {
        } 

        private Builder(GetSliderCaptchaPageResponseBody model) {
            this.configs = model.configs;
            this.customContent = model.customContent;
            this.forceLanguage = model.forceLanguage;
            this.id = model.id;
            this.name = model.name;
            this.requestId = model.requestId;
            this.siteIds = model.siteIds;
        } 

        /**
         * <p>The predefined configurations for the custom slider page.</p>
         */
        public Builder configs(Configs configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The custom slider configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;language&quot;:&quot;ko&quot;,&quot;description&quot;:&quot;더 나은 경험을 위해 웹 페이지에 접속하기 전에 슬라이드하여 인증을 완료해 주세요.&quot;,&quot;captcha_color&quot;:&quot;#28870d&quot;,&quot;show_trace_id&quot;:true,&quot;show_footer&quot;:true,&quot;mandatory_lang&quot;:false}]</p>
         */
        public Builder customContent(String customContent) {
            this.customContent = customContent;
            return this;
        }

        /**
         * <p>The forced language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder forceLanguage(String forceLanguage) {
            this.forceLanguage = forceLanguage;
            return this;
        }

        /**
         * <p>The ID of the custom slider page.</p>
         * 
         * <strong>example:</strong>
         * <p>50000001</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the custom slider page.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of bound site IDs.</p>
         */
        public Builder siteIds(java.util.List<Long> siteIds) {
            this.siteIds = siteIds;
            return this;
        }

        public GetSliderCaptchaPageResponseBody build() {
            return new GetSliderCaptchaPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSliderCaptchaPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetSliderCaptchaPageResponseBody</p>
     */
    public static class En extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShowFooter")
        private Boolean showFooter;

        @com.aliyun.core.annotation.NameInMap("ShowRequestId")
        private Boolean showRequestId;

        @com.aliyun.core.annotation.NameInMap("SliderColor")
        private String sliderColor;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private En(Builder builder) {
            this.showFooter = builder.showFooter;
            this.showRequestId = builder.showRequestId;
            this.sliderColor = builder.sliderColor;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static En create() {
            return builder().build();
        }

        /**
         * @return showFooter
         */
        public Boolean getShowFooter() {
            return this.showFooter;
        }

        /**
         * @return showRequestId
         */
        public Boolean getShowRequestId() {
            return this.showRequestId;
        }

        /**
         * @return sliderColor
         */
        public String getSliderColor() {
            return this.sliderColor;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Boolean showFooter; 
            private Boolean showRequestId; 
            private String sliderColor; 
            private String title; 

            private Builder() {
            } 

            private Builder(En model) {
                this.showFooter = model.showFooter;
                this.showRequestId = model.showRequestId;
                this.sliderColor = model.sliderColor;
                this.title = model.title;
            } 

            /**
             * <p>Specifies whether to display the footer.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder showFooter(Boolean showFooter) {
                this.showFooter = showFooter;
                return this;
            }

            /**
             * <p>Specifies whether to display the request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder showRequestId(Boolean showRequestId) {
                this.showRequestId = showRequestId;
                return this;
            }

            /**
             * <p>The slider color.</p>
             * 
             * <strong>example:</strong>
             * <p>#FFFFFF</p>
             */
            public Builder sliderColor(String sliderColor) {
                this.sliderColor = sliderColor;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public En build() {
                return new En(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSliderCaptchaPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetSliderCaptchaPageResponseBody</p>
     */
    public static class Zh extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShowFooter")
        private Boolean showFooter;

        @com.aliyun.core.annotation.NameInMap("ShowRequestId")
        private Boolean showRequestId;

        @com.aliyun.core.annotation.NameInMap("SliderColor")
        private String sliderColor;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Zh(Builder builder) {
            this.showFooter = builder.showFooter;
            this.showRequestId = builder.showRequestId;
            this.sliderColor = builder.sliderColor;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zh create() {
            return builder().build();
        }

        /**
         * @return showFooter
         */
        public Boolean getShowFooter() {
            return this.showFooter;
        }

        /**
         * @return showRequestId
         */
        public Boolean getShowRequestId() {
            return this.showRequestId;
        }

        /**
         * @return sliderColor
         */
        public String getSliderColor() {
            return this.sliderColor;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Boolean showFooter; 
            private Boolean showRequestId; 
            private String sliderColor; 
            private String title; 

            private Builder() {
            } 

            private Builder(Zh model) {
                this.showFooter = model.showFooter;
                this.showRequestId = model.showRequestId;
                this.sliderColor = model.sliderColor;
                this.title = model.title;
            } 

            /**
             * <p>Specifies whether to display the footer.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder showFooter(Boolean showFooter) {
                this.showFooter = showFooter;
                return this;
            }

            /**
             * <p>Specifies whether to display the request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder showRequestId(Boolean showRequestId) {
                this.showRequestId = showRequestId;
                return this;
            }

            /**
             * <p>The slider color.</p>
             * 
             * <strong>example:</strong>
             * <p>#FFFFFF</p>
             */
            public Builder sliderColor(String sliderColor) {
                this.sliderColor = sliderColor;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Zh build() {
                return new Zh(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSliderCaptchaPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetSliderCaptchaPageResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("En")
        private En en;

        @com.aliyun.core.annotation.NameInMap("Zh")
        private Zh zh;

        private Configs(Builder builder) {
            this.en = builder.en;
            this.zh = builder.zh;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return en
         */
        public En getEn() {
            return this.en;
        }

        /**
         * @return zh
         */
        public Zh getZh() {
            return this.zh;
        }

        public static final class Builder {
            private En en; 
            private Zh zh; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.en = model.en;
                this.zh = model.zh;
            } 

            /**
             * <p>The predefined English style.</p>
             */
            public Builder en(En en) {
                this.en = en;
                return this;
            }

            /**
             * <p>The predefined Chinese style.</p>
             */
            public Builder zh(Zh zh) {
                this.zh = zh;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
