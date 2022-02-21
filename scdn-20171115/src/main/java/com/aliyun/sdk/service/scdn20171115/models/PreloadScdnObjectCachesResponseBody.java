// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreloadScdnObjectCachesResponseBody} extends {@link TeaModel}
 *
 * <p>PreloadScdnObjectCachesResponseBody</p>
 */
public class PreloadScdnObjectCachesResponseBody extends TeaModel {
    @NameInMap("PreloadTaskId")
    private String preloadTaskId;

    @NameInMap("RequestId")
    private String requestId;

    private PreloadScdnObjectCachesResponseBody(Builder builder) {
        this.preloadTaskId = builder.preloadTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadScdnObjectCachesResponseBody create() {
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
         * PreloadTaskId.
         */
        public Builder preloadTaskId(String preloadTaskId) {
            this.preloadTaskId = preloadTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreloadScdnObjectCachesResponseBody build() {
            return new PreloadScdnObjectCachesResponseBody(this);
        } 

    } 

}
