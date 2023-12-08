// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alicloudproc20240104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSourcingProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateSourcingProjectRequest</p>
 */
public class CreateSourcingProjectRequest extends Request {
    @Query
    @NameInMap("Address")
    @Validation(required = true)
    private Address address;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("BizNo")
    @Validation(required = true)
    private String bizNo;

    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("Company")
    @Validation(required = true)
    private Company company;

    @Query
    @NameInMap("Contact")
    @Validation(required = true)
    private Contact contact;

    @Query
    @NameInMap("CreateTime")
    @Validation(required = true)
    private String createTime;

    @Query
    @NameInMap("ExpireTime")
    @Validation(required = true)
    private String expireTime;

    @Query
    @NameInMap("ExtendInfo")
    private java.util.Map < String, String > extendInfo;

    @Query
    @NameInMap("SourceUrl")
    @Validation(required = true)
    private String sourceUrl;

    @Query
    @NameInMap("SubBizType")
    @Validation(required = true)
    private String subBizType;

    @Query
    @NameInMap("Subjects")
    @Validation(required = true)
    private java.util.List < Subjects> subjects;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private CreateSourcingProjectRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.bizId = builder.bizId;
        this.bizNo = builder.bizNo;
        this.bizType = builder.bizType;
        this.company = builder.company;
        this.contact = builder.contact;
        this.createTime = builder.createTime;
        this.expireTime = builder.expireTime;
        this.extendInfo = builder.extendInfo;
        this.sourceUrl = builder.sourceUrl;
        this.subBizType = builder.subBizType;
        this.subjects = builder.subjects;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSourcingProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public Address getAddress() {
        return this.address;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizNo
     */
    public String getBizNo() {
        return this.bizNo;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return company
     */
    public Company getCompany() {
        return this.company;
    }

    /**
     * @return contact
     */
    public Contact getContact() {
        return this.contact;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return extendInfo
     */
    public java.util.Map < String, String > getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    /**
     * @return subBizType
     */
    public String getSubBizType() {
        return this.subBizType;
    }

    /**
     * @return subjects
     */
    public java.util.List < Subjects> getSubjects() {
        return this.subjects;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateSourcingProjectRequest, Builder> {
        private Address address; 
        private String bizId; 
        private String bizNo; 
        private String bizType; 
        private Company company; 
        private Contact contact; 
        private String createTime; 
        private String expireTime; 
        private java.util.Map < String, String > extendInfo; 
        private String sourceUrl; 
        private String subBizType; 
        private java.util.List < Subjects> subjects; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateSourcingProjectRequest request) {
            super(request);
            this.address = request.address;
            this.bizId = request.bizId;
            this.bizNo = request.bizNo;
            this.bizType = request.bizType;
            this.company = request.company;
            this.contact = request.contact;
            this.createTime = request.createTime;
            this.expireTime = request.expireTime;
            this.extendInfo = request.extendInfo;
            this.sourceUrl = request.sourceUrl;
            this.subBizType = request.subBizType;
            this.subjects = request.subjects;
            this.title = request.title;
        } 

        /**
         * Address.
         */
        public Builder address(Address address) {
            String addressShrink = shrink(address, "Address", "json");
            this.putQueryParameter("Address", addressShrink);
            this.address = address;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BizNo.
         */
        public Builder bizNo(String bizNo) {
            this.putQueryParameter("BizNo", bizNo);
            this.bizNo = bizNo;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * Company.
         */
        public Builder company(Company company) {
            String companyShrink = shrink(company, "Company", "json");
            this.putQueryParameter("Company", companyShrink);
            this.company = company;
            return this;
        }

        /**
         * Contact.
         */
        public Builder contact(Contact contact) {
            String contactShrink = shrink(contact, "Contact", "json");
            this.putQueryParameter("Contact", contactShrink);
            this.contact = contact;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.putQueryParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * ExtendInfo.
         */
        public Builder extendInfo(java.util.Map < String, String > extendInfo) {
            String extendInfoShrink = shrink(extendInfo, "ExtendInfo", "json");
            this.putQueryParameter("ExtendInfo", extendInfoShrink);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * SourceUrl.
         */
        public Builder sourceUrl(String sourceUrl) {
            this.putQueryParameter("SourceUrl", sourceUrl);
            this.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * SubBizType.
         */
        public Builder subBizType(String subBizType) {
            this.putQueryParameter("SubBizType", subBizType);
            this.subBizType = subBizType;
            return this;
        }

        /**
         * Subjects.
         */
        public Builder subjects(java.util.List < Subjects> subjects) {
            String subjectsShrink = shrink(subjects, "Subjects", "json");
            this.putQueryParameter("Subjects", subjectsShrink);
            this.subjects = subjects;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateSourcingProjectRequest build() {
            return new CreateSourcingProjectRequest(this);
        } 

    } 

    public static class Address extends TeaModel {
        @NameInMap("CityCode")
        @Validation(required = true)
        private String cityCode;

        @NameInMap("Detail")
        @Validation(required = true)
        private String detail;

        @NameInMap("DistrictCode")
        @Validation(required = true)
        private String districtCode;

        @NameInMap("ProvinceCode")
        @Validation(required = true)
        private String provinceCode;

        private Address(Builder builder) {
            this.cityCode = builder.cityCode;
            this.detail = builder.detail;
            this.districtCode = builder.districtCode;
            this.provinceCode = builder.provinceCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Address create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return districtCode
         */
        public String getDistrictCode() {
            return this.districtCode;
        }

        /**
         * @return provinceCode
         */
        public String getProvinceCode() {
            return this.provinceCode;
        }

        public static final class Builder {
            private String cityCode; 
            private String detail; 
            private String districtCode; 
            private String provinceCode; 

            /**
             * CityCode.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * DistrictCode.
             */
            public Builder districtCode(String districtCode) {
                this.districtCode = districtCode;
                return this;
            }

            /**
             * ProvinceCode.
             */
            public Builder provinceCode(String provinceCode) {
                this.provinceCode = provinceCode;
                return this;
            }

            public Address build() {
                return new Address(this);
            } 

        } 

    }
    public static class Company extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Uscc")
        private String uscc;

        private Company(Builder builder) {
            this.name = builder.name;
            this.uscc = builder.uscc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Company create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uscc
         */
        public String getUscc() {
            return this.uscc;
        }

        public static final class Builder {
            private String name; 
            private String uscc; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Uscc.
             */
            public Builder uscc(String uscc) {
                this.uscc = uscc;
                return this;
            }

            public Company build() {
                return new Company(this);
            } 

        } 

    }
    public static class Contact extends TeaModel {
        @NameInMap("Email")
        private String email;

        @NameInMap("Name")
        private String name;

        @NameInMap("Phone")
        private String phone;

        private Contact(Builder builder) {
            this.email = builder.email;
            this.name = builder.name;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String email; 
            private String name; 
            private String phone; 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
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
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    public static class SubjectsAddress extends TeaModel {
        @NameInMap("CityCode")
        @Validation(required = true)
        private String cityCode;

        @NameInMap("Detail")
        @Validation(required = true)
        private String detail;

        @NameInMap("DistrictCode")
        @Validation(required = true)
        private String districtCode;

        @NameInMap("ProvinceCode")
        @Validation(required = true)
        private String provinceCode;

        private SubjectsAddress(Builder builder) {
            this.cityCode = builder.cityCode;
            this.detail = builder.detail;
            this.districtCode = builder.districtCode;
            this.provinceCode = builder.provinceCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubjectsAddress create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return districtCode
         */
        public String getDistrictCode() {
            return this.districtCode;
        }

        /**
         * @return provinceCode
         */
        public String getProvinceCode() {
            return this.provinceCode;
        }

        public static final class Builder {
            private String cityCode; 
            private String detail; 
            private String districtCode; 
            private String provinceCode; 

            /**
             * CityCode.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * DistrictCode.
             */
            public Builder districtCode(String districtCode) {
                this.districtCode = districtCode;
                return this;
            }

            /**
             * ProvinceCode.
             */
            public Builder provinceCode(String provinceCode) {
                this.provinceCode = provinceCode;
                return this;
            }

            public SubjectsAddress build() {
                return new SubjectsAddress(this);
            } 

        } 

    }
    public static class Subjects extends TeaModel {
        @NameInMap("Address")
        private SubjectsAddress address;

        @NameInMap("Code")
        private String code;

        @NameInMap("ExtendInfo")
        private java.util.Map < String, String > extendInfo;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Quantity")
        @Validation(required = true)
        private Double quantity;

        @NameInMap("Spec")
        @Validation(required = true)
        private String spec;

        @NameInMap("Unit")
        @Validation(required = true)
        private String unit;

        private Subjects(Builder builder) {
            this.address = builder.address;
            this.code = builder.code;
            this.extendInfo = builder.extendInfo;
            this.name = builder.name;
            this.quantity = builder.quantity;
            this.spec = builder.spec;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subjects create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public SubjectsAddress getAddress() {
            return this.address;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return extendInfo
         */
        public java.util.Map < String, String > getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return quantity
         */
        public Double getQuantity() {
            return this.quantity;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private SubjectsAddress address; 
            private String code; 
            private java.util.Map < String, String > extendInfo; 
            private String name; 
            private Double quantity; 
            private String spec; 
            private String unit; 

            /**
             * Address.
             */
            public Builder address(SubjectsAddress address) {
                this.address = address;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ExtendInfo.
             */
            public Builder extendInfo(java.util.Map < String, String > extendInfo) {
                this.extendInfo = extendInfo;
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
             * Quantity.
             */
            public Builder quantity(Double quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Subjects build() {
                return new Subjects(this);
            } 

        } 

    }
}
