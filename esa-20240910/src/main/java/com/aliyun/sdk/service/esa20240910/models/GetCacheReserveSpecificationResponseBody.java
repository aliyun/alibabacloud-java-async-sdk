// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetCacheReserveSpecificationResponseBody} extends {@link TeaModel}
 *
 * <p>GetCacheReserveSpecificationResponseBody</p>
 */
public class GetCacheReserveSpecificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CacheReserveCapacity")
    private java.util.List<String> cacheReserveCapacity;

    @com.aliyun.core.annotation.NameInMap("CacheReserveRegion")
    private java.util.List<String> cacheReserveRegion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCacheReserveSpecificationResponseBody(Builder builder) {
        this.cacheReserveCapacity = builder.cacheReserveCapacity;
        this.cacheReserveRegion = builder.cacheReserveRegion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCacheReserveSpecificationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheReserveCapacity
     */
    public java.util.List<String> getCacheReserveCapacity() {
        return this.cacheReserveCapacity;
    }

    /**
     * @return cacheReserveRegion
     */
    public java.util.List<String> getCacheReserveRegion() {
        return this.cacheReserveRegion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> cacheReserveCapacity; 
        private java.util.List<String> cacheReserveRegion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCacheReserveSpecificationResponseBody model) {
            this.cacheReserveCapacity = model.cacheReserveCapacity;
            this.cacheReserveRegion = model.cacheReserveRegion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of cache retention capacity specifications.</p>
         */
        public Builder cacheReserveCapacity(java.util.List<String> cacheReserveCapacity) {
            this.cacheReserveCapacity = cacheReserveCapacity;
            return this;
        }

        /**
         * <p>List of cache retention region specifications.</p>
         */
        public Builder cacheReserveRegion(java.util.List<String> cacheReserveRegion) {
            this.cacheReserveRegion = cacheReserveRegion;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCacheReserveSpecificationResponseBody build() {
            return new GetCacheReserveSpecificationResponseBody(this);
        } 

    } 

}
