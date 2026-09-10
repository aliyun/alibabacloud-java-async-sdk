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
         * <p>The request reason.</p>
         * <ul>
         * <li><strong>AR01</strong>: Rectified. Request to unblock.</li>
         * <li><strong>AR02</strong>: No violation found after investigation.</li>
         * <li><strong>AR03</strong>: The instance or service has been shut down and cannot be operated. Request to unblock and then clear the violation information.</li>
         * <li><strong>AR04</strong>: Files deleted. Request to unblock.</li>
         * <li><strong>AR05</strong>: The instance has been released.</li>
         * <li><strong>AR00</strong>: Other. Provide a description.</li>
         * </ul>
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
         * <p>The commitment letter.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;fileName\&quot;:\&quot;5a4b4xxxxd0b6.png\&quot;,\&quot;filePath\&quot;:\&quot;xxx/1cxxx7d0202.png\&quot;,\&quot;name\&quot;:\&quot;5axxxc1d0b6.png\&quot;}]</p>
         */
        public Builder commitmentLetter(String commitmentLetter) {
            this.putQueryParameter("CommitmentLetter", commitmentLetter);
            this.commitmentLetter = commitmentLetter;
            return this;
        }

        /**
         * <p>The description of the situation.</p>
         * 
         * <strong>example:</strong>
         * <p>Rectification completed. Related websites have been shut down.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of specified event IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>43029423</p>
         */
        public Builder eventIdList(java.util.List<String> eventIdList) {
            String eventIdListShrink = shrink(eventIdList, "EventIdList", "json");
            this.putQueryParameter("EventIdList", eventIdListShrink);
            this.eventIdList = eventIdList;
            return this;
        }

        /**
         * <p>The qualification proof.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;fileName\&quot;:\&quot;5a4b4xxxxd0b6.png\&quot;,\&quot;filePath\&quot;:\&quot;xxx/1cxxx7d0202.png\&quot;,\&quot;name\&quot;:\&quot;5axxxc1d0b6.png\&quot;}]</p>
         */
        public Builder qualificationProof(String qualificationProof) {
            this.putQueryParameter("QualificationProof", qualificationProof);
            this.qualificationProof = qualificationProof;
            return this;
        }

        /**
         * <p>Specifies whether manual review is required.</p>
         * <ul>
         * <li><strong>true</strong>: Manual review is required.</li>
         * <li><strong>false</strong>: Manual review is not required.</li>
         * </ul>
         * <blockquote>
         * <p>Default value: manual review is not required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
