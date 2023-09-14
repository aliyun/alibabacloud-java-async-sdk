// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateParamResponseBody} extends {@link TeaModel}
 *
 * <p>CreateParamResponseBody</p>
 */
public class CreateParamResponseBody extends TeaModel {
    @NameInMap("ParamId")
    private Long paramId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateParamResponseBody(Builder builder) {
        this.paramId = builder.paramId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateParamResponseBody create() {
        return builder().build();
    }

    /**
     * @return paramId
     */
    public Long getParamId() {
        return this.paramId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long paramId; 
        private String requestId; 

        /**
         * ParamId.
         */
        public Builder paramId(Long paramId) {
            this.paramId = paramId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateParamResponseBody build() {
            return new CreateParamResponseBody(this);
        } 

    } 

}
