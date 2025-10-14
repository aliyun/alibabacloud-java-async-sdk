// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateNormalizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNormalizationRuleResponseBody</p>
 */
public class CreateNormalizationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
    private String normalizationRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNormalizationRuleResponseBody(Builder builder) {
        this.normalizationRuleId = builder.normalizationRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNormalizationRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return normalizationRuleId
     */
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String normalizationRuleId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateNormalizationRuleResponseBody model) {
            this.normalizationRuleId = model.normalizationRuleId;
            this.requestId = model.requestId;
        } 

        /**
         * NormalizationRuleId.
         */
        public Builder normalizationRuleId(String normalizationRuleId) {
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNormalizationRuleResponseBody build() {
            return new CreateNormalizationRuleResponseBody(this);
        } 

    } 

}
