// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link CreateReviewRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReviewRuleResponseBody</p>
 */
public class CreateReviewRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReviewRuleId")
    private String reviewRuleId;

    private CreateReviewRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.reviewRuleId = builder.reviewRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReviewRuleResponseBody create() {
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
     * @return reviewRuleId
     */
    public String getReviewRuleId() {
        return this.reviewRuleId;
    }

    public static final class Builder {
        private String requestId; 
        private String reviewRuleId; 

        private Builder() {
        } 

        private Builder(CreateReviewRuleResponseBody model) {
            this.requestId = model.requestId;
            this.reviewRuleId = model.reviewRuleId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReviewRuleId.
         */
        public Builder reviewRuleId(String reviewRuleId) {
            this.reviewRuleId = reviewRuleId;
            return this;
        }

        public CreateReviewRuleResponseBody build() {
            return new CreateReviewRuleResponseBody(this);
        } 

    } 

}
