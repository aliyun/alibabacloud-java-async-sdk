// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link SubmitScriptPreReviewResultRequest} extends {@link RequestModel}
 *
 * <p>SubmitScriptPreReviewResultRequest</p>
 */
public class SubmitScriptPreReviewResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RejectReason")
    private String rejectReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReviewResult")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reviewResult;

    private SubmitScriptPreReviewResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.recordId = builder.recordId;
        this.rejectReason = builder.rejectReason;
        this.reviewResult = builder.reviewResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitScriptPreReviewResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    /**
     * @return rejectReason
     */
    public String getRejectReason() {
        return this.rejectReason;
    }

    /**
     * @return reviewResult
     */
    public String getReviewResult() {
        return this.reviewResult;
    }

    public static final class Builder extends Request.Builder<SubmitScriptPreReviewResultRequest, Builder> {
        private String instanceId; 
        private String recordId; 
        private String rejectReason; 
        private String reviewResult; 

        private Builder() {
            super();
        } 

        private Builder(SubmitScriptPreReviewResultRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.recordId = request.recordId;
            this.rejectReason = request.rejectReason;
            this.reviewResult = request.reviewResult;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bdd49242-114c-4045-b1d1-25ccc1756c75</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the script review record.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b8e1a4d3-9c2f-4e6a-b7d5-3f1e2a4c6b8d</p>
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The reason for pre-review rejection. This parameter is required when ReviewResult is set to REJECT.</p>
         * 
         * <strong>example:</strong>
         * <p>The script content involves sensitive information</p>
         */
        public Builder rejectReason(String rejectReason) {
            this.putQueryParameter("RejectReason", rejectReason);
            this.rejectReason = rejectReason;
            return this;
        }

        /**
         * <p>The pre-review result. Valid values: PASS (approved) and REJECT (rejected). The value is not case-sensitive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        public Builder reviewResult(String reviewResult) {
            this.putQueryParameter("ReviewResult", reviewResult);
            this.reviewResult = reviewResult;
            return this;
        }

        @Override
        public SubmitScriptPreReviewResultRequest build() {
            return new SubmitScriptPreReviewResultRequest(this);
        } 

    } 

}
