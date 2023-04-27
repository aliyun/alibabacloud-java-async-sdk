// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityEventOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityEventOperationsResponseBody</p>
 */
public class DescribeSecurityEventOperationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityEventOperations")
    private java.util.List < SecurityEventOperations> securityEventOperations;

    private DescribeSecurityEventOperationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEventOperations = builder.securityEventOperations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventOperationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEventOperations
     */
    public java.util.List < SecurityEventOperations> getSecurityEventOperations() {
        return this.securityEventOperations;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SecurityEventOperations> securityEventOperations; 

        /**
         * The ID of the alert.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder securityEventOperations(java.util.List < SecurityEventOperations> securityEventOperations) {
            this.securityEventOperations = securityEventOperations;
            return this;
        }

        public DescribeSecurityEventOperationsResponseBody build() {
            return new DescribeSecurityEventOperationsResponseBody(this);
        } 

    } 

    public static class SecurityEventOperations extends TeaModel {
        @NameInMap("OperationCode")
        private String operationCode;

        @NameInMap("OperationParams")
        private String operationParams;

        @NameInMap("UserCanOperate")
        private Boolean userCanOperate;

        private SecurityEventOperations(Builder builder) {
            this.operationCode = builder.operationCode;
            this.operationParams = builder.operationParams;
            this.userCanOperate = builder.userCanOperate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEventOperations create() {
            return builder().build();
        }

        /**
         * @return operationCode
         */
        public String getOperationCode() {
            return this.operationCode;
        }

        /**
         * @return operationParams
         */
        public String getOperationParams() {
            return this.operationParams;
        }

        /**
         * @return userCanOperate
         */
        public Boolean getUserCanOperate() {
            return this.userCanOperate;
        }

        public static final class Builder {
            private String operationCode; 
            private String operationParams; 
            private Boolean userCanOperate; 

            /**
             * OperationCode.
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to DescribeSecurityEventOperations.
             */
            public Builder operationParams(String operationParams) {
                this.operationParams = operationParams;
                return this;
            }

            /**
             * UserCanOperate.
             */
            public Builder userCanOperate(Boolean userCanOperate) {
                this.userCanOperate = userCanOperate;
                return this;
            }

            public SecurityEventOperations build() {
                return new SecurityEventOperations(this);
            } 

        } 

    }
}
