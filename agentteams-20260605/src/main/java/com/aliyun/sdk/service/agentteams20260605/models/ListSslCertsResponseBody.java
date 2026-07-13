// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link ListSslCertsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSslCertsResponseBody</p>
 */
public class ListSslCertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSslCertsResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSslCertsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListSslCertsResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSslCertsResponseBody build() {
            return new ListSslCertsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSslCertsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSslCertsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private Long certId;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("ChainCompleted")
        private Boolean chainCompleted;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("NotAfterTimestamp")
        private Long notAfterTimestamp;

        @com.aliyun.core.annotation.NameInMap("NotBeforeTimestamp")
        private Long notBeforeTimestamp;

        private Items(Builder builder) {
            this.algorithm = builder.algorithm;
            this.certId = builder.certId;
            this.certIdentifier = builder.certIdentifier;
            this.certName = builder.certName;
            this.chainCompleted = builder.chainCompleted;
            this.commonName = builder.commonName;
            this.domain = builder.domain;
            this.issuer = builder.issuer;
            this.notAfterTimestamp = builder.notAfterTimestamp;
            this.notBeforeTimestamp = builder.notBeforeTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return certId
         */
        public Long getCertId() {
            return this.certId;
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return chainCompleted
         */
        public Boolean getChainCompleted() {
            return this.chainCompleted;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return notAfterTimestamp
         */
        public Long getNotAfterTimestamp() {
            return this.notAfterTimestamp;
        }

        /**
         * @return notBeforeTimestamp
         */
        public Long getNotBeforeTimestamp() {
            return this.notBeforeTimestamp;
        }

        public static final class Builder {
            private String algorithm; 
            private Long certId; 
            private String certIdentifier; 
            private String certName; 
            private Boolean chainCompleted; 
            private String commonName; 
            private String domain; 
            private String issuer; 
            private Long notAfterTimestamp; 
            private Long notBeforeTimestamp; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.algorithm = model.algorithm;
                this.certId = model.certId;
                this.certIdentifier = model.certIdentifier;
                this.certName = model.certName;
                this.chainCompleted = model.chainCompleted;
                this.commonName = model.commonName;
                this.domain = model.domain;
                this.issuer = model.issuer;
                this.notAfterTimestamp = model.notAfterTimestamp;
                this.notBeforeTimestamp = model.notBeforeTimestamp;
            } 

            /**
             * Algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * CertId.
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * CertIdentifier.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * CertName.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * ChainCompleted.
             */
            public Builder chainCompleted(Boolean chainCompleted) {
                this.chainCompleted = chainCompleted;
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * NotAfterTimestamp.
             */
            public Builder notAfterTimestamp(Long notAfterTimestamp) {
                this.notAfterTimestamp = notAfterTimestamp;
                return this;
            }

            /**
             * NotBeforeTimestamp.
             */
            public Builder notBeforeTimestamp(Long notBeforeTimestamp) {
                this.notBeforeTimestamp = notBeforeTimestamp;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
