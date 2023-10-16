// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientCertificateRequest} extends {@link RequestModel}
 *
 * <p>ListClientCertificateRequest</p>
 */
public class ListClientCertificateRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Identifier")
    private String identifier;

    @Query
    @NameInMap("ShowSize")
    private Integer showSize;

    private ListClientCertificateRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.identifier = builder.identifier;
        this.showSize = builder.showSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    public static final class Builder extends Request.Builder<ListClientCertificateRequest, Builder> {
        private Integer currentPage; 
        private String identifier; 
        private Integer showSize; 

        private Builder() {
            super();
        } 

        private Builder(ListClientCertificateRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.identifier = request.identifier;
            this.showSize = request.showSize;
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
         * The unique identifier of the client certificate or the server certificate that you want to query.
         * <p>
         * 
         * >  You can call the [ListClientCertificate](~~330884~~) operation to query the unique identifiers of all client certificates and server certificates.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * The number of certificates to return on each page. Default value: **20**.
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        @Override
        public ListClientCertificateRequest build() {
            return new ListClientCertificateRequest(this);
        } 

    } 

}
