// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileProtectEventCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectEventCountResponseBody</p>
 */
public class GetFileProtectEventCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Integer data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileProtectEventCountResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectEventCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Integer getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer data; 
        private String requestId; 

        /**
         * The data returned if the request is successful.
         */
        public Builder data(Integer data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileProtectEventCountResponseBody build() {
            return new GetFileProtectEventCountResponseBody(this);
        } 

    } 

}
