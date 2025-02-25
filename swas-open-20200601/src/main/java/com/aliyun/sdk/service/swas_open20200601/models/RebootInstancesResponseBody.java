// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link RebootInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>RebootInstancesResponseBody</p>
 */
public class RebootInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RebootInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RebootInstancesResponseBody build() {
            return new RebootInstancesResponseBody(this);
        } 

    } 

}
