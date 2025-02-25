// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListListenerCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenerCertificatesResponseBody</p>
 */
public class ListListenerCertificatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certificates")
    private java.util.List<Certificates> certificates;

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
    public java.util.List<Certificates> getCertificates() {
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
        private java.util.List<Certificates> certificates; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The certificates.</p>
         */
        public Builder certificates(java.util.List<Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListListenerCertificatesResponseBody build() {
            return new ListListenerCertificatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListListenerCertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenerCertificatesResponseBody</p>
     */
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private String certificateType;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Certificates(Builder builder) {
            this.certificateId = builder.certificateId;
            this.certificateType = builder.certificateType;
            this.isDefault = builder.isDefault;
            this.status = builder.status;
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
         * @return certificateType
         */
        public String getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String certificateId; 
            private String certificateType; 
            private Boolean isDefault; 
            private String status; 

            /**
             * <p>The certificate ID. Only server certificates are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>12315790343_166f8204689_1714763408_70998****</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>The type of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Server</p>
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * <p>Indicates whether the certificate is the default certificate of the listener. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>Indicates whether the certificate is associated with the listener. Valid values:</p>
             * <ul>
             * <li><strong>Associating</strong></li>
             * <li><strong>Associated</strong></li>
             * <li><strong>Diassociating</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Associating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
}
