// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayModificationClassesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayModificationClassesResponseBody</p>
 */
public class DescribeGatewayModificationClassesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TargetGatewayClasses")
    private TargetGatewayClasses targetGatewayClasses;

    private DescribeGatewayModificationClassesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.targetGatewayClasses = builder.targetGatewayClasses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayModificationClassesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return targetGatewayClasses
     */
    public TargetGatewayClasses getTargetGatewayClasses() {
        return this.targetGatewayClasses;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TargetGatewayClasses targetGatewayClasses; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        /**
         * TargetGatewayClasses.
         */
        public Builder targetGatewayClasses(TargetGatewayClasses targetGatewayClasses) {
            this.targetGatewayClasses = targetGatewayClasses;
            return this;
        }

        public DescribeGatewayModificationClassesResponseBody build() {
            return new DescribeGatewayModificationClassesResponseBody(this);
        } 

    } 

    public static class TargetGatewayClass extends TeaModel {
        @NameInMap("GatewayClass")
        private String gatewayClass;

        @NameInMap("IsAvailable")
        private Boolean isAvailable;

        private TargetGatewayClass(Builder builder) {
            this.gatewayClass = builder.gatewayClass;
            this.isAvailable = builder.isAvailable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetGatewayClass create() {
            return builder().build();
        }

        /**
         * @return gatewayClass
         */
        public String getGatewayClass() {
            return this.gatewayClass;
        }

        /**
         * @return isAvailable
         */
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        public static final class Builder {
            private String gatewayClass; 
            private Boolean isAvailable; 

            /**
             * GatewayClass.
             */
            public Builder gatewayClass(String gatewayClass) {
                this.gatewayClass = gatewayClass;
                return this;
            }

            /**
             * IsAvailable.
             */
            public Builder isAvailable(Boolean isAvailable) {
                this.isAvailable = isAvailable;
                return this;
            }

            public TargetGatewayClass build() {
                return new TargetGatewayClass(this);
            } 

        } 

    }
    public static class TargetGatewayClasses extends TeaModel {
        @NameInMap("TargetGatewayClass")
        private java.util.List < TargetGatewayClass> targetGatewayClass;

        private TargetGatewayClasses(Builder builder) {
            this.targetGatewayClass = builder.targetGatewayClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetGatewayClasses create() {
            return builder().build();
        }

        /**
         * @return targetGatewayClass
         */
        public java.util.List < TargetGatewayClass> getTargetGatewayClass() {
            return this.targetGatewayClass;
        }

        public static final class Builder {
            private java.util.List < TargetGatewayClass> targetGatewayClass; 

            /**
             * TargetGatewayClass.
             */
            public Builder targetGatewayClass(java.util.List < TargetGatewayClass> targetGatewayClass) {
                this.targetGatewayClass = targetGatewayClass;
                return this;
            }

            public TargetGatewayClasses build() {
                return new TargetGatewayClasses(this);
            } 

        } 

    }
}
