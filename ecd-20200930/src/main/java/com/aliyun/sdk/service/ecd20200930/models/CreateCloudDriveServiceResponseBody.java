// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudDriveServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudDriveServiceResponseBody</p>
 */
public class CreateCloudDriveServiceResponseBody extends TeaModel {
    @NameInMap("CdsId")
    private String cdsId;

    @NameInMap("CdsName")
    private String cdsName;

    @NameInMap("CenId")
    private String cenId;

    @NameInMap("ConflictCdsAndOrder")
    private ConflictCdsAndOrder conflictCdsAndOrder;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("MaxSize")
    private String maxSize;

    @NameInMap("OfficeSiteType")
    private String officeSiteType;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
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

        /**
         * The ID of the attached cloud disk.
         */
        public Builder cdsId(String cdsId) {
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The name of the cloud disk that is created in Cloud Drive Service.
         */
        public Builder cdsName(String cdsName) {
            this.cdsName = cdsName;
            return this;
        }

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * ConflictCdsAndOrder.
         */
        public Builder conflictCdsAndOrder(ConflictCdsAndOrder conflictCdsAndOrder) {
            this.conflictCdsAndOrder = conflictCdsAndOrder;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The maximum capacity of each instance in Cloud Drive Service. Unit: GiB
         */
        public Builder maxSize(String maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        /**
         * OfficeSiteType.
         */
        public Builder officeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCloudDriveServiceResponseBody build() {
            return new CreateCloudDriveServiceResponseBody(this);
        } 

    } 

    public static class ConflictCds extends TeaModel {
        @NameInMap("CdsId")
        private String cdsId;

        @NameInMap("RegionId")
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

            /**
             * The ID of the attached cloud disk.
             */
            public Builder cdsId(String cdsId) {
                this.cdsId = cdsId;
                return this;
            }

            /**
             * RegionId.
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
    public static class ConflictOrder extends TeaModel {
        @NameInMap("CdsId")
        private String cdsId;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("RegionId")
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

            /**
             * The ID of the attached cloud disk.
             */
            public Builder cdsId(String cdsId) {
                this.cdsId = cdsId;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * RegionId.
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
    public static class ConflictCdsAndOrder extends TeaModel {
        @NameInMap("ConflictCds")
        private java.util.List < ConflictCds> conflictCds;

        @NameInMap("ConflictOrder")
        private java.util.List < ConflictOrder> conflictOrder;

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
        public java.util.List < ConflictCds> getConflictCds() {
            return this.conflictCds;
        }

        /**
         * @return conflictOrder
         */
        public java.util.List < ConflictOrder> getConflictOrder() {
            return this.conflictOrder;
        }

        public static final class Builder {
            private java.util.List < ConflictCds> conflictCds; 
            private java.util.List < ConflictOrder> conflictOrder; 

            /**
             * ConflictCds.
             */
            public Builder conflictCds(java.util.List < ConflictCds> conflictCds) {
                this.conflictCds = conflictCds;
                return this;
            }

            /**
             * ConflictOrder.
             */
            public Builder conflictOrder(java.util.List < ConflictOrder> conflictOrder) {
                this.conflictOrder = conflictOrder;
                return this;
            }

            public ConflictCdsAndOrder build() {
                return new ConflictCdsAndOrder(this);
            } 

        } 

    }
}
