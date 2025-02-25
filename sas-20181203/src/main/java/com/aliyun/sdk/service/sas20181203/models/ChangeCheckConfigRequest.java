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
        this.configRequirementIds = builder.configRequirementIds;
        this.configStandardIds = builder.configStandardIds;
        this.configure = builder.configure;
        this.cycleDays = builder.cycleDays;
        this.enableAddCheck = builder.enableAddCheck;
        this.enableAutoCheck = builder.enableAutoCheck;
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.removedCheck = builder.removedCheck;
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
        private ConfigRequirementIds configRequirementIds; 
        private ConfigStandardIds configStandardIds; 
        private String configure; 
        private java.util.List<Integer> cycleDays; 
        private Boolean enableAddCheck; 
        private Boolean enableAutoCheck; 
        private Integer endTime; 
        private String regionId; 
        private java.util.List<RemovedCheck> removedCheck; 
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
            this.configRequirementIds = request.configRequirementIds;
            this.configStandardIds = request.configStandardIds;
            this.configure = request.configure;
            this.cycleDays = request.cycleDays;
            this.enableAddCheck = request.enableAddCheck;
            this.enableAutoCheck = request.enableAutoCheck;
            this.endTime = request.endTime;
            this.regionId = request.regionId;
            this.removedCheck = request.removedCheck;
            this.standardIds = request.standardIds;
            this.startTime = request.startTime;
            this.systemConfig = request.systemConfig;
            this.vendors = request.vendors;
        } 

        /**
         * <p>The list of check items that you want to add to the policy.</p>
         * <blockquote>
         * <p> If the ConfigStandardIds or ConfigRequirementIds parameter is configured, this parameter does not take effect.</p>
         * </blockquote>
         */
        public Builder addedCheck(java.util.List<AddedCheck> addedCheck) {
            this.putQueryParameter("AddedCheck", addedCheck);
            this.addedCheck = addedCheck;
            return this;
        }

        /**
         * <p>The requirement IDs that you want to specify for the check policy.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the requirement ID. If the ConfigStandardIds parameter is configured, this parameter does not take effect.</p>
         * </blockquote>
         */
        public Builder configRequirementIds(ConfigRequirementIds configRequirementIds) {
            String configRequirementIdsShrink = shrink(configRequirementIds, "ConfigRequirementIds", "json");
            this.putQueryParameter("ConfigRequirementIds", configRequirementIdsShrink);
            this.configRequirementIds = configRequirementIds;
            return this;
        }

        /**
         * <p>The standard IDs that you want to specify for the check policy.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the standard ID.</p>
         * </blockquote>
         */
        public Builder configStandardIds(ConfigStandardIds configStandardIds) {
            String configStandardIdsShrink = shrink(configStandardIds, "ConfigStandardIds", "json");
            this.putQueryParameter("ConfigStandardIds", configStandardIdsShrink);
            this.configStandardIds = configStandardIds;
            return this;
        }

        /**
         * <p>The configuration of the check item. Valid value:</p>
         * <ul>
         * <li><strong>all</strong>: Add all check items.</li>
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
         * <p>The days in a week on which a check is performed.</p>
         */
        public Builder cycleDays(java.util.List<Integer> cycleDays) {
            this.putQueryParameter("CycleDays", cycleDays);
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * <p>Specifies whether to check the new check items in the selected requirement item. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>Specifies whether to enable the automatic periodical check feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The end time of the check. The value specifies a point in time in a day. The time period that is specified by the start time and end time must be one of the following time periods:</p>
         * <ul>
         * <li><strong>00:00 to 06:00:</strong> If you set the StartTime parameter to 0, you must set the EndTime parameter to 6.</li>
         * <li><strong>06:00 to 12:00</strong>: If you set the StartTime parameter to 6, you must set the EndTime parameter to 12.</li>
         * <li><strong>12:00 to 18:00</strong>: If you set the StartTime parameter to 12, you must set the EndTime parameter to 18.</li>
         * <li><strong>18:00 to 24:00:</strong> If you set the StartTime parameter to 18, you must set the EndTime parameter to 24.</li>
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
         * <p>The region ID of the bastion host to query.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
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
         * <p>The list of the check items that you want to remove from the policy.</p>
         * <blockquote>
         * <p> If the ConfigStandardIds or ConfigRequirementIds parameter is configured, this parameter does not take effect.</p>
         * </blockquote>
         */
        public Builder removedCheck(java.util.List<RemovedCheck> removedCheck) {
            this.putQueryParameter("RemovedCheck", removedCheck);
            this.removedCheck = removedCheck;
            return this;
        }

        /**
         * <p>An array that consists of the information about the check item.</p>
         */
        public Builder standardIds(java.util.List<Long> standardIds) {
            this.putQueryParameter("StandardIds", standardIds);
            this.standardIds = standardIds;
            return this;
        }

        /**
         * <p>The start time of the check. The value specifies a point in time in a day.</p>
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
         * <p>Specifies whether to use the configuration automatically generated by the system. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The cloud service providers.</p>
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

            /**
             * <p>The ID of the check item.</p>
             * <blockquote>
             * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the ID of the check item.</p>
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

            /**
             * <p>The requirement IDs that you want to add to the policy.</p>
             */
            public Builder addIds(java.util.List<Long> addIds) {
                this.addIds = addIds;
                return this;
            }

            /**
             * <p>The requirement IDs that you want to remove from the policy.</p>
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

            /**
             * <p>The standard IDs that you want to add to the policy.</p>
             */
            public Builder addIds(java.util.List<Long> addIds) {
                this.addIds = addIds;
                return this;
            }

            /**
             * <p>The standard IDs that you want to remove from the policy.</p>
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

            /**
             * <p>The ID of the check item.</p>
             * <blockquote>
             * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the ID of the check item.</p>
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
