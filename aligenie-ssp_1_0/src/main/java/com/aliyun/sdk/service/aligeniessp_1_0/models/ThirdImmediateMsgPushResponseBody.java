// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ThirdImmediateMsgPushResponseBody} extends {@link TeaModel}
 *
 * <p>ThirdImmediateMsgPushResponseBody</p>
 */
public class ThirdImmediateMsgPushResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ThirdImmediateMsgPushResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.model = builder.model;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ThirdImmediateMsgPushResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private Model model; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ThirdImmediateMsgPushResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.model = model.model;
            this.success = model.success;
        } 

        /**
         * <p>error code</p>
         * 
         * <strong>example:</strong>
         * <p>500000000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>服务器内部异常</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>push result</p>
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * <p>whether the invocation succeeded</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ThirdImmediateMsgPushResponseBody build() {
            return new ThirdImmediateMsgPushResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ThirdImmediateMsgPushResponseBody} extends {@link TeaModel}
     *
     * <p>ThirdImmediateMsgPushResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Model(Builder builder) {
            this.requestId = builder.requestId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
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
            private String requestId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.requestId = model.requestId;
                this.success = model.success;
            } 

            /**
             * <p>request ID</p>
             * 
             * <strong>example:</strong>
             * <p>2DF6FEFE-3301-16DD-ABCC-968A9524920B</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>whether the push succeeded</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
