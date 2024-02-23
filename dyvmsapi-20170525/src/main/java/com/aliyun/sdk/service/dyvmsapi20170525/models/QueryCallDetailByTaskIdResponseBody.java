// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCallDetailByTaskIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCallDetailByTaskIdResponseBody</p>
 */
public class QueryCallDetailByTaskIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryCallDetailByTaskIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallDetailByTaskIdResponseBody create() {
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
         * The call details of the outbound robocall task, in the JSON format.
         * <p>
         * 
         * *   **startDate**: the time when the call was answered.
         * 
         * *   **stateDesc**: the reason why the call was hung up. If the status code of early media was returned, this parameter indicates the reason why the status code of early media was used.
         * 
         * *   **statusCode**: the status code.
         * 
         * *   **EndDate**: the time when the call was ended.
         * 
         * *   **calleeShowNumber**: the calling number displayed to the called party.
         * 
         * *   **callee**: the called number.
         * 
         * *   **duration**: the billing duration.
         * 
         * *   **gmtCreate**: the time when the outbound robocall task was created.
         * 
         * *   **hangupDirection**: the party who hung up.
         * 
         * *   **tags**: the call tags.
         * 
         * *   **dialogCount**: the number of conversation rounds in the call.
         * 
         * *   **sureCount**: the number of times that the robocall task was acknowledged.
         * 
         * *   **denyCount**: the number of times that the robocall task was denied.
         * 
         * *   **rejectCount**: the number of times that the robocall task was rejected.
         * 
         * *   **customCount**: the number of times that the robocall task was customized.
         * 
         * *   **knowledgeCount**: the number of times that the knowledge base was queried.
         * 
         * *   **recordFile**: the download URL of the recording file. The URL is valid only for 48 hours. The recording file must be downloaded in time.
         * 
         * *   **callId**: the call ID.
         * 
         * *   **recordStatus**: indicates whether a recording file was available. Valid values:
         * 
         *     *   1: A recording file was available.
         *     *   2: No recording file was available.
         * 
         * *   **knowledgeCommonCount**: the number of call failures caused by the common issues in the knowledge base.
         * 
         * *   **knowledgeBusinessCount**: the number of call failures caused by the business issues in the knowledge base.
         * 
         * *   **callee**: the called number.
         * 
         * *   **dialogDetail**: the conversation details. The value is a JSON array that contains the following parameters:
         * 
         *     *   **role**: the role who spoke.
         *     *   **content**: the content of the speech.
         *     *   **time**: the start time of the speech.
         * 
         * > The preceding parameters are for reference only. The actually returned parameters prevail.
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

        public QueryCallDetailByTaskIdResponseBody build() {
            return new QueryCallDetailByTaskIdResponseBody(this);
        } 

    } 

}
