// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVerifyResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifyResultResponseBody</p>
 */
public class DescribeVerifyResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorityComparisionScore")
    private Float authorityComparisionScore;

    @com.aliyun.core.annotation.NameInMap("FaceComparisonScore")
    private Float faceComparisonScore;

    @com.aliyun.core.annotation.NameInMap("IdCardFaceComparisonScore")
    private Float idCardFaceComparisonScore;

    @com.aliyun.core.annotation.NameInMap("Material")
    private Material material;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VerifyStatus")
    private Integer verifyStatus;

    private DescribeVerifyResultResponseBody(Builder builder) {
        this.authorityComparisionScore = builder.authorityComparisionScore;
        this.faceComparisonScore = builder.faceComparisonScore;
        this.idCardFaceComparisonScore = builder.idCardFaceComparisonScore;
        this.material = builder.material;
        this.requestId = builder.requestId;
        this.verifyStatus = builder.verifyStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorityComparisionScore
     */
    public Float getAuthorityComparisionScore() {
        return this.authorityComparisionScore;
    }

    /**
     * @return faceComparisonScore
     */
    public Float getFaceComparisonScore() {
        return this.faceComparisonScore;
    }

    /**
     * @return idCardFaceComparisonScore
     */
    public Float getIdCardFaceComparisonScore() {
        return this.idCardFaceComparisonScore;
    }

    /**
     * @return material
     */
    public Material getMaterial() {
        return this.material;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return verifyStatus
     */
    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public static final class Builder {
        private Float authorityComparisionScore; 
        private Float faceComparisonScore; 
        private Float idCardFaceComparisonScore; 
        private Material material; 
        private String requestId; 
        private Integer verifyStatus; 

        /**
         * AuthorityComparisionScore.
         */
        public Builder authorityComparisionScore(Float authorityComparisionScore) {
            this.authorityComparisionScore = authorityComparisionScore;
            return this;
        }

        /**
         * FaceComparisonScore.
         */
        public Builder faceComparisonScore(Float faceComparisonScore) {
            this.faceComparisonScore = faceComparisonScore;
            return this;
        }

        /**
         * IdCardFaceComparisonScore.
         */
        public Builder idCardFaceComparisonScore(Float idCardFaceComparisonScore) {
            this.idCardFaceComparisonScore = idCardFaceComparisonScore;
            return this;
        }

        /**
         * Material.
         */
        public Builder material(Material material) {
            this.material = material;
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
         * VerifyStatus.
         */
        public Builder verifyStatus(Integer verifyStatus) {
            this.verifyStatus = verifyStatus;
            return this;
        }

        public DescribeVerifyResultResponseBody build() {
            return new DescribeVerifyResultResponseBody(this);
        } 

    } 

    public static class IdCardInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Authority")
        private String authority;

        @com.aliyun.core.annotation.NameInMap("BackImageUrl")
        private String backImageUrl;

        @com.aliyun.core.annotation.NameInMap("Birth")
        private String birth;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("FrontImageUrl")
        private String frontImageUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        private IdCardInfo(Builder builder) {
            this.address = builder.address;
            this.authority = builder.authority;
            this.backImageUrl = builder.backImageUrl;
            this.birth = builder.birth;
            this.endDate = builder.endDate;
            this.frontImageUrl = builder.frontImageUrl;
            this.name = builder.name;
            this.nationality = builder.nationality;
            this.number = builder.number;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdCardInfo create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return authority
         */
        public String getAuthority() {
            return this.authority;
        }

        /**
         * @return backImageUrl
         */
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        /**
         * @return birth
         */
        public String getBirth() {
            return this.birth;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return frontImageUrl
         */
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private String address; 
            private String authority; 
            private String backImageUrl; 
            private String birth; 
            private String endDate; 
            private String frontImageUrl; 
            private String name; 
            private String nationality; 
            private String number; 
            private String startDate; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Authority.
             */
            public Builder authority(String authority) {
                this.authority = authority;
                return this;
            }

            /**
             * BackImageUrl.
             */
            public Builder backImageUrl(String backImageUrl) {
                this.backImageUrl = backImageUrl;
                return this;
            }

            /**
             * Birth.
             */
            public Builder birth(String birth) {
                this.birth = birth;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * FrontImageUrl.
             */
            public Builder frontImageUrl(String frontImageUrl) {
                this.frontImageUrl = frontImageUrl;
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
             * Nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            public IdCardInfo build() {
                return new IdCardInfo(this);
            } 

        } 

    }
    public static class Material extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceGlobalUrl")
        private String faceGlobalUrl;

        @com.aliyun.core.annotation.NameInMap("FaceImageUrl")
        private String faceImageUrl;

        @com.aliyun.core.annotation.NameInMap("FaceMask")
        private Boolean faceMask;

        @com.aliyun.core.annotation.NameInMap("FaceQuality")
        private String faceQuality;

        @com.aliyun.core.annotation.NameInMap("IdCardInfo")
        private IdCardInfo idCardInfo;

        @com.aliyun.core.annotation.NameInMap("IdCardName")
        private String idCardName;

        @com.aliyun.core.annotation.NameInMap("IdCardNumber")
        private String idCardNumber;

        @com.aliyun.core.annotation.NameInMap("VideoUrls")
        private java.util.List < String > videoUrls;

        private Material(Builder builder) {
            this.faceGlobalUrl = builder.faceGlobalUrl;
            this.faceImageUrl = builder.faceImageUrl;
            this.faceMask = builder.faceMask;
            this.faceQuality = builder.faceQuality;
            this.idCardInfo = builder.idCardInfo;
            this.idCardName = builder.idCardName;
            this.idCardNumber = builder.idCardNumber;
            this.videoUrls = builder.videoUrls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Material create() {
            return builder().build();
        }

        /**
         * @return faceGlobalUrl
         */
        public String getFaceGlobalUrl() {
            return this.faceGlobalUrl;
        }

        /**
         * @return faceImageUrl
         */
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        /**
         * @return faceMask
         */
        public Boolean getFaceMask() {
            return this.faceMask;
        }

        /**
         * @return faceQuality
         */
        public String getFaceQuality() {
            return this.faceQuality;
        }

        /**
         * @return idCardInfo
         */
        public IdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

        /**
         * @return idCardName
         */
        public String getIdCardName() {
            return this.idCardName;
        }

        /**
         * @return idCardNumber
         */
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        /**
         * @return videoUrls
         */
        public java.util.List < String > getVideoUrls() {
            return this.videoUrls;
        }

        public static final class Builder {
            private String faceGlobalUrl; 
            private String faceImageUrl; 
            private Boolean faceMask; 
            private String faceQuality; 
            private IdCardInfo idCardInfo; 
            private String idCardName; 
            private String idCardNumber; 
            private java.util.List < String > videoUrls; 

            /**
             * FaceGlobalUrl.
             */
            public Builder faceGlobalUrl(String faceGlobalUrl) {
                this.faceGlobalUrl = faceGlobalUrl;
                return this;
            }

            /**
             * FaceImageUrl.
             */
            public Builder faceImageUrl(String faceImageUrl) {
                this.faceImageUrl = faceImageUrl;
                return this;
            }

            /**
             * FaceMask.
             */
            public Builder faceMask(Boolean faceMask) {
                this.faceMask = faceMask;
                return this;
            }

            /**
             * FaceQuality.
             */
            public Builder faceQuality(String faceQuality) {
                this.faceQuality = faceQuality;
                return this;
            }

            /**
             * IdCardInfo.
             */
            public Builder idCardInfo(IdCardInfo idCardInfo) {
                this.idCardInfo = idCardInfo;
                return this;
            }

            /**
             * IdCardName.
             */
            public Builder idCardName(String idCardName) {
                this.idCardName = idCardName;
                return this;
            }

            /**
             * IdCardNumber.
             */
            public Builder idCardNumber(String idCardNumber) {
                this.idCardNumber = idCardNumber;
                return this;
            }

            /**
             * VideoUrls.
             */
            public Builder videoUrls(java.util.List < String > videoUrls) {
                this.videoUrls = videoUrls;
                return this;
            }

            public Material build() {
                return new Material(this);
            } 

        } 

    }
}
