// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeWebCacheConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebCacheConfigsResponseBody</p>
 */
public class DescribeWebCacheConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainCacheConfigs")
    private java.util.List<DomainCacheConfigs> domainCacheConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWebCacheConfigsResponseBody(Builder builder) {
        this.domainCacheConfigs = builder.domainCacheConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebCacheConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainCacheConfigs
     */
    public java.util.List<DomainCacheConfigs> getDomainCacheConfigs() {
        return this.domainCacheConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DomainCacheConfigs> domainCacheConfigs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeWebCacheConfigsResponseBody model) {
            this.domainCacheConfigs = model.domainCacheConfigs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of Static Page Caching configurations.</p>
         */
        public Builder domainCacheConfigs(java.util.List<DomainCacheConfigs> domainCacheConfigs) {
            this.domainCacheConfigs = domainCacheConfigs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6623EA1F-30FB-5BC8-BEC9-74D55F6F08F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebCacheConfigsResponseBody build() {
            return new DescribeWebCacheConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebCacheConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebCacheConfigsResponseBody</p>
     */
    public static class CustomRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheTtl")
        private Long cacheTtl;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private CustomRules(Builder builder) {
            this.cacheTtl = builder.cacheTtl;
            this.mode = builder.mode;
            this.name = builder.name;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomRules create() {
            return builder().build();
        }

        /**
         * @return cacheTtl
         */
        public Long getCacheTtl() {
            return this.cacheTtl;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private Long cacheTtl; 
            private String mode; 
            private String name; 
            private String uri; 

            private Builder() {
            } 

            private Builder(CustomRules model) {
                this.cacheTtl = model.cacheTtl;
                this.mode = model.mode;
                this.name = model.name;
                this.uri = model.uri;
            } 

            /**
             * <p>The expiration time of the page cache. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder cacheTtl(Long cacheTtl) {
                this.cacheTtl = cacheTtl;
                return this;
            }

            /**
             * <p>The cache mode. Valid values:</p>
             * <ul>
             * <li><strong>standard</strong>: The standard cache mode is used.</li>
             * <li><strong>aggressive</strong>: The enhanced cache mode is used.</li>
             * <li><strong>bypass</strong>: No data is cached.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>c1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The path to the cached page.</p>
             * 
             * <strong>example:</strong>
             * <p>/blog/</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public CustomRules build() {
                return new CustomRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWebCacheConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebCacheConfigsResponseBody</p>
     */
    public static class DomainCacheConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomRules")
        private java.util.List<CustomRules> customRules;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private DomainCacheConfigs(Builder builder) {
            this.customRules = builder.customRules;
            this.domain = builder.domain;
            this.enable = builder.enable;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainCacheConfigs create() {
            return builder().build();
        }

        /**
         * @return customRules
         */
        public java.util.List<CustomRules> getCustomRules() {
            return this.customRules;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private java.util.List<CustomRules> customRules; 
            private String domain; 
            private Integer enable; 
            private String mode; 

            private Builder() {
            } 

            private Builder(DomainCacheConfigs model) {
                this.customRules = model.customRules;
                this.domain = model.domain;
                this.enable = model.enable;
                this.mode = model.mode;
            } 

            /**
             * <p>An array that consists of custom caching rules.</p>
             */
            public Builder customRules(java.util.List<CustomRules> customRules) {
                this.customRules = customRules;
                return this;
            }

            /**
             * <p>The domain name of the website.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The status of the Static Page Caching policy. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: enabled</li>
             * <li><strong>0</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The cache mode. Valid values:</p>
             * <ul>
             * <li><strong>standard</strong>: The standard cache mode is used.</li>
             * <li><strong>aggressive</strong>: The enhanced cache mode is used.</li>
             * <li><strong>bypass</strong>: No data is cached.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>bypass</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public DomainCacheConfigs build() {
                return new DomainCacheConfigs(this);
            } 

        } 

    }
}
