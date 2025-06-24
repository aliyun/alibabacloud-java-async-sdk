// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetLindormEngineConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormEngineConfigResponseBody</p>
 */
public class GetLindormEngineConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("EngineConfigs")
    private java.util.List<EngineConfigs> engineConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLindormEngineConfigResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.engineConfigs = builder.engineConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLindormEngineConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return engineConfigs
     */
    public java.util.List<EngineConfigs> getEngineConfigs() {
        return this.engineConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<EngineConfigs> engineConfigs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetLindormEngineConfigResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.engineConfigs = model.engineConfigs;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * EngineConfigs.
         */
        public Builder engineConfigs(java.util.List<EngineConfigs> engineConfigs) {
            this.engineConfigs = engineConfigs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLindormEngineConfigResponseBody build() {
            return new GetLindormEngineConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLindormEngineConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormEngineConfigResponseBody</p>
     */
    public static class ConfigItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigItemKey")
        private String configItemKey;

        @com.aliyun.core.annotation.NameInMap("ConfigItemValue")
        private String configItemValue;

        private ConfigItems(Builder builder) {
            this.configItemKey = builder.configItemKey;
            this.configItemValue = builder.configItemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigItems create() {
            return builder().build();
        }

        /**
         * @return configItemKey
         */
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        /**
         * @return configItemValue
         */
        public String getConfigItemValue() {
            return this.configItemValue;
        }

        public static final class Builder {
            private String configItemKey; 
            private String configItemValue; 

            private Builder() {
            } 

            private Builder(ConfigItems model) {
                this.configItemKey = model.configItemKey;
                this.configItemValue = model.configItemValue;
            } 

            /**
             * ConfigItemKey.
             */
            public Builder configItemKey(String configItemKey) {
                this.configItemKey = configItemKey;
                return this;
            }

            /**
             * ConfigItemValue.
             */
            public Builder configItemValue(String configItemValue) {
                this.configItemValue = configItemValue;
                return this;
            }

            public ConfigItems build() {
                return new ConfigItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLindormEngineConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormEngineConfigResponseBody</p>
     */
    public static class ConfigFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigItems")
        private java.util.List<ConfigItems> configItems;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        private ConfigFiles(Builder builder) {
            this.configItems = builder.configItems;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigFiles create() {
            return builder().build();
        }

        /**
         * @return configItems
         */
        public java.util.List<ConfigItems> getConfigItems() {
            return this.configItems;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private java.util.List<ConfigItems> configItems; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(ConfigFiles model) {
                this.configItems = model.configItems;
                this.fileName = model.fileName;
            } 

            /**
             * ConfigItems.
             */
            public Builder configItems(java.util.List<ConfigItems> configItems) {
                this.configItems = configItems;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public ConfigFiles build() {
                return new ConfigFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLindormEngineConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormEngineConfigResponseBody</p>
     */
    public static class EngineConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigFiles")
        private java.util.List<ConfigFiles> configFiles;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        private EngineConfigs(Builder builder) {
            this.configFiles = builder.configFiles;
            this.engine = builder.engine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineConfigs create() {
            return builder().build();
        }

        /**
         * @return configFiles
         */
        public java.util.List<ConfigFiles> getConfigFiles() {
            return this.configFiles;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        public static final class Builder {
            private java.util.List<ConfigFiles> configFiles; 
            private String engine; 

            private Builder() {
            } 

            private Builder(EngineConfigs model) {
                this.configFiles = model.configFiles;
                this.engine = model.engine;
            } 

            /**
             * ConfigFiles.
             */
            public Builder configFiles(java.util.List<ConfigFiles> configFiles) {
                this.configFiles = configFiles;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            public EngineConfigs build() {
                return new EngineConfigs(this);
            } 

        } 

    }
}
