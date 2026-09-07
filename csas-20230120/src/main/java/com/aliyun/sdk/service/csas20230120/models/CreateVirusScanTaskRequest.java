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
 * {@link CreateVirusScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVirusScanTaskRequest</p>
 */
public class CreateVirusScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

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
    @com.aliyun.core.annotation.NameInMap("TaskDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List<String> whitelist;

    private CreateVirusScanTaskRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.highRiskOperation = builder.highRiskOperation;
        this.lowRiskOperation = builder.lowRiskOperation;
        this.matchMode = builder.matchMode;
        this.maxCpuUsage = builder.maxCpuUsage;
        this.midRiskOperation = builder.midRiskOperation;
        this.performanceMode = builder.performanceMode;
        this.scanMode = builder.scanMode;
        this.scanPath = builder.scanPath;
        this.scanTargets = builder.scanTargets;
        this.taskDescription = builder.taskDescription;
        this.userGroupIds = builder.userGroupIds;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirusScanTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return taskDescription
     */
    public String getTaskDescription() {
        return this.taskDescription;
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

    public static final class Builder extends Request.Builder<CreateVirusScanTaskRequest, Builder> {
        private Long endTime; 
        private String highRiskOperation; 
        private String lowRiskOperation; 
        private String matchMode; 
        private Long maxCpuUsage; 
        private String midRiskOperation; 
        private String performanceMode; 
        private String scanMode; 
        private java.util.List<String> scanPath; 
        private java.util.List<String> scanTargets; 
        private String taskDescription; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> whitelist; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirusScanTaskRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.highRiskOperation = request.highRiskOperation;
            this.lowRiskOperation = request.lowRiskOperation;
            this.matchMode = request.matchMode;
            this.maxCpuUsage = request.maxCpuUsage;
            this.midRiskOperation = request.midRiskOperation;
            this.performanceMode = request.performanceMode;
            this.scanMode = request.scanMode;
            this.scanPath = request.scanPath;
            this.scanTargets = request.scanTargets;
            this.taskDescription = request.taskDescription;
            this.userGroupIds = request.userGroupIds;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The task expiration time, in seconds-level UNIX timestamp. After this time, endpoints no longer pull and execute this task. If this parameter is not specified or the specified time is earlier than the current time, the value defaults to the current time plus 24 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>1786377600</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The action to take on high-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: report an alert only without taking action on quarantined file.</li>
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
         * <li><strong>Quarantine</strong>: quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: report an alert only without taking action on quarantined file.</li>
         * <li><strong>None</strong>: take no action.</li>
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
         * <li><strong>UserGroupAll</strong>: applies to all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: applies only to users in specified user groups. UserGroupIds is required when this value is specified.</li>
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
         * <p>The maximum percentage of endpoint CPU usage during scanning. Valid values: 0 to 100. If this parameter is not specified or is set to 0, the default value is determined by PerformanceMode: 50 for SecurityFirst, 30 for Balance, and 15 for ExperienceFirst.</p>
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
         * <li><strong>Quarantine</strong>: quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: report an alert only without taking action on quarantined file.</li>
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
         * <p>The scan performance pattern. Valid values:</p>
         * <ul>
         * <li><strong>SecurityFirst</strong>: security first. The default CPU usage limit is 50%.</li>
         * <li><strong>Balance</strong>: balanced. The default CPU usage limit is 30%.</li>
         * <li><strong>ExperienceFirst</strong>: experience first. The default CPU usage limit is 15%.</li>
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
         * <p>The scan path scope. Valid values:</p>
         * <ul>
         * <li><strong>Quick</strong>: quick scan. Only system critical directories and common risk locations are scanned.</li>
         * <li><strong>Full</strong>: full disk scan.</li>
         * <li><strong>Custom</strong>: custom path scan. ScanPath is required when this value is specified.</li>
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
         * <p>The collection of custom scan paths. This parameter is required when ScanMode is set to Custom and cannot be specified when ScanMode is set to Quick or Full. A maximum of 100 paths can be specified. Duplicate values are not allowed.</p>
         */
        public Builder scanPath(java.util.List<String> scanPath) {
            this.putBodyParameter("ScanPath", scanPath);
            this.scanPath = scanPath;
            return this;
        }

        /**
         * <p>The collection of virus types to be handled in this scan. At least one type must be specified. Duplicate values are not allowed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder scanTargets(java.util.List<String> scanTargets) {
            this.putBodyParameter("ScanTargets", scanTargets);
            this.scanTargets = scanTargets;
            return this;
        }

        /**
         * <p>The task description. The description can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, spaces, periods (.), commas (,), semicolons (;), forward slashes (/), at signs (@), hyphens (-), and underscores (_).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Full scan for R&amp;D department</p>
         */
        public Builder taskDescription(String taskDescription) {
            this.putBodyParameter("TaskDescription", taskDescription);
            this.taskDescription = taskDescription;
            return this;
        }

        /**
         * <p>The collection of user group IDs to which the task applies. This parameter is required when MatchMode is set to UserGroupNormal and cannot be specified when MatchMode is set to UserGroupAll. At least 1 and at most 100 IDs can be specified. Duplicate values are not allowed.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The list of exempt users. Users in this list do not execute this scan task. A maximum of 1000 users can be specified. Duplicate values are not allowed.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.putBodyParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public CreateVirusScanTaskRequest build() {
            return new CreateVirusScanTaskRequest(this);
        } 

    } 

}
