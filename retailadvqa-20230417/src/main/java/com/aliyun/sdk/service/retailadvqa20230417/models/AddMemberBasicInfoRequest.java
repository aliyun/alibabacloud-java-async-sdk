// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMemberBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>AddMemberBasicInfoRequest</p>
 */
public class AddMemberBasicInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private AddMemberBasicInfoRequestBody body;

    private AddMemberBasicInfoRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMemberBasicInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public AddMemberBasicInfoRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<AddMemberBasicInfoRequest, Builder> {
        private AddMemberBasicInfoRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(AddMemberBasicInfoRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(AddMemberBasicInfoRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public AddMemberBasicInfoRequest build() {
            return new AddMemberBasicInfoRequest(this);
        } 

    } 

    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ChannelCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channelCode;

        @com.aliyun.core.annotation.NameInMap("ChannelOpenId")
        private String channelOpenId;

        @com.aliyun.core.annotation.NameInMap("ChannelUnionId")
        private String channelUnionId;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        private Channels(Builder builder) {
            this.appId = builder.appId;
            this.channelCode = builder.channelCode;
            this.channelOpenId = builder.channelOpenId;
            this.channelUnionId = builder.channelUnionId;
            this.scene = builder.scene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return channelCode
         */
        public String getChannelCode() {
            return this.channelCode;
        }

        /**
         * @return channelOpenId
         */
        public String getChannelOpenId() {
            return this.channelOpenId;
        }

        /**
         * @return channelUnionId
         */
        public String getChannelUnionId() {
            return this.channelUnionId;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        public static final class Builder {
            private String appId; 
            private String channelCode; 
            private String channelOpenId; 
            private String channelUnionId; 
            private String scene; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ChannelCode.
             */
            public Builder channelCode(String channelCode) {
                this.channelCode = channelCode;
                return this;
            }

            /**
             * ChannelOpenId.
             */
            public Builder channelOpenId(String channelOpenId) {
                this.channelOpenId = channelOpenId;
                return this;
            }

            /**
             * ChannelUnionId.
             */
            public Builder channelUnionId(String channelUnionId) {
                this.channelUnionId = channelUnionId;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
    public static class AddMemberBasicInfoRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("Birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("Channels")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < Channels> channels;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("MemberNickName")
        private String memberNickName;

        @com.aliyun.core.annotation.NameInMap("MixMobile")
        private String mixMobile;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("OpenMerchantId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String openMerchantId;

        @com.aliyun.core.annotation.NameInMap("PlatFormType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String platFormType;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("Sex")
        private String sex;

        private AddMemberBasicInfoRequestBody(Builder builder) {
            this.area = builder.area;
            this.avatar = builder.avatar;
            this.birthday = builder.birthday;
            this.channels = builder.channels;
            this.city = builder.city;
            this.country = builder.country;
            this.email = builder.email;
            this.extra = builder.extra;
            this.gmtCreate = builder.gmtCreate;
            this.memberName = builder.memberName;
            this.memberNickName = builder.memberNickName;
            this.mixMobile = builder.mixMobile;
            this.mobile = builder.mobile;
            this.openMerchantId = builder.openMerchantId;
            this.platFormType = builder.platFormType;
            this.province = builder.province;
            this.sex = builder.sex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddMemberBasicInfoRequestBody create() {
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
         * @return channels
         */
        public java.util.List < Channels> getChannels() {
            return this.channels;
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
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
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
         * @return mixMobile
         */
        public String getMixMobile() {
            return this.mixMobile;
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
         * @return platFormType
         */
        public String getPlatFormType() {
            return this.platFormType;
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
            private java.util.List < Channels> channels; 
            private String city; 
            private String country; 
            private String email; 
            private String extra; 
            private String gmtCreate; 
            private String memberName; 
            private String memberNickName; 
            private String mixMobile; 
            private String mobile; 
            private String openMerchantId; 
            private String platFormType; 
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
             * Channels.
             */
            public Builder channels(java.util.List < Channels> channels) {
                this.channels = channels;
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
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * MixMobile.
             */
            public Builder mixMobile(String mixMobile) {
                this.mixMobile = mixMobile;
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
             * PlatFormType.
             */
            public Builder platFormType(String platFormType) {
                this.platFormType = platFormType;
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

            public AddMemberBasicInfoRequestBody build() {
                return new AddMemberBasicInfoRequestBody(this);
            } 

        } 

    }
}
