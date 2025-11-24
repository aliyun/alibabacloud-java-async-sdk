// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link GetRegisteredServiceNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegisteredServiceNamespacesResponseBody</p>
 */
public class GetRegisteredServiceNamespacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Namespaces")
    private java.util.List<String> namespaces;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaces
     */
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> namespaces; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRegisteredServiceNamespacesResponseBody model) {
            this.namespaces = model.namespaces;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The names of the queried namespaces.</p>
         */
        public Builder namespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
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
