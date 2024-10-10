// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEmgVulItemRequest} extends {@link RequestModel}
 *
 * <p>DescribeEmgVulItemRequest</p>
 */
public class DescribeEmgVulItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckType")
    private Integer checkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskStatus")
    private String riskStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanType")
    private String scanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulName")
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
         * <p>The check method. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: proof of concept (POC) verification</li>
         * <li><strong>1</strong>: version comparison</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder checkType(Integer checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether the vulnerability poses risks.<br>If you do not specify this parameter, all vulnerabilities are queried regardless of whether the vulnerabilities pose risks. Valid values:</p>
         * <ul>
         * <li><strong>y</strong>: yes</li>
         * <li><strong>n</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>y</p>
         */
        public Builder riskStatus(String riskStatus) {
            this.putQueryParameter("RiskStatus", riskStatus);
            this.riskStatus = riskStatus;
            return this;
        }

        /**
         * <p>The method that is used to detect the vulnerability.<br>If you do not specify this parameter, all vulnerabilities are queried regardless of which method is used. Valid values:</p>
         * <ul>
         * <li><strong>python</strong>: The Version method is used. Security Center checks the software versions of your server to check whether disclosed vulnerabilities exist on your server.</li>
         * <li><strong>scan</strong>: The Network Scan method is used. Security Center analyzes the access traffic to your server over the Internet to check whether vulnerabilities exist on your server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>python</p>
         */
        public Builder scanType(String scanType) {
            this.putQueryParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        /**
         * <p>The name of the urgent vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>Changjietong T + SetupAccount/Upload.aspx file Upload vulnerability (CNVD-2022-60632)</p>
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
