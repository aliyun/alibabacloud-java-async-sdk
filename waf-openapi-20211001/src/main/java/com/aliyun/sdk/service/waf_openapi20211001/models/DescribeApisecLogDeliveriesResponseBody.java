// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisecLogDeliveriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecLogDeliveriesResponseBody</p>
 */
public class DescribeApisecLogDeliveriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryConfigs")
    private java.util.List < DeliveryConfigs> deliveryConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApisecLogDeliveriesResponseBody(Builder builder) {
        this.deliveryConfigs = builder.deliveryConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecLogDeliveriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return deliveryConfigs
     */
    public java.util.List < DeliveryConfigs> getDeliveryConfigs() {
        return this.deliveryConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DeliveryConfigs> deliveryConfigs; 
        private String requestId; 

        /**
         * The configurations of API security log subscription.
         */
        public Builder deliveryConfigs(java.util.List < DeliveryConfigs> deliveryConfigs) {
            this.deliveryConfigs = deliveryConfigs;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApisecLogDeliveriesResponseBody build() {
            return new DescribeApisecLogDeliveriesResponseBody(this);
        } 

    } 

    public static class DeliveryConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssertKey")
        private String assertKey;

        @com.aliyun.core.annotation.NameInMap("LogRegionId")
        private String logRegionId;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private DeliveryConfigs(Builder builder) {
            this.assertKey = builder.assertKey;
            this.logRegionId = builder.logRegionId;
            this.logStoreName = builder.logStoreName;
            this.projectName = builder.projectName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryConfigs create() {
            return builder().build();
        }

        /**
         * @return assertKey
         */
        public String getAssertKey() {
            return this.assertKey;
        }

        /**
         * @return logRegionId
         */
        public String getLogRegionId() {
            return this.logRegionId;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String assertKey; 
            private String logRegionId; 
            private String logStoreName; 
            private String projectName; 
            private Boolean status; 

            /**
             * The type of the log subscription. Valid values:
             * <p>
             * 
             * *   **risk**: risk information.
             * *   **event**: attack event information.
             * *   **asset**: asset information.
             */
            public Builder assertKey(String assertKey) {
                this.assertKey = assertKey;
                return this;
            }

            /**
             * The ID of the region where logs are stored.
             */
            public Builder logRegionId(String logRegionId) {
                this.logRegionId = logRegionId;
                return this;
            }

            /**
             * The name of the Logstore in Simple Log Service.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * The name of the project in Simple Log Service.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * The status of API security log subscription. Valid values:
             * <p>
             * 
             * *   **true**: enabled.
             * *   **false**: disabled.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public DeliveryConfigs build() {
                return new DeliveryConfigs(this);
            } 

        } 

    }
}
