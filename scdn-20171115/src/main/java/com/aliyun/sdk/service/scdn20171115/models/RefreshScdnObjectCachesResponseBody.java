// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshScdnObjectCachesResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshScdnObjectCachesResponseBody</p>
 */
public class RefreshScdnObjectCachesResponseBody extends TeaModel {
    @NameInMap("RefreshTaskId")
    private String refreshTaskId;

    @NameInMap("RequestId")
    private String requestId;

    private RefreshScdnObjectCachesResponseBody(Builder builder) {
        this.refreshTaskId = builder.refreshTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshScdnObjectCachesResponseBody create() {
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

        public RefreshScdnObjectCachesResponseBody build() {
            return new RefreshScdnObjectCachesResponseBody(this);
        } 

    } 

}
