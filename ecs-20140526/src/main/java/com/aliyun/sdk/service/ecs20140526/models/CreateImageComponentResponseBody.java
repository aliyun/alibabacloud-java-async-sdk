// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageComponentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateImageComponentResponseBody</p>
 */
public class CreateImageComponentResponseBody extends TeaModel {
    @NameInMap("ImageComponentId")
    private String imageComponentId;

    @NameInMap("RequestId")
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
         * ImageComponentId.
         */
        public Builder imageComponentId(String imageComponentId) {
            this.imageComponentId = imageComponentId;
            return this;
        }

        /**
         * RequestId.
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
