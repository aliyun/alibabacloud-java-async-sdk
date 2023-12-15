// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainQRCodeAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainQRCodeAuthorizationResponseBody</p>
 */
public class DescribeAntChainQRCodeAuthorizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeAntChainQRCodeAuthorizationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainQRCodeAuthorizationResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String requestId; 
        private Result result; 

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

        public DescribeAntChainQRCodeAuthorizationResponseBody build() {
            return new DescribeAntChainQRCodeAuthorizationResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AntChainId")
        private String antChainId;

        @NameInMap("AuthorizationType")
        private String authorizationType;

        @NameInMap("QRCodeType")
        private String QRCodeType;

        private Result(Builder builder) {
            this.antChainId = builder.antChainId;
            this.authorizationType = builder.authorizationType;
            this.QRCodeType = builder.QRCodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return antChainId
         */
        public String getAntChainId() {
            return this.antChainId;
        }

        /**
         * @return authorizationType
         */
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        /**
         * @return QRCodeType
         */
        public String getQRCodeType() {
            return this.QRCodeType;
        }

        public static final class Builder {
            private String antChainId; 
            private String authorizationType; 
            private String QRCodeType; 

            /**
             * AntChainId.
             */
            public Builder antChainId(String antChainId) {
                this.antChainId = antChainId;
                return this;
            }

            /**
             * AuthorizationType.
             */
            public Builder authorizationType(String authorizationType) {
                this.authorizationType = authorizationType;
                return this;
            }

            /**
             * QRCodeType.
             */
            public Builder QRCodeType(String QRCodeType) {
                this.QRCodeType = QRCodeType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
