// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStorageGatewayResponseBody</p>
 */
public class DescribeStorageGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageGateways")
    private java.util.List < StorageGateways> storageGateways;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeStorageGatewayResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.storageGateways = builder.storageGateways;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageGatewayResponseBody create() {
        return builder().build();
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
     * @return storageGateways
     */
    public java.util.List < StorageGateways> getStorageGateways() {
        return this.storageGateways;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < StorageGateways> storageGateways; 
        private Integer totalCount; 

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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StorageGateways.
         */
        public Builder storageGateways(java.util.List < StorageGateways> storageGateways) {
            this.storageGateways = storageGateways;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeStorageGatewayResponseBody build() {
            return new DescribeStorageGatewayResponseBody(this);
        } 

    } 

    public static class StorageGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("ServiceIp")
        private String serviceIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageGatewayId")
        private String storageGatewayId;

        @com.aliyun.core.annotation.NameInMap("StorageGatewayName")
        private String storageGatewayName;

        @com.aliyun.core.annotation.NameInMap("StorageGatewayType")
        private Integer storageGatewayType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private StorageGateways(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.serviceIp = builder.serviceIp;
            this.status = builder.status;
            this.storageGatewayId = builder.storageGatewayId;
            this.storageGatewayName = builder.storageGatewayName;
            this.storageGatewayType = builder.storageGatewayType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageGateways create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return serviceIp
         */
        public String getServiceIp() {
            return this.serviceIp;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageGatewayId
         */
        public String getStorageGatewayId() {
            return this.storageGatewayId;
        }

        /**
         * @return storageGatewayName
         */
        public String getStorageGatewayName() {
            return this.storageGatewayName;
        }

        /**
         * @return storageGatewayType
         */
        public Integer getStorageGatewayType() {
            return this.storageGatewayType;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String creationTime; 
            private String description; 
            private String ensRegionId; 
            private String serviceIp; 
            private String status; 
            private String storageGatewayId; 
            private String storageGatewayName; 
            private Integer storageGatewayType; 
            private String vpcId; 

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * ServiceIp.
             */
            public Builder serviceIp(String serviceIp) {
                this.serviceIp = serviceIp;
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
             * StorageGatewayId.
             */
            public Builder storageGatewayId(String storageGatewayId) {
                this.storageGatewayId = storageGatewayId;
                return this;
            }

            /**
             * StorageGatewayName.
             */
            public Builder storageGatewayName(String storageGatewayName) {
                this.storageGatewayName = storageGatewayName;
                return this;
            }

            /**
             * StorageGatewayType.
             */
            public Builder storageGatewayType(Integer storageGatewayType) {
                this.storageGatewayType = storageGatewayType;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public StorageGateways build() {
                return new StorageGateways(this);
            } 

        } 

    }
}
