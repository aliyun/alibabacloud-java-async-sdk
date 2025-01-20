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
 * {@link UpdateAggregateCompliancePackResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAggregateCompliancePackResponseBody</p>
 */
public class UpdateAggregateCompliancePackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    private String compliancePackId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The compliance package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-f632626622af0079****</p>
         */
        public Builder compliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
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
