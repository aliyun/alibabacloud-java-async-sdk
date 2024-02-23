// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCertRequest} extends {@link RequestModel}
 *
 * <p>ListCertRequest</p>
 */
public class ListCertRequest extends Request {
    @Query
    @NameInMap("CertType")
    private String certType;

    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("KeyWord")
    private String keyWord;

    @Query
    @NameInMap("ShowSize")
    private Long showSize;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("WarehouseId")
    private Long warehouseId;

    private ListCertRequest(Builder builder) {
        super(builder);
        this.certType = builder.certType;
        this.currentPage = builder.currentPage;
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
            this.keyWord = request.keyWord;
            this.showSize = request.showSize;
            this.sourceType = request.sourceType;
            this.status = request.status;
            this.warehouseId = request.warehouseId;
        } 

        /**
         * The type of the certificate.
         * <p>
         * 
         * *   **CA**: the CA certificate.
         * *   **CERT**: a issued certificate.
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * The number of the page to return. Default value: 1.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The keyword that is used for queries. The value can be a name, domain name, or subject alternative name (SAN) attribute. Fuzzy match is supported.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 50.
         */
        public Builder showSize(Long showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * The source of the certificate. Valid values:
         * <p>
         * 
         * *   **upload**: uploaded certificate
         * *   **aliyun**: Alibaba Cloud certificate
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The status of the certificate. Valid values:
         * <p>
         * 
         * *   **ISSUE**: issued
         * *   **REVOKE**: revoked
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the certificate repository. You can call the ListCertWarehouse API operation to query the IDs of certificate repositories.
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
