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
 * {@link CreateHttpIncomingResponseHeaderModificationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHttpIncomingResponseHeaderModificationRuleResponseBody</p>
 */
public class CreateHttpIncomingResponseHeaderModificationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHttpIncomingResponseHeaderModificationRuleResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHttpIncomingResponseHeaderModificationRuleResponseBody create() {
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

        private Builder(CreateHttpIncomingResponseHeaderModificationRuleResponseBody model) {
            this.configId = model.configId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>434497172875264</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHttpIncomingResponseHeaderModificationRuleResponseBody build() {
            return new CreateHttpIncomingResponseHeaderModificationRuleResponseBody(this);
        } 

    } 

}
