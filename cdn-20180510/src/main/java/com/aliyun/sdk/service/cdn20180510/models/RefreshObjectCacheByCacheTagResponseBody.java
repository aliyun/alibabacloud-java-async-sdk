// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshObjectCacheByCacheTagResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshObjectCacheByCacheTagResponseBody</p>
 */
public class RefreshObjectCacheByCacheTagResponseBody extends TeaModel {
    @NameInMap("RefreshTaskId")
    private String refreshTaskId;

    @NameInMap("RequestId")
    private String requestId;

    private RefreshObjectCacheByCacheTagResponseBody(Builder builder) {
        this.refreshTaskId = builder.refreshTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshObjectCacheByCacheTagResponseBody create() {
        return builder().build();
    }

    /**
     * @return refreshTaskId
     */
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String refreshTaskId; 
        private String requestId; 

        /**
         * RefreshTaskId.
         */
        public Builder refreshTaskId(String refreshTaskId) {
            this.refreshTaskId = refreshTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshObjectCacheByCacheTagResponseBody build() {
            return new RefreshObjectCacheByCacheTagResponseBody(this);
        } 

    } 

}
