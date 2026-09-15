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
    @com.aliyun.core.annotation.NameInMap("SystemConfig")
    private Boolean systemConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List<String> vendors;

    private ChangeCheckConfigRequest(Builder builder) {
        super(builder);
        this.addedCheck = builder.addedCheck;
        this.clientToken = builder.clientToken;
        this.configRequirementIds = builder.configRequirementIds;
        this.configStandardIds = builder.configStandardIds;
        this.configure = builder.configure;
        this.cycleDays = builder.cycleDays;
        this.dryRun = builder.dryRun;
        this.enableAddCheck = builder.enableAddCheck;
        this.enableAutoCheck = builder.enableAutoCheck;
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.removedCheck = builder.removedCheck;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.standardIds = builder.standardIds;
        this.startTime = builder.startTime;
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
        private ConfigRequirementIds configRequirementIds; 
        private ConfigStandardIds configStandardIds; 
        private String configure; 
        private java.util.List<Integer> cycleDays; 
        private Boolean dryRun; 
        private Boolean enableAddCheck; 
        private Boolean enableAutoCheck; 
        private Integer endTime; 
        private String regionId; 
        private java.util.List<RemovedCheck> removedCheck; 
        private Long resourceDirectoryAccountId; 
        private java.util.List<Long> standardIds; 
        private Integer startTime; 
        private Boolean systemConfig; 
        private java.util.List<String> vendors; 

        private Builder() {
            super();
        } 

        private Builder(ChangeCheckConfigRequest request) {
            super(request);
            this.addedCheck = request.addedCheck;
            this.clientToken = request.clientToken;
            this.configRequirementIds = request.configRequirementIds;
            this.configStandardIds = request.configStandardIds;
            this.configure = request.configure;
            this.cycleDays = request.cycleDays;
            this.dryRun = request.dryRun;
            this.enableAddCheck = request.enableAddCheck;
            this.enableAutoCheck = request.enableAutoCheck;
            this.endTime = request.endTime;
            this.regionId = request.regionId;
            this.removedCheck = request.removedCheck;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.standardIds = request.standardIds;
            this.startTime = request.startTime;
            this.systemConfig = request.systemConfig;
            this.vendors = request.vendors;
        } 

        /**
         * <p>The list of check items to add to the policy.
         * <notice> If the ConfigStandardIds or ConfigRequirementIds parameter is specified, this parameter does not take effect.</p>
         */
        public Builder addedCheck(java.util.List<AddedCheck> addedCheck) {
            this.putQueryParameter("AddedCheck", addedCheck);
            this.addedCheck = addedCheck;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Use a different token for each request. Only ASCII characters are supported. The token can be up to 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Configures the check policy by specifying requirement IDs.</p>
         * <blockquote>
         * <p>Call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain requirement IDs. If the ConfigStandardIds parameter is specified, this parameter does not take effect.</p>
         * </blockquote>
         */
        public Builder configRequirementIds(ConfigRequirementIds configRequirementIds) {
            String configRequirementIdsShrink = shrink(configRequirementIds, "ConfigRequirementIds", "json");
            this.putQueryParameter("ConfigRequirementIds", configRequirementIdsShrink);
            this.configRequirementIds = configRequirementIds;
            return this;
        }

        /**
         * <p>Configures the check policy by specifying standard IDs.</p>
         * <blockquote>
         * <p>Call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain standard IDs.</p>
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
         * <li><strong>all</strong>: adds all check items.</li>
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
         * <p>The periodic check schedule.</p>
         */
        public Builder cycleDays(java.util.List<Integer> cycleDays) {
            this.putQueryParameter("CycleDays", cycleDays);
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values: true: performs only a dry run without performing the actual operation. false: performs the actual request. Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to automatically check newly added check items in the selected requirements. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> Enabled.</li>
         * <li><strong>false:</strong> Disabled.</li>
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
         * <li><strong>true:</strong> Enabled.</li>
         * <li><strong>false:</strong> Disabled.</li>
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
         * <p>The end hour of the check time window, indicating the hour of the day. The start time and end time must fall within one of the following time ranges. Valid values: 6, 12, 18, and 24.</p>
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
         * <p>The region of the Security Center instance. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou:</strong> China</li>
         * <li><strong>ap-southeast-1:</strong> Singapore</li>
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
         * <p>The list of check items to remove from the policy.
         * <notice> If the ConfigStandardIds or ConfigRequirementIds parameter is specified, this parameter does not take effect.</p>
         */
        public Builder removedCheck(java.util.List<RemovedCheck> removedCheck) {
            this.putQueryParameter("RemovedCheck", removedCheck);
            this.removedCheck = removedCheck;
            return this;
        }

        /**
         * <p>The ID of the member account in the resource directory (Alibaba Cloud account).</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
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
         * <p>This parameter is deprecated and does not need to be specified.</p>
         */
        public Builder standardIds(java.util.List<Long> standardIds) {
            this.putQueryParameter("StandardIds", standardIds);
            this.standardIds = standardIds;
            return this;
        }

        /**
         * <p>The start hour of the check time window, indicating the hour of the day. The start time and end time must fall within one of the following time ranges. Valid values: 0, 6, 12, and 18.</p>
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
         * <p>Specifies whether to use the system-generated configuration. Valid values:</p>
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
         * <p>The list of cloud service providers.</p>
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
             * <p>Call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain check item IDs.</p>
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
             * <p>The list of requirement IDs to add to the policy.</p>
             */
            public Builder addIds(java.util.List<Long> addIds) {
                this.addIds = addIds;
                return this;
            }

            /**
             * <p>The list of requirement IDs to remove from the policy.</p>
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
             * <p>The list of standard IDs to add to the policy.</p>
             */
            public Builder addIds(java.util.List<Long> addIds) {
                this.addIds = addIds;
                return this;
            }

            /**
             * <p>The list of standard IDs to remove from the policy.</p>
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
             * <p>Call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain check item IDs.</p>
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
