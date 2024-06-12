// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAggregateRemediationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAggregateRemediationResponseBody</p>
 */
public class UpdateAggregateRemediationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemediationId")
    private String remediationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateAggregateRemediationResponseBody(Builder builder) {
        this.remediationId = builder.remediationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAggregateRemediationResponseBody create() {
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
         * The ID of the remediation setting.
         */
        public Builder remediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAggregateRemediationResponseBody build() {
            return new UpdateAggregateRemediationResponseBody(this);
        } 

    } 

}
