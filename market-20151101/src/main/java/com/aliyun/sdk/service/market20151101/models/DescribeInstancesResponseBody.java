// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceItems")
    private InstanceItems instanceItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instanceItems = builder.instanceItems;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceItems
     */
    public InstanceItems getInstanceItems() {
        return this.instanceItems;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private InstanceItems instanceItems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InstanceItems.
         */
        public Builder instanceItems(InstanceItems instanceItems) {
            this.instanceItems = instanceItems;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class InstanceItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiJson")
        private String apiJson;

        @com.aliyun.core.annotation.NameInMap("AppJson")
        private String appJson;

        @com.aliyun.core.annotation.NameInMap("BeganOn")
        private Long beganOn;

        @com.aliyun.core.annotation.NameInMap("CreatedOn")
        private Long createdOn;

        @com.aliyun.core.annotation.NameInMap("EndOn")
        private Long endOn;

        @com.aliyun.core.annotation.NameInMap("ExtendJson")
        private String extendJson;

        @com.aliyun.core.annotation.NameInMap("HostJson")
        private String hostJson;

        @com.aliyun.core.annotation.NameInMap("IdaasJson")
        private String idaasJson;

        @com.aliyun.core.annotation.NameInMap("ImageJson")
        private String imageJson;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        private InstanceItem(Builder builder) {
            this.apiJson = builder.apiJson;
            this.appJson = builder.appJson;
            this.beganOn = builder.beganOn;
            this.createdOn = builder.createdOn;
            this.endOn = builder.endOn;
            this.extendJson = builder.extendJson;
            this.hostJson = builder.hostJson;
            this.idaasJson = builder.idaasJson;
            this.imageJson = builder.imageJson;
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.productSkuCode = builder.productSkuCode;
            this.productType = builder.productType;
            this.status = builder.status;
            this.supplierName = builder.supplierName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceItem create() {
            return builder().build();
        }

        /**
         * @return apiJson
         */
        public String getApiJson() {
            return this.apiJson;
        }

        /**
         * @return appJson
         */
        public String getAppJson() {
            return this.appJson;
        }

        /**
         * @return beganOn
         */
        public Long getBeganOn() {
            return this.beganOn;
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
         * @return hostJson
         */
        public String getHostJson() {
            return this.hostJson;
        }

        /**
         * @return idaasJson
         */
        public String getIdaasJson() {
            return this.idaasJson;
        }

        /**
         * @return imageJson
         */
        public String getImageJson() {
            return this.imageJson;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
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
            private String apiJson; 
            private String appJson; 
            private Long beganOn; 
            private Long createdOn; 
            private Long endOn; 
            private String extendJson; 
            private String hostJson; 
            private String idaasJson; 
            private String imageJson; 
            private Long instanceId; 
            private Long orderId; 
            private String productCode; 
            private String productName; 
            private String productSkuCode; 
            private String productType; 
            private String status; 
            private String supplierName; 

            /**
             * ApiJson.
             */
            public Builder apiJson(String apiJson) {
                this.apiJson = apiJson;
                return this;
            }

            /**
             * AppJson.
             */
            public Builder appJson(String appJson) {
                this.appJson = appJson;
                return this;
            }

            /**
             * BeganOn.
             */
            public Builder beganOn(Long beganOn) {
                this.beganOn = beganOn;
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
             * HostJson.
             */
            public Builder hostJson(String hostJson) {
                this.hostJson = hostJson;
                return this;
            }

            /**
             * IdaasJson.
             */
            public Builder idaasJson(String idaasJson) {
                this.idaasJson = idaasJson;
                return this;
            }

            /**
             * ImageJson.
             */
            public Builder imageJson(String imageJson) {
                this.imageJson = imageJson;
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

            public InstanceItem build() {
                return new InstanceItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class InstanceItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceItem")
        private java.util.List<InstanceItem> instanceItem;

        private InstanceItems(Builder builder) {
            this.instanceItem = builder.instanceItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceItems create() {
            return builder().build();
        }

        /**
         * @return instanceItem
         */
        public java.util.List<InstanceItem> getInstanceItem() {
            return this.instanceItem;
        }

        public static final class Builder {
            private java.util.List<InstanceItem> instanceItem; 

            /**
             * InstanceItem.
             */
            public Builder instanceItem(java.util.List<InstanceItem> instanceItem) {
                this.instanceItem = instanceItem;
                return this;
            }

            public InstanceItems build() {
                return new InstanceItems(this);
            } 

        } 

    }
}
