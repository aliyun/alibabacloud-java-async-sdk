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
 * {@link GetRenderingInstanceCommandsStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetRenderingInstanceCommandsStatusResponseBody</p>
 */
public class GetRenderingInstanceCommandsStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetRenderingInstanceCommandsStatusResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRenderingInstanceCommandsStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private String result; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetRenderingInstanceCommandsStatusResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
        } 

        /**
         * <p>The description. When Status is Failed, this field includes the cause of the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>conn failed!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The execution result string of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>Thu Jun 27 16:06:26 CST 2024</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The command execution status. Valid values:</p>
         * <ul>
         * <li>Doing: Executing.</li>
         * <li>Success: Succeeded.</li>
         * <li>Failed: Failed. Within the timeout period, the system automatically retries the command. You can continue to wait or initiate a new request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetRenderingInstanceCommandsStatusResponseBody build() {
            return new GetRenderingInstanceCommandsStatusResponseBody(this);
        } 

    } 

}
