// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ListTlsInspectCACertificatesRequest} extends {@link RequestModel}
 *
 * <p>ListTlsInspectCACertificatesRequest</p>
 */
public class ListTlsInspectCACertificatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaCertId")
    private String caCertId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListTlsInspectCACertificatesRequest(Builder builder) {
        super(builder);
        this.caCertId = builder.caCertId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTlsInspectCACertificatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCertId
     */
    public String getCaCertId() {
        return this.caCertId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListTlsInspectCACertificatesRequest, Builder> {
        private String caCertId; 
        private Integer currentPage; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListTlsInspectCACertificatesRequest request) {
            super(request);
            this.caCertId = request.caCertId;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The CA certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C3E91391-16CD-1BFC-A133-******D429</p>
         */
        public Builder caCertId(String caCertId) {
            this.putQueryParameter("CaCertId", caCertId);
            this.caCertId = caCertId;
            return this;
        }

        /**
         * <p>The page number for paging. Default value: 1.</p>
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
         * <p>The maximum number of entries per page for paging. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListTlsInspectCACertificatesRequest build() {
            return new ListTlsInspectCACertificatesRequest(this);
        } 

    } 

}
