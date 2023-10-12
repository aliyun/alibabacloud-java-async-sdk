// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOsVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOsVersionResponseBody</p>
 */
public class CreateOsVersionResponseBody extends TeaModel {
    @NameInMap("OsVersionId")
    private String osVersionId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateOsVersionResponseBody(Builder builder) {
        this.osVersionId = builder.osVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOsVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return osVersionId
     */
    public String getOsVersionId() {
        return this.osVersionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String osVersionId; 
        private String requestId; 

        /**
         * OsVersionId.
         */
        public Builder osVersionId(String osVersionId) {
            this.osVersionId = osVersionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOsVersionResponseBody build() {
            return new CreateOsVersionResponseBody(this);
        } 

    } 

}
