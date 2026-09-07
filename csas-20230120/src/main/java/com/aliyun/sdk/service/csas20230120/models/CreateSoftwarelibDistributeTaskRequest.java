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
         * <p>The collection of terminal device IDs. Duplicate values are not allowed. Each ID must not exceed 1000 characters in length. This parameter is required when MatchMode is set to DevTagNormal. This parameter is not allowed when MatchMode is set to other values. Otherwise, the request is rejected.</p>
         */
        public Builder devTags(java.util.List<String> devTags) {
            this.putBodyParameter("DevTags", devTags);
            this.devTags = devTags;
            return this;
        }

        /**
         * <p>The collection of device group IDs. Duplicate values are not allowed. This parameter is required when MatchMode is set to DeviceGroupNormal. This parameter is not allowed when MatchMode is set to other values. Otherwise, the request is rejected. You can call <a href="~~ListDeviceGroups~~">ListDeviceGroups</a> to obtain the values.</p>
         */
        public Builder deviceGroupIds(java.util.List<String> deviceGroupIds) {
            this.putBodyParameter("DeviceGroupIds", deviceGroupIds);
            this.deviceGroupIds = deviceGroupIds;
            return this;
        }

        /**
         * <p>The execution mode. Valid values:</p>
         * <ul>
         * <li><strong>Once</strong>: immediate execution.</li>
         * <li><strong>Schedule</strong>: scheduled execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Once</p>
         */
        public Builder executeMode(String executeMode) {
            this.putBodyParameter("ExecuteMode", executeMode);
            this.executeMode = executeMode;
            return this;
        }

        /**
         * <p>The scheduling execution parameters in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;template_code&quot;: &quot;software_install&quot;,
         *     &quot;software_url&quot;: &quot;https://****&quot;,
         *     &quot;md5&quot;: &quot;87ccfcce1956e9f2385137f690d7fb64&quot;,
         *     &quot;install_check_switch&quot;: false,
         *     &quot;software_name&quot;: &quot;&quot;,
         *     &quot;software_name_en&quot;: &quot;&quot;,
         *     &quot;speed_limit&quot;: 0,
         *     &quot;software_id&quot;: &quot;softwarelib-software-18a2417da2779e65&quot;
         * }</p>
         */
        public Builder executeParameters(String executeParameters) {
            this.putBodyParameter("ExecuteParameters", executeParameters);
            this.executeParameters = executeParameters;
            return this;
        }

        /**
         * <p>The task execution cycle in JSON format. The validType field specifies the cycle type. Valid values:</p>
         * <ul>
         * <li><strong>Once</strong>: one-time execution.</li>
         * <li><strong>Interval</strong>: execution at intervals.</li>
         * <li><strong>Weekly</strong>: weekly execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;validType&quot;:&quot;Once&quot;}</p>
         */
        public Builder executePeriod(String executePeriod) {
            this.putBodyParameter("ExecutePeriod", executePeriod);
            this.executePeriod = executePeriod;
            return this;
        }

        /**
         * <p>The expiration type. Valid values:</p>
         * <ul>
         * <li><strong>Expire</strong>: expires at the time specified by GmtExpired.</li>
         * <li><strong>Never</strong>: never expires.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Expire</p>
         */
        public Builder expireMode(String expireMode) {
            this.putBodyParameter("ExpireMode", expireMode);
            this.expireMode = expireMode;
            return this;
        }

        /**
         * <p>The task expiration time as a millisecond-level UNIX timestamp. This parameter takes effect only when ExpireMode is set to Expire.</p>
         * 
         * <strong>example:</strong>
         * <p>1786945543000</p>
         */
        public Builder gmtExpired(String gmtExpired) {
            this.putBodyParameter("GmtExpired", gmtExpired);
            this.gmtExpired = gmtExpired;
            return this;
        }

        /**
         * <p>The policy matching target type. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: all users.</li>
         * <li><strong>UserGroupNormal</strong>: specified user groups.</li>
         * <li><strong>DevTagNormal</strong>: specified devices.</li>
         * <li><strong>DeviceGroupNormal</strong>: specified device groups.</li>
         * <li><strong>DevTagAll</strong>: all devices.</li>
         * <li><strong>None</strong>: not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupAll</p>
         */
        public Builder matchMode(String matchMode) {
            this.putBodyParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The task name. The name must be 1 to 64 characters in length.</p>
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
         * <p>The number of retries after a task failure.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder retryTimes(String retryTimes) {
            this.putBodyParameter("RetryTimes", retryTimes);
            this.retryTimes = retryTimes;
            return this;
        }

        /**
         * <p>The administrator account name used to run the task on Windows. The name must not exceed 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder runAsAccount(String runAsAccount) {
            this.putBodyParameter("RunAsAccount", runAsAccount);
            this.runAsAccount = runAsAccount;
            return this;
        }

        /**
         * <p>The software ID in the software library. You can call <a href="~~ListSoftwarelibSoftware~~">ListSoftwarelibSoftware</a> to obtain the value.</p>
         * 
         * <strong>example:</strong>
         * <p>softwarelib-software-9f9de7b5a16f****</p>
         */
        public Builder softwareId(String softwareId) {
            this.putBodyParameter("SoftwareId", softwareId);
            this.softwareId = softwareId;
            return this;
        }

        /**
         * <p>The software name. The name must not exceed 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test software</p>
         */
        public Builder softwareName(String softwareName) {
            this.putBodyParameter("SoftwareName", softwareName);
            this.softwareName = softwareName;
            return this;
        }

        /**
         * <p>The operating system to which the task applies. Only a single value is supported. Valid values:</p>
         * <ul>
         * <li><strong>Windows</strong>: Windows.</li>
         * <li><strong>Mac(Apple)</strong>: macOS with Apple silicon.</li>
         * <li><strong>Mac(Intel)</strong>: macOS with Intel processors.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Mac(Apple)</p>
         */
        public Builder supportOs(String supportOs) {
            this.putBodyParameter("SupportOs", supportOs);
            this.supportOs = supportOs;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>server</strong>: a task delivered from the console.</li>
         * <li><strong>client</strong>: a task initiated from the client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>server</p>
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The task execution timeout period. Unit: seconds. For example, a value of 3600 indicates 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder timeout(String timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The collection of user group IDs. Duplicate values are not allowed. This parameter is required and must contain at least one value when MatchMode is set to UserGroupNormal. This parameter is not allowed when MatchMode is set to other values. Otherwise, the request is rejected. You can call <a href="~~ListUserGroups~~">ListUserGroups</a> to obtain the values.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The ID of the software version to distribute. You can call <a href="~~ListSoftwarelibVersion~~">ListSoftwarelibVersion</a> to obtain the value.</p>
         * 
         * <strong>example:</strong>
         * <p>softwarelib-version-30925615d2e4****</p>
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
