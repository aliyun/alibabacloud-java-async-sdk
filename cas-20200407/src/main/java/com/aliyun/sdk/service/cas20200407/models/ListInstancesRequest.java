// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoReissueFlag")
    private Integer autoReissueFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Brand")
    private String brand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateStatus")
    private String certificateStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateType")
    private String certificateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerDeployFlag")
    private Integer serverDeployFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.autoReissueFlag = builder.autoReissueFlag;
        this.brand = builder.brand;
        this.certificateStatus = builder.certificateStatus;
        this.certificateType = builder.certificateType;
        this.currentPage = builder.currentPage;
        this.instanceType = builder.instanceType;
        this.keyword = builder.keyword;
        this.resourceGroupId = builder.resourceGroupId;
        this.serverDeployFlag = builder.serverDeployFlag;
        this.showSize = builder.showSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoReissueFlag
     */
    public Integer getAutoReissueFlag() {
        return this.autoReissueFlag;
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * @return certificateStatus
     */
    public String getCertificateStatus() {
        return this.certificateStatus;
    }

    /**
     * @return certificateType
     */
    public String getCertificateType() {
        return this.certificateType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serverDeployFlag
     */
    public Integer getServerDeployFlag() {
        return this.serverDeployFlag;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private Integer autoReissueFlag; 
        private String brand; 
        private String certificateStatus; 
        private String certificateType; 
        private Integer currentPage; 
        private String instanceType; 
        private String keyword; 
        private String resourceGroupId; 
        private Integer serverDeployFlag; 
        private Integer showSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.autoReissueFlag = request.autoReissueFlag;
            this.brand = request.brand;
            this.certificateStatus = request.certificateStatus;
            this.certificateType = request.certificateType;
            this.currentPage = request.currentPage;
            this.instanceType = request.instanceType;
            this.keyword = request.keyword;
            this.resourceGroupId = request.resourceGroupId;
            this.serverDeployFlag = request.serverDeployFlag;
            this.showSize = request.showSize;
            this.status = request.status;
        } 

        /**
         * <p>Specifies whether the instance is managed. Valid values:</p>
         * <ul>
         * <li>1: Managed.</li>
         * <li>0: Not managed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoReissueFlag(Integer autoReissueFlag) {
            this.putQueryParameter("AutoReissueFlag", autoReissueFlag);
            this.autoReissueFlag = autoReissueFlag;
            return this;
        }

        /**
         * <p>The CA brand. Valid values: WoSign, CFCA, DigiCert, GeoTrust, GlobalSign, vTrus, and Alibaba.</p>
         * 
         * <strong>example:</strong>
         * <p>Digicert</p>
         */
        public Builder brand(String brand) {
            this.putQueryParameter("Brand", brand);
            this.brand = brand;
            return this;
        }

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>issued</strong>: Issued.</li>
         * <li><strong>revoked</strong>: Revoked.</li>
         * <li><strong>willExpire</strong>: About to expire.</li>
         * <li><strong>expired</strong>: Expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>issued</p>
         */
        public Builder certificateStatus(String certificateStatus) {
            this.putQueryParameter("CertificateStatus", certificateStatus);
            this.certificateStatus = certificateStatus;
            return this;
        }

        /**
         * <p>The type of the certificate. Valid values: DV, OV, and EV.</p>
         * 
         * <strong>example:</strong>
         * <p>DV</p>
         */
        public Builder certificateType(String certificateType) {
            this.putQueryParameter("CertificateType", certificateType);
            this.certificateType = certificateType;
            return this;
        }

        /**
         * <p>The page number of the current page in a paged query. Default value: <strong>1</strong>.</p>
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
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>BUY: formal certificate.</li>
         * <li>TEST: test certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The keyword for fuzzy search. Matches domain names, instance names, or corresponding resource IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ae******4wia</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to return only instances that meet server deployment conditions. Valid values:</p>
         * <ul>
         * <li>1: Yes.</li>
         * <li>0: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serverDeployFlag(Integer serverDeployFlag) {
            this.putQueryParameter("ServerDeployFlag", serverDeployFlag);
            this.serverDeployFlag = serverDeployFlag;
            return this;
        }

        /**
         * <p>The number of instances to display per page in a paged query. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>inactive</strong>: Pending use.</li>
         * <li><strong>pending</strong>: Under review. The latest certificate is being reviewed.</li>
         * <li><strong>willExpire</strong>: The instance is about to expire.</li>
         * <li><strong>expired</strong>: The instance has expired.</li>
         * <li><strong>refund</strong>: Refunded.</li>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>closed</strong>: Closed. The instance is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>inactive</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
