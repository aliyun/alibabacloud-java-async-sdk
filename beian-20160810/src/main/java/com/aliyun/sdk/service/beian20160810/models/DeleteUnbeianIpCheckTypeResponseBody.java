// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUnbeianIpCheckTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteUnbeianIpCheckTypeResponseBody</p>
 */
public class DeleteUnbeianIpCheckTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HuntressIpCheckTypeResultDO")
    private HuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteUnbeianIpCheckTypeResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.huntressIpCheckTypeResultDO = builder.huntressIpCheckTypeResultDO;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUnbeianIpCheckTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return huntressIpCheckTypeResultDO
     */
    public HuntressIpCheckTypeResultDO getHuntressIpCheckTypeResultDO() {
        return this.huntressIpCheckTypeResultDO;
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
        private Integer errorCode; 
        private String errorMessage; 
        private HuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HuntressIpCheckTypeResultDO.
         */
        public Builder huntressIpCheckTypeResultDO(HuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO) {
            this.huntressIpCheckTypeResultDO = huntressIpCheckTypeResultDO;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteUnbeianIpCheckTypeResponseBody build() {
            return new DeleteUnbeianIpCheckTypeResponseBody(this);
        } 

    } 

    public static class HuntressIpCheckTypeResultDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private HuntressIpCheckTypeResultDO(Builder builder) {
            this.msg = builder.msg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HuntressIpCheckTypeResultDO create() {
            return builder().build();
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String msg; 
            private Boolean success; 

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public HuntressIpCheckTypeResultDO build() {
                return new HuntressIpCheckTypeResultDO(this);
            } 

        } 

    }
}
