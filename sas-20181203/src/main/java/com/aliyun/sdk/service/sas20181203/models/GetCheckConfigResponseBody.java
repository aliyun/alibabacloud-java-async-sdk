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
    @com.aliyun.core.annotation.NameInMap("CycleDays")
    private java.util.List<Integer> cycleDays;

    @com.aliyun.core.annotation.NameInMap("EnableAddCheck")
    private Boolean enableAddCheck;

    @com.aliyun.core.annotation.NameInMap("EnableAutoCheck")
    private Boolean enableAutoCheck;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Integer endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SelectedChecks")
    private java.util.List<SelectedChecks> selectedChecks;

    @com.aliyun.core.annotation.NameInMap("Standards")
    private java.util.List<Standards> standards;

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

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private java.util.List<Integer> cycleDays; 
        private Boolean enableAddCheck; 
        private Boolean enableAutoCheck; 
        private Integer endTime; 
        private String requestId; 
        private java.util.List<SelectedChecks> selectedChecks; 
        private java.util.List<Standards> standards; 
        private Integer startTime; 

        private Builder() {
        } 

        private Builder(GetCheckConfigResponseBody model) {
            this.cycleDays = model.cycleDays;
            this.enableAddCheck = model.enableAddCheck;
            this.enableAutoCheck = model.enableAutoCheck;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.selectedChecks = model.selectedChecks;
            this.standards = model.standards;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The days in a week on which an automatic check is performed.</p>
         */
        public Builder cycleDays(java.util.List<Integer> cycleDays) {
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * <p>Indicates whether the check for new check items in the selected requirement item is enabled by default. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>Indicates whether the automatic check is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The end time of the check. The value indicates a point in time. The time period that is specified by the start time and end time must be one of the following time periods:</p>
         * <ul>
         * <li><strong>00:00 to 06:00</strong>: If StartTime is set to 00:00, EndTime must be set to 06:00.</li>
         * <li><strong>06:00 to 12:00</strong>: If StartTime is set to 06:00, EndTime must be set to 12:00.</li>
         * <li><strong>12:00 to 18:00</strong>: If StartTime is set to 12:00, EndTime must be set to 18:00.</li>
         * <li><strong>18:00 to 24:00</strong>: If StartTime is set to 18:00, EndTime must be set to 24:00.</li>
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
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
         * <p>The information about the check items.</p>
         */
        public Builder standards(java.util.List<Standards> standards) {
            this.standards = standards;
            return this;
        }

        /**
         * <p>The start time of the check. The value indicates a point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
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
             * <p>The status of the check item. Valid values:</p>
             * <ul>
             * <li><strong>ON</strong>: The check item is enabled.</li>
             * <li><strong>OFF</strong>: The check item is disabled.</li>
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
