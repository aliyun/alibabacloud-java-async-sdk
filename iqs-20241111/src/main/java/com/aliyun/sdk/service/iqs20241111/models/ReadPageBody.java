// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link ReadPageBody} extends {@link TeaModel}
 *
 * <p>ReadPageBody</p>
 */
public class ReadPageBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("formats")
    private java.util.List<String> formats;

    @com.aliyun.core.annotation.NameInMap("location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("maxAge")
    private Integer maxAge;

    @com.aliyun.core.annotation.NameInMap("pageTimeout")
    private Integer pageTimeout;

    @com.aliyun.core.annotation.NameInMap("readability")
    private Readability readability;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private ReadPageBody(Builder builder) {
        this.formats = builder.formats;
        this.location = builder.location;
        this.maxAge = builder.maxAge;
        this.pageTimeout = builder.pageTimeout;
        this.readability = builder.readability;
        this.timeout = builder.timeout;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadPageBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return formats
     */
    public java.util.List<String> getFormats() {
        return this.formats;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return maxAge
     */
    public Integer getMaxAge() {
        return this.maxAge;
    }

    /**
     * @return pageTimeout
     */
    public Integer getPageTimeout() {
        return this.pageTimeout;
    }

    /**
     * @return readability
     */
    public Readability getReadability() {
        return this.readability;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private java.util.List<String> formats; 
        private String location; 
        private Integer maxAge; 
        private Integer pageTimeout; 
        private Readability readability; 
        private Integer timeout; 
        private String url; 

        private Builder() {
        } 

        private Builder(ReadPageBody model) {
            this.formats = model.formats;
            this.location = model.location;
            this.maxAge = model.maxAge;
            this.pageTimeout = model.pageTimeout;
            this.readability = model.readability;
            this.timeout = model.timeout;
            this.url = model.url;
        } 

        /**
         * <p>The format of the parsing result.</p>
         * <ul>
         * <li>rawHtml: the HTML of the target website.</li>
         * <li>html: the page content processed based on readabilityMode.</li>
         * <li>markdown: the Markdown content converted from HTML.</li>
         * <li>text: the text content extracted from HTML.</li>
         * </ul>
         */
        public Builder formats(java.util.List<String> formats) {
            this.formats = formats;
            return this;
        }

        /**
         * <p>You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>The maximum cache validity period. Unit: seconds. Default value: 1296000.</p>
         * <ul>
         * <li><p>If the cache duration is less than the value of maxAge, cached content is returned.</p>
         * </li>
         * <li><p>If the value of maxAge is 0, caching is not used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1296000</p>
         */
        public Builder maxAge(Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        /**
         * <p>The URL read timeout period. The value of pageTimeout must be less than the value of timeout.</p>
         * <p>Default value: 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder pageTimeout(Integer pageTimeout) {
            this.pageTimeout = pageTimeout;
            return this;
        }

        /**
         * <p>The readability configuration for the parsing result.</p>
         */
        public Builder readability(Readability readability) {
            this.readability = readability;
            return this;
        }

        /**
         * <p>The end-to-end processing timeout period. Unit: ms.</p>
         * <p>Valid values: [0, 180000].</p>
         * <p>Default value: 60000.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The target URL to parse. The value must start with http:// or https://.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://help.aliyun.com/document_detail/2837301.html?spm=a2c4g.11186623.help-menu-2837261.d_0_0_0.59ed3e95CppOt2&scm=20140722.H_2837301._.OR_help-T_cn~zh-V_1">https://help.aliyun.com/document_detail/2837301.html?spm=a2c4g.11186623.help-menu-2837261.d_0_0_0.59ed3e95CppOt2&amp;scm=20140722.H_2837301._.OR_help-T_cn~zh-V_1</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public ReadPageBody build() {
            return new ReadPageBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadPageBody} extends {@link TeaModel}
     *
     * <p>ReadPageBody</p>
     */
    public static class Readability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("excludeAllImages")
        private Boolean excludeAllImages;

        @com.aliyun.core.annotation.NameInMap("excludeAllLinks")
        private Boolean excludeAllLinks;

        @com.aliyun.core.annotation.NameInMap("excludedTags")
        private java.util.List<String> excludedTags;

        @com.aliyun.core.annotation.NameInMap("readabilityMode")
        private String readabilityMode;

        private Readability(Builder builder) {
            this.excludeAllImages = builder.excludeAllImages;
            this.excludeAllLinks = builder.excludeAllLinks;
            this.excludedTags = builder.excludedTags;
            this.readabilityMode = builder.readabilityMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Readability create() {
            return builder().build();
        }

        /**
         * @return excludeAllImages
         */
        public Boolean getExcludeAllImages() {
            return this.excludeAllImages;
        }

        /**
         * @return excludeAllLinks
         */
        public Boolean getExcludeAllLinks() {
            return this.excludeAllLinks;
        }

        /**
         * @return excludedTags
         */
        public java.util.List<String> getExcludedTags() {
            return this.excludedTags;
        }

        /**
         * @return readabilityMode
         */
        public String getReadabilityMode() {
            return this.readabilityMode;
        }

        public static final class Builder {
            private Boolean excludeAllImages; 
            private Boolean excludeAllLinks; 
            private java.util.List<String> excludedTags; 
            private String readabilityMode; 

            private Builder() {
            } 

            private Builder(Readability model) {
                this.excludeAllImages = model.excludeAllImages;
                this.excludeAllLinks = model.excludeAllLinks;
                this.excludedTags = model.excludedTags;
                this.readabilityMode = model.readabilityMode;
            } 

            /**
             * <p>Specifies whether to exclude all images.</p>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder excludeAllImages(Boolean excludeAllImages) {
                this.excludeAllImages = excludeAllImages;
                return this;
            }

            /**
             * <p>Specifies whether to exclude all links.</p>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder excludeAllLinks(Boolean excludeAllLinks) {
                this.excludeAllLinks = excludeAllLinks;
                return this;
            }

            /**
             * <p>The tags to exclude.</p>
             */
            public Builder excludedTags(java.util.List<String> excludedTags) {
                this.excludedTags = excludedTags;
                return this;
            }

            /**
             * <p>Valid values:</p>
             * <ul>
             * <li><p>none: does not remove any information. Default value: none.</p>
             * </li>
             * <li><p>normal: removes irrelevant information from the target page, such as headers, footers, and navigation elements, based on a proprietary algorithm.</p>
             * </li>
             * <li><p>article: extracts the main body content of the website based on a proprietary algorithm. This mode is suitable for blogs and news websites, but not for directory or navigation pages.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder readabilityMode(String readabilityMode) {
                this.readabilityMode = readabilityMode;
                return this;
            }

            public Readability build() {
                return new Readability(this);
            } 

        } 

    }
}
