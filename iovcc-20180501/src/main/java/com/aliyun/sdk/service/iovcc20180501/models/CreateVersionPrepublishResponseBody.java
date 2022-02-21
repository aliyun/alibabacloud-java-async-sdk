// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVersionPrepublishResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVersionPrepublishResponseBody</p>
 */
public class CreateVersionPrepublishResponseBody extends TeaModel {
    @NameInMap("PrepublishId")
    private String prepublishId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateVersionPrepublishResponseBody(Builder builder) {
        this.prepublishId = builder.prepublishId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVersionPrepublishResponseBody create() {
        return builder().build();
    }

    /**
     * @return prepublishId
     */
    public String getPrepublishId() {
        return this.prepublishId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String prepublishId; 
        private String requestId; 

        /**
         * PrepublishId.
         */
        public Builder prepublishId(String prepublishId) {
            this.prepublishId = prepublishId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateVersionPrepublishResponseBody build() {
            return new CreateVersionPrepublishResponseBody(this);
        } 

    } 

}
