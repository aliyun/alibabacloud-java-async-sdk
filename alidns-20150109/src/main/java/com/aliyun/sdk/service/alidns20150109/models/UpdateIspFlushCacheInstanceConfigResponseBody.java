// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIspFlushCacheInstanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateIspFlushCacheInstanceConfigResponseBody</p>
 */
public class UpdateIspFlushCacheInstanceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateIspFlushCacheInstanceConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIspFlushCacheInstanceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateIspFlushCacheInstanceConfigResponseBody build() {
            return new UpdateIspFlushCacheInstanceConfigResponseBody(this);
        } 

    } 

}
