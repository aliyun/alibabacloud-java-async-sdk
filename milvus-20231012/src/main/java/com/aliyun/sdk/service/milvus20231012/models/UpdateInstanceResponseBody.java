// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link UpdateInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateInstanceResponseBody</p>
 */
public class UpdateInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Boolean data;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdateInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
        this.orderId = builder.orderId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceResponseBody create() {
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

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean data; 
        private String orderId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateInstanceResponseBody model) {
            this.requestId = model.requestId;
            this.data = model.data;
            this.orderId = model.orderId;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * orderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateInstanceResponseBody build() {
            return new UpdateInstanceResponseBody(this);
        } 

    } 

}
