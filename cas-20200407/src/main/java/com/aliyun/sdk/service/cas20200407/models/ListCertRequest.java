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
 * {@link ListCertRequest} extends {@link RequestModel}
 *
 * <p>ListCertRequest</p>
 */
public class ListCertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertType")
    private String certType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifiers")
    private String identifiers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Long showSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarehouseId")
    private Long warehouseId;

    private ListCertRequest(Builder builder) {
        super(builder);
        this.certType = builder.certType;
        this.currentPage = builder.currentPage;
        this.identifiers = builder.identifiers;
        this.keyWord = builder.keyWord;
        this.showSize = builder.showSize;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
        this.warehouseId = builder.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return identifiers
     */
    public String getIdentifiers() {
        return this.identifiers;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
    }

    /**
     * @return showSize
     */
    public Long getShowSize() {
        return this.showSize;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return warehouseId
     */
    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public static final class Builder extends Request.Builder<ListCertRequest, Builder> {
        private String certType; 
        private Long currentPage; 
        private String identifiers; 
        private String keyWord; 
        private Long showSize; 
        private String sourceType; 
        private String status; 
        private Long warehouseId; 

        private Builder() {
            super();
        } 

        private Builder(ListCertRequest request) {
            super(request);
            this.certType = request.certType;
            this.currentPage = request.currentPage;
            this.identifiers = request.identifiers;
            this.keyWord = request.keyWord;
            this.showSize = request.showSize;
            this.sourceType = request.sourceType;
            this.status = request.status;
            this.warehouseId = request.warehouseId;
        } 

        /**
         * <p>The certificate type. Valid values:</p>
         * <ul>
         * <li><p><strong>CA</strong>: CA certificate</p>
         * </li>
         * <li><p><strong>CERT</strong>: issued certificate</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CERT</p>
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * <p>The page number to return. The default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>A comma-separated list of certificate identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa,bbb</p>
         */
        public Builder identifiers(String identifiers) {
            this.putQueryParameter("Identifiers", identifiers);
            this.identifiers = identifiers;
            return this;
        }

        /**
         * <p>The keyword for a fuzzy search by name, domain name, or subject alternative name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * <p>The number of entries per page. The default value is 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder showSize(Long showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The source of the certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>upload</strong>: uploaded certificate</p>
         * </li>
         * <li><p><strong>aliyun</strong>: Alibaba Cloud certificate</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The certificate status. Valid values:</p>
         * <ul>
         * <li><p><strong>ISSUE</strong>: issued</p>
         * </li>
         * <li><p><strong>REVOKE</strong>: revoked</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ISSUE</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The warehouse ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/453246.html">ListCertWarehouse</a> API.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder warehouseId(Long warehouseId) {
            this.putQueryParameter("WarehouseId", warehouseId);
            this.warehouseId = warehouseId;
            return this;
        }

        @Override
        public ListCertRequest build() {
            return new ListCertRequest(this);
        } 

    } 

}
