// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSlsDeliveryConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsDeliveryConfigResponseBody</p>
 */
public class DescribeSlsDeliveryConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryConfigs")
    private java.util.List<DeliveryConfigs> deliveryConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSlsDeliveryConfigResponseBody(Builder builder) {
        this.deliveryConfigs = builder.deliveryConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsDeliveryConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryConfigs
     */
    public java.util.List<DeliveryConfigs> getDeliveryConfigs() {
        return this.deliveryConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DeliveryConfigs> deliveryConfigs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSlsDeliveryConfigResponseBody model) {
            this.deliveryConfigs = model.deliveryConfigs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of delivery configurations that match the filter conditions. If no configurations match the conditions, an empty list is returned.</p>
         */
        public Builder deliveryConfigs(java.util.List<DeliveryConfigs> deliveryConfigs) {
            this.deliveryConfigs = deliveryConfigs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSlsDeliveryConfigResponseBody build() {
            return new DescribeSlsDeliveryConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlsDeliveryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlsDeliveryConfigResponseBody</p>
     */
    public static class DeliveryScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DeliveryScopes(Builder builder) {
            this.productType = builder.productType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryScopes create() {
            return builder().build();
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String productType; 
            private String status; 

            private Builder() {
            } 

            private Builder(DeliveryScopes model) {
                this.productType = model.productType;
                this.status = model.status;
            } 

            /**
             * <p>The product type of the delivery scope. For example, <code>WuyingServer</code> indicates Enterprise Edition workstations.</p>
             * 
             * <strong>example:</strong>
             * <p>WuyingServer</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The current status of the delivery configuration. Valid values:</p>
             * <ul>
             * <li><code>Stopped</code>: Delivery is stopped.</li>
             * <li><code>Enabled</code>: Delivery is enabled.</li>
             * <li><code>AbnormalLogstoreDeleted</code>: Delivery is abnormal because the destination Logstore is deleted.</li>
             * <li><code>AbnormalProjectDeleted</code>: Delivery is abnormal because the destination project is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DeliveryScopes build() {
                return new DeliveryScopes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlsDeliveryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlsDeliveryConfigResponseBody</p>
     */
    public static class LogStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryScopes")
        private java.util.List<DeliveryScopes> deliveryScopes;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        private LogStores(Builder builder) {
            this.deliveryScopes = builder.deliveryScopes;
            this.logStoreName = builder.logStoreName;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogStores create() {
            return builder().build();
        }

        /**
         * @return deliveryScopes
         */
        public java.util.List<DeliveryScopes> getDeliveryScopes() {
            return this.deliveryScopes;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private java.util.List<DeliveryScopes> deliveryScopes; 
            private String logStoreName; 
            private Integer ttl; 

            private Builder() {
            } 

            private Builder(LogStores model) {
                this.deliveryScopes = model.deliveryScopes;
                this.logStoreName = model.logStoreName;
                this.ttl = model.ttl;
            } 

            /**
             * <p>The product delivery scopes of the Logstore and the delivery status of each scope.</p>
             */
            public Builder deliveryScopes(java.util.List<DeliveryScopes> deliveryScopes) {
                this.deliveryScopes = deliveryScopes;
                return this;
            }

            /**
             * <p>The name of the destination SLS Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>wuying-session-audit</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The data retention period configured for the destination Logstore, in days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            public LogStores build() {
                return new LogStores(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlsDeliveryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlsDeliveryConfigResponseBody</p>
     */
    public static class DeliveryConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogStores")
        private java.util.List<LogStores> logStores;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SlsRegionId")
        private String slsRegionId;

        private DeliveryConfigs(Builder builder) {
            this.logStores = builder.logStores;
            this.projectName = builder.projectName;
            this.slsRegionId = builder.slsRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryConfigs create() {
            return builder().build();
        }

        /**
         * @return logStores
         */
        public java.util.List<LogStores> getLogStores() {
            return this.logStores;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return slsRegionId
         */
        public String getSlsRegionId() {
            return this.slsRegionId;
        }

        public static final class Builder {
            private java.util.List<LogStores> logStores; 
            private String projectName; 
            private String slsRegionId; 

            private Builder() {
            } 

            private Builder(DeliveryConfigs model) {
                this.logStores = model.logStores;
                this.projectName = model.projectName;
                this.slsRegionId = model.slsRegionId;
            } 

            /**
             * <p>The list of Logstore delivery configurations under the project.</p>
             */
            public Builder logStores(java.util.List<LogStores> logStores) {
                this.logStores = logStores;
                return this;
            }

            /**
             * <p>The name of the destination SLS project.</p>
             * 
             * <strong>example:</strong>
             * <p>wuying-audit-cn-hangzhou</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The ID of the region where the destination SLS project is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder slsRegionId(String slsRegionId) {
                this.slsRegionId = slsRegionId;
                return this;
            }

            public DeliveryConfigs build() {
                return new DeliveryConfigs(this);
            } 

        } 

    }
}
