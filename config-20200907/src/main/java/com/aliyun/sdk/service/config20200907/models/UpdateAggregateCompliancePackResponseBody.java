// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAggregateCompliancePackResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAggregateCompliancePackResponseBody</p>
 */
public class UpdateAggregateCompliancePackResponseBody extends TeaModel {
    @NameInMap("CompliancePackId")
    private String compliancePackId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateAggregateCompliancePackResponseBody(Builder builder) {
        this.compliancePackId = builder.compliancePackId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAggregateCompliancePackResponseBody create() {
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
         * The ID of the compliance package.
         */
        public Builder compliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAggregateCompliancePackResponseBody build() {
            return new UpdateAggregateCompliancePackResponseBody(this);
        } 

    } 

}
