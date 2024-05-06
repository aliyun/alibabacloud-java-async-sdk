// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceConfigHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterServiceConfigHistoryResponseBody</p>
 */
public class ListClusterServiceConfigHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigHistoryList")
    private ConfigHistoryList configHistoryList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListClusterServiceConfigHistoryResponseBody(Builder builder) {
        this.configHistoryList = builder.configHistoryList;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterServiceConfigHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return configHistoryList
     */
    public ConfigHistoryList getConfigHistoryList() {
        return this.configHistoryList;
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
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private ConfigHistoryList configHistoryList; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * ConfigHistoryList.
         */
        public Builder configHistoryList(ConfigHistoryList configHistoryList) {
            this.configHistoryList = configHistoryList;
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
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListClusterServiceConfigHistoryResponseBody build() {
            return new ListClusterServiceConfigHistoryResponseBody(this);
        } 

    } 

    public static class ConfigHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Effective")
        private String effective;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewValue")
        private String newValue;

        @com.aliyun.core.annotation.NameInMap("OldValue")
        private String oldValue;

        private ConfigHistory(Builder builder) {
            this.createTime = builder.createTime;
            this.effective = builder.effective;
            this.name = builder.name;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigHistory create() {
            return builder().build();
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
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String createTime; 
            private String effective; 
            private String name; 
            private String newValue; 
            private String oldValue; 

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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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

            public ConfigHistory build() {
                return new ConfigHistory(this);
            } 

        } 

    }
    public static class ConfigHistoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigHistory")
        private java.util.List < ConfigHistory> configHistory;

        private ConfigHistoryList(Builder builder) {
            this.configHistory = builder.configHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigHistoryList create() {
            return builder().build();
        }

        /**
         * @return configHistory
         */
        public java.util.List < ConfigHistory> getConfigHistory() {
            return this.configHistory;
        }

        public static final class Builder {
            private java.util.List < ConfigHistory> configHistory; 

            /**
             * ConfigHistory.
             */
            public Builder configHistory(java.util.List < ConfigHistory> configHistory) {
                this.configHistory = configHistory;
                return this;
            }

            public ConfigHistoryList build() {
                return new ConfigHistoryList(this);
            } 

        } 

    }
}
