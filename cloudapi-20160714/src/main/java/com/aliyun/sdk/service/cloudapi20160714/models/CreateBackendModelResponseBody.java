// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateBackendModelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackendModelResponseBody</p>
 */
public class CreateBackendModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendModelId")
    private String backendModelId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBackendModelResponseBody(Builder builder) {
        this.backendModelId = builder.backendModelId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackendModelResponseBody create() {
        return builder().build();
    }

    /**
     * @return backendModelId
     */
    public String getBackendModelId() {
        return this.backendModelId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String backendModelId; 
        private String requestId; 

        /**
         * BackendModelId.
         */
        public Builder backendModelId(String backendModelId) {
            this.backendModelId = backendModelId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBackendModelResponseBody build() {
            return new CreateBackendModelResponseBody(this);
        } 

    } 

}
