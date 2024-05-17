// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExtensionsResponseBody</p>
 */
public class CreateExtensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Extensions")
    private String extensions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateExtensionsResponseBody(Builder builder) {
        this.extensions = builder.extensions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExtensionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return extensions
     */
    public String getExtensions() {
        return this.extensions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String extensions; 
        private String requestId; 

        /**
         * Extensions.
         */
        public Builder extensions(String extensions) {
            this.extensions = extensions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateExtensionsResponseBody build() {
            return new CreateExtensionsResponseBody(this);
        } 

    } 

}
