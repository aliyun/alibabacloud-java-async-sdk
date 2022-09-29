// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIpfilterResponseBody} extends {@link TeaModel}
 *
 * <p>AddIpfilterResponseBody</p>
 */
public class AddIpfilterResponseBody extends TeaModel {
    @NameInMap("IpFilterId")
    private String ipFilterId;

    @NameInMap("RequestId")
    private String requestId;

    private AddIpfilterResponseBody(Builder builder) {
        this.ipFilterId = builder.ipFilterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpfilterResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipFilterId
     */
    public String getIpFilterId() {
        return this.ipFilterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipFilterId; 
        private String requestId; 

        /**
         * IpFilterId.
         */
        public Builder ipFilterId(String ipFilterId) {
            this.ipFilterId = ipFilterId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddIpfilterResponseBody build() {
            return new AddIpfilterResponseBody(this);
        } 

    } 

}
