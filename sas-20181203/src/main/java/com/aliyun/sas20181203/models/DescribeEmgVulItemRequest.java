// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeEmgVulItemRequest} extends {@link RequestModel}
 *
 * <p>DescribeEmgVulItemRequest</p>
 */
public class DescribeEmgVulItemRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RiskStatus")
    private String riskStatus;

    @Query
    @NameInMap("ScanType")
    private String scanType;

    @Query
    @NameInMap("VulName")
    private String vulName;


    private DescribeEmgVulItemRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskStatus = builder.riskStatus;
        this.scanType = builder.scanType;
        this.vulName = builder.vulName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEmgVulItemRequest create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return riskStatus
     */
    public String getRiskStatus() {
        return this.riskStatus;
    }

    /**
     * @return scanType
     */
    public String getScanType() {
        return this.scanType;
    }

    /**
     * @return vulName
     */
    public String getVulName() {
        return this.vulName;
    }

    public static final class Builder extends Request.Builder {
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private String riskStatus; 
        private String scanType; 
        private String vulName; 

        /**
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RiskStatus.</p>
         */
        public Builder riskStatus(String riskStatus) {
            this.putQueryParameter("RiskStatus", riskStatus);
            this.riskStatus = riskStatus;
            return this;
        }

        /**
         * <p>ScanType.</p>
         */
        public Builder scanType(String scanType) {
            this.putQueryParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        /**
         * <p>VulName.</p>
         */
        public Builder vulName(String vulName) {
            this.putQueryParameter("VulName", vulName);
            this.vulName = vulName;
            return this;
        }

        public DescribeEmgVulItemRequest build() {
            return new DescribeEmgVulItemRequest(this);
        } 

    } 

}
