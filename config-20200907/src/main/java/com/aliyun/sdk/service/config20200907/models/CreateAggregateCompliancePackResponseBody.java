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
 * {@link CreateAggregateCompliancePackResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAggregateCompliancePackResponseBody</p>
 */
public class CreateAggregateCompliancePackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    private String compliancePackId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAggregateCompliancePackResponseBody(Builder builder) {
        this.compliancePackId = builder.compliancePackId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAggregateCompliancePackResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateAggregateCompliancePackResponseBody model) {
            this.compliancePackId = model.compliancePackId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The compliance package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-fc56626622af00f9****</p>
         */
        public Builder compliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CC0CE5EB-E51E-48EB-B4AB-9A9E131ECC0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAggregateCompliancePackResponseBody build() {
            return new CreateAggregateCompliancePackResponseBody(this);
        } 

    } 

}
