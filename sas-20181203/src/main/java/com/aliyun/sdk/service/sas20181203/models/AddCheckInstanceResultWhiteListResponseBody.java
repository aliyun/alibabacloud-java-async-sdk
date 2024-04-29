// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCheckInstanceResultWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>AddCheckInstanceResultWhiteListResponseBody</p>
 */
public class AddCheckInstanceResultWhiteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map < String, ? > data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddCheckInstanceResultWhiteListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCheckInstanceResultWhiteListResponseBody create() {
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
         * The adding result.
         */
        public Builder data(java.util.Map < String, ? > data) {
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

        public AddCheckInstanceResultWhiteListResponseBody build() {
            return new AddCheckInstanceResultWhiteListResponseBody(this);
        } 

    } 

}
