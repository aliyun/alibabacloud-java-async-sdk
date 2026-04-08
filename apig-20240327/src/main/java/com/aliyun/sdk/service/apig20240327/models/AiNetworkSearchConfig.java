// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AiNetworkSearchConfig} extends {@link TeaModel}
 *
 * <p>AiNetworkSearchConfig</p>
 */
public class AiNetworkSearchConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("defaultEnable")
    private Boolean defaultEnable;

    @com.aliyun.core.annotation.NameInMap("defaultLang")
    private String defaultLang;

    @com.aliyun.core.annotation.NameInMap("needReference")
    private Boolean needReference;

    @com.aliyun.core.annotation.NameInMap("pluginStatus")
    private AiPluginStatus pluginStatus;

    @com.aliyun.core.annotation.NameInMap("referenceFormat")
    private String referenceFormat;

    @com.aliyun.core.annotation.NameInMap("referenceLocation")
    private String referenceLocation;

    @com.aliyun.core.annotation.NameInMap("searchEngineConfig")
    private AiNetworkConfigSearchEngine searchEngineConfig;

    @com.aliyun.core.annotation.NameInMap("searchFrom")
    private java.util.List<AiNetworkConfigSearchEngine> searchFrom;

    @com.aliyun.core.annotation.NameInMap("searchRewrite")
    private SearchRewrite searchRewrite;

    private AiNetworkSearchConfig(Builder builder) {
        this.defaultEnable = builder.defaultEnable;
        this.defaultLang = builder.defaultLang;
        this.needReference = builder.needReference;
        this.pluginStatus = builder.pluginStatus;
        this.referenceFormat = builder.referenceFormat;
        this.referenceLocation = builder.referenceLocation;
        this.searchEngineConfig = builder.searchEngineConfig;
        this.searchFrom = builder.searchFrom;
        this.searchRewrite = builder.searchRewrite;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiNetworkSearchConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultEnable
     */
    public Boolean getDefaultEnable() {
        return this.defaultEnable;
    }

    /**
     * @return defaultLang
     */
    public String getDefaultLang() {
        return this.defaultLang;
    }

    /**
     * @return needReference
     */
    public Boolean getNeedReference() {
        return this.needReference;
    }

    /**
     * @return pluginStatus
     */
    public AiPluginStatus getPluginStatus() {
        return this.pluginStatus;
    }

    /**
     * @return referenceFormat
     */
    public String getReferenceFormat() {
        return this.referenceFormat;
    }

    /**
     * @return referenceLocation
     */
    public String getReferenceLocation() {
        return this.referenceLocation;
    }

    /**
     * @return searchEngineConfig
     */
    public AiNetworkConfigSearchEngine getSearchEngineConfig() {
        return this.searchEngineConfig;
    }

    /**
     * @return searchFrom
     */
    public java.util.List<AiNetworkConfigSearchEngine> getSearchFrom() {
        return this.searchFrom;
    }

    /**
     * @return searchRewrite
     */
    public SearchRewrite getSearchRewrite() {
        return this.searchRewrite;
    }

    public static final class Builder {
        private Boolean defaultEnable; 
        private String defaultLang; 
        private Boolean needReference; 
        private AiPluginStatus pluginStatus; 
        private String referenceFormat; 
        private String referenceLocation; 
        private AiNetworkConfigSearchEngine searchEngineConfig; 
        private java.util.List<AiNetworkConfigSearchEngine> searchFrom; 
        private SearchRewrite searchRewrite; 

        private Builder() {
        } 

        private Builder(AiNetworkSearchConfig model) {
            this.defaultEnable = model.defaultEnable;
            this.defaultLang = model.defaultLang;
            this.needReference = model.needReference;
            this.pluginStatus = model.pluginStatus;
            this.referenceFormat = model.referenceFormat;
            this.referenceLocation = model.referenceLocation;
            this.searchEngineConfig = model.searchEngineConfig;
            this.searchFrom = model.searchFrom;
            this.searchRewrite = model.searchRewrite;
        } 

        /**
         * defaultEnable.
         */
        public Builder defaultEnable(Boolean defaultEnable) {
            this.defaultEnable = defaultEnable;
            return this;
        }

        /**
         * defaultLang.
         */
        public Builder defaultLang(String defaultLang) {
            this.defaultLang = defaultLang;
            return this;
        }

        /**
         * needReference.
         */
        public Builder needReference(Boolean needReference) {
            this.needReference = needReference;
            return this;
        }

        /**
         * pluginStatus.
         */
        public Builder pluginStatus(AiPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }

        /**
         * referenceFormat.
         */
        public Builder referenceFormat(String referenceFormat) {
            this.referenceFormat = referenceFormat;
            return this;
        }

        /**
         * referenceLocation.
         */
        public Builder referenceLocation(String referenceLocation) {
            this.referenceLocation = referenceLocation;
            return this;
        }

        /**
         * searchEngineConfig.
         */
        public Builder searchEngineConfig(AiNetworkConfigSearchEngine searchEngineConfig) {
            this.searchEngineConfig = searchEngineConfig;
            return this;
        }

        /**
         * searchFrom.
         */
        public Builder searchFrom(java.util.List<AiNetworkConfigSearchEngine> searchFrom) {
            this.searchFrom = searchFrom;
            return this;
        }

        /**
         * searchRewrite.
         */
        public Builder searchRewrite(SearchRewrite searchRewrite) {
            this.searchRewrite = searchRewrite;
            return this;
        }

        public AiNetworkSearchConfig build() {
            return new AiNetworkSearchConfig(this);
        } 

    } 

    /**
     * 
     * {@link AiNetworkSearchConfig} extends {@link TeaModel}
     *
     * <p>AiNetworkSearchConfig</p>
     */
    public static class SearchRewrite extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("maxCount")
        private Integer maxCount;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("timeoutMillisecond")
        private Integer timeoutMillisecond;

        private SearchRewrite(Builder builder) {
            this.enable = builder.enable;
            this.maxCount = builder.maxCount;
            this.modelName = builder.modelName;
            this.serviceId = builder.serviceId;
            this.timeoutMillisecond = builder.timeoutMillisecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchRewrite create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return maxCount
         */
        public Integer getMaxCount() {
            return this.maxCount;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return timeoutMillisecond
         */
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public static final class Builder {
            private Boolean enable; 
            private Integer maxCount; 
            private String modelName; 
            private String serviceId; 
            private Integer timeoutMillisecond; 

            private Builder() {
            } 

            private Builder(SearchRewrite model) {
                this.enable = model.enable;
                this.maxCount = model.maxCount;
                this.modelName = model.modelName;
                this.serviceId = model.serviceId;
                this.timeoutMillisecond = model.timeoutMillisecond;
            } 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * maxCount.
             */
            public Builder maxCount(Integer maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * timeoutMillisecond.
             */
            public Builder timeoutMillisecond(Integer timeoutMillisecond) {
                this.timeoutMillisecond = timeoutMillisecond;
                return this;
            }

            public SearchRewrite build() {
                return new SearchRewrite(this);
            } 

        } 

    }
}
