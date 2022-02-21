// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowJobResponseBody</p>
 */
public class DescribeFlowJobResponseBody extends TeaModel {
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

    @NameInMap("EditLockDetail")
    private String editLockDetail;

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

    @NameInMap("LastInstanceId")
    private String lastInstanceId;

    @NameInMap("MaxRetry")
    private Integer maxRetry;

    @NameInMap("MaxRunningTimeSec")
    private Long maxRunningTimeSec;

    @NameInMap("MonitorConf")
    private String monitorConf;

    @NameInMap("Name")
    private String name;

    @NameInMap("ParamConf")
    private String paramConf;

    @NameInMap("Params")
    private String params;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceList")
    private ResourceList resourceList;

    @NameInMap("RetryInterval")
    private Long retryInterval;

    @NameInMap("RetryPolicy")
    private String retryPolicy;

    @NameInMap("RunConf")
    private String runConf;

    @NameInMap("Type")
    private String type;

    @NameInMap("mode")
    private String mode;

    private DescribeFlowJobResponseBody(Builder builder) {
        this.adhoc = builder.adhoc;
        this.alertConf = builder.alertConf;
        this.categoryId = builder.categoryId;
        this.customVariables = builder.customVariables;
        this.description = builder.description;
        this.editLockDetail = builder.editLockDetail;
        this.envConf = builder.envConf;
        this.failAct = builder.failAct;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.lastInstanceId = builder.lastInstanceId;
        this.maxRetry = builder.maxRetry;
        this.maxRunningTimeSec = builder.maxRunningTimeSec;
        this.monitorConf = builder.monitorConf;
        this.name = builder.name;
        this.paramConf = builder.paramConf;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.resourceList = builder.resourceList;
        this.retryInterval = builder.retryInterval;
        this.retryPolicy = builder.retryPolicy;
        this.runConf = builder.runConf;
        this.type = builder.type;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowJobResponseBody create() {
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
     * @return editLockDetail
     */
    public String getEditLockDetail() {
        return this.editLockDetail;
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
     * @return lastInstanceId
     */
    public String getLastInstanceId() {
        return this.lastInstanceId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    public static final class Builder {
        private String adhoc; 
        private String alertConf; 
        private String categoryId; 
        private String customVariables; 
        private String description; 
        private String editLockDetail; 
        private String envConf; 
        private String failAct; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String id; 
        private String lastInstanceId; 
        private Integer maxRetry; 
        private Long maxRunningTimeSec; 
        private String monitorConf; 
        private String name; 
        private String paramConf; 
        private String params; 
        private String requestId; 
        private ResourceList resourceList; 
        private Long retryInterval; 
        private String retryPolicy; 
        private String runConf; 
        private String type; 
        private String mode; 

        /**
         * Adhoc.
         */
        public Builder adhoc(String adhoc) {
            this.adhoc = adhoc;
            return this;
        }

        /**
         * AlertConf.
         */
        public Builder alertConf(String alertConf) {
            this.alertConf = alertConf;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * CustomVariables.
         */
        public Builder customVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EditLockDetail.
         */
        public Builder editLockDetail(String editLockDetail) {
            this.editLockDetail = editLockDetail;
            return this;
        }

        /**
         * EnvConf.
         */
        public Builder envConf(String envConf) {
            this.envConf = envConf;
            return this;
        }

        /**
         * FailAct.
         */
        public Builder failAct(String failAct) {
            this.failAct = failAct;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * LastInstanceId.
         */
        public Builder lastInstanceId(String lastInstanceId) {
            this.lastInstanceId = lastInstanceId;
            return this;
        }

        /**
         * MaxRetry.
         */
        public Builder maxRetry(Integer maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }

        /**
         * MaxRunningTimeSec.
         */
        public Builder maxRunningTimeSec(Long maxRunningTimeSec) {
            this.maxRunningTimeSec = maxRunningTimeSec;
            return this;
        }

        /**
         * MonitorConf.
         */
        public Builder monitorConf(String monitorConf) {
            this.monitorConf = monitorConf;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ParamConf.
         */
        public Builder paramConf(String paramConf) {
            this.paramConf = paramConf;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.params = params;
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
         * ResourceList.
         */
        public Builder resourceList(ResourceList resourceList) {
            this.resourceList = resourceList;
            return this;
        }

        /**
         * RetryInterval.
         */
        public Builder retryInterval(Long retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * RetryPolicy.
         */
        public Builder retryPolicy(String retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * RunConf.
         */
        public Builder runConf(String runConf) {
            this.runConf = runConf;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        public DescribeFlowJobResponseBody build() {
            return new DescribeFlowJobResponseBody(this);
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
}
