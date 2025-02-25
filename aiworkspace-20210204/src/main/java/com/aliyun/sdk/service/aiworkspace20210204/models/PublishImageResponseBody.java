// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PublishImageResponseBody} extends {@link TeaModel}
 *
 * <p>PublishImageResponseBody</p>
 */
public class PublishImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PublishImageResponseBody(Builder builder) {
        this.imageId = builder.imageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishImageResponseBody create() {
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
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PublishImageResponseBody build() {
            return new PublishImageResponseBody(this);
        } 

    } 

}
