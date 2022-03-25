// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageCacheResponseBody} extends {@link TeaModel}
 *
 * <p>CreateImageCacheResponseBody</p>
 */
public class CreateImageCacheResponseBody extends TeaModel {
    @NameInMap("ContainerGroupId")
    private String containerGroupId;

    @NameInMap("ImageCacheId")
    private String imageCacheId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateImageCacheResponseBody(Builder builder) {
        this.containerGroupId = builder.containerGroupId;
        this.imageCacheId = builder.imageCacheId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageCacheResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerGroupId
     */
    public String getContainerGroupId() {
        return this.containerGroupId;
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
        private String containerGroupId; 
        private String imageCacheId; 
        private String requestId; 

        /**
         * ContainerGroupId.
         */
        public Builder containerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
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
