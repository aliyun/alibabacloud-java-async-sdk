// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCsrRequest} extends {@link RequestModel}
 *
 * <p>CreateCsrRequest</p>
 */
public class CreateCsrRequest extends Request {
    @Query
    @NameInMap("Algorithm")
    @Validation(required = true)
    private String algorithm;

    @Query
    @NameInMap("CommonName")
    @Validation(required = true)
    private String commonName;

    @Query
    @NameInMap("CorpName")
    private String corpName;

    @Query
    @NameInMap("CountryCode")
    @Validation(required = true)
    private String countryCode;

    @Query
    @NameInMap("Department")
    private String department;

    @Query
    @NameInMap("KeySize")
    @Validation(required = true)
    private Integer keySize;

    @Query
    @NameInMap("Locality")
    @Validation(required = true)
    private String locality;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Province")
    @Validation(required = true)
    private String province;

    @Query
    @NameInMap("Sans")
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
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * CommonName.
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * CorpName.
         */
        public Builder corpName(String corpName) {
            this.putQueryParameter("CorpName", corpName);
            this.corpName = corpName;
            return this;
        }

        /**
         * CountryCode.
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Department.
         */
        public Builder department(String department) {
            this.putQueryParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * KeySize.
         */
        public Builder keySize(Integer keySize) {
            this.putQueryParameter("KeySize", keySize);
            this.keySize = keySize;
            return this;
        }

        /**
         * Locality.
         */
        public Builder locality(String locality) {
            this.putQueryParameter("Locality", locality);
            this.locality = locality;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Province.
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * Sans.
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
