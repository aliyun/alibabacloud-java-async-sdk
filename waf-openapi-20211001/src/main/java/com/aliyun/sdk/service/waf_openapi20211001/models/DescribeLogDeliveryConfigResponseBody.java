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
 * {@link DescribeLogDeliveryConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogDeliveryConfigResponseBody</p>
 */
public class DescribeLogDeliveryConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryConfig")
    private DeliveryConfig deliveryConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLogDeliveryConfigResponseBody(Builder builder) {
        this.deliveryConfig = builder.deliveryConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogDeliveryConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryConfig
     */
    public DeliveryConfig getDeliveryConfig() {
        return this.deliveryConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeliveryConfig deliveryConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLogDeliveryConfigResponseBody model) {
            this.deliveryConfig = model.deliveryConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the log delivery configuration.</p>
         */
        public Builder deliveryConfig(DeliveryConfig deliveryConfig) {
            this.deliveryConfig = deliveryConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>66A98669-CC6E-4F3E-80A6-******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogDeliveryConfigResponseBody build() {
            return new DescribeLogDeliveryConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogDeliveryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogDeliveryConfigResponseBody</p>
     */
    public static class DeliveryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryDetail")
        private String deliveryDetail;

        @com.aliyun.core.annotation.NameInMap("DeliveryName")
        private String deliveryName;

        @com.aliyun.core.annotation.NameInMap("DeliveryType")
        private String deliveryType;

        private DeliveryConfig(Builder builder) {
            this.deliveryDetail = builder.deliveryDetail;
            this.deliveryName = builder.deliveryName;
            this.deliveryType = builder.deliveryType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryConfig create() {
            return builder().build();
        }

        /**
         * @return deliveryDetail
         */
        public String getDeliveryDetail() {
            return this.deliveryDetail;
        }

        /**
         * @return deliveryName
         */
        public String getDeliveryName() {
            return this.deliveryName;
        }

        /**
         * @return deliveryType
         */
        public String getDeliveryType() {
            return this.deliveryType;
        }

        public static final class Builder {
            private String deliveryDetail; 
            private String deliveryName; 
            private String deliveryType; 

            private Builder() {
            } 

            private Builder(DeliveryConfig model) {
                this.deliveryDetail = model.deliveryDetail;
                this.deliveryName = model.deliveryName;
                this.deliveryType = model.deliveryType;
            } 

            /**
             * <p>The content of the log delivery configuration. The value is a JSON string that contains multiple parameters.</p>
             * <blockquote>
             * <p> This parameter is the same as the <strong>DeliveryDetail</strong> parameter of the <strong>CreateLogDeliveryConfig</strong> operation. For more information, see <strong>Parameter description for log delivery configuration</strong> of the <a href="~~CreateLogDeliveryConfig~~">CreateLogDeliveryConfig</a> operation.</p>
             * </blockquote>
             */
            public Builder deliveryDetail(String deliveryDetail) {
                this.deliveryDetail = deliveryDetail;
                return this;
            }

            /**
             * <p>The name of the log delivery configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder deliveryName(String deliveryName) {
                this.deliveryName = deliveryName;
                return this;
            }

            /**
             * <p>The type of the log delivery configuration. Valid values:</p>
             * <ul>
             * <li><strong>syslog</strong>: Logs are delivered to a syslog service.</li>
             * <li><strong>kafka</strong>: Logs are delivered to a Kafka service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>syslog</p>
             */
            public Builder deliveryType(String deliveryType) {
                this.deliveryType = deliveryType;
                return this;
            }

            public DeliveryConfig build() {
                return new DeliveryConfig(this);
            } 

        } 

    }
}
