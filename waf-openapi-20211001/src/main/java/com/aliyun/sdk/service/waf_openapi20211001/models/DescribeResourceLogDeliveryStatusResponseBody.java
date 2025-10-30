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
 * {@link DescribeResourceLogDeliveryStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceLogDeliveryStatusResponseBody</p>
 */
public class DescribeResourceLogDeliveryStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogConfigs")
    private java.util.List<LogConfigs> logConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeResourceLogDeliveryStatusResponseBody(Builder builder) {
        this.logConfigs = builder.logConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceLogDeliveryStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logConfigs
     */
    public java.util.List<LogConfigs> getLogConfigs() {
        return this.logConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<LogConfigs> logConfigs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeResourceLogDeliveryStatusResponseBody model) {
            this.logConfigs = model.logConfigs;
            this.requestId = model.requestId;
        } 

        /**
         * LogConfigs.
         */
        public Builder logConfigs(java.util.List<LogConfigs> logConfigs) {
            this.logConfigs = logConfigs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeResourceLogDeliveryStatusResponseBody build() {
            return new DescribeResourceLogDeliveryStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourceLogDeliveryStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceLogDeliveryStatusResponseBody</p>
     */
    public static class LogConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryName")
        private String deliveryName;

        @com.aliyun.core.annotation.NameInMap("DeliveryType")
        private String deliveryType;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private LogConfigs(Builder builder) {
            this.deliveryName = builder.deliveryName;
            this.deliveryType = builder.deliveryType;
            this.resource = builder.resource;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfigs create() {
            return builder().build();
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

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String deliveryName; 
            private String deliveryType; 
            private String resource; 
            private Boolean status; 

            private Builder() {
            } 

            private Builder(LogConfigs model) {
                this.deliveryName = model.deliveryName;
                this.deliveryType = model.deliveryType;
                this.resource = model.resource;
                this.status = model.status;
            } 

            /**
             * DeliveryName.
             */
            public Builder deliveryName(String deliveryName) {
                this.deliveryName = deliveryName;
                return this;
            }

            /**
             * DeliveryType.
             */
            public Builder deliveryType(String deliveryType) {
                this.deliveryType = deliveryType;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public LogConfigs build() {
                return new LogConfigs(this);
            } 

        } 

    }
}
