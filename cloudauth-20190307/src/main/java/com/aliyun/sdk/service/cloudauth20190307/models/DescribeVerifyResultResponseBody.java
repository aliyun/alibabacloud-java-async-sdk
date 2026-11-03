// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeVerifyResultResponseBody model) {
            this.authorityComparisionScore = model.authorityComparisionScore;
            this.faceComparisonScore = model.faceComparisonScore;
            this.idCardFaceComparisonScore = model.idCardFaceComparisonScore;
            this.material = model.material;
            this.requestId = model.requestId;
            this.verifyStatus = model.verifyStatus;
        } 

        /**
         * <p>The comparison score between the face photo submitted during the verification process and the authoritative data. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * <p>Confidence threshold reference:</p>
         * <ul>
         * <li>When the false acceptance rate is 0.001%, the corresponding threshold is 95.</li>
         * <li>When the false acceptance rate is 0.01%, the corresponding threshold is 90.</li>
         * <li>When the false acceptance rate is 0.1%, the corresponding threshold is 80.</li>
         * <li>When the false acceptance rate is 1%, the corresponding threshold is 60.</li>
         * </ul>
         * <blockquote>
         * <p>This field only indicates the comparison result between the face and the authoritative data and is for your reference only. Do not use this value as the sole criterion for determining whether the verification is passed. For the comprehensive verification result, refer to the <strong>VerifyStatus</strong> field. The <strong>VerifyStatus</strong> result combines the face-to-authoritative-data comparison with various other strategies to improve the security level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>97</p>
         */
        public Builder authorityComparisionScore(Float authorityComparisionScore) {
            this.authorityComparisionScore = authorityComparisionScore;
            return this;
        }

        /**
         * <p>The comparison score between the face photo submitted during the verification process and the face in the retained face photo. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * <p>Confidence threshold reference:</p>
         * <ul>
         * <li>When the false acceptance rate is 0.001%, the corresponding threshold is 95.</li>
         * <li>When the false acceptance rate is 0.01%, the corresponding threshold is 90.</li>
         * <li>When the false acceptance rate is 0.1%, the corresponding threshold is 80.</li>
         * <li>When the false acceptance rate is 1%, the corresponding threshold is 60.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>97</p>
         */
        public Builder faceComparisonScore(Float faceComparisonScore) {
            this.faceComparisonScore = faceComparisonScore;
            return this;
        }

        /**
         * <p>The comparison score between the face photo submitted during the verification process and the face in the ID card portrait photo. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * <p>Confidence threshold reference:</p>
         * <ul>
         * <li>When the false acceptance rate is 0.001%, the corresponding threshold is 95.</li>
         * <li>When the false acceptance rate is 0.01%, the corresponding threshold is 90.</li>
         * <li>When the false acceptance rate is 0.1%, the corresponding threshold is 80.</li>
         * <li>When the false acceptance rate is 1%, the corresponding threshold is 60.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>97</p>
         */
        public Builder idCardFaceComparisonScore(Float idCardFaceComparisonScore) {
            this.idCardFaceComparisonScore = idCardFaceComparisonScore;
            return this;
        }

        /**
         * <p>The verification materials.</p>
         */
        public Builder material(Material material) {
            this.material = material;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The verification status. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: Not verified.</li>
         * <li><strong>1</strong>: Verification passed.</li>
         * <li><strong>2</strong> to <strong>n</strong>: Verification failed due to various reasons. For detailed descriptions, see the verification status description.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder verifyStatus(Integer verifyStatus) {
            this.verifyStatus = verifyStatus;
            return this;
        }

        public DescribeVerifyResultResponseBody build() {
            return new DescribeVerifyResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifyResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(IdCardInfo model) {
                this.address = model.address;
                this.authority = model.authority;
                this.backImageUrl = model.backImageUrl;
                this.birth = model.birth;
                this.endDate = model.endDate;
                this.frontImageUrl = model.frontImageUrl;
                this.name = model.name;
                this.nationality = model.nationality;
                this.number = model.number;
                this.startDate = model.startDate;
            } 

            /**
             * <p>The address.</p>
             * 
             * <strong>example:</strong>
             * <p>No. 969 Wenyi West Road, Yuhang District, Hangzhou City, Zhejiang Province</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The issuing authority.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou Municipal Public Security Bureau</p>
             */
            public Builder authority(String authority) {
                this.authority = authority;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS URL of the ID card back image with the national emblem. The URL is valid for 5 minutes. Store the image to prevent service interruptions.</p>
             * <blockquote>
             * <p>If the HTTP or HTTPS URL of the image expires, you can call DescribeVerifyResult again to obtain the URL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example3.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example3.jpg</a></p>
             */
            public Builder backImageUrl(String backImageUrl) {
                this.backImageUrl = backImageUrl;
                return this;
            }

            /**
             * <p>The date of birth.</p>
             * 
             * <strong>example:</strong>
             * <p>19900101</p>
             */
            public Builder birth(String birth) {
                this.birth = birth;
                return this;
            }

            /**
             * <p>The end date of the validity period of the ID card. Format: yyyymmdd.</p>
             * 
             * <strong>example:</strong>
             * <p>20201101</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS URL of the ID card portrait image. The URL is valid for 5 minutes. Store the image to prevent service interruptions.</p>
             * <blockquote>
             * <p>If the HTTP or HTTPS URL of the image expires, you can call DescribeVerifyResult again to obtain the URL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example2.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example2.jpg</a></p>
             */
            public Builder frontImageUrl(String frontImageUrl) {
                this.frontImageUrl = frontImageUrl;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ethnicity.</p>
             * 
             * <strong>example:</strong>
             * <p>Han</p>
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * <p>The ID card number.</p>
             * 
             * <strong>example:</strong>
             * <p>02343218901123****</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The start date of the validity period of the ID card. Format: yyyymmdd.</p>
             * 
             * <strong>example:</strong>
             * <p>20201101</p>
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
    /**
     * 
     * {@link DescribeVerifyResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyResultResponseBody</p>
     */
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
        private java.util.List<String> videoUrls;

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
        public java.util.List<String> getVideoUrls() {
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
            private java.util.List<String> videoUrls; 

            private Builder() {
            } 

            private Builder(Material model) {
                this.faceGlobalUrl = model.faceGlobalUrl;
                this.faceImageUrl = model.faceImageUrl;
                this.faceMask = model.faceMask;
                this.faceQuality = model.faceQuality;
                this.idCardInfo = model.idCardInfo;
                this.idCardName = model.idCardName;
                this.idCardNumber = model.idCardNumber;
                this.videoUrls = model.videoUrls;
            } 

            /**
             * <p>The global image captured by the camera and collected by the ID Verification SDK.</p>
             * <blockquote>
             * <p>This parameter takes effect only after it is configured. If you need to use this parameter, submit a <a href="https://selfservice.console.aliyun.com/ticket/category/cloudauth/today">ticket</a> to contact us.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/face-global-example.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/face-global-example.jpg</a></p>
             */
            public Builder faceGlobalUrl(String faceGlobalUrl) {
                this.faceGlobalUrl = faceGlobalUrl;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS URL of the front-facing face photo. The URL is valid for 5 minutes. Store the image to prevent service interruptions.</p>
             * <blockquote>
             * <p>If the HTTP or HTTPS URL of the front-facing face photo expires, you can call <a href="https://help.aliyun.com/document_detail/154606.html">DescribeVerifyResult</a> again to obtain the URL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/face-image-example.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/face-image-example.jpg</a></p>
             */
            public Builder faceImageUrl(String faceImageUrl) {
                this.faceImageUrl = faceImageUrl;
                return this;
            }

            /**
             * <p>Indicates whether the face is wearing a mask. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A mask is worn.</li>
             * <li><strong>false</strong>: No mask is worn.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder faceMask(Boolean faceMask) {
                this.faceMask = faceMask;
                return this;
            }

            /**
             * <p>The quality of the front-facing face photo. Valid values:</p>
             * <ul>
             * <li><strong>UNQUALIFIED</strong>: Poor photo quality.</li>
             * <li><strong>LOW</strong>: Low.</li>
             * <li><strong>NORMAL</strong>: Normal.</li>
             * <li><strong>HIGH</strong>: High.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder faceQuality(String faceQuality) {
                this.faceQuality = faceQuality;
                return this;
            }

            /**
             * <p>The optical character recognition (OCR) result of the ID card information.</p>
             * <blockquote>
             * <p>If the front and back images of the ID card are not provided during the verification process, the ID Verification service does not return the OCR result of the ID card. Even if the front and back images are provided, the service does not guarantee that all information on the ID card is returned. If the OCR fails to recognize certain information due to photo quality issues, the OCR information will be incomplete. Do not strongly rely on the ID card OCR information in your business.</p>
             * </blockquote>
             */
            public Builder idCardInfo(IdCardInfo idCardInfo) {
                this.idCardInfo = idCardInfo;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder idCardName(String idCardName) {
                this.idCardName = idCardName;
                return this;
            }

            /**
             * <p>The ID card number.</p>
             * 
             * <strong>example:</strong>
             * <p>02343218901123****</p>
             */
            public Builder idCardNumber(String idCardNumber) {
                this.idCardNumber = idCardNumber;
                return this;
            }

            /**
             * <p>The URL of the recorded video returned by the legacy RPH5BioOnly solution.</p>
             */
            public Builder videoUrls(java.util.List<String> videoUrls) {
                this.videoUrls = videoUrls;
                return this;
            }

            public Material build() {
                return new Material(this);
            } 

        } 

    }
}
