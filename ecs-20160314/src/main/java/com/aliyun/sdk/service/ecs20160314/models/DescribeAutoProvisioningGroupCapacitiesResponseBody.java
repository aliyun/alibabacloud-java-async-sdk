// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoProvisioningGroupCapacitiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoProvisioningGroupCapacitiesResponseBody</p>
 */
public class DescribeAutoProvisioningGroupCapacitiesResponseBody extends TeaModel {
    @NameInMap("Capacities")
    private Capacities capacities;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeAutoProvisioningGroupCapacitiesResponseBody(Builder builder) {
        this.capacities = builder.capacities;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoProvisioningGroupCapacitiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return capacities
     */
    public Capacities getCapacities() {
        return this.capacities;
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

    public static final class Builder {
        private Capacities capacities; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Capacities.
         */
        public Builder capacities(Capacities capacities) {
            this.capacities = capacities;
            return this;
        }

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

        public DescribeAutoProvisioningGroupCapacitiesResponseBody build() {
            return new DescribeAutoProvisioningGroupCapacitiesResponseBody(this);
        } 

    } 

    public static class Capacity extends TeaModel {
        @NameInMap("AutoProvisioningGroupId")
        private String autoProvisioningGroupId;

        @NameInMap("PayAsYouGoCapacity")
        private String payAsYouGoCapacity;

        @NameInMap("SpotCapacity")
        private String spotCapacity;

        @NameInMap("TotalCapacity")
        private String totalCapacity;

        private Capacity(Builder builder) {
            this.autoProvisioningGroupId = builder.autoProvisioningGroupId;
            this.payAsYouGoCapacity = builder.payAsYouGoCapacity;
            this.spotCapacity = builder.spotCapacity;
            this.totalCapacity = builder.totalCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capacity create() {
            return builder().build();
        }

        /**
         * @return autoProvisioningGroupId
         */
        public String getAutoProvisioningGroupId() {
            return this.autoProvisioningGroupId;
        }

        /**
         * @return payAsYouGoCapacity
         */
        public String getPayAsYouGoCapacity() {
            return this.payAsYouGoCapacity;
        }

        /**
         * @return spotCapacity
         */
        public String getSpotCapacity() {
            return this.spotCapacity;
        }

        /**
         * @return totalCapacity
         */
        public String getTotalCapacity() {
            return this.totalCapacity;
        }

        public static final class Builder {
            private String autoProvisioningGroupId; 
            private String payAsYouGoCapacity; 
            private String spotCapacity; 
            private String totalCapacity; 

            /**
             * AutoProvisioningGroupId.
             */
            public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
                this.autoProvisioningGroupId = autoProvisioningGroupId;
                return this;
            }

            /**
             * PayAsYouGoCapacity.
             */
            public Builder payAsYouGoCapacity(String payAsYouGoCapacity) {
                this.payAsYouGoCapacity = payAsYouGoCapacity;
                return this;
            }

            /**
             * SpotCapacity.
             */
            public Builder spotCapacity(String spotCapacity) {
                this.spotCapacity = spotCapacity;
                return this;
            }

            /**
             * TotalCapacity.
             */
            public Builder totalCapacity(String totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            public Capacity build() {
                return new Capacity(this);
            } 

        } 

    }
    public static class Capacities extends TeaModel {
        @NameInMap("Capacity")
        private java.util.List < Capacity> capacity;

        private Capacities(Builder builder) {
            this.capacity = builder.capacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capacities create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public java.util.List < Capacity> getCapacity() {
            return this.capacity;
        }

        public static final class Builder {
            private java.util.List < Capacity> capacity; 

            /**
             * Capacity.
             */
            public Builder capacity(java.util.List < Capacity> capacity) {
                this.capacity = capacity;
                return this;
            }

            public Capacities build() {
                return new Capacities(this);
            } 

        } 

    }
}
