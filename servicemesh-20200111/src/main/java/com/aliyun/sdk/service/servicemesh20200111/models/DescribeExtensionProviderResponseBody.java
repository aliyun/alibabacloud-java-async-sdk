// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExtensionProviderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExtensionProviderResponseBody</p>
 */
public class DescribeExtensionProviderResponseBody extends TeaModel {
    @NameInMap("ExtensionProviders")
    private java.util.List < java.util.Map<String, ?>> extensionProviders;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeExtensionProviderResponseBody(Builder builder) {
        this.extensionProviders = builder.extensionProviders;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExtensionProviderResponseBody create() {
        return builder().build();
    }

    /**
     * @return extensionProviders
     */
    public java.util.List < java.util.Map<String, ?>> getExtensionProviders() {
        return this.extensionProviders;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < java.util.Map<String, ?>> extensionProviders; 
        private String requestId; 

        /**
         * ExtensionProviders.
         */
        public Builder extensionProviders(java.util.List < java.util.Map<String, ?>> extensionProviders) {
            this.extensionProviders = extensionProviders;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExtensionProviderResponseBody build() {
            return new DescribeExtensionProviderResponseBody(this);
        } 

    } 

}
