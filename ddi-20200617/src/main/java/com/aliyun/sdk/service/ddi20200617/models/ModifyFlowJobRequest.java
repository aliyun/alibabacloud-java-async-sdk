// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowJobRequest} extends {@link RequestModel}
 *
 * <p>ModifyFlowJobRequest</p>
 */
public class ModifyFlowJobRequest extends Request {
    @Query
    @NameInMap("AlertConf")
    private String alertConf;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CustomVariables")
    private String customVariables;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnvConf")
    private String envConf;

    @Query
    @NameInMap("FailAct")
    private String failAct;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("KnoxPassword")
    private String knoxPassword;

    @Query
    @NameInMap("KnoxUser")
    private String knoxUser;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("MonitorConf")
    private String monitorConf;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("ParamConf")
    private String paramConf;

    @Query
    @NameInMap("Params")
    private String params;

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

    private ModifyFlowJobRequest(Builder builder) {
        super(builder);
        this.alertConf = builder.alertConf;
        this.clusterId = builder.clusterId;
        this.customVariables = builder.customVariables;
        this.description = builder.description;
        this.envConf = builder.envConf;
        this.failAct = builder.failAct;
        this.id = builder.id;
        this.knoxPassword = builder.knoxPassword;
        this.knoxUser = builder.knoxUser;
        this.mode = builder.mode;
        this.monitorConf = builder.monitorConf;
        this.name = builder.name;
        this.paramConf = builder.paramConf;
        this.params = builder.params;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.resourceList = builder.resourceList;
        this.retryPolicy = builder.retryPolicy;
        this.runConf = builder.runConf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFlowJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return knoxPassword
     */
    public String getKnoxPassword() {
        return this.knoxPassword;
    }

    /**
     * @return knoxUser
     */
    public String getKnoxUser() {
        return this.knoxUser;
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

    public static final class Builder extends Request.Builder<ModifyFlowJobRequest, Builder> {
        private String alertConf; 
        private String clusterId; 
        private String customVariables; 
        private String description; 
        private String envConf; 
        private String failAct; 
        private String id; 
        private String knoxPassword; 
        private String knoxUser; 
        private String mode; 
        private String monitorConf; 
        private String name; 
        private String paramConf; 
        private String params; 
        private String projectId; 
        private String regionId; 
        private java.util.List < ResourceList> resourceList; 
        private String retryPolicy; 
        private String runConf; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFlowJobRequest request) {
            super(request);
            this.alertConf = request.alertConf;
            this.clusterId = request.clusterId;
            this.customVariables = request.customVariables;
            this.description = request.description;
            this.envConf = request.envConf;
            this.failAct = request.failAct;
            this.id = request.id;
            this.knoxPassword = request.knoxPassword;
            this.knoxUser = request.knoxUser;
            this.mode = request.mode;
            this.monitorConf = request.monitorConf;
            this.name = request.name;
            this.paramConf = request.paramConf;
            this.params = request.params;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.resourceList = request.resourceList;
            this.retryPolicy = request.retryPolicy;
            this.runConf = request.runConf;
        } 

        /**
         * ???????????????
         */
        public Builder alertConf(String alertConf) {
            this.putQueryParameter("AlertConf", alertConf);
            this.alertConf = alertConf;
            return this;
        }

        /**
         * ??????ID??????????????????ListClusters???????????????ID???
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder customVariables(String customVariables) {
            this.putQueryParameter("CustomVariables", customVariables);
            this.customVariables = customVariables;
            return this;
        }

        /**
         * ???????????????????????????
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder envConf(String envConf) {
            this.putQueryParameter("EnvConf", envConf);
            this.envConf = envConf;
            return this;
        }

        /**
         * ?????????????????????????????????CONTINUE???????????????????????????STOP??????????????????
         */
        public Builder failAct(String failAct) {
            this.putQueryParameter("FailAct", failAct);
            this.failAct = failAct;
            return this;
        }

        /**
         * ????????????????????????ID???
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Knox????????????????????????Zeppelin Notebook??????????????????
         */
        public Builder knoxPassword(String knoxPassword) {
            this.putQueryParameter("KnoxPassword", knoxPassword);
            this.knoxPassword = knoxPassword;
            return this;
        }

        /**
         * Knox?????????????????????Zeppelin Notebook??????????????????
         */
        public Builder knoxUser(String knoxUser) {
            this.putQueryParameter("KnoxUser", knoxUser);
            this.knoxUser = knoxUser;
            return this;
        }

        /**
         * ??????????????????????????????  YARN???????????????????????????Launcher?????????YARN????????????LOCAL???????????????????????????????????????????????????
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * ??????????????????SPARK_STREAMING?????????????????????????????????
         */
        public Builder monitorConf(String monitorConf) {
            this.putQueryParameter("MonitorConf", monitorConf);
            this.monitorConf = monitorConf;
            return this;
        }

        /**
         * ???????????????????????????
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder paramConf(String paramConf) {
            this.putQueryParameter("ParamConf", paramConf);
            this.paramConf = paramConf;
            return this;
        }

        /**
         * ????????????????????????spark????????????????????????????????????spark-submit????????????
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * ??????ID??????????????????ListFlowProject???????????????ID???
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ??????ID??????????????????DescribeRegions???????????????????????????????????????
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder resourceList(java.util.List < ResourceList> resourceList) {
            this.putQueryParameter("ResourceList", resourceList);
            this.resourceList = resourceList;
            return this;
        }

        /**
         * ??????????????????????????????
         */
        public Builder retryPolicy(String retryPolicy) {
            this.putQueryParameter("RetryPolicy", retryPolicy);
            this.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * ??????????????????????????????priority??????????????????userName????????????Linux??????????????????memory?????????????????????MB??????cores????????????
         */
        public Builder runConf(String runConf) {
            this.putQueryParameter("RunConf", runConf);
            this.runConf = runConf;
            return this;
        }

        @Override
        public ModifyFlowJobRequest build() {
            return new ModifyFlowJobRequest(this);
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
             * ???????????????
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * ???????????????
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
