// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link SendRenderingInstanceCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>SendRenderingInstanceCommandsResponseBody</p>
 */
public class SendRenderingInstanceCommandsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CmdId")
    private String cmdId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    private SendRenderingInstanceCommandsResponseBody(Builder builder) {
        this.cmdId = builder.cmdId;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendRenderingInstanceCommandsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cmdId
     */
    public String getCmdId() {
        return this.cmdId;
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
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String cmdId; 
        private String requestId; 
        private String result; 

        private Builder() {
        } 

        private Builder(SendRenderingInstanceCommandsResponseBody model) {
            this.cmdId = model.cmdId;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * CmdId.
         */
        public Builder cmdId(String cmdId) {
            this.cmdId = cmdId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public SendRenderingInstanceCommandsResponseBody build() {
            return new SendRenderingInstanceCommandsResponseBody(this);
        } 

    } 

}
