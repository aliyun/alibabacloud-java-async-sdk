// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

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
    @NameInMap("ClusterId")
    private String clusterId;

    @Body
    @NameInMap("CustomVariables")
    private String customVariables;

    @Body
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("EnvConf")
    private String envConf;

    @Query
    @NameInMap("FailAct")
    private String failAct;

    @Query
    @NameInMap("MaxRetry")
    private Integer maxRetry;

    @Query
    @NameInMap("MaxRunningTimeSec")
    private Long maxRunningTimeSec;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Body
    @NameInMap("MonitorConf")
    private String monitorConf;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("ParamConf")
    private String paramConf;

    @Body
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

    @Body
    @NameInMap("ResourceList")
    private java.util.List < ResourceList> resourceList;

    @Query
    @NameInMap("RetryInterval")
    private Long retryInterval;

    @Query
    @NameInMap("RetryPolicy")
    private String retryPolicy;

    @Body
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
        this.clusterId = builder.clusterId;
        this.customVariables = builder.customVariables;
        this.description = builder.description;
        this.envConf = builder.envConf;
        this.failAct = builder.failAct;
        this.maxRetry = builder.maxRetry;
        this.maxRunningTimeSec = builder.maxRunningTimeSec;
        this.mode = builder.mode;
        this.monitorConf = builder.monitorConf;
        this.name = builder.name;
        this.paramConf = builder.paramConf;
        this.params = builder.params;
        this.parentCategory = builder.parentCategory;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.resourceList = builder.resourceList;
        this.retryInterval = builder.retryInterval;
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
     * @return maxRetry
     */
    public Integer getMaxRetry() {
        return this.maxRetry;
    }

    /**
     * @return maxRunningTimeSec
     */
    public Long getMaxRunningTimeSec() {
        return this.maxRunningTimeSec;
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
     * @return retryInterval
     */
    public Long getRetryInterval() {
        return this.retryInterval;
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
        private String clusterId; 
        private String customVariables; 
        private String description; 
        private String envConf; 
        private String failAct; 
        private Integer maxRetry; 
        private Long maxRunningTimeSec; 
        private String mode; 
        private String monitorConf; 
        private String name; 
        private String paramConf; 
        private String params; 
        private String parentCategory; 
        private String projectId; 
        private String regionId; 
        private java.util.List < ResourceList> resourceList; 
        private Long retryInterval; 
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
            this.clusterId = request.clusterId;
            this.customVariables = request.customVariables;
            this.description = request.description;
            this.envConf = request.envConf;
            this.failAct = request.failAct;
            this.maxRetry = request.maxRetry;
            this.maxRunningTimeSec = request.maxRunningTimeSec;
            this.mode = request.mode;
            this.monitorConf = request.monitorConf;
            this.name = request.name;
            this.paramConf = request.paramConf;
            this.params = request.params;
            this.parentCategory = request.parentCategory;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.resourceList = request.resourceList;
            this.retryInterval = request.retryInterval;
            this.retryPolicy = request.retryPolicy;
            this.runConf = request.runConf;
            this.type = request.type;
        } 

        /**
         * Adhoc.
         */
        public Builder adhoc(Boolean adhoc) {
            this.putQueryParameter("Adhoc", adhoc);
            this.adhoc = adhoc;
            return this;
        }

        /**
         * AlertConf.
         */
        public Builder alertConf(String alertConf) {
            this.putQueryParameter("AlertConf", alertConf);
            this.alertConf = alertConf;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CustomVariables.
         */
        public Builder customVariables(String customVariables) {
            this.putBodyParameter("CustomVariables", customVariables);
            this.customVariables = customVariables;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnvConf.
         */
        public Builder envConf(String envConf) {
            this.putBodyParameter("EnvConf", envConf);
            this.envConf = envConf;
            return this;
        }

        /**
         * FailAct.
         */
        public Builder failAct(String failAct) {
            this.putQueryParameter("FailAct", failAct);
            this.failAct = failAct;
            return this;
        }

        /**
         * MaxRetry.
         */
        public Builder maxRetry(Integer maxRetry) {
            this.putQueryParameter("MaxRetry", maxRetry);
            this.maxRetry = maxRetry;
            return this;
        }

        /**
         * MaxRunningTimeSec.
         */
        public Builder maxRunningTimeSec(Long maxRunningTimeSec) {
            this.putQueryParameter("MaxRunningTimeSec", maxRunningTimeSec);
            this.maxRunningTimeSec = maxRunningTimeSec;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * MonitorConf.
         */
        public Builder monitorConf(String monitorConf) {
            this.putBodyParameter("MonitorConf", monitorConf);
            this.monitorConf = monitorConf;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ParamConf.
         */
        public Builder paramConf(String paramConf) {
            this.putBodyParameter("ParamConf", paramConf);
            this.paramConf = paramConf;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * ParentCategory.
         */
        public Builder parentCategory(String parentCategory) {
            this.putQueryParameter("ParentCategory", parentCategory);
            this.parentCategory = parentCategory;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceList.
         */
        public Builder resourceList(java.util.List < ResourceList> resourceList) {
            this.putBodyParameter("ResourceList", resourceList);
            this.resourceList = resourceList;
            return this;
        }

        /**
         * RetryInterval.
         */
        public Builder retryInterval(Long retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * RetryPolicy.
         */
        public Builder retryPolicy(String retryPolicy) {
            this.putQueryParameter("RetryPolicy", retryPolicy);
            this.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * RunConf.
         */
        public Builder runConf(String runConf) {
            this.putBodyParameter("RunConf", runConf);
            this.runConf = runConf;
            return this;
        }

        /**
         * Type.
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
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * Path.
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
