// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowJobRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowJobRequest</p>
 */
public class CreateFlowJobRequest extends Request {
    @Query
    @NameInMap("Adhoc")
    private Boolean adhoc;

    @Query
    @NameInMap("AlertConf")
    private String alertConf;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CustomVariables")
    private String customVariables;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("EnvConf")
    private String envConf;

    @Query
    @NameInMap("FailAct")
    private String failAct;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("MonitorConf")
    private String monitorConf;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ParamConf")
    private String paramConf;

    @Query
    @NameInMap("Params")
    private String params;

    @Query
    @NameInMap("ParentCategory")
    private String parentCategory;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceList")
    private java.util.List < ResourceList> resourceList;

    @Query
    @NameInMap("RetryPolicy")
    private String retryPolicy;

    @Query
    @NameInMap("RunConf")
    private String runConf;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateFlowJobRequest(Builder builder) {
        super(builder);
        this.adhoc = builder.adhoc;
        this.alertConf = builder.alertConf;
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.customVariables = builder.customVariables;
        this.description = builder.description;
        this.envConf = builder.envConf;
        this.failAct = builder.failAct;
        this.mode = builder.mode;
        this.monitorConf = builder.monitorConf;
        this.name = builder.name;
        this.paramConf = builder.paramConf;
        this.params = builder.params;
        this.parentCategory = builder.parentCategory;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.resourceList = builder.resourceList;
        this.retryPolicy = builder.retryPolicy;
        this.runConf = builder.runConf;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adhoc
     */
    public Boolean getAdhoc() {
        return this.adhoc;
    }

    /**
     * @return alertConf
     */
    public String getAlertConf() {
        return this.alertConf;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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
     * @return parentCategory
     */
    public String getParentCategory() {
        return this.parentCategory;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceList
     */
    public java.util.List < ResourceList> getResourceList() {
        return this.resourceList;
    }

    /**
     * @return retryPolicy
     */
    public String getRetryPolicy() {
        return this.retryPolicy;
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

    public static final class Builder extends Request.Builder<CreateFlowJobRequest, Builder> {
        private Boolean adhoc; 
        private String alertConf; 
        private String clientToken; 
        private String clusterId; 
        private String customVariables; 
        private String description; 
        private String envConf; 
        private String failAct; 
        private String mode; 
        private String monitorConf; 
        private String name; 
        private String paramConf; 
        private String params; 
        private String parentCategory; 
        private String projectId; 
        private String regionId; 
        private java.util.List < ResourceList> resourceList; 
        private String retryPolicy; 
        private String runConf; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowJobRequest request) {
            super(request);
            this.adhoc = request.adhoc;
            this.alertConf = request.alertConf;
            this.clientToken = request.clientToken;
            this.clusterId = request.clusterId;
            this.customVariables = request.customVariables;
            this.description = request.description;
            this.envConf = request.envConf;
            this.failAct = request.failAct;
            this.mode = request.mode;
            this.monitorConf = request.monitorConf;
            this.name = request.name;
            this.paramConf = request.paramConf;
            this.params = request.params;
            this.parentCategory = request.parentCategory;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.resourceList = request.resourceList;
            this.retryPolicy = request.retryPolicy;
            this.runConf = request.runConf;
            this.type = request.type;
        } 

        /**
         * 是否临时查询。
         */
        public Builder adhoc(Boolean adhoc) {
            this.putQueryParameter("Adhoc", adhoc);
            this.adhoc = adhoc;
            return this;
        }

        /**
         * 保留参数。
         */
        public Builder alertConf(String alertConf) {
            this.putQueryParameter("AlertConf", alertConf);
            this.alertConf = alertConf;
            return this;
        }

        /**
         * 保留参数。
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 集群ID。您可以调用ListClusters查看集群的ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 自定义变量。
         */
        public Builder customVariables(String customVariables) {
            this.putQueryParameter("CustomVariables", customVariables);
            this.customVariables = customVariables;
            return this;
        }

        /**
         * 作业的描述。
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 环境变量设置。
         */
        public Builder envConf(String envConf) {
            this.putQueryParameter("EnvConf", envConf);
            this.envConf = envConf;
            return this;
        }

        /**
         * 失败策略，可能的取值：CONTINUE（提过本次作业），STOP（停止作业）
         */
        public Builder failAct(String failAct) {
            this.putQueryParameter("FailAct", failAct);
            this.failAct = failAct;
            return this;
        }

        /**
         * 模型模式，取值如下：  YARN：将作业包装成一个Launcher提交至YARN中执行，LOCAL：作业直接在机器上以进程方式运行。
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * 监控配置，仅SPARK_STREAMING类型作业支持监控配置。
         */
        public Builder monitorConf(String monitorConf) {
            this.putQueryParameter("MonitorConf", monitorConf);
            this.monitorConf = monitorConf;
            return this;
        }

        /**
         * 作业的名称。
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 参数设置。
         */
        public Builder paramConf(String paramConf) {
            this.putQueryParameter("ParamConf", paramConf);
            this.paramConf = paramConf;
            return this;
        }

        /**
         * 作业内容。
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * 父目录ID。您可以调用DescribeFlowCategory查看。
         */
        public Builder parentCategory(String parentCategory) {
            this.putQueryParameter("ParentCategory", parentCategory);
            this.parentCategory = parentCategory;
            return this;
        }

        /**
         * 项目ID。您可以调用ListFlowProject查看项目的ID。
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 保留参数。
         */
        public Builder resourceList(java.util.List < ResourceList> resourceList) {
            this.putQueryParameter("ResourceList", resourceList);
            this.resourceList = resourceList;
            return this;
        }

        /**
         * 重试策略，保留参数。
         */
        public Builder retryPolicy(String retryPolicy) {
            this.putQueryParameter("RetryPolicy", retryPolicy);
            this.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * 运行配置，取值如下：priority（优先级），userName（任务的Linux提交用户），memory（内存，单位为MB），cores（核数）
         */
        public Builder runConf(String runConf) {
            this.putQueryParameter("RunConf", runConf);
            this.runConf = runConf;
            return this;
        }

        /**
         * 作业的类型，可能的取值有：SPARK，SPARK_STREAMING，ZEPPELIN
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateFlowJobRequest build() {
            return new CreateFlowJobRequest(this);
        } 

    } 

    public static class ResourceList extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("Path")
        @Validation(required = true)
        private String path;

        private ResourceList(Builder builder) {
            this.alias = builder.alias;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
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

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
}
