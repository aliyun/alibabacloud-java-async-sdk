// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRemediationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateRemediationResponseBody</p>
 */
public class UpdateRemediationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemediationId")
    private String remediationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateRemediationResponseBody(Builder builder) {
        this.remediationId = builder.remediationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRemediationResponseBody create() {
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

        public UpdateRemediationResponseBody build() {
            return new UpdateRemediationResponseBody(this);
        } 

    } 

}
