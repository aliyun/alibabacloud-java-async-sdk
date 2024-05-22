// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionIdResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsRegionIdResourceResponseBody</p>
 */
public class DescribeEnsRegionIdResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnsRegionIdResources")
    private EnsRegionIdResources ensRegionIdResources;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEnsRegionIdResourceResponseBody(Builder builder) {
        this.ensRegionIdResources = builder.ensRegionIdResources;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRegionIdResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return ensRegionIdResources
     */
    public EnsRegionIdResources getEnsRegionIdResources() {
        return this.ensRegionIdResources;
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
        private EnsRegionIdResources ensRegionIdResources; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The returned data. For more information, see EnsRegionIdResources in sample JSON responses.
         */
        public Builder ensRegionIdResources(EnsRegionIdResources ensRegionIdResources) {
            this.ensRegionIdResources = ensRegionIdResources;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of queried nodes.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEnsRegionIdResourceResponseBody build() {
            return new DescribeEnsRegionIdResourceResponseBody(this);
        } 

    } 

    public static class EnsRegionIdResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("EnsRegionIdName")
        private String ensRegionIdName;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("InternetBandwidth")
        private Long internetBandwidth;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("VCpu")
        private Integer vCpu;

        private EnsRegionIdResource(Builder builder) {
            this.area = builder.area;
            this.areaCode = builder.areaCode;
            this.bizDate = builder.bizDate;
            this.ensRegionId = builder.ensRegionId;
            this.ensRegionIdName = builder.ensRegionIdName;
            this.instanceCount = builder.instanceCount;
            this.internetBandwidth = builder.internetBandwidth;
            this.isp = builder.isp;
            this.vCpu = builder.vCpu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsRegionIdResource create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return ensRegionIdName
         */
        public String getEnsRegionIdName() {
            return this.ensRegionIdName;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return internetBandwidth
         */
        public Long getInternetBandwidth() {
            return this.internetBandwidth;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return vCpu
         */
        public Integer getVCpu() {
            return this.vCpu;
        }

        public static final class Builder {
            private String area; 
            private String areaCode; 
            private String bizDate; 
            private String ensRegionId; 
            private String ensRegionIdName; 
            private Integer instanceCount; 
            private Long internetBandwidth; 
            private String isp; 
            private Integer vCpu; 

            /**
             * The region. Set the value to West.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * The code of the region.
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * The date when the transaction was processed.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder ensRegionIdName(String ensRegionIdName) {
                this.ensRegionIdName = ensRegionIdName;
                return this;
            }

            /**
             * The number of instances.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The public bandwidth of the instance. Unit: Bits/s.
             */
            public Builder internetBandwidth(Long internetBandwidth) {
                this.internetBandwidth = internetBandwidth;
                return this;
            }

            /**
             * The ISP. Valid values:
             * <p>
             * 
             * *   cmcc: China Mobile
             * *   unicom: China Unicom
             * *   telecom: China Telecom
             * *   multiCarrier: multi-line ISP
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * The number of vCPUs.
             */
            public Builder vCpu(Integer vCpu) {
                this.vCpu = vCpu;
                return this;
            }

            public EnsRegionIdResource build() {
                return new EnsRegionIdResource(this);
            } 

        } 

    }
    public static class EnsRegionIdResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionIdResource")
        private java.util.List < EnsRegionIdResource> ensRegionIdResource;

        private EnsRegionIdResources(Builder builder) {
            this.ensRegionIdResource = builder.ensRegionIdResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsRegionIdResources create() {
            return builder().build();
        }

        /**
         * @return ensRegionIdResource
         */
        public java.util.List < EnsRegionIdResource> getEnsRegionIdResource() {
            return this.ensRegionIdResource;
        }

        public static final class Builder {
            private java.util.List < EnsRegionIdResource> ensRegionIdResource; 

            /**
             * EnsRegionIdResource.
             */
            public Builder ensRegionIdResource(java.util.List < EnsRegionIdResource> ensRegionIdResource) {
                this.ensRegionIdResource = ensRegionIdResource;
                return this;
            }

            public EnsRegionIdResources build() {
                return new EnsRegionIdResources(this);
            } 

        } 

    }
}
