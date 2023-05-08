// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUninstallAegisMachinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUninstallAegisMachinesResponseBody</p>
 */
public class ListUninstallAegisMachinesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("MachineList")
    private java.util.List < MachineList> machineList;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListUninstallAegisMachinesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.machineList = builder.machineList;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUninstallAegisMachinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return machineList
     */
    public java.util.List < MachineList> getMachineList() {
        return this.machineList;
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
        private Integer currentPage; 
        private java.util.List < MachineList> machineList; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * MachineList.
         */
        public Builder machineList(java.util.List < MachineList> machineList) {
            this.machineList = machineList;
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

        public ListUninstallAegisMachinesResponseBody build() {
            return new ListUninstallAegisMachinesResponseBody(this);
        } 

    } 

    public static class MachineList extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("MachineRegion")
        private String machineRegion;

        @NameInMap("Os")
        private String os;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("Vendor")
        private Integer vendor;

        @NameInMap("VendorName")
        private String vendorName;

        private MachineList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.machineRegion = builder.machineRegion;
            this.os = builder.os;
            this.regionId = builder.regionId;
            this.uuid = builder.uuid;
            this.vendor = builder.vendor;
            this.vendorName = builder.vendorName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return machineRegion
         */
        public String getMachineRegion() {
            return this.machineRegion;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        /**
         * @return vendorName
         */
        public String getVendorName() {
            return this.vendorName;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String machineRegion; 
            private String os; 
            private String regionId; 
            private String uuid; 
            private Integer vendor; 
            private String vendorName; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * MachineRegion.
             */
            public Builder machineRegion(String machineRegion) {
                this.machineRegion = machineRegion;
                return this;
            }

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * VendorName.
             */
            public Builder vendorName(String vendorName) {
                this.vendorName = vendorName;
                return this;
            }

            public MachineList build() {
                return new MachineList(this);
            } 

        } 

    }
}
