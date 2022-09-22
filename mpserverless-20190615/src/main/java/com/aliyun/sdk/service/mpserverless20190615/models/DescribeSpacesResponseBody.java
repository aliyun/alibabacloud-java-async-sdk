// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSpacesResponseBody</p>
 */
public class DescribeSpacesResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Spaces")
    private java.util.List < Spaces> spaces;

    private DescribeSpacesResponseBody(Builder builder) {
        this.count = builder.count;
        this.gmtCreate = builder.gmtCreate;
        this.requestId = builder.requestId;
        this.spaces = builder.spaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spaces
     */
    public java.util.List < Spaces> getSpaces() {
        return this.spaces;
    }

    public static final class Builder {
        private Integer count; 
        private String gmtCreate; 
        private String requestId; 
        private java.util.List < Spaces> spaces; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
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
         * Spaces.
         */
        public Builder spaces(java.util.List < Spaces> spaces) {
            this.spaces = spaces;
            return this;
        }

        public DescribeSpacesResponseBody build() {
            return new DescribeSpacesResponseBody(this);
        } 

    } 

    public static class Spaces extends TeaModel {
        @NameInMap("AutoRenew")
        private Boolean autoRenew;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Description")
        private String description;

        @NameInMap("EmasWorkspaceId")
        private Long emasWorkspaceId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("OrderType")
        private String orderType;

        @NameInMap("PackageEndDate")
        private String packageEndDate;

        @NameInMap("PackageStartDate")
        private String packageStartDate;

        @NameInMap("PackageStatus")
        private String packageStatus;

        @NameInMap("RenewDuration")
        private String renewDuration;

        @NameInMap("ServiceStatus")
        private String serviceStatus;

        @NameInMap("SpaceId")
        private String spaceId;

        @NameInMap("SpecCode")
        private String specCode;

        private Spaces(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.chargeType = builder.chargeType;
            this.description = builder.description;
            this.emasWorkspaceId = builder.emasWorkspaceId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.orderType = builder.orderType;
            this.packageEndDate = builder.packageEndDate;
            this.packageStartDate = builder.packageStartDate;
            this.packageStatus = builder.packageStatus;
            this.renewDuration = builder.renewDuration;
            this.serviceStatus = builder.serviceStatus;
            this.spaceId = builder.spaceId;
            this.specCode = builder.specCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spaces create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return emasWorkspaceId
         */
        public Long getEmasWorkspaceId() {
            return this.emasWorkspaceId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return packageEndDate
         */
        public String getPackageEndDate() {
            return this.packageEndDate;
        }

        /**
         * @return packageStartDate
         */
        public String getPackageStartDate() {
            return this.packageStartDate;
        }

        /**
         * @return packageStatus
         */
        public String getPackageStatus() {
            return this.packageStatus;
        }

        /**
         * @return renewDuration
         */
        public String getRenewDuration() {
            return this.renewDuration;
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return spaceId
         */
        public String getSpaceId() {
            return this.spaceId;
        }

        /**
         * @return specCode
         */
        public String getSpecCode() {
            return this.specCode;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private String chargeType; 
            private String description; 
            private Long emasWorkspaceId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String instanceId; 
            private String name; 
            private String orderType; 
            private String packageEndDate; 
            private String packageStartDate; 
            private String packageStatus; 
            private String renewDuration; 
            private String serviceStatus; 
            private String spaceId; 
            private String specCode; 

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
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
             * EmasWorkspaceId.
             */
            public Builder emasWorkspaceId(Long emasWorkspaceId) {
                this.emasWorkspaceId = emasWorkspaceId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * PackageEndDate.
             */
            public Builder packageEndDate(String packageEndDate) {
                this.packageEndDate = packageEndDate;
                return this;
            }

            /**
             * PackageStartDate.
             */
            public Builder packageStartDate(String packageStartDate) {
                this.packageStartDate = packageStartDate;
                return this;
            }

            /**
             * PackageStatus.
             */
            public Builder packageStatus(String packageStatus) {
                this.packageStatus = packageStatus;
                return this;
            }

            /**
             * RenewDuration.
             */
            public Builder renewDuration(String renewDuration) {
                this.renewDuration = renewDuration;
                return this;
            }

            /**
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * SpaceId.
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * SpecCode.
             */
            public Builder specCode(String specCode) {
                this.specCode = specCode;
                return this;
            }

            public Spaces build() {
                return new Spaces(this);
            } 

        } 

    }
}
