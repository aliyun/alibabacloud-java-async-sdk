// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateSoftwarelibDistributeTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSoftwarelibDistributeTaskRequest</p>
 */
public class CreateSoftwarelibDistributeTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevTags")
    private java.util.List<String> devTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceGroupIds")
    private java.util.List<String> deviceGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecuteMode")
    private String executeMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecuteParameters")
    private String executeParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutePeriod")
    private String executePeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpireMode")
    private String expireMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GmtExpired")
    private String gmtExpired;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RetryTimes")
    private String retryTimes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RunAsAccount")
    private String runAsAccount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoftwareId")
    private String softwareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoftwareName")
    private String softwareName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SupportOs")
    private String supportOs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private String timeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private CreateSoftwarelibDistributeTaskRequest(Builder builder) {
        super(builder);
        this.devTags = builder.devTags;
        this.deviceGroupIds = builder.deviceGroupIds;
        this.executeMode = builder.executeMode;
        this.executeParameters = builder.executeParameters;
        this.executePeriod = builder.executePeriod;
        this.expireMode = builder.expireMode;
        this.gmtExpired = builder.gmtExpired;
        this.matchMode = builder.matchMode;
        this.name = builder.name;
        this.retryTimes = builder.retryTimes;
        this.runAsAccount = builder.runAsAccount;
        this.softwareId = builder.softwareId;
        this.softwareName = builder.softwareName;
        this.supportOs = builder.supportOs;
        this.taskType = builder.taskType;
        this.timeout = builder.timeout;
        this.userGroupIds = builder.userGroupIds;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSoftwarelibDistributeTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devTags
     */
    public java.util.List<String> getDevTags() {
        return this.devTags;
    }

    /**
     * @return deviceGroupIds
     */
    public java.util.List<String> getDeviceGroupIds() {
        return this.deviceGroupIds;
    }

    /**
     * @return executeMode
     */
    public String getExecuteMode() {
        return this.executeMode;
    }

    /**
     * @return executeParameters
     */
    public String getExecuteParameters() {
        return this.executeParameters;
    }

    /**
     * @return executePeriod
     */
    public String getExecutePeriod() {
        return this.executePeriod;
    }

    /**
     * @return expireMode
     */
    public String getExpireMode() {
        return this.expireMode;
    }

    /**
     * @return gmtExpired
     */
    public String getGmtExpired() {
        return this.gmtExpired;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return retryTimes
     */
    public String getRetryTimes() {
        return this.retryTimes;
    }

    /**
     * @return runAsAccount
     */
    public String getRunAsAccount() {
        return this.runAsAccount;
    }

    /**
     * @return softwareId
     */
    public String getSoftwareId() {
        return this.softwareId;
    }

    /**
     * @return softwareName
     */
    public String getSoftwareName() {
        return this.softwareName;
    }

    /**
     * @return supportOs
     */
    public String getSupportOs() {
        return this.supportOs;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return timeout
     */
    public String getTimeout() {
        return this.timeout;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<CreateSoftwarelibDistributeTaskRequest, Builder> {
        private java.util.List<String> devTags; 
        private java.util.List<String> deviceGroupIds; 
        private String executeMode; 
        private String executeParameters; 
        private String executePeriod; 
        private String expireMode; 
        private String gmtExpired; 
        private String matchMode; 
        private String name; 
        private String retryTimes; 
        private String runAsAccount; 
        private String softwareId; 
        private String softwareName; 
        private String supportOs; 
        private String taskType; 
        private String timeout; 
        private java.util.List<String> userGroupIds; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSoftwarelibDistributeTaskRequest request) {
            super(request);
            this.devTags = request.devTags;
            this.deviceGroupIds = request.deviceGroupIds;
            this.executeMode = request.executeMode;
            this.executeParameters = request.executeParameters;
            this.executePeriod = request.executePeriod;
            this.expireMode = request.expireMode;
            this.gmtExpired = request.gmtExpired;
            this.matchMode = request.matchMode;
            this.name = request.name;
            this.retryTimes = request.retryTimes;
            this.runAsAccount = request.runAsAccount;
            this.softwareId = request.softwareId;
            this.softwareName = request.softwareName;
            this.supportOs = request.supportOs;
            this.taskType = request.taskType;
            this.timeout = request.timeout;
            this.userGroupIds = request.userGroupIds;
            this.versionId = request.versionId;
        } 

        /**
         * DevTags.
         */
        public Builder devTags(java.util.List<String> devTags) {
            this.putBodyParameter("DevTags", devTags);
            this.devTags = devTags;
            return this;
        }

        /**
         * DeviceGroupIds.
         */
        public Builder deviceGroupIds(java.util.List<String> deviceGroupIds) {
            this.putBodyParameter("DeviceGroupIds", deviceGroupIds);
            this.deviceGroupIds = deviceGroupIds;
            return this;
        }

        /**
         * ExecuteMode.
         */
        public Builder executeMode(String executeMode) {
            this.putBodyParameter("ExecuteMode", executeMode);
            this.executeMode = executeMode;
            return this;
        }

        /**
         * ExecuteParameters.
         */
        public Builder executeParameters(String executeParameters) {
            this.putBodyParameter("ExecuteParameters", executeParameters);
            this.executeParameters = executeParameters;
            return this;
        }

        /**
         * ExecutePeriod.
         */
        public Builder executePeriod(String executePeriod) {
            this.putBodyParameter("ExecutePeriod", executePeriod);
            this.executePeriod = executePeriod;
            return this;
        }

        /**
         * ExpireMode.
         */
        public Builder expireMode(String expireMode) {
            this.putBodyParameter("ExpireMode", expireMode);
            this.expireMode = expireMode;
            return this;
        }

        /**
         * GmtExpired.
         */
        public Builder gmtExpired(String gmtExpired) {
            this.putBodyParameter("GmtExpired", gmtExpired);
            this.gmtExpired = gmtExpired;
            return this;
        }

        /**
         * MatchMode.
         */
        public Builder matchMode(String matchMode) {
            this.putBodyParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_task</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RetryTimes.
         */
        public Builder retryTimes(String retryTimes) {
            this.putBodyParameter("RetryTimes", retryTimes);
            this.retryTimes = retryTimes;
            return this;
        }

        /**
         * RunAsAccount.
         */
        public Builder runAsAccount(String runAsAccount) {
            this.putBodyParameter("RunAsAccount", runAsAccount);
            this.runAsAccount = runAsAccount;
            return this;
        }

        /**
         * SoftwareId.
         */
        public Builder softwareId(String softwareId) {
            this.putBodyParameter("SoftwareId", softwareId);
            this.softwareId = softwareId;
            return this;
        }

        /**
         * SoftwareName.
         */
        public Builder softwareName(String softwareName) {
            this.putBodyParameter("SoftwareName", softwareName);
            this.softwareName = softwareName;
            return this;
        }

        /**
         * SupportOs.
         */
        public Builder supportOs(String supportOs) {
            this.putBodyParameter("SupportOs", supportOs);
            this.supportOs = supportOs;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(String timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * UserGroupIds.
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public CreateSoftwarelibDistributeTaskRequest build() {
            return new CreateSoftwarelibDistributeTaskRequest(this);
        } 

    } 

}
