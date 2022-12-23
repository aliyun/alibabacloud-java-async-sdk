// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreloadVodObjectCachesResponseBody} extends {@link TeaModel}
 *
 * <p>PreloadVodObjectCachesResponseBody</p>
 */
public class PreloadVodObjectCachesResponseBody extends TeaModel {
    @NameInMap("PreloadTaskId")
    private String preloadTaskId;

    @NameInMap("RequestId")
    private String requestId;

    private PreloadVodObjectCachesResponseBody(Builder builder) {
        this.preloadTaskId = builder.preloadTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadVodObjectCachesResponseBody create() {
        return builder().build();
    }

    /**
     * @return preloadTaskId
     */
    public String getPreloadTaskId() {
        return this.preloadTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String preloadTaskId; 
        private String requestId; 

        /**
         * The ID of the prefetch task. Separate multiple task IDs with commas (,).
         */
        public Builder preloadTaskId(String preloadTaskId) {
            this.preloadTaskId = preloadTaskId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreloadVodObjectCachesResponseBody build() {
            return new PreloadVodObjectCachesResponseBody(this);
        } 

    } 

}
