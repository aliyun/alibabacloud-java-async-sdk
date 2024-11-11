// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeScalingGroupDiagnoseDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingGroupDiagnoseDetailsResponseBody</p>
 */
public class DescribeScalingGroupDiagnoseDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Details")
    private java.util.List < Details> details;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeScalingGroupDiagnoseDetailsResponseBody(Builder builder) {
        this.details = builder.details;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingGroupDiagnoseDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return details
     */
    public java.util.List < Details> getDetails() {
        return this.details;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Details> details; 
        private String requestId; 

        /**
         * Details.
         */
        public Builder details(java.util.List < Details> details) {
            this.details = details;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>688B18B8-FB1E-42EB-A1ED-7F55B090****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeScalingGroupDiagnoseDetailsResponseBody build() {
            return new DescribeScalingGroupDiagnoseDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScalingGroupDiagnoseDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupDiagnoseDetailsResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiagnoseType")
        private String diagnoseType;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Details(Builder builder) {
            this.diagnoseType = builder.diagnoseType;
            this.errorCode = builder.errorCode;
            this.resourceId = builder.resourceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return diagnoseType
         */
        public String getDiagnoseType() {
            return this.diagnoseType;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String diagnoseType; 
            private String errorCode; 
            private String resourceId; 
            private String status; 

            /**
             * DiagnoseType.
             */
            public Builder diagnoseType(String diagnoseType) {
                this.diagnoseType = diagnoseType;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
}
