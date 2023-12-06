// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductVersionResponseBody</p>
 */
public class GetProductVersionResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetProductVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public GetProductVersionResponseBody build() {
            return new GetProductVersionResponseBody(this);
        } 

    } 

    public static class Documentations extends TeaModel {
        @NameInMap("description")
        private String description;

        @NameInMap("name")
        private String name;

        @NameInMap("url")
        private String url;

        private Documentations(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Documentations create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String url; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Documentations build() {
                return new Documentations(this);
            } 

        } 

    }
    public static class ExtendedResources extends TeaModel {
        @NameInMap("description")
        private String description;

        @NameInMap("name")
        private String name;

        @NameInMap("url")
        private String url;

        private ExtendedResources(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendedResources create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String url; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ExtendedResources build() {
                return new ExtendedResources(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("continuousIntegration")
        private Boolean continuousIntegration;

        @NameInMap("description")
        private String description;

        @NameInMap("documentations")
        private java.util.List < Documentations> documentations;

        @NameInMap("extendedResources")
        private java.util.List < ExtendedResources> extendedResources;

        @NameInMap("foundationVersionUID")
        private String foundationVersionUID;

        @NameInMap("packageURL")
        private String packageURL;

        @NameInMap("platforms")
        private java.util.List < Platform > platforms;

        @NameInMap("productName")
        private String productName;

        @NameInMap("productUID")
        private String productUID;

        @NameInMap("provider")
        private String provider;

        @NameInMap("timeout")
        private Long timeout;

        @NameInMap("uid")
        private String uid;

        @NameInMap("version")
        private String version;

        private Data(Builder builder) {
            this.continuousIntegration = builder.continuousIntegration;
            this.description = builder.description;
            this.documentations = builder.documentations;
            this.extendedResources = builder.extendedResources;
            this.foundationVersionUID = builder.foundationVersionUID;
            this.packageURL = builder.packageURL;
            this.platforms = builder.platforms;
            this.productName = builder.productName;
            this.productUID = builder.productUID;
            this.provider = builder.provider;
            this.timeout = builder.timeout;
            this.uid = builder.uid;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return continuousIntegration
         */
        public Boolean getContinuousIntegration() {
            return this.continuousIntegration;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return documentations
         */
        public java.util.List < Documentations> getDocumentations() {
            return this.documentations;
        }

        /**
         * @return extendedResources
         */
        public java.util.List < ExtendedResources> getExtendedResources() {
            return this.extendedResources;
        }

        /**
         * @return foundationVersionUID
         */
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        /**
         * @return packageURL
         */
        public String getPackageURL() {
            return this.packageURL;
        }

        /**
         * @return platforms
         */
        public java.util.List < Platform > getPlatforms() {
            return this.platforms;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productUID
         */
        public String getProductUID() {
            return this.productUID;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean continuousIntegration; 
            private String description; 
            private java.util.List < Documentations> documentations; 
            private java.util.List < ExtendedResources> extendedResources; 
            private String foundationVersionUID; 
            private String packageURL; 
            private java.util.List < Platform > platforms; 
            private String productName; 
            private String productUID; 
            private String provider; 
            private Long timeout; 
            private String uid; 
            private String version; 

            /**
             * continuousIntegration.
             */
            public Builder continuousIntegration(Boolean continuousIntegration) {
                this.continuousIntegration = continuousIntegration;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * documentations.
             */
            public Builder documentations(java.util.List < Documentations> documentations) {
                this.documentations = documentations;
                return this;
            }

            /**
             * extendedResources.
             */
            public Builder extendedResources(java.util.List < ExtendedResources> extendedResources) {
                this.extendedResources = extendedResources;
                return this;
            }

            /**
             * foundationVersionUID.
             */
            public Builder foundationVersionUID(String foundationVersionUID) {
                this.foundationVersionUID = foundationVersionUID;
                return this;
            }

            /**
             * packageURL.
             */
            public Builder packageURL(String packageURL) {
                this.packageURL = packageURL;
                return this;
            }

            /**
             * platforms.
             */
            public Builder platforms(java.util.List < Platform > platforms) {
                this.platforms = platforms;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * productUID.
             */
            public Builder productUID(String productUID) {
                this.productUID = productUID;
                return this;
            }

            /**
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * timeout.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
