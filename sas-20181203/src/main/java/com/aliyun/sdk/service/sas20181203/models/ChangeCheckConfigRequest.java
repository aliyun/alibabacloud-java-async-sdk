// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ChangeCheckConfigRequest} extends {@link RequestModel}
 *
 * <p>ChangeCheckConfigRequest</p>
 */
public class ChangeCheckConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddedCheck")
    private java.util.List<AddedCheck> addedCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRequirementIds")
    private ConfigRequirementIds configRequirementIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigStandardIds")
    private ConfigStandardIds configStandardIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Configure")
    private String configure;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CycleDays")
    private java.util.List<Integer> cycleDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DaysOfMonth")
    private java.util.List<Integer> daysOfMonth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAddCheck")
    private Boolean enableAddCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAutoCheck")
    private Boolean enableAutoCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Integer endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeSeconds")
    private Integer endTimeSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Frequency")
    private String frequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemovedCheck")
    private java.util.List<RemovedCheck> removedCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandardIds")
    private java.util.List<Long> standardIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Integer startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeSeconds")
    private Integer startTimeSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    @com.aliyun.core.annotation.Validation(maxLength = 30)
    private String strategyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemConfig")
    private Boolean systemConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List<String> vendors;

    private ChangeCheckConfigRequest(Builder builder) {
        super(builder);
        this.addedCheck = builder.addedCheck;
        this.clientToken = builder.clientToken;
        this.configId = builder.configId;
        this.configRequirementIds = builder.configRequirementIds;
        this.configStandardIds = builder.configStandardIds;
        this.configure = builder.configure;
        this.cycleDays = builder.cycleDays;
        this.daysOfMonth = builder.daysOfMonth;
        this.dryRun = builder.dryRun;
        this.enableAddCheck = builder.enableAddCheck;
        this.enableAutoCheck = builder.enableAutoCheck;
        this.endTime = builder.endTime;
        this.endTimeSeconds = builder.endTimeSeconds;
        this.frequency = builder.frequency;
        this.regionId = builder.regionId;
        this.removedCheck = builder.removedCheck;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.standardIds = builder.standardIds;
        this.startTime = builder.startTime;
        this.startTimeSeconds = builder.startTimeSeconds;
        this.strategyName = builder.strategyName;
        this.systemConfig = builder.systemConfig;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCheckConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addedCheck
     */
    public java.util.List<AddedCheck> getAddedCheck() {
        return this.addedCheck;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return configRequirementIds
     */
    public ConfigRequirementIds getConfigRequirementIds() {
        return this.configRequirementIds;
    }

    /**
     * @return configStandardIds
     */
    public ConfigStandardIds getConfigStandardIds() {
        return this.configStandardIds;
    }

    /**
     * @return configure
     */
    public String getConfigure() {
        return this.configure;
    }

    /**
     * @return cycleDays
     */
    public java.util.List<Integer> getCycleDays() {
        return this.cycleDays;
    }

    /**
     * @return daysOfMonth
     */
    public java.util.List<Integer> getDaysOfMonth() {
        return this.daysOfMonth;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableAddCheck
     */
    public Boolean getEnableAddCheck() {
        return this.enableAddCheck;
    }

    /**
     * @return enableAutoCheck
     */
    public Boolean getEnableAutoCheck() {
        return this.enableAutoCheck;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return endTimeSeconds
     */
    public Integer getEndTimeSeconds() {
        return this.endTimeSeconds;
    }

    /**
     * @return frequency
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return removedCheck
     */
    public java.util.List<RemovedCheck> getRemovedCheck() {
        return this.removedCheck;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return standardIds
     */
    public java.util.List<Long> getStandardIds() {
        return this.standardIds;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    /**
     * @return startTimeSeconds
     */
    public Integer getStartTimeSeconds() {
        return this.startTimeSeconds;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    /**
     * @return systemConfig
     */
    public Boolean getSystemConfig() {
        return this.systemConfig;
    }

    /**
     * @return vendors
     */
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<ChangeCheckConfigRequest, Builder> {
        private java.util.List<AddedCheck> addedCheck; 
        private String clientToken; 
        private String configId; 
        private ConfigRequirementIds configRequirementIds; 
        private ConfigStandardIds configStandardIds; 
        private String configure; 
        private java.util.List<Integer> cycleDays; 
        private java.util.List<Integer> daysOfMonth; 
        private Boolean dryRun; 
        private Boolean enableAddCheck; 
        private Boolean enableAutoCheck; 
        private Integer endTime; 
        private Integer endTimeSeconds; 
        private String frequency; 
        private String regionId; 
        private java.util.List<RemovedCheck> removedCheck; 
        private Long resourceDirectoryAccountId; 
        private java.util.List<Long> standardIds; 
        private Integer startTime; 
        private Integer startTimeSeconds; 
        private String strategyName; 
        private Boolean systemConfig; 
        private java.util.List<String> vendors; 

        private Builder() {
            super();
        } 

        private Builder(ChangeCheckConfigRequest request) {
            super(request);
            this.addedCheck = request.addedCheck;
            this.clientToken = request.clientToken;
            this.configId = request.configId;
            this.configRequirementIds = request.configRequirementIds;
            this.configStandardIds = request.configStandardIds;
            this.configure = request.configure;
            this.cycleDays = request.cycleDays;
            this.daysOfMonth = request.daysOfMonth;
            this.dryRun = request.dryRun;
            this.enableAddCheck = request.enableAddCheck;
            this.enableAutoCheck = request.enableAutoCheck;
            this.endTime = request.endTime;
            this.endTimeSeconds = request.endTimeSeconds;
            this.frequency = request.frequency;
            this.regionId = request.regionId;
            this.removedCheck = request.removedCheck;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.standardIds = request.standardIds;
            this.startTime = request.startTime;
            this.startTimeSeconds = request.startTimeSeconds;
            this.strategyName = request.strategyName;
            this.systemConfig = request.systemConfig;
            this.vendors = request.vendors;
        } 

        /**
         * <p>The list of check items to be added to the policy.
         * <notice> If the ConfigStandardIds or ConfigRequirementIds parameter is configured, this parameter does not take effect. </notice></p>
         */
        public Builder addedCheck(java.util.List<AddedCheck> addedCheck) {
            this.putQueryParameter("AddedCheck", addedCheck);
            this.addedCheck = addedCheck;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22222f91-57af-4907-87f1-f9046da*****</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>Configures the check policy by using the IDs of the specified regulations.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the regulation IDs. If the ConfigStandardIds parameter is configured, this parameter does not take effect.</p>
         * </blockquote>
         */
        public Builder configRequirementIds(ConfigRequirementIds configRequirementIds) {
            String configRequirementIdsShrink = shrink(configRequirementIds, "ConfigRequirementIds", "json");
            this.putQueryParameter("ConfigRequirementIds", configRequirementIdsShrink);
            this.configRequirementIds = configRequirementIds;
            return this;
        }

        /**
         * <p>Configures the check policy by using the IDs of the specified standards.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the standard IDs.</p>
         * </blockquote>
         */
        public Builder configStandardIds(ConfigStandardIds configStandardIds) {
            String configStandardIdsShrink = shrink(configStandardIds, "ConfigStandardIds", "json");
            this.putQueryParameter("ConfigStandardIds", configStandardIdsShrink);
            this.configStandardIds = configStandardIds;
            return this;
        }

        /**
         * <p>The field configuration. Valid values:</p>
         * <ul>
         * <li><strong>all</strong>: Adds all check items.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder configure(String configure) {
            this.putQueryParameter("Configure", configure);
            this.configure = configure;
            return this;
        }

        /**
         * <p>The periodic check time.</p>
         */
        public Builder cycleDays(java.util.List<Integer> cycleDays) {
            this.putQueryParameter("CycleDays", cycleDays);
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * <p>The list of days of the month when the policy cycle is monthly.</p>
         */
        public Builder daysOfMonth(java.util.List<Integer> daysOfMonth) {
            this.putQueryParameter("DaysOfMonth", daysOfMonth);
            this.daysOfMonth = daysOfMonth;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li>true: Only checks the request without performing the actual operation.</li>
         * <li>false: Executes the request normally.</li>
         * </ul>
         * <p>Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to check new check items by default when new check items are added to the selected regulations. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableAddCheck(Boolean enableAddCheck) {
            this.putQueryParameter("EnableAddCheck", enableAddCheck);
            this.enableAddCheck = enableAddCheck;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic periodic checks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAutoCheck(Boolean enableAutoCheck) {
            this.putQueryParameter("EnableAutoCheck", enableAutoCheck);
            this.enableAutoCheck = enableAutoCheck;
            return this;
        }

        /**
         * <p>The end time of the check time period, which indicates the hour of the day. The start time and end time must be selected from the following time intervals. Valid values: 6, 12, 18, and 24.</p>
         * <ul>
         * <li><strong>0~6</strong>: If the start time is 0, the end time must be set to 6 on the same day.</li>
         * <li><strong>6~12</strong>: If the start time is 6, the end time must be set to 12 on the same day.</li>
         * <li><strong>12~18</strong>: If the start time is 12, the end time must be set to 18 on the same day.</li>
         * <li><strong>18~24</strong>: If the start time is 18, the end time must be set to 24 on the same day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The end time of the check, in seconds from 00:00:00 of the current day. Valid values: 1 to 86400, where 86400 indicates 00:00:00 of the next day. This parameter is optional. If this parameter is not provided, the current value of the policy is retained. This parameter must be paired with StartTimeSeconds. If only one of them is provided, the system returns IllegalParam (paramName=scheduleTime). If both this parameter and StartTime/EndTime are provided, the second-level parameters take precedence, and the hour-level parameters are ignored. The time window span must not be less than 60 seconds. This parameter is not accepted for the system default policy (ConfigId=default) and will be rejected if provided.</p>
         * 
         * <strong>example:</strong>
         * <p>32399</p>
         */
        public Builder endTimeSeconds(Integer endTimeSeconds) {
            this.putQueryParameter("EndTimeSeconds", endTimeSeconds);
            this.endTimeSeconds = endTimeSeconds;
            return this;
        }

        /**
         * <p>The frequency type. Valid values:</p>
         * <ul>
         * <li>DAILY: Daily.</li>
         * <li>WEEKLY: Weekly.</li>
         * <li>MONTHLY: Monthly.</li>
         * <li>6HOURLY: Every 6 hours.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>The region of the Security Center instance. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: Center</li>
         * <li><strong>ap-southeast-1</strong>: Singapore</li>
         * </ul>
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
         * <p>The list of check items to be removed from the policy.
         * <notice> If the ConfigStandardIds or ConfigRequirementIds parameter is configured, this parameter does not take effect. </notice></p>
         */
        public Builder removedCheck(java.util.List<RemovedCheck> removedCheck) {
            this.putQueryParameter("RemovedCheck", removedCheck);
            this.removedCheck = removedCheck;
            return this;
        }

        /**
         * <p>The ID of the member accounts in the resource folder, which is an Alibaba Cloud account ID.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1232428423234****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>This parameter is deprecated and can be ignored.</p>
         */
        public Builder standardIds(java.util.List<Long> standardIds) {
            this.putQueryParameter("StandardIds", standardIds);
            this.standardIds = standardIds;
            return this;
        }

        /**
         * <p>The start time of the check time period, which indicates the hour of the day. The start time and end time must be selected from the following time intervals. Valid values: 0, 6, 12, and 18.</p>
         * <ul>
         * <li><strong>0~6</strong>: If the start time is 0, the end time must be set to 6 on the same day.</li>
         * <li><strong>6~12</strong>: If the start time is 6, the end time must be set to 12 on the same day.</li>
         * <li><strong>12~18</strong>: If the start time is 12, the end time must be set to 18 on the same day.</li>
         * <li><strong>18~24</strong>: If the start time is 18, the end time must be set to 24 on the same day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The start time of the check, in seconds from 00:00:00 of the current day. Valid values: 0 to 86399, which correspond to 00:00:00 to 23:59:59. This parameter is optional. If this parameter is not provided, the current value of the policy is retained. This parameter must be paired with EndTimeSeconds. If only one of them is provided, the system returns IllegalParam (paramName=scheduleTime). If both this parameter and StartTime/EndTime are provided, the second-level parameters take precedence, and the hour-level parameters are ignored. If the two sets of parameters are inconsistent, the server records a WARN log. The time window span must not be less than 60 seconds. The frequency of the system default policy (ConfigId=default) is always 6HOURLY. This parameter is not accepted for the default policy and will be rejected if provided. Under a multi-policy frequency, the actual scan execution time is exactly the second specified by this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>25200</p>
         */
        public Builder startTimeSeconds(Integer startTimeSeconds) {
            this.putQueryParameter("StartTimeSeconds", startTimeSeconds);
            this.startTimeSeconds = startTimeSeconds;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * <p>Specifies whether to use the automatically generated system configuration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder systemConfig(Boolean systemConfig) {
            this.putQueryParameter("SystemConfig", systemConfig);
            this.systemConfig = systemConfig;
            return this;
        }

        /**
         * <p>The list of cloud providers.</p>
         */
        public Builder vendors(java.util.List<String> vendors) {
            this.putQueryParameter("Vendors", vendors);
            this.vendors = vendors;
            return this;
        }

        @Override
        public ChangeCheckConfigRequest build() {
            return new ChangeCheckConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChangeCheckConfigRequest} extends {@link TeaModel}
     *
     * <p>ChangeCheckConfigRequest</p>
     */
    public static class AddedCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("SectionId")
        private Long sectionId;

        private AddedCheck(Builder builder) {
            this.checkId = builder.checkId;
            this.sectionId = builder.sectionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddedCheck create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return sectionId
         */
        public Long getSectionId() {
            return this.sectionId;
        }

        public static final class Builder {
            private Long checkId; 
            private Long sectionId; 

            private Builder() {
            } 

            private Builder(AddedCheck model) {
                this.checkId = model.checkId;
                this.sectionId = model.sectionId;
            } 

            /**
             * <p>The ID of the check item.</p>
             * <blockquote>
             * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the check item ID.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The section ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
             */
            public Builder sectionId(Long sectionId) {
                this.sectionId = sectionId;
                return this;
            }

            public AddedCheck build() {
                return new AddedCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeCheckConfigRequest} extends {@link TeaModel}
     *
     * <p>ChangeCheckConfigRequest</p>
     */
    public static class ConfigRequirementIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddIds")
        private java.util.List<Long> addIds;

        @com.aliyun.core.annotation.NameInMap("RemoveIds")
        private java.util.List<Long> removeIds;

        private ConfigRequirementIds(Builder builder) {
            this.addIds = builder.addIds;
            this.removeIds = builder.removeIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRequirementIds create() {
            return builder().build();
        }

        /**
         * @return addIds
         */
        public java.util.List<Long> getAddIds() {
            return this.addIds;
        }

        /**
         * @return removeIds
         */
        public java.util.List<Long> getRemoveIds() {
            return this.removeIds;
        }

        public static final class Builder {
            private java.util.List<Long> addIds; 
            private java.util.List<Long> removeIds; 

            private Builder() {
            } 

            private Builder(ConfigRequirementIds model) {
                this.addIds = model.addIds;
                this.removeIds = model.removeIds;
            } 

            /**
             * <p>The list of regulation IDs to be added to the policy.</p>
             */
            public Builder addIds(java.util.List<Long> addIds) {
                this.addIds = addIds;
                return this;
            }

            /**
             * <p>The list of regulation IDs to be removed from the policy.</p>
             */
            public Builder removeIds(java.util.List<Long> removeIds) {
                this.removeIds = removeIds;
                return this;
            }

            public ConfigRequirementIds build() {
                return new ConfigRequirementIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeCheckConfigRequest} extends {@link TeaModel}
     *
     * <p>ChangeCheckConfigRequest</p>
     */
    public static class ConfigStandardIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddIds")
        private java.util.List<Long> addIds;

        @com.aliyun.core.annotation.NameInMap("RemoveIds")
        private java.util.List<Long> removeIds;

        private ConfigStandardIds(Builder builder) {
            this.addIds = builder.addIds;
            this.removeIds = builder.removeIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigStandardIds create() {
            return builder().build();
        }

        /**
         * @return addIds
         */
        public java.util.List<Long> getAddIds() {
            return this.addIds;
        }

        /**
         * @return removeIds
         */
        public java.util.List<Long> getRemoveIds() {
            return this.removeIds;
        }

        public static final class Builder {
            private java.util.List<Long> addIds; 
            private java.util.List<Long> removeIds; 

            private Builder() {
            } 

            private Builder(ConfigStandardIds model) {
                this.addIds = model.addIds;
                this.removeIds = model.removeIds;
            } 

            /**
             * <p>The list of standard IDs to be added to the policy.</p>
             */
            public Builder addIds(java.util.List<Long> addIds) {
                this.addIds = addIds;
                return this;
            }

            /**
             * <p>The list of standard IDs to be removed from the policy.</p>
             */
            public Builder removeIds(java.util.List<Long> removeIds) {
                this.removeIds = removeIds;
                return this;
            }

            public ConfigStandardIds build() {
                return new ConfigStandardIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeCheckConfigRequest} extends {@link TeaModel}
     *
     * <p>ChangeCheckConfigRequest</p>
     */
    public static class RemovedCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("SectionId")
        private Long sectionId;

        private RemovedCheck(Builder builder) {
            this.checkId = builder.checkId;
            this.sectionId = builder.sectionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovedCheck create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return sectionId
         */
        public Long getSectionId() {
            return this.sectionId;
        }

        public static final class Builder {
            private Long checkId; 
            private Long sectionId; 

            private Builder() {
            } 

            private Builder(RemovedCheck model) {
                this.checkId = model.checkId;
                this.sectionId = model.sectionId;
            } 

            /**
             * <p>The ID of the check item.</p>
             * <blockquote>
             * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the check item ID.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The section ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
             */
            public Builder sectionId(Long sectionId) {
                this.sectionId = sectionId;
                return this;
            }

            public RemovedCheck build() {
                return new RemovedCheck(this);
            } 

        } 

    }
}
