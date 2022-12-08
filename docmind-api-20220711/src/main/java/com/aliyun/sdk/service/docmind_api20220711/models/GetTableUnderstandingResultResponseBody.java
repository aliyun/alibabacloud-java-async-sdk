// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableUnderstandingResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableUnderstandingResultResponseBody</p>
 */
public class GetTableUnderstandingResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Completed")
    private Boolean completed;

    @NameInMap("Data")
    private java.util.Map < String, ? > data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private GetTableUnderstandingResultResponseBody(Builder builder) {
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

    public static GetTableUnderstandingResultResponseBody create() {
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
    public java.util.Map < String, ? > getData() {
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
        private java.util.Map < String, ? > data; 
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
         * 操作是否完成
         * <p>
         * True：当前Job已经执行完成。 False：当前Job还在执行中。
         */
        public Builder completed(Boolean completed) {
            this.completed = completed;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.Map < String, ? > data) {
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
         * 操作完成后的状态
         * <p>
         * Success：成功 Fail：失败 * Cancel：被服务端主动取消
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetTableUnderstandingResultResponseBody build() {
            return new GetTableUnderstandingResultResponseBody(this);
        } 

    } 

}
