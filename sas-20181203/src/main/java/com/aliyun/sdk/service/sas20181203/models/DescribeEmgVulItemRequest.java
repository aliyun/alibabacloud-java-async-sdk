// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEmgVulItemRequest} extends {@link RequestModel}
 *
 * <p>DescribeEmgVulItemRequest</p>
 */
public class DescribeEmgVulItemRequest extends Request {
    @Query
    @NameInMap("CheckType")
    private Integer checkType;

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
        this.checkType = builder.checkType;
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkType
     */
    public Integer getCheckType() {
        return this.checkType;
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

    public static final class Builder extends Request.Builder<DescribeEmgVulItemRequest, Builder> {
        private Integer checkType; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private String riskStatus; 
        private String scanType; 
        private String vulName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEmgVulItemRequest request) {
            super(request);
            this.checkType = request.checkType;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskStatus = request.riskStatus;
            this.scanType = request.scanType;
            this.vulName = request.vulName;
        } 

        /**
         * The check method. Valid values:
         * <p>
         * 
         * *   **0**: proof of concept (POC) verification
         * *   **1**: version comparison
         */
        public Builder checkType(Integer checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Specifies whether the vulnerability poses risks.\
         * <p>
         * If you do not specify this parameter, all vulnerabilities are queried regardless of whether the vulnerabilities pose risks. Valid values:
         * 
         * *   **y**: yes
         * *   **n**: no
         */
        public Builder riskStatus(String riskStatus) {
            this.putQueryParameter("RiskStatus", riskStatus);
            this.riskStatus = riskStatus;
            return this;
        }

        /**
         * The method that is used to detect the vulnerability.\
         * <p>
         * If you do not specify this parameter, all vulnerabilities are queried regardless of which method is used. Valid values:
         * 
         * *   **python**: The Version method is used. Security Center checks the software versions of your server to check whether disclosed vulnerabilities exist on your server.
         * *   **scan**: The Network Scan method is used. Security Center analyzes the access traffic to your server over the Internet to check whether vulnerabilities exist on your server.
         */
        public Builder scanType(String scanType) {
            this.putQueryParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        /**
         * The name of the urgent vulnerability.
         */
        public Builder vulName(String vulName) {
            this.putQueryParameter("VulName", vulName);
            this.vulName = vulName;
            return this;
        }

        @Override
        public DescribeEmgVulItemRequest build() {
            return new DescribeEmgVulItemRequest(this);
        } 

    } 

}
