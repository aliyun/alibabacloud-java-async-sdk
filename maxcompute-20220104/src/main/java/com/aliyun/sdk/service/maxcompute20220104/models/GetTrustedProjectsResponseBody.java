// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrustedProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrustedProjectsResponseBody</p>
 */
public class GetTrustedProjectsResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < String > data;

    @NameInMap("requestId")
    private String requestId;

    private GetTrustedProjectsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrustedProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < String > getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > data; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(java.util.List < String > data) {
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

        public GetTrustedProjectsResponseBody build() {
            return new GetTrustedProjectsResponseBody(this);
        } 

    } 

}
