// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListCsrResponseBody} extends {@link TeaModel}
 *
 * <p>ListCsrResponseBody</p>
 */
public class ListCsrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CsrList")
    private java.util.List<CsrList> csrList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Long showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCsrResponseBody(Builder builder) {
        this.csrList = builder.csrList;
        this.currentPage = builder.currentPage;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCsrResponseBody create() {
        return builder().build();
    }

    /**
     * @return csrList
     */
    public java.util.List<CsrList> getCsrList() {
        return this.csrList;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Long getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CsrList> csrList; 
        private Long currentPage; 
        private String requestId; 
        private Long showSize; 
        private Long totalCount; 

        /**
         * <p>The CSRs.</p>
         */
        public Builder csrList(java.util.List<CsrList> csrList) {
            this.csrList = csrList;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E865F6AD-0294-4A24-A58B-DAC6BE2BDD20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder showSize(Long showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCsrResponseBody build() {
            return new ListCsrResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCsrResponseBody} extends {@link TeaModel}
     *
     * <p>ListCsrResponseBody</p>
     */
    public static class CsrList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("CorpName")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("CsrId")
        private Long csrId;

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("HasPrivateKey")
        private Boolean hasPrivateKey;

        @com.aliyun.core.annotation.NameInMap("KeySha2")
        private String keySha2;

        @com.aliyun.core.annotation.NameInMap("KeySize")
        private Integer keySize;

        @com.aliyun.core.annotation.NameInMap("Locality")
        private String locality;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("Sans")
        private String sans;

        private CsrList(Builder builder) {
            this.algorithm = builder.algorithm;
            this.commonName = builder.commonName;
            this.corpName = builder.corpName;
            this.countryCode = builder.countryCode;
            this.csrId = builder.csrId;
            this.department = builder.department;
            this.hasPrivateKey = builder.hasPrivateKey;
            this.keySha2 = builder.keySha2;
            this.keySize = builder.keySize;
            this.locality = builder.locality;
            this.name = builder.name;
            this.province = builder.province;
            this.sans = builder.sans;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CsrList create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return corpName
         */
        public String getCorpName() {
            return this.corpName;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return csrId
         */
        public Long getCsrId() {
            return this.csrId;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return hasPrivateKey
         */
        public Boolean getHasPrivateKey() {
            return this.hasPrivateKey;
        }

        /**
         * @return keySha2
         */
        public String getKeySha2() {
            return this.keySha2;
        }

        /**
         * @return keySize
         */
        public Integer getKeySize() {
            return this.keySize;
        }

        /**
         * @return locality
         */
        public String getLocality() {
            return this.locality;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return sans
         */
        public String getSans() {
            return this.sans;
        }

        public static final class Builder {
            private String algorithm; 
            private String commonName; 
            private String corpName; 
            private String countryCode; 
            private Long csrId; 
            private String department; 
            private Boolean hasPrivateKey; 
            private String keySha2; 
            private Integer keySize; 
            private String locality; 
            private String name; 
            private String province; 
            private String sans; 

            /**
             * <p>The algorithm. Valid values: RSA, SM2, and ECC.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The primary domain name, which is a common name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The name of the company.</p>
             * 
             * <strong>example:</strong>
             * <p>corp_name</p>
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * <p>The code of the country or region in which the organization is located. For example, you can use CN to indicate China and use US to indicate the United States. The default value is the code of the country or region in which the organization is located. The organization is associated with the intermediate CA certificate from which the certificate is issued. For more information about country codes, see the &quot;Country codes&quot; section of the <a href="https://help.aliyun.com/document_detail/198289.html">Manage company profiles</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * <p>The ID of the CSR.</p>
             * 
             * <strong>example:</strong>
             * <p>3454</p>
             */
            public Builder csrId(Long csrId) {
                this.csrId = csrId;
                return this;
            }

            /**
             * <p>The department that uses the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>IT</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>Indicates whether the certificate contains a private key.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasPrivateKey(Boolean hasPrivateKey) {
                this.hasPrivateKey = hasPrivateKey;
                return this;
            }

            /**
             * <p>The public key that is calculated by using the SHA256 algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder keySha2(String keySha2) {
                this.keySha2 = keySha2;
                return this;
            }

            /**
             * <p>The key length that is used by the algorithm. The key length for RSA algorithms can be 2,048, 3,072, and 4,096 bits. The key length for ECC and SM2 algorithms can be 256 bits.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder keySize(Integer keySize) {
                this.keySize = keySize;
                return this;
            }

            /**
             * <p>The city where the company is located.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * <p>The name of the CSR.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The province or location.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * <p>The secondary domain names. Separate multiple domain names with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com,www.aliyundoc.com">www.example.com,www.aliyundoc.com</a></p>
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            public CsrList build() {
                return new CsrList(this);
            } 

        } 

    }
}
