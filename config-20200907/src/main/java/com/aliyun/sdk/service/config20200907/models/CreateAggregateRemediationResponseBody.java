// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAggregateRemediationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAggregateRemediationResponseBody</p>
 */
public class CreateAggregateRemediationResponseBody extends TeaModel {
    @NameInMap("RemediationId")
    private String remediationId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAggregateRemediationResponseBody(Builder builder) {
        this.remediationId = builder.remediationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAggregateRemediationResponseBody create() {
        return builder().build();
    }

    /**
     * @return remediationId
     */
    public String getRemediationId() {
        return this.remediationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String remediationId; 
        private String requestId; 

        /**
         * The ID of the remediation template.
         */
        public Builder remediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAggregateRemediationResponseBody build() {
            return new CreateAggregateRemediationResponseBody(this);
        } 

    } 

}
