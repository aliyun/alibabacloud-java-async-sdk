// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceServiceConfigHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceServiceConfigHistoriesResponseBody</p>
 */
public class ListInstanceServiceConfigHistoriesResponseBody extends TeaModel {
    @NameInMap("ConfigureHistoryList")
    private ConfigureHistoryList configureHistoryList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private ListInstanceServiceConfigHistoriesResponseBody(Builder builder) {
        this.configureHistoryList = builder.configureHistoryList;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceServiceConfigHistoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return configureHistoryList
     */
    public ConfigureHistoryList getConfigureHistoryList() {
        return this.configureHistoryList;
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
        private ConfigureHistoryList configureHistoryList; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Long totalRecordCount; 

        /**
         * ConfigureHistoryList.
         */
        public Builder configureHistoryList(ConfigureHistoryList configureHistoryList) {
            this.configureHistoryList = configureHistoryList;
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

        public ListInstanceServiceConfigHistoriesResponseBody build() {
            return new ListInstanceServiceConfigHistoriesResponseBody(this);
        } 

    } 

    public static class Config extends TeaModel {
        @NameInMap("ConfigureName")
        private String configureName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Effective")
        private String effective;

        @NameInMap("NewValue")
        private String newValue;

        @NameInMap("OldValue")
        private String oldValue;

        private Config(Builder builder) {
            this.configureName = builder.configureName;
            this.createTime = builder.createTime;
            this.effective = builder.effective;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return effective
         */
        public String getEffective() {
            return this.effective;
        }

        /**
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        public static final class Builder {
            private String configureName; 
            private String createTime; 
            private String effective; 
            private String newValue; 
            private String oldValue; 

            /**
             * ConfigureName.
             */
            public Builder configureName(String configureName) {
                this.configureName = configureName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Effective.
             */
            public Builder effective(String effective) {
                this.effective = effective;
                return this;
            }

            /**
             * NewValue.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * OldValue.
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class ConfigureHistoryList extends TeaModel {
        @NameInMap("Config")
        private java.util.List < Config> config;

        private ConfigureHistoryList(Builder builder) {
            this.config = builder.config;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigureHistoryList create() {
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

            public ConfigureHistoryList build() {
                return new ConfigureHistoryList(this);
            } 

        } 

    }
}
