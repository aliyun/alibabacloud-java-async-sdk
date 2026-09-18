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
 * {@link QueryTouchListRequest} extends {@link RequestModel}
 *
 * <p>QueryTouchListRequest</p>
 */
public class QueryTouchListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private java.util.List<String> channelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    private java.util.List<Integer> channelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloseTimeEnd")
    private Long closeTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloseTimeStart")
    private Long closeTimeStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EvaluationLevel")
    private java.util.List<Integer> evaluationLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EvaluationScore")
    private java.util.List<Integer> evaluationScore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EvaluationStatus")
    private java.util.List<Integer> evaluationStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FirstTimeEnd")
    private Long firstTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FirstTimeStart")
    private Long firstTimeStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MemberId")
    private java.util.List<Long> memberId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MemberName")
    private java.util.List<String> memberName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueueId")
    private java.util.List<Long> queueId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServicerId")
    private java.util.List<Long> servicerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServicerName")
    private java.util.List<String> servicerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TouchId")
    private java.util.List<Long> touchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TouchType")
    private java.util.List<Integer> touchType;

    private QueryTouchListRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.channelType = builder.channelType;
        this.closeTimeEnd = builder.closeTimeEnd;
        this.closeTimeStart = builder.closeTimeStart;
        this.currentPage = builder.currentPage;
        this.evaluationLevel = builder.evaluationLevel;
        this.evaluationScore = builder.evaluationScore;
        this.evaluationStatus = builder.evaluationStatus;
        this.firstTimeEnd = builder.firstTimeEnd;
        this.firstTimeStart = builder.firstTimeStart;
        this.instanceId = builder.instanceId;
        this.memberId = builder.memberId;
        this.memberName = builder.memberName;
        this.pageSize = builder.pageSize;
        this.queueId = builder.queueId;
        this.servicerId = builder.servicerId;
        this.servicerName = builder.servicerName;
        this.touchId = builder.touchId;
        this.touchType = builder.touchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTouchListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public java.util.List<String> getChannelId() {
        return this.channelId;
    }

    /**
     * @return channelType
     */
    public java.util.List<Integer> getChannelType() {
        return this.channelType;
    }

    /**
     * @return closeTimeEnd
     */
    public Long getCloseTimeEnd() {
        return this.closeTimeEnd;
    }

    /**
     * @return closeTimeStart
     */
    public Long getCloseTimeStart() {
        return this.closeTimeStart;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return evaluationLevel
     */
    public java.util.List<Integer> getEvaluationLevel() {
        return this.evaluationLevel;
    }

    /**
     * @return evaluationScore
     */
    public java.util.List<Integer> getEvaluationScore() {
        return this.evaluationScore;
    }

    /**
     * @return evaluationStatus
     */
    public java.util.List<Integer> getEvaluationStatus() {
        return this.evaluationStatus;
    }

    /**
     * @return firstTimeEnd
     */
    public Long getFirstTimeEnd() {
        return this.firstTimeEnd;
    }

    /**
     * @return firstTimeStart
     */
    public Long getFirstTimeStart() {
        return this.firstTimeStart;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return memberId
     */
    public java.util.List<Long> getMemberId() {
        return this.memberId;
    }

    /**
     * @return memberName
     */
    public java.util.List<String> getMemberName() {
        return this.memberName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queueId
     */
    public java.util.List<Long> getQueueId() {
        return this.queueId;
    }

    /**
     * @return servicerId
     */
    public java.util.List<Long> getServicerId() {
        return this.servicerId;
    }

    /**
     * @return servicerName
     */
    public java.util.List<String> getServicerName() {
        return this.servicerName;
    }

    /**
     * @return touchId
     */
    public java.util.List<Long> getTouchId() {
        return this.touchId;
    }

    /**
     * @return touchType
     */
    public java.util.List<Integer> getTouchType() {
        return this.touchType;
    }

    public static final class Builder extends Request.Builder<QueryTouchListRequest, Builder> {
        private java.util.List<String> channelId; 
        private java.util.List<Integer> channelType; 
        private Long closeTimeEnd; 
        private Long closeTimeStart; 
        private Integer currentPage; 
        private java.util.List<Integer> evaluationLevel; 
        private java.util.List<Integer> evaluationScore; 
        private java.util.List<Integer> evaluationStatus; 
        private Long firstTimeEnd; 
        private Long firstTimeStart; 
        private String instanceId; 
        private java.util.List<Long> memberId; 
        private java.util.List<String> memberName; 
        private Integer pageSize; 
        private java.util.List<Long> queueId; 
        private java.util.List<Long> servicerId; 
        private java.util.List<String> servicerName; 
        private java.util.List<Long> touchId; 
        private java.util.List<Integer> touchType; 

        private Builder() {
            super();
        } 

        private Builder(QueryTouchListRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.channelType = request.channelType;
            this.closeTimeEnd = request.closeTimeEnd;
            this.closeTimeStart = request.closeTimeStart;
            this.currentPage = request.currentPage;
            this.evaluationLevel = request.evaluationLevel;
            this.evaluationScore = request.evaluationScore;
            this.evaluationStatus = request.evaluationStatus;
            this.firstTimeEnd = request.firstTimeEnd;
            this.firstTimeStart = request.firstTimeStart;
            this.instanceId = request.instanceId;
            this.memberId = request.memberId;
            this.memberName = request.memberName;
            this.pageSize = request.pageSize;
            this.queueId = request.queueId;
            this.servicerId = request.servicerId;
            this.servicerName = request.servicerName;
            this.touchId = request.touchId;
            this.touchType = request.touchType;
        } 

        /**
         * <p>List of session IDs for term query.</p>
         */
        public Builder channelId(java.util.List<String> channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>Channel Type.</p>
         */
        public Builder channelType(java.util.List<Integer> channelType) {
            this.putBodyParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>The right boundary of the time range for session end. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614600500000</p>
         */
        public Builder closeTimeEnd(Long closeTimeEnd) {
            this.putBodyParameter("CloseTimeEnd", closeTimeEnd);
            this.closeTimeEnd = closeTimeEnd;
            return this;
        }

        /**
         * <p>The left boundary of the time range for session end. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614600400000</p>
         */
        public Builder closeTimeStart(Long closeTimeStart) {
            this.putBodyParameter("CloseTimeStart", closeTimeStart);
            this.closeTimeStart = closeTimeStart;
            return this;
        }

        /**
         * <p>Current page. The value must be greater than <strong>0</strong>. Default Value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Satisfaction level.</p>
         */
        public Builder evaluationLevel(java.util.List<Integer> evaluationLevel) {
            this.putBodyParameter("EvaluationLevel", evaluationLevel);
            this.evaluationLevel = evaluationLevel;
            return this;
        }

        /**
         * <p>Satisfaction score.</p>
         */
        public Builder evaluationScore(java.util.List<Integer> evaluationScore) {
            this.putBodyParameter("EvaluationScore", evaluationScore);
            this.evaluationScore = evaluationScore;
            return this;
        }

        /**
         * <p>Evaluation status.</p>
         */
        public Builder evaluationStatus(java.util.List<Integer> evaluationStatus) {
            this.putBodyParameter("EvaluationStatus", evaluationStatus);
            this.evaluationStatus = evaluationStatus;
            return this;
        }

        /**
         * <p>The right boundary of the time range for session start. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614599400000</p>
         */
        public Builder firstTimeEnd(Long firstTimeEnd) {
            this.putBodyParameter("FirstTimeEnd", firstTimeEnd);
            this.firstTimeEnd = firstTimeEnd;
            return this;
        }

        /**
         * <p>The left boundary of the time range for session start. UNIX timestamp format (unit: ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1614596400000</p>
         */
        public Builder firstTimeStart(Long firstTimeStart) {
            this.putBodyParameter("FirstTimeStart", firstTimeStart);
            this.firstTimeStart = firstTimeStart;
            return this;
        }

        /**
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>List of membership IDs to query.</p>
         */
        public Builder memberId(java.util.List<Long> memberId) {
            this.putBodyParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>A list of membership names to query.</p>
         */
        public Builder memberName(java.util.List<String> memberName) {
            this.putBodyParameter("MemberName", memberName);
            this.memberName = memberName;
            return this;
        }

        /**
         * <p>Number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>List of inbound skill group IDs.</p>
         */
        public Builder queueId(java.util.List<Long> queueId) {
            this.putBodyParameter("QueueId", queueId);
            this.queueId = queueId;
            return this;
        }

        /**
         * <p>A list of service agent IDs to query.</p>
         */
        public Builder servicerId(java.util.List<Long> servicerId) {
            this.putBodyParameter("ServicerId", servicerId);
            this.servicerId = servicerId;
            return this;
        }

        /**
         * <p>List of service agent names to query.</p>
         */
        public Builder servicerName(java.util.List<String> servicerName) {
            this.putBodyParameter("ServicerName", servicerName);
            this.servicerName = servicerName;
            return this;
        }

        /**
         * <p>List of touch IDs for term query.</p>
         */
        public Builder touchId(java.util.List<Long> touchId) {
            this.putBodyParameter("TouchId", touchId);
            this.touchId = touchId;
            return this;
        }

        /**
         * <p>Touch type.</p>
         */
        public Builder touchType(java.util.List<Integer> touchType) {
            this.putBodyParameter("TouchType", touchType);
            this.touchType = touchType;
            return this;
        }

        @Override
        public QueryTouchListRequest build() {
            return new QueryTouchListRequest(this);
        } 

    } 

}
