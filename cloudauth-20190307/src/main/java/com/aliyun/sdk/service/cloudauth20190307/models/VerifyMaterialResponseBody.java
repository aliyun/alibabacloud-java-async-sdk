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
 * {@link VerifyMaterialResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyMaterialResponseBody</p>
 */
public class VerifyMaterialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorityComparisionScore")
    private Float authorityComparisionScore;

    @com.aliyun.core.annotation.NameInMap("IdCardFaceComparisonScore")
    private Float idCardFaceComparisonScore;

    @com.aliyun.core.annotation.NameInMap("Material")
    private Material material;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VerifyStatus")
    private Integer verifyStatus;

    @com.aliyun.core.annotation.NameInMap("VerifyToken")
    private String verifyToken;

    private VerifyMaterialResponseBody(Builder builder) {
        this.authorityComparisionScore = builder.authorityComparisionScore;
        this.idCardFaceComparisonScore = builder.idCardFaceComparisonScore;
        this.material = builder.material;
        this.requestId = builder.requestId;
        this.verifyStatus = builder.verifyStatus;
        this.verifyToken = builder.verifyToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyMaterialResponseBody create() {
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

    /**
     * @return verifyToken
     */
    public String getVerifyToken() {
        return this.verifyToken;
    }

    public static final class Builder {
        private Float authorityComparisionScore; 
        private Float idCardFaceComparisonScore; 
        private Material material; 
        private String requestId; 
        private Integer verifyStatus; 
        private String verifyToken; 

        private Builder() {
        } 

        private Builder(VerifyMaterialResponseBody model) {
            this.authorityComparisionScore = model.authorityComparisionScore;
            this.idCardFaceComparisonScore = model.idCardFaceComparisonScore;
            this.material = model.material;
            this.requestId = model.requestId;
            this.verifyStatus = model.verifyStatus;
            this.verifyToken = model.verifyToken;
        } 

        /**
         * <p>Comparison score between the facial photo submitted during the authentication process and authoritative data, with a range of <strong>0</strong>~<strong>100</strong>.</p>
         * <p>Confidence threshold references:</p>
         * <ul>
         * <li>False recognition rate 0.001% corresponds to a threshold of 95.</li>
         * <li>False recognition rate 0.01% corresponds to a threshold of 90.</li>
         * <li>False recognition rate 0.1% corresponds to a threshold of 80.</li>
         * <li>False recognition rate 1% corresponds to a threshold of 60.</li>
         * </ul>
         * <blockquote>
         * <p>This field only indicates the comparison result between the face and authoritative data, serving as a reference score. It is generally not recommended to use this score alone as the pass/fail criterion. For the comprehensive authentication result, please refer to the <strong>VerifyStatus</strong> field. The <strong>VerifyStatus</strong> result integrates the face-to-authoritative data comparison and other various strategies, enhancing security levels.</p>
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
         * <p>Comparison score between the facial photo submitted during the authentication process and the face on the portrait side of the ID card image, with a range of <strong>0</strong>~<strong>100</strong>.</p>
         * <p>Confidence threshold references:</p>
         * <ul>
         * <li>False recognition rate 0.001% corresponds to a threshold of 95.</li>
         * <li>False recognition rate 0.01% corresponds to a threshold of 90.</li>
         * <li>False recognition rate 0.1% corresponds to a threshold of 80.</li>
         * <li>False recognition rate 1% corresponds to a threshold of 60.</li>
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
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Authentication status. Values:</p>
         * <ul>
         * <li><strong>1</strong>: Authentication passed.</li>
         * <li><strong>2</strong>~<strong>n</strong>: Authentication failed due to various reasons. For detailed descriptions, see the <strong>Authentication Status Explanation</strong> below.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder verifyStatus(Integer verifyStatus) {
            this.verifyStatus = verifyStatus;
            return this;
        }

        /**
         * <p>Token for this authentication, used to link various interfaces in the authentication request, valid for 30 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>c302c0797679457685410ee51a5ba375</p>
         */
        public Builder verifyToken(String verifyToken) {
            this.verifyToken = verifyToken;
            return this;
        }

        public VerifyMaterialResponseBody build() {
            return new VerifyMaterialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyMaterialResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyMaterialResponseBody</p>
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
             * <p>HTTP or HTTPS link to the national emblem side of the ID card. The link is valid for 5 minutes. It is recommended to store it in your business system to avoid any impact on usage.</p>
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
             * <p>End date of the document&quot;s validity period. Format: yyyymmdd.</p>
             * 
             * <strong>example:</strong>
             * <p>20201101</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>HTTP or HTTPS link to the portrait side of the ID card. The link is valid for 5 minutes. It is recommended to store it in your business system to avoid any impact on usage.</p>
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
             * <p>ID number.</p>
             * 
             * <strong>example:</strong>
             * <p>02343218901123****</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>Start date of the document&quot;s validity period. Format: yyyymmdd.</p>
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
     * {@link VerifyMaterialResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyMaterialResponseBody</p>
     */
    public static class Material extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceGlobalUrl")
        private String faceGlobalUrl;

        @com.aliyun.core.annotation.NameInMap("FaceImageUrl")
        private String faceImageUrl;

        @com.aliyun.core.annotation.NameInMap("FaceMask")
        private String faceMask;

        @com.aliyun.core.annotation.NameInMap("FaceQuality")
        private String faceQuality;

        @com.aliyun.core.annotation.NameInMap("IdCardInfo")
        private IdCardInfo idCardInfo;

        @com.aliyun.core.annotation.NameInMap("IdCardName")
        private String idCardName;

        @com.aliyun.core.annotation.NameInMap("IdCardNumber")
        private String idCardNumber;

        private Material(Builder builder) {
            this.faceGlobalUrl = builder.faceGlobalUrl;
            this.faceImageUrl = builder.faceImageUrl;
            this.faceMask = builder.faceMask;
            this.faceQuality = builder.faceQuality;
            this.idCardInfo = builder.idCardInfo;
            this.idCardName = builder.idCardName;
            this.idCardNumber = builder.idCardNumber;
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
        public String getFaceMask() {
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

        public static final class Builder {
            private String faceGlobalUrl; 
            private String faceImageUrl; 
            private String faceMask; 
            private String faceQuality; 
            private IdCardInfo idCardInfo; 
            private String idCardName; 
            private String idCardNumber; 

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
            } 

            /**
             * <p>Global camera image captured by the real-person authentication SDK.</p>
             * <blockquote>
             * <p>This parameter will take effect after configuration. If you need to use this parameter, please submit a <a href="https://selfservice.console.aliyun.com/ticket/category/cloudauth/today">ticket</a> to contact us.</p>
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
             * <p>HTTP or HTTPS link to the frontal face image, corresponding to the request parameter <strong>FaceImageUrl</strong>. The link is valid for 5 minutes, and it is recommended to store it in your business to avoid affecting usage.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</a></p>
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
            public Builder faceMask(String faceMask) {
                this.faceMask = faceMask;
                return this;
            }

            /**
             * <p>The quality of the frontal face image. Possible values:</p>
             * <ul>
             * <li><strong>UNQUALIFIED</strong>: Poor quality</li>
             * <li><strong>LOW</strong>: Low</li>
             * <li><strong>NORMAL</strong>: Average</li>
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
             * <p>OCR result of the ID card information.</p>
             * <blockquote>
             * <p>If there is no front or back of the ID card during the verification process, the OCR result of the ID card information will not be returned. Even if the front and back of the ID card are present during the verification process, it does not guarantee that all the information on the ID card will be returned. Due to issues such as poor ID card photography, the OCR may fail to recognize some information, leading to incomplete OCR results. It is recommended that the business side does not heavily rely on the ID card OCR information.</p>
             * </blockquote>
             */
            public Builder idCardInfo(IdCardInfo idCardInfo) {
                this.idCardInfo = idCardInfo;
                return this;
            }

            /**
             * <p>Name, corresponding to the request parameter <strong>Name</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder idCardName(String idCardName) {
                this.idCardName = idCardName;
                return this;
            }

            /**
             * <p>ID number, corresponding to the request parameter <strong>IdCardNumber</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>02343218901123****</p>
             */
            public Builder idCardNumber(String idCardNumber) {
                this.idCardNumber = idCardNumber;
                return this;
            }

            public Material build() {
                return new Material(this);
            } 

        } 

    }
}
