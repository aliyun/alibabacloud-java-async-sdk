// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListCheckInstanceResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckInstanceResultResponseBody</p>
 */
public class ListCheckInstanceResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BasicData")
    private java.util.List<BasicData> basicData;

    @com.aliyun.core.annotation.NameInMap("Checks")
    private java.util.List<java.util.Map<String, ?>> checks;

    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<Columns> columns;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return basicData
     */
    public java.util.List<BasicData> getBasicData() {
        return this.basicData;
    }

    /**
     * @return checks
     */
    public java.util.List<java.util.Map<String, ?>> getChecks() {
        return this.checks;
    }

    /**
     * @return columns
     */
    public java.util.List<Columns> getColumns() {
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
        private java.util.List<BasicData> basicData; 
        private java.util.List<java.util.Map<String, ?>> checks; 
        private java.util.List<Columns> columns; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCheckInstanceResultResponseBody model) {
            this.basicData = model.basicData;
            this.checks = model.checks;
            this.columns = model.columns;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The basic information about the affected instances.</p>
         */
        public Builder basicData(java.util.List<BasicData> basicData) {
            this.basicData = basicData;
            return this;
        }

        /**
         * <p>The extended information about the instances.</p>
         * 
         * <strong>example:</strong>
         * <p>[{
         *     &quot;SecurityGroupNameShow&quot;: {
         *         &quot;value&quot;: &quot;Sas_Malicious_Ip_Security_Group&quot;
         *     },
         *     &quot;InstanceIdShow&quot;: {
         *         &quot;link&quot;: &quot;<a href="https://ecs.console.aliyun.com/#/securityGroupDetail/region/ap-southeast-1/groupId/sg-t4nbk2aodzio52xvj00s/rule/intranetIngress">https://ecs.console.aliyun.com/#/securityGroupDetail/region/ap-southeast-1/groupId/sg-t4nbk2aodzio52xvj00s/rule/intranetIngress</a>&quot;,
         *         &quot;value&quot;: &quot;sg-t4nbk2aodzio52xv****&quot;
         *     }
         * }]</p>
         */
        public Builder checks(java.util.List<java.util.Map<String, ?>> checks) {
            this.checks = checks;
            return this;
        }

        /**
         * <p>The metadata information about the search conditions that can be used to filter instances.</p>
         */
        public Builder columns(java.util.List<Columns> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3AB18264-8A1B-52A6-A9AF-A886556E0F2E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCheckInstanceResultResponseBody build() {
            return new ListCheckInstanceResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCheckInstanceResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckInstanceResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Config model) {
                this.name = model.name;
                this.showName = model.showName;
                this.value = model.value;
            } 

            /**
             * <p>The name of the configuration item, which is unique.</p>
             * 
             * <strong>example:</strong>
             * <p>prot</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The display name of the configuration item for internationalization.</p>
             * 
             * <strong>example:</strong>
             * <p>prot</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The value of the configuration item specified for the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
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
    /**
     * 
     * {@link ListCheckInstanceResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckInstanceResultResponseBody</p>
     */
    public static class InstanceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.List<Config> config;

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
        public java.util.List<Config> getConfig() {
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
            private java.util.List<Config> config; 
            private Long firstUpdateTime; 
            private Long lastUpdateTime; 

            private Builder() {
            } 

            private Builder(InstanceInfo model) {
                this.config = model.config;
                this.firstUpdateTime = model.firstUpdateTime;
                this.lastUpdateTime = model.lastUpdateTime;
            } 

            /**
             * <p>The information about the configuration item whose risks are fixed for the instance.</p>
             */
            public Builder config(java.util.List<Config> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time of the first check.</p>
             * 
             * <strong>example:</strong>
             * <p>1716447535531</p>
             */
            public Builder firstUpdateTime(Long firstUpdateTime) {
                this.firstUpdateTime = firstUpdateTime;
                return this;
            }

            /**
             * <p>The time of the last check.</p>
             * 
             * <strong>example:</strong>
             * <p>1716447535531</p>
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
    /**
     * 
     * {@link ListCheckInstanceResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckInstanceResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BasicData model) {
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.instanceInfo = model.instanceInfo;
                this.instanceName = model.instanceName;
                this.regionId = model.regionId;
                this.status = model.status;
                this.statusMessage = model.statusMessage;
            } 

            /**
             * <p>The ID of the check result for the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>300054</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-m5es7ch1s62i4****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The information about the instance on which the check item is used.</p>
             */
            public Builder instanceInfo(InstanceInfo instanceInfo) {
                this.instanceInfo = instanceInfo;
                return this;
            }

            /**
             * <p>The instance name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-t4nbk2aodzio52xv****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The states of check items. Multiple states are separated with commas (,). Valid values:</p>
             * <ul>
             * <li><strong>PASS</strong>: passed</li>
             * <li><strong>NOT_PASS</strong>: failed</li>
             * <li><strong>CHECKING</strong>: being checked</li>
             * <li><strong>NOT_CHECK</strong>: not checked</li>
             * <li><strong>WHITELIST</strong>: added to the whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NOT_PASS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The exception message of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Task is failed.</p>
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
    /**
     * 
     * {@link ListCheckInstanceResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckInstanceResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Grids model) {
                this.key = model.key;
                this.showName = model.showName;
                this.type = model.type;
            } 

            /**
             * <p>The search condition.</p>
             * 
             * <strong>example:</strong>
             * <p>RegionIdShow</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The display name of the search condition.</p>
             * 
             * <strong>example:</strong>
             * <p>Region</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The format of the check result for the instance. Valid values:</p>
             * <ul>
             * <li><strong>text</strong></li>
             * <li><strong>link</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
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
    /**
     * 
     * {@link ListCheckInstanceResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckInstanceResultResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Grids")
        private java.util.List<Grids> grids;

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
        public java.util.List<Grids> getGrids() {
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
            private java.util.List<Grids> grids; 
            private String key; 
            private Boolean search; 
            private String searchKey; 
            private String showName; 
            private String type; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.grids = model.grids;
                this.key = model.key;
                this.search = model.search;
                this.searchKey = model.searchKey;
                this.showName = model.showName;
                this.type = model.type;
            } 

            /**
             * <p>The metadata information about the details of the instance.</p>
             */
            public Builder grids(java.util.List<Grids> grids) {
                this.grids = grids;
                return this;
            }

            /**
             * <p>The search condition.</p>
             * 
             * <strong>example:</strong>
             * <p>RegionIdShow</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Indicates whether the search condition is used. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder search(Boolean search) {
                this.search = search;
                return this;
            }

            /**
             * <p>The search key.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceIdKey</p>
             */
            public Builder searchKey(String searchKey) {
                this.searchKey = searchKey;
                return this;
            }

            /**
             * <p>The display name of the search condition.</p>
             * 
             * <strong>example:</strong>
             * <p>Region</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The type of the check result for the instance. Valid values:</p>
             * <ul>
             * <li><strong>text</strong></li>
             * <li><strong>link</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
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
    /**
     * 
     * {@link ListCheckInstanceResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckInstanceResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
