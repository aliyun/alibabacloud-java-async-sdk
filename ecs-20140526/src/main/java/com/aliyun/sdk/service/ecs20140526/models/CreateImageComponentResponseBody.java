// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageComponentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateImageComponentResponseBody</p>
 */
public class CreateImageComponentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageComponentId")
    private String imageComponentId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateImageComponentResponseBody(Builder builder) {
        this.imageComponentId = builder.imageComponentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageComponentResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageComponentId
     */
    public String getImageComponentId() {
        return this.imageComponentId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String imageComponentId; 
        private String requestId; 

        /**
         * The ID of the image component.
         */
        public Builder imageComponentId(String imageComponentId) {
            this.imageComponentId = imageComponentId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateImageComponentResponseBody build() {
            return new CreateImageComponentResponseBody(this);
        } 

    } 

}
