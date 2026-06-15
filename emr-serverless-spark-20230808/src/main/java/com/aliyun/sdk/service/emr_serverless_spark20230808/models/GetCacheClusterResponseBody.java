// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetCacheClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetCacheClusterResponseBody</p>
 */
public class GetCacheClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cacheClusters")
    private CacheCluster cacheClusters;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetCacheClusterResponseBody(Builder builder) {
        this.cacheClusters = builder.cacheClusters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCacheClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheClusters
     */
    public CacheCluster getCacheClusters() {
        return this.cacheClusters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CacheCluster cacheClusters; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCacheClusterResponseBody model) {
            this.cacheClusters = model.cacheClusters;
            this.requestId = model.requestId;
        } 

        /**
         * cacheClusters.
         */
        public Builder cacheClusters(CacheCluster cacheClusters) {
            this.cacheClusters = cacheClusters;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCacheClusterResponseBody build() {
            return new GetCacheClusterResponseBody(this);
        } 

    } 

}
