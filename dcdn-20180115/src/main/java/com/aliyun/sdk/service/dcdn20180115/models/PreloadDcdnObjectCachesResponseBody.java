// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PreloadDcdnObjectCachesResponseBody} extends {@link TeaModel}
 *
 * <p>PreloadDcdnObjectCachesResponseBody</p>
 */
public class PreloadDcdnObjectCachesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PreloadTaskId")
    private String preloadTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PreloadDcdnObjectCachesResponseBody(Builder builder) {
        this.preloadTaskId = builder.preloadTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadDcdnObjectCachesResponseBody create() {
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
         * <p>The ID of the prefetch task. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>95248880</p>
         */
        public Builder preloadTaskId(String preloadTaskId) {
            this.preloadTaskId = preloadTaskId;
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

        public PreloadDcdnObjectCachesResponseBody build() {
            return new PreloadDcdnObjectCachesResponseBody(this);
        } 

    } 

}
