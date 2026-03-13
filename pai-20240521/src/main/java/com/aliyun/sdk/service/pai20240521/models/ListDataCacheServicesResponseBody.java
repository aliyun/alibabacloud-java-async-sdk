// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai20240521.models;

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
 * {@link ListDataCacheServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCacheServicesResponseBody</p>
 */
public class ListDataCacheServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CacheServices")
    private java.util.List<CacheService> cacheServices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDataCacheServicesResponseBody(Builder builder) {
        this.cacheServices = builder.cacheServices;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCacheServicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheServices
     */
    public java.util.List<CacheService> getCacheServices() {
        return this.cacheServices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CacheService> cacheServices; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListDataCacheServicesResponseBody model) {
            this.cacheServices = model.cacheServices;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CacheServices.
         */
        public Builder cacheServices(java.util.List<CacheService> cacheServices) {
            this.cacheServices = cacheServices;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataCacheServicesResponseBody build() {
            return new ListDataCacheServicesResponseBody(this);
        } 

    } 

}
