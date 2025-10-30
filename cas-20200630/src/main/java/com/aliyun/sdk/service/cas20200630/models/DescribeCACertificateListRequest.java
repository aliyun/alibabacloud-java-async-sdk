// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link DescribeCACertificateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCACertificateListRequest</p>
 */
public class DescribeCACertificateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaStatus")
    private String caStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertType")
    private String certType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    private String identifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IssuerType")
    private String issuerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidStatus")
    private String validStatus;

    private DescribeCACertificateListRequest(Builder builder) {
        super(builder);
        this.caStatus = builder.caStatus;
        this.certType = builder.certType;
        this.currentPage = builder.currentPage;
        this.identifier = builder.identifier;
        this.issuerType = builder.issuerType;
        this.resourceGroupId = builder.resourceGroupId;
        this.showSize = builder.showSize;
        this.validStatus = builder.validStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCACertificateListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caStatus
     */
    public String getCaStatus() {
        return this.caStatus;
    }

    /**
     * @return certType
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return issuerType
     */
    public String getIssuerType() {
        return this.issuerType;
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

    /**
     * @return validStatus
     */
    public String getValidStatus() {
        return this.validStatus;
    }

    public static final class Builder extends Request.Builder<DescribeCACertificateListRequest, Builder> {
        private String caStatus; 
        private String certType; 
        private Integer currentPage; 
        private String identifier; 
        private String issuerType; 
        private String resourceGroupId; 
        private Integer showSize; 
        private String validStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCACertificateListRequest request) {
            super(request);
            this.caStatus = request.caStatus;
            this.certType = request.certType;
            this.currentPage = request.currentPage;
            this.identifier = request.identifier;
            this.issuerType = request.issuerType;
            this.resourceGroupId = request.resourceGroupId;
            this.showSize = request.showSize;
            this.validStatus = request.validStatus;
        } 

        /**
         * <p>Ca status.</p>
         * <ul>
         * <li>issue: inUse.</li>
         * <li>forbidden: forbidden.</li>
         * <li>revoke: revoked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        public Builder caStatus(String caStatus) {
            this.putQueryParameter("CaStatus", caStatus);
            this.caStatus = caStatus;
            return this;
        }

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <ul>
         * <li>root: rootCA.</li>
         * <li>subRoot: subCA.</li>
         * <li>externalCa: import.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>subRoot</p>
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
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
         * <p>The unique identifier of the CA certificate.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/328095.html">DescribeCACertificateList</a> operation to query the unique identifiers of all CA certificates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>160ae6bb538d538c70c01f81dcf2****</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The CA Issuer Type.</p>
         * <ul>
         * <li>local: Private certificate.</li>
         * <li>iTrusChina: Compliance CA.</li>
         * <li>external: External Import.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        public Builder issuerType(String issuerType) {
            this.putQueryParameter("IssuerType", issuerType);
            this.issuerType = issuerType;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The number of CA certificates per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>valid time.</p>
         * <ul>
         * <li>valid: means in the valid period.</li>
         * <li>notValid: means expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
         */
        public Builder validStatus(String validStatus) {
            this.putQueryParameter("ValidStatus", validStatus);
            this.validStatus = validStatus;
            return this;
        }

        @Override
        public DescribeCACertificateListRequest build() {
            return new DescribeCACertificateListRequest(this);
        } 

    } 

}
