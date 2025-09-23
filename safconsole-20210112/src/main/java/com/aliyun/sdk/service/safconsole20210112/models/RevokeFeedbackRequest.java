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
 * {@link RevokeFeedbackRequest} extends {@link RequestModel}
 *
 * <p>RevokeFeedbackRequest</p>
 */
public class RevokeFeedbackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SampleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sampleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private RevokeFeedbackRequest(Builder builder) {
        super(builder);
        this.sampleType = builder.sampleType;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeFeedbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<RevokeFeedbackRequest, Builder> {
        private String sampleType; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(RevokeFeedbackRequest request) {
            super(request);
            this.sampleType = request.sampleType;
            this.value = request.value;
        } 

        /**
         * <p>Sample type. For phone number type samples, input PHONE; for email type samples, input EMAIL; for account type samples, input ACCOUNT.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PHONE</p>
         */
        public Builder sampleType(String sampleType) {
            this.putBodyParameter("SampleType", sampleType);
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
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public RevokeFeedbackRequest build() {
            return new RevokeFeedbackRequest(this);
        } 

    } 

}
