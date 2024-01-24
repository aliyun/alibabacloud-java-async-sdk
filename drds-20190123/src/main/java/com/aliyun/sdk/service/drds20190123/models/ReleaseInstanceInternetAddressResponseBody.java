// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstanceInternetAddressResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseInstanceInternetAddressResponseBody</p>
 */
public class ReleaseInstanceInternetAddressResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("RequestId")
    private String requestId;

    private ReleaseInstanceInternetAddressResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseInstanceInternetAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private String requestId; 

        /**
         * The result returned by the current API.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReleaseInstanceInternetAddressResponseBody build() {
            return new ReleaseInstanceInternetAddressResponseBody(this);
        } 

    } 

}
