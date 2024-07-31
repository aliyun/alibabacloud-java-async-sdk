// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocatePublicConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>AllocatePublicConnectionResponseBody</p>
 */
public class AllocatePublicConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PublicConnection")
    private String publicConnection;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AllocatePublicConnectionResponseBody(Builder builder) {
        this.publicConnection = builder.publicConnection;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocatePublicConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return publicConnection
     */
    public String getPublicConnection() {
        return this.publicConnection;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String publicConnection; 
        private String requestId; 

        /**
         * The public endpoint that is assigned to the Simple Database Service instance.
         */
        public Builder publicConnection(String publicConnection) {
            this.publicConnection = publicConnection;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocatePublicConnectionResponseBody build() {
            return new AllocatePublicConnectionResponseBody(this);
        } 

    } 

}
