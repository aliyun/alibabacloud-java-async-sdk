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
 * {@link CreateVirusScanScheduledStrategyRequest} extends {@link RequestModel}
 *
 * <p>CreateVirusScanScheduledStrategyRequest</p>
 */
public class CreateVirusScanScheduledStrategyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HighRiskOperation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String highRiskOperation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LowRiskOperation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lowRiskOperation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String matchMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxCpuUsage")
    private Long maxCpuUsage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MidRiskOperation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String midRiskOperation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PerformanceMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String performanceMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanBeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long scanBeginTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long scanEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanFrequency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scanFrequency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanInterval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long scanInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scanMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanPath")
    private java.util.List<String> scanPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanTargets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> scanTargets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyDescription")
    private String strategyDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List<String> whitelist;

    private CreateVirusScanScheduledStrategyRequest(Builder builder) {
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
        this.strategyName = builder.strategyName;
        this.userGroupIds = builder.userGroupIds;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirusScanScheduledStrategyRequest create() {
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

    public static final class Builder extends Request.Builder<CreateVirusScanScheduledStrategyRequest, Builder> {
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
        private String strategyName; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> whitelist; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirusScanScheduledStrategyRequest request) {
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
            this.strategyName = request.strategyName;
            this.userGroupIds = request.userGroupIds;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The action to take on high-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: quarantines quarantined files</li>
         * <li><strong>Notify</strong>: reports alerts only and does not process quarantined files</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <li><strong>Quarantine</strong>: quarantines quarantined files</li>
         * <li><strong>Notify</strong>: reports alerts only and does not process quarantined files</li>
         * <li><strong>None</strong>: takes no action</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <li><strong>UserGroupAll</strong>: applies to all users under the current Alibaba Cloud account</li>
         * <li><strong>UserGroupNormal</strong>: applies only to users in the specified user groups, which requires UserGroupIds</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The maximum percentage of the endpoint CPU usage during the scan. Valid values: 0 to 100. If you do not specify this parameter or set it to 0, the default value is determined by PerformanceMode: 50 for SecurityFirst, 30 for Balance, and 15 for ExperienceFirst.</p>
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
         * <li><strong>Quarantine</strong>: quarantines quarantined files</li>
         * <li><strong>Notify</strong>: reports alerts only and does not process quarantined files</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The scan performance schema pattern. Valid values:</p>
         * <ul>
         * <li><strong>SecurityFirst</strong>: security first, with a default maximum CPU usage of 50%</li>
         * <li><strong>Balance</strong>: balanced, with a default maximum CPU usage of 30%</li>
         * <li><strong>ExperienceFirst</strong>: experience first, with a default maximum CPU usage of 15%</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The start hour for triggering the scan. The value must be an integer on the hour. Valid values: 0 to 23. The specified hour is included. This field is not a timestamp.</p>
         * <p>This parameter is required.</p>
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
         * <p>The end hour for triggering the scan. The value must be an integer on the hour. Valid values: 1 to 24. The specified hour is excluded and must be greater than ScanBeginTime. The scan task generated by each trigger becomes invalid at this hour on the same day. This field is not a timestamp.</p>
         * <p>This parameter is required.</p>
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
         * <li><strong>day</strong>: day</li>
         * <li><strong>week</strong>: week</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The interval of the trigger cycle. This parameter and ScanFrequency determine the trigger cycle. Valid values: 1 to 30. For example, if ScanFrequency is set to week and ScanInterval is set to 1, the scan is performed once a week.</p>
         * <p>This parameter is required.</p>
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
         * <li><strong>Quick</strong>: quick scan, which scans only system key directories and common risk locations</li>
         * <li><strong>Full</strong>: full scan</li>
         * <li><strong>Custom</strong>: custom path scan, which requires ScanPath</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The custom scan paths. This parameter is required when ScanMode is set to Custom, and cannot be specified when ScanMode is set to Quick or Full. You can specify up to 100 paths. Duplicate values are not allowed.</p>
         */
        public Builder scanPath(java.util.List<String> scanPath) {
            this.putBodyParameter("ScanPath", scanPath);
            this.scanPath = scanPath;
            return this;
        }

        /**
         * <p>The types of viruses to be handled in this scan. You must specify at least one virus type. Duplicate values are not allowed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder scanTargets(java.util.List<String> scanTargets) {
            this.putBodyParameter("ScanTargets", scanTargets);
            this.scanTargets = scanTargets;
            return this;
        }

        /**
         * <p>The enabling status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled. The policy immediately participates in periodic scheduling.</li>
         * <li><strong>Disabled</strong>: Disabled. The policy is only saved and does not trigger scans.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Full scan of endpoints in the R&amp;D department every Sunday morning</p>
         */
        public Builder strategyDescription(String strategyDescription) {
            this.putBodyParameter("StrategyDescription", strategyDescription);
            this.strategyDescription = strategyDescription;
            return this;
        }

        /**
         * <p>Policy Name of the policy. Policy Name can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not allowed.</p>
         * <p>This parameter is required.</p>
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
         * <p>The IDs of the effective user groups. This parameter is required when MatchMode is set to UserGroupNormal, and cannot be specified when MatchMode is set to UserGroupAll. You must specify at least one and up to 100 user group IDs. Duplicate values are not allowed.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The whitelist of users. Users in the whitelist are excluded from the scan policy. You can specify up to 1,000 users. Duplicate values are not allowed.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.putBodyParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public CreateVirusScanScheduledStrategyRequest build() {
            return new CreateVirusScanScheduledStrategyRequest(this);
        } 

    } 

}
