// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link UpdateWorkerResourceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWorkerResourceStatusResponseBody</p>
 */
public class UpdateWorkerResourceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateWorkerResourceStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkerResourceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Object data; 
        private String requestId; 

        /**
         * <p>The response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789ABC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateWorkerResourceStatusResponseBody build() {
            return new UpdateWorkerResourceStatusResponseBody(this);
        } 

    } 

}
