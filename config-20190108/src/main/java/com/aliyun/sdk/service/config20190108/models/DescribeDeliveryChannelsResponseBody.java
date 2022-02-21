// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeliveryChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeliveryChannelsResponseBody</p>
 */
public class DescribeDeliveryChannelsResponseBody extends TeaModel {
    @NameInMap("DeliveryChannels")
    private java.util.List < DeliveryChannels> deliveryChannels;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDeliveryChannelsResponseBody(Builder builder) {
        this.deliveryChannels = builder.deliveryChannels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeliveryChannelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return deliveryChannels
     */
    public java.util.List < DeliveryChannels> getDeliveryChannels() {
        return this.deliveryChannels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DeliveryChannels> deliveryChannels; 
        private String requestId; 

        /**
         * DeliveryChannels.
         */
        public Builder deliveryChannels(java.util.List < DeliveryChannels> deliveryChannels) {
            this.deliveryChannels = deliveryChannels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDeliveryChannelsResponseBody build() {
            return new DescribeDeliveryChannelsResponseBody(this);
        } 

    } 

    public static class DeliveryChannels extends TeaModel {
        @NameInMap("ConfigurationItemChangeNotification")
        private Boolean configurationItemChangeNotification;

        @NameInMap("ConfigurationSnapshot")
        private Boolean configurationSnapshot;

        @NameInMap("DeliveryChannelAssumeRoleArn")
        private String deliveryChannelAssumeRoleArn;

        @NameInMap("DeliveryChannelCondition")
        private String deliveryChannelCondition;

        @NameInMap("DeliveryChannelId")
        private String deliveryChannelId;

        @NameInMap("DeliveryChannelName")
        private String deliveryChannelName;

        @NameInMap("DeliveryChannelTargetArn")
        private String deliveryChannelTargetArn;

        @NameInMap("DeliveryChannelType")
        private String deliveryChannelType;

        @NameInMap("Description")
        private String description;

        @NameInMap("NonCompliantNotification")
        private Boolean nonCompliantNotification;

        @NameInMap("OversizedDataOSSTargetArn")
        private String oversizedDataOSSTargetArn;

        @NameInMap("Status")
        private Integer status;

        private DeliveryChannels(Builder builder) {
            this.configurationItemChangeNotification = builder.configurationItemChangeNotification;
            this.configurationSnapshot = builder.configurationSnapshot;
            this.deliveryChannelAssumeRoleArn = builder.deliveryChannelAssumeRoleArn;
            this.deliveryChannelCondition = builder.deliveryChannelCondition;
            this.deliveryChannelId = builder.deliveryChannelId;
            this.deliveryChannelName = builder.deliveryChannelName;
            this.deliveryChannelTargetArn = builder.deliveryChannelTargetArn;
            this.deliveryChannelType = builder.deliveryChannelType;
            this.description = builder.description;
            this.nonCompliantNotification = builder.nonCompliantNotification;
            this.oversizedDataOSSTargetArn = builder.oversizedDataOSSTargetArn;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryChannels create() {
            return builder().build();
        }

        /**
         * @return configurationItemChangeNotification
         */
        public Boolean getConfigurationItemChangeNotification() {
            return this.configurationItemChangeNotification;
        }

        /**
         * @return configurationSnapshot
         */
        public Boolean getConfigurationSnapshot() {
            return this.configurationSnapshot;
        }

        /**
         * @return deliveryChannelAssumeRoleArn
         */
        public String getDeliveryChannelAssumeRoleArn() {
            return this.deliveryChannelAssumeRoleArn;
        }

        /**
         * @return deliveryChannelCondition
         */
        public String getDeliveryChannelCondition() {
            return this.deliveryChannelCondition;
        }

        /**
         * @return deliveryChannelId
         */
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        /**
         * @return deliveryChannelName
         */
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        /**
         * @return deliveryChannelTargetArn
         */
        public String getDeliveryChannelTargetArn() {
            return this.deliveryChannelTargetArn;
        }

        /**
         * @return deliveryChannelType
         */
        public String getDeliveryChannelType() {
            return this.deliveryChannelType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return nonCompliantNotification
         */
        public Boolean getNonCompliantNotification() {
            return this.nonCompliantNotification;
        }

        /**
         * @return oversizedDataOSSTargetArn
         */
        public String getOversizedDataOSSTargetArn() {
            return this.oversizedDataOSSTargetArn;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean configurationItemChangeNotification; 
            private Boolean configurationSnapshot; 
            private String deliveryChannelAssumeRoleArn; 
            private String deliveryChannelCondition; 
            private String deliveryChannelId; 
            private String deliveryChannelName; 
            private String deliveryChannelTargetArn; 
            private String deliveryChannelType; 
            private String description; 
            private Boolean nonCompliantNotification; 
            private String oversizedDataOSSTargetArn; 
            private Integer status; 

            /**
             * ConfigurationItemChangeNotification.
             */
            public Builder configurationItemChangeNotification(Boolean configurationItemChangeNotification) {
                this.configurationItemChangeNotification = configurationItemChangeNotification;
                return this;
            }

            /**
             * ConfigurationSnapshot.
             */
            public Builder configurationSnapshot(Boolean configurationSnapshot) {
                this.configurationSnapshot = configurationSnapshot;
                return this;
            }

            /**
             * DeliveryChannelAssumeRoleArn.
             */
            public Builder deliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
                this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
                return this;
            }

            /**
             * DeliveryChannelCondition.
             */
            public Builder deliveryChannelCondition(String deliveryChannelCondition) {
                this.deliveryChannelCondition = deliveryChannelCondition;
                return this;
            }

            /**
             * DeliveryChannelId.
             */
            public Builder deliveryChannelId(String deliveryChannelId) {
                this.deliveryChannelId = deliveryChannelId;
                return this;
            }

            /**
             * DeliveryChannelName.
             */
            public Builder deliveryChannelName(String deliveryChannelName) {
                this.deliveryChannelName = deliveryChannelName;
                return this;
            }

            /**
             * DeliveryChannelTargetArn.
             */
            public Builder deliveryChannelTargetArn(String deliveryChannelTargetArn) {
                this.deliveryChannelTargetArn = deliveryChannelTargetArn;
                return this;
            }

            /**
             * DeliveryChannelType.
             */
            public Builder deliveryChannelType(String deliveryChannelType) {
                this.deliveryChannelType = deliveryChannelType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * NonCompliantNotification.
             */
            public Builder nonCompliantNotification(Boolean nonCompliantNotification) {
                this.nonCompliantNotification = nonCompliantNotification;
                return this;
            }

            /**
             * OversizedDataOSSTargetArn.
             */
            public Builder oversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
                this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public DeliveryChannels build() {
                return new DeliveryChannels(this);
            } 

        } 

    }
}
