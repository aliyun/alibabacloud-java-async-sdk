// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemRequest} extends {@link RequestModel}
 *
 * <p>UpdateProblemRequest</p>
 */
public class UpdateProblemRequest extends Request {
    @Body
    @NameInMap("feedback")
    private String feedback;

    @Body
    @NameInMap("level")
    private String level;

    @Body
    @NameInMap("mainHandlerId")
    private Long mainHandlerId;

    @Body
    @NameInMap("preliminaryReason")
    private String preliminaryReason;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("problemName")
    private String problemName;

    @Body
    @NameInMap("progressSummary")
    private String progressSummary;

    @Body
    @NameInMap("progressSummaryRichTextId")
    private Long progressSummaryRichTextId;

    @Body
    @NameInMap("relatedServiceId")
    private Long relatedServiceId;

    @Body
    @NameInMap("serviceGroupIds")
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

        private Builder(UpdateProblemRequest response) {
            super(response);
            this.feedback = response.feedback;
            this.level = response.level;
            this.mainHandlerId = response.mainHandlerId;
            this.preliminaryReason = response.preliminaryReason;
            this.problemId = response.problemId;
            this.problemName = response.problemName;
            this.progressSummary = response.progressSummary;
            this.progressSummaryRichTextId = response.progressSummaryRichTextId;
            this.relatedServiceId = response.relatedServiceId;
            this.serviceGroupIds = response.serviceGroupIds;
        } 

        /**
         * ????????????
         */
        public Builder feedback(String feedback) {
            this.putBodyParameter("feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * ????????????
         */
        public Builder level(String level) {
            this.putBodyParameter("level", level);
            this.level = level;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder mainHandlerId(Long mainHandlerId) {
            this.putBodyParameter("mainHandlerId", mainHandlerId);
            this.mainHandlerId = mainHandlerId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder preliminaryReason(String preliminaryReason) {
            this.putBodyParameter("preliminaryReason", preliminaryReason);
            this.preliminaryReason = preliminaryReason;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * ?????????
         */
        public Builder problemName(String problemName) {
            this.putBodyParameter("problemName", problemName);
            this.problemName = problemName;
            return this;
        }

        /**
         * ????????????
         */
        public Builder progressSummary(String progressSummary) {
            this.putBodyParameter("progressSummary", progressSummary);
            this.progressSummary = progressSummary;
            return this;
        }

        /**
         * ?????????????????????id
         */
        public Builder progressSummaryRichTextId(Long progressSummaryRichTextId) {
            this.putBodyParameter("progressSummaryRichTextId", progressSummaryRichTextId);
            this.progressSummaryRichTextId = progressSummaryRichTextId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder relatedServiceId(Long relatedServiceId) {
            this.putBodyParameter("relatedServiceId", relatedServiceId);
            this.relatedServiceId = relatedServiceId;
            return this;
        }

        /**
         * ???????????????
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
