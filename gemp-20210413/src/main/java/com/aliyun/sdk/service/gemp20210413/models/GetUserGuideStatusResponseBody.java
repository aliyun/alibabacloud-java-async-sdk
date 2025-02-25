// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserGuideStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserGuideStatusResponseBody</p>
 */
public class GetUserGuideStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.Map < String, ? > data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetUserGuideStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserGuideStatusResponseBody create() {
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
         * map
         */
        public Builder data(java.util.Map < String, ? > data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserGuideStatusResponseBody build() {
            return new GetUserGuideStatusResponseBody(this);
        } 

    } 

}
