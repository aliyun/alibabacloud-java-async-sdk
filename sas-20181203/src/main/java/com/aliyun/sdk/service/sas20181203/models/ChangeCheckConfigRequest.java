// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeCheckConfigRequest} extends {@link RequestModel}
 *
 * <p>ChangeCheckConfigRequest</p>
 */
public class ChangeCheckConfigRequest extends Request {
    @Query
    @NameInMap("AddedCheck")
    private java.util.List < AddedCheck> addedCheck;

    @Query
    @NameInMap("ConfigRequirementIds")
    private ConfigRequirementIds configRequirementIds;

    @Query
    @NameInMap("ConfigStandardIds")
    private ConfigStandardIds configStandardIds;

    @Query
    @NameInMap("CycleDays")
    private java.util.List < Integer > cycleDays;

    @Query
    @NameInMap("EnableAddCheck")
    private Boolean enableAddCheck;

    @Query
    @NameInMap("EnableAutoCheck")
    private Boolean enableAutoCheck;

    @Query
    @NameInMap("EndTime")
    private Integer endTime;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RemovedCheck")
    private java.util.List < RemovedCheck> removedCheck;

    @Query
    @NameInMap("StandardIds")
    private java.util.List < Long > standardIds;

    @Query
    @NameInMap("StartTime")
    private Integer startTime;

