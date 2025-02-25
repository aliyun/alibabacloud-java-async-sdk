// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAppGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAppGroupRequest</p>
 */
public class CreateAppGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    private Integer appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private Integer appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableLog")
    private Boolean enableLog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxJobs")
    private Integer maxJobs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorConfigJson")
    private String monitorConfigJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorContactsJson")
    private String monitorContactsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    private String namespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceSource")
    private String namespaceSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleBusyWorkers")
    private Boolean scheduleBusyWorkers;

    private CreateAppGroupRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.appVersion = builder.appVersion;
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
     * @return appVersion
     */
    public Integer getAppVersion() {
        return this.appVersion;
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
        private Integer appVersion; 
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
            this.appVersion = request.appVersion;
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
         * <p>The AppKey for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>adcExHZviLcl****</p>
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DocTest</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The type of application. Valid values:</p>
         * <ul>
         * <li><code>TRACE</code>: Application Monitoring</li>
         * <li><code>EBPF</code>: Application Monitoring eBPF Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder appType(Integer appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>The application version. 1: Basic version, 2: Professional version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder appVersion(Integer appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable logging. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enabled</li>
         * <li><code>false</code>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableLog(Boolean enableLog) {
            this.putQueryParameter("EnableLog", enableLog);
            this.enableLog = enableLog;
            return this;
        }

        /**
         * <p>The application ID. You can obtain the application ID on the Application Management page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestSchedulerx.defaultGroup</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The maximum number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxJobs(Integer maxJobs) {
            this.putQueryParameter("MaxJobs", maxJobs);
            this.maxJobs = maxJobs;
            return this;
        }

        /**
         * <p>The configuration of the alert. The value is a JSON string. For more information about this parameter, see <strong>Additional information about request parameters</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sendChannel&quot;:&quot;sms,ding&quot;}</p>
         */
        public Builder monitorConfigJson(String monitorConfigJson) {
            this.putQueryParameter("MonitorConfigJson", monitorConfigJson);
            this.monitorConfigJson = monitorConfigJson;
            return this;
        }

        /**
         * <p>The configuration of alert contacts. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;userName&quot;:&quot;Tom&quot;,&quot;userPhone&quot;:&quot;89756******&quot;},{&quot;userName&quot;:&quot;Bob&quot;,&quot;ding&quot;:&quot;<a href="http://www.example.com%22%7D%5D">http://www.example.com&quot;}]</a></p>
         */
        public Builder monitorContactsJson(String monitorContactsJson) {
            this.putQueryParameter("MonitorContactsJson", monitorContactsJson);
            this.monitorContactsJson = monitorContactsJson;
            return this;
        }

        /**
         * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>This parameter is not supported. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>schedulerx</p>
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to schedule a busy worker.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
