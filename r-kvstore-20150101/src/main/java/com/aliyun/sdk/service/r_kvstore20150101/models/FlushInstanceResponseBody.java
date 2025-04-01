// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link FlushInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>FlushInstanceResponseBody</p>
 */
public class FlushInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private FlushInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlushInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(FlushInstanceResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The operation that you want to perform. Set the value to <strong>FlushInstance</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>8D0C0AFC-E9CD-47A4-8395-5C31BF9B3E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FlushInstanceResponseBody build() {
            return new FlushInstanceResponseBody(this);
        } 

    } 

}
