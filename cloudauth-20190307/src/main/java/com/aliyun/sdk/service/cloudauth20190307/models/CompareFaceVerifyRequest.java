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
 * {@link CompareFaceVerifyRequest} extends {@link RequestModel}
 *
 * <p>CompareFaceVerifyRequest</p>
 */
public class CompareFaceVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Crop")
    private String crop;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OuterOrderNo")
    private String outerOrderNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceCertifyId")
    private String sourceCertifyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceFaceContrastPicture")
    @com.aliyun.core.annotation.Validation(maxLength = 1048676)
    private String sourceFaceContrastPicture;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceFaceContrastPictureUrl")
    private String sourceFaceContrastPictureUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceOssBucketName")
    private String sourceOssBucketName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceOssObjectName")
    private String sourceOssObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetCertifyId")
    private String targetCertifyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetFaceContrastPicture")
    @com.aliyun.core.annotation.Validation(maxLength = 1048676)
    private String targetFaceContrastPicture;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetFaceContrastPictureUrl")
    private String targetFaceContrastPictureUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetOssBucketName")
    private String targetOssBucketName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetOssObjectName")
    private String targetOssObjectName;

    private CompareFaceVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.crop = builder.crop;
        this.outerOrderNo = builder.outerOrderNo;
        this.productCode = builder.productCode;
        this.sceneId = builder.sceneId;
        this.sourceCertifyId = builder.sourceCertifyId;
        this.sourceFaceContrastPicture = builder.sourceFaceContrastPicture;
        this.sourceFaceContrastPictureUrl = builder.sourceFaceContrastPictureUrl;
        this.sourceOssBucketName = builder.sourceOssBucketName;
        this.sourceOssObjectName = builder.sourceOssObjectName;
        this.targetCertifyId = builder.targetCertifyId;
        this.targetFaceContrastPicture = builder.targetFaceContrastPicture;
        this.targetFaceContrastPictureUrl = builder.targetFaceContrastPictureUrl;
        this.targetOssBucketName = builder.targetOssBucketName;
        this.targetOssObjectName = builder.targetOssObjectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareFaceVerifyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return crop
     */
    public String getCrop() {
        return this.crop;
    }

    /**
     * @return outerOrderNo
     */
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return sourceCertifyId
     */
    public String getSourceCertifyId() {
        return this.sourceCertifyId;
    }

    /**
     * @return sourceFaceContrastPicture
     */
    public String getSourceFaceContrastPicture() {
        return this.sourceFaceContrastPicture;
    }

    /**
     * @return sourceFaceContrastPictureUrl
     */
    public String getSourceFaceContrastPictureUrl() {
        return this.sourceFaceContrastPictureUrl;
    }

    /**
     * @return sourceOssBucketName
     */
    public String getSourceOssBucketName() {
        return this.sourceOssBucketName;
    }

    /**
     * @return sourceOssObjectName
     */
    public String getSourceOssObjectName() {
        return this.sourceOssObjectName;
    }

    /**
     * @return targetCertifyId
     */
    public String getTargetCertifyId() {
        return this.targetCertifyId;
    }

    /**
     * @return targetFaceContrastPicture
     */
    public String getTargetFaceContrastPicture() {
        return this.targetFaceContrastPicture;
    }

    /**
     * @return targetFaceContrastPictureUrl
     */
    public String getTargetFaceContrastPictureUrl() {
        return this.targetFaceContrastPictureUrl;
    }

    /**
     * @return targetOssBucketName
     */
    public String getTargetOssBucketName() {
        return this.targetOssBucketName;
    }

    /**
     * @return targetOssObjectName
     */
    public String getTargetOssObjectName() {
        return this.targetOssObjectName;
    }

    public static final class Builder extends Request.Builder<CompareFaceVerifyRequest, Builder> {
        private String regionId; 
        private String crop; 
        private String outerOrderNo; 
        private String productCode; 
        private Long sceneId; 
        private String sourceCertifyId; 
        private String sourceFaceContrastPicture; 
        private String sourceFaceContrastPictureUrl; 
        private String sourceOssBucketName; 
        private String sourceOssObjectName; 
        private String targetCertifyId; 
        private String targetFaceContrastPicture; 
        private String targetFaceContrastPictureUrl; 
        private String targetOssBucketName; 
        private String targetOssObjectName; 

        private Builder() {
            super();
        } 

        private Builder(CompareFaceVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.crop = request.crop;
            this.outerOrderNo = request.outerOrderNo;
            this.productCode = request.productCode;
            this.sceneId = request.sceneId;
            this.sourceCertifyId = request.sourceCertifyId;
            this.sourceFaceContrastPicture = request.sourceFaceContrastPicture;
            this.sourceFaceContrastPictureUrl = request.sourceFaceContrastPictureUrl;
            this.sourceOssBucketName = request.sourceOssBucketName;
            this.sourceOssObjectName = request.sourceOssObjectName;
            this.targetCertifyId = request.targetCertifyId;
            this.targetFaceContrastPicture = request.targetFaceContrastPicture;
            this.targetFaceContrastPictureUrl = request.targetFaceContrastPictureUrl;
            this.targetOssBucketName = request.targetOssBucketName;
            this.targetOssObjectName = request.targetOssObjectName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Whether cropping is allowed. Default is not allowed, T/F.</p>
         * <ul>
         * <li>T: Indicates that cropping is required</li>
         * <li>F: Indicates that cropping is not required (default F)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        public Builder crop(String crop) {
            this.putBodyParameter("Crop", crop);
            this.crop = crop;
            return this;
        }

        /**
         * <p>A unique identifier for the merchant&quot;s request. The value is a 32-character alphanumeric combination, where the first few characters are a custom abbreviation defined by the merchant, followed by a period, and the latter part can be a random or incrementing sequence.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putBodyParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
            return this;
        }

        /**
         * <p>Fixed value: PV_FC.</p>
         * 
         * <strong>example:</strong>
         * <p>PV_FC</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Authentication scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000006</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The CertifyId of a previously successful real-person verification, where the photo taken during that verification is used as the face comparison photo.</p>
         * <blockquote>
         * <p>Among the four ways to input facial photos (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, OSS), choose one to provide.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0bfa7c493f850e5178b9f8613634c9xx</p>
         */
        public Builder sourceCertifyId(String sourceCertifyId) {
            this.putBodyParameter("SourceCertifyId", sourceCertifyId);
            this.sourceCertifyId = sourceCertifyId;
            return this;
        }

        /**
         * <p>Base64 encoding of the photo.</p>
         * <blockquote>
         * <p>Choose one of the four ways to input a face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
         */
        public Builder sourceFaceContrastPicture(String sourceFaceContrastPicture) {
            this.putBodyParameter("SourceFaceContrastPicture", sourceFaceContrastPicture);
            this.sourceFaceContrastPicture = sourceFaceContrastPicture;
            return this;
        }

        /**
         * <p>OSS photo URL, currently only supports authorized OSS photo URLs.</p>
         * <blockquote>
         * <p>Four ways to input face photos: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS. Choose one of them to input.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
         */
        public Builder sourceFaceContrastPictureUrl(String sourceFaceContrastPictureUrl) {
            this.putBodyParameter("SourceFaceContrastPictureUrl", sourceFaceContrastPictureUrl);
            this.sourceFaceContrastPictureUrl = sourceFaceContrastPictureUrl;
            return this;
        }

        /**
         * <p>Name of the authorized OSS bucket.</p>
         * <blockquote>
         * <p>Choose one of the four ways to input face photos: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
         */
        public Builder sourceOssBucketName(String sourceOssBucketName) {
            this.putBodyParameter("SourceOssBucketName", sourceOssBucketName);
            this.sourceOssBucketName = sourceOssBucketName;
            return this;
        }

        /**
         * <p>Filename of the authorized OSS space.</p>
         * <blockquote>
         * <p>Choose one of the four ways to input face photos: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>verify/xxxxx/xxxxxx.jpeg</p>
         */
        public Builder sourceOssObjectName(String sourceOssObjectName) {
            this.putBodyParameter("SourceOssObjectName", sourceOssObjectName);
            this.sourceOssObjectName = sourceOssObjectName;
            return this;
        }

        /**
         * <p>CertifyId from a previously successful real-person authentication, where the photo taken during the authentication is used for face comparison.</p>
         * <blockquote>
         * <p>Choose one of the four methods to provide the reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0bfa7c493f850e5178b9f8613634c9xx</p>
         */
        public Builder targetCertifyId(String targetCertifyId) {
            this.putBodyParameter("TargetCertifyId", targetCertifyId);
            this.targetCertifyId = targetCertifyId;
            return this;
        }

        /**
         * <p>Base64 encoding of the reference photo.</p>
         * <blockquote>
         * <p>Choose one of the four methods to provide the reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
         */
        public Builder targetFaceContrastPicture(String targetFaceContrastPicture) {
            this.putBodyParameter("TargetFaceContrastPicture", targetFaceContrastPicture);
            this.targetFaceContrastPicture = targetFaceContrastPicture;
            return this;
        }

        /**
         * <p>OSS address of the reference photo. Currently, only authorized OSS addresses are supported.</p>
         * <blockquote>
         * <p>Choose one of the four methods to provide the reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
         */
        public Builder targetFaceContrastPictureUrl(String targetFaceContrastPictureUrl) {
            this.putBodyParameter("TargetFaceContrastPictureUrl", targetFaceContrastPictureUrl);
            this.targetFaceContrastPictureUrl = targetFaceContrastPictureUrl;
            return this;
        }

        /**
         * <p>Name of the authorized OSS bucket.</p>
         * <blockquote>
         * <p>Choose one of the four methods to provide the reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
         */
        public Builder targetOssBucketName(String targetOssBucketName) {
            this.putBodyParameter("TargetOssBucketName", targetOssBucketName);
            this.targetOssBucketName = targetOssBucketName;
            return this;
        }

        /**
         * <p>File name in the authorized OSS space.</p>
         * <blockquote>
         * <p>Choose one of the four methods to provide the reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>verify/xxxxx/xxxxxx.jpeg</p>
         */
        public Builder targetOssObjectName(String targetOssObjectName) {
            this.putBodyParameter("TargetOssObjectName", targetOssObjectName);
            this.targetOssObjectName = targetOssObjectName;
            return this;
        }

        @Override
        public CompareFaceVerifyRequest build() {
            return new CompareFaceVerifyRequest(this);
        } 

    } 

}
