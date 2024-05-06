// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressCloudConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExpressCloudConnectionResponseBody</p>
 */
public class CreateExpressCloudConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EccId")
    private String eccId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateExpressCloudConnectionResponseBody(Builder builder) {
        this.eccId = builder.eccId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressCloudConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return eccId
     */
    public String getEccId() {
        return this.eccId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String eccId; 
        private String requestId; 

        /**
         * The ID of the ECC instance.
         */
        public Builder eccId(String eccId) {
            this.eccId = eccId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateExpressCloudConnectionResponseBody build() {
            return new CreateExpressCloudConnectionResponseBody(this);
        } 

    } 

}
