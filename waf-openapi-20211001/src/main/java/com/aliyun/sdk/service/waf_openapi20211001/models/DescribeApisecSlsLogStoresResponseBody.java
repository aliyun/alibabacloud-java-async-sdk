// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApisecSlsLogStoresResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecSlsLogStoresResponseBody</p>
 */
public class DescribeApisecSlsLogStoresResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogStores")
    private java.util.List < String > logStores;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApisecSlsLogStoresResponseBody(Builder builder) {
        this.logStores = builder.logStores;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecSlsLogStoresResponseBody create() {
        return builder().build();
    }

    /**
     * @return logStores
     */
    public java.util.List < String > getLogStores() {
        return this.logStores;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > logStores; 
        private String requestId; 

        /**
         * <p>The names of the Logstores in Simple Log Service.</p>
         */
        public Builder logStores(java.util.List < String > logStores) {
            this.logStores = logStores;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApisecSlsLogStoresResponseBody build() {
            return new DescribeApisecSlsLogStoresResponseBody(this);
        } 

    } 

}
