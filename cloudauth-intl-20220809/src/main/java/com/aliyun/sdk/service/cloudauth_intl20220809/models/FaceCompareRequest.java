// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link FaceCompareRequest} extends {@link RequestModel}
 *
 * <p>FaceCompareRequest</p>
 */
public class FaceCompareRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FacePictureQualityCheck")
    private String facePictureQualityCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceFacePicture")
    private String sourceFacePicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceFacePictureUrl")
    private String sourceFacePictureUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetFacePicture")
    private String targetFacePicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetFacePictureUrl")
    private String targetFacePictureUrl;

    private FaceCompareRequest(Builder builder) {
        super(builder);
        this.facePictureQualityCheck = builder.facePictureQualityCheck;
        this.merchantBizId = builder.merchantBizId;
        this.sourceFacePicture = builder.sourceFacePicture;
        this.sourceFacePictureUrl = builder.sourceFacePictureUrl;
        this.targetFacePicture = builder.targetFacePicture;
        this.targetFacePictureUrl = builder.targetFacePictureUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceCompareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return facePictureQualityCheck
     */
    public String getFacePictureQualityCheck() {
        return this.facePictureQualityCheck;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    /**
     * @return sourceFacePicture
     */
    public String getSourceFacePicture() {
        return this.sourceFacePicture;
    }

    /**
     * @return sourceFacePictureUrl
     */
    public String getSourceFacePictureUrl() {
        return this.sourceFacePictureUrl;
    }

    /**
     * @return targetFacePicture
     */
    public String getTargetFacePicture() {
        return this.targetFacePicture;
    }

    /**
     * @return targetFacePictureUrl
     */
    public String getTargetFacePictureUrl() {
        return this.targetFacePictureUrl;
    }

    public static final class Builder extends Request.Builder<FaceCompareRequest, Builder> {
        private String facePictureQualityCheck; 
        private String merchantBizId; 
        private String sourceFacePicture; 
        private String sourceFacePictureUrl; 
        private String targetFacePicture; 
        private String targetFacePictureUrl; 

        private Builder() {
            super();
        } 

        private Builder(FaceCompareRequest request) {
            super(request);
            this.facePictureQualityCheck = request.facePictureQualityCheck;
            this.merchantBizId = request.merchantBizId;
            this.sourceFacePicture = request.sourceFacePicture;
            this.sourceFacePictureUrl = request.sourceFacePictureUrl;
            this.targetFacePicture = request.targetFacePicture;
            this.targetFacePictureUrl = request.targetFacePictureUrl;
        } 

        /**
         * <p>是否开启传入人脸图片质量检测</p>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder facePictureQualityCheck(String facePictureQualityCheck) {
            this.putQueryParameter("FacePictureQualityCheck", facePictureQualityCheck);
            this.facePictureQualityCheck = facePictureQualityCheck;
            return this;
        }

        /**
         * <p>A custom unique business ID used for troubleshooting. It can be a combination of up to 32 letters and digits. Make sure that the ID is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * SourceFacePicture.
         */
        public Builder sourceFacePicture(String sourceFacePicture) {
            this.putBodyParameter("SourceFacePicture", sourceFacePicture);
            this.sourceFacePicture = sourceFacePicture;
            return this;
        }

        /**
         * <p>The URL of the portrait photo. The URL must be an HTTP or HTTPS link accessible over the Internet.</p>
         * <blockquote>
         * <p>You must specify either SourceFacePicture or SourceFacePictureUrl.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>https://***face1.jpeg</p>
         */
        public Builder sourceFacePictureUrl(String sourceFacePictureUrl) {
            this.putQueryParameter("SourceFacePictureUrl", sourceFacePictureUrl);
            this.sourceFacePictureUrl = sourceFacePictureUrl;
            return this;
        }

        /**
         * TargetFacePicture.
         */
        public Builder targetFacePicture(String targetFacePicture) {
            this.putBodyParameter("TargetFacePicture", targetFacePicture);
            this.targetFacePicture = targetFacePicture;
            return this;
        }

        /**
         * <p>The URL of the base portrait photo. The URL must be an HTTP or HTTPS link accessible over the Internet.</p>
         * <blockquote>
         * <p>You must specify either TargetFacePicture or TargetFacePictureUrl.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>https://***face2.jpeg</p>
         */
        public Builder targetFacePictureUrl(String targetFacePictureUrl) {
            this.putQueryParameter("TargetFacePictureUrl", targetFacePictureUrl);
            this.targetFacePictureUrl = targetFacePictureUrl;
            return this;
        }

        @Override
        public FaceCompareRequest build() {
            return new FaceCompareRequest(this);
        } 

    } 

}
