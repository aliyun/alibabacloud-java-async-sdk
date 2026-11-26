// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link RemoveDeviceBelongIdentifiersResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveDeviceBelongIdentifiersResponseBody</p>
 */
public class RemoveDeviceBelongIdentifiersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RemoveDeviceBelongIdentifiersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveDeviceBelongIdentifiersResponseBody create() {
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

        private Builder(RemoveDeviceBelongIdentifiersResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID, which can be used to locate the call.</p>
         * 
         * <strong>example:</strong>
         * <p>7A92B549-EC82-5F79-8301-63711AFC9DCE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveDeviceBelongIdentifiersResponseBody build() {
            return new RemoveDeviceBelongIdentifiersResponseBody(this);
        } 

    } 

}
