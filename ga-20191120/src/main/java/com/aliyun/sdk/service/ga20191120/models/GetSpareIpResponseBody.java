// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpareIpResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpareIpResponseBody</p>
 */
public class GetSpareIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    private GetSpareIpResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpareIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String requestId; 
        private String state; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the secondary IP address. Valid values:
         * <p>
         * 
         * *   **active:** The secondary IP address is available.
         * *   **inuse:** The secondary IP address is in use.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public GetSpareIpResponseBody build() {
            return new GetSpareIpResponseBody(this);
        } 

    } 

}
