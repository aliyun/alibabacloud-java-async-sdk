// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarApplyAddResponseBody} extends {@link TeaModel}
 *
 * <p>CarApplyAddResponseBody</p>
 */
public class CarApplyAddResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("err_code")
    private Integer errCode;

    @NameInMap("err_msg")
    private String errMsg;

    @NameInMap("module")
    private Long module;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private CarApplyAddResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.errCode = builder.errCode;
        this.errMsg = builder.errMsg;
        this.module = builder.module;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CarApplyAddResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return errCode
     */
    public Integer getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return module
     */
    public Long getModule() {
        return this.module;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String requestId; 
        private Integer errCode; 
        private String errMsg; 
        private Long module; 
        private Boolean success; 
        private String traceId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * err_code.
         */
        public Builder errCode(Integer errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * err_msg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Long module) {
            this.module = module;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CarApplyAddResponseBody build() {
            return new CarApplyAddResponseBody(this);
        } 

    } 

}
