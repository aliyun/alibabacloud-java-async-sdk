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
 * {@link ListCertificatesRequest} extends {@link RequestModel}
 *
 * <p>ListCertificatesRequest</p>
 */
public class ListCertificatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateSource")
    private String certificateSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateStatus")
    private String certificateStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    private ListCertificatesRequest(Builder builder) {
        super(builder);
        this.certificateSource = builder.certificateSource;
        this.certificateStatus = builder.certificateStatus;
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.keyword = builder.keyword;
        this.resourceGroupId = builder.resourceGroupId;
        this.showSize = builder.showSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertificatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateSource
     */
    public String getCertificateSource() {
        return this.certificateSource;
    }

    /**
     * @return certificateStatus
     */
    public String getCertificateStatus() {
        return this.certificateStatus;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    public static final class Builder extends Request.Builder<ListCertificatesRequest, Builder> {
        private String certificateSource; 
        private String certificateStatus; 
        private Integer currentPage; 
        private String instanceId; 
        private String keyword; 
        private String resourceGroupId; 
        private Integer showSize; 

        private Builder() {
            super();
        } 

        private Builder(ListCertificatesRequest request) {
            super(request);
            this.certificateSource = request.certificateSource;
            this.certificateStatus = request.certificateStatus;
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.keyword = request.keyword;
            this.resourceGroupId = request.resourceGroupId;
            this.showSize = request.showSize;
        } 

        /**
         * <p>The source of the certificate. Valid values:</p>
         * <ul>
         * <li>BUY: a formal certificate.</li>
         * <li>TEST: a test certificate.</li>
         * <li>UPLOAD: an uploaded certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        public Builder certificateSource(String certificateSource) {
            this.putQueryParameter("CertificateSource", certificateSource);
            this.certificateSource = certificateSource;
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
         * <p>The page number of the current page.</p>
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
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-ivauto-hqito6</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The keyword for fuzzy match. The keyword is matched against domain names, names, and corresponding resource IDs.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek****wia</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        @Override
        public ListCertificatesRequest build() {
            return new ListCertificatesRequest(this);
        } 

    } 

}
