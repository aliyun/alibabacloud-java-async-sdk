// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20210112.models;

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
 * {@link SendFeedbackRequest} extends {@link RequestModel}
 *
 * <p>SendFeedbackRequest</p>
 */
public class SendFeedbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLabel")
    private String riskLabel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sampleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private SendFeedbackRequest(Builder builder) {
        super(builder);
        this.reason = builder.reason;
        this.riskLabel = builder.riskLabel;
        this.sampleType = builder.sampleType;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendFeedbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return riskLabel
     */
    public String getRiskLabel() {
        return this.riskLabel;
    }

    /**
     * @return sampleType
     */
    public String getSampleType() {
        return this.sampleType;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<SendFeedbackRequest, Builder> {
        private String reason; 
        private String riskLabel; 
        private String sampleType; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(SendFeedbackRequest request) {
            super(request);
            this.reason = request.reason;
            this.riskLabel = request.riskLabel;
            this.sampleType = request.sampleType;
            this.value = request.value;
        } 

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>Sample labels. User-defined, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>OTHERS</p>
         */
        public Builder riskLabel(String riskLabel) {
            this.putQueryParameter("RiskLabel", riskLabel);
            this.riskLabel = riskLabel;
            return this;
        }

        /**
         * <p>Sample type. For phone number type samples, input PHONE; for email type samples, input EMAIL; for account type samples, input ACCOUNT.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PHONE</p>
         */
        public Builder sampleType(String sampleType) {
            this.putQueryParameter("SampleType", sampleType);
            this.sampleType = sampleType;
            return this;
        }

        /**
         * <p>Sample value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000000000</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public SendFeedbackRequest build() {
            return new SendFeedbackRequest(this);
        } 

    } 

}
