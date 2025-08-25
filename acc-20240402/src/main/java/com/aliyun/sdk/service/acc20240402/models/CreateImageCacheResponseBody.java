// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acc20240402.models;

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
 * {@link CreateImageCacheResponseBody} extends {@link TeaModel}
 *
 * <p>CreateImageCacheResponseBody</p>
 */
public class CreateImageCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageCacheId")
    private String imageCacheId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateImageCacheResponseBody(Builder builder) {
        this.imageCacheId = builder.imageCacheId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageCacheResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageCacheId
     */
    public String getImageCacheId() {
        return this.imageCacheId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String imageCacheId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateImageCacheResponseBody model) {
            this.imageCacheId = model.imageCacheId;
            this.requestId = model.requestId;
        } 

        /**
         * ImageCacheId.
         */
        public Builder imageCacheId(String imageCacheId) {
            this.imageCacheId = imageCacheId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateImageCacheResponseBody build() {
            return new CreateImageCacheResponseBody(this);
        } 

    } 

}
