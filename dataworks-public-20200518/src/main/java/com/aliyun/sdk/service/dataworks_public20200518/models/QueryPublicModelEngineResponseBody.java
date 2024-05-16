// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPublicModelEngineResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPublicModelEngineResponseBody</p>
 */
public class QueryPublicModelEngineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReturnValue")
    private java.util.List < java.util.Map<String, ?>> returnValue;

    private QueryPublicModelEngineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.returnValue = builder.returnValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPublicModelEngineResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return returnValue
     */
    public java.util.List < java.util.Map<String, ?>> getReturnValue() {
        return this.returnValue;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < java.util.Map<String, ?>> returnValue; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReturnValue.
         */
        public Builder returnValue(java.util.List < java.util.Map<String, ?>> returnValue) {
            this.returnValue = returnValue;
            return this;
        }

        public QueryPublicModelEngineResponseBody build() {
            return new QueryPublicModelEngineResponseBody(this);
        } 

    } 

}
