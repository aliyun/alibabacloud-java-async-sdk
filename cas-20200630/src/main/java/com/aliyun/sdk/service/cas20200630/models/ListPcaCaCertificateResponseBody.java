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
 * {@link ListPcaCaCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>ListPcaCaCertificateResponseBody</p>
 */
public class ListPcaCaCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListPcaCaCertificateResponseBody(Builder builder) {
        this.list = builder.list;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPcaCaCertificateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<List> list; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListPcaCaCertificateResponseBody model) {
            this.list = model.list;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPcaCaCertificateResponseBody build() {
            return new ListPcaCaCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPcaCaCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>ListPcaCaCertificateResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("IssuerIdentifier")
        private String issuerIdentifier;

        @com.aliyun.core.annotation.NameInMap("PrivateCaInstanceId")
        private String privateCaInstanceId;

        @com.aliyun.core.annotation.NameInMap("PrivateCaRegionId")
        private String privateCaRegionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private List(Builder builder) {
            this.certIdentifier = builder.certIdentifier;
            this.commonName = builder.commonName;
            this.issuerIdentifier = builder.issuerIdentifier;
            this.privateCaInstanceId = builder.privateCaInstanceId;
            this.privateCaRegionId = builder.privateCaRegionId;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return issuerIdentifier
         */
        public String getIssuerIdentifier() {
            return this.issuerIdentifier;
        }

        /**
         * @return privateCaInstanceId
         */
        public String getPrivateCaInstanceId() {
            return this.privateCaInstanceId;
        }

        /**
         * @return privateCaRegionId
         */
        public String getPrivateCaRegionId() {
            return this.privateCaRegionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String certIdentifier; 
            private String commonName; 
            private String issuerIdentifier; 
            private String privateCaInstanceId; 
            private String privateCaRegionId; 
            private String status; 
            private String userId; 

            private Builder() {
            } 

            private Builder(List model) {
                this.certIdentifier = model.certIdentifier;
                this.commonName = model.commonName;
                this.issuerIdentifier = model.issuerIdentifier;
                this.privateCaInstanceId = model.privateCaInstanceId;
                this.privateCaRegionId = model.privateCaRegionId;
                this.status = model.status;
                this.userId = model.userId;
            } 

            /**
             * CertIdentifier.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * CommonName.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * IssuerIdentifier.
             */
            public Builder issuerIdentifier(String issuerIdentifier) {
                this.issuerIdentifier = issuerIdentifier;
                return this;
            }

            /**
             * PrivateCaInstanceId.
             */
            public Builder privateCaInstanceId(String privateCaInstanceId) {
                this.privateCaInstanceId = privateCaInstanceId;
                return this;
            }

            /**
             * PrivateCaRegionId.
             */
            public Builder privateCaRegionId(String privateCaRegionId) {
                this.privateCaRegionId = privateCaRegionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
