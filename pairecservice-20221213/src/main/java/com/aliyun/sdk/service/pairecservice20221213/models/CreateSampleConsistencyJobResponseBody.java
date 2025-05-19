// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateSampleConsistencyJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSampleConsistencyJobResponseBody</p>
 */
public class CreateSampleConsistencyJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SampleConsistencyJobId")
    private String sampleConsistencyJobId;

    private CreateSampleConsistencyJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sampleConsistencyJobId = builder.sampleConsistencyJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSampleConsistencyJobResponseBody create() {
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
     * @return sampleConsistencyJobId
     */
    public String getSampleConsistencyJobId() {
        return this.sampleConsistencyJobId;
    }

    public static final class Builder {
        private String requestId; 
        private String sampleConsistencyJobId; 

        private Builder() {
        } 

        private Builder(CreateSampleConsistencyJobResponseBody model) {
            this.requestId = model.requestId;
            this.sampleConsistencyJobId = model.sampleConsistencyJobId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SampleConsistencyJobId.
         */
        public Builder sampleConsistencyJobId(String sampleConsistencyJobId) {
            this.sampleConsistencyJobId = sampleConsistencyJobId;
            return this;
        }

        public CreateSampleConsistencyJobResponseBody build() {
            return new CreateSampleConsistencyJobResponseBody(this);
        } 

    } 

}
