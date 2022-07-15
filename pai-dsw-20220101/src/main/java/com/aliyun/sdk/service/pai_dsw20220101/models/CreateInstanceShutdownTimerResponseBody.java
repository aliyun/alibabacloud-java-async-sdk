// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceShutdownTimerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceShutdownTimerResponseBody</p>
 */
public class CreateInstanceShutdownTimerResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateInstanceShutdownTimerResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceShutdownTimerResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private Integer httpStatusCode; 
        private String instanceId; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 状态码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * http状态码
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * 实例Id
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 说明
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 成功标志
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateInstanceShutdownTimerResponseBody build() {
            return new CreateInstanceShutdownTimerResponseBody(this);
        } 

    } 

}
