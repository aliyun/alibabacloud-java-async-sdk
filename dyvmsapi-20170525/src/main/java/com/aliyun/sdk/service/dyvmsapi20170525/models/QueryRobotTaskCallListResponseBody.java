// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRobotTaskCallListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRobotTaskCallListResponseBody</p>
 */
public class QueryRobotTaskCallListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryRobotTaskCallListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRobotTaskCallListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   For more information about other response codes, see [API error codes](~~112502~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the robocall task, which is a JSON-formatted array.
         * <p>
         * 
         * *   **taskId**: the unique ID of the robocall task.
         * *   **caller**: the calling number.
         * *   **called**: the called number.
         * *   **duration**: the call duration. Unit: seconds.
         * *   **label**: the label of the called party.
         * *   **dialogCount**: the number of conversation rounds in the call.
         * *   **callResult**: the call result.
         * *   **hangupDirection**: the party who hung up. Valid values: **1** and **0**. The value 1 indicates the called party, and the value 0 indicates the robot.
         * *   **transferResult**: the result of transferring the call to an agent. Valid values: **1**, **0**, and **3**. The value 1 indicates that the call was transferred to an agent. The value 0 indicates that the call failed to be transferred to an agent. The value 3 indicates that the call was not transferred to an agent.
         * *   **transferNumber**: the phone number of the agent to whom the call was transferred.
         * *   **transferFailReason**: the reason why the call failed to be transferred to an agent.
         * *   **callId**: the unique receipt ID of the call.
         * *   **recallCurTimes**: the number of recalls.
         * *   **callStartTime**: the start time of the call.
         * *   **callEndTime**: the end time of the call.
         * *   **sureCount**: the number of times that the robocall task was acknowledged.
         * *   **denyCount**: the number of times that the robocall task was denied.
         * *   **rejectCount**: the number of times that the robocall task was rejected.
         * *   **customCount**: the number of times that the robocall task was customized.
         * *   **knowledgeCount**: the number of times that the knowledge base was queried.
         * *   **defaultCount**: the default number of calls.
         * *   **knowledgeBusinessCount**: the number of call failures caused by the business issues in the knowledge base.
         * *   **knowledgeCommonCount**: the number of call failures caused by the common issues in the knowledge base.
         * *   ****
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryRobotTaskCallListResponseBody build() {
            return new QueryRobotTaskCallListResponseBody(this);
        } 

    } 

}
