// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link CheckPushReceiverResponseBody} extends {@link TeaModel}
 *
 * <p>CheckPushReceiverResponseBody</p>
 */
public class CheckPushReceiverResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckPushReceiverResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckPushReceiverResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Module module; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckPushReceiverResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckPushReceiverResponseBody build() {
            return new CheckPushReceiverResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckPushReceiverResponseBody} extends {@link TeaModel}
     *
     * <p>CheckPushReceiverResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanReceivePush")
        private Boolean canReceivePush;

        @com.aliyun.core.annotation.NameInMap("MaskedMobile")
        private String maskedMobile;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        private Module(Builder builder) {
            this.canReceivePush = builder.canReceivePush;
            this.maskedMobile = builder.maskedMobile;
            this.reasonCode = builder.reasonCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return canReceivePush
         */
        public Boolean getCanReceivePush() {
            return this.canReceivePush;
        }

        /**
         * @return maskedMobile
         */
        public String getMaskedMobile() {
            return this.maskedMobile;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        public static final class Builder {
            private Boolean canReceivePush; 
            private String maskedMobile; 
            private String reasonCode; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.canReceivePush = model.canReceivePush;
                this.maskedMobile = model.maskedMobile;
                this.reasonCode = model.reasonCode;
            } 

            /**
             * CanReceivePush.
             */
            public Builder canReceivePush(Boolean canReceivePush) {
                this.canReceivePush = canReceivePush;
                return this;
            }

            /**
             * MaskedMobile.
             */
            public Builder maskedMobile(String maskedMobile) {
                this.maskedMobile = maskedMobile;
                return this;
            }

            /**
             * ReasonCode.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
