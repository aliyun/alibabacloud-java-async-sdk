// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link UpdateApiMcpServerResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApiMcpServerResponseBody</p>
 */
public class UpdateApiMcpServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateApiMcpServerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiMcpServerResponseBody create() {
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

        private Builder(UpdateApiMcpServerResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateApiMcpServerResponseBody build() {
            return new UpdateApiMcpServerResponseBody(this);
        } 

    } 

}
