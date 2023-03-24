// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrivateAccessApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePrivateAccessApplicationResponseBody</p>
 */
public class CreatePrivateAccessApplicationResponseBody extends TeaModel {
    @NameInMap("ApplicationId")
    private String applicationId;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePrivateAccessApplicationResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivateAccessApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private String requestId; 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePrivateAccessApplicationResponseBody build() {
            return new CreatePrivateAccessApplicationResponseBody(this);
        } 

    } 

}
