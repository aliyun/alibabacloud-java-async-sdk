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

        private Builder() {
        } 

        private Builder(CreateProcessDefinitionWithScheduleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.failed = model.failed;
            this.httpStatusCode = model.httpStatusCode;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The code that is returned by the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>1400009</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder failed(String failed) {
            this.failed = failed;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The description of the returned code.</p>
         * 
         * <strong>example:</strong>
         * <p>No permission for resource action</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.id = model.id;
            } 

            /**
             * <p>The workflow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>160************</p>
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The serial number of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>12342</p>
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
