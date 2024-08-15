// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSimilarIncidentStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSimilarIncidentStatisticsResponseBody</p>
 */
public class GetSimilarIncidentStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetSimilarIncidentStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSimilarIncidentStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSimilarIncidentStatisticsResponseBody build() {
            return new GetSimilarIncidentStatisticsResponseBody(this);
        } 

    } 

    public static class SimilarIncidents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignUserId")
        private Long assignUserId;

        @com.aliyun.core.annotation.NameInMap("assignUserName")
        private String assignUserName;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("durationTime")
        private Long durationTime;

        @com.aliyun.core.annotation.NameInMap("finishReason")
        private Long finishReason;

        @com.aliyun.core.annotation.NameInMap("finishReasonDescription")
        private String finishReasonDescription;

        @com.aliyun.core.annotation.NameInMap("finishSolutionDescription")
        private String finishSolutionDescription;

        @com.aliyun.core.annotation.NameInMap("incidentFinishSolution")
        private Long incidentFinishSolution;

        @com.aliyun.core.annotation.NameInMap("incidentId")
        private Long incidentId;

        @com.aliyun.core.annotation.NameInMap("incidentNumber")
        private String incidentNumber;

        @com.aliyun.core.annotation.NameInMap("incidentTitle")
        private String incidentTitle;

        @com.aliyun.core.annotation.NameInMap("relatedRouteRuleId")
        private Long relatedRouteRuleId;

        @com.aliyun.core.annotation.NameInMap("relatedRouteRuleName")
        private String relatedRouteRuleName;

        @com.aliyun.core.annotation.NameInMap("similarScore")
        private String similarScore;

        private SimilarIncidents(Builder builder) {
            this.assignUserId = builder.assignUserId;
            this.assignUserName = builder.assignUserName;
            this.createTime = builder.createTime;
            this.durationTime = builder.durationTime;
            this.finishReason = builder.finishReason;
            this.finishReasonDescription = builder.finishReasonDescription;
            this.finishSolutionDescription = builder.finishSolutionDescription;
            this.incidentFinishSolution = builder.incidentFinishSolution;
            this.incidentId = builder.incidentId;
            this.incidentNumber = builder.incidentNumber;
            this.incidentTitle = builder.incidentTitle;
            this.relatedRouteRuleId = builder.relatedRouteRuleId;
            this.relatedRouteRuleName = builder.relatedRouteRuleName;
            this.similarScore = builder.similarScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimilarIncidents create() {
            return builder().build();
        }

        /**
         * @return assignUserId
         */
        public Long getAssignUserId() {
            return this.assignUserId;
        }

        /**
         * @return assignUserName
         */
        public String getAssignUserName() {
            return this.assignUserName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return durationTime
         */
        public Long getDurationTime() {
            return this.durationTime;
        }

        /**
         * @return finishReason
         */
        public Long getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return finishReasonDescription
         */
        public String getFinishReasonDescription() {
            return this.finishReasonDescription;
        }

        /**
         * @return finishSolutionDescription
         */
        public String getFinishSolutionDescription() {
            return this.finishSolutionDescription;
        }

        /**
         * @return incidentFinishSolution
         */
        public Long getIncidentFinishSolution() {
            return this.incidentFinishSolution;
        }

        /**
         * @return incidentId
         */
        public Long getIncidentId() {
            return this.incidentId;
        }

        /**
         * @return incidentNumber
         */
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        /**
         * @return incidentTitle
         */
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        /**
         * @return relatedRouteRuleId
         */
        public Long getRelatedRouteRuleId() {
            return this.relatedRouteRuleId;
        }

        /**
         * @return relatedRouteRuleName
         */
        public String getRelatedRouteRuleName() {
            return this.relatedRouteRuleName;
        }

        /**
         * @return similarScore
         */
        public String getSimilarScore() {
            return this.similarScore;
        }

        public static final class Builder {
            private Long assignUserId; 
            private String assignUserName; 
            private String createTime; 
            private Long durationTime; 
            private Long finishReason; 
            private String finishReasonDescription; 
            private String finishSolutionDescription; 
            private Long incidentFinishSolution; 
            private Long incidentId; 
            private String incidentNumber; 
            private String incidentTitle; 
            private Long relatedRouteRuleId; 
            private String relatedRouteRuleName; 
            private String similarScore; 

            /**
             * assignUserId.
             */
            public Builder assignUserId(Long assignUserId) {
                this.assignUserId = assignUserId;
                return this;
            }

            /**
             * assignUserName.
             */
            public Builder assignUserName(String assignUserName) {
                this.assignUserName = assignUserName;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * durationTime.
             */
            public Builder durationTime(Long durationTime) {
                this.durationTime = durationTime;
                return this;
            }

            /**
             * finishReason.
             */
            public Builder finishReason(Long finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * finishReasonDescription.
             */
            public Builder finishReasonDescription(String finishReasonDescription) {
                this.finishReasonDescription = finishReasonDescription;
                return this;
            }

            /**
             * finishSolutionDescription.
             */
            public Builder finishSolutionDescription(String finishSolutionDescription) {
                this.finishSolutionDescription = finishSolutionDescription;
                return this;
            }

            /**
             * incidentFinishSolution.
             */
            public Builder incidentFinishSolution(Long incidentFinishSolution) {
                this.incidentFinishSolution = incidentFinishSolution;
                return this;
            }

            /**
             * incidentId.
             */
            public Builder incidentId(Long incidentId) {
                this.incidentId = incidentId;
                return this;
            }

            /**
             * incidentNumber.
             */
            public Builder incidentNumber(String incidentNumber) {
                this.incidentNumber = incidentNumber;
                return this;
            }

            /**
             * incidentTitle.
             */
            public Builder incidentTitle(String incidentTitle) {
                this.incidentTitle = incidentTitle;
                return this;
            }

            /**
             * relatedRouteRuleId.
             */
            public Builder relatedRouteRuleId(Long relatedRouteRuleId) {
                this.relatedRouteRuleId = relatedRouteRuleId;
                return this;
            }

            /**
             * relatedRouteRuleName.
             */
            public Builder relatedRouteRuleName(String relatedRouteRuleName) {
                this.relatedRouteRuleName = relatedRouteRuleName;
                return this;
            }

            /**
             * similarScore.
             */
            public Builder similarScore(String similarScore) {
                this.similarScore = similarScore;
                return this;
            }

            public SimilarIncidents build() {
                return new SimilarIncidents(this);
            } 

        } 

    }
    public static class DailySimilarIncidents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commitment")
        private Long commitment;

        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("day")
        private Long day;

        @com.aliyun.core.annotation.NameInMap("month")
        private Long month;

        @com.aliyun.core.annotation.NameInMap("similarIncidents")
        private java.util.List < SimilarIncidents> similarIncidents;

        @com.aliyun.core.annotation.NameInMap("week")
        private String week;

        private DailySimilarIncidents(Builder builder) {
            this.commitment = builder.commitment;
            this.date = builder.date;
            this.day = builder.day;
            this.month = builder.month;
            this.similarIncidents = builder.similarIncidents;
            this.week = builder.week;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailySimilarIncidents create() {
            return builder().build();
        }

        /**
         * @return commitment
         */
        public Long getCommitment() {
            return this.commitment;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return day
         */
        public Long getDay() {
            return this.day;
        }

        /**
         * @return month
         */
        public Long getMonth() {
            return this.month;
        }

        /**
         * @return similarIncidents
         */
        public java.util.List < SimilarIncidents> getSimilarIncidents() {
            return this.similarIncidents;
        }

        /**
         * @return week
         */
        public String getWeek() {
            return this.week;
        }

        public static final class Builder {
            private Long commitment; 
            private String date; 
            private Long day; 
            private Long month; 
            private java.util.List < SimilarIncidents> similarIncidents; 
            private String week; 

            /**
             * commitment.
             */
            public Builder commitment(Long commitment) {
                this.commitment = commitment;
                return this;
            }

            /**
             * date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * day.
             */
            public Builder day(Long day) {
                this.day = day;
                return this;
            }

            /**
             * month.
             */
            public Builder month(Long month) {
                this.month = month;
                return this;
            }

            /**
             * similarIncidents.
             */
            public Builder similarIncidents(java.util.List < SimilarIncidents> similarIncidents) {
                this.similarIncidents = similarIncidents;
                return this;
            }

            /**
             * week.
             */
            public Builder week(String week) {
                this.week = week;
                return this;
            }

            public DailySimilarIncidents build() {
                return new DailySimilarIncidents(this);
            } 

        } 

    }
    public static class TopFiveIncidents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignUserId")
        private String assignUserId;

        @com.aliyun.core.annotation.NameInMap("assignUserName")
        private String assignUserName;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("durationTime")
        private Long durationTime;

        @com.aliyun.core.annotation.NameInMap("finishReason")
        private Long finishReason;

        @com.aliyun.core.annotation.NameInMap("finishReasonDescription")
        private String finishReasonDescription;

        @com.aliyun.core.annotation.NameInMap("finishSolutionDescription")
        private String finishSolutionDescription;

        @com.aliyun.core.annotation.NameInMap("incidentFinishSolution")
        private Long incidentFinishSolution;

        @com.aliyun.core.annotation.NameInMap("incidentId")
        private Long incidentId;

        @com.aliyun.core.annotation.NameInMap("incidentNumber")
        private String incidentNumber;

        @com.aliyun.core.annotation.NameInMap("incidentTitle")
        private String incidentTitle;

        @com.aliyun.core.annotation.NameInMap("relatedRouteRuleId")
        private Long relatedRouteRuleId;

        @com.aliyun.core.annotation.NameInMap("relatedRouteRuleName")
        private String relatedRouteRuleName;

        @com.aliyun.core.annotation.NameInMap("similarScore")
        private String similarScore;

        private TopFiveIncidents(Builder builder) {
            this.assignUserId = builder.assignUserId;
            this.assignUserName = builder.assignUserName;
            this.createTime = builder.createTime;
            this.durationTime = builder.durationTime;
            this.finishReason = builder.finishReason;
            this.finishReasonDescription = builder.finishReasonDescription;
            this.finishSolutionDescription = builder.finishSolutionDescription;
            this.incidentFinishSolution = builder.incidentFinishSolution;
            this.incidentId = builder.incidentId;
            this.incidentNumber = builder.incidentNumber;
            this.incidentTitle = builder.incidentTitle;
            this.relatedRouteRuleId = builder.relatedRouteRuleId;
            this.relatedRouteRuleName = builder.relatedRouteRuleName;
            this.similarScore = builder.similarScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopFiveIncidents create() {
            return builder().build();
        }

        /**
         * @return assignUserId
         */
        public String getAssignUserId() {
            return this.assignUserId;
        }

        /**
         * @return assignUserName
         */
        public String getAssignUserName() {
            return this.assignUserName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return durationTime
         */
        public Long getDurationTime() {
            return this.durationTime;
        }

        /**
         * @return finishReason
         */
        public Long getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return finishReasonDescription
         */
        public String getFinishReasonDescription() {
            return this.finishReasonDescription;
        }

        /**
         * @return finishSolutionDescription
         */
        public String getFinishSolutionDescription() {
            return this.finishSolutionDescription;
        }

        /**
         * @return incidentFinishSolution
         */
        public Long getIncidentFinishSolution() {
            return this.incidentFinishSolution;
        }

        /**
         * @return incidentId
         */
        public Long getIncidentId() {
            return this.incidentId;
        }

        /**
         * @return incidentNumber
         */
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        /**
         * @return incidentTitle
         */
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        /**
         * @return relatedRouteRuleId
         */
        public Long getRelatedRouteRuleId() {
            return this.relatedRouteRuleId;
        }

        /**
         * @return relatedRouteRuleName
         */
        public String getRelatedRouteRuleName() {
            return this.relatedRouteRuleName;
        }

        /**
         * @return similarScore
         */
        public String getSimilarScore() {
            return this.similarScore;
        }

        public static final class Builder {
            private String assignUserId; 
            private String assignUserName; 
            private String createTime; 
            private Long durationTime; 
            private Long finishReason; 
            private String finishReasonDescription; 
            private String finishSolutionDescription; 
            private Long incidentFinishSolution; 
            private Long incidentId; 
            private String incidentNumber; 
            private String incidentTitle; 
            private Long relatedRouteRuleId; 
            private String relatedRouteRuleName; 
            private String similarScore; 

            /**
             * assignUserId.
             */
            public Builder assignUserId(String assignUserId) {
                this.assignUserId = assignUserId;
                return this;
            }

            /**
             * assignUserName.
             */
            public Builder assignUserName(String assignUserName) {
                this.assignUserName = assignUserName;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * durationTime.
             */
            public Builder durationTime(Long durationTime) {
                this.durationTime = durationTime;
                return this;
            }

            /**
             * finishReason.
             */
            public Builder finishReason(Long finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * finishReasonDescription.
             */
            public Builder finishReasonDescription(String finishReasonDescription) {
                this.finishReasonDescription = finishReasonDescription;
                return this;
            }

            /**
             * finishSolutionDescription.
             */
            public Builder finishSolutionDescription(String finishSolutionDescription) {
                this.finishSolutionDescription = finishSolutionDescription;
                return this;
            }

            /**
             * incidentFinishSolution.
             */
            public Builder incidentFinishSolution(Long incidentFinishSolution) {
                this.incidentFinishSolution = incidentFinishSolution;
                return this;
            }

            /**
             * incidentId.
             */
            public Builder incidentId(Long incidentId) {
                this.incidentId = incidentId;
                return this;
            }

            /**
             * incidentNumber.
             */
            public Builder incidentNumber(String incidentNumber) {
                this.incidentNumber = incidentNumber;
                return this;
            }

            /**
             * incidentTitle.
             */
            public Builder incidentTitle(String incidentTitle) {
                this.incidentTitle = incidentTitle;
                return this;
            }

            /**
             * relatedRouteRuleId.
             */
            public Builder relatedRouteRuleId(Long relatedRouteRuleId) {
                this.relatedRouteRuleId = relatedRouteRuleId;
                return this;
            }

            /**
             * relatedRouteRuleName.
             */
            public Builder relatedRouteRuleName(String relatedRouteRuleName) {
                this.relatedRouteRuleName = relatedRouteRuleName;
                return this;
            }

            /**
             * similarScore.
             */
            public Builder similarScore(String similarScore) {
                this.similarScore = similarScore;
                return this;
            }

            public TopFiveIncidents build() {
                return new TopFiveIncidents(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("countInSevenDays")
        private Long countInSevenDays;

        @com.aliyun.core.annotation.NameInMap("countInSixMonths")
        private Long countInSixMonths;

        @com.aliyun.core.annotation.NameInMap("dailySimilarIncidents")
        private java.util.List < DailySimilarIncidents> dailySimilarIncidents;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("topFiveIncidents")
        private java.util.List < TopFiveIncidents> topFiveIncidents;

        private Data(Builder builder) {
            this.countInSevenDays = builder.countInSevenDays;
            this.countInSixMonths = builder.countInSixMonths;
            this.dailySimilarIncidents = builder.dailySimilarIncidents;
            this.requestId = builder.requestId;
            this.topFiveIncidents = builder.topFiveIncidents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return countInSevenDays
         */
        public Long getCountInSevenDays() {
            return this.countInSevenDays;
        }

        /**
         * @return countInSixMonths
         */
        public Long getCountInSixMonths() {
            return this.countInSixMonths;
        }

        /**
         * @return dailySimilarIncidents
         */
        public java.util.List < DailySimilarIncidents> getDailySimilarIncidents() {
            return this.dailySimilarIncidents;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return topFiveIncidents
         */
        public java.util.List < TopFiveIncidents> getTopFiveIncidents() {
            return this.topFiveIncidents;
        }

        public static final class Builder {
            private Long countInSevenDays; 
            private Long countInSixMonths; 
            private java.util.List < DailySimilarIncidents> dailySimilarIncidents; 
            private String requestId; 
            private java.util.List < TopFiveIncidents> topFiveIncidents; 

            /**
             * countInSevenDays.
             */
            public Builder countInSevenDays(Long countInSevenDays) {
                this.countInSevenDays = countInSevenDays;
                return this;
            }

            /**
             * countInSixMonths.
             */
            public Builder countInSixMonths(Long countInSixMonths) {
                this.countInSixMonths = countInSixMonths;
                return this;
            }

            /**
             * dailySimilarIncidents.
             */
            public Builder dailySimilarIncidents(java.util.List < DailySimilarIncidents> dailySimilarIncidents) {
                this.dailySimilarIncidents = dailySimilarIncidents;
                return this;
            }

            /**
             * id of the request
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * topFiveIncidents
             */
            public Builder topFiveIncidents(java.util.List < TopFiveIncidents> topFiveIncidents) {
                this.topFiveIncidents = topFiveIncidents;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
