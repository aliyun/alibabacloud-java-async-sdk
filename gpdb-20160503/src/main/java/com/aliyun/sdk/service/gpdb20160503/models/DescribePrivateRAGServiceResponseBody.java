// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePrivateRAGServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrivateRAGServiceResponseBody</p>
 */
public class DescribePrivateRAGServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CaCert")
    private String caCert;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePrivateRAGServiceResponseBody(Builder builder) {
        this.caCert = builder.caCert;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrivateRAGServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCert
     */
    public String getCaCert() {
        return this.caCert;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String caCert; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePrivateRAGServiceResponseBody model) {
            this.caCert = model.caCert;
            this.requestId = model.requestId;
        } 

        /**
         * CaCert.
         */
        public Builder caCert(String caCert) {
            this.caCert = caCert;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePrivateRAGServiceResponseBody build() {
            return new DescribePrivateRAGServiceResponseBody(this);
        } 

    } 

}
