// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateImageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateImageResponseBody</p>
 */
public class CreateImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateImageResponseBody(Builder builder) {
        this.imageId = builder.imageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String imageId; 
        private String requestId; 

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp146shijn7hujku****</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C8B26B44-0189-443E-9816-*******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateImageResponseBody build() {
            return new CreateImageResponseBody(this);
        } 

    } 

}
