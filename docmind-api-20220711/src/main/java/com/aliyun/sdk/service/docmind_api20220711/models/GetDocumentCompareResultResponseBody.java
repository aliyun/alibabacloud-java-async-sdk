// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocumentCompareResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetDocumentCompareResultResponseBody</p>
 */
public class GetDocumentCompareResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Completed")
    private Boolean completed;

    @NameInMap("Data")
    private Object data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private GetDocumentCompareResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.completed = builder.completed;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentCompareResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return completed
     */
    public Boolean getCompleted() {
        return this.completed;
    }

    /**
     * @return data
     */
    public Object getData() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String code; 
        private Boolean completed; 
        private Object data; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * 错误码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Completed.
         */
        public Builder completed(Boolean completed) {
            this.completed = completed;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * 错误提示
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求唯一 ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetDocumentCompareResultResponseBody build() {
            return new GetDocumentCompareResultResponseBody(this);
        } 

    } 

}
