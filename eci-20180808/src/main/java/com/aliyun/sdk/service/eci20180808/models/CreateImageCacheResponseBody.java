// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

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
    @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
    private String containerGroupId;

    @com.aliyun.core.annotation.NameInMap("ImageCacheId")
    private String imageCacheId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateImageCacheResponseBody model) {
            this.containerGroupId = model.containerGroupId;
            this.imageCacheId = model.imageCacheId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the intermediate elastic container instance that is used to create the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-2zebxkiifuyzzlhl****</p>
         */
        public Builder containerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * <p>The ID of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>imc-2zebxkiifuyzzlhl****</p>
         */
        public Builder imageCacheId(String imageCacheId) {
            this.imageCacheId = imageCacheId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0E234675-3465-4CC3-9D0F-9A864BC391DD</p>
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
