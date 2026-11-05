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
 * {@link GetCheckConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckConfigResponseBody</p>
 */
public class GetCheckConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.NameInMap("CycleDays")
    private java.util.List<Integer> cycleDays;

    @com.aliyun.core.annotation.NameInMap("DaysOfMonth")
    private java.util.List<Integer> daysOfMonth;

    @com.aliyun.core.annotation.NameInMap("EnableAddCheck")
    private Boolean enableAddCheck;

    @com.aliyun.core.annotation.NameInMap("EnableAutoCheck")
    private Boolean enableAutoCheck;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Integer endTime;

    @com.aliyun.core.annotation.NameInMap("EndTimeSeconds")
    private Integer endTimeSeconds;

    @com.aliyun.core.annotation.NameInMap("Exists")
    private Boolean exists;

    @com.aliyun.core.annotation.NameInMap("Frequency")
    private String frequency;

    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SelectedChecks")
    private java.util.List<SelectedChecks> selectedChecks;

    @com.aliyun.core.annotation.NameInMap("Standards")
    private java.util.List<Standards> standards;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Integer startTime;

    @com.aliyun.core.annotation.NameInMap("StartTimeSeconds")
    private Integer startTimeSeconds;

    @com.aliyun.core.annotation.NameInMap("StrategyName")
    private String strategyName;

    private GetCheckConfigResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.cycleDays = builder.cycleDays;
        this.daysOfMonth = builder.daysOfMonth;
        this.enableAddCheck = builder.enableAddCheck;
        this.enableAutoCheck = builder.enableAutoCheck;
        this.endTime = builder.endTime;
        this.endTimeSeconds = builder.endTimeSeconds;
        this.exists = builder.exists;
        this.frequency = builder.frequency;
        this.isDefault = builder.isDefault;
        this.requestId = builder.requestId;
        this.selectedChecks = builder.selectedChecks;
        this.standards = builder.standards;
        this.startTime = builder.startTime;
        this.startTimeSeconds = builder.startTimeSeconds;
        this.strategyName = builder.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
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
     * @return exists
     */
    public Boolean getExists() {
        return this.exists;
    }

    /**
     * @return frequency
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return selectedChecks
     */
    public java.util.List<SelectedChecks> getSelectedChecks() {
        return this.selectedChecks;
    }

    /**
     * @return standards
     */
    public java.util.List<Standards> getStandards() {
        return this.standards;
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

    public static final class Builder {
        private String configId; 
        private java.util.List<Integer> cycleDays; 
        private java.util.List<Integer> daysOfMonth; 
        private Boolean enableAddCheck; 
        private Boolean enableAutoCheck; 
        private Integer endTime; 
        private Integer endTimeSeconds; 
        private Boolean exists; 
        private String frequency; 
        private Boolean isDefault; 
        private String requestId; 
        private java.util.List<SelectedChecks> selectedChecks; 
        private java.util.List<Standards> standards; 
        private Integer startTime; 
        private Integer startTimeSeconds; 
        private String strategyName; 

        private Builder() {
        } 

        private Builder(GetCheckConfigResponseBody model) {
            this.configId = model.configId;
            this.cycleDays = model.cycleDays;
            this.daysOfMonth = model.daysOfMonth;
            this.enableAddCheck = model.enableAddCheck;
            this.enableAutoCheck = model.enableAutoCheck;
            this.endTime = model.endTime;
            this.endTimeSeconds = model.endTimeSeconds;
            this.exists = model.exists;
            this.frequency = model.frequency;
            this.isDefault = model.isDefault;
            this.requestId = model.requestId;
            this.selectedChecks = model.selectedChecks;
            this.standards = model.standards;
            this.startTime = model.startTime;
            this.startTimeSeconds = model.startTimeSeconds;
            this.strategyName = model.strategyName;
        } 

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22222f91-57af-4907-87f1-f9046da4****</p>
         */
        public Builder configId(String configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>The periodic check time.</p>
         */
        public Builder cycleDays(java.util.List<Integer> cycleDays) {
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * <p>The list of days when the policy cycle is monthly.</p>
         */
        public Builder daysOfMonth(java.util.List<Integer> daysOfMonth) {
            this.daysOfMonth = daysOfMonth;
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
            this.enableAutoCheck = enableAutoCheck;
            return this;
        }

        /**
         * <p>The end time of the check time period, which indicates the hour of the day. The start time and end time of the query can only be selected from the following time intervals.</p>
         * <ul>
         * <li><strong>0 to 6</strong>: When the start time is 0, the end time must be set to 6 on the same day.</li>
         * <li><strong>6 to 12</strong>: When the start time is 6, the end time must be set to 12 on the same day.</li>
         * <li><strong>12 to 18</strong>: When the start time is 12, the end time must be set to 18 on the same day.</li>
         * <li><strong>18 to 24</strong>: When the start time is 18, the end time must be set to 24 on the same day. The unit is hours (h).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder endTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The end time of the check, in seconds from 00:00:00 on the current day. Valid values: 1 to 86400. The value 86400 indicates 00:00:00 on the next day. This value is directly passed through from the database and is the only authoritative source for the exact window. For the system default policy (Frequency=6HOURLY) row, this value is always null (not 0), and callers must perform null checks.</p>
         * 
         * <strong>example:</strong>
         * <p>32399</p>
         */
        public Builder endTimeSeconds(Integer endTimeSeconds) {
            this.endTimeSeconds = endTimeSeconds;
            return this;
        }

        /**
         * <p>Indicates whether the requested ConfigId has a corresponding policy. When the value is false, the operation still returns a success response and the remaining configuration fields are empty. Callers should render an empty state based on this value and not rely on error codes.</p>
         */
        public Builder exists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * <p>The frequency type. Valid values:</p>
         * <ul>
         * <li>DAILY: daily</li>
         * <li>WEEKLY: weekly</li>
         * <li>MONTHLY: monthly</li>
         * <li>6HOURLY: every 6 hours</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        public Builder frequency(String frequency) {
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>Indicates whether the policy is the default policy.</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>The ID of the request. It is a unique identifier generated by Alibaba Cloud for the request and can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>5A3D5C8F-2A42-5477-BDD8-27E64B5F1739</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The check items selected in the policy.</p>
         */
        public Builder selectedChecks(java.util.List<SelectedChecks> selectedChecks) {
            this.selectedChecks = selectedChecks;
            return this;
        }

        /**
         * <p>The list of check item information.</p>
         */
        public Builder standards(java.util.List<Standards> standards) {
            this.standards = standards;
            return this;
        }

        /**
         * <p>The start time of the check time period, which indicates the hour of the day. The unit is hours (h).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The start time of the check, in seconds from 00:00:00 on the current day. Valid values: 0 to 86399. This value is directly passed through from the database and is the only authoritative source for the exact window. For the system default policy (Frequency=6HOURLY) row, this value is always null (not 0), and callers must perform null checks. Do not use the derived StartTime to reverse-engineer this value because the conversion is irreversible.</p>
         * 
         * <strong>example:</strong>
         * <p>25200</p>
         */
        public Builder startTimeSeconds(Integer startTimeSeconds) {
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
            this.strategyName = strategyName;
            return this;
        }

        public GetCheckConfigResponseBody build() {
            return new GetCheckConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCheckConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckConfigResponseBody</p>
     */
    public static class SelectedChecks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("SectionId")
        private Long sectionId;

        private SelectedChecks(Builder builder) {
            this.checkId = builder.checkId;
            this.sectionId = builder.sectionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedChecks create() {
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

            private Builder(SelectedChecks model) {
                this.checkId = model.checkId;
                this.sectionId = model.sectionId;
            } 

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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

            public SelectedChecks build() {
                return new SelectedChecks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckConfigResponseBody</p>
     */
    public static class Standards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Standards(Builder builder) {
            this.id = builder.id;
            this.showName = builder.showName;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Standards create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long id; 
            private String showName; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Standards model) {
                this.id = model.id;
                this.showName = model.showName;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud service configuration management</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The enabling status of the check item. Valid values:</p>
             * <ul>
             * <li><strong>ON</strong>: Enabled.</li>
             * <li><strong>OFF</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the check item. Valid values:</p>
             * <ul>
             * <li><strong>RISK</strong>: cloud service configuration management</li>
             * <li><strong>IDENTITY_PERMISSION</strong>: identity and permission management</li>
             * <li><strong>COMPLIANCE</strong>: compliance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RISK</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Standards build() {
                return new Standards(this);
            } 

        } 

    }
}
