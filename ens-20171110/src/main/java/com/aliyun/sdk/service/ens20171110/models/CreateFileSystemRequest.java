// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileSystemRequest} extends {@link RequestModel}
 *
 * <p>CreateFileSystemRequest</p>
 */
public class CreateFileSystemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderDetails")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < OrderDetails> orderDetails;

    private CreateFileSystemRequest(Builder builder) {
        super(builder);
        this.orderDetails = builder.orderDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileSystemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderDetails
     */
    public java.util.List < OrderDetails> getOrderDetails() {
        return this.orderDetails;
    }

    public static final class Builder extends Request.Builder<CreateFileSystemRequest, Builder> {
        private java.util.List < OrderDetails> orderDetails; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileSystemRequest request) {
            super(request);
            this.orderDetails = request.orderDetails;
        } 

        /**
         * The information about the orders.
         */
        public Builder orderDetails(java.util.List < OrderDetails> orderDetails) {
            String orderDetailsShrink = shrink(orderDetails, "OrderDetails", "json");
            this.putQueryParameter("OrderDetails", orderDetailsShrink);
            this.orderDetails = orderDetails;
            return this;
        }

        @Override
        public CreateFileSystemRequest build() {
            return new CreateFileSystemRequest(this);
        } 

    } 

    public static class OrderDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("FileSystemName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileSystemName;

        @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("StorgeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String storgeType;

        private OrderDetails(Builder builder) {
            this.chargeType = builder.chargeType;
            this.ensRegionId = builder.ensRegionId;
            this.fileSystemName = builder.fileSystemName;
            this.mountTargetDomain = builder.mountTargetDomain;
            this.networkId = builder.networkId;
            this.orderType = builder.orderType;
            this.protocolType = builder.protocolType;
            this.storgeType = builder.storgeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderDetails create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return fileSystemName
         */
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        /**
         * @return mountTargetDomain
         */
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return storgeType
         */
        public String getStorgeType() {
            return this.storgeType;
        }

        public static final class Builder {
            private String chargeType; 
            private String ensRegionId; 
            private String fileSystemName; 
            private String mountTargetDomain; 
            private String networkId; 
            private String orderType; 
            private String protocolType; 
            private String storgeType; 

            /**
             * The billing method of the NAS file system. Valid values:
             * <p>
             * 
             * *   PrePaid: subscription. This billing method is not supported.
             * *   PostPaid: pay-as-you-go.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The ID of the edge node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The name of the file system. The name must be 1 to 80 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).
             */
            public Builder fileSystemName(String fileSystemName) {
                this.fileSystemName = fileSystemName;
                return this;
            }

            /**
             * The name of the mount target. The name must be 1 to 80 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * The type of the order. Set the value to BUY.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * The storage protocol. Valid values: nsf and smb.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The storage type. Valid values:
             * <p>
             * 
             * *   Capacity.
             * *   Performance.
             */
            public Builder storgeType(String storgeType) {
                this.storgeType = storgeType;
                return this;
            }

            public OrderDetails build() {
                return new OrderDetails(this);
            } 

        } 

    }
}
