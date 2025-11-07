// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeWhitelistSettingRequest} extends {@link RequestModel}
 *
 * <p>DescribeWhitelistSettingRequest</p>
 */
public class DescribeWhitelistSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertNo")
    private String certNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyId")
    private String certifyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidEndDate")
    private Long validEndDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidStartDate")
    private Long validStartDate;

    private DescribeWhitelistSettingRequest(Builder builder) {
        super(builder);
        this.certNo = builder.certNo;
        this.certifyId = builder.certifyId;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.sceneId = builder.sceneId;
        this.serviceCode = builder.serviceCode;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
        this.validEndDate = builder.validEndDate;
        this.validStartDate = builder.validStartDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhitelistSettingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certNo
     */
    public String getCertNo() {
        return this.certNo;
    }

    /**
     * @return certifyId
     */
    public String getCertifyId() {
        return this.certifyId;
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
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return validEndDate
     */
    public Long getValidEndDate() {
        return this.validEndDate;
    }

    /**
     * @return validStartDate
     */
    public Long getValidStartDate() {
        return this.validStartDate;
    }

    public static final class Builder extends Request.Builder<DescribeWhitelistSettingRequest, Builder> {
        private String certNo; 
        private String certifyId; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private Long sceneId; 
        private String serviceCode; 
        private String sourceIp; 
        private String status; 
        private Long validEndDate; 
        private Long validStartDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWhitelistSettingRequest request) {
            super(request);
            this.certNo = request.certNo;
            this.certifyId = request.certifyId;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.sceneId = request.sceneId;
            this.serviceCode = request.serviceCode;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
            this.validEndDate = request.validEndDate;
            this.validStartDate = request.validStartDate;
        } 

        /**
         * <p>ID Number</p>
         * 
         * <strong>example:</strong>
         * <p>320321XXXXXXXX701X</p>
         */
        public Builder certNo(String certNo) {
            this.putQueryParameter("CertNo", certNo);
            this.certNo = certNo;
            return this;
        }

        /**
         * <p>Certification ID</p>
         * 
         * <strong>example:</strong>
         * <p>shsf57a4e0d9981c3bd66dc754f3d3cd</p>
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * <p>Pagination parameter: current page number, default value is 1.</p>
         * <p>This parameter is required.</p>
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
         * <p>Specify the language to query. Values:</p>
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
         * <p>Number of items per page for pagination.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000004530</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>Service Code:</p>
         * <ul>
         * <li><strong>Enhanced Financial Grade</strong>: cloudauthst</li>
         * <li><strong>Financial Grade</strong>: antcloudauth</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>antcloudauth</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>Visitor&quot;s source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>113.140.85.74</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>Whitelist status:</p>
         * <ul>
         * <li><strong>VALID</strong>: Valid</li>
         * <li><strong>INVALID</strong>: Invalid</li>
         * <li><strong>DELETED</strong>: Deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Expiration date.</p>
         * 
         * <strong>example:</strong>
         * <p>1730304000000</p>
         */
        public Builder validEndDate(Long validEndDate) {
            this.putQueryParameter("ValidEndDate", validEndDate);
            this.validEndDate = validEndDate;
            return this;
        }

        /**
         * <p>Effective start time (in seconds timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1759939200000</p>
         */
        public Builder validStartDate(Long validStartDate) {
            this.putQueryParameter("ValidStartDate", validStartDate);
            this.validStartDate = validStartDate;
            return this;
        }

        @Override
        public DescribeWhitelistSettingRequest build() {
            return new DescribeWhitelistSettingRequest(this);
        } 

    } 

}
