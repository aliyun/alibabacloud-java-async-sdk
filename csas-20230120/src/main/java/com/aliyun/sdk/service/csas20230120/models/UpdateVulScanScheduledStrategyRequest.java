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
 * {@link UpdateVulScanScheduledStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateVulScanScheduledStrategyRequest</p>
 */
public class UpdateVulScanScheduledStrategyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanBeginTime")
    private String scanBeginTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanEndTime")
    private String scanEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanFrequency")
    private String scanFrequency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanInterval")
    private String scanInterval;

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

    private UpdateVulScanScheduledStrategyRequest(Builder builder) {
        super(builder);
        this.matchMode = builder.matchMode;
        this.priority = builder.priority;
        this.scanBeginTime = builder.scanBeginTime;
        this.scanEndTime = builder.scanEndTime;
        this.scanFrequency = builder.scanFrequency;
        this.scanInterval = builder.scanInterval;
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

    public static UpdateVulScanScheduledStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
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
    public String getScanBeginTime() {
        return this.scanBeginTime;
    }

    /**
     * @return scanEndTime
     */
    public String getScanEndTime() {
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
    public String getScanInterval() {
        return this.scanInterval;
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

    public static final class Builder extends Request.Builder<UpdateVulScanScheduledStrategyRequest, Builder> {
        private String matchMode; 
        private Integer priority; 
        private String scanBeginTime; 
        private String scanEndTime; 
        private String scanFrequency; 
        private String scanInterval; 
        private String status; 
        private String strategyDescription; 
        private String strategyId; 
        private String strategyName; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> whitelist; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVulScanScheduledStrategyRequest request) {
            super(request);
            this.matchMode = request.matchMode;
            this.priority = request.priority;
            this.scanBeginTime = request.scanBeginTime;
            this.scanEndTime = request.scanEndTime;
            this.scanFrequency = request.scanFrequency;
            this.scanInterval = request.scanInterval;
            this.status = request.status;
            this.strategyDescription = request.strategyDescription;
            this.strategyId = request.strategyId;
            this.strategyName = request.strategyName;
            this.userGroupIds = request.userGroupIds;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The matching mode for the effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Applies to all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: Applies only to users in specified user groups. If this value is specified, UserGroupIds is required.</li>
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
         * <p>The start hour when a scan can be triggered. The value must be an integer on the hour. Valid values: 0 to 23, inclusive. This field is not a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanBeginTime(String scanBeginTime) {
            this.putBodyParameter("ScanBeginTime", scanBeginTime);
            this.scanBeginTime = scanBeginTime;
            return this;
        }

        /**
         * <p>The end hour when a scan can be triggered. The value must be an integer on the hour. Valid values: 1 to 24, exclusive. The value must be greater than the value of ScanBeginTime. This field is not a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder scanEndTime(String scanEndTime) {
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
         * <p>The interval of the trigger cycle. This parameter and ScanFrequency determine the trigger cycle. Valid values: 1 to 30. For example, if ScanFrequency is set to week and ScanInterval is set to 1, a scan is performed once a week.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanInterval(String scanInterval) {
            this.putBodyParameter("ScanInterval", scanInterval);
            this.scanInterval = scanInterval;
            return this;
        }

        /**
         * <p>The enabling status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
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
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>Execute vulnerability scanning on R&amp;D department endpoints every Sunday morning</p>
         */
        public Builder strategyDescription(String strategyDescription) {
            this.putBodyParameter("StrategyDescription", strategyDescription);
            this.strategyDescription = strategyDescription;
            return this;
        }

        /**
         * <p>The ID of the scheduled vulnerability scan policy to be modified. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListVulScanScheduledStrategies~~">ListVulScanScheduledStrategies</a>: Queries scheduled vulnerability scan policies.</li>
         * <li><a href="~~CreateVulScanScheduledStrategy~~">CreateVulScanScheduledStrategy</a>: Creates a scheduled vulnerability scan policy.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vul-scan-scheduled-strategy-8a3f6c2e91b7****</p>
         */
        public Builder strategyId(String strategyId) {
            this.putBodyParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>The policy name. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly vulnerability scanning for the R&amp;D department</p>
         */
        public Builder strategyName(String strategyName) {
            this.putBodyParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * <p>The IDs of the user groups to which the policy applies. This parameter is required when MatchMode is set to UserGroupNormal and cannot be specified when MatchMode is set to UserGroupAll. You can specify 1 to 100 user group IDs, and the IDs cannot be duplicated. The specified IDs overwrite the existing user groups of the policy.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The user whitelist. Users in the whitelist are excluded from the scan of this policy. The whitelist can contain up to 1,000 users and cannot contain duplicates. This parameter overwrites the existing whitelist of the policy.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.putBodyParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public UpdateVulScanScheduledStrategyRequest build() {
            return new UpdateVulScanScheduledStrategyRequest(this);
        } 

    } 

}
