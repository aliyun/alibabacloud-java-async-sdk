// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUsageResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsageResponseBody</p>
 */
public class ListUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map < String, ? > attributes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUsageResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.Map < String, ? > getAttributes() {
        return this.attributes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, ? > attributes; 
        private String requestId; 

        /**
         * <p>The information about the used amounts and upper limits of privileges and quotas that you have in the specified region. The information contains the following items:</p>
         * <ul>
         * <li>UsedCpu: the number of existing vCPUs.</li>
         * <li>MaxCpu: the upper limit of vCPUs.</li>
         * <li>MaxImageCacheCount: the upper limit of manually created image caches.</li>
         * <li>UsedImageCacheCount: the number of existing image caches that are manually created.</li>
         * <li>MaxAutoImageCacheCount: the upper limit of automatically created image caches.</li>
         * <li>UsedAutoImageCacheCount: the number of existing image caches that are automatically created.</li>
         * <li>MaxDataCacheCount: the upper limit of DataCaches.</li>
         * <li>UsedDataCacheCount: the number of existing DataCaches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;UsedCpu&quot;: 11,&quot;MaxCpu&quot;: 1000,&quot;MaxImageCacheCount&quot;: 50,&quot;UsedImageCacheCount&quot;: 0}</p>
         */
        public Builder attributes(java.util.Map < String, ? > attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89164E78-FC82-4684-BE97-DCDD85D26546</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUsageResponseBody build() {
            return new ListUsageResponseBody(this);
        } 

    } 

}
