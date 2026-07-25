// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link GetYikeAgentJobEstimatedCreditResponseBody} extends {@link TeaModel}
 *
 * <p>GetYikeAgentJobEstimatedCreditResponseBody</p>
 */
public class GetYikeAgentJobEstimatedCreditResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EstimatedCreditCost")
    private Double estimatedCreditCost;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetYikeAgentJobEstimatedCreditResponseBody(Builder builder) {
        this.estimatedCreditCost = builder.estimatedCreditCost;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYikeAgentJobEstimatedCreditResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return estimatedCreditCost
     */
    public Double getEstimatedCreditCost() {
        return this.estimatedCreditCost;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Double estimatedCreditCost; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetYikeAgentJobEstimatedCreditResponseBody model) {
            this.estimatedCreditCost = model.estimatedCreditCost;
            this.requestId = model.requestId;
        } 

        /**
         * EstimatedCreditCost.
         */
        public Builder estimatedCreditCost(Double estimatedCreditCost) {
            this.estimatedCreditCost = estimatedCreditCost;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetYikeAgentJobEstimatedCreditResponseBody build() {
            return new GetYikeAgentJobEstimatedCreditResponseBody(this);
        } 

    } 

}
