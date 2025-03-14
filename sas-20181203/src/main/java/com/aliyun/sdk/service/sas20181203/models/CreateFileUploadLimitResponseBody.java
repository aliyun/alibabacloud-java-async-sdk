// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateFileUploadLimitResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileUploadLimitResponseBody</p>
 */
public class CreateFileUploadLimitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFileUploadLimitResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileUploadLimitResponseBody create() {
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

        private Builder(CreateFileUploadLimitResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFileUploadLimitResponseBody build() {
            return new CreateFileUploadLimitResponseBody(this);
        } 

    } 

}
