// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditMemberBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>EditMemberBasicInfoRequest</p>
 */
public class EditMemberBasicInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    private EditMemberBasicInfoRequestBody body;

    private EditMemberBasicInfoRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditMemberBasicInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public EditMemberBasicInfoRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<EditMemberBasicInfoRequest, Builder> {
        private EditMemberBasicInfoRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(EditMemberBasicInfoRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * Body.
         */
        public Builder body(EditMemberBasicInfoRequestBody body) {
            String bodyShrink = shrink(body, "Body", "json");
            this.putQueryParameter("Body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public EditMemberBasicInfoRequest build() {
            return new EditMemberBasicInfoRequest(this);
        } 

    } 

    public static class EditMemberBasicInfoRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("Birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("MemberNickName")
        private String memberNickName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("OpenMerchantId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String openMerchantId;

        @com.aliyun.core.annotation.NameInMap("PlatformType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String platformType;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("Sex")
        private String sex;

        private EditMemberBasicInfoRequestBody(Builder builder) {
            this.area = builder.area;
            this.avatar = builder.avatar;
            this.birthday = builder.birthday;
            this.city = builder.city;
            this.country = builder.country;
            this.email = builder.email;
            this.memberName = builder.memberName;
            this.memberNickName = builder.memberNickName;
            this.mobile = builder.mobile;
            this.openMerchantId = builder.openMerchantId;
            this.platformType = builder.platformType;
            this.province = builder.province;
            this.sex = builder.sex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EditMemberBasicInfoRequestBody create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return memberNickName
         */
        public String getMemberNickName() {
            return this.memberNickName;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return openMerchantId
         */
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        /**
         * @return platformType
         */
        public String getPlatformType() {
            return this.platformType;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return sex
         */
        public String getSex() {
            return this.sex;
        }

        public static final class Builder {
            private String area; 
            private String avatar; 
            private String birthday; 
            private String city; 
            private String country; 
            private String email; 
            private String memberName; 
            private String memberNickName; 
            private String mobile; 
            private String openMerchantId; 
            private String platformType; 
            private String province; 
            private String sex; 

            /**
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * Avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * Birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
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
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * MemberNickName.
             */
            public Builder memberNickName(String memberNickName) {
                this.memberNickName = memberNickName;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * OpenMerchantId.
             */
            public Builder openMerchantId(String openMerchantId) {
                this.openMerchantId = openMerchantId;
                return this;
            }

            /**
             * PlatformType.
             */
            public Builder platformType(String platformType) {
                this.platformType = platformType;
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
             * Sex.
             */
            public Builder sex(String sex) {
                this.sex = sex;
                return this;
            }

            public EditMemberBasicInfoRequestBody build() {
                return new EditMemberBasicInfoRequestBody(this);
            } 

        } 

    }
}
