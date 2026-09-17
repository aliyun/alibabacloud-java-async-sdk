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
    @com.aliyun.core.annotation.NameInMap("FaceQualityCheck")
    private String faceQualityCheck;

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
        this.faceQualityCheck = builder.faceQualityCheck;
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
     * @return faceQualityCheck
     */
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
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
        private String faceQualityCheck; 
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
            this.faceQualityCheck = request.faceQualityCheck;
            this.merchantBizId = request.merchantBizId;
            this.sourceFacePicture = request.sourceFacePicture;
            this.sourceFacePictureUrl = request.sourceFacePictureUrl;
            this.targetFacePicture = request.targetFacePicture;
            this.targetFacePictureUrl = request.targetFacePictureUrl;
        } 

        /**
         * <p>Whether to enable quality detection for the input face image&gt;Danger: Deprecated</p>
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
         * <p>Face quality check</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder faceQualityCheck(String faceQualityCheck) {
            this.putQueryParameter("FaceQualityCheck", faceQualityCheck);
            this.faceQualityCheck = faceQualityCheck;
            return this;
        }

        /**
         * <p>A unique business identifier customized by the merchant, used for subsequent troubleshooting. Supports a combination of letters and numbers with a maximum length of 32 characters. Ensure it is unique.</p>
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
         * <p>Base64-encoded face photo.</p>
         * <p>Note</p>
         * <ul>
         * <li>If you choose this method to pass in the photo, check the photo size and do not pass in an oversized photo.</li>
         * <li>Either SourceFacePicture or SourceFacePictureUrl must be specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>base64</p>
         */
        public Builder sourceFacePicture(String sourceFacePicture) {
            this.putBodyParameter("SourceFacePicture", sourceFacePicture);
            this.sourceFacePicture = sourceFacePicture;
            return this;
        }

        /**
         * <p>The HTTPS or HTTP URL of the face image.</p>
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
         * <p>Base64-encoded reference photo.</p>
         * <p>Note</p>
         * <ul>
         * <li>If you choose this method to pass in the photo, check the photo size and do not pass in an oversized photo.</li>
         * <li>Either TargetFacePicture or TargetFacePictureUrl must be specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>base64</p>
         */
        public Builder targetFacePicture(String targetFacePicture) {
            this.putBodyParameter("TargetFacePicture", targetFacePicture);
            this.targetFacePicture = targetFacePicture;
            return this;
        }

        /**
         * <p>The HTTPS or HTTP URL of the reference face image.</p>
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
