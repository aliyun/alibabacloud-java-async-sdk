// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GenerateTaskCodesResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateTaskCodesResponseBody</p>
 */
public class GenerateTaskCodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Long> data;

    @com.aliyun.core.annotation.NameInMap("failed")
    private Boolean failed;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GenerateTaskCodesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.failed = builder.failed;
        this.httpStatusCode = builder.httpStatusCode;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTaskCodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Long> getData() {
        return this.data;
    }

    /**
     * @return failed
     */
    public Boolean getFailed() {
        return this.failed;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private Integer code; 
        private java.util.List<Long> data; 
        private Boolean failed; 
        private Integer httpStatusCode; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GenerateTaskCodesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.failed = model.failed;
            this.httpStatusCode = model.httpStatusCode;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Long> data) {
            this.data = data;
            return this;
        }

        /**
         * failed.
         */
        public Builder failed(Boolean failed) {
            this.failed = failed;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GenerateTaskCodesResponseBody build() {
            return new GenerateTaskCodesResponseBody(this);
        } 

    } 

}
