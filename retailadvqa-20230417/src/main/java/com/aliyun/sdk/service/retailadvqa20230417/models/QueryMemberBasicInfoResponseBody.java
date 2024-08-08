// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMemberBasicInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMemberBasicInfoResponseBody</p>
 */
public class QueryMemberBasicInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryMemberBasicInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMemberBasicInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public QueryMemberBasicInfoResponseBody build() {
            return new QueryMemberBasicInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("Avatar")
        @com.aliyun.core.annotation.Validation(required = true)
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("Birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("LevelName")
        private String levelName;

        @com.aliyun.core.annotation.NameInMap("LevelNum")
        private String levelNum;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("MemberNickName")
        private String memberNickName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("NearExpiredScore")
        private String nearExpiredScore;

        @com.aliyun.core.annotation.NameInMap("OpenMerchantId")
        private String openMerchantId;

        @com.aliyun.core.annotation.NameInMap("OuterMemberId")
        private String outerMemberId;

        @com.aliyun.core.annotation.NameInMap("Points")
        private String points;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Sex")
        private String sex;

        private Data(Builder builder) {
            this.area = builder.area;
            this.avatar = builder.avatar;
            this.birthday = builder.birthday;
            this.city = builder.city;
            this.country = builder.country;
            this.email = builder.email;
            this.extra = builder.extra;
            this.levelName = builder.levelName;
            this.levelNum = builder.levelNum;
            this.memberName = builder.memberName;
            this.memberNickName = builder.memberNickName;
            this.mobile = builder.mobile;
            this.nearExpiredScore = builder.nearExpiredScore;
            this.openMerchantId = builder.openMerchantId;
            this.outerMemberId = builder.outerMemberId;
            this.points = builder.points;
            this.province = builder.province;
            this.score = builder.score;
            this.sex = builder.sex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return levelName
         */
        public String getLevelName() {
            return this.levelName;
        }

        /**
         * @return levelNum
         */
        public String getLevelNum() {
            return this.levelNum;
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
         * @return nearExpiredScore
         */
        public String getNearExpiredScore() {
            return this.nearExpiredScore;
        }

        /**
         * @return openMerchantId
         */
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        /**
         * @return outerMemberId
         */
        public String getOuterMemberId() {
            return this.outerMemberId;
        }

        /**
         * @return points
         */
        public String getPoints() {
            return this.points;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
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
            private String extra; 
            private String levelName; 
            private String levelNum; 
            private String memberName; 
            private String memberNickName; 
            private String mobile; 
            private String nearExpiredScore; 
            private String openMerchantId; 
            private String outerMemberId; 
            private String points; 
            private String province; 
            private String score; 
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
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * LevelName.
             */
            public Builder levelName(String levelName) {
                this.levelName = levelName;
                return this;
            }

            /**
             * LevelNum.
             */
            public Builder levelNum(String levelNum) {
                this.levelNum = levelNum;
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
             * NearExpiredScore.
             */
            public Builder nearExpiredScore(String nearExpiredScore) {
                this.nearExpiredScore = nearExpiredScore;
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
             * OuterMemberId.
             */
            public Builder outerMemberId(String outerMemberId) {
                this.outerMemberId = outerMemberId;
                return this;
            }

            /**
             * Points.
             */
            public Builder points(String points) {
                this.points = points;
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
             * Score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * Sex.
             */
            public Builder sex(String sex) {
                this.sex = sex;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
