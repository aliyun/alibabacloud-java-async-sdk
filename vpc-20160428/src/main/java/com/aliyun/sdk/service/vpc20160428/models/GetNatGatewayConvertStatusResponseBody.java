// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNatGatewayConvertStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetNatGatewayConvertStatusResponseBody</p>
 */
public class GetNatGatewayConvertStatusResponseBody extends TeaModel {
    @NameInMap("ConvertSteps")
    private java.util.List < ConvertSteps> convertSteps;

    @NameInMap("DstNatType")
    private String dstNatType;

    @NameInMap("NatGatewayId")
    private String natGatewayId;

    @NameInMap("RequestId")
    private String requestId;

    private GetNatGatewayConvertStatusResponseBody(Builder builder) {
        this.convertSteps = builder.convertSteps;
        this.dstNatType = builder.dstNatType;
        this.natGatewayId = builder.natGatewayId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNatGatewayConvertStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return convertSteps
     */
    public java.util.List < ConvertSteps> getConvertSteps() {
        return this.convertSteps;
    }

    /**
     * @return dstNatType
     */
    public String getDstNatType() {
        return this.dstNatType;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ConvertSteps> convertSteps; 
        private String dstNatType; 
        private String natGatewayId; 
        private String requestId; 

        /**
         * The status during the switch.
         */
        public Builder convertSteps(java.util.List < ConvertSteps> convertSteps) {
            this.convertSteps = convertSteps;
            return this;
        }

        /**
         * The type of the NAT gateway. Set the value to **Enhanced**, which specifies an enhanced Internet NAT gateway.
         */
        public Builder dstNatType(String dstNatType) {
            this.dstNatType = dstNatType;
            return this;
        }

        /**
         * The ID of the Internet NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNatGatewayConvertStatusResponseBody build() {
            return new GetNatGatewayConvertStatusResponseBody(this);
        } 

    } 

    public static class ConvertSteps extends TeaModel {
        @NameInMap("StepName")
        private String stepName;

        @NameInMap("StepStartTime")
        private String stepStartTime;

        @NameInMap("StepStatus")
        private String stepStatus;

        private ConvertSteps(Builder builder) {
            this.stepName = builder.stepName;
            this.stepStartTime = builder.stepStartTime;
            this.stepStatus = builder.stepStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConvertSteps create() {
            return builder().build();
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return stepStartTime
         */
        public String getStepStartTime() {
            return this.stepStartTime;
        }

        /**
         * @return stepStatus
         */
        public String getStepStatus() {
            return this.stepStatus;
        }

        public static final class Builder {
            private String stepName; 
            private String stepStartTime; 
            private String stepStatus; 

            /**
             * Valid values:
             * <p>
             * 
             * *   **init**: initializing
             * *   **check**: checking configurations
             * *   **configure**: pushing configurations
             * *   **activate**: switching
             * *   **conf_delete**: deleting configurations
             * *   **rollback**: rolling back
             * *   **end_success**: switched
             * *   **end_fail**: failed
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * The time when the switch started.
             */
            public Builder stepStartTime(String stepStartTime) {
                this.stepStartTime = stepStartTime;
                return this;
            }

            /**
             * The switch status. Valid values:
             * <p>
             * 
             * *   **processing**: switching
             * *   **successful**: switched
             * *   **failed**: failed
             */
            public Builder stepStatus(String stepStatus) {
                this.stepStatus = stepStatus;
                return this;
            }

            public ConvertSteps build() {
                return new ConvertSteps(this);
            } 

        } 

    }
}
