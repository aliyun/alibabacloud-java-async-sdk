// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCsrResponseBody} extends {@link TeaModel}
 *
 * <p>ListCsrResponseBody</p>
 */
public class ListCsrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CsrList")
    private java.util.List < CsrList> csrList;

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
    public java.util.List < CsrList> getCsrList() {
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
        private java.util.List < CsrList> csrList; 
        private Long currentPage; 
        private String requestId; 
        private Long showSize; 
        private Long totalCount; 

        /**
         * CsrList.
         */
        public Builder csrList(java.util.List < CsrList> csrList) {
            this.csrList = csrList;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
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
         * ShowSize.
         */
        public Builder showSize(Long showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCsrResponseBody build() {
            return new ListCsrResponseBody(this);
        } 

    } 

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
             * Algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
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
             * CorpName.
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * CountryCode.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * CSR ID。
             */
            public Builder csrId(Long csrId) {
                this.csrId = csrId;
                return this;
            }

            /**
             * Department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * HasPrivateKey.
             */
            public Builder hasPrivateKey(Boolean hasPrivateKey) {
                this.hasPrivateKey = hasPrivateKey;
                return this;
            }

            /**
             * KeySha2.
             */
            public Builder keySha2(String keySha2) {
                this.keySha2 = keySha2;
                return this;
            }

            /**
             * KeySize.
             */
            public Builder keySize(Integer keySize) {
                this.keySize = keySize;
                return this;
            }

            /**
             * Locality.
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * Sans.
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
