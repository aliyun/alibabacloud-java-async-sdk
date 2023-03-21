// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckInstanceResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckInstanceResultResponseBody</p>
 */
public class ListCheckInstanceResultResponseBody extends TeaModel {
    @NameInMap("BasicData")
    private java.util.List < BasicData> basicData;

    @NameInMap("Checks")
    private java.util.List < java.util.Map<String, ?>> checks;

    @NameInMap("Columns")
    private java.util.List < Columns> columns;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * An array that consists of the basic information about the instances.
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

    public static class BasicData extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        private BasicData(Builder builder) {
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
            this.status = builder.status;
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

        public static final class Builder {
            private Long id; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 
            private String status; 

            /**
             * The check result ID of the instance.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the server.
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
             * The statuses of check items. Multiple statuses are separated by commas (,). Valid values:
             * <p>
             * 
             * *   **PASS**
             * *   **NOT_PASS**
             * *   **CHECKING**
             * *   **NOT_CHECK**
             * *   **WHITELIST**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public BasicData build() {
                return new BasicData(this);
            } 

        } 

    }
    public static class Grids extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("ShowName")
        private String showName;

        @NameInMap("Type")
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
             * The format of the check results for the instances. Valid values:
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
        @NameInMap("Grids")
        private java.util.List < Grids> grids;

        @NameInMap("Key")
        private String key;

        @NameInMap("Search")
        private Boolean search;

        @NameInMap("SearchKey")
        private String searchKey;

        @NameInMap("ShowName")
        private String showName;

        @NameInMap("Type")
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
             * The metadata information about the details of the instances.
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
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder search(Boolean search) {
                this.search = search;
                return this;
            }

            /**
             * The value of the search condition.
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
             * The format of the check results for the instances. Valid values:
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
        @NameInMap("Count")
        private String count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
