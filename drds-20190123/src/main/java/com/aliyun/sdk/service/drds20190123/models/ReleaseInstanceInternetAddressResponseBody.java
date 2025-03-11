// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReleaseInstanceInternetAddressResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseInstanceInternetAddressResponseBody</p>
 */
public class ReleaseInstanceInternetAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Boolean data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The result returned by the current API.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FD17CD3C-3355-49E8-9231-FE2DB0******</p>
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
