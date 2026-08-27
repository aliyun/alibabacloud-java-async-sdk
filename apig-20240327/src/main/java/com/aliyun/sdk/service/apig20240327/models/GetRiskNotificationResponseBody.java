// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetRiskNotificationResponseBody} extends {@link TeaModel}
 *
 * <p>GetRiskNotificationResponseBody</p>
 */
public class GetRiskNotificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetRiskNotificationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRiskNotificationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRiskNotificationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
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
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRiskNotificationResponseBody build() {
            return new GetRiskNotificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRiskNotificationResponseBody} extends {@link TeaModel}
     *
     * <p>GetRiskNotificationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("isMute")
        private Boolean isMute;

        @com.aliyun.core.annotation.NameInMap("riskCode")
        private String riskCode;

        private Data(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.isMute = builder.isMute;
            this.riskCode = builder.riskCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return isMute
         */
        public Boolean getIsMute() {
            return this.isMute;
        }

        /**
         * @return riskCode
         */
        public String getRiskCode() {
            return this.riskCode;
        }

        public static final class Builder {
            private String gatewayId; 
            private Boolean isMute; 
            private String riskCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gatewayId = model.gatewayId;
                this.isMute = model.isMute;
                this.riskCode = model.riskCode;
            } 

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * isMute.
             */
            public Builder isMute(Boolean isMute) {
                this.isMute = isMute;
                return this;
            }

            /**
             * riskCode.
             */
            public Builder riskCode(String riskCode) {
                this.riskCode = riskCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
