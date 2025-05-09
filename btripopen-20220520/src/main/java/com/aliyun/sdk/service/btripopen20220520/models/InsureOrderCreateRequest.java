// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link InsureOrderCreateRequest} extends {@link RequestModel}
 *
 * <p>InsureOrderCreateRequest</p>
 */
public class InsureOrderCreateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("applicant")
    @com.aliyun.core.annotation.Validation(required = true)
    private Applicant applicant;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    private String btripUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("buyer_name")
    private String buyerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ins_person_and_segment_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<InsPersonAndSegmentList> insPersonAndSegmentList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isv_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isvName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_ins_order_id")
    private String outInsOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_sub_order_id")
    private String outSubOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("supplier_code")
    private String supplierCode;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private InsureOrderCreateRequest(Builder builder) {
        super(builder);
        this.applicant = builder.applicant;
        this.btripUserId = builder.btripUserId;
        this.buyerName = builder.buyerName;
        this.insPersonAndSegmentList = builder.insPersonAndSegmentList;
        this.isvName = builder.isvName;
        this.outInsOrderId = builder.outInsOrderId;
        this.outOrderId = builder.outOrderId;
        this.outSubOrderId = builder.outSubOrderId;
        this.supplierCode = builder.supplierCode;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsureOrderCreateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicant
     */
    public Applicant getApplicant() {
        return this.applicant;
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return buyerName
     */
    public String getBuyerName() {
        return this.buyerName;
    }

    /**
     * @return insPersonAndSegmentList
     */
    public java.util.List<InsPersonAndSegmentList> getInsPersonAndSegmentList() {
        return this.insPersonAndSegmentList;
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return outInsOrderId
     */
    public String getOutInsOrderId() {
        return this.outInsOrderId;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return outSubOrderId
     */
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    /**
     * @return supplierCode
     */
    public String getSupplierCode() {
        return this.supplierCode;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<InsureOrderCreateRequest, Builder> {
        private Applicant applicant; 
        private String btripUserId; 
        private String buyerName; 
        private java.util.List<InsPersonAndSegmentList> insPersonAndSegmentList; 
        private String isvName; 
        private String outInsOrderId; 
        private String outOrderId; 
        private String outSubOrderId; 
        private String supplierCode; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(InsureOrderCreateRequest request) {
            super(request);
            this.applicant = request.applicant;
            this.btripUserId = request.btripUserId;
            this.buyerName = request.buyerName;
            this.insPersonAndSegmentList = request.insPersonAndSegmentList;
            this.isvName = request.isvName;
            this.outInsOrderId = request.outInsOrderId;
            this.outOrderId = request.outOrderId;
            this.outSubOrderId = request.outSubOrderId;
            this.supplierCode = request.supplierCode;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder applicant(Applicant applicant) {
            String applicantShrink = shrink(applicant, "applicant", "json");
            this.putBodyParameter("applicant", applicantShrink);
            this.applicant = applicant;
            return this;
        }

        /**
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putBodyParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * buyer_name.
         */
        public Builder buyerName(String buyerName) {
            this.putBodyParameter("buyer_name", buyerName);
            this.buyerName = buyerName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder insPersonAndSegmentList(java.util.List<InsPersonAndSegmentList> insPersonAndSegmentList) {
            String insPersonAndSegmentListShrink = shrink(insPersonAndSegmentList, "ins_person_and_segment_list", "json");
            this.putBodyParameter("ins_person_and_segment_list", insPersonAndSegmentListShrink);
            this.insPersonAndSegmentList = insPersonAndSegmentList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostalSavingsBank</p>
         */
        public Builder isvName(String isvName) {
            this.putBodyParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * out_ins_order_id.
         */
        public Builder outInsOrderId(String outInsOrderId) {
            this.putBodyParameter("out_ins_order_id", outInsOrderId);
            this.outInsOrderId = outInsOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>202310101026030</p>
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * out_sub_order_id.
         */
        public Builder outSubOrderId(String outSubOrderId) {
            this.putBodyParameter("out_sub_order_id", outSubOrderId);
            this.outSubOrderId = outSubOrderId;
            return this;
        }

        /**
         * supplier_code.
         */
        public Builder supplierCode(String supplierCode) {
            this.putBodyParameter("supplier_code", supplierCode);
            this.supplierCode = supplierCode;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public InsureOrderCreateRequest build() {
            return new InsureOrderCreateRequest(this);
        } 

    } 

    /**
     * 
     * {@link InsureOrderCreateRequest} extends {@link TeaModel}
     *
     * <p>InsureOrderCreateRequest</p>
     */
    public static class Applicant extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("btrip_user_id")
        private String btripUserId;

        @com.aliyun.core.annotation.NameInMap("cert_name")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        private Applicant(Builder builder) {
            this.birthday = builder.birthday;
            this.btripUserId = builder.btripUserId;
            this.certName = builder.certName;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.gender = builder.gender;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applicant create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return btripUserId
         */
        public String getBtripUserId() {
            return this.btripUserId;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String birthday; 
            private String btripUserId; 
            private String certName; 
            private String certNo; 
            private String certType; 
            private String gender; 
            private String phone; 

            private Builder() {
            } 

            private Builder(Applicant model) {
                this.birthday = model.birthday;
                this.btripUserId = model.btripUserId;
                this.certName = model.certName;
                this.certNo = model.certNo;
                this.certType = model.certType;
                this.gender = model.gender;
                this.phone = model.phone;
            } 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * btrip_user_id.
             */
            public Builder btripUserId(String btripUserId) {
                this.btripUserId = btripUserId;
                return this;
            }

            /**
             * cert_name.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Applicant build() {
                return new Applicant(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsureOrderCreateRequest} extends {@link TeaModel}
     *
     * <p>InsureOrderCreateRequest</p>
     */
    public static class InsureSegment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        private InsureSegment(Builder builder) {
            this.arrAirportCode = builder.arrAirportCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrTime = builder.arrTime;
            this.depAirportCode = builder.depAirportCode;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depTime = builder.depTime;
            this.flightNo = builder.flightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsureSegment create() {
            return builder().build();
        }

        /**
         * @return arrAirportCode
         */
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        /**
         * @return arrCity
         */
        public String getArrCity() {
            return this.arrCity;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depAirportCode
         */
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        /**
         * @return depCity
         */
        public String getDepCity() {
            return this.depCity;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        public static final class Builder {
            private String arrAirportCode; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrTime; 
            private String depAirportCode; 
            private String depCity; 
            private String depCityCode; 
            private String depTime; 
            private String flightNo; 

            private Builder() {
            } 

            private Builder(InsureSegment model) {
                this.arrAirportCode = model.arrAirportCode;
                this.arrCity = model.arrCity;
                this.arrCityCode = model.arrCityCode;
                this.arrTime = model.arrTime;
                this.depAirportCode = model.depAirportCode;
                this.depCity = model.depCity;
                this.depCityCode = model.depCityCode;
                this.depTime = model.depTime;
                this.flightNo = model.flightNo;
            } 

            /**
             * arr_airport_code.
             */
            public Builder arrAirportCode(String arrAirportCode) {
                this.arrAirportCode = arrAirportCode;
                return this;
            }

            /**
             * arr_city.
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
                return this;
            }

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * dep_airport_code.
             */
            public Builder depAirportCode(String depAirportCode) {
                this.depAirportCode = depAirportCode;
                return this;
            }

            /**
             * dep_city.
             */
            public Builder depCity(String depCity) {
                this.depCity = depCity;
                return this;
            }

            /**
             * dep_city_code.
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            public InsureSegment build() {
                return new InsureSegment(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsureOrderCreateRequest} extends {@link TeaModel}
     *
     * <p>InsureOrderCreateRequest</p>
     */
    public static class Insured extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("btrip_user_id")
        private String btripUserId;

        @com.aliyun.core.annotation.NameInMap("cert_name")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("cert_no")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        private Insured(Builder builder) {
            this.birthday = builder.birthday;
            this.btripUserId = builder.btripUserId;
            this.certName = builder.certName;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.gender = builder.gender;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Insured create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return btripUserId
         */
        public String getBtripUserId() {
            return this.btripUserId;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String birthday; 
            private String btripUserId; 
            private String certName; 
            private String certNo; 
            private String certType; 
            private String gender; 
            private String phone; 

            private Builder() {
            } 

            private Builder(Insured model) {
                this.birthday = model.birthday;
                this.btripUserId = model.btripUserId;
                this.certName = model.certName;
                this.certNo = model.certNo;
                this.certType = model.certType;
                this.gender = model.gender;
                this.phone = model.phone;
            } 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * btrip_user_id.
             */
            public Builder btripUserId(String btripUserId) {
                this.btripUserId = btripUserId;
                return this;
            }

            /**
             * cert_name.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Insured build() {
                return new Insured(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsureOrderCreateRequest} extends {@link TeaModel}
     *
     * <p>InsureOrderCreateRequest</p>
     */
    public static class InsPersonAndSegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("insure_segment")
        private InsureSegment insureSegment;

        @com.aliyun.core.annotation.NameInMap("insured")
        private Insured insured;

        @com.aliyun.core.annotation.NameInMap("out_sub_ins_order_id")
        private String outSubInsOrderId;

        private InsPersonAndSegmentList(Builder builder) {
            this.insureSegment = builder.insureSegment;
            this.insured = builder.insured;
            this.outSubInsOrderId = builder.outSubInsOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsPersonAndSegmentList create() {
            return builder().build();
        }

        /**
         * @return insureSegment
         */
        public InsureSegment getInsureSegment() {
            return this.insureSegment;
        }

        /**
         * @return insured
         */
        public Insured getInsured() {
            return this.insured;
        }

        /**
         * @return outSubInsOrderId
         */
        public String getOutSubInsOrderId() {
            return this.outSubInsOrderId;
        }

        public static final class Builder {
            private InsureSegment insureSegment; 
            private Insured insured; 
            private String outSubInsOrderId; 

            private Builder() {
            } 

            private Builder(InsPersonAndSegmentList model) {
                this.insureSegment = model.insureSegment;
                this.insured = model.insured;
                this.outSubInsOrderId = model.outSubInsOrderId;
            } 

            /**
             * insure_segment.
             */
            public Builder insureSegment(InsureSegment insureSegment) {
                this.insureSegment = insureSegment;
                return this;
            }

            /**
             * insured.
             */
            public Builder insured(Insured insured) {
                this.insured = insured;
                return this;
            }

            /**
             * out_sub_ins_order_id.
             */
            public Builder outSubInsOrderId(String outSubInsOrderId) {
                this.outSubInsOrderId = outSubInsOrderId;
                return this;
            }

            public InsPersonAndSegmentList build() {
                return new InsPersonAndSegmentList(this);
            } 

        } 

    }
}
