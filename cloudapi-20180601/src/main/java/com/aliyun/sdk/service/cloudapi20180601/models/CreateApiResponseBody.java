// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApiResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApiResponseBody</p>
 */
public class CreateApiResponseBody extends TeaModel {
    @NameInMap("ApiId")
    private String apiId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateApiResponseBody(Builder builder) {
        this.apiId = builder.apiId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiId; 
        private String requestId; 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApiResponseBody build() {
            return new CreateApiResponseBody(this);
        } 

    } 

}
