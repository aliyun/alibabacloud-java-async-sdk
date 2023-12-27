// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20210112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeFeedbackRequest} extends {@link RequestModel}
 *
 * <p>RevokeFeedbackRequest</p>
 */
public class RevokeFeedbackRequest extends Request {
    @Body
    @NameInMap("SampleType")
    @Validation(required = true)
    private String sampleType;

    @Body
    @NameInMap("Value")
    @Validation(required = true)
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
         * SampleType.
         */
        public Builder sampleType(String sampleType) {
            this.putBodyParameter("SampleType", sampleType);
            this.sampleType = sampleType;
            return this;
        }

        /**
         * Value.
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
