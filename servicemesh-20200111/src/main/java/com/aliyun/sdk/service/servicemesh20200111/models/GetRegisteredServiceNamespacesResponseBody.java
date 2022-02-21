// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegisteredServiceNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegisteredServiceNamespacesResponseBody</p>
 */
public class GetRegisteredServiceNamespacesResponseBody extends TeaModel {
    @NameInMap("Namespaces")
    private java.util.List < String > namespaces;

    @NameInMap("RequestId")
    private String requestId;

    private GetRegisteredServiceNamespacesResponseBody(Builder builder) {
        this.namespaces = builder.namespaces;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegisteredServiceNamespacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return namespaces
     */
    public java.util.List < String > getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > namespaces; 
        private String requestId; 

        /**
         * Namespaces.
         */
        public Builder namespaces(java.util.List < String > namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRegisteredServiceNamespacesResponseBody build() {
            return new GetRegisteredServiceNamespacesResponseBody(this);
        } 

    } 

}
