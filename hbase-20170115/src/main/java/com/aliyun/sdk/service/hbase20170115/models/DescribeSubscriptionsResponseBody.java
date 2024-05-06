// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubscriptionsResponseBody</p>
 */
public class DescribeSubscriptionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Subscriptions")
    private java.util.List < Subscriptions> subscriptions;

    private DescribeSubscriptionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subscriptions = builder.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subscriptions
     */
    public java.util.List < Subscriptions> getSubscriptions() {
        return this.subscriptions;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Subscriptions> subscriptions; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Subscriptions.
         */
        public Builder subscriptions(java.util.List < Subscriptions> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        public DescribeSubscriptionsResponseBody build() {
            return new DescribeSubscriptionsResponseBody(this);
        } 

    } 

    public static class DBInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private DBInstances(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.regionId = builder.regionId;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstances create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String regionId; 
            private String role; 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public DBInstances build() {
                return new DBInstances(this);
            } 

        } 

    }
    public static class Subscriptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstances")
        private java.util.List < DBInstances> DBInstances;

        @com.aliyun.core.annotation.NameInMap("Mapping")
        private String mapping;

        @com.aliyun.core.annotation.NameInMap("SubscriptionDescription")
        private String subscriptionDescription;

        @com.aliyun.core.annotation.NameInMap("SubscriptionId")
        private String subscriptionId;

        @com.aliyun.core.annotation.NameInMap("SubscriptionStatus")
        private String subscriptionStatus;

        @com.aliyun.core.annotation.NameInMap("SubscriptionType")
        private String subscriptionType;

        private Subscriptions(Builder builder) {
            this.DBInstances = builder.DBInstances;
            this.mapping = builder.mapping;
            this.subscriptionDescription = builder.subscriptionDescription;
            this.subscriptionId = builder.subscriptionId;
            this.subscriptionStatus = builder.subscriptionStatus;
            this.subscriptionType = builder.subscriptionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subscriptions create() {
            return builder().build();
        }

        /**
         * @return DBInstances
         */
        public java.util.List < DBInstances> getDBInstances() {
            return this.DBInstances;
        }

        /**
         * @return mapping
         */
        public String getMapping() {
            return this.mapping;
        }

        /**
         * @return subscriptionDescription
         */
        public String getSubscriptionDescription() {
            return this.subscriptionDescription;
        }

        /**
         * @return subscriptionId
         */
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        /**
         * @return subscriptionStatus
         */
        public String getSubscriptionStatus() {
            return this.subscriptionStatus;
        }

        /**
         * @return subscriptionType
         */
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public static final class Builder {
            private java.util.List < DBInstances> DBInstances; 
            private String mapping; 
            private String subscriptionDescription; 
            private String subscriptionId; 
            private String subscriptionStatus; 
            private String subscriptionType; 

            /**
             * DBInstances.
             */
            public Builder DBInstances(java.util.List < DBInstances> DBInstances) {
                this.DBInstances = DBInstances;
                return this;
            }

            /**
             * Mapping.
             */
            public Builder mapping(String mapping) {
                this.mapping = mapping;
                return this;
            }

            /**
             * SubscriptionDescription.
             */
            public Builder subscriptionDescription(String subscriptionDescription) {
                this.subscriptionDescription = subscriptionDescription;
                return this;
            }

            /**
             * SubscriptionId.
             */
            public Builder subscriptionId(String subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            /**
             * SubscriptionStatus.
             */
            public Builder subscriptionStatus(String subscriptionStatus) {
                this.subscriptionStatus = subscriptionStatus;
                return this;
            }

            /**
             * SubscriptionType.
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            public Subscriptions build() {
                return new Subscriptions(this);
            } 

        } 

    }
}
