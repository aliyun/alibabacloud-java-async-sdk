// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20210112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendFeedbackRequest} extends {@link RequestModel}
 *
 * <p>SendFeedbackRequest</p>
 */
public class SendFeedbackRequest extends Request {
    @Query
    @NameInMap("RiskLabel")
    private String riskLabel;

    @Query
    @NameInMap("SampleType")
    @Validation(required = true)
    private String sampleType;

    @Query
    @NameInMap("Value")
    @Validation(required = true)
    private String value;

    private SendFeedbackRequest(Builder builder) {
        super(builder);
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
        private String riskLabel; 
        private String sampleType; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(SendFeedbackRequest request) {
            super(request);
            this.riskLabel = request.riskLabel;
            this.sampleType = request.sampleType;
            this.value = request.value;
        } 

        /**
         * RiskLabel.
         */
        public Builder riskLabel(String riskLabel) {
            this.putQueryParameter("RiskLabel", riskLabel);
            this.riskLabel = riskLabel;
            return this;
        }

        /**
         * SampleType.
         */
        public Builder sampleType(String sampleType) {
            this.putQueryParameter("SampleType", sampleType);
            this.sampleType = sampleType;
            return this;
        }

        /**
         * Value.
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
