// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCACertificateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCACertificateListRequest</p>
 */
public class DescribeCACertificateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    private String identifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    private DescribeCACertificateListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.identifier = builder.identifier;
        this.showSize = builder.showSize;
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

    public static final class Builder extends Request.Builder<DescribeCACertificateListRequest, Builder> {
        private Integer currentPage; 
        private String identifier; 
        private Integer showSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCACertificateListRequest request) {
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
         * The unique identifier of the client certificate or server certificate that you want to revoke.
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
         * The number of CA certificates to return on each page. Default value: **20**.
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        @Override
        public DescribeCACertificateListRequest build() {
            return new DescribeCACertificateListRequest(this);
        } 

    } 

}
