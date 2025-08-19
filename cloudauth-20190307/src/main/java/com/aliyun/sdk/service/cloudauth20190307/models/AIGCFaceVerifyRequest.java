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
 * {@link AIGCFaceVerifyRequest} extends {@link RequestModel}
 *
 * <p>AIGCFaceVerifyRequest</p>
 */
public class AIGCFaceVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceContrastPicture")
    private String faceContrastPicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceContrastPictureUrl")
    private String faceContrastPictureUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    private String ossBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssObjectName")
    private String ossObjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterOrderNo")
    private String outerOrderNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    private AIGCFaceVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.faceContrastPicture = builder.faceContrastPicture;
        this.faceContrastPictureUrl = builder.faceContrastPictureUrl;
        this.ossBucketName = builder.ossBucketName;
        this.ossObjectName = builder.ossObjectName;
        this.outerOrderNo = builder.outerOrderNo;
        this.productCode = builder.productCode;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIGCFaceVerifyRequest create() {
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
     * @return faceContrastPicture
     */
    public String getFaceContrastPicture() {
        return this.faceContrastPicture;
    }

    /**
     * @return faceContrastPictureUrl
     */
    public String getFaceContrastPictureUrl() {
        return this.faceContrastPictureUrl;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossObjectName
     */
    public String getOssObjectName() {
        return this.ossObjectName;
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

    public static final class Builder extends Request.Builder<AIGCFaceVerifyRequest, Builder> {
        private String regionId; 
        private String faceContrastPicture; 
        private String faceContrastPictureUrl; 
        private String ossBucketName; 
        private String ossObjectName; 
        private String outerOrderNo; 
        private String productCode; 
        private Long sceneId; 

        private Builder() {
            super();
        } 

        private Builder(AIGCFaceVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.faceContrastPicture = request.faceContrastPicture;
            this.faceContrastPictureUrl = request.faceContrastPictureUrl;
            this.ossBucketName = request.ossBucketName;
            this.ossObjectName = request.ossObjectName;
            this.outerOrderNo = request.outerOrderNo;
            this.productCode = request.productCode;
            this.sceneId = request.sceneId;
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
         * <p>Base64 encoded photo.</p>
         * <blockquote>
         * <p>Choose one of the three ways to input images: FaceContrastPicture, FaceContrastPictureUrl, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
         */
        public Builder faceContrastPicture(String faceContrastPicture) {
            this.putBodyParameter("FaceContrastPicture", faceContrastPicture);
            this.faceContrastPicture = faceContrastPicture;
            return this;
        }

        /**
         * <p>Portrait address, accessible via public HTTP or HTTPS link.</p>
         * <blockquote>
         * <p>Choose one of the three ways to input images: FaceContrastPicture, FaceContrastPictureUrl, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
         */
        public Builder faceContrastPictureUrl(String faceContrastPictureUrl) {
            this.putQueryParameter("FaceContrastPictureUrl", faceContrastPictureUrl);
            this.faceContrastPictureUrl = faceContrastPictureUrl;
            return this;
        }

        /**
         * <p>Authorized OSS bucket name.</p>
         * <blockquote>
         * <p>Choose one of the three ways to input images: FaceContrastPicture, FaceContrastPictureUrl, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>Authorized OSS file name.</p>
         * <blockquote>
         * <p>Choose one of the three ways to input images: FaceContrastPicture, FaceContrastPictureUrl, or OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>verify/xxxxx/xxxxxx.jpeg</p>
         */
        public Builder ossObjectName(String ossObjectName) {
            this.putQueryParameter("OssObjectName", ossObjectName);
            this.ossObjectName = ossObjectName;
            return this;
        }

        /**
         * <p>A unique business identifier defined by the client side, used for subsequent troubleshooting. The value should be a combination of letters and numbers with a maximum length of 32 characters, please ensure its uniqueness.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putQueryParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
            return this;
        }

        /**
         * <p>Product solution</p>
         * 
         * <strong>example:</strong>
         * <p>LR_FR_AIGC</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Authentication scene ID. This ID is automatically generated after creating an authentication scene in the console. For how to create an authentication scene, see Adding an Authentication Scene.</p>
         * 
         * <strong>example:</strong>
         * <p>100000xxxx</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public AIGCFaceVerifyRequest build() {
            return new AIGCFaceVerifyRequest(this);
        } 

    } 

}
