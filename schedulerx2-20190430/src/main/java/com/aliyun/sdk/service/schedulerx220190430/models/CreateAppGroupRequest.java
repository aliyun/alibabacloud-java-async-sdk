// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAppGroupRequest</p>
 */
public class CreateAppGroupRequest extends Request {
    @Query
    @NameInMap("AppKey")
    private String appKey;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("AppType")
    private Integer appType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnableLog")
    private Boolean enableLog;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("MaxJobs")
    private Integer maxJobs;

    @Query
    @NameInMap("MonitorConfigJson")
    private String monitorConfigJson;

    @Query
    @NameInMap("MonitorContactsJson")
    private String monitorContactsJson;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

    @Query
    @NameInMap("NamespaceSource")
    private String namespaceSource;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ScheduleBusyWorkers")
    private Boolean scheduleBusyWorkers;

    private CreateAppGroupRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.description = builder.description;
        this.enableLog = builder.enableLog;
        this.groupId = builder.groupId;
        this.maxJobs = builder.maxJobs;
        this.monitorConfigJson = builder.monitorConfigJson;
        this.monitorContactsJson = builder.monitorContactsJson;
        this.namespace = builder.namespace;
        this.namespaceName = builder.namespaceName;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
        this.scheduleBusyWorkers = builder.scheduleBusyWorkers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public Integer getAppType() {
        return this.appType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableLog
     */
    public Boolean getEnableLog() {
        return this.enableLog;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return maxJobs
     */
    public Integer getMaxJobs() {
        return this.maxJobs;
    }

    /**
     * @return monitorConfigJson
     */
    public String getMonitorConfigJson() {
        return this.monitorConfigJson;
    }

    /**
     * @return monitorContactsJson
     */
    public String getMonitorContactsJson() {
        return this.monitorContactsJson;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scheduleBusyWorkers
     */
    public Boolean getScheduleBusyWorkers() {
        return this.scheduleBusyWorkers;
    }

    public static final class Builder extends Request.Builder<CreateAppGroupRequest, Builder> {
        private String appKey; 
        private String appName; 
        private Integer appType; 
        private String description; 
        private Boolean enableLog; 
        private String groupId; 
        private Integer maxJobs; 
        private String monitorConfigJson; 
        private String monitorContactsJson; 
        private String namespace; 
        private String namespaceName; 
        private String namespaceSource; 
        private String regionId; 
        private Boolean scheduleBusyWorkers; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppGroupRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.appName = request.appName;
            this.appType = request.appType;
            this.description = request.description;
            this.enableLog = request.enableLog;
            this.groupId = request.groupId;
            this.maxJobs = request.maxJobs;
            this.monitorConfigJson = request.monitorConfigJson;
            this.monitorContactsJson = request.monitorContactsJson;
            this.namespace = request.namespace;
            this.namespaceName = request.namespaceName;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
            this.scheduleBusyWorkers = request.scheduleBusyWorkers;
        } 

        /**
         * The AppKey for the application.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * The name of the application.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * 应用类型。
         * <p>
         * 
         * - 1、普通应用。
         * - 2、k8s应用。
         */
        public Builder appType(Integer appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * The description of the application.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 是否开启日志。
         * <p>
         * 
         * - true：开启
         * 
         * - false：关闭
         */
        public Builder enableLog(Boolean enableLog) {
            this.putQueryParameter("EnableLog", enableLog);
            this.enableLog = enableLog;
            return this;
        }

        /**
         * The application ID. You can obtain the application ID on the Application Management page in the SchedulerX console.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The maximum number of jobs.
         */
        public Builder maxJobs(Integer maxJobs) {
            this.putQueryParameter("MaxJobs", maxJobs);
            this.maxJobs = maxJobs;
            return this;
        }

        /**
         * The configuration of the alert. The value is a JSON string. For more information about this parameter, see **Additional information about request parameters**.
         */
        public Builder monitorConfigJson(String monitorConfigJson) {
            this.putQueryParameter("MonitorConfigJson", monitorConfigJson);
            this.monitorConfigJson = monitorConfigJson;
            return this;
        }

        /**
         * The configuration of alert contacts. The value is a JSON string.
         */
        public Builder monitorContactsJson(String monitorContactsJson) {
            this.putQueryParameter("MonitorContactsJson", monitorContactsJson);
            this.monitorContactsJson = monitorContactsJson;
            return this;
        }

        /**
         * The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * This parameter is not supported. You do not need to specify this parameter.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to schedule a busy worker.
         */
        public Builder scheduleBusyWorkers(Boolean scheduleBusyWorkers) {
            this.putQueryParameter("ScheduleBusyWorkers", scheduleBusyWorkers);
            this.scheduleBusyWorkers = scheduleBusyWorkers;
            return this;
        }

        @Override
        public CreateAppGroupRequest build() {
            return new CreateAppGroupRequest(this);
        } 

    } 

}
