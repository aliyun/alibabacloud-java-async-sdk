// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeOfflineMachinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOfflineMachinesResponseBody</p>
 */
public class DescribeOfflineMachinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("MachineList")
    private java.util.List < MachineList> machineList;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOfflineMachinesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.machineList = builder.machineList;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOfflineMachinesResponseBody create() {
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
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>An array that consists of the information about servers.</p>
         */
        public Builder machineList(java.util.List < MachineList> machineList) {
            this.machineList = machineList;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOfflineMachinesResponseBody build() {
            return new DescribeOfflineMachinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOfflineMachinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOfflineMachinesResponseBody</p>
     */
    public static class MachineList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("MachineRegion")
        private String machineRegion;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        @com.aliyun.core.annotation.NameInMap("VendorName")
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
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-bdrvxb4b****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-test-001</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>120.79.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The region in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder machineRegion(String machineRegion) {
                this.machineRegion = machineRegion;
                return this;
            }

            /**
             * <p>The operating system of the server. Valid values:</p>
             * <ul>
             * <li><strong>linux</strong></li>
             * <li><strong>windows</strong></li>
             * <li><strong>windows-2003</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The ID of the region in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>6d5b361f-958d-48a8-a9d2-d6e82c1****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The source of the server. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud.</li>
             * <li><strong>1</strong>: a third-party cloud server</li>
             * <li><strong>2</strong>: a server in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
             * <li><strong>8</strong>: a lightweight asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>The name of the service provider (SP) for the server.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>ALIYUN</strong>: Alibaba Cloud</li>
             * <li><strong>OUT</strong>: a third-party service provider</li>
             * <li><strong>IDC</strong>: a data center</li>
             * <li><strong>TENCENT</strong>: Tencent Cloud</li>
             * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
             * <li><strong>Microsoft</strong>: Microsoft</li>
             * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
             * <li><strong>TRIPARTITE</strong>: a lightweight server</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
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
