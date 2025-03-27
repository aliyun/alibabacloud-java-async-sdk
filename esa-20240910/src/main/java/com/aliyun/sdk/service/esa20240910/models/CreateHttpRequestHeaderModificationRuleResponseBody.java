// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateHttpRequestHeaderModificationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHttpRequestHeaderModificationRuleResponseBody</p>
 */
public class CreateHttpRequestHeaderModificationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHttpRequestHeaderModificationRuleResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHttpRequestHeaderModificationRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long configId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateHttpRequestHeaderModificationRuleResponseBody model) {
            this.configId = model.configId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHttpRequestHeaderModificationRuleResponseBody build() {
            return new CreateHttpRequestHeaderModificationRuleResponseBody(this);
        } 

    } 

}
