// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link GetInvalidDomainCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetInvalidDomainCountResponseBody</p>
 */
public class GetInvalidDomainCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InvalidDomainCount")
    private String invalidDomainCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInvalidDomainCountResponseBody(Builder builder) {
        this.invalidDomainCount = builder.invalidDomainCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInvalidDomainCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return invalidDomainCount
     */
    public String getInvalidDomainCount() {
        return this.invalidDomainCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String invalidDomainCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInvalidDomainCountResponseBody model) {
            this.invalidDomainCount = model.invalidDomainCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of invalid domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder invalidDomainCount(String invalidDomainCount) {
            this.invalidDomainCount = invalidDomainCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInvalidDomainCountResponseBody build() {
            return new GetInvalidDomainCountResponseBody(this);
        } 

    } 

}
