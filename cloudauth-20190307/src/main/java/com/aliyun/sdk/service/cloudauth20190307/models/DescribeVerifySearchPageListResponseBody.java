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
 * {@link DescribeVerifySearchPageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifySearchPageListResponseBody</p>
 */
public class DescribeVerifySearchPageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeVerifySearchPageListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifySearchPageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeVerifySearchPageListResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Paged list data.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>47D87BC1-D956-573A-8A15-A9007A76F56C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>53</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeVerifySearchPageListResponseBody build() {
            return new DescribeVerifySearchPageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifySearchPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifySearchPageListResponseBody</p>
     */
    public static class ExtInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("DeviceRisk")
        private String deviceRisk;

        @com.aliyun.core.annotation.NameInMap("FaceAttack")
        private String faceAttack;

        @com.aliyun.core.annotation.NameInMap("FaceAttackScore")
        private Float faceAttackScore;

        @com.aliyun.core.annotation.NameInMap("FaceOcclusion")
        private String faceOcclusion;

        @com.aliyun.core.annotation.NameInMap("IdCardVerifyScore")
        private Float idCardVerifyScore;

        @com.aliyun.core.annotation.NameInMap("OssBucketName")
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("OssIdFaceObjectName")
        private String ossIdFaceObjectName;

        @com.aliyun.core.annotation.NameInMap("OssIdNationalEmblemObjectName")
        private String ossIdNationalEmblemObjectName;

        @com.aliyun.core.annotation.NameInMap("OssObjectName")
        private String ossObjectName;

        @com.aliyun.core.annotation.NameInMap("QualityScore")
        private Float qualityScore;

        @com.aliyun.core.annotation.NameInMap("VerifyScore")
        private Float verifyScore;

        @com.aliyun.core.annotation.NameInMap("asrTexts")
        private java.util.List<String> asrTexts;

        @com.aliyun.core.annotation.NameInMap("screenVideoObjectNames")
        private java.util.List<String> screenVideoObjectNames;

        @com.aliyun.core.annotation.NameInMap("voiceObjectNames")
        private java.util.List<String> voiceObjectNames;

        private ExtInfo(Builder builder) {
            this.certName = builder.certName;
            this.deviceRisk = builder.deviceRisk;
            this.faceAttack = builder.faceAttack;
            this.faceAttackScore = builder.faceAttackScore;
            this.faceOcclusion = builder.faceOcclusion;
            this.idCardVerifyScore = builder.idCardVerifyScore;
            this.ossBucketName = builder.ossBucketName;
            this.ossIdFaceObjectName = builder.ossIdFaceObjectName;
            this.ossIdNationalEmblemObjectName = builder.ossIdNationalEmblemObjectName;
            this.ossObjectName = builder.ossObjectName;
            this.qualityScore = builder.qualityScore;
            this.verifyScore = builder.verifyScore;
            this.asrTexts = builder.asrTexts;
            this.screenVideoObjectNames = builder.screenVideoObjectNames;
            this.voiceObjectNames = builder.voiceObjectNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtInfo create() {
            return builder().build();
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return deviceRisk
         */
        public String getDeviceRisk() {
            return this.deviceRisk;
        }

        /**
         * @return faceAttack
         */
        public String getFaceAttack() {
            return this.faceAttack;
        }

        /**
         * @return faceAttackScore
         */
        public Float getFaceAttackScore() {
            return this.faceAttackScore;
        }

        /**
         * @return faceOcclusion
         */
        public String getFaceOcclusion() {
            return this.faceOcclusion;
        }

        /**
         * @return idCardVerifyScore
         */
        public Float getIdCardVerifyScore() {
            return this.idCardVerifyScore;
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return ossIdFaceObjectName
         */
        public String getOssIdFaceObjectName() {
            return this.ossIdFaceObjectName;
        }

        /**
         * @return ossIdNationalEmblemObjectName
         */
        public String getOssIdNationalEmblemObjectName() {
            return this.ossIdNationalEmblemObjectName;
        }

        /**
         * @return ossObjectName
         */
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        /**
         * @return qualityScore
         */
        public Float getQualityScore() {
            return this.qualityScore;
        }

        /**
         * @return verifyScore
         */
        public Float getVerifyScore() {
            return this.verifyScore;
        }

        /**
         * @return asrTexts
         */
        public java.util.List<String> getAsrTexts() {
            return this.asrTexts;
        }

        /**
         * @return screenVideoObjectNames
         */
        public java.util.List<String> getScreenVideoObjectNames() {
            return this.screenVideoObjectNames;
        }

        /**
         * @return voiceObjectNames
         */
        public java.util.List<String> getVoiceObjectNames() {
            return this.voiceObjectNames;
        }

        public static final class Builder {
            private String certName; 
            private String deviceRisk; 
            private String faceAttack; 
            private Float faceAttackScore; 
            private String faceOcclusion; 
            private Float idCardVerifyScore; 
            private String ossBucketName; 
            private String ossIdFaceObjectName; 
            private String ossIdNationalEmblemObjectName; 
            private String ossObjectName; 
            private Float qualityScore; 
            private Float verifyScore; 
            private java.util.List<String> asrTexts; 
            private java.util.List<String> screenVideoObjectNames; 
            private java.util.List<String> voiceObjectNames; 

            private Builder() {
            } 

            private Builder(ExtInfo model) {
                this.certName = model.certName;
                this.deviceRisk = model.deviceRisk;
                this.faceAttack = model.faceAttack;
                this.faceAttackScore = model.faceAttackScore;
                this.faceOcclusion = model.faceOcclusion;
                this.idCardVerifyScore = model.idCardVerifyScore;
                this.ossBucketName = model.ossBucketName;
                this.ossIdFaceObjectName = model.ossIdFaceObjectName;
                this.ossIdNationalEmblemObjectName = model.ossIdNationalEmblemObjectName;
                this.ossObjectName = model.ossObjectName;
                this.qualityScore = model.qualityScore;
                this.verifyScore = model.verifyScore;
                this.asrTexts = model.asrTexts;
                this.screenVideoObjectNames = model.screenVideoObjectNames;
                this.voiceObjectNames = model.voiceObjectNames;
            } 

            /**
             * <p>Desensitized name.</p>
             * 
             * <strong>example:</strong>
             * <p>何*</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>Face guard label.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder deviceRisk(String deviceRisk) {
                this.deviceRisk = deviceRisk;
                return this;
            }

            /**
             * <p>Whether it is a face attack:</p>
             * <ul>
             * <li><strong>T</strong>: Yes</li>
             * <li><strong>F</strong>: No</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>T</p>
             */
            public Builder faceAttack(String faceAttack) {
                this.faceAttack = faceAttack;
                return this;
            }

            /**
             * <p>Face attack score, with a range of 0~1. A value closer to 1 indicates a higher likelihood of an attack.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0000445161</p>
             */
            public Builder faceAttackScore(Float faceAttackScore) {
                this.faceAttackScore = faceAttackScore;
                return this;
            }

            /**
             * <p>Whether the face is occluded, T if yes, F otherwise.</p>
             * 
             * <strong>example:</strong>
             * <p>T</p>
             */
            public Builder faceOcclusion(String faceOcclusion) {
                this.faceOcclusion = faceOcclusion;
                return this;
            }

            /**
             * <p>Face-to-ID card comparison score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder idCardVerifyScore(Float idCardVerifyScore) {
                this.idCardVerifyScore = idCardVerifyScore;
                return this;
            }

            /**
             * <p>The OSS bucket for the photo.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-aliyun-cloudauth-XXX</p>
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * <p>OCR ID card face file name.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder ossIdFaceObjectName(String ossIdFaceObjectName) {
                this.ossIdFaceObjectName = ossIdFaceObjectName;
                return this;
            }

            /**
             * <p>OCR ID card national emblem file name.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder ossIdNationalEmblemObjectName(String ossIdNationalEmblemObjectName) {
                this.ossIdNationalEmblemObjectName = ossIdNationalEmblemObjectName;
                return this;
            }

            /**
             * <p>The name of the stored object.</p>
             * 
             * <strong>example:</strong>
             * <p>verify/XXXXX1251634779/sha6a0a0cab01288c7aa8ac3f45220eb_0_normal.jpeg</p>
             */
            public Builder ossObjectName(String ossObjectName) {
                this.ossObjectName = ossObjectName;
                return this;
            }

            /**
             * <p>Liveness face quality score.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder qualityScore(Float qualityScore) {
                this.qualityScore = qualityScore;
                return this;
            }

            /**
             * <p>Face comparison score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder verifyScore(Float verifyScore) {
                this.verifyScore = verifyScore;
                return this;
            }

            /**
             * <p>List of ASR texts.</p>
             */
            public Builder asrTexts(java.util.List<String> asrTexts) {
                this.asrTexts = asrTexts;
                return this;
            }

            /**
             * <p>List of OSS file names for screen recording files.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder screenVideoObjectNames(java.util.List<String> screenVideoObjectNames) {
                this.screenVideoObjectNames = screenVideoObjectNames;
                return this;
            }

            /**
             * <p>List of OSS file names for audio files.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder voiceObjectNames(java.util.List<String> voiceObjectNames) {
                this.voiceObjectNames = voiceObjectNames;
                return this;
            }

            public ExtInfo build() {
                return new ExtInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVerifySearchPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifySearchPageListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertNo")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("CertifyId")
        private String certifyId;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private ExtInfo extInfo;

        @com.aliyun.core.annotation.NameInMap("GmtVerify")
        private String gmtVerify;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("OuterOrderNo")
        private String outerOrderNo;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("Root")
        private Integer root;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private Long sceneId;

        @com.aliyun.core.annotation.NameInMap("Simulator")
        private Integer simulator;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VirtualVideo")
        private Integer virtualVideo;

        private Items(Builder builder) {
            this.certNo = builder.certNo;
            this.certifyId = builder.certifyId;
            this.extInfo = builder.extInfo;
            this.gmtVerify = builder.gmtVerify;
            this.model = builder.model;
            this.outerOrderNo = builder.outerOrderNo;
            this.passed = builder.passed;
            this.productCode = builder.productCode;
            this.root = builder.root;
            this.sceneId = builder.sceneId;
            this.simulator = builder.simulator;
            this.subCode = builder.subCode;
            this.userId = builder.userId;
            this.virtualVideo = builder.virtualVideo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certifyId
         */
        public String getCertifyId() {
            return this.certifyId;
        }

        /**
         * @return extInfo
         */
        public ExtInfo getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return gmtVerify
         */
        public String getGmtVerify() {
            return this.gmtVerify;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return outerOrderNo
         */
        public String getOuterOrderNo() {
            return this.outerOrderNo;
        }

        /**
         * @return passed
         */
        public String getPassed() {
            return this.passed;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return root
         */
        public Integer getRoot() {
            return this.root;
        }

        /**
         * @return sceneId
         */
        public Long getSceneId() {
            return this.sceneId;
        }

        /**
         * @return simulator
         */
        public Integer getSimulator() {
            return this.simulator;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return virtualVideo
         */
        public Integer getVirtualVideo() {
            return this.virtualVideo;
        }

        public static final class Builder {
            private String certNo; 
            private String certifyId; 
            private ExtInfo extInfo; 
            private String gmtVerify; 
            private String model; 
            private String outerOrderNo; 
            private String passed; 
            private String productCode; 
            private Integer root; 
            private Long sceneId; 
            private Integer simulator; 
            private String subCode; 
            private String userId; 
            private Integer virtualVideo; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.certNo = model.certNo;
                this.certifyId = model.certifyId;
                this.extInfo = model.extInfo;
                this.gmtVerify = model.gmtVerify;
                this.model = model.model;
                this.outerOrderNo = model.outerOrderNo;
                this.passed = model.passed;
                this.productCode = model.productCode;
                this.root = model.root;
                this.sceneId = model.sceneId;
                this.simulator = model.simulator;
                this.subCode = model.subCode;
                this.userId = model.userId;
                this.virtualVideo = model.virtualVideo;
            } 

            /**
             * <p>Desensitized ID number.</p>
             * 
             * <strong>example:</strong>
             * <p>3****************2</p>
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * <p>Certification ID.</p>
             * 
             * <strong>example:</strong>
             * <p>shad861465f2aaeeb805b519e1a93ab2</p>
             */
            public Builder certifyId(String certifyId) {
                this.certifyId = certifyId;
                return this;
            }

            /**
             * <p>Extended information.</p>
             */
            public Builder extInfo(ExtInfo extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * <p>Verification time of this authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-14 15:40:13</p>
             */
            public Builder gmtVerify(String gmtVerify) {
                this.gmtVerify = gmtVerify;
                return this;
            }

            /**
             * <p>Liveness detection scheme.</p>
             * 
             * <strong>example:</strong>
             * <p>MULTI_ACTION</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>Unique identifier for the customer request.</p>
             * 
             * <strong>example:</strong>
             * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
             */
            public Builder outerOrderNo(String outerOrderNo) {
                this.outerOrderNo = outerOrderNo;
                return this;
            }

            /**
             * <p>Whether the certification passed. Values:</p>
             * <ul>
             * <li><strong>T</strong>: Passed.</li>
             * <li><strong>F</strong>: Not passed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>T</p>
             */
            public Builder passed(String passed) {
                this.passed = passed;
                return this;
            }

            /**
             * <p>Product code.</p>
             * 
             * <strong>example:</strong>
             * <p>ID_PRO</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>Whether it is root (pass 1 if selected, otherwise do not pass; corresponds to identity label risk type).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder root(Integer root) {
                this.root = root;
                return this;
            }

            /**
             * <p>Scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000015352</p>
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>Whether it is a simulator (pass 1 if selected, otherwise do not pass; corresponds to device label risk type).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder simulator(Integer simulator) {
                this.simulator = simulator;
                return this;
            }

            /**
             * <p>System returned error code.</p>
             * 
             * <strong>example:</strong>
             * <p>207</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>198123xxxxxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Whether it is a virtual adaptation (pass 1 if selected, otherwise do not pass; corresponds to behavior label risk type).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder virtualVideo(Integer virtualVideo) {
                this.virtualVideo = virtualVideo;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
