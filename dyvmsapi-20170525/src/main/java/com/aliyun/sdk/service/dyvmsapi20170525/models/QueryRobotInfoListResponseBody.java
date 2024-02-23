// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRobotInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRobotInfoListResponseBody</p>
 */
public class QueryRobotInfoListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryRobotInfoListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRobotInfoListResponseBody create() {
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
         * The basic information about the robot, in the JSON format. The basic information contains the following parameters:
         * <p>
         * 
         * *   **id**: the robot ID.
         * *   **robotName**: the robot name.
         * *   **robotType**: the robot type.
         * *   **auditStatus**: the review state.
         * *   **gmtCreate**: the time when the task was created.
         * *   **gmtModified**: the time when the task was modified.
         * *   **partnerId**: the partner ID.
         * *   **asrId**: the ID of the automatic speech recognition (ASR) model.
         * *   **asrType**: the ASR type. Valid values: **Public** and **Private**.
         * *   **remark**: the additional information.
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

        public QueryRobotInfoListResponseBody build() {
            return new QueryRobotInfoListResponseBody(this);
        } 

    } 

}
