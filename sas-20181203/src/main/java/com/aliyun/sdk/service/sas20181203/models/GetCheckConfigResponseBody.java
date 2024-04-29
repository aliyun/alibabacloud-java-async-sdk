// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckConfigResponseBody</p>
 */
public class GetCheckConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CycleDays")
    private java.util.List < Integer > cycleDays;

    @com.aliyun.core.annotation.NameInMap("EnableAddCheck")
    private Boolean enableAddCheck;

    @com.aliyun.core.annotation.NameInMap("EnableAutoCheck")
    private Boolean enableAutoCheck;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Integer endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SelectedChecks")
    private java.util.List < SelectedChecks> selectedChecks;

    @com.aliyun.core.annotation.NameInMap("Standards")
    private java.util.List < Standards> standards;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Integer startTime;

    private GetCheckConfigResponseBody(Builder builder) {
        this.cycleDays = builder.cycleDays;
        this.enableAddCheck = builder.enableAddCheck;
        this.enableAutoCheck = builder.enableAutoCheck;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.selectedChecks = builder.selectedChecks;
        this.standards = builder.standards;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckConfigResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return selectedChecks
     */
    public java.util.List < SelectedChecks> getSelectedChecks() {
        return this.selectedChecks;
    }

    /**
     * @return standards
     */
    public java.util.List < Standards> getStandards() {
        return this.standards;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private java.util.List < Integer > cycleDays; 
        private Boolean enableAddCheck; 
        private Boolean enableAutoCheck; 
        private Integer endTime; 
        private String requestId; 
        private java.util.List < SelectedChecks> selectedChecks; 
        private java.util.List < Standards> standards; 
        private Integer startTime; 

        /**
         * The days in a week on which an automatic check is performed.
         */
        public Builder cycleDays(java.util.List < Integer > cycleDays) {
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * Indicates whether the check for new check items in the selected requirement item is enabled by default. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder enableAddCheck(Boolean enableAddCheck) {
            this.enableAddCheck = enableAddCheck;
            return this;
        }

        /**
         * Indicates whether the automatic check is enabled. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder enableAutoCheck(Boolean enableAutoCheck) {
            this.enableAutoCheck = enableAutoCheck;
            return this;
        }

        /**
         * The end time of the check. The value indicates a point in time. The time period that is specified by the start time and end time must be one of the following time periods:
         * <p>
         * 
         * *   **00:00 to 06:00**: If StartTime is set to 00:00, EndTime must be set to 06:00.
         * *   **06:00 to 12:00**: If StartTime is set to 06:00, EndTime must be set to 12:00.
         * *   **12:00 to 18:00**: If StartTime is set to 12:00, EndTime must be set to 18:00.
         * *   **18:00 to 24:00**: If StartTime is set to 18:00, EndTime must be set to 24:00.
         */
        public Builder endTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The check items selected in the policy.
         */
        public Builder selectedChecks(java.util.List < SelectedChecks> selectedChecks) {
            this.selectedChecks = selectedChecks;
            return this;
        }

        /**
         * The information about the check items.
         */
        public Builder standards(java.util.List < Standards> standards) {
            this.standards = standards;
            return this;
        }

        /**
         * The start time of the check. The value indicates a point in time.
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }

        public GetCheckConfigResponseBody build() {
            return new GetCheckConfigResponseBody(this);
        } 

    } 

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

            /**
             * The ID of the check item.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The section ID of the check item.
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

            /**
             * The ID of the check item.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the check item.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The status of the check item. Valid values:
             * <p>
             * 
             * *   **ON**: The check item is enabled.
             * *   **OFF**: The check item is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the check item. Valid values:
             * <p>
             * 
             * *   **RISK**: cloud service configuration management
             * *   **IDENTITY_PERMISSION**: identity and permission management
             * *   **COMPLIANCE**: compliance
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
