// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchRobotSmartCallResponseBody} extends {@link TeaModel}
 *
 * <p>BatchRobotSmartCallResponseBody</p>
 */
public class BatchRobotSmartCallResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private BatchRobotSmartCallResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRobotSmartCallResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String taskId; 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The unique ID of the robocall task. You can call the <a href="https://help.aliyun.com/document_detail/393537.html">QueryCallDetailByTaskId</a> operation to query the details of the task based on the task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4001112222</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public BatchRobotSmartCallResponseBody build() {
            return new BatchRobotSmartCallResponseBody(this);
        } 

    } 

}
