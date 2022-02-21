// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceConfigHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterServiceConfigHistoryResponseBody</p>
 */
public class ListClusterServiceConfigHistoryResponseBody extends TeaModel {
    @NameInMap("ConfigHistoryList")
    private ConfigHistoryList configHistoryList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListClusterServiceConfigHistoryResponseBody(Builder builder) {
        this.configHistoryList = builder.configHistoryList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ConfigHistoryList configHistoryList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClusterServiceConfigHistoryResponseBody build() {
            return new ListClusterServiceConfigHistoryResponseBody(this);
        } 

    } 

    public static class ConfigHistory extends TeaModel {
        @NameInMap("Applied")
        private Boolean applied;

        @NameInMap("Author")
        private String author;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("ConfigFileName")
        private String configFileName;

        @NameInMap("ConfigItemName")
        private String configItemName;

        @NameInMap("ConfigVersion")
        private String configVersion;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("HostGroupId")
        private String hostGroupId;

        @NameInMap("HostGroupName")
        private String hostGroupName;

        @NameInMap("HostInstanceId")
        private String hostInstanceId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("NewValue")
        private String newValue;

        @NameInMap("OldValue")
        private String oldValue;

        @NameInMap("ServiceName")
        private String serviceName;

        private ConfigHistory(Builder builder) {
            this.applied = builder.applied;
            this.author = builder.author;
            this.comment = builder.comment;
            this.configFileName = builder.configFileName;
            this.configItemName = builder.configItemName;
            this.configVersion = builder.configVersion;
            this.createTime = builder.createTime;
            this.hostGroupId = builder.hostGroupId;
            this.hostGroupName = builder.hostGroupName;
            this.hostInstanceId = builder.hostInstanceId;
            this.hostName = builder.hostName;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigHistory create() {
            return builder().build();
        }

        /**
         * @return applied
         */
        public Boolean getApplied() {
            return this.applied;
        }

        /**
         * @return author
         */
        public String getAuthor() {
            return this.author;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return configFileName
         */
        public String getConfigFileName() {
            return this.configFileName;
        }

        /**
         * @return configItemName
         */
        public String getConfigItemName() {
            return this.configItemName;
        }

        /**
         * @return configVersion
         */
        public String getConfigVersion() {
            return this.configVersion;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        /**
         * @return hostGroupName
         */
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        /**
         * @return hostInstanceId
         */
        public String getHostInstanceId() {
            return this.hostInstanceId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
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

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private Boolean applied; 
            private String author; 
            private String comment; 
            private String configFileName; 
            private String configItemName; 
            private String configVersion; 
            private Long createTime; 
            private String hostGroupId; 
            private String hostGroupName; 
            private String hostInstanceId; 
            private String hostName; 
            private String newValue; 
            private String oldValue; 
            private String serviceName; 

            /**
             * Applied.
             */
            public Builder applied(Boolean applied) {
                this.applied = applied;
                return this;
            }

            /**
             * Author.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * ConfigFileName.
             */
            public Builder configFileName(String configFileName) {
                this.configFileName = configFileName;
                return this;
            }

            /**
             * ConfigItemName.
             */
            public Builder configItemName(String configItemName) {
                this.configItemName = configItemName;
                return this;
            }

            /**
             * ConfigVersion.
             */
            public Builder configVersion(String configVersion) {
                this.configVersion = configVersion;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * HostGroupId.
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * HostGroupName.
             */
            public Builder hostGroupName(String hostGroupName) {
                this.hostGroupName = hostGroupName;
                return this;
            }

            /**
             * HostInstanceId.
             */
            public Builder hostInstanceId(String hostInstanceId) {
                this.hostInstanceId = hostInstanceId;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
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

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ConfigHistory build() {
                return new ConfigHistory(this);
            } 

        } 

    }
    public static class ConfigHistoryList extends TeaModel {
        @NameInMap("ConfigHistory")
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
