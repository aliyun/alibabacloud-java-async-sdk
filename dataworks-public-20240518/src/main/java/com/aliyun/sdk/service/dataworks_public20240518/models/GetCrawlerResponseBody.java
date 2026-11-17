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
 * {@link GetCrawlerResponseBody} extends {@link TeaModel}
 *
 * <p>GetCrawlerResponseBody</p>
 */
public class GetCrawlerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Crawler")
    private Crawler crawler;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCrawlerResponseBody(Builder builder) {
        this.crawler = builder.crawler;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrawlerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crawler
     */
    public Crawler getCrawler() {
        return this.crawler;
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
        private Crawler crawler; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCrawlerResponseBody model) {
            this.crawler = model.crawler;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The metadata crawler details.</p>
         */
        public Builder crawler(Crawler crawler) {
            this.crawler = crawler;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCrawlerResponseBody build() {
            return new GetCrawlerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCrawlerResponseBody} extends {@link TeaModel}
     *
     * <p>GetCrawlerResponseBody</p>
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
             * <p>The scheduling type. Valid values:</p>
             * <ul>
             * <li>MANUAL</li>
             * <li>NORMAL</li>
             * </ul>
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
     * {@link GetCrawlerResponseBody} extends {@link TeaModel}
     *
     * <p>GetCrawlerResponseBody</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExcludeRegex")
        private String excludeRegex;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<String> items;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Scope(Builder builder) {
            this.excludeRegex = builder.excludeRegex;
            this.items = builder.items;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
        }

        /**
         * @return excludeRegex
         */
        public String getExcludeRegex() {
            return this.excludeRegex;
        }

        /**
         * @return items
         */
        public java.util.List<String> getItems() {
            return this.items;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String excludeRegex; 
            private java.util.List<String> items; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Scope model) {
                this.excludeRegex = model.excludeRegex;
                this.items = model.items;
                this.unit = model.unit;
            } 

            /**
             * <p>The regular expression used to exclude items from the crawl scope.</p>
             * 
             * <strong>example:</strong>
             * <p>^tmp_.*</p>
             */
            public Builder excludeRegex(String excludeRegex) {
                this.excludeRegex = excludeRegex;
                return this;
            }

            /**
             * <p>The crawl scope items.</p>
             */
            public Builder items(java.util.List<String> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The crawl scope granularity. Valid values:</p>
             * <ul>
             * <li>PROJECT</li>
             * <li>DATABASE</li>
             * <li>INSTANCE</li>
             * <li>CATALOG</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATABASE</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCrawlerResponseBody} extends {@link TeaModel}
     *
     * <p>GetCrawlerResponseBody</p>
     */
    public static class Crawler extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        @com.aliyun.core.annotation.NameInMap("EnableAiComment")
        private Boolean enableAiComment;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastRunStatus")
        private String lastRunStatus;

        @com.aliyun.core.annotation.NameInMap("LastRunTaskInstanceId")
        private Long lastRunTaskInstanceId;

        @com.aliyun.core.annotation.NameInMap("MetaEntityId")
        private String metaEntityId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Options")
        private java.util.Map<String, String> options;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
        private ScheduleConfig scheduleConfig;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private Scope scope;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Crawler(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSourceId = builder.dataSourceId;
            this.enableAiComment = builder.enableAiComment;
            this.envType = builder.envType;
            this.id = builder.id;
            this.lastRunStatus = builder.lastRunStatus;
            this.lastRunTaskInstanceId = builder.lastRunTaskInstanceId;
            this.metaEntityId = builder.metaEntityId;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.options = builder.options;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.resourceGroupId = builder.resourceGroupId;
            this.scheduleConfig = builder.scheduleConfig;
            this.scope = builder.scope;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Crawler create() {
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
         * @return enableAiComment
         */
        public Boolean getEnableAiComment() {
            return this.enableAiComment;
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
         * @return lastRunTaskInstanceId
         */
        public Long getLastRunTaskInstanceId() {
            return this.lastRunTaskInstanceId;
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
         * @return options
         */
        public java.util.Map<String, String> getOptions() {
            return this.options;
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
         * @return scope
         */
        public Scope getScope() {
            return this.scope;
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
            private Boolean enableAiComment; 
            private String envType; 
            private Long id; 
            private String lastRunStatus; 
            private Long lastRunTaskInstanceId; 
            private String metaEntityId; 
            private Long modifyTime; 
            private String name; 
            private java.util.Map<String, String> options; 
            private String owner; 
            private Long projectId; 
            private String resourceGroupId; 
            private ScheduleConfig scheduleConfig; 
            private Scope scope; 
            private String status; 
            private Long taskId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Crawler model) {
                this.createTime = model.createTime;
                this.dataSourceId = model.dataSourceId;
                this.enableAiComment = model.enableAiComment;
                this.envType = model.envType;
                this.id = model.id;
                this.lastRunStatus = model.lastRunStatus;
                this.lastRunTaskInstanceId = model.lastRunTaskInstanceId;
                this.metaEntityId = model.metaEntityId;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.options = model.options;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.resourceGroupId = model.resourceGroupId;
                this.scheduleConfig = model.scheduleConfig;
                this.scope = model.scope;
                this.status = model.status;
                this.taskId = model.taskId;
                this.type = model.type;
            } 

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
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
             * <p>Indicates whether AI metadata descriptions are enabled.</p>
             */
            public Builder enableAiComment(Boolean enableAiComment) {
                this.enableAiComment = enableAiComment;
                return this;
            }

            /**
             * <p>The DataWorks environment type. Valid values:</p>
             * <ul>
             * <li>Dev</li>
             * <li>Prod</li>
             * </ul>
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
             * <p>The latest run status. Valid values:</p>
             * <ul>
             * <li>WAITING</li>
             * <li>RUNNING</li>
             * <li>SUCCESS</li>
             * <li>ERROR</li>
             * <li>SHUTDOWN
             * This parameter may be empty if the crawler has not been run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder lastRunStatus(String lastRunStatus) {
                this.lastRunStatus = lastRunStatus;
                return this;
            }

            /**
             * <p>The DataWorks task instance ID associated with the latest run. This parameter may be empty if the crawler has not been run.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder lastRunTaskInstanceId(Long lastRunTaskInstanceId) {
                this.lastRunTaskInstanceId = lastRunTaskInstanceId;
                return this;
            }

            /**
             * <p>The ID of the meta-entity associated with the crawler. You can use this ID in metadata query APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>starrocks:example-instance</p>
             */
            public Builder metaEntityId(String metaEntityId) {
                this.metaEntityId = metaEntityId;
                return this;
            }

            /**
             * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
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
             * <p>The extension configuration for the crawler type.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;CollectRecyclebin&quot;:&quot;false&quot;}</p>
             */
            public Builder options(java.util.Map<String, String> options) {
                this.options = options;
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
             * <p>The schedule settings.</p>
             */
            public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
                this.scheduleConfig = scheduleConfig;
                return this;
            }

            /**
             * <p>The crawl scope configuration.</p>
             */
            public Builder scope(Scope scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The crawler status. Valid values:</p>
             * <ul>
             * <li>VALID: The crawler configuration is valid and the associated data source exists.</li>
             * <li>INVALID: The crawler configuration is invalid or the associated data source does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VALID</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The DataWorks scheduled task ID associated with the crawler. You can call GetTask to query the task definition.</p>
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

            public Crawler build() {
                return new Crawler(this);
            } 

        } 

    }
}
