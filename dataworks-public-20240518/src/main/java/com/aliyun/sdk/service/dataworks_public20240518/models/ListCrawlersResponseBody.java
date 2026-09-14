// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListCrawlersResponseBody} extends {@link TeaModel}
 *
 * <p>ListCrawlersResponseBody</p>
 */
public class ListCrawlersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCrawlersResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrawlersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCrawlersResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID. Used to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCrawlersResponseBody build() {
            return new ListCrawlersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCrawlersResponseBody} extends {@link TeaModel}
     *
     * <p>ListCrawlersResponseBody</p>
     */
    public static class ScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronExpress")
        private String cronExpress;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ScheduleConfig(Builder builder) {
            this.cronExpress = builder.cronExpress;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return cronExpress
         */
        public String getCronExpress() {
            return this.cronExpress;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cronExpress; 
            private String type; 

            private Builder() {
            } 

            private Builder(ScheduleConfig model) {
                this.cronExpress = model.cronExpress;
                this.type = model.type;
            } 

            /**
             * <p>The cron expression.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 2 ? * *</p>
             */
            public Builder cronExpress(String cronExpress) {
                this.cronExpress = cronExpress;
                return this;
            }

            /**
             * <p>The schedule type. Valid values: MANUAL, NORMAL.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ScheduleConfig build() {
                return new ScheduleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCrawlersResponseBody} extends {@link TeaModel}
     *
     * <p>ListCrawlersResponseBody</p>
     */
    public static class Crawlers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastRunStatus")
        private String lastRunStatus;

        @com.aliyun.core.annotation.NameInMap("MetaEntityId")
        private String metaEntityId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
        private ScheduleConfig scheduleConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Crawlers(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSourceId = builder.dataSourceId;
            this.envType = builder.envType;
            this.id = builder.id;
            this.lastRunStatus = builder.lastRunStatus;
            this.metaEntityId = builder.metaEntityId;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.resourceGroupId = builder.resourceGroupId;
            this.scheduleConfig = builder.scheduleConfig;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Crawlers create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSourceId
         */
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastRunStatus
         */
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        /**
         * @return metaEntityId
         */
        public String getMetaEntityId() {
            return this.metaEntityId;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return scheduleConfig
         */
        public ScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long createTime; 
            private Long dataSourceId; 
            private String envType; 
            private Long id; 
            private String lastRunStatus; 
            private String metaEntityId; 
            private Long modifyTime; 
            private String name; 
            private String owner; 
            private Long projectId; 
            private String resourceGroupId; 
            private ScheduleConfig scheduleConfig; 
            private String status; 
            private Long taskId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Crawlers model) {
                this.createTime = model.createTime;
                this.dataSourceId = model.dataSourceId;
                this.envType = model.envType;
                this.id = model.id;
                this.lastRunStatus = model.lastRunStatus;
                this.metaEntityId = model.metaEntityId;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.resourceGroupId = model.resourceGroupId;
                this.scheduleConfig = model.scheduleConfig;
                this.status = model.status;
                this.taskId = model.taskId;
                this.type = model.type;
            } 

            /**
             * <p>The creation time, expressed as a millisecond-precision UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder dataSourceId(Long dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The DataWorks environment type. Valid values: Dev, Prod.</p>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The crawler ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The most recent run status. Valid values: WAITING, RUNNING, SUCCESS, ERROR, SHUTDOWN. This field may be empty if the crawler has not run yet.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder lastRunStatus(String lastRunStatus) {
                this.lastRunStatus = lastRunStatus;
                return this;
            }

            /**
             * <p>The meta entity ID associated with the crawler. You can use this ID to connect to metadata query APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>starrocks:example-instance</p>
             */
            public Builder metaEntityId(String metaEntityId) {
                this.metaEntityId = metaEntityId;
                return this;
            }

            /**
             * <p>The modification time, expressed as a millisecond-precision UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1710239005403</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The crawler name.</p>
             * 
             * <strong>example:</strong>
             * <p>example_crawler</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The DataWorks user ID of the crawler owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The DataWorks workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The ID of the Serverless 2.0 resource group used to run the crawl task.</p>
             * 
             * <strong>example:</strong>
             * <p>Serverless_res_group_1234567890123456_1234567890</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The schedule configuration.</p>
             */
            public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
                this.scheduleConfig = scheduleConfig;
                return this;
            }

            /**
             * <p>The crawler status. The value is VALID when the crawler configuration is valid and the associated data source exists. Otherwise, the value is INVALID.</p>
             * 
             * <strong>example:</strong>
             * <p>VALID</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The DataWorks scheduling node ID associated with the crawler. You can use this ID to call GetTask to query the node definition.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The crawler type.</p>
             * 
             * <strong>example:</strong>
             * <p>starrocks</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Crawlers build() {
                return new Crawlers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCrawlersResponseBody} extends {@link TeaModel}
     *
     * <p>ListCrawlersResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Crawlers")
        private java.util.List<Crawlers> crawlers;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PagingInfo(Builder builder) {
            this.crawlers = builder.crawlers;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return crawlers
         */
        public java.util.List<Crawlers> getCrawlers() {
            return this.crawlers;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Crawlers> crawlers; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.crawlers = model.crawlers;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of metadata crawlers.</p>
             */
            public Builder crawlers(java.util.List<Crawlers> crawlers) {
                this.crawlers = crawlers;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records that match the query conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
