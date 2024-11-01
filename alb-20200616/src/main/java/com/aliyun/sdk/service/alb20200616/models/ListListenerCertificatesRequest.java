// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListListenerCertificatesRequest} extends {@link RequestModel}
 *
 * <p>ListListenerCertificatesRequest</p>
 */
public class ListListenerCertificatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateIds")
    private java.util.List < String > certificateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateType")
    private String certificateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListListenerCertificatesRequest(Builder builder) {
        super(builder);
        this.certificateIds = builder.certificateIds;
        this.certificateType = builder.certificateType;
        this.listenerId = builder.listenerId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenerCertificatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateIds
     */
    public java.util.List < String > getCertificateIds() {
        return this.certificateIds;
    }

    /**
     * @return certificateType
     */
    public String getCertificateType() {
        return this.certificateType;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
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

    public static final class Builder extends Request.Builder<ListListenerCertificatesRequest, Builder> {
        private java.util.List < String > certificateIds; 
        private String certificateType; 
        private String listenerId; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListListenerCertificatesRequest request) {
            super(request);
            this.certificateIds = request.certificateIds;
            this.certificateType = request.certificateType;
            this.listenerId = request.listenerId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The certificate IDs.</p>
         */
        public Builder certificateIds(java.util.List < String > certificateIds) {
            this.putQueryParameter("CertificateIds", certificateIds);
            this.certificateIds = certificateIds;
            return this;
        }

        /**
         * <p>The type of the certificate. Valid values: <strong>Ca</strong> and <strong>Server</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Server</p>
         */
        public Builder certificateType(String certificateType) {
            this.putQueryParameter("CertificateType", certificateType);
            this.certificateType = certificateType;
            return this;
        }

        /**
         * <p>The listener ID. You must specify the ID of an HTTPS listener or a QUIC listener.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return. Valid values: <strong>1 to 100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request.</li>
         * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListListenerCertificatesRequest build() {
            return new ListListenerCertificatesRequest(this);
        } 

    } 

}
