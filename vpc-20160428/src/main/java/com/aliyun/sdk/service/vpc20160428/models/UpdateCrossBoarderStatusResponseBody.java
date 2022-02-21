// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCrossBoarderStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCrossBoarderStatusResponseBody</p>
 */
public class UpdateCrossBoarderStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private UpdateCrossBoarderStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCrossBoarderStatusResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 返回码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 返回信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求的唯一标识
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否操作成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateCrossBoarderStatusResponseBody build() {
            return new UpdateCrossBoarderStatusResponseBody(this);
        } 

    } 

}
