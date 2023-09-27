// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApiMethodsResponseBody} extends {@link TeaModel}
 *
 * <p>GetApiMethodsResponseBody</p>
 */
public class GetApiMethodsResponseBody extends TeaModel {
    @NameInMap("Methods")
    private java.util.List < String > methods;

    @NameInMap("RequestId")
    private String requestId;

    private GetApiMethodsResponseBody(Builder builder) {
        this.methods = builder.methods;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiMethodsResponseBody create() {
        return builder().build();
    }

    /**
     * @return methods
     */
    public java.util.List < String > getMethods() {
        return this.methods;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > methods; 
        private String requestId; 

        /**
         * Methods.
         */
        public Builder methods(java.util.List < String > methods) {
            this.methods = methods;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApiMethodsResponseBody build() {
            return new GetApiMethodsResponseBody(this);
        } 

    } 

}
