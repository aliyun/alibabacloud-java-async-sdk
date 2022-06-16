// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleAppResponseBody} extends {@link TeaModel}
 *
 * <p>ScaleAppResponseBody</p>
 */
public class ScaleAppResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private ScaleAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ScaleAppResponseBody build() {
            return new ScaleAppResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Admitted")
        private Boolean admitted;

        @NameInMap("BusinessCode")
        private String businessCode;

        @NameInMap("DeployOrderId")
        private Long deployOrderId;

        private Result(Builder builder) {
            this.admitted = builder.admitted;
            this.businessCode = builder.businessCode;
            this.deployOrderId = builder.deployOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return admitted
         */
        public Boolean getAdmitted() {
            return this.admitted;
        }

        /**
         * @return businessCode
         */
        public String getBusinessCode() {
            return this.businessCode;
        }

        /**
         * @return deployOrderId
         */
        public Long getDeployOrderId() {
            return this.deployOrderId;
        }

        public static final class Builder {
            private Boolean admitted; 
            private String businessCode; 
            private Long deployOrderId; 

            /**
             * Admitted.
             */
            public Builder admitted(Boolean admitted) {
                this.admitted = admitted;
                return this;
            }

            /**
             * BusinessCode.
             */
            public Builder businessCode(String businessCode) {
                this.businessCode = businessCode;
                return this;
            }

            /**
             * DeployOrderId.
             */
            public Builder deployOrderId(Long deployOrderId) {
                this.deployOrderId = deployOrderId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
