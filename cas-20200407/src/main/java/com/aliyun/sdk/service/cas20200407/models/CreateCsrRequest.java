// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCsrRequest} extends {@link RequestModel}
 *
 * <p>CreateCsrRequest</p>
 */
public class CreateCsrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorpName")
    private String corpName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String countryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeySize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer keySize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Locality")
    @com.aliyun.core.annotation.Validation(required = true)
    private String locality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Province")
    @com.aliyun.core.annotation.Validation(required = true)
    private String province;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sans")
    private String sans;

    private CreateCsrRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.commonName = builder.commonName;
        this.corpName = builder.corpName;
        this.countryCode = builder.countryCode;
        this.department = builder.department;
        this.keySize = builder.keySize;
        this.locality = builder.locality;
        this.name = builder.name;
        this.province = builder.province;
        this.sans = builder.sans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCsrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return department
     */
    public String getDepartment() {
        return this.department;
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

    public static final class Builder extends Request.Builder<CreateCsrRequest, Builder> {
        private String algorithm; 
        private String commonName; 
        private String corpName; 
        private String countryCode; 
        private String department; 
        private Integer keySize; 
        private String locality; 
        private String name; 
        private String province; 
        private String sans; 

        private Builder() {
            super();
        } 

        private Builder(CreateCsrRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.commonName = request.commonName;
            this.corpName = request.corpName;
            this.countryCode = request.countryCode;
            this.department = request.department;
            this.keySize = request.keySize;
            this.locality = request.locality;
            this.name = request.name;
            this.province = request.province;
            this.sans = request.sans;
        } 

        /**
         * The algorithm. Valid values: RSA, SM2, and ECC. For more information about algorithms, see [Select an SSL certificate](~~197871~~).
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * The primary domain name, which is a common name.
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * The name of the company.
         */
        public Builder corpName(String corpName) {
            this.putQueryParameter("CorpName", corpName);
            this.corpName = corpName;
            return this;
        }

        /**
         * The code of the country or region in which the organization is located. For example, you can use CN to indicate China and use US to indicate the United States.
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * The department that uses the certificate.
         */
        public Builder department(String department) {
            this.putQueryParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * The key length that is used by the algorithm.
         * <p>
         * 
         * *   The key length for RSA algorithms can be 2,048, 3,072, and 4,096 bits.
         * *   The key length for ECC and SM2 algorithms can be 256 bits.
         */
        public Builder keySize(Integer keySize) {
            this.putQueryParameter("KeySize", keySize);
            this.keySize = keySize;
            return this;
        }

        /**
         * The city where the company is located.
         */
        public Builder locality(String locality) {
            this.putQueryParameter("Locality", locality);
            this.locality = locality;
            return this;
        }

        /**
         * The name of the CSR. The name can be up to 50 characters in length and can contain letters, digits, underscores (\_), hyphens (-), and periods (.).
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The province or location where the company is located.
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * The secondary domain names. Separate multiple domain names with commas (,). You can use the CSR to apply for a certificate for both the primary and secondary domain names.
         */
        public Builder sans(String sans) {
            this.putQueryParameter("Sans", sans);
            this.sans = sans;
            return this;
        }

        @Override
        public CreateCsrRequest build() {
            return new CreateCsrRequest(this);
        } 

    } 

}
