// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateApiResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApiResponseBody</p>
 */
public class CreateApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>8afff6c8c4c6447abb035812e4d66b65</p>
         */
        public Builder apiId(String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6C87A26A-6A18-4B8E-8099-705278381A2C</p>
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
