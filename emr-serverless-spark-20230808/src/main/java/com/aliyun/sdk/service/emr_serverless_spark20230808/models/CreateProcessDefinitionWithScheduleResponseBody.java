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
 * {@link CreateProcessDefinitionWithScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProcessDefinitionWithScheduleResponseBody</p>
 */
public class CreateProcessDefinitionWithScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("failed")
    private String failed;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private CreateProcessDefinitionWithScheduleResponseBody(Builder builder) {
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

    public static CreateProcessDefinitionWithScheduleResponseBody create() {
        return builder().build();
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return failed
     */
    public String getFailed() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String failed; 
        private Integer httpStatusCode; 
        private String msg; 
        private String requestId; 
        private String success; 

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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * failed.
         */
        public Builder failed(String failed) {
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateProcessDefinitionWithScheduleResponseBody build() {
            return new CreateProcessDefinitionWithScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateProcessDefinitionWithScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProcessDefinitionWithScheduleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private Long code;

        @com.aliyun.core.annotation.NameInMap("id")
        private Integer id;

        private Data(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Long getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        public static final class Builder {
            private Long code; 
            private Integer id; 

            /**
             * code.
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
