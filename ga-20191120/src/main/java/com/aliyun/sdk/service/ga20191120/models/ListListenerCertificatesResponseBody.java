// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListListenerCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenerCertificatesResponseBody</p>
 */
public class ListListenerCertificatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListListenerCertificatesResponseBody(Builder builder) {
        this.certificates = builder.certificates;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenerCertificatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificates
     */
    public java.util.List < Certificates> getCertificates() {
        return this.certificates;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Certificates> certificates; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The certificates.
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value of **NextToken** is returned, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListListenerCertificatesResponseBody build() {
            return new ListListenerCertificatesResponseBody(this);
        } 

    } 

    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Certificates(Builder builder) {
            this.certificateId = builder.certificateId;
            this.domain = builder.domain;
            this.isDefault = builder.isDefault;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String certificateId; 
            private String domain; 
            private Boolean isDefault; 
            private String state; 

            /**
             * The certificate ID.
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * The domain name associated with the additional certificate.
             * <p>
             * 
             * This parameter is not returned if the certificate is a default one.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Indicates whether the certificate is a default one.
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The status of the certificate.
             * <p>
             * 
             * *   **active**: The certificate is associated with a listener and in effect.
             * *   **updating**: The additional certificate is being replaced.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
}
