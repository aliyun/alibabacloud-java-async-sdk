// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link CreateRemediationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRemediationResponseBody</p>
 */
public class CreateRemediationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemediationId")
    private String remediationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRemediationResponseBody(Builder builder) {
        this.remediationId = builder.remediationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRemediationResponseBody create() {
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
         * <p>The ID of the remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-909ba2d4716700eb****</p>
         */
        public Builder remediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7817373-78CB-4F9A-8AFA-E7A88E9D64A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRemediationResponseBody build() {
            return new CreateRemediationResponseBody(this);
        } 

    } 

}
