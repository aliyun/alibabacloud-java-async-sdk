// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link DeleteTensorboardResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTensorboardResponseBody</p>
 */
public class DeleteTensorboardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TensorboardId")
    private String tensorboardId;

    private DeleteTensorboardResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tensorboardId = builder.tensorboardId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTensorboardResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tensorboardId
     */
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    public static final class Builder {
        private String requestId; 
        private String tensorboardId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TensorboardId.
         */
        public Builder tensorboardId(String tensorboardId) {
            this.tensorboardId = tensorboardId;
            return this;
        }

        public DeleteTensorboardResponseBody build() {
            return new DeleteTensorboardResponseBody(this);
        } 

    } 

}
