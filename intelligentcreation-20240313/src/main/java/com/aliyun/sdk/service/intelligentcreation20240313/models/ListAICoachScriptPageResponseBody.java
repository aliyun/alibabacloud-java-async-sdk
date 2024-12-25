// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListAICoachScriptPageResponseBody</p>
 */
public class ListAICoachScriptPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("list")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListAICoachScriptPageResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.list = builder.list;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAICoachScriptPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List<List> list; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * list.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>86A90C40-D1AB-50DA-A4B1-0D545F80F2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAICoachScriptPageResponseBody build() {
            return new ListAICoachScriptPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class CompleteStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clickCompleteAutoEnd")
        private Boolean clickCompleteAutoEnd;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("fullCoverageAutoEnd")
        private Boolean fullCoverageAutoEnd;

        private CompleteStrategy(Builder builder) {
            this.clickCompleteAutoEnd = builder.clickCompleteAutoEnd;
            this.duration = builder.duration;
            this.fullCoverageAutoEnd = builder.fullCoverageAutoEnd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompleteStrategy create() {
            return builder().build();
        }

        /**
         * @return clickCompleteAutoEnd
         */
        public Boolean getClickCompleteAutoEnd() {
            return this.clickCompleteAutoEnd;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return fullCoverageAutoEnd
         */
        public Boolean getFullCoverageAutoEnd() {
            return this.fullCoverageAutoEnd;
        }

        public static final class Builder {
            private Boolean clickCompleteAutoEnd; 
            private Integer duration; 
            private Boolean fullCoverageAutoEnd; 

            /**
             * clickCompleteAutoEnd.
             */
            public Builder clickCompleteAutoEnd(Boolean clickCompleteAutoEnd) {
                this.clickCompleteAutoEnd = clickCompleteAutoEnd;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * fullCoverageAutoEnd.
             */
            public Builder fullCoverageAutoEnd(Boolean fullCoverageAutoEnd) {
                this.fullCoverageAutoEnd = fullCoverageAutoEnd;
                return this;
            }

            public CompleteStrategy build() {
                return new CompleteStrategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class SampleDialogueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private SampleDialogueList(Builder builder) {
            this.message = builder.message;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SampleDialogueList create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String message; 
            private String role; 

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public SampleDialogueList build() {
                return new SampleDialogueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class Weights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assessmentPoint")
        private Integer assessmentPoint;

        @com.aliyun.core.annotation.NameInMap("expressiveness")
        private Integer expressiveness;

        @com.aliyun.core.annotation.NameInMap("standard")
        private Integer standard;

        @com.aliyun.core.annotation.NameInMap("standardEnabled")
        private Boolean standardEnabled;

        private Weights(Builder builder) {
            this.assessmentPoint = builder.assessmentPoint;
            this.expressiveness = builder.expressiveness;
            this.standard = builder.standard;
            this.standardEnabled = builder.standardEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Weights create() {
            return builder().build();
        }

        /**
         * @return assessmentPoint
         */
        public Integer getAssessmentPoint() {
            return this.assessmentPoint;
        }

        /**
         * @return expressiveness
         */
        public Integer getExpressiveness() {
            return this.expressiveness;
        }

        /**
         * @return standard
         */
        public Integer getStandard() {
            return this.standard;
        }

        /**
         * @return standardEnabled
         */
        public Boolean getStandardEnabled() {
            return this.standardEnabled;
        }

        public static final class Builder {
            private Integer assessmentPoint; 
            private Integer expressiveness; 
            private Integer standard; 
            private Boolean standardEnabled; 

            /**
             * assessmentPoint.
             */
            public Builder assessmentPoint(Integer assessmentPoint) {
                this.assessmentPoint = assessmentPoint;
                return this;
            }

            /**
             * expressiveness.
             */
            public Builder expressiveness(Integer expressiveness) {
                this.expressiveness = expressiveness;
                return this;
            }

            /**
             * standard.
             */
            public Builder standard(Integer standard) {
                this.standard = standard;
                return this;
            }

            /**
             * standardEnabled.
             */
            public Builder standardEnabled(Boolean standardEnabled) {
                this.standardEnabled = standardEnabled;
                return this;
            }

            public Weights build() {
                return new Weights(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAICoachScriptPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachScriptPageResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("completeStrategy")
        private CompleteStrategy completeStrategy;

        @com.aliyun.core.annotation.NameInMap("coverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("expressiveness")
        private java.util.Map<String, String> expressiveness;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("initiator")
        private String initiator;

        @com.aliyun.core.annotation.NameInMap("interactionType")
        private String interactionType;

        @com.aliyun.core.annotation.NameInMap("introduce")
        private String introduce;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sampleDialogueList")
        private java.util.List<SampleDialogueList> sampleDialogueList;

        @com.aliyun.core.annotation.NameInMap("scriptRecordId")
        private String scriptRecordId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("weights")
        private Weights weights;

        private List(Builder builder) {
            this.completeStrategy = builder.completeStrategy;
            this.coverUrl = builder.coverUrl;
            this.expressiveness = builder.expressiveness;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.initiator = builder.initiator;
            this.interactionType = builder.interactionType;
            this.introduce = builder.introduce;
            this.name = builder.name;
            this.sampleDialogueList = builder.sampleDialogueList;
            this.scriptRecordId = builder.scriptRecordId;
            this.status = builder.status;
            this.weights = builder.weights;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return completeStrategy
         */
        public CompleteStrategy getCompleteStrategy() {
            return this.completeStrategy;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return expressiveness
         */
        public java.util.Map<String, String> getExpressiveness() {
            return this.expressiveness;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return initiator
         */
        public String getInitiator() {
            return this.initiator;
        }

        /**
         * @return interactionType
         */
        public String getInteractionType() {
            return this.interactionType;
        }

        /**
         * @return introduce
         */
        public String getIntroduce() {
            return this.introduce;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sampleDialogueList
         */
        public java.util.List<SampleDialogueList> getSampleDialogueList() {
            return this.sampleDialogueList;
        }

        /**
         * @return scriptRecordId
         */
        public String getScriptRecordId() {
            return this.scriptRecordId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return weights
         */
        public Weights getWeights() {
            return this.weights;
        }

        public static final class Builder {
            private CompleteStrategy completeStrategy; 
            private String coverUrl; 
            private java.util.Map<String, String> expressiveness; 
            private String gmtCreate; 
            private String gmtModified; 
            private String initiator; 
            private String interactionType; 
            private String introduce; 
            private String name; 
            private java.util.List<SampleDialogueList> sampleDialogueList; 
            private String scriptRecordId; 
            private Integer status; 
            private Weights weights; 

            /**
             * completeStrategy.
             */
            public Builder completeStrategy(CompleteStrategy completeStrategy) {
                this.completeStrategy = completeStrategy;
                return this;
            }

            /**
             * coverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * expressiveness.
             */
            public Builder expressiveness(java.util.Map<String, String> expressiveness) {
                this.expressiveness = expressiveness;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * initiator.
             */
            public Builder initiator(String initiator) {
                this.initiator = initiator;
                return this;
            }

            /**
             * interactionType.
             */
            public Builder interactionType(String interactionType) {
                this.interactionType = interactionType;
                return this;
            }

            /**
             * introduce.
             */
            public Builder introduce(String introduce) {
                this.introduce = introduce;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sampleDialogueList.
             */
            public Builder sampleDialogueList(java.util.List<SampleDialogueList> sampleDialogueList) {
                this.sampleDialogueList = sampleDialogueList;
                return this;
            }

            /**
             * scriptRecordId.
             */
            public Builder scriptRecordId(String scriptRecordId) {
                this.scriptRecordId = scriptRecordId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * weights.
             */
            public Builder weights(Weights weights) {
                this.weights = weights;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
