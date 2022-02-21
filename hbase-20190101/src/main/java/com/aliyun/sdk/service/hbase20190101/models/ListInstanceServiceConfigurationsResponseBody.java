// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceServiceConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceServiceConfigurationsResponseBody</p>
 */
public class ListInstanceServiceConfigurationsResponseBody extends TeaModel {
    @NameInMap("ConfigureList")
    private ConfigureList configureList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private ListInstanceServiceConfigurationsResponseBody(Builder builder) {
        this.configureList = builder.configureList;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceServiceConfigurationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configureList
     */
    public ConfigureList getConfigureList() {
        return this.configureList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private ConfigureList configureList; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Long totalRecordCount; 

        /**
         * ConfigureList.
         */
        public Builder configureList(ConfigureList configureList) {
            this.configureList = configureList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListInstanceServiceConfigurationsResponseBody build() {
            return new ListInstanceServiceConfigurationsResponseBody(this);
        } 

    } 

    public static class Config extends TeaModel {
        @NameInMap("ConfigureName")
        private String configureName;

        @NameInMap("ConfigureUnit")
        private String configureUnit;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("NeedRestart")
        private String needRestart;

        @NameInMap("RunningValue")
        private String runningValue;

        @NameInMap("ValueRange")
        private String valueRange;

        private Config(Builder builder) {
            this.configureName = builder.configureName;
            this.configureUnit = builder.configureUnit;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.needRestart = builder.needRestart;
            this.runningValue = builder.runningValue;
            this.valueRange = builder.valueRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return configureName
         */
        public String getConfigureName() {
            return this.configureName;
        }

        /**
         * @return configureUnit
         */
        public String getConfigureUnit() {
            return this.configureUnit;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return needRestart
         */
        public String getNeedRestart() {
            return this.needRestart;
        }

        /**
         * @return runningValue
         */
        public String getRunningValue() {
            return this.runningValue;
        }

        /**
         * @return valueRange
         */
        public String getValueRange() {
            return this.valueRange;
        }

        public static final class Builder {
            private String configureName; 
            private String configureUnit; 
            private String defaultValue; 
            private String description; 
            private String needRestart; 
            private String runningValue; 
            private String valueRange; 

            /**
             * ConfigureName.
             */
            public Builder configureName(String configureName) {
                this.configureName = configureName;
                return this;
            }

            /**
             * ConfigureUnit.
             */
            public Builder configureUnit(String configureUnit) {
                this.configureUnit = configureUnit;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * NeedRestart.
             */
            public Builder needRestart(String needRestart) {
                this.needRestart = needRestart;
                return this;
            }

            /**
             * RunningValue.
             */
            public Builder runningValue(String runningValue) {
                this.runningValue = runningValue;
                return this;
            }

            /**
             * ValueRange.
             */
            public Builder valueRange(String valueRange) {
                this.valueRange = valueRange;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class ConfigureList extends TeaModel {
        @NameInMap("Config")
        private java.util.List < Config> config;

        private ConfigureList(Builder builder) {
            this.config = builder.config;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigureList create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.List < Config> getConfig() {
            return this.config;
        }

        public static final class Builder {
            private java.util.List < Config> config; 

            /**
             * Config.
             */
            public Builder config(java.util.List < Config> config) {
                this.config = config;
                return this;
            }

            public ConfigureList build() {
                return new ConfigureList(this);
            } 

        } 

    }
}
