// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckInstanceResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckInstanceResultResponseBody</p>
 */
public class ListCheckInstanceResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BasicData")
    private java.util.List < BasicData> basicData;

    @com.aliyun.core.annotation.NameInMap("Checks")
    private java.util.List < java.util.Map<String, ?>> checks;

    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List < Columns> columns;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCheckInstanceResultResponseBody(Builder builder) {
        this.basicData = builder.basicData;
        this.checks = builder.checks;
        this.columns = builder.columns;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckInstanceResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return basicData
     */
    public java.util.List < BasicData> getBasicData() {
        return this.basicData;
    }

    /**
     * @return checks
     */
    public java.util.List < java.util.Map<String, ?>> getChecks() {
        return this.checks;
    }

    /**
     * @return columns
     */
    public java.util.List < Columns> getColumns() {
        return this.columns;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BasicData> basicData; 
        private java.util.List < java.util.Map<String, ?>> checks; 
        private java.util.List < Columns> columns; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The basic information about the affected instances.
         */
        public Builder basicData(java.util.List < BasicData> basicData) {
            this.basicData = basicData;
            return this;
        }

        /**
         * The extended information about the instances.
         */
        public Builder checks(java.util.List < java.util.Map<String, ?>> checks) {
            this.checks = checks;
            return this;
        }

        /**
         * The metadata information about the search conditions that can be used to filter instances.
         */
        public Builder columns(java.util.List < Columns> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCheckInstanceResultResponseBody build() {
            return new ListCheckInstanceResultResponseBody(this);
        } 

    } 

    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Config(Builder builder) {
            this.name = builder.name;
            this.showName = builder.showName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String showName; 
            private String value; 

            /**
             * The name of the configuration item, which is unique.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The display name of the configuration item for internationalization.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The value of the configuration item specified for the instance.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class InstanceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.List < Config> config;

        @com.aliyun.core.annotation.NameInMap("FirstUpdateTime")
        private Long firstUpdateTime;

        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        private InstanceInfo(Builder builder) {
            this.config = builder.config;
            this.firstUpdateTime = builder.firstUpdateTime;
            this.lastUpdateTime = builder.lastUpdateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.List < Config> getConfig() {
            return this.config;
        }

        /**
         * @return firstUpdateTime
         */
        public Long getFirstUpdateTime() {
            return this.firstUpdateTime;
        }

        /**
         * @return lastUpdateTime
         */
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public static final class Builder {
            private java.util.List < Config> config; 
            private Long firstUpdateTime; 
            private Long lastUpdateTime; 

            /**
             * The information about the configuration item whose risks are fixed for the instance.
             */
            public Builder config(java.util.List < Config> config) {
                this.config = config;
                return this;
            }

            /**
             * The time of the first check.
             */
            public Builder firstUpdateTime(Long firstUpdateTime) {
                this.firstUpdateTime = firstUpdateTime;
                return this;
            }

            /**
             * The time of the last check.
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
    public static class BasicData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceInfo")
        private InstanceInfo instanceInfo;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        private BasicData(Builder builder) {
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.instanceInfo = builder.instanceInfo;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicData create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceInfo
         */
        public InstanceInfo getInstanceInfo() {
            return this.instanceInfo;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public static final class Builder {
            private Long id; 
            private String instanceId; 
            private InstanceInfo instanceInfo; 
            private String instanceName; 
            private String regionId; 
            private String status; 
            private String statusMessage; 

            /**
             * The ID of the check result for the instance.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The instance ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The information about the instance on which the check item is used.
             */
            public Builder instanceInfo(InstanceInfo instanceInfo) {
                this.instanceInfo = instanceInfo;
                return this;
            }

            /**
             * The instance name of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The region ID of the instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The states of check items. Multiple states are separated with commas (,). Valid values:
             * <p>
             * 
             * *   **PASS**: passed
             * *   **NOT_PASS**: failed
             * *   **CHECKING**: being checked
             * *   **NOT_CHECK**: not checked
             * *   **WHITELIST**: added to the whitelist
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The exception message of the check item.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            public BasicData build() {
                return new BasicData(this);
            } 

        } 

    }
    public static class Grids extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Grids(Builder builder) {
            this.key = builder.key;
            this.showName = builder.showName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Grids create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String key; 
            private String showName; 
            private String type; 

            /**
             * The search condition.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The display name of the search condition.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The format of the check result for the instance. Valid values:
             * <p>
             * 
             * *   **text**
             * *   **link**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Grids build() {
                return new Grids(this);
            } 

        } 

    }
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Grids")
        private java.util.List < Grids> grids;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Search")
        private Boolean search;

        @com.aliyun.core.annotation.NameInMap("SearchKey")
        private String searchKey;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Columns(Builder builder) {
            this.grids = builder.grids;
            this.key = builder.key;
            this.search = builder.search;
            this.searchKey = builder.searchKey;
            this.showName = builder.showName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return grids
         */
        public java.util.List < Grids> getGrids() {
            return this.grids;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return search
         */
        public Boolean getSearch() {
            return this.search;
        }

        /**
         * @return searchKey
         */
        public String getSearchKey() {
            return this.searchKey;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < Grids> grids; 
            private String key; 
            private Boolean search; 
            private String searchKey; 
            private String showName; 
            private String type; 

            /**
             * The metadata information about the details of the instance.
             */
            public Builder grids(java.util.List < Grids> grids) {
                this.grids = grids;
                return this;
            }

            /**
             * The search condition.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Indicates whether the search condition is used. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder search(Boolean search) {
                this.search = search;
                return this;
            }

            /**
             * The search key.
             */
            public Builder searchKey(String searchKey) {
                this.searchKey = searchKey;
                return this;
            }

            /**
             * The display name of the search condition.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The type of the check result for the instance. Valid values:
             * <p>
             * 
             * *   **text**
             * *   **link**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
