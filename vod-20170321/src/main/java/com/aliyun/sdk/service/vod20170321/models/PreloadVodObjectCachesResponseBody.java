// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link PreloadVodObjectCachesResponseBody} extends {@link TeaModel}
 *
 * <p>PreloadVodObjectCachesResponseBody</p>
 */
public class PreloadVodObjectCachesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PreloadTaskId")
    private String preloadTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(PreloadVodObjectCachesResponseBody model) {
            this.preloadTaskId = model.preloadTaskId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the prefetch task. Separate multiple task IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>9524****</p>
         */
        public Builder preloadTaskId(String preloadTaskId) {
            this.preloadTaskId = preloadTaskId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E5BD4B50-7A02-493A-*****-97B9024B4135</p>
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
