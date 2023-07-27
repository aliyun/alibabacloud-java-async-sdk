// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkAppInfoResponseBody</p>
 */
public class GetSparkAppInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private SparkAppInfo data;

    @NameInMap("RequestId")
    private String requestId;

    private GetSparkAppInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public SparkAppInfo getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private SparkAppInfo data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(SparkAppInfo data) {
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

        public GetSparkAppInfoResponseBody build() {
            return new GetSparkAppInfoResponseBody(this);
        } 

    } 

}
