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
 * {@link UpdateVirusScanScheduledStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateVirusScanScheduledStrategyRequest</p>
 */
public class UpdateVirusScanScheduledStrategyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HighRiskOperation")
    private String highRiskOperation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LowRiskOperation")
    private String lowRiskOperation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxCpuUsage")
    private Long maxCpuUsage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MidRiskOperation")
    private String midRiskOperation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PerformanceMode")
    private String performanceMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanBeginTime")
    private Long scanBeginTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanEndTime")
    private Long scanEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanFrequency")
    private String scanFrequency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanInterval")
    private Long scanInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanMode")
    private String scanMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanPath")
    private java.util.List<String> scanPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanTargets")
    private java.util.List<String> scanTargets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyDescription")
    private String strategyDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    private String strategyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List<String> whitelist;

    private UpdateVirusScanScheduledStrategyRequest(Builder builder) {
        super(builder);
        this.highRiskOperation = builder.highRiskOperation;
        this.lowRiskOperation = builder.lowRiskOperation;
        this.matchMode = builder.matchMode;
        this.maxCpuUsage = builder.maxCpuUsage;
        this.midRiskOperation = builder.midRiskOperation;
        this.performanceMode = builder.performanceMode;
        this.priority = builder.priority;
        this.scanBeginTime = builder.scanBeginTime;
        this.scanEndTime = builder.scanEndTime;
        this.scanFrequency = builder.scanFrequency;
        this.scanInterval = builder.scanInterval;
        this.scanMode = builder.scanMode;
        this.scanPath = builder.scanPath;
        this.scanTargets = builder.scanTargets;
        this.status = builder.status;
        this.strategyDescription = builder.strategyDescription;
        this.strategyId = builder.strategyId;
        this.strategyName = builder.strategyName;
        this.userGroupIds = builder.userGroupIds;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVirusScanScheduledStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return highRiskOperation
     */
    public String getHighRiskOperation() {
        return this.highRiskOperation;
    }

    /**
     * @return lowRiskOperation
     */
    public String getLowRiskOperation() {
        return this.lowRiskOperation;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return maxCpuUsage
     */
    public Long getMaxCpuUsage() {
        return this.maxCpuUsage;
    }

    /**
     * @return midRiskOperation
     */
    public String getMidRiskOperation() {
        return this.midRiskOperation;
    }

    /**
     * @return performanceMode
     */
    public String getPerformanceMode() {
        return this.performanceMode;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return scanBeginTime
     */
    public Long getScanBeginTime() {
        return this.scanBeginTime;
    }

    /**
     * @return scanEndTime
     */
    public Long getScanEndTime() {
        return this.scanEndTime;
    }

    /**
     * @return scanFrequency
     */
    public String getScanFrequency() {
        return this.scanFrequency;
    }

    /**
     * @return scanInterval
     */
    public Long getScanInterval() {
        return this.scanInterval;
    }

    /**
     * @return scanMode
     */
    public String getScanMode() {
        return this.scanMode;
    }

    /**
     * @return scanPath
     */
    public java.util.List<String> getScanPath() {
        return this.scanPath;
    }

    /**
     * @return scanTargets
     */
    public java.util.List<String> getScanTargets() {
        return this.scanTargets;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return strategyDescription
     */
    public String getStrategyDescription() {
        return this.strategyDescription;
    }

    /**
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return whitelist
     */
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<UpdateVirusScanScheduledStrategyRequest, Builder> {
        private String highRiskOperation; 
        private String lowRiskOperation; 
        private String matchMode; 
        private Long maxCpuUsage; 
        private String midRiskOperation; 
        private String performanceMode; 
        private Integer priority; 
        private Long scanBeginTime; 
        private Long scanEndTime; 
        private String scanFrequency; 
        private Long scanInterval; 
        private String scanMode; 
        private java.util.List<String> scanPath; 
        private java.util.List<String> scanTargets; 
        private String status; 
        private String strategyDescription; 
        private String strategyId; 
        private String strategyName; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> whitelist; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVirusScanScheduledStrategyRequest request) {
            super(request);
            this.highRiskOperation = request.highRiskOperation;
            this.lowRiskOperation = request.lowRiskOperation;
            this.matchMode = request.matchMode;
            this.maxCpuUsage = request.maxCpuUsage;
            this.midRiskOperation = request.midRiskOperation;
            this.performanceMode = request.performanceMode;
            this.priority = request.priority;
            this.scanBeginTime = request.scanBeginTime;
            this.scanEndTime = request.scanEndTime;
            this.scanFrequency = request.scanFrequency;
            this.scanInterval = request.scanInterval;
            this.scanMode = request.scanMode;
            this.scanPath = request.scanPath;
            this.scanTargets = request.scanTargets;
            this.status = request.status;
            this.strategyDescription = request.strategyDescription;
            this.strategyId = request.strategyId;
            this.strategyName = request.strategyName;
            this.userGroupIds = request.userGroupIds;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The action to take on high-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
         * <li><strong>Notify</strong>: Reports an alert only and does not process quarantined file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Quarantine</p>
         */
        public Builder highRiskOperation(String highRiskOperation) {
            this.putBodyParameter("HighRiskOperation", highRiskOperation);
            this.highRiskOperation = highRiskOperation;
            return this;
        }

        /**
         * <p>The action to take on low-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
         * <li><strong>Notify</strong>: Reports an alert only and does not process quarantined file.</li>
         * <li><strong>None</strong>: Does not process quarantined file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder lowRiskOperation(String lowRiskOperation) {
            this.putBodyParameter("LowRiskOperation", lowRiskOperation);
            this.lowRiskOperation = lowRiskOperation;
            return this;
        }

        /**
         * <p>The matching mode for the effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Takes effect for all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: Takes effect only for users in specified user groups. If you select this value, the UserGroupIds parameter is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        public Builder matchMode(String matchMode) {
            this.putBodyParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The upper limit of the percentage of the endpoint CPU occupied during the scan. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxCpuUsage(Long maxCpuUsage) {
            this.putBodyParameter("MaxCpuUsage", maxCpuUsage);
            this.maxCpuUsage = maxCpuUsage;
            return this;
        }

        /**
         * <p>The action to take on medium-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
         * <li><strong>Notify</strong>: Reports an alert only and does not process quarantined file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Notify</p>
         */
        public Builder midRiskOperation(String midRiskOperation) {
            this.putBodyParameter("MidRiskOperation", midRiskOperation);
            this.midRiskOperation = midRiskOperation;
            return this;
        }

        /**
         * <p>The scan performance pattern. Valid values:</p>
         * <ul>
         * <li><strong>SecurityFirst</strong>: Security first. The default upper limit of CPU usage is 50%.</li>
         * <li><strong>Balance</strong>: Balanced. The default upper limit of CPU usage is 30%.</li>
         * <li><strong>ExperienceFirst</strong>: Experience first. The default upper limit of CPU usage is 15%.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Balance</p>
         */
        public Builder performanceMode(String performanceMode) {
            this.putBodyParameter("PerformanceMode", performanceMode);
            this.performanceMode = performanceMode;
            return this;
        }

        /**
         * <p>The policy priority. A smaller value indicates a higher priority. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The start hour when scans are allowed to be triggered. The value must be an integer on the hour. Valid values: 0 to 23, including the specified hour. This field is not a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanBeginTime(Long scanBeginTime) {
            this.putBodyParameter("ScanBeginTime", scanBeginTime);
            this.scanBeginTime = scanBeginTime;
            return this;
        }

        /**
         * <p>The end hour when scans are allowed to be triggered. The value must be an integer on the hour. Valid values: 1 to 24, excluding the specified hour. The value must be greater than the value of ScanBeginTime. The scan task generated by each trigger becomes invalid at this hour on the same day. This field is not a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder scanEndTime(Long scanEndTime) {
            this.putBodyParameter("ScanEndTime", scanEndTime);
            this.scanEndTime = scanEndTime;
            return this;
        }

        /**
         * <p>The unit of the trigger cycle. Valid values:</p>
         * <ul>
         * <li><strong>day</strong>: Day.</li>
         * <li><strong>week</strong>: Week.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>week</p>
         */
        public Builder scanFrequency(String scanFrequency) {
            this.putBodyParameter("ScanFrequency", scanFrequency);
            this.scanFrequency = scanFrequency;
            return this;
        }

        /**
         * <p>The interval of the trigger cycle. This parameter and ScanFrequency together determine the trigger cycle. Valid values: 1 to 30. For example, if ScanFrequency is set to week and ScanInterval is set to 1, a scan is triggered once a week.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanInterval(Long scanInterval) {
            this.putBodyParameter("ScanInterval", scanInterval);
            this.scanInterval = scanInterval;
            return this;
        }

        /**
         * <p>The path scope of the scan. Valid values:</p>
         * <ul>
         * <li><strong>Quick</strong>: Quick scan. Only key system directories and common risk locations are scanned.</li>
         * <li><strong>Full</strong>: Full scan.</li>
         * <li><strong>Custom</strong>: Custom path scan. If you select this value, the ScanPath parameter is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Quick</p>
         */
        public Builder scanMode(String scanMode) {
            this.putBodyParameter("ScanMode", scanMode);
            this.scanMode = scanMode;
            return this;
        }

        /**
         * <p>The collection of custom scan paths. The collection can contain up to 100 items and cannot contain duplicates. This parameter takes effect only when ScanMode is set to Custom.</p>
         */
        public Builder scanPath(java.util.List<String> scanPath) {
            this.putBodyParameter("ScanPath", scanPath);
            this.scanPath = scanPath;
            return this;
        }

        /**
         * <p>The collection of virus types to be handled in the scan. The collection must contain at least one item and cannot contain duplicates.</p>
         */
        public Builder scanTargets(java.util.List<String> scanTargets) {
            this.putBodyParameter("ScanTargets", scanTargets);
            this.scanTargets = scanTargets;
            return this;
        }

        /**
         * <p>The enabling status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.
         * After the policy is enabled, it immediately participates in periodic scheduling. If the policy is disabled, it is only saved and does not trigger scans.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The description of the policy. The description can contain Chinese characters, uppercase and lowercase letters, digits, spaces, periods (.), commas (,), semicolons (;), forward slashes (/), at signs (@), hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>Full scan of R&amp;D department endpoints every Sunday morning</p>
         */
        public Builder strategyDescription(String strategyDescription) {
            this.putBodyParameter("StrategyDescription", strategyDescription);
            this.strategyDescription = strategyDescription;
            return this;
        }

        /**
         * <p>The ID of the scheduled virus scan policy to be modified. Value sources:</p>
         * <ul>
         * <li><a href="~~ListVirusScanScheduledStrategies~~">ListVirusScanScheduledStrategies</a>: Queries scheduled virus scan policies in batches.</li>
         * <li><a href="~~CreateVirusScanScheduledStrategy~~">CreateVirusScanScheduledStrategy</a>: Creates a scheduled virus scan policy.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vc-strategy-8a3f6c2e91b7****</p>
         */
        public Builder strategyId(String strategyId) {
            this.putBodyParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>Policy Name of the policy. Policy Name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly scan for the R&amp;D department</p>
         */
        public Builder strategyName(String strategyName) {
            this.putBodyParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * <p>The collection of effective user group IDs. The collection must contain at least one item and can contain up to 100 items. Duplicates are not allowed. If the effective scope is UserGroupNormal, the provided collection fully replaces the existing user groups of the policy. If the effective scope is UserGroupAll and the effective scope is not modified in this request, this parameter is not allowed.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The exception user list. Scans are not executed for users in this list. The list can contain up to 1,000 items and cannot contain duplicates. This parameter fully overwrites the existing list of the policy with the provided list.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.putBodyParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public UpdateVirusScanScheduledStrategyRequest build() {
            return new UpdateVirusScanScheduledStrategyRequest(this);
        } 

    } 

}
