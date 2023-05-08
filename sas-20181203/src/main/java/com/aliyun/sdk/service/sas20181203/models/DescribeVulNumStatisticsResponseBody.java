// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulNumStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulNumStatisticsResponseBody</p>
 */
public class DescribeVulNumStatisticsResponseBody extends TeaModel {
    @NameInMap("AppCnt")
    private Integer appCnt;

    @NameInMap("AppNum")
    private Integer appNum;

    @NameInMap("CmsDealedTotalNum")
    private Integer cmsDealedTotalNum;

    @NameInMap("CmsNum")
    private Integer cmsNum;

    @NameInMap("CveNum")
    private Integer cveNum;

    @NameInMap("EmgNum")
    private Integer emgNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScaNum")
    private Integer scaNum;

    @NameInMap("SysNum")
    private Integer sysNum;

    @NameInMap("VulAsapSum")
    private Integer vulAsapSum;

    @NameInMap("VulDealedTotalNum")
    private Integer vulDealedTotalNum;

    @NameInMap("VulLaterSum")
    private Integer vulLaterSum;

    @NameInMap("VulNntfSum")
    private Integer vulNntfSum;

    private DescribeVulNumStatisticsResponseBody(Builder builder) {
        this.appCnt = builder.appCnt;
        this.appNum = builder.appNum;
        this.cmsDealedTotalNum = builder.cmsDealedTotalNum;
        this.cmsNum = builder.cmsNum;
        this.cveNum = builder.cveNum;
        this.emgNum = builder.emgNum;
        this.requestId = builder.requestId;
        this.scaNum = builder.scaNum;
        this.sysNum = builder.sysNum;
        this.vulAsapSum = builder.vulAsapSum;
        this.vulDealedTotalNum = builder.vulDealedTotalNum;
        this.vulLaterSum = builder.vulLaterSum;
        this.vulNntfSum = builder.vulNntfSum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulNumStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return appCnt
     */
    public Integer getAppCnt() {
        return this.appCnt;
    }

    /**
     * @return appNum
     */
    public Integer getAppNum() {
        return this.appNum;
    }

    /**
     * @return cmsDealedTotalNum
     */
    public Integer getCmsDealedTotalNum() {
        return this.cmsDealedTotalNum;
    }

    /**
     * @return cmsNum
     */
    public Integer getCmsNum() {
        return this.cmsNum;
    }

    /**
     * @return cveNum
     */
    public Integer getCveNum() {
        return this.cveNum;
    }

    /**
     * @return emgNum
     */
    public Integer getEmgNum() {
        return this.emgNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scaNum
     */
    public Integer getScaNum() {
        return this.scaNum;
    }

    /**
     * @return sysNum
     */
    public Integer getSysNum() {
        return this.sysNum;
    }

    /**
     * @return vulAsapSum
     */
    public Integer getVulAsapSum() {
        return this.vulAsapSum;
    }

    /**
     * @return vulDealedTotalNum
     */
    public Integer getVulDealedTotalNum() {
        return this.vulDealedTotalNum;
    }

    /**
     * @return vulLaterSum
     */
    public Integer getVulLaterSum() {
        return this.vulLaterSum;
    }

    /**
     * @return vulNntfSum
     */
    public Integer getVulNntfSum() {
        return this.vulNntfSum;
    }

    public static final class Builder {
        private Integer appCnt; 
        private Integer appNum; 
        private Integer cmsDealedTotalNum; 
        private Integer cmsNum; 
        private Integer cveNum; 
        private Integer emgNum; 
        private String requestId; 
        private Integer scaNum; 
        private Integer sysNum; 
        private Integer vulAsapSum; 
        private Integer vulDealedTotalNum; 
        private Integer vulLaterSum; 
        private Integer vulNntfSum; 

        /**
         * AppCnt.
         */
        public Builder appCnt(Integer appCnt) {
            this.appCnt = appCnt;
            return this;
        }

        /**
         * AppNum.
         */
        public Builder appNum(Integer appNum) {
            this.appNum = appNum;
            return this;
        }

        /**
         * CmsDealedTotalNum.
         */
        public Builder cmsDealedTotalNum(Integer cmsDealedTotalNum) {
            this.cmsDealedTotalNum = cmsDealedTotalNum;
            return this;
        }

        /**
         * CmsNum.
         */
        public Builder cmsNum(Integer cmsNum) {
            this.cmsNum = cmsNum;
            return this;
        }

        /**
         * CveNum.
         */
        public Builder cveNum(Integer cveNum) {
            this.cveNum = cveNum;
            return this;
        }

        /**
         * EmgNum.
         */
        public Builder emgNum(Integer emgNum) {
            this.emgNum = emgNum;
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
         * ScaNum.
         */
        public Builder scaNum(Integer scaNum) {
            this.scaNum = scaNum;
            return this;
        }

        /**
         * SysNum.
         */
        public Builder sysNum(Integer sysNum) {
            this.sysNum = sysNum;
            return this;
        }

        /**
         * VulAsapSum.
         */
        public Builder vulAsapSum(Integer vulAsapSum) {
            this.vulAsapSum = vulAsapSum;
            return this;
        }

        /**
         * VulDealedTotalNum.
         */
        public Builder vulDealedTotalNum(Integer vulDealedTotalNum) {
            this.vulDealedTotalNum = vulDealedTotalNum;
            return this;
        }

        /**
         * VulLaterSum.
         */
        public Builder vulLaterSum(Integer vulLaterSum) {
            this.vulLaterSum = vulLaterSum;
            return this;
        }

        /**
         * VulNntfSum.
         */
        public Builder vulNntfSum(Integer vulNntfSum) {
            this.vulNntfSum = vulNntfSum;
            return this;
        }

        public DescribeVulNumStatisticsResponseBody build() {
            return new DescribeVulNumStatisticsResponseBody(this);
        } 

    } 

}
