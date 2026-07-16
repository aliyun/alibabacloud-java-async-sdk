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
 * {@link GetCacheReserveResponseBody} extends {@link TeaModel}
 *
 * <p>GetCacheReserveResponseBody</p>
 */
public class GetCacheReserveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CacheReserveInstanceId")
    private String cacheReserveInstanceId;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCacheReserveResponseBody(Builder builder) {
        this.cacheReserveInstanceId = builder.cacheReserveInstanceId;
        this.enable = builder.enable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCacheReserveResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheReserveInstanceId
     */
    public String getCacheReserveInstanceId() {
        return this.cacheReserveInstanceId;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cacheReserveInstanceId; 
        private String enable; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCacheReserveResponseBody model) {
            this.cacheReserveInstanceId = model.cacheReserveInstanceId;
            this.enable = model.enable;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the cache reserve instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cr_hk_123456789</p>
         */
        public Builder cacheReserveInstanceId(String cacheReserveInstanceId) {
            this.cacheReserveInstanceId = cacheReserveInstanceId;
            return this;
        }

        /**
         * <p>Indicates whether cache reserve is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCacheReserveResponseBody build() {
            return new GetCacheReserveResponseBody(this);
        } 

    } 

}
