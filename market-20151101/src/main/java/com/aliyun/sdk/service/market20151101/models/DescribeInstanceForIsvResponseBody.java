// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceForIsvResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceForIsvResponseBody</p>
 */
public class DescribeInstanceForIsvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BeganOn")
    private Long beganOn;

    @com.aliyun.core.annotation.NameInMap("ComponentJson")
    private String componentJson;

    @com.aliyun.core.annotation.NameInMap("CreatedOn")
    private Long createdOn;

    @com.aliyun.core.annotation.NameInMap("EndOn")
    private Long endOn;

    @com.aliyun.core.annotation.NameInMap("ExtendJson")
    private String extendJson;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.NameInMap("IsTrial")
    private Boolean isTrial;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    @com.aliyun.core.annotation.NameInMap("ProductSkuCode")
    private String productSkuCode;

    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.NameInMap("RelationalData")
    private RelationalData relationalData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupplierName")
    private String supplierName;

    private DescribeInstanceForIsvResponseBody(Builder builder) {
        this.beganOn = builder.beganOn;
        this.componentJson = builder.componentJson;
        this.createdOn = builder.createdOn;
        this.endOn = builder.endOn;
        this.extendJson = builder.extendJson;
        this.instanceId = builder.instanceId;
        this.isTrial = builder.isTrial;
        this.orderId = builder.orderId;
        this.productCode = builder.productCode;
        this.productName = builder.productName;
        this.productSkuCode = builder.productSkuCode;
        this.productType = builder.productType;
        this.relationalData = builder.relationalData;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.supplierName = builder.supplierName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceForIsvResponseBody create() {
        return builder().build();
    }

    /**
     * @return beganOn
     */
    public Long getBeganOn() {
        return this.beganOn;
    }

    /**
     * @return componentJson
     */
    public String getComponentJson() {
        return this.componentJson;
    }

    /**
     * @return createdOn
     */
    public Long getCreatedOn() {
        return this.createdOn;
    }

    /**
     * @return endOn
     */
    public Long getEndOn() {
        return this.endOn;
    }

    /**
     * @return extendJson
     */
    public String getExtendJson() {
        return this.extendJson;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isTrial
     */
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return productSkuCode
     */
    public String getProductSkuCode() {
        return this.productSkuCode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return relationalData
     */
    public RelationalData getRelationalData() {
        return this.relationalData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supplierName
     */
    public String getSupplierName() {
        return this.supplierName;
    }

    public static final class Builder {
        private Long beganOn; 
        private String componentJson; 
        private Long createdOn; 
        private Long endOn; 
        private String extendJson; 
        private Long instanceId; 
        private Boolean isTrial; 
        private Long orderId; 
        private String productCode; 
        private String productName; 
        private String productSkuCode; 
        private String productType; 
        private RelationalData relationalData; 
        private String requestId; 
        private String status; 
        private String supplierName; 

        /**
         * BeganOn.
         */
        public Builder beganOn(Long beganOn) {
            this.beganOn = beganOn;
            return this;
        }

        /**
         * ComponentJson.
         */
        public Builder componentJson(String componentJson) {
            this.componentJson = componentJson;
            return this;
        }

        /**
         * CreatedOn.
         */
        public Builder createdOn(Long createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * EndOn.
         */
        public Builder endOn(Long endOn) {
            this.endOn = endOn;
            return this;
        }

        /**
         * ExtendJson.
         */
        public Builder extendJson(String extendJson) {
            this.extendJson = extendJson;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsTrial.
         */
        public Builder isTrial(Boolean isTrial) {
            this.isTrial = isTrial;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductName.
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * ProductSkuCode.
         */
        public Builder productSkuCode(String productSkuCode) {
            this.productSkuCode = productSkuCode;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        /**
         * RelationalData.
         */
        public Builder relationalData(RelationalData relationalData) {
            this.relationalData = relationalData;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SupplierName.
         */
        public Builder supplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        public DescribeInstanceForIsvResponseBody build() {
            return new DescribeInstanceForIsvResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceForIsvResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceForIsvResponseBody</p>
     */
    public static class RelationalData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private String serviceStatus;

        private RelationalData(Builder builder) {
            this.serviceStatus = builder.serviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationalData create() {
            return builder().build();
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private String serviceStatus; 

            /**
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            public RelationalData build() {
                return new RelationalData(this);
            } 

        } 

    }
}
