// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowJobsResponseBody</p>
 */
public class ListFlowJobsResponseBody extends TeaModel {
    @NameInMap("JobList")
    private JobList jobList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListFlowJobsResponseBody(Builder builder) {
        this.jobList = builder.jobList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobList
     */
    public JobList getJobList() {
        return this.jobList;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private JobList jobList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * JobList.
         */
        public Builder jobList(JobList jobList) {
            this.jobList = jobList;
            return this;
        }

        /**
         * 当前页数。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页的作业数量。
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 作业数量。
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListFlowJobsResponseBody build() {
            return new ListFlowJobsResponseBody(this);
        } 

    } 

    public static class Resource extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("Path")
        private String path;

        private Resource(Builder builder) {
            this.alias = builder.alias;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String alias; 
            private String path; 

            /**
             * 保留参数。
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * 保留参数。
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class ResourceList extends TeaModel {
        @NameInMap("Resource")
        private java.util.List < Resource> resource;

        private ResourceList(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < Resource> resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    public static class Job extends TeaModel {
        @NameInMap("Adhoc")
        private String adhoc;

        @NameInMap("AlertConf")
        private String alertConf;

        @NameInMap("CategoryId")
        private String categoryId;

        @NameInMap("CustomVariables")
        private String customVariables;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnvConf")
        private String envConf;

        @NameInMap("FailAct")
        private String failAct;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private String id;

        @NameInMap("LastInstanceDetail")
        private String lastInstanceDetail;

        @NameInMap("MaxRetry")
        private Integer maxRetry;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("MonitorConf")
        private String monitorConf;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParamConf")
        private String paramConf;

        @NameInMap("Params")
        private String params;

        @NameInMap("ResourceList")
        private ResourceList resourceList;

        @NameInMap("RetryInterval")
        private Long retryInterval;

        @NameInMap("RunConf")
        private String runConf;

        @NameInMap("Type")
        private String type;

        private Job(Builder builder) {
            this.adhoc = builder.adhoc;
            this.alertConf = builder.alertConf;
            this.categoryId = builder.categoryId;
            this.customVariables = builder.customVariables;
            this.description = builder.description;
            this.envConf = builder.envConf;
            this.failAct = builder.failAct;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.lastInstanceDetail = builder.lastInstanceDetail;
            this.maxRetry = builder.maxRetry;
            this.mode = builder.mode;
            this.monitorConf = builder.monitorConf;
            this.name = builder.name;
            this.paramConf = builder.paramConf;
            this.params = builder.params;
            this.resourceList = builder.resourceList;
            this.retryInterval = builder.retryInterval;
            this.runConf = builder.runConf;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return adhoc
         */
        public String getAdhoc() {
            return this.adhoc;
        }

        /**
         * @return alertConf
         */
        public String getAlertConf() {
            return this.alertConf;
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return customVariables
         */
        public String getCustomVariables() {
            return this.customVariables;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return envConf
         */
        public String getEnvConf() {
            return this.envConf;
        }

        /**
         * @return failAct
         */
        public String getFailAct() {
            return this.failAct;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lastInstanceDetail
         */
        public String getLastInstanceDetail() {
            return this.lastInstanceDetail;
        }

        /**
         * @return maxRetry
         */
        public Integer getMaxRetry() {
            return this.maxRetry;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return monitorConf
         */
        public String getMonitorConf() {
            return this.monitorConf;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return paramConf
         */
        public String getParamConf() {
            return this.paramConf;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return resourceList
         */
        public ResourceList getResourceList() {
            return this.resourceList;
        }

        /**
         * @return retryInterval
         */
        public Long getRetryInterval() {
            return this.retryInterval;
        }

        /**
         * @return runConf
         */
        public String getRunConf() {
            return this.runConf;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String adhoc; 
            private String alertConf; 
            private String categoryId; 
            private String customVariables; 
            private String description; 
            private String envConf; 
            private String failAct; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String id; 
            private String lastInstanceDetail; 
            private Integer maxRetry; 
            private String mode; 
            private String monitorConf; 
            private String name; 
            private String paramConf; 
            private String params; 
            private ResourceList resourceList; 
            private Long retryInterval; 
            private String runConf; 
            private String type; 

            /**
             * 是否临时查询。
             */
            public Builder adhoc(String adhoc) {
                this.adhoc = adhoc;
                return this;
            }

            /**
             * 报警配置。
             */
            public Builder alertConf(String alertConf) {
                this.alertConf = alertConf;
                return this;
            }

            /**
             * 作业所在目录ID。
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * 自定义变量。
             */
            public Builder customVariables(String customVariables) {
                this.customVariables = customVariables;
                return this;
            }

            /**
             * 作业的描述。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 环境变量设置。
             */
            public Builder envConf(String envConf) {
                this.envConf = envConf;
                return this;
            }

            /**
             * 失败策略，可能的取值：CONTINUE（提过本次作业），STOP（停止作业）
             */
            public Builder failAct(String failAct) {
                this.failAct = failAct;
                return this;
            }

            /**
             * 创建时间。
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 最后修改时间。
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * 作业ID。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 最后一次执行的实例ID。
             */
            public Builder lastInstanceDetail(String lastInstanceDetail) {
                this.lastInstanceDetail = lastInstanceDetail;
                return this;
            }

            /**
             * 最大重试次数。
             */
            public Builder maxRetry(Integer maxRetry) {
                this.maxRetry = maxRetry;
                return this;
            }

            /**
             * 模型模式，取值如下：  YARN：将作业包装成一个Launcher提交至YARN中执行，LOCAL：作业直接在机器上以进程方式运行。
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * 监控配置，仅SPARK_STREAMING类型作业支持监控配置。
             */
            public Builder monitorConf(String monitorConf) {
                this.monitorConf = monitorConf;
                return this;
            }

            /**
             * 作业名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 参数设置。
             */
            public Builder paramConf(String paramConf) {
                this.paramConf = paramConf;
                return this;
            }

            /**
             * 作业内容。
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * ResourceList.
             */
            public Builder resourceList(ResourceList resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * 重试间隔 0~300（秒）。
             */
            public Builder retryInterval(Long retryInterval) {
                this.retryInterval = retryInterval;
                return this;
            }

            /**
             * 运行配置，取值如下：priority（优先级），userName（任务的Linux提交用户），memory（内存，单位为MB），cores（核数）
             */
            public Builder runConf(String runConf) {
                this.runConf = runConf;
                return this;
            }

            /**
             * 作业的类型，可能的取值有：SPARK，SPARK_STREAMING，ZEPPELIN
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
    public static class JobList extends TeaModel {
        @NameInMap("Job")
        private java.util.List < Job> job;

        private JobList(Builder builder) {
            this.job = builder.job;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobList create() {
            return builder().build();
        }

        /**
         * @return job
         */
        public java.util.List < Job> getJob() {
            return this.job;
        }

        public static final class Builder {
            private java.util.List < Job> job; 

            /**
             * Job.
             */
            public Builder job(java.util.List < Job> job) {
                this.job = job;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
}
