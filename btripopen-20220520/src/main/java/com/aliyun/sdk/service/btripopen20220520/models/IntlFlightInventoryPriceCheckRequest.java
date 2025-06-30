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
 * {@link IntlFlightInventoryPriceCheckRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightInventoryPriceCheckRequest</p>
 */
public class IntlFlightInventoryPriceCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String btripUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("buyer_name")
    private String buyerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_price")
    private Long orderPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ota_item_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String otaItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("passenger_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<PassengerList> passengerList;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightInventoryPriceCheckRequest(Builder builder) {
        super(builder);
        this.btripUserId = builder.btripUserId;
        this.buyerName = builder.buyerName;
        this.isvName = builder.isvName;
        this.orderPrice = builder.orderPrice;
        this.otaItemId = builder.otaItemId;
        this.passengerList = builder.passengerList;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightInventoryPriceCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return orderPrice
     */
    public Long getOrderPrice() {
        return this.orderPrice;
    }

    /**
     * @return otaItemId
     */
    public String getOtaItemId() {
        return this.otaItemId;
    }

    /**
     * @return passengerList
     */
    public java.util.List<PassengerList> getPassengerList() {
        return this.passengerList;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightInventoryPriceCheckRequest, Builder> {
        private String btripUserId; 
        private String buyerName; 
        private String isvName; 
        private Long orderPrice; 
        private String otaItemId; 
        private java.util.List<PassengerList> passengerList; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightInventoryPriceCheckRequest request) {
            super(request);
            this.btripUserId = request.btripUserId;
            this.buyerName = request.buyerName;
            this.isvName = request.isvName;
            this.orderPrice = request.orderPrice;
            this.otaItemId = request.otaItemId;
            this.passengerList = request.passengerList;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder btripUserId(String btripUserId) {
            this.putQueryParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * buyer_name.
         */
        public Builder buyerName(String buyerName) {
            this.putQueryParameter("buyer_name", buyerName);
            this.buyerName = buyerName;
            return this;
        }

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putQueryParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * order_price.
         */
        public Builder orderPrice(Long orderPrice) {
            this.putQueryParameter("order_price", orderPrice);
            this.orderPrice = orderPrice;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22111acaf9ea47c09ed0db6abc45be2d_0</p>
         */
        public Builder otaItemId(String otaItemId) {
            this.putQueryParameter("ota_item_id", otaItemId);
            this.otaItemId = otaItemId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder passengerList(java.util.List<PassengerList> passengerList) {
            String passengerListShrink = shrink(passengerList, "passenger_list", "json");
            this.putQueryParameter("passenger_list", passengerListShrink);
            this.passengerList = passengerList;
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
        public IntlFlightInventoryPriceCheckRequest build() {
            return new IntlFlightInventoryPriceCheckRequest(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightInventoryPriceCheckRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightInventoryPriceCheckRequest</p>
     */
    public static class CertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("cert_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer certType;

        @com.aliyun.core.annotation.NameInMap("cert_valid_date")
        private String certValidDate;

        @com.aliyun.core.annotation.NameInMap("issue_place")
        private String issuePlace;

        private CertInfo(Builder builder) {
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.certValidDate = builder.certValidDate;
            this.issuePlace = builder.issuePlace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfo create() {
            return builder().build();
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
        public Integer getCertType() {
            return this.certType;
        }

        /**
         * @return certValidDate
         */
        public String getCertValidDate() {
            return this.certValidDate;
        }

        /**
         * @return issuePlace
         */
        public String getIssuePlace() {
            return this.issuePlace;
        }

        public static final class Builder {
            private String certNo; 
            private Integer certType; 
            private String certValidDate; 
            private String issuePlace; 

            private Builder() {
            } 

            private Builder(CertInfo model) {
                this.certNo = model.certNo;
                this.certType = model.certType;
                this.certValidDate = model.certValidDate;
                this.issuePlace = model.issuePlace;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>H123456</p>
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder certType(Integer certType) {
                this.certType = certType;
                return this;
            }

            /**
             * cert_valid_date.
             */
            public Builder certValidDate(String certValidDate) {
                this.certValidDate = certValidDate;
                return this;
            }

            /**
             * issue_place.
             */
            public Builder issuePlace(String issuePlace) {
                this.issuePlace = issuePlace;
                return this;
            }

            public CertInfo build() {
                return new CertInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightInventoryPriceCheckRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightInventoryPriceCheckRequest</p>
     */
    public static class PassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        @com.aliyun.core.annotation.Validation(required = true)
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("cert_info")
        @com.aliyun.core.annotation.Validation(required = true)
        private CertInfo certInfo;

        @com.aliyun.core.annotation.NameInMap("full_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("gender")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("job_no")
        private String jobNo;

        @com.aliyun.core.annotation.NameInMap("nationality")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("nationality_code")
        private String nationalityCode;

        @com.aliyun.core.annotation.NameInMap("phone")
        @com.aliyun.core.annotation.Validation(required = true)
        private String phone;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("user_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_type")
        private Integer userType;

        private PassengerList(Builder builder) {
            this.birthday = builder.birthday;
            this.certInfo = builder.certInfo;
            this.fullName = builder.fullName;
            this.gender = builder.gender;
            this.jobNo = builder.jobNo;
            this.nationality = builder.nationality;
            this.nationalityCode = builder.nationalityCode;
            this.phone = builder.phone;
            this.type = builder.type;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerList create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return certInfo
         */
        public CertInfo getCertInfo() {
            return this.certInfo;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
        }

        /**
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        /**
         * @return nationalityCode
         */
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String birthday; 
            private CertInfo certInfo; 
            private String fullName; 
            private Integer gender; 
            private String jobNo; 
            private String nationality; 
            private String nationalityCode; 
            private String phone; 
            private Integer type; 
            private String userId; 
            private Integer userType; 

            private Builder() {
            } 

            private Builder(PassengerList model) {
                this.birthday = model.birthday;
                this.certInfo = model.certInfo;
                this.fullName = model.fullName;
                this.gender = model.gender;
                this.jobNo = model.jobNo;
                this.nationality = model.nationality;
                this.nationalityCode = model.nationalityCode;
                this.phone = model.phone;
                this.type = model.type;
                this.userId = model.userId;
                this.userType = model.userType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-01</p>
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder certInfo(CertInfo certInfo) {
                this.certInfo = certInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZHANG/SAN</p>
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>中国大陆</p>
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * nationality_code.
             */
            public Builder nationalityCode(String nationalityCode) {
                this.nationalityCode = nationalityCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>18012341234</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_type.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            public PassengerList build() {
                return new PassengerList(this);
            } 

        } 

    }
}
