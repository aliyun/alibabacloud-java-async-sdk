// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionIdResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsRegionIdResourceResponseBody</p>
 */
public class DescribeEnsRegionIdResourceResponseBody extends TeaModel {
    @NameInMap("EnsRegionIdResources")
    private EnsRegionIdResources ensRegionIdResources;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * EnsRegionIdResources.
         */
        public Builder ensRegionIdResources(EnsRegionIdResources ensRegionIdResources) {
            this.ensRegionIdResources = ensRegionIdResources;
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

        public DescribeEnsRegionIdResourceResponseBody build() {
            return new DescribeEnsRegionIdResourceResponseBody(this);
        } 

    } 

    public static class EnsRegionIdResource extends TeaModel {
        @NameInMap("Area")
        private String area;

        @NameInMap("AreaCode")
        private String areaCode;

        @NameInMap("BizDate")
        private String bizDate;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("EnsRegionIdName")
        private String ensRegionIdName;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("InternetBandwidth")
        private Long internetBandwidth;

        @NameInMap("Isp")
        private String isp;

        @NameInMap("VCpu")
        private Integer VCpu;

        private EnsRegionIdResource(Builder builder) {
            this.area = builder.area;
            this.areaCode = builder.areaCode;
            this.bizDate = builder.bizDate;
            this.ensRegionId = builder.ensRegionId;
            this.ensRegionIdName = builder.ensRegionIdName;
            this.instanceCount = builder.instanceCount;
            this.internetBandwidth = builder.internetBandwidth;
            this.isp = builder.isp;
            this.VCpu = builder.VCpu;
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
         * @return VCpu
         */
        public Integer getVCpu() {
            return this.VCpu;
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
            private Integer VCpu; 

            /**
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * AreaCode.
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * BizDate.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
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
             * EnsRegionIdName.
             */
            public Builder ensRegionIdName(String ensRegionIdName) {
                this.ensRegionIdName = ensRegionIdName;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * InternetBandwidth.
             */
            public Builder internetBandwidth(Long internetBandwidth) {
                this.internetBandwidth = internetBandwidth;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * VCpu.
             */
            public Builder VCpu(Integer VCpu) {
                this.VCpu = VCpu;
                return this;
            }

            public EnsRegionIdResource build() {
                return new EnsRegionIdResource(this);
            } 

        } 

    }
    public static class EnsRegionIdResources extends TeaModel {
        @NameInMap("EnsRegionIdResource")
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
