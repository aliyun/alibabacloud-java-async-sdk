// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkPathResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkPathResponseBody</p>
 */
public class CreateNetworkPathResponseBody extends TeaModel {
    @NameInMap("NetworkPathId")
    private String networkPathId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateNetworkPathResponseBody(Builder builder) {
        this.networkPathId = builder.networkPathId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkPathResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkPathId
     */
    public String getNetworkPathId() {
        return this.networkPathId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String networkPathId; 
        private String requestId; 

        /**
         * The ID of the network path.
         */
        public Builder networkPathId(String networkPathId) {
            this.networkPathId = networkPathId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkPathResponseBody build() {
            return new CreateNetworkPathResponseBody(this);
        } 

    } 

}
