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
 * {@link ListCertRequest} extends {@link RequestModel}
 *
 * <p>ListCertRequest</p>
 */
public class ListCertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AfterDate")
    private String afterDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeforeDate")
    private String beforeDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceUuid")
    private String instanceUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentIdentifier")
    private String parentIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListCertRequest(Builder builder) {
        super(builder);
        this.afterDate = builder.afterDate;
        this.beforeDate = builder.beforeDate;
        this.currentPage = builder.currentPage;
        this.instanceUuid = builder.instanceUuid;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parentIdentifier = builder.parentIdentifier;
        this.showSize = builder.showSize;
        this.status = builder.status;
        this.type = builder.type;
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
     * @return afterDate
     */
    public String getAfterDate() {
        return this.afterDate;
    }

    /**
     * @return beforeDate
     */
    public String getBeforeDate() {
        return this.beforeDate;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceUuid
     */
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return parentIdentifier
     */
    public String getParentIdentifier() {
        return this.parentIdentifier;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListCertRequest, Builder> {
        private String afterDate; 
        private String beforeDate; 
        private Integer currentPage; 
        private String instanceUuid; 
        private Integer maxResults; 
        private String nextToken; 
        private String parentIdentifier; 
        private Integer showSize; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListCertRequest request) {
            super(request);
            this.afterDate = request.afterDate;
            this.beforeDate = request.beforeDate;
            this.currentPage = request.currentPage;
            this.instanceUuid = request.instanceUuid;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.parentIdentifier = request.parentIdentifier;
            this.showSize = request.showSize;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * <p>The host record bound to the certificate, in the YYYY-MM-DD format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-13</p>
         */
        public Builder afterDate(String afterDate) {
            this.putQueryParameter("AfterDate", afterDate);
            this.afterDate = afterDate;
            return this;
        }

        /**
         * <p>The modification time of the certificate, in the YYYY-MM-DD format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-04</p>
         */
        public Builder beforeDate(String beforeDate) {
            this.putQueryParameter("BeforeDate", beforeDate);
            this.beforeDate = beforeDate;
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
         * <p>The UUID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1ef79512-569b-6a4e-9105-9b91473562f7</p>
         */
        public Builder instanceUuid(String instanceUuid) {
            this.putQueryParameter("InstanceUuid", instanceUuid);
            this.instanceUuid = instanceUuid;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. If this parameter is empty, no more results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>1d2db86sca4384811e0b5e8707e68181f</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The identifier of the intermediate CA that issued the certificate. You can call <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> to query the unique identifier of a CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>273ae6bb538d538c70c01f81jh2****</p>
         */
        public Builder parentIdentifier(String parentIdentifier) {
            this.putQueryParameter("ParentIdentifier", parentIdentifier);
            this.parentIdentifier = parentIdentifier;
            return this;
        }

        /**
         * <p>The total size of the certificate. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The certificate status. Valid values:</p>
         * <ul>
         * <li>ISSUE: Normal.</li>
         * <li>REVOKE: Revoked.</li>
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
         * <p>The certificate type. Valid values:</p>
         * <ul>
         * <li>SERVER: server certificate.</li>
         * <li>CLIENT: client certificate.</li>
         * <li>END_ENTITY: end-entity certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLIENT</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListCertRequest build() {
            return new ListCertRequest(this);
        } 

    } 

}
