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
 * {@link StartTensorboardResponseBody} extends {@link TeaModel}
 *
 * <p>StartTensorboardResponseBody</p>
 */
public class StartTensorboardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TensorboardId")
    private String tensorboardId;

    private StartTensorboardResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tensorboardId = builder.tensorboardId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartTensorboardResponseBody create() {
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
     * @return tensorboardId
     */
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    public static final class Builder {
        private String requestId; 
        private String tensorboardId; 

        private Builder() {
        } 

        private Builder(StartTensorboardResponseBody model) {
            this.requestId = model.requestId;
            this.tensorboardId = model.tensorboardId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The TensorBoard instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tensorboard-20210114104214-vf9lowjt3pso</p>
         */
        public Builder tensorboardId(String tensorboardId) {
            this.tensorboardId = tensorboardId;
            return this;
        }

        public StartTensorboardResponseBody build() {
            return new StartTensorboardResponseBody(this);
        } 

    } 

}
