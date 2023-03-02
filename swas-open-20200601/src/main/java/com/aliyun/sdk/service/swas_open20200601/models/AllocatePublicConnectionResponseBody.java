// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocatePublicConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>AllocatePublicConnectionResponseBody</p>
 */
public class AllocatePublicConnectionResponseBody extends TeaModel {
    @NameInMap("PublicConnection")
    private String publicConnection;

    @NameInMap("RequestId")
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
         * PublicConnection.
         */
        public Builder publicConnection(String publicConnection) {
            this.publicConnection = publicConnection;
            return this;
        }

        /**
         * Id of the request
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
