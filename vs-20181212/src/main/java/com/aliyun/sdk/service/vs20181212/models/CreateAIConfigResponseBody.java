// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAIConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAIConfigResponseBody</p>
 */
public class CreateAIConfigResponseBody extends TeaModel {
    @NameInMap("ConfigId")
    private String configId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAIConfigResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configId; 
        private String requestId; 

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
            this.configId = configId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAIConfigResponseBody build() {
            return new CreateAIConfigResponseBody(this);
        } 

    } 

}
