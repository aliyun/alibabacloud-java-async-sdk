// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHardwareTerminalsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHardwareTerminalsResponseBody</p>
 */
public class DescribeHardwareTerminalsResponseBody extends TeaModel {
    @NameInMap("HardwareTerminals")
    private java.util.List < HardwareTerminals> hardwareTerminals;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHardwareTerminalsResponseBody(Builder builder) {
        this.hardwareTerminals = builder.hardwareTerminals;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHardwareTerminalsResponseBody create() {
        return builder().build();
    }

    /**
     * @return hardwareTerminals
     */
    public java.util.List < HardwareTerminals> getHardwareTerminals() {
        return this.hardwareTerminals;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < HardwareTerminals> hardwareTerminals; 
        private String requestId; 

        /**
         * HardwareTerminals.
         */
        public Builder hardwareTerminals(java.util.List < HardwareTerminals> hardwareTerminals) {
            this.hardwareTerminals = hardwareTerminals;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHardwareTerminalsResponseBody build() {
            return new DescribeHardwareTerminalsResponseBody(this);
        } 

    } 

    public static class HardwareTypeDetails extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("HardwareVersion")
        private Integer hardwareVersion;

        @NameInMap("StockState")
        private String stockState;

        private HardwareTypeDetails(Builder builder) {
            this.description = builder.description;
            this.hardwareVersion = builder.hardwareVersion;
            this.stockState = builder.stockState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HardwareTypeDetails create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hardwareVersion
         */
        public Integer getHardwareVersion() {
            return this.hardwareVersion;
        }

        /**
         * @return stockState
         */
        public String getStockState() {
            return this.stockState;
        }

        public static final class Builder {
            private String description; 
            private Integer hardwareVersion; 
            private String stockState; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * HardwareVersion.
             */
            public Builder hardwareVersion(Integer hardwareVersion) {
                this.hardwareVersion = hardwareVersion;
                return this;
            }

            /**
             * StockState.
             */
            public Builder stockState(String stockState) {
                this.stockState = stockState;
                return this;
            }

            public HardwareTypeDetails build() {
                return new HardwareTypeDetails(this);
            } 

        } 

    }
    public static class HardwareTerminals extends TeaModel {
        @NameInMap("HardwareType")
        private String hardwareType;

        @NameInMap("HardwareTypeDetails")
        private java.util.List < HardwareTypeDetails> hardwareTypeDetails;

        private HardwareTerminals(Builder builder) {
            this.hardwareType = builder.hardwareType;
            this.hardwareTypeDetails = builder.hardwareTypeDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HardwareTerminals create() {
            return builder().build();
        }

        /**
         * @return hardwareType
         */
        public String getHardwareType() {
            return this.hardwareType;
        }

        /**
         * @return hardwareTypeDetails
         */
        public java.util.List < HardwareTypeDetails> getHardwareTypeDetails() {
            return this.hardwareTypeDetails;
        }

        public static final class Builder {
            private String hardwareType; 
            private java.util.List < HardwareTypeDetails> hardwareTypeDetails; 

            /**
             * HardwareType.
             */
            public Builder hardwareType(String hardwareType) {
                this.hardwareType = hardwareType;
                return this;
            }

            /**
             * HardwareTypeDetails.
             */
            public Builder hardwareTypeDetails(java.util.List < HardwareTypeDetails> hardwareTypeDetails) {
                this.hardwareTypeDetails = hardwareTypeDetails;
                return this;
            }

            public HardwareTerminals build() {
                return new HardwareTerminals(this);
            } 

        } 

    }
}
