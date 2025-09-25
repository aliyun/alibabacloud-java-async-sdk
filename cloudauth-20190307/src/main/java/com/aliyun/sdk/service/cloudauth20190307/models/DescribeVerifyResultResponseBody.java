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
         * <p>The comparison score between the face photo submitted during the authentication process and the authoritative data, with a value range of <strong>0</strong> to <strong>100</strong>.
         * Confidence threshold references:</p>
         * <ul>
         * <li>When the false acceptance rate is 0.001%, the corresponding threshold is 95. - When the false acceptance rate is 0.01%, the corresponding threshold is 90. - When the false acceptance rate is 0.1%, the corresponding threshold is 80. - When the false acceptance rate is 1%, the corresponding threshold is 60.<blockquote>
         * <p>This field only indicates the comparison result between the face and the authoritative data, for your reference only. It is generally not recommended to use this value alone as the standard for whether the authentication passes. For a comprehensive authentication result, please refer to the <strong>VerifyStatus</strong> field. The <strong>VerifyStatus</strong> result integrates the comparison of the face with the authoritative data and various other strategies, which can enhance security levels.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>97</p>
         */
        public Builder authorityComparisionScore(Float authorityComparisionScore) {
            this.authorityComparisionScore = authorityComparisionScore;
            return this;
        }

        /**
         * <p>The comparison score between the face photo submitted during the authentication process and the face in the retained face image. The value range is <strong>0</strong>~<strong>100</strong>.</p>
         * <p>Confidence threshold reference:</p>
         * <ul>
         * <li>When the false recognition rate is 0.001%, the corresponding threshold is 95.</li>
         * <li>When the false recognition rate is 0.01%, the corresponding threshold is 90.</li>
         * <li>When the false recognition rate is 0.1%, the corresponding threshold is 80.</li>
         * <li>When the false recognition rate is 1%, the corresponding threshold is 60.</li>
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
         * <p>The comparison score between the face photo submitted during the authentication process and the face on the ID card&quot;s face side. The value range is <strong>0</strong>~<strong>100</strong>.</p>
         * <p>Confidence threshold reference:</p>
         * <ul>
         * <li>When the false recognition rate is 0.001%, the corresponding threshold is 95.</li>
         * <li>When the false recognition rate is 0.01%, the corresponding threshold is 90.</li>
         * <li>When the false recognition rate is 0.1%, the corresponding threshold is 80.</li>
         * <li>When the false recognition rate is 1%, the corresponding threshold is 60.</li>
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
         * <p>Authentication materials.</p>
         */
        public Builder material(Material material) {
            this.material = material;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Authentication status, values:</p>
         * <ul>
         * <li><strong>-1</strong>: Not authenticated - <strong>1</strong>: Authentication passed - <strong>2</strong> to <strong>n</strong>: Authentication failed for various reasons. For detailed descriptions, see the authentication status explanation.</li>
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
             * <p>Address.</p>
             * 
             * <strong>example:</strong>
             * <p>浙江省杭州市余杭区文一西路969号</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Issuing authority.</p>
             * 
             * <strong>example:</strong>
             * <p>杭州市公安局</p>
             */
            public Builder authority(String authority) {
                this.authority = authority;
                return this;
            }

            /**
             * <p>HTTP/HTTPS link to the image of the back side (national emblem side) of the ID card. The link is valid for 5 minutes, and it is recommended to store it for business use to avoid any impact.</p>
             * <blockquote>
             * <p>If the HTTP/HTTPS link to the front-facing portrait image expires, you can call DescribeVerifyResult again to get the link.</p>
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
             * <p>Date of birth.</p>
             * 
             * <strong>example:</strong>
             * <p>19900101</p>
             */
            public Builder birth(String birth) {
                this.birth = birth;
                return this;
            }

            /**
             * <p>The end date of the document&quot;s validity period. Format: yyyymmdd.</p>
             * 
             * <strong>example:</strong>
             * <p>20201101</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>HTTP/HTTPS link to the image of the front side (portrait side) of the ID card. The link is valid for 5 minutes, and it is recommended to store it for business use to avoid any impact.</p>
             * <blockquote>
             * <p>If the HTTP/HTTPS link to the front-facing portrait image expires, you can call DescribeVerifyResult again to get the link.</p>
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
             * <p>Name.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Nationality.</p>
             * 
             * <strong>example:</strong>
             * <p>汉</p>
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * <p>ID card number.</p>
             * 
             * <strong>example:</strong>
             * <p>02343218901123****</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>Start date of the document&quot;s validity. Format: yyyymmdd.</p>
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
             * <p>The global camera image captured by the real-person authentication SDK.</p>
             * <blockquote>
             * <p>This parameter will only take effect after configuration. If you need to use this parameter, please submit a <a href="https://selfservice.console.aliyun.com/ticket/category/cloudauth/today">ticket</a> to contact us.</p>
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
             * <p>The HTTP or HTTPS link to the frontal face image. The link is valid for 5 minutes, and it is recommended to store it elsewhere to avoid any impact on usage.</p>
             * <blockquote>
             * <p>If the HTTP or HTTPS link to the frontal face image expires, you can call <a href="https://help.aliyun.com/document_detail/154606.html">DescribeVerifyResult</a> again to get the link.</p>
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
             * <p>Whether the face is wearing a mask. Values:</p>
             * <ul>
             * <li><strong>true</strong>: Wearing a mask</li>
             * <li><strong>false</strong>: Not wearing a mask</li>
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
             * <p>The quality of the frontal face image. Values:</p>
             * <ul>
             * <li><strong>UNQUALIFIED</strong>: Poor quality</li>
             * <li><strong>LOW</strong>: Low</li>
             * <li><strong>NORMAL</strong>: Normal</li>
             * <li><strong>HIGH</strong>: High</li>
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
             * <p>OCR results of the ID card information.</p>
             * <blockquote>
             * <p>If there is no front and back information of the ID card during the authentication process, the real-person authentication service will not return the OCR results of the ID card. Even if there is front and back information of the ID card during the authentication process, the real-person authentication service does not guarantee to return all the information on the ID card. Due to issues with ID card photography, the OCR may fail to recognize some information, resulting in incomplete OCR information. It is recommended that your business does not strongly rely on the ID card OCR information.</p>
             * </blockquote>
             */
            public Builder idCardInfo(IdCardInfo idCardInfo) {
                this.idCardInfo = idCardInfo;
                return this;
            }

            /**
             * <p>Name.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder idCardName(String idCardName) {
                this.idCardName = idCardName;
                return this;
            }

            /**
             * <p>ID number.</p>
             * 
             * <strong>example:</strong>
             * <p>02343218901123****</p>
             */
            public Builder idCardNumber(String idCardNumber) {
                this.idCardNumber = idCardNumber;
                return this;
            }

            /**
             * <p>The URL addresses of the recorded videos returned by the historical RPH5BioOnly solution.</p>
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
