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
         * formats.
         */
        public Builder formats(java.util.List<String> formats) {
            this.formats = formats;
            return this;
        }

        /**
         * location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * maxAge.
         */
        public Builder maxAge(Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        /**
         * pageTimeout.
         */
        public Builder pageTimeout(Integer pageTimeout) {
            this.pageTimeout = pageTimeout;
            return this;
        }

        /**
         * readability.
         */
        public Builder readability(Readability readability) {
            this.readability = readability;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
             * excludeAllImages.
             */
            public Builder excludeAllImages(Boolean excludeAllImages) {
                this.excludeAllImages = excludeAllImages;
                return this;
            }

            /**
             * excludeAllLinks.
             */
            public Builder excludeAllLinks(Boolean excludeAllLinks) {
                this.excludeAllLinks = excludeAllLinks;
                return this;
            }

            /**
             * excludedTags.
             */
            public Builder excludedTags(java.util.List<String> excludedTags) {
                this.excludedTags = excludedTags;
                return this;
            }

            /**
             * readabilityMode.
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
