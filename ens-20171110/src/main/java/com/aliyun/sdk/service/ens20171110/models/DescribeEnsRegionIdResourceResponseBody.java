// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEnsRegionIdResourceResponseBody model) {
            this.ensRegionIdResources = model.ensRegionIdResources;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The returned data. For more information, see EnsRegionIdResources in sample JSON responses.</p>
         */
        public Builder ensRegionIdResources(EnsRegionIdResources ensRegionIdResources) {
            this.ensRegionIdResources = ensRegionIdResources;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>476600B1-C9E2-4245-A26F-DC7EA8071425</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of queried nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEnsRegionIdResourceResponseBody build() {
            return new DescribeEnsRegionIdResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnsRegionIdResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsRegionIdResourceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(EnsRegionIdResource model) {
                this.area = model.area;
                this.areaCode = model.areaCode;
                this.bizDate = model.bizDate;
                this.ensRegionId = model.ensRegionId;
                this.ensRegionIdName = model.ensRegionIdName;
                this.instanceCount = model.instanceCount;
                this.internetBandwidth = model.internetBandwidth;
                this.isp = model.isp;
                this.vCpu = model.vCpu;
            } 

            /**
             * <p>The region. Set the value to West.</p>
             * 
             * <strong>example:</strong>
             * <p>West</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The code of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>300100</p>
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * <p>The date when the transaction was processed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-30</p>
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-telecom</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Nanjing Mobile</p>
             */
            public Builder ensRegionIdName(String ensRegionIdName) {
                this.ensRegionIdName = ensRegionIdName;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The public bandwidth of the instance. Unit: Bits/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder internetBandwidth(Long internetBandwidth) {
                this.internetBandwidth = internetBandwidth;
                return this;
            }

            /**
             * <p>The ISP. Valid values:</p>
             * <ul>
             * <li>cmcc: China Mobile</li>
             * <li>unicom: China Unicom</li>
             * <li>telecom: China Telecom</li>
             * <li>multiCarrier: multi-line ISP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cmcc</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link DescribeEnsRegionIdResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsRegionIdResourceResponseBody</p>
     */
    public static class EnsRegionIdResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionIdResource")
        private java.util.List<EnsRegionIdResource> ensRegionIdResource;

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
        public java.util.List<EnsRegionIdResource> getEnsRegionIdResource() {
            return this.ensRegionIdResource;
        }

        public static final class Builder {
            private java.util.List<EnsRegionIdResource> ensRegionIdResource; 

            private Builder() {
            } 

            private Builder(EnsRegionIdResources model) {
                this.ensRegionIdResource = model.ensRegionIdResource;
            } 

            /**
             * EnsRegionIdResource.
             */
            public Builder ensRegionIdResource(java.util.List<EnsRegionIdResource> ensRegionIdResource) {
                this.ensRegionIdResource = ensRegionIdResource;
                return this;
            }

            public EnsRegionIdResources build() {
                return new EnsRegionIdResources(this);
            } 

        } 

    }
}
