// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link CreatePbcInvokeReviewResult} extends {@link TeaModel}
 *
 * <p>CreatePbcInvokeReviewResult</p>
 */
public class CreatePbcInvokeReviewResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pbcInvokeReviewId")
    private Long pbcInvokeReviewId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreatePbcInvokeReviewResult(Builder builder) {
        this.pbcInvokeReviewId = builder.pbcInvokeReviewId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePbcInvokeReviewResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pbcInvokeReviewId
     */
    public Long getPbcInvokeReviewId() {
        return this.pbcInvokeReviewId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long pbcInvokeReviewId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePbcInvokeReviewResult model) {
            this.pbcInvokeReviewId = model.pbcInvokeReviewId;
            this.requestId = model.requestId;
        } 

        /**
         * pbcInvokeReviewId.
         */
        public Builder pbcInvokeReviewId(Long pbcInvokeReviewId) {
            this.pbcInvokeReviewId = pbcInvokeReviewId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePbcInvokeReviewResult build() {
            return new CreatePbcInvokeReviewResult(this);
        } 

    } 

}
