// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsageResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsageResponseBody</p>
 */
public class ListUsageResponseBody extends TeaModel {
    @NameInMap("Attributes")
    private java.util.Map < String, ? > attributes;

    @NameInMap("RequestId")
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
         * The information about the used amounts and upper limits of privileges and quotas that you have in the specified region. The information contains the following items:
         * <p>
         * 
         * *   UsedCpu: the number of existing vCPUs.
         * *   MaxCpu: the upper limit of vCPUs.
         * *   MaxImageCacheCount: the upper limit of manually created image caches.
         * *   UsedImageCacheCount: the number of existing image caches that are manually created.
         * *   MaxAutoImageCacheCount: the upper limit of automatically created image caches.
         * *   UsedAutoImageCacheCount: the number of existing image caches that are automatically created.
         * *   MaxDataCacheCount: the upper limit of DataCaches.
         * *   UsedDataCacheCount: the number of existing DataCaches.
         */
        public Builder attributes(java.util.Map < String, ? > attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * The request ID.
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
