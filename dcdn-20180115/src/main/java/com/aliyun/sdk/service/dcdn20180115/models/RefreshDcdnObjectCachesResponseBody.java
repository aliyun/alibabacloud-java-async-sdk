// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshDcdnObjectCachesResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshDcdnObjectCachesResponseBody</p>
 */
public class RefreshDcdnObjectCachesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RefreshTaskId")
    private String refreshTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RefreshDcdnObjectCachesResponseBody(Builder builder) {
        this.refreshTaskId = builder.refreshTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshDcdnObjectCachesResponseBody create() {
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
         * <p>The ID of the refresh task. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>95248880</p>
         */
        public Builder refreshTaskId(String refreshTaskId) {
            this.refreshTaskId = refreshTaskId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E5BD4B50-7A02-493A-AE0B-97B9024B4135</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshDcdnObjectCachesResponseBody build() {
            return new RefreshDcdnObjectCachesResponseBody(this);
        } 

    } 

}
