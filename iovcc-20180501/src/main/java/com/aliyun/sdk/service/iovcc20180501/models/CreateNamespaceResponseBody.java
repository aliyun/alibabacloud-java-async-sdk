// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNamespaceResponseBody</p>
 */
public class CreateNamespaceResponseBody extends TeaModel {
    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("RequestId")
    private String requestId;

    private CreateNamespaceResponseBody(Builder builder) {
        this.namespace = builder.namespace;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNamespaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String namespace; 
        private String requestId; 

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNamespaceResponseBody build() {
            return new CreateNamespaceResponseBody(this);
        } 

    } 

}
