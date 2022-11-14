// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWsCustomizedChO2OResponseBody} extends {@link TeaModel}
 *
 * <p>GetWsCustomizedChO2OResponseBody</p>
 */
public class GetWsCustomizedChO2OResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    @NameInMap("RequestId")
    private String requestId;

    private GetWsCustomizedChO2OResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWsCustomizedChO2OResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(String data) {
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

        public GetWsCustomizedChO2OResponseBody build() {
            return new GetWsCustomizedChO2OResponseBody(this);
        } 

    } 

}
