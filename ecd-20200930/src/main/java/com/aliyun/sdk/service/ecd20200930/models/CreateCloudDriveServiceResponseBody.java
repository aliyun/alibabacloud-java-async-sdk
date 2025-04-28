// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateCloudDriveServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudDriveServiceResponseBody</p>
 */
public class CreateCloudDriveServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CdsId")
    private String cdsId;

    @com.aliyun.core.annotation.NameInMap("CdsName")
    private String cdsName;

    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.NameInMap("ConflictCdsAndOrder")
    private ConflictCdsAndOrder conflictCdsAndOrder;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("MaxSize")
    private String maxSize;

    @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
    private String officeSiteType;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCloudDriveServiceResponseBody(Builder builder) {
        this.cdsId = builder.cdsId;
        this.cdsName = builder.cdsName;
        this.cenId = builder.cenId;
        this.conflictCdsAndOrder = builder.conflictCdsAndOrder;
        this.domainName = builder.domainName;
        this.errorCode = builder.errorCode;
        this.maxSize = builder.maxSize;
        this.officeSiteType = builder.officeSiteType;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudDriveServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return cdsName
     */
    public String getCdsName() {
        return this.cdsName;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return conflictCdsAndOrder
     */
    public ConflictCdsAndOrder getConflictCdsAndOrder() {
        return this.conflictCdsAndOrder;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return maxSize
     */
    public String getMaxSize() {
        return this.maxSize;
    }

    /**
     * @return officeSiteType
     */
    public String getOfficeSiteType() {
        return this.officeSiteType;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cdsId; 
        private String cdsName; 
        private String cenId; 
        private ConflictCdsAndOrder conflictCdsAndOrder; 
        private String domainName; 
        private String errorCode; 
        private String maxSize; 
        private String officeSiteType; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCloudDriveServiceResponseBody model) {
            this.cdsId = model.cdsId;
            this.cdsName = model.cdsName;
            this.cenId = model.cenId;
            this.conflictCdsAndOrder = model.conflictCdsAndOrder;
            this.domainName = model.domainName;
            this.errorCode = model.errorCode;
            this.maxSize = model.maxSize;
            this.officeSiteType = model.officeSiteType;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the enterprise drive.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-7782057786</p>
         */
        public Builder cdsId(String cdsId) {
            this.cdsId = cdsId;
            return this;
        }

        /**
         * <p>The name of the cloud disk that is created in Cloud Drive Service.</p>
         * 
         * <strong>example:</strong>
         * <p>CDS_Windows_1126</p>
         */
        public Builder cdsName(String cdsName) {
            this.cdsName = cdsName;
            return this;
        }

        /**
         * <p>The ID of the CEN instance.</p>
         * <blockquote>
         * <p> To allow end users to connect to cloud computers via virtual private clouds (VPCs), attach your office network to a CEN instance. The CEN instance connects to your on-premises network through VPN Gateway or Express Connect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cen-638u3wxds9snyc****</p>
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The existing enterprise drive or its order that conflicts with the enterprise drive being created.</p>
         */
        public Builder conflictCdsAndOrder(ConflictCdsAndOrder conflictCdsAndOrder) {
            this.conflictCdsAndOrder = conflictCdsAndOrder;
            return this;
        }

        /**
         * <p>The domain name of the enterprise AD office network.</p>
         * 
         * <strong>example:</strong>
         * <p>test1.local</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ExistConflictCds</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The maximum storage capacity of the enterprise drive. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>213674622976</p>
         */
        public Builder maxSize(String maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        /**
         * <p>The type of the office network.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SIMPLE: convenience office network.</li>
         * <li>AD_CONNECTOR: enterprise AD office network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AD_CONNECTOR</p>
         */
        public Builder officeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }

        /**
         * <p>The ID of the order. You can obtain an order ID on the Orders page in the Expenses and Costs console.</p>
         * 
         * <strong>example:</strong>
         * <p>214552063030752</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>062B1439-709A-580E-85DF-CE97A1560565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCloudDriveServiceResponseBody build() {
            return new CreateCloudDriveServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCloudDriveServiceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCloudDriveServiceResponseBody</p>
     */
    public static class ConflictCds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdsId")
        private String cdsId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private ConflictCds(Builder builder) {
            this.cdsId = builder.cdsId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConflictCds create() {
            return builder().build();
        }

        /**
         * @return cdsId
         */
        public String getCdsId() {
            return this.cdsId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String cdsId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(ConflictCds model) {
                this.cdsId = model.cdsId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The ID of the enterprise drive.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+cds-778205****</p>
             */
            public Builder cdsId(String cdsId) {
                this.cdsId = cdsId;
                return this;
            }

            /**
             * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public ConflictCds build() {
                return new ConflictCds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCloudDriveServiceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCloudDriveServiceResponseBody</p>
     */
    public static class ConflictOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdsId")
        private String cdsId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private ConflictOrder(Builder builder) {
            this.cdsId = builder.cdsId;
            this.orderId = builder.orderId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConflictOrder create() {
            return builder().build();
        }

        /**
         * @return cdsId
         */
        public String getCdsId() {
            return this.cdsId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String cdsId; 
            private String orderId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(ConflictOrder model) {
                this.cdsId = model.cdsId;
                this.orderId = model.orderId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The ID of the enterprise drive. The enterprise drive cannot be used if the order is unpaid.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+cds-778205****</p>
             */
            public Builder cdsId(String cdsId) {
                this.cdsId = cdsId;
                return this;
            }

            /**
             * <p>The ID of the order. You can obtain an order ID on the <strong>Orders</strong> page in the Expenses and Costs console.</p>
             * 
             * <strong>example:</strong>
             * <p>22442411898****</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public ConflictOrder build() {
                return new ConflictOrder(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCloudDriveServiceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCloudDriveServiceResponseBody</p>
     */
    public static class ConflictCdsAndOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConflictCds")
        private java.util.List<ConflictCds> conflictCds;

        @com.aliyun.core.annotation.NameInMap("ConflictOrder")
        private java.util.List<ConflictOrder> conflictOrder;

        private ConflictCdsAndOrder(Builder builder) {
            this.conflictCds = builder.conflictCds;
            this.conflictOrder = builder.conflictOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConflictCdsAndOrder create() {
            return builder().build();
        }

        /**
         * @return conflictCds
         */
        public java.util.List<ConflictCds> getConflictCds() {
            return this.conflictCds;
        }

        /**
         * @return conflictOrder
         */
        public java.util.List<ConflictOrder> getConflictOrder() {
            return this.conflictOrder;
        }

        public static final class Builder {
            private java.util.List<ConflictCds> conflictCds; 
            private java.util.List<ConflictOrder> conflictOrder; 

            private Builder() {
            } 

            private Builder(ConflictCdsAndOrder model) {
                this.conflictCds = model.conflictCds;
                this.conflictOrder = model.conflictOrder;
            } 

            /**
             * <p>The conflicting enterprise drive.</p>
             */
            public Builder conflictCds(java.util.List<ConflictCds> conflictCds) {
                this.conflictCds = conflictCds;
                return this;
            }

            /**
             * <p>The subscription orders of the conflicting enterprise drives that are unpaid.</p>
             */
            public Builder conflictOrder(java.util.List<ConflictOrder> conflictOrder) {
                this.conflictOrder = conflictOrder;
                return this;
            }

            public ConflictCdsAndOrder build() {
                return new ConflictCdsAndOrder(this);
            } 

        } 

    }
}
