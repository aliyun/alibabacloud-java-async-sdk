// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryTouchListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTouchListResponseBody</p>
 */
public class QueryTouchListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultData")
    private ResultData resultData;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryTouchListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultData = builder.resultData;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTouchListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultData
     */
    public ResultData getResultData() {
        return this.resultData;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultData resultData; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryTouchListResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultData = model.resultData;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * ResultData.
         */
        public Builder resultData(ResultData resultData) {
            this.resultData = resultData;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTouchListResponseBody build() {
            return new QueryTouchListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTouchListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTouchListResponseBody</p>
     */
    public static class ExtAttrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ani")
        private String ani;

        @com.aliyun.core.annotation.NameInMap("Dnis")
        private String dnis;

        @com.aliyun.core.annotation.NameInMap("EvaluationLevel")
        private Integer evaluationLevel;

        @com.aliyun.core.annotation.NameInMap("EvaluationScore")
        private Integer evaluationScore;

        @com.aliyun.core.annotation.NameInMap("EvaluationSolution")
        private Integer evaluationSolution;

        @com.aliyun.core.annotation.NameInMap("EvaluationStatus")
        private Integer evaluationStatus;

        @com.aliyun.core.annotation.NameInMap("OnlineJoinRespInterval")
        private Integer onlineJoinRespInterval;

        @com.aliyun.core.annotation.NameInMap("OnlineSessionSource")
        private Integer onlineSessionSource;

        @com.aliyun.core.annotation.NameInMap("OutCallRouteNumber")
        private String outCallRouteNumber;

        private ExtAttrs(Builder builder) {
            this.ani = builder.ani;
            this.dnis = builder.dnis;
            this.evaluationLevel = builder.evaluationLevel;
            this.evaluationScore = builder.evaluationScore;
            this.evaluationSolution = builder.evaluationSolution;
            this.evaluationStatus = builder.evaluationStatus;
            this.onlineJoinRespInterval = builder.onlineJoinRespInterval;
            this.onlineSessionSource = builder.onlineSessionSource;
            this.outCallRouteNumber = builder.outCallRouteNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtAttrs create() {
            return builder().build();
        }

        /**
         * @return ani
         */
        public String getAni() {
            return this.ani;
        }

        /**
         * @return dnis
         */
        public String getDnis() {
            return this.dnis;
        }

        /**
         * @return evaluationLevel
         */
        public Integer getEvaluationLevel() {
            return this.evaluationLevel;
        }

        /**
         * @return evaluationScore
         */
        public Integer getEvaluationScore() {
            return this.evaluationScore;
        }

        /**
         * @return evaluationSolution
         */
        public Integer getEvaluationSolution() {
            return this.evaluationSolution;
        }

        /**
         * @return evaluationStatus
         */
        public Integer getEvaluationStatus() {
            return this.evaluationStatus;
        }

        /**
         * @return onlineJoinRespInterval
         */
        public Integer getOnlineJoinRespInterval() {
            return this.onlineJoinRespInterval;
        }

        /**
         * @return onlineSessionSource
         */
        public Integer getOnlineSessionSource() {
            return this.onlineSessionSource;
        }

        /**
         * @return outCallRouteNumber
         */
        public String getOutCallRouteNumber() {
            return this.outCallRouteNumber;
        }

        public static final class Builder {
            private String ani; 
            private String dnis; 
            private Integer evaluationLevel; 
            private Integer evaluationScore; 
            private Integer evaluationSolution; 
            private Integer evaluationStatus; 
            private Integer onlineJoinRespInterval; 
            private Integer onlineSessionSource; 
            private String outCallRouteNumber; 

            private Builder() {
            } 

            private Builder(ExtAttrs model) {
                this.ani = model.ani;
                this.dnis = model.dnis;
                this.evaluationLevel = model.evaluationLevel;
                this.evaluationScore = model.evaluationScore;
                this.evaluationSolution = model.evaluationSolution;
                this.evaluationStatus = model.evaluationStatus;
                this.onlineJoinRespInterval = model.onlineJoinRespInterval;
                this.onlineSessionSource = model.onlineSessionSource;
                this.outCallRouteNumber = model.outCallRouteNumber;
            } 

            /**
             * Ani.
             */
            public Builder ani(String ani) {
                this.ani = ani;
                return this;
            }

            /**
             * Dnis.
             */
            public Builder dnis(String dnis) {
                this.dnis = dnis;
                return this;
            }

            /**
             * EvaluationLevel.
             */
            public Builder evaluationLevel(Integer evaluationLevel) {
                this.evaluationLevel = evaluationLevel;
                return this;
            }

            /**
             * EvaluationScore.
             */
            public Builder evaluationScore(Integer evaluationScore) {
                this.evaluationScore = evaluationScore;
                return this;
            }

            /**
             * EvaluationSolution.
             */
            public Builder evaluationSolution(Integer evaluationSolution) {
                this.evaluationSolution = evaluationSolution;
                return this;
            }

            /**
             * EvaluationStatus.
             */
            public Builder evaluationStatus(Integer evaluationStatus) {
                this.evaluationStatus = evaluationStatus;
                return this;
            }

            /**
             * OnlineJoinRespInterval.
             */
            public Builder onlineJoinRespInterval(Integer onlineJoinRespInterval) {
                this.onlineJoinRespInterval = onlineJoinRespInterval;
                return this;
            }

            /**
             * OnlineSessionSource.
             */
            public Builder onlineSessionSource(Integer onlineSessionSource) {
                this.onlineSessionSource = onlineSessionSource;
                return this;
            }

            /**
             * OutCallRouteNumber.
             */
            public Builder outCallRouteNumber(String outCallRouteNumber) {
                this.outCallRouteNumber = outCallRouteNumber;
                return this;
            }

            public ExtAttrs build() {
                return new ExtAttrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTouchListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTouchListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuId")
        private Long buId;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private Integer channelType;

        @com.aliyun.core.annotation.NameInMap("CloseTime")
        private Long closeTime;

        @com.aliyun.core.annotation.NameInMap("CommonQueueName")
        private String commonQueueName;

        @com.aliyun.core.annotation.NameInMap("DepId")
        private Long depId;

        @com.aliyun.core.annotation.NameInMap("ExtAttrs")
        private ExtAttrs extAttrs;

        @com.aliyun.core.annotation.NameInMap("ExtAttrsString")
        private java.util.Map<String, ?> extAttrsString;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private String feedback;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("FromId")
        private Long fromId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private Long memberId;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("ParentTouchId")
        private Long parentTouchId;

        @com.aliyun.core.annotation.NameInMap("QueueId")
        private Long queueId;

        @com.aliyun.core.annotation.NameInMap("ServicerId")
        private Long servicerId;

        @com.aliyun.core.annotation.NameInMap("ServicerName")
        private String servicerName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SwitchUser")
        private String switchUser;

        @com.aliyun.core.annotation.NameInMap("ToId")
        private Long toId;

        @com.aliyun.core.annotation.NameInMap("TouchContent")
        private String touchContent;

        @com.aliyun.core.annotation.NameInMap("TouchEndReason")
        private Integer touchEndReason;

        @com.aliyun.core.annotation.NameInMap("TouchId")
        private String touchId;

        @com.aliyun.core.annotation.NameInMap("TouchTime")
        private String touchTime;

        @com.aliyun.core.annotation.NameInMap("TouchType")
        private Integer touchType;

        @com.aliyun.core.annotation.NameInMap("UserTouchId")
        private Long userTouchId;

        private Data(Builder builder) {
            this.buId = builder.buId;
            this.channelId = builder.channelId;
            this.channelType = builder.channelType;
            this.closeTime = builder.closeTime;
            this.commonQueueName = builder.commonQueueName;
            this.depId = builder.depId;
            this.extAttrs = builder.extAttrs;
            this.extAttrsString = builder.extAttrsString;
            this.feedback = builder.feedback;
            this.firstTime = builder.firstTime;
            this.fromId = builder.fromId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.memberId = builder.memberId;
            this.memberName = builder.memberName;
            this.parentTouchId = builder.parentTouchId;
            this.queueId = builder.queueId;
            this.servicerId = builder.servicerId;
            this.servicerName = builder.servicerName;
            this.status = builder.status;
            this.switchUser = builder.switchUser;
            this.toId = builder.toId;
            this.touchContent = builder.touchContent;
            this.touchEndReason = builder.touchEndReason;
            this.touchId = builder.touchId;
            this.touchTime = builder.touchTime;
            this.touchType = builder.touchType;
            this.userTouchId = builder.userTouchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return buId
         */
        public Long getBuId() {
            return this.buId;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelType
         */
        public Integer getChannelType() {
            return this.channelType;
        }

        /**
         * @return closeTime
         */
        public Long getCloseTime() {
            return this.closeTime;
        }

        /**
         * @return commonQueueName
         */
        public String getCommonQueueName() {
            return this.commonQueueName;
        }

        /**
         * @return depId
         */
        public Long getDepId() {
            return this.depId;
        }

        /**
         * @return extAttrs
         */
        public ExtAttrs getExtAttrs() {
            return this.extAttrs;
        }

        /**
         * @return extAttrsString
         */
        public java.util.Map<String, ?> getExtAttrsString() {
            return this.extAttrsString;
        }

        /**
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return fromId
         */
        public Long getFromId() {
            return this.fromId;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return memberId
         */
        public Long getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return parentTouchId
         */
        public Long getParentTouchId() {
            return this.parentTouchId;
        }

        /**
         * @return queueId
         */
        public Long getQueueId() {
            return this.queueId;
        }

        /**
         * @return servicerId
         */
        public Long getServicerId() {
            return this.servicerId;
        }

        /**
         * @return servicerName
         */
        public String getServicerName() {
            return this.servicerName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return switchUser
         */
        public String getSwitchUser() {
            return this.switchUser;
        }

        /**
         * @return toId
         */
        public Long getToId() {
            return this.toId;
        }

        /**
         * @return touchContent
         */
        public String getTouchContent() {
            return this.touchContent;
        }

        /**
         * @return touchEndReason
         */
        public Integer getTouchEndReason() {
            return this.touchEndReason;
        }

        /**
         * @return touchId
         */
        public String getTouchId() {
            return this.touchId;
        }

        /**
         * @return touchTime
         */
        public String getTouchTime() {
            return this.touchTime;
        }

        /**
         * @return touchType
         */
        public Integer getTouchType() {
            return this.touchType;
        }

        /**
         * @return userTouchId
         */
        public Long getUserTouchId() {
            return this.userTouchId;
        }

        public static final class Builder {
            private Long buId; 
            private String channelId; 
            private Integer channelType; 
            private Long closeTime; 
            private String commonQueueName; 
            private Long depId; 
            private ExtAttrs extAttrs; 
            private java.util.Map<String, ?> extAttrsString; 
            private String feedback; 
            private Long firstTime; 
            private Long fromId; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long memberId; 
            private String memberName; 
            private Long parentTouchId; 
            private Long queueId; 
            private Long servicerId; 
            private String servicerName; 
            private Integer status; 
            private String switchUser; 
            private Long toId; 
            private String touchContent; 
            private Integer touchEndReason; 
            private String touchId; 
            private String touchTime; 
            private Integer touchType; 
            private Long userTouchId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.buId = model.buId;
                this.channelId = model.channelId;
                this.channelType = model.channelType;
                this.closeTime = model.closeTime;
                this.commonQueueName = model.commonQueueName;
                this.depId = model.depId;
                this.extAttrs = model.extAttrs;
                this.extAttrsString = model.extAttrsString;
                this.feedback = model.feedback;
                this.firstTime = model.firstTime;
                this.fromId = model.fromId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.memberId = model.memberId;
                this.memberName = model.memberName;
                this.parentTouchId = model.parentTouchId;
                this.queueId = model.queueId;
                this.servicerId = model.servicerId;
                this.servicerName = model.servicerName;
                this.status = model.status;
                this.switchUser = model.switchUser;
                this.toId = model.toId;
                this.touchContent = model.touchContent;
                this.touchEndReason = model.touchEndReason;
                this.touchId = model.touchId;
                this.touchTime = model.touchTime;
                this.touchType = model.touchType;
                this.userTouchId = model.userTouchId;
            } 

            /**
             * BuId.
             */
            public Builder buId(Long buId) {
                this.buId = buId;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * ChannelType.
             */
            public Builder channelType(Integer channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * CloseTime.
             */
            public Builder closeTime(Long closeTime) {
                this.closeTime = closeTime;
                return this;
            }

            /**
             * CommonQueueName.
             */
            public Builder commonQueueName(String commonQueueName) {
                this.commonQueueName = commonQueueName;
                return this;
            }

            /**
             * DepId.
             */
            public Builder depId(Long depId) {
                this.depId = depId;
                return this;
            }

            /**
             * ExtAttrs.
             */
            public Builder extAttrs(ExtAttrs extAttrs) {
                this.extAttrs = extAttrs;
                return this;
            }

            /**
             * ExtAttrsString.
             */
            public Builder extAttrsString(java.util.Map<String, ?> extAttrsString) {
                this.extAttrsString = extAttrsString;
                return this;
            }

            /**
             * Feedback.
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * FirstTime.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * FromId.
             */
            public Builder fromId(Long fromId) {
                this.fromId = fromId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(Long memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * ParentTouchId.
             */
            public Builder parentTouchId(Long parentTouchId) {
                this.parentTouchId = parentTouchId;
                return this;
            }

            /**
             * QueueId.
             */
            public Builder queueId(Long queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * ServicerId.
             */
            public Builder servicerId(Long servicerId) {
                this.servicerId = servicerId;
                return this;
            }

            /**
             * ServicerName.
             */
            public Builder servicerName(String servicerName) {
                this.servicerName = servicerName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SwitchUser.
             */
            public Builder switchUser(String switchUser) {
                this.switchUser = switchUser;
                return this;
            }

            /**
             * ToId.
             */
            public Builder toId(Long toId) {
                this.toId = toId;
                return this;
            }

            /**
             * TouchContent.
             */
            public Builder touchContent(String touchContent) {
                this.touchContent = touchContent;
                return this;
            }

            /**
             * TouchEndReason.
             */
            public Builder touchEndReason(Integer touchEndReason) {
                this.touchEndReason = touchEndReason;
                return this;
            }

            /**
             * TouchId.
             */
            public Builder touchId(String touchId) {
                this.touchId = touchId;
                return this;
            }

            /**
             * TouchTime.
             */
            public Builder touchTime(String touchTime) {
                this.touchTime = touchTime;
                return this;
            }

            /**
             * TouchType.
             */
            public Builder touchType(Integer touchType) {
                this.touchType = touchType;
                return this;
            }

            /**
             * UserTouchId.
             */
            public Builder userTouchId(Long userTouchId) {
                this.userTouchId = userTouchId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTouchListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTouchListResponseBody</p>
     */
    public static class ResultData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Empty")
        private Boolean empty;

        @com.aliyun.core.annotation.NameInMap("NextPage")
        private Integer nextPage;

        @com.aliyun.core.annotation.NameInMap("OnePageSize")
        private Integer onePageSize;

        @com.aliyun.core.annotation.NameInMap("PreviousPage")
        private Integer previousPage;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Integer totalPage;

        @com.aliyun.core.annotation.NameInMap("TotalResults")
        private Integer totalResults;

        private ResultData(Builder builder) {
            this.currentPage = builder.currentPage;
            this.data = builder.data;
            this.empty = builder.empty;
            this.nextPage = builder.nextPage;
            this.onePageSize = builder.onePageSize;
            this.previousPage = builder.previousPage;
            this.totalPage = builder.totalPage;
            this.totalResults = builder.totalResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultData create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return empty
         */
        public Boolean getEmpty() {
            return this.empty;
        }

        /**
         * @return nextPage
         */
        public Integer getNextPage() {
            return this.nextPage;
        }

        /**
         * @return onePageSize
         */
        public Integer getOnePageSize() {
            return this.onePageSize;
        }

        /**
         * @return previousPage
         */
        public Integer getPreviousPage() {
            return this.previousPage;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        /**
         * @return totalResults
         */
        public Integer getTotalResults() {
            return this.totalResults;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List<Data> data; 
            private Boolean empty; 
            private Integer nextPage; 
            private Integer onePageSize; 
            private Integer previousPage; 
            private Integer totalPage; 
            private Integer totalResults; 

            private Builder() {
            } 

            private Builder(ResultData model) {
                this.currentPage = model.currentPage;
                this.data = model.data;
                this.empty = model.empty;
                this.nextPage = model.nextPage;
                this.onePageSize = model.onePageSize;
                this.previousPage = model.previousPage;
                this.totalPage = model.totalPage;
                this.totalResults = model.totalResults;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * Empty.
             */
            public Builder empty(Boolean empty) {
                this.empty = empty;
                return this;
            }

            /**
             * NextPage.
             */
            public Builder nextPage(Integer nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * OnePageSize.
             */
            public Builder onePageSize(Integer onePageSize) {
                this.onePageSize = onePageSize;
                return this;
            }

            /**
             * PreviousPage.
             */
            public Builder previousPage(Integer previousPage) {
                this.previousPage = previousPage;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            /**
             * TotalResults.
             */
            public Builder totalResults(Integer totalResults) {
                this.totalResults = totalResults;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
}
