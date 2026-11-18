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
 * {@link ReadPageScrapeBody} extends {@link TeaModel}
 *
 * <p>ReadPageScrapeBody</p>
 */
public class ReadPageScrapeBody extends TeaModel {
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

    private ReadPageScrapeBody(Builder builder) {
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

    public static ReadPageScrapeBody create() {
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

        private Builder(ReadPageScrapeBody model) {
            this.formats = model.formats;
            this.location = model.location;
            this.maxAge = model.maxAge;
            this.pageTimeout = model.pageTimeout;
            this.readability = model.readability;
            this.timeout = model.timeout;
            this.url = model.url;
        } 

        /**
         * <p>The formats of the parsed result. Valid values:</p>
         * <ul>
         * <li>rawHtml: The HTML of the target site.</li>
         * <li>html: The page content processed based on the readabilityMode.</li>
         * <li>markdown: The Markdown content converted from the HTML.</li>
         * <li>text: The text content in the HTML.</li>
         * <li>screenshot: The screenshot of the target site.</li>
         * </ul>
         */
        public Builder formats(java.util.List<String> formats) {
            this.formats = formats;
            return this;
        }

        /**
         * <p>This parameter is not required.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>The maximum cache duration, in seconds.</p>
         * <ul>
         * <li>If the cache duration is less than the maxAge value, the cached content is returned.</li>
         * <li>If the maxAge value is set to 0, the cache is not used.</li>
         * </ul>
         * <p>Default value: 1296000.</p>
         * 
         * <strong>example:</strong>
         * <p>1296000</p>
         */
        public Builder maxAge(Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        /**
         * <p>The timeout period for waiting for the resources of the target site to fully load. The pageTimeout value must be less than the timeout value.</p>
         * <p>Default value: 15000.</p>
         * 
         * <strong>example:</strong>
         * <p>15000</p>
         */
        public Builder pageTimeout(Integer pageTimeout) {
            this.pageTimeout = pageTimeout;
            return this;
        }

        /**
         * <p>The readability configuration of the parsed result.</p>
         */
        public Builder readability(Readability readability) {
            this.readability = readability;
            return this;
        }

        /**
         * <p>The end-to-end processing timeout period, in milliseconds.</p>
         * <p>Valid values: 0 to 180000.</p>
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
         * <p>The target URL to parse. It must start with http:// or https://.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public ReadPageScrapeBody build() {
            return new ReadPageScrapeBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadPageScrapeBody} extends {@link TeaModel}
     *
     * <p>ReadPageScrapeBody</p>
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
             * <p>Specifies whether to remove all images.</p>
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
             * <p>Specifies whether to remove all links.</p>
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
             * <p>The readability mode. Valid values:</p>
             * <ul>
             * <li>none: Does not remove any information. This is the default value.</li>
             * <li>normal: Removes irrelevant information from the target page, such as headers, footers, and navigation elements, based on a proprietary algorithm.</li>
             * <li>article: Extracts the main body content of the site based on a proprietary algorithm. This mode is suitable for blogs and news sites, but not for directory or navigation pages.</li>
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
