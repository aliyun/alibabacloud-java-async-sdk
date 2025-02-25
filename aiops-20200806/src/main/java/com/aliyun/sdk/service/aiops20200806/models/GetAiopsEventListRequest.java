// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiopsEventListRequest} extends {@link RequestModel}
 *
 * <p>GetAiopsEventListRequest</p>
 */
public class GetAiopsEventListRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("BusinessGroupName")
    private String businessGroupName;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EventType")
    private Integer eventType;

    @Query
    @NameInMap("EventUniqueId")
    private String eventUniqueId;

    @Query
    @NameInMap("FeedbackStatus")
    private Integer feedbackStatus;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PredictionState")
    private Integer predictionState;

    @Query
    @NameInMap("Severity")
    private Integer severity;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private GetAiopsEventListRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.businessGroupName = builder.businessGroupName;
        this.currentPage = builder.currentPage;
        this.eventType = builder.eventType;
        this.eventUniqueId = builder.eventUniqueId;
        this.feedbackStatus = builder.feedbackStatus;
        this.name = builder.name;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.predictionState = builder.predictionState;
        this.severity = builder.severity;
        this.status = builder.status;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiopsEventListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    /**
     * @return businessGroupName
     */
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventType
     */
    public Integer getEventType() {
        return this.eventType;
    }

    /**
     * @return eventUniqueId
     */
    public String getEventUniqueId() {
        return this.eventUniqueId;
    }

    /**
     * @return feedbackStatus
     */
    public Integer getFeedbackStatus() {
        return this.feedbackStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return predictionState
     */
    public Integer getPredictionState() {
        return this.predictionState;
    }

    /**
     * @return severity
     */
    public Integer getSeverity() {
        return this.severity;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetAiopsEventListRequest, Builder> {
        private String businessGroupId; 
        private String businessGroupName; 
        private Integer currentPage; 
        private Integer eventType; 
        private String eventUniqueId; 
        private Integer feedbackStatus; 
        private String name; 
        private String operaUid; 
        private Integer pageSize; 
        private Integer predictionState; 
        private Integer severity; 
        private Integer status; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(GetAiopsEventListRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.businessGroupName = request.businessGroupName;
            this.currentPage = request.currentPage;
            this.eventType = request.eventType;
            this.eventUniqueId = request.eventUniqueId;
            this.feedbackStatus = request.feedbackStatus;
            this.name = request.name;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.predictionState = request.predictionState;
            this.severity = request.severity;
            this.status = request.status;
            this.uid = request.uid;
        } 

        /**
         * BusinessGroupId.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        /**
         * BusinessGroupName.
         */
        public Builder businessGroupName(String businessGroupName) {
            this.putQueryParameter("BusinessGroupName", businessGroupName);
            this.businessGroupName = businessGroupName;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EventType.
         */
        public Builder eventType(Integer eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * EventUniqueId.
         */
        public Builder eventUniqueId(String eventUniqueId) {
            this.putQueryParameter("EventUniqueId", eventUniqueId);
            this.eventUniqueId = eventUniqueId;
            return this;
        }

        /**
         * FeedbackStatus.
         */
        public Builder feedbackStatus(Integer feedbackStatus) {
            this.putQueryParameter("FeedbackStatus", feedbackStatus);
            this.feedbackStatus = feedbackStatus;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PredictionState.
         */
        public Builder predictionState(Integer predictionState) {
            this.putQueryParameter("PredictionState", predictionState);
            this.predictionState = predictionState;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(Integer severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetAiopsEventListRequest build() {
            return new GetAiopsEventListRequest(this);
        } 

    } 

}
