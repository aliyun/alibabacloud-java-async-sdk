// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link ResetQualificationVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>ResetQualificationVerificationResponseBody</p>
 */
public class ResetQualificationVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ResetQualificationVerificationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetQualificationVerificationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(ResetQualificationVerificationResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>Unique request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>D6CB3623-4726-4947-AC2B-2C6E673B447C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResetQualificationVerificationResponseBody build() {
            return new ResetQualificationVerificationResponseBody(this);
        } 

    } 

}