    private ChangeCheckConfigRequest(Builder builder) {
        super(builder);
        this.addedCheck = builder.addedCheck;
        this.configRequirementIds = builder.configRequirementIds;
        this.configStandardIds = builder.configStandardIds;
        this.cycleDays = builder.cycleDays;
        this.enableAddCheck = builder.enableAddCheck;
        this.enableAutoCheck = builder.enableAutoCheck;
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.removedCheck = builder.removedCheck;
        this.standardIds = builder.standardIds;
        this.startTime = builder.startTime;
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
    public java.util.List < AddedCheck> getAddedCheck() {
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
     * @return cycleDays
     */
    public java.util.List < Integer > getCycleDays() {
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
    public java.util.List < RemovedCheck> getRemovedCheck() {
        return this.removedCheck;
    }

    /**
     * @return standardIds
     */
    public java.util.List < Long > getStandardIds() {
        return this.standardIds;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ChangeCheckConfigRequest, Builder> {
        private java.util.List < AddedCheck> addedCheck; 
        private ConfigRequirementIds configRequirementIds; 
        private ConfigStandardIds configStandardIds; 
        private java.util.List < Integer > cycleDays; 
        private Boolean enableAddCheck; 
        private Boolean enableAutoCheck; 
        private Integer endTime; 
        private String regionId; 
        private java.util.List < RemovedCheck> removedCheck; 
        private java.util.List < Long > standardIds; 
        private Integer startTime; 

        private Builder() {
            super();
        } 

        private Builder(ChangeCheckConfigRequest request) {
            super(request);
            this.addedCheck = request.addedCheck;
            this.configRequirementIds = request.configRequirementIds;
            this.configStandardIds = request.configStandardIds;
            this.cycleDays = request.cycleDays;
            this.enableAddCheck = request.enableAddCheck;
            this.enableAutoCheck = request.enableAutoCheck;
            this.endTime = request.endTime;
            this.regionId = request.regionId;
            this.removedCheck = request.removedCheck;
            this.standardIds = request.standardIds;
            this.startTime = request.startTime;
        } 

        /**
         * AddedCheck.
         */
        public Builder addedCheck(java.util.List < AddedCheck> addedCheck) {
            this.putQueryParameter("AddedCheck", addedCheck);
            this.addedCheck = addedCheck;
            return this;
        }

        /**
         * ConfigRequirementIds.
         */
        public Builder configRequirementIds(ConfigRequirementIds configRequirementIds) {
            String configRequirementIdsShrink = shrink(configRequirementIds, "ConfigRequirementIds", "json");
            this.putQueryParameter("ConfigRequirementIds", configRequirementIdsShrink);
            this.configRequirementIds = configRequirementIds;
            return this;
        }

        /**
         * ConfigStandardIds.
         */
        public Builder configStandardIds(ConfigStandardIds configStandardIds) {
            String configStandardIdsShrink = shrink(configStandardIds, "ConfigStandardIds", "json");
            this.putQueryParameter("ConfigStandardIds", configStandardIdsShrink);
            this.configStandardIds = configStandardIds;
            return this;
        }

        /**
         * CycleDays.
         */
        public Builder cycleDays(java.util.List < Integer > cycleDays) {
            this.putQueryParameter("CycleDays", cycleDays);
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * EnableAddCheck.
         */
        public Builder enableAddCheck(Boolean enableAddCheck) {
            this.putQueryParameter("EnableAddCheck", enableAddCheck);
            this.enableAddCheck = enableAddCheck;
            return this;
        }

        /**
         * EnableAutoCheck.
         */
        public Builder enableAutoCheck(Boolean enableAutoCheck) {
            this.putQueryParameter("EnableAutoCheck", enableAutoCheck);
            this.enableAutoCheck = enableAutoCheck;
            return this;
        }

        /**
         * The end time of the check. The value specifies a point in time in a day. The time period that is specified by the start time and end time must be one of the following time periods:
         * <p>
         * 
         * *   **00:00 to 06:00:** If you set the StartTime parameter to 0, you must set the EndTime parameter to 6.
         * *   **06:00 to 12:00**: If you set the StartTime parameter to 6, you must set the EndTime parameter to 12.
         * *   **12:00 to 18:00**: If you set the StartTime parameter to 12, you must set the EndTime parameter to 18.
         * *  **18:00 to 24:00:** If you set the StartTime parameter to 18, you must set the EndTime parameter to 24.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The region ID of the bastion host to query.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RemovedCheck.
         */
        public Builder removedCheck(java.util.List < RemovedCheck> removedCheck) {
            this.putQueryParameter("RemovedCheck", removedCheck);
            this.removedCheck = removedCheck;
            return this;
        }

        /**
         * An array that consists of the information about the check item.
         */
        public Builder standardIds(java.util.List < Long > standardIds) {
            this.putQueryParameter("StandardIds", standardIds);
            this.standardIds = standardIds;
            return this;
        }

        /**
         * The start time of the check. The value specifies a point in time in a day.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ChangeCheckConfigRequest build() {
            return new ChangeCheckConfigRequest(this);
        } 

    } 

    public static class AddedCheck extends TeaModel {
        @NameInMap("CheckId")
        private Long checkId;

        @NameInMap("SectionId")
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
             * CheckId.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * SectionId.
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
    public static class ConfigRequirementIds extends TeaModel {
        @NameInMap("AddIds")
        private java.util.List < Long > addIds;

        @NameInMap("RemoveIds")
        private java.util.List < Long > removeIds;

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
        public java.util.List < Long > getAddIds() {
            return this.addIds;
        }

        /**
         * @return removeIds
         */
        public java.util.List < Long > getRemoveIds() {
            return this.removeIds;
        }

        public static final class Builder {
            private java.util.List < Long > addIds; 
            private java.util.List < Long > removeIds; 

            /**
             * AddIds.
             */
            public Builder addIds(java.util.List < Long > addIds) {
                this.addIds = addIds;
                return this;
            }

            /**
             * RemoveIds.
             */
            public Builder removeIds(java.util.List < Long > removeIds) {
                this.removeIds = removeIds;
                return this;
            }

            public ConfigRequirementIds build() {
                return new ConfigRequirementIds(this);
            } 

        } 

    }
    public static class ConfigStandardIds extends TeaModel {
        @NameInMap("AddIds")
        private java.util.List < Long > addIds;

        @NameInMap("RemoveIds")
        private java.util.List < Long > removeIds;

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
        public java.util.List < Long > getAddIds() {
            return this.addIds;
        }

        /**
         * @return removeIds
         */
        public java.util.List < Long > getRemoveIds() {
            return this.removeIds;
        }

        public static final class Builder {
            private java.util.List < Long > addIds; 
            private java.util.List < Long > removeIds; 

            /**
             * AddIds.
             */
            public Builder addIds(java.util.List < Long > addIds) {
                this.addIds = addIds;
                return this;
            }

            /**
             * RemoveIds.
             */
            public Builder removeIds(java.util.List < Long > removeIds) {
                this.removeIds = removeIds;
                return this;
            }

            public ConfigStandardIds build() {
                return new ConfigStandardIds(this);
            } 

        } 

    }
    public static class RemovedCheck extends TeaModel {
        @NameInMap("CheckId")
        private Long checkId;

        @NameInMap("SectionId")
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
             * CheckId.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * SectionId.
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
