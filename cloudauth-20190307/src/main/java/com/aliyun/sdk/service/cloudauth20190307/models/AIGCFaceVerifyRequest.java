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
         * FaceContrastPicture.
         */
        public Builder faceContrastPicture(String faceContrastPicture) {
            this.putBodyParameter("FaceContrastPicture", faceContrastPicture);
            this.faceContrastPicture = faceContrastPicture;
            return this;
        }

        /**
         * FaceContrastPictureUrl.
         */
        public Builder faceContrastPictureUrl(String faceContrastPictureUrl) {
            this.putQueryParameter("FaceContrastPictureUrl", faceContrastPictureUrl);
            this.faceContrastPictureUrl = faceContrastPictureUrl;
            return this;
        }

        /**
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssObjectName.
         */
        public Builder ossObjectName(String ossObjectName) {
            this.putQueryParameter("OssObjectName", ossObjectName);
            this.ossObjectName = ossObjectName;
            return this;
        }

        /**
         * OuterOrderNo.
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putQueryParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * SceneId.
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
