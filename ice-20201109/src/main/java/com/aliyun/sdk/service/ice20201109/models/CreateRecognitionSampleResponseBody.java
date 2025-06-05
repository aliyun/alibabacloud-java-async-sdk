// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateRecognitionSampleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRecognitionSampleResponseBody</p>
 */
public class CreateRecognitionSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SampleId")
    private String sampleId;

    private CreateRecognitionSampleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sampleId = builder.sampleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecognitionSampleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sampleId
     */
    public String getSampleId() {
        return this.sampleId;
    }

    public static final class Builder {
        private String requestId; 
        private String sampleId; 

        private Builder() {
        } 

        private Builder(CreateRecognitionSampleResponseBody model) {
            this.requestId = model.requestId;
            this.sampleId = model.sampleId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SampleId.
         */
        public Builder sampleId(String sampleId) {
            this.sampleId = sampleId;
            return this;
        }

        public CreateRecognitionSampleResponseBody build() {
            return new CreateRecognitionSampleResponseBody(this);
        } 

    } 

}
