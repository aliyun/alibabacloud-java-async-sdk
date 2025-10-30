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
 * {@link DescribeResourceLogFieldConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceLogFieldConfigResponseBody</p>
 */
public class DescribeResourceLogFieldConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddList")
    private String addList;

    @com.aliyun.core.annotation.NameInMap("DelList")
    private String delList;

    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    private String deliveryType;

    @com.aliyun.core.annotation.NameInMap("ExtendConfig")
    private String extendConfig;

    @com.aliyun.core.annotation.NameInMap("FieldList")
    private String fieldList;

    @com.aliyun.core.annotation.NameInMap("LogDeliveryStrategy")
    private String logDeliveryStrategy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeResourceLogFieldConfigResponseBody(Builder builder) {
        this.addList = builder.addList;
        this.delList = builder.delList;
        this.deliveryType = builder.deliveryType;
        this.extendConfig = builder.extendConfig;
        this.fieldList = builder.fieldList;
        this.logDeliveryStrategy = builder.logDeliveryStrategy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceLogFieldConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addList
     */
    public String getAddList() {
        return this.addList;
    }

    /**
     * @return delList
     */
    public String getDelList() {
        return this.delList;
    }

    /**
     * @return deliveryType
     */
    public String getDeliveryType() {
        return this.deliveryType;
    }

    /**
     * @return extendConfig
     */
    public String getExtendConfig() {
        return this.extendConfig;
    }

    /**
     * @return fieldList
     */
    public String getFieldList() {
        return this.fieldList;
    }

    /**
     * @return logDeliveryStrategy
     */
    public String getLogDeliveryStrategy() {
        return this.logDeliveryStrategy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String addList; 
        private String delList; 
        private String deliveryType; 
        private String extendConfig; 
        private String fieldList; 
        private String logDeliveryStrategy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeResourceLogFieldConfigResponseBody model) {
            this.addList = model.addList;
            this.delList = model.delList;
            this.deliveryType = model.deliveryType;
            this.extendConfig = model.extendConfig;
            this.fieldList = model.fieldList;
            this.logDeliveryStrategy = model.logDeliveryStrategy;
            this.requestId = model.requestId;
        } 

        /**
         * AddList.
         */
        public Builder addList(String addList) {
            this.addList = addList;
            return this;
        }

        /**
         * DelList.
         */
        public Builder delList(String delList) {
            this.delList = delList;
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
         * ExtendConfig.
         */
        public Builder extendConfig(String extendConfig) {
            this.extendConfig = extendConfig;
            return this;
        }

        /**
         * FieldList.
         */
        public Builder fieldList(String fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        /**
         * LogDeliveryStrategy.
         */
        public Builder logDeliveryStrategy(String logDeliveryStrategy) {
            this.logDeliveryStrategy = logDeliveryStrategy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeResourceLogFieldConfigResponseBody build() {
            return new DescribeResourceLogFieldConfigResponseBody(this);
        } 

    } 

}
