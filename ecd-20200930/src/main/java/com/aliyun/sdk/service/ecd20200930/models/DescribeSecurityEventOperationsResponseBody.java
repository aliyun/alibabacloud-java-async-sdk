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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The operations performed on the alert.
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
             * The code of the operation performed on the alert. Valid values:
             * <p>
             * 
             * *   mark_mis_info: adds the alert to the whitelist without configuring rules. This operation is triggered by adding multiple alerts to the whitelist at a time.
             * *   advance_mark_mis_inf: adds the alert to the whitelist by configuring advanced rules.
             * *   defense_mark_mis_info: adds the alert to the whitelist by configuring precise defense rules.
             * *   rm_mark_mis_info: removes the alert from the whitelist.
             * *   rm_defense_mark_mis_info: removes the alert from the whitelist configured with precise defense rules.
             * *   manual_handled: manually handles the alert.
             * *   ignore: ignores the alert.
             * *   quara: quarantines the source file of the malicious process.
             * *   block_ip: blocks access from the source IP address.
             * *   kill_and_quara: terminates the malicious process and quarantines the source file.
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * The parameters of the operation.
             */
            public Builder operationParams(String operationParams) {
                this.operationParams = operationParams;
                return this;
            }

            /**
             * Indicates whether the alert can be handled. Valid values:
             * <p>
             * 
             * *   true: The alert can be handled.
             * *   false: The alert cannot be handled.
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
