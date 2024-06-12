// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCompliancePackResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCompliancePackResponseBody</p>
 */
public class CreateCompliancePackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    private String compliancePackId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCompliancePackResponseBody(Builder builder) {
        this.compliancePackId = builder.compliancePackId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCompliancePackResponseBody create() {
        return builder().build();
    }

    /**
     * @return compliancePackId
     */
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String compliancePackId; 
        private String requestId; 

        /**
         * The compliance package ID.
         */
        public Builder compliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCompliancePackResponseBody build() {
            return new CreateCompliancePackResponseBody(this);
        } 

    } 

}
