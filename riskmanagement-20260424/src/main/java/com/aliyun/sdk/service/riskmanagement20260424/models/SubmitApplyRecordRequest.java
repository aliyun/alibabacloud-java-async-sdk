// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link SubmitApplyRecordRequest} extends {@link RequestModel}
 *
 * <p>SubmitApplyRecordRequest</p>
 */
public class SubmitApplyRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applyRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommitmentLetter")
    private String commitmentLetter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventIdList")
    private java.util.List<String> eventIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationProof")
    private String qualificationProof;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Trial")
    private Boolean trial;

    private SubmitApplyRecordRequest(Builder builder) {
        super(builder);
        this.applyRequest = builder.applyRequest;
        this.commitmentLetter = builder.commitmentLetter;
        this.description = builder.description;
        this.eventIdList = builder.eventIdList;
        this.qualificationProof = builder.qualificationProof;
        this.trial = builder.trial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitApplyRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyRequest
     */
    public String getApplyRequest() {
        return this.applyRequest;
    }

    /**
     * @return commitmentLetter
     */
    public String getCommitmentLetter() {
        return this.commitmentLetter;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventIdList
     */
    public java.util.List<String> getEventIdList() {
        return this.eventIdList;
    }

    /**
     * @return qualificationProof
     */
    public String getQualificationProof() {
        return this.qualificationProof;
    }

    /**
     * @return trial
     */
    public Boolean getTrial() {
        return this.trial;
    }

    public static final class Builder extends Request.Builder<SubmitApplyRecordRequest, Builder> {
        private String applyRequest; 
        private String commitmentLetter; 
        private String description; 
        private java.util.List<String> eventIdList; 
        private String qualificationProof; 
        private Boolean trial; 

        private Builder() {
            super();
        } 

        private Builder(SubmitApplyRecordRequest request) {
            super(request);
            this.applyRequest = request.applyRequest;
            this.commitmentLetter = request.commitmentLetter;
            this.description = request.description;
            this.eventIdList = request.eventIdList;
            this.qualificationProof = request.qualificationProof;
            this.trial = request.trial;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AR01</p>
         */
        public Builder applyRequest(String applyRequest) {
            this.putQueryParameter("ApplyRequest", applyRequest);
            this.applyRequest = applyRequest;
            return this;
        }

        /**
         * CommitmentLetter.
         */
        public Builder commitmentLetter(String commitmentLetter) {
            this.putQueryParameter("CommitmentLetter", commitmentLetter);
            this.commitmentLetter = commitmentLetter;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EventIdList.
         */
        public Builder eventIdList(java.util.List<String> eventIdList) {
            String eventIdListShrink = shrink(eventIdList, "EventIdList", "json");
            this.putQueryParameter("EventIdList", eventIdListShrink);
            this.eventIdList = eventIdList;
            return this;
        }

        /**
         * QualificationProof.
         */
        public Builder qualificationProof(String qualificationProof) {
            this.putQueryParameter("QualificationProof", qualificationProof);
            this.qualificationProof = qualificationProof;
            return this;
        }

        /**
         * Trial.
         */
        public Builder trial(Boolean trial) {
            this.putQueryParameter("Trial", trial);
            this.trial = trial;
            return this;
        }

        @Override
        public SubmitApplyRecordRequest build() {
            return new SubmitApplyRecordRequest(this);
        } 

    } 

}
