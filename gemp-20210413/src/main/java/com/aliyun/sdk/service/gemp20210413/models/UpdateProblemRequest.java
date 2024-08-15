// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemRequest} extends {@link RequestModel}
 *
 * <p>UpdateProblemRequest</p>
 */
public class UpdateProblemRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("feedback")
    private String feedback;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("level")
    private String level;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mainHandlerId")
    private Long mainHandlerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("preliminaryReason")
    private String preliminaryReason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemId")
    private Long problemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemName")
    private String problemName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("progressSummary")
    private String progressSummary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("progressSummaryRichTextId")
    private Long progressSummaryRichTextId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("relatedServiceId")
    private Long relatedServiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupIds")
    private java.util.List < Long > serviceGroupIds;

    private UpdateProblemRequest(Builder builder) {
        super(builder);
        this.feedback = builder.feedback;
        this.level = builder.level;
        this.mainHandlerId = builder.mainHandlerId;
        this.preliminaryReason = builder.preliminaryReason;
        this.problemId = builder.problemId;
        this.problemName = builder.problemName;
        this.progressSummary = builder.progressSummary;
        this.progressSummaryRichTextId = builder.progressSummaryRichTextId;
        this.relatedServiceId = builder.relatedServiceId;
        this.serviceGroupIds = builder.serviceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProblemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return feedback
     */
    public String getFeedback() {
        return this.feedback;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return mainHandlerId
     */
    public Long getMainHandlerId() {
        return this.mainHandlerId;
    }

    /**
     * @return preliminaryReason
     */
    public String getPreliminaryReason() {
        return this.preliminaryReason;
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    /**
     * @return problemName
     */
    public String getProblemName() {
        return this.problemName;
    }

    /**
     * @return progressSummary
     */
    public String getProgressSummary() {
        return this.progressSummary;
    }

    /**
     * @return progressSummaryRichTextId
     */
    public Long getProgressSummaryRichTextId() {
        return this.progressSummaryRichTextId;
    }

    /**
     * @return relatedServiceId
     */
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    /**
     * @return serviceGroupIds
     */
    public java.util.List < Long > getServiceGroupIds() {
        return this.serviceGroupIds;
    }

    public static final class Builder extends Request.Builder<UpdateProblemRequest, Builder> {
        private String feedback; 
        private String level; 
        private Long mainHandlerId; 
        private String preliminaryReason; 
        private Long problemId; 
        private String problemName; 
        private String progressSummary; 
        private Long progressSummaryRichTextId; 
        private Long relatedServiceId; 
        private java.util.List < Long > serviceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProblemRequest request) {
            super(request);
            this.feedback = request.feedback;
            this.level = request.level;
            this.mainHandlerId = request.mainHandlerId;
            this.preliminaryReason = request.preliminaryReason;
            this.problemId = request.problemId;
            this.problemName = request.problemName;
            this.progressSummary = request.progressSummary;
            this.progressSummaryRichTextId = request.progressSummaryRichTextId;
            this.relatedServiceId = request.relatedServiceId;
            this.serviceGroupIds = request.serviceGroupIds;
        } 

        /**
         * feedback.
         */
        public Builder feedback(String feedback) {
            this.putBodyParameter("feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * level.
         */
        public Builder level(String level) {
            this.putBodyParameter("level", level);
            this.level = level;
            return this;
        }

        /**
         * mainHandlerId.
         */
        public Builder mainHandlerId(Long mainHandlerId) {
            this.putBodyParameter("mainHandlerId", mainHandlerId);
            this.mainHandlerId = mainHandlerId;
            return this;
        }

        /**
         * preliminaryReason.
         */
        public Builder preliminaryReason(String preliminaryReason) {
            this.putBodyParameter("preliminaryReason", preliminaryReason);
            this.preliminaryReason = preliminaryReason;
            return this;
        }

        /**
         * problemId.
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * problemName.
         */
        public Builder problemName(String problemName) {
            this.putBodyParameter("problemName", problemName);
            this.problemName = problemName;
            return this;
        }

        /**
         * progressSummary.
         */
        public Builder progressSummary(String progressSummary) {
            this.putBodyParameter("progressSummary", progressSummary);
            this.progressSummary = progressSummary;
            return this;
        }

        /**
         * progressSummaryRichTextId.
         */
        public Builder progressSummaryRichTextId(Long progressSummaryRichTextId) {
            this.putBodyParameter("progressSummaryRichTextId", progressSummaryRichTextId);
            this.progressSummaryRichTextId = progressSummaryRichTextId;
            return this;
        }

        /**
         * relatedServiceId.
         */
        public Builder relatedServiceId(Long relatedServiceId) {
            this.putBodyParameter("relatedServiceId", relatedServiceId);
            this.relatedServiceId = relatedServiceId;
            return this;
        }

        /**
         * serviceGroupIds.
         */
        public Builder serviceGroupIds(java.util.List < Long > serviceGroupIds) {
            this.putBodyParameter("serviceGroupIds", serviceGroupIds);
            this.serviceGroupIds = serviceGroupIds;
            return this;
        }

        @Override
        public UpdateProblemRequest build() {
            return new UpdateProblemRequest(this);
        } 

    } 

}
