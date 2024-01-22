// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FaceCompareRequest} extends {@link RequestModel}
 *
 * <p>FaceCompareRequest</p>
 */
public class FaceCompareRequest extends Request {
    @Query
    @NameInMap("MerchantBizId")
    private String merchantBizId;

    @Query
    @NameInMap("SourceFacePicture")
    private String sourceFacePicture;

    @Query
    @NameInMap("SourceFacePictureUrl")
    private String sourceFacePictureUrl;

    @Query
    @NameInMap("TargetFacePicture")
    private String targetFacePicture;

    @Query
    @NameInMap("TargetFacePictureUrl")
    private String targetFacePictureUrl;

    private FaceCompareRequest(Builder builder) {
        super(builder);
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
            this.merchantBizId = request.merchantBizId;
            this.sourceFacePicture = request.sourceFacePicture;
            this.sourceFacePictureUrl = request.sourceFacePictureUrl;
            this.targetFacePicture = request.targetFacePicture;
            this.targetFacePictureUrl = request.targetFacePictureUrl;
        } 

        /**
         * MerchantBizId.
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
            this.putQueryParameter("SourceFacePicture", sourceFacePicture);
            this.sourceFacePicture = sourceFacePicture;
            return this;
        }

        /**
         * SourceFacePictureUrl.
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
            this.putQueryParameter("TargetFacePicture", targetFacePicture);
            this.targetFacePicture = targetFacePicture;
            return this;
        }

        /**
         * TargetFacePictureUrl.
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
