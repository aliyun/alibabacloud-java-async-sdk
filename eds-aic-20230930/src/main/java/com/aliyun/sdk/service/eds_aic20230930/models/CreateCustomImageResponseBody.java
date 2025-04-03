// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateCustomImageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomImageResponseBody</p>
 */
public class CreateCustomImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCustomImageResponseBody(Builder builder) {
        this.imageId = builder.imageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateCustomImageResponseBody model) {
            this.imageId = model.imageId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-075cllfeuazh0****</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>20393E53-8FF1-524C-B494-B478A5369733</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomImageResponseBody build() {
            return new CreateCustomImageResponseBody(this);
        } 

    } 

}
