// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link ListIndicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndicesResponseBody</p>
 */
public class ListIndicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<?> result;

    private ListIndicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<?> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<?> result; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8C85CCB3-C0C9-521C-B599-F903E14A8793</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<?> result) {
            this.result = result;
            return this;
        }

        public ListIndicesResponseBody build() {
            return new ListIndicesResponseBody(this);
        } 

    } 

}
