// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCheckResultWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>AddCheckResultWhiteListResponseBody</p>
 */
public class AddCheckResultWhiteListResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.Map < String, ? > data;

    @NameInMap("RequestId")
    private String requestId;

    private AddCheckResultWhiteListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCheckResultWhiteListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.Map < String, ? > getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, ? > data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.Map < String, ? > data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCheckResultWhiteListResponseBody build() {
            return new AddCheckResultWhiteListResponseBody(this);
        } 

    } 

}
