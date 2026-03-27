// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeDiagnoseReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnoseReportResponseBody</p>
 */
public class DescribeDiagnoseReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Reports")
    private java.util.List<Reports> reports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDiagnoseReportResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.reports = builder.reports;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnoseReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return reports
     */
    public java.util.List<Reports> getReports() {
        return this.reports;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<Reports> reports; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDiagnoseReportResponseBody model) {
            this.nextToken = model.nextToken;
            this.reports = model.reports;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Reports.
         */
        public Builder reports(java.util.List<Reports> reports) {
            this.reports = reports;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiagnoseReportResponseBody build() {
            return new DescribeDiagnoseReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnoseReportResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("RecommendAction")
        private String recommendAction;

        @com.aliyun.core.annotation.NameInMap("RecommendParams")
        private String recommendParams;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Events(Builder builder) {
            this.description = builder.description;
            this.eventName = builder.eventName;
            this.recommendAction = builder.recommendAction;
            this.recommendParams = builder.recommendParams;
            this.severity = builder.severity;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return recommendAction
         */
        public String getRecommendAction() {
            return this.recommendAction;
        }

        /**
         * @return recommendParams
         */
        public String getRecommendParams() {
            return this.recommendParams;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String description; 
            private String eventName; 
            private String recommendAction; 
            private String recommendParams; 
            private String severity; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.description = model.description;
                this.eventName = model.eventName;
                this.recommendAction = model.recommendAction;
                this.recommendParams = model.recommendParams;
                this.severity = model.severity;
                this.startTime = model.startTime;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * RecommendAction.
             */
            public Builder recommendAction(String recommendAction) {
                this.recommendAction = recommendAction;
                return this;
            }

            /**
             * RecommendParams.
             */
            public Builder recommendParams(String recommendParams) {
                this.recommendParams = recommendParams;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnoseReportResponseBody</p>
     */
    public static class Reports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("DiagnoseEndTime")
        private Long diagnoseEndTime;

        @com.aliyun.core.annotation.NameInMap("DiagnoseStartTime")
        private Long diagnoseStartTime;

        @com.aliyun.core.annotation.NameInMap("DiagnoseType")
        private String diagnoseType;

        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List<Events> events;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private Long finishedTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Reports(Builder builder) {
            this.aliUid = builder.aliUid;
            this.creationTime = builder.creationTime;
            this.diagnoseEndTime = builder.diagnoseEndTime;
            this.diagnoseStartTime = builder.diagnoseStartTime;
            this.diagnoseType = builder.diagnoseType;
            this.events = builder.events;
            this.finishedTime = builder.finishedTime;
            this.regionId = builder.regionId;
            this.reportId = builder.reportId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.severity = builder.severity;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return diagnoseEndTime
         */
        public Long getDiagnoseEndTime() {
            return this.diagnoseEndTime;
        }

        /**
         * @return diagnoseStartTime
         */
        public Long getDiagnoseStartTime() {
            return this.diagnoseStartTime;
        }

        /**
         * @return diagnoseType
         */
        public String getDiagnoseType() {
            return this.diagnoseType;
        }

        /**
         * @return events
         */
        public java.util.List<Events> getEvents() {
            return this.events;
        }

        /**
         * @return finishedTime
         */
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long aliUid; 
            private Long creationTime; 
            private Long diagnoseEndTime; 
            private Long diagnoseStartTime; 
            private String diagnoseType; 
            private java.util.List<Events> events; 
            private Long finishedTime; 
            private String regionId; 
            private String reportId; 
            private String resourceId; 
            private String resourceType; 
            private String severity; 
            private String status; 

            private Builder() {
            } 

            private Builder(Reports model) {
                this.aliUid = model.aliUid;
                this.creationTime = model.creationTime;
                this.diagnoseEndTime = model.diagnoseEndTime;
                this.diagnoseStartTime = model.diagnoseStartTime;
                this.diagnoseType = model.diagnoseType;
                this.events = model.events;
                this.finishedTime = model.finishedTime;
                this.regionId = model.regionId;
                this.reportId = model.reportId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.severity = model.severity;
                this.status = model.status;
            } 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DiagnoseEndTime.
             */
            public Builder diagnoseEndTime(Long diagnoseEndTime) {
                this.diagnoseEndTime = diagnoseEndTime;
                return this;
            }

            /**
             * DiagnoseStartTime.
             */
            public Builder diagnoseStartTime(Long diagnoseStartTime) {
                this.diagnoseStartTime = diagnoseStartTime;
                return this;
            }

            /**
             * DiagnoseType.
             */
            public Builder diagnoseType(String diagnoseType) {
                this.diagnoseType = diagnoseType;
                return this;
            }

            /**
             * Events.
             */
            public Builder events(java.util.List<Events> events) {
                this.events = events;
                return this;
            }

            /**
             * FinishedTime.
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
}
