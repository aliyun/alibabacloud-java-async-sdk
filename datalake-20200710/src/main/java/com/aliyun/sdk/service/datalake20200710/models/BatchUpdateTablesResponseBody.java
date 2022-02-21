// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdateTablesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchUpdateTablesResponseBody</p>
 */
public class BatchUpdateTablesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TableErrors")
    private java.util.List < TableError > tableErrors;

    @NameInMap("TaskId")
    private String taskId;

    private BatchUpdateTablesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableErrors = builder.tableErrors;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateTablesResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tableErrors
     */
    public java.util.List < TableError > getTableErrors() {
        return this.tableErrors;
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
        private Boolean success; 
        private java.util.List < TableError > tableErrors; 
        private String taskId; 

        /**
         * 响应代码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 响应消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 表出错信息
         */
        public Builder tableErrors(java.util.List < TableError > tableErrors) {
            this.tableErrors = tableErrors;
            return this;
        }

        /**
         * 异步更新 taskId
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public BatchUpdateTablesResponseBody build() {
            return new BatchUpdateTablesResponseBody(this);
        } 

    } 

}
