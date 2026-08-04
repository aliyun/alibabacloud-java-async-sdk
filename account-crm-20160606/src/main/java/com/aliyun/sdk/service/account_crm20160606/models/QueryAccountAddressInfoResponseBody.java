// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryAccountAddressInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountAddressInfoResponseBody</p>
 */
public class QueryAccountAddressInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ProfileInfo")
    private ProfileInfo profileInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAccountAddressInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.profileInfo = builder.profileInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountAddressInfoResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return profileInfo
     */
    public ProfileInfo getProfileInfo() {
        return this.profileInfo;
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

    public static final class Builder {
        private String code; 
        private String message; 
        private ProfileInfo profileInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAccountAddressInfoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.profileInfo = model.profileInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * ProfileInfo.
         */
        public Builder profileInfo(ProfileInfo profileInfo) {
            this.profileInfo = profileInfo;
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

        public QueryAccountAddressInfoResponseBody build() {
            return new QueryAccountAddressInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAccountAddressInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountAddressInfoResponseBody</p>
     */
    public static class City extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private City(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static City create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(City model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public City build() {
                return new City(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountAddressInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountAddressInfoResponseBody</p>
     */
    public static class District extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private District(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static District create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(District model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public District build() {
                return new District(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountAddressInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountAddressInfoResponseBody</p>
     */
    public static class Province extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Province(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Province create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Province model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Province build() {
                return new Province(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccountAddressInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountAddressInfoResponseBody</p>
     */
    public static class ProfileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountAttr")
        private String accountAttr;

        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Address2")
        private String address2;

        @com.aliyun.core.annotation.NameInMap("Address3")
        private String address3;

        @com.aliyun.core.annotation.NameInMap("Address4")
        private String address4;

        @com.aliyun.core.annotation.NameInMap("Address5")
        private String address5;

        @com.aliyun.core.annotation.NameInMap("Address6")
        private String address6;

        @com.aliyun.core.annotation.NameInMap("City")
        private City city;

        @com.aliyun.core.annotation.NameInMap("District")
        private District district;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("HavanaId")
        private String havanaId;

        @com.aliyun.core.annotation.NameInMap("NationalityCode")
        private String nationalityCode;

        @com.aliyun.core.annotation.NameInMap("PostCode")
        private String postCode;

        @com.aliyun.core.annotation.NameInMap("Province")
        private Province province;

        @com.aliyun.core.annotation.NameInMap("SelfServicingBusinessRegNum")
        private String selfServicingBusinessRegNum;

        @com.aliyun.core.annotation.NameInMap("SelfServicingIdentificationNum")
        private String selfServicingIdentificationNum;

        @com.aliyun.core.annotation.NameInMap("TrueName")
        private String trueName;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private ProfileInfo(Builder builder) {
            this.accountAttr = builder.accountAttr;
            this.address = builder.address;
            this.address2 = builder.address2;
            this.address3 = builder.address3;
            this.address4 = builder.address4;
            this.address5 = builder.address5;
            this.address6 = builder.address6;
            this.city = builder.city;
            this.district = builder.district;
            this.email = builder.email;
            this.havanaId = builder.havanaId;
            this.nationalityCode = builder.nationalityCode;
            this.postCode = builder.postCode;
            this.province = builder.province;
            this.selfServicingBusinessRegNum = builder.selfServicingBusinessRegNum;
            this.selfServicingIdentificationNum = builder.selfServicingIdentificationNum;
            this.trueName = builder.trueName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProfileInfo create() {
            return builder().build();
        }

        /**
         * @return accountAttr
         */
        public String getAccountAttr() {
            return this.accountAttr;
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return address2
         */
        public String getAddress2() {
            return this.address2;
        }

        /**
         * @return address3
         */
        public String getAddress3() {
            return this.address3;
        }

        /**
         * @return address4
         */
        public String getAddress4() {
            return this.address4;
        }

        /**
         * @return address5
         */
        public String getAddress5() {
            return this.address5;
        }

        /**
         * @return address6
         */
        public String getAddress6() {
            return this.address6;
        }

        /**
         * @return city
         */
        public City getCity() {
            return this.city;
        }

        /**
         * @return district
         */
        public District getDistrict() {
            return this.district;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return havanaId
         */
        public String getHavanaId() {
            return this.havanaId;
        }

        /**
         * @return nationalityCode
         */
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        /**
         * @return postCode
         */
        public String getPostCode() {
            return this.postCode;
        }

        /**
         * @return province
         */
        public Province getProvince() {
            return this.province;
        }

        /**
         * @return selfServicingBusinessRegNum
         */
        public String getSelfServicingBusinessRegNum() {
            return this.selfServicingBusinessRegNum;
        }

        /**
         * @return selfServicingIdentificationNum
         */
        public String getSelfServicingIdentificationNum() {
            return this.selfServicingIdentificationNum;
        }

        /**
         * @return trueName
         */
        public String getTrueName() {
            return this.trueName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String accountAttr; 
            private String address; 
            private String address2; 
            private String address3; 
            private String address4; 
            private String address5; 
            private String address6; 
            private City city; 
            private District district; 
            private String email; 
            private String havanaId; 
            private String nationalityCode; 
            private String postCode; 
            private Province province; 
            private String selfServicingBusinessRegNum; 
            private String selfServicingIdentificationNum; 
            private String trueName; 
            private String version; 

            private Builder() {
            } 

            private Builder(ProfileInfo model) {
                this.accountAttr = model.accountAttr;
                this.address = model.address;
                this.address2 = model.address2;
                this.address3 = model.address3;
                this.address4 = model.address4;
                this.address5 = model.address5;
                this.address6 = model.address6;
                this.city = model.city;
                this.district = model.district;
                this.email = model.email;
                this.havanaId = model.havanaId;
                this.nationalityCode = model.nationalityCode;
                this.postCode = model.postCode;
                this.province = model.province;
                this.selfServicingBusinessRegNum = model.selfServicingBusinessRegNum;
                this.selfServicingIdentificationNum = model.selfServicingIdentificationNum;
                this.trueName = model.trueName;
                this.version = model.version;
            } 

            /**
             * AccountAttr.
             */
            public Builder accountAttr(String accountAttr) {
                this.accountAttr = accountAttr;
                return this;
            }

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Address2.
             */
            public Builder address2(String address2) {
                this.address2 = address2;
                return this;
            }

            /**
             * Address3.
             */
            public Builder address3(String address3) {
                this.address3 = address3;
                return this;
            }

            /**
             * Address4.
             */
            public Builder address4(String address4) {
                this.address4 = address4;
                return this;
            }

            /**
             * Address5.
             */
            public Builder address5(String address5) {
                this.address5 = address5;
                return this;
            }

            /**
             * Address6.
             */
            public Builder address6(String address6) {
                this.address6 = address6;
                return this;
            }

            /**
             * City.
             */
            public Builder city(City city) {
                this.city = city;
                return this;
            }

            /**
             * District.
             */
            public Builder district(District district) {
                this.district = district;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * HavanaId.
             */
            public Builder havanaId(String havanaId) {
                this.havanaId = havanaId;
                return this;
            }

            /**
             * NationalityCode.
             */
            public Builder nationalityCode(String nationalityCode) {
                this.nationalityCode = nationalityCode;
                return this;
            }

            /**
             * PostCode.
             */
            public Builder postCode(String postCode) {
                this.postCode = postCode;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(Province province) {
                this.province = province;
                return this;
            }

            /**
             * SelfServicingBusinessRegNum.
             */
            public Builder selfServicingBusinessRegNum(String selfServicingBusinessRegNum) {
                this.selfServicingBusinessRegNum = selfServicingBusinessRegNum;
                return this;
            }

            /**
             * SelfServicingIdentificationNum.
             */
            public Builder selfServicingIdentificationNum(String selfServicingIdentificationNum) {
                this.selfServicingIdentificationNum = selfServicingIdentificationNum;
                return this;
            }

            /**
             * TrueName.
             */
            public Builder trueName(String trueName) {
                this.trueName = trueName;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ProfileInfo build() {
                return new ProfileInfo(this);
            } 

        } 

    }
}
