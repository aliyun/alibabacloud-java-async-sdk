// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulNumStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulNumStatisticsResponseBody</p>
 */
public class DescribeVulNumStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppCnt")
    private Integer appCnt;

    @com.aliyun.core.annotation.NameInMap("AppNum")
    private Integer appNum;

    @com.aliyun.core.annotation.NameInMap("CmsDealedTotalNum")
    private Integer cmsDealedTotalNum;

    @com.aliyun.core.annotation.NameInMap("CmsNum")
    private Integer cmsNum;

    @com.aliyun.core.annotation.NameInMap("CveNum")
    private Integer cveNum;

    @com.aliyun.core.annotation.NameInMap("EmgNum")
    private Integer emgNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScaNum")
    private Integer scaNum;

    @com.aliyun.core.annotation.NameInMap("SysNum")
    private Integer sysNum;

    @com.aliyun.core.annotation.NameInMap("VulAsapSum")
    private Integer vulAsapSum;

    @com.aliyun.core.annotation.NameInMap("VulDealedTotalNum")
    private Integer vulDealedTotalNum;

    @com.aliyun.core.annotation.NameInMap("VulLaterSum")
    private Integer vulLaterSum;

    @com.aliyun.core.annotation.NameInMap("VulNntfSum")
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
         * The number of application vulnerabilities that are detected on the asset by using the web scanner.
         */
        public Builder appCnt(Integer appCnt) {
            this.appCnt = appCnt;
            return this;
        }

        /**
         * The number of application vulnerabilities that are detected on the asset by using the web scanner.
         */
        public Builder appNum(Integer appNum) {
            this.appNum = appNum;
            return this;
        }

        /**
         * The number of Web-CMS vulnerabilities that are handled.
         */
        public Builder cmsDealedTotalNum(Integer cmsDealedTotalNum) {
            this.cmsDealedTotalNum = cmsDealedTotalNum;
            return this;
        }

        /**
         * The number of Web-CMS vulnerabilities that are detected on the asset.
         */
        public Builder cmsNum(Integer cmsNum) {
            this.cmsNum = cmsNum;
            return this;
        }

        /**
         * The number of Linux software vulnerabilities that are detected on the asset.
         */
        public Builder cveNum(Integer cveNum) {
            this.cveNum = cveNum;
            return this;
        }

        /**
         * The number of urgent vulnerabilities that are detected on the asset.
         */
        public Builder emgNum(Integer emgNum) {
            this.emgNum = emgNum;
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
         * The number of middleware vulnerabilities that are detected on the asset.
         */
        public Builder scaNum(Integer scaNum) {
            this.scaNum = scaNum;
            return this;
        }

        /**
         * The number of Windows system vulnerabilities that are detected on the asset.
         */
        public Builder sysNum(Integer sysNum) {
            this.sysNum = sysNum;
            return this;
        }

        /**
         * The number of vulnerabilities that have the high priority.
         */
        public Builder vulAsapSum(Integer vulAsapSum) {
            this.vulAsapSum = vulAsapSum;
            return this;
        }

        /**
         * The number of vulnerabilities that are handled.
         */
        public Builder vulDealedTotalNum(Integer vulDealedTotalNum) {
            this.vulDealedTotalNum = vulDealedTotalNum;
            return this;
        }

        /**
         * The number of vulnerabilities that have the medium priority.
         */
        public Builder vulLaterSum(Integer vulLaterSum) {
            this.vulLaterSum = vulLaterSum;
            return this;
        }

        /**
         * The number of vulnerabilities that have the low priority.
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
