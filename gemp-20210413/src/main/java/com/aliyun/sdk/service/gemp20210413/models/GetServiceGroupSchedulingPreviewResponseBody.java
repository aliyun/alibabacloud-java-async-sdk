// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupSchedulingPreviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceGroupSchedulingPreviewResponseBody</p>
 */
public class GetServiceGroupSchedulingPreviewResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.Map < String, ? > data;

    @NameInMap("requestId")
    private String requestId;

    private GetServiceGroupSchedulingPreviewResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceGroupSchedulingPreviewResponseBody create() {
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
         * data.
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

        public GetServiceGroupSchedulingPreviewResponseBody build() {
            return new GetServiceGroupSchedulingPreviewResponseBody(this);
        } 

    } 

}
