// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebCacheConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebCacheConfigsResponseBody</p>
 */
public class DescribeWebCacheConfigsResponseBody extends TeaModel {
    @NameInMap("DomainCacheConfigs")
    private java.util.List < DomainCacheConfigs> domainCacheConfigs;

    @NameInMap("RequestId")
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

    /**
     * @return domainCacheConfigs
     */
    public java.util.List < DomainCacheConfigs> getDomainCacheConfigs() {
        return this.domainCacheConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainCacheConfigs> domainCacheConfigs; 
        private String requestId; 

        /**
         * An array that consists of Static Page Caching configurations.
         */
        public Builder domainCacheConfigs(java.util.List < DomainCacheConfigs> domainCacheConfigs) {
            this.domainCacheConfigs = domainCacheConfigs;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebCacheConfigsResponseBody build() {
            return new DescribeWebCacheConfigsResponseBody(this);
        } 

    } 

    public static class CustomRules extends TeaModel {
        @NameInMap("CacheTtl")
        private Long cacheTtl;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Name")
        private String name;

        @NameInMap("Uri")
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

            /**
             * The expiration time of the page cache. Unit: seconds.
             */
            public Builder cacheTtl(Long cacheTtl) {
                this.cacheTtl = cacheTtl;
                return this;
            }

            /**
             * The cache mode. Valid values:
             * <p>
             * 
             * *   **standard**: The standard cache mode is used.
             * *   **aggressive**: The enhanced cache mode is used.
             * *   **bypass**: No data is cached.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The path to the cached page.
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
    public static class DomainCacheConfigs extends TeaModel {
        @NameInMap("CustomRules")
        private java.util.List < CustomRules> customRules;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Enable")
        private Integer enable;

        @NameInMap("Mode")
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
        public java.util.List < CustomRules> getCustomRules() {
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
            private java.util.List < CustomRules> customRules; 
            private String domain; 
            private Integer enable; 
            private String mode; 

            /**
             * An array that consists of custom caching rules.
             */
            public Builder customRules(java.util.List < CustomRules> customRules) {
                this.customRules = customRules;
                return this;
            }

            /**
             * The domain name of the website.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The status of the Static Page Caching policy. Valid values:
             * <p>
             * 
             * *   **1**: enabled
             * *   **0**: disabled
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The cache mode. Valid values:
             * <p>
             * 
             * *   **standard**: The standard cache mode is used.
             * *   **aggressive**: The enhanced cache mode is used.
             * *   **bypass**: No data is cached.
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
