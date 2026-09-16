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
         * <p>Specifies whether cropping is allowed. Default value: F.</p>
         * <ul>
         * <li>T: detection is required.</li>
         * <li>F: detection is required. (Default: F).</li>
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
         * <p>The unique identifier of the merchant request.</p>
         * <p>The value is a 32-character alphanumeric string. The first few characters are a custom abbreviation defined by the merchant, the middle part can be a time segment, and the last part can be a random or incremental sequence.</p>
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
         * <p>The verification scenario ID.</p>
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
         * <p>The CertifyId from a previous successful ID Verification. The photo captured during that verification is used as the face comparison photo.</p>
         * <blockquote>
         * <p>You can use one of the following four methods to submit a face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
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
         * <p>The Base64-encoded photo.</p>
         * <blockquote>
         * <p>You can use one of the following four methods to submit a face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
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
         * <p>The OSS photo URL. Only authorized OSS photo URLs are supported.</p>
         * <blockquote>
         * <p>You can use one of the following four methods to submit a face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
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
         * <p>The bucket name of the authorized OSS space.</p>
         * <blockquote>
         * <p>You can use one of the following four methods to submit a face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
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
         * <p>The file name in the authorized OSS space.</p>
         * <blockquote>
         * <p>You can use one of the following four methods to submit a face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
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
         * <p>The CertifyId from a previous successful ID Verification. The photo captured during that verification is used as the face comparison photo.</p>
         * <blockquote>
         * <p>You can use one of the following four methods to submit a reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
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
         * <p>The Base64-encoded reference photo.</p>
         * <blockquote>
         * <p>You can use one of the following four methods to submit a reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
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
         * <p>The OSS URL of the reference photo. Only authorized OSS photo URLs are supported.</p>
         * <blockquote>
         * <p>You can use one of the following four methods to submit a reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
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
         * <p>The bucket name of the authorized OSS space.</p>
         * <blockquote>
         * <p>You can use one of the following four methods to submit a reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
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
         * <p>The file name in the authorized OSS space.</p>
         * <blockquote>
         * <p>You can use one of the following four methods to submit a reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
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
