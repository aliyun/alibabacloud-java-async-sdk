// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeApisecLogDeliveriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecLogDeliveriesResponseBody</p>
 */
public class DescribeApisecLogDeliveriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryConfigs")
    private java.util.List<DeliveryConfigs> deliveryConfigs;

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

        /**
         * <p>The configurations of API security log subscription.</p>
         */
        public Builder deliveryConfigs(java.util.List<DeliveryConfigs> deliveryConfigs) {
            this.deliveryConfigs = deliveryConfigs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApisecLogDeliveriesResponseBody build() {
            return new DescribeApisecLogDeliveriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecLogDeliveriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecLogDeliveriesResponseBody</p>
     */
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
             * <p>The type of the log subscription. Valid values:</p>
             * <ul>
             * <li><strong>risk</strong>: risk information.</li>
             * <li><strong>event</strong>: attack event information.</li>
             * <li><strong>asset</strong>: asset information.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>risk</p>
             */
            public Builder assertKey(String assertKey) {
                this.assertKey = assertKey;
                return this;
            }

            /**
             * <p>The ID of the region where logs are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder logRegionId(String logRegionId) {
                this.logRegionId = logRegionId;
                return this;
            }

            /**
             * <p>The name of the Logstore in Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>apisec-logstore***</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The name of the project in Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>apisec-project-14316572********</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The status of API security log subscription. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled.</li>
             * <li><strong>false</strong>: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
