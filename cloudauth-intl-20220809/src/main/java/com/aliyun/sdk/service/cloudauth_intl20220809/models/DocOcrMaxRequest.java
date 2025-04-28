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
 * {@link DocOcrMaxRequest} extends {@link RequestModel}
 *
 * <p>DocOcrMaxRequest</p>
 */
public class DocOcrMaxRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocType")
    private String docType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdOcrPictureBase64")
    private String idOcrPictureBase64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdOcrPictureUrl")
    private String idOcrPictureUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdThreshold")
    private String idThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    private String merchantUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OcrModel")
    private String ocrModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spoof")
    private String spoof;

    private DocOcrMaxRequest(Builder builder) {
        super(builder);
        this.docType = builder.docType;
        this.idOcrPictureBase64 = builder.idOcrPictureBase64;
        this.idOcrPictureUrl = builder.idOcrPictureUrl;
        this.idThreshold = builder.idThreshold;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.ocrModel = builder.ocrModel;
        this.productCode = builder.productCode;
        this.prompt = builder.prompt;
        this.sceneCode = builder.sceneCode;
        this.spoof = builder.spoof;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocOcrMaxRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * @return idOcrPictureBase64
     */
    public String getIdOcrPictureBase64() {
        return this.idOcrPictureBase64;
    }

    /**
     * @return idOcrPictureUrl
     */
    public String getIdOcrPictureUrl() {
        return this.idOcrPictureUrl;
    }

    /**
     * @return idThreshold
     */
    public String getIdThreshold() {
        return this.idThreshold;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    /**
     * @return merchantUserId
     */
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    /**
     * @return ocrModel
     */
    public String getOcrModel() {
        return this.ocrModel;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return spoof
     */
    public String getSpoof() {
        return this.spoof;
    }

    public static final class Builder extends Request.Builder<DocOcrMaxRequest, Builder> {
        private String docType; 
        private String idOcrPictureBase64; 
        private String idOcrPictureUrl; 
        private String idThreshold; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String ocrModel; 
        private String productCode; 
        private String prompt; 
        private String sceneCode; 
        private String spoof; 

        private Builder() {
            super();
        } 

        private Builder(DocOcrMaxRequest request) {
            super(request);
            this.docType = request.docType;
            this.idOcrPictureBase64 = request.idOcrPictureBase64;
            this.idOcrPictureUrl = request.idOcrPictureUrl;
            this.idThreshold = request.idThreshold;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.ocrModel = request.ocrModel;
            this.productCode = request.productCode;
            this.prompt = request.prompt;
            this.sceneCode = request.sceneCode;
            this.spoof = request.spoof;
        } 

        /**
         * DocType.
         */
        public Builder docType(String docType) {
            this.putBodyParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * IdOcrPictureBase64.
         */
        public Builder idOcrPictureBase64(String idOcrPictureBase64) {
            this.putBodyParameter("IdOcrPictureBase64", idOcrPictureBase64);
            this.idOcrPictureBase64 = idOcrPictureBase64;
            return this;
        }

        /**
         * IdOcrPictureUrl.
         */
        public Builder idOcrPictureUrl(String idOcrPictureUrl) {
            this.putBodyParameter("IdOcrPictureUrl", idOcrPictureUrl);
            this.idOcrPictureUrl = idOcrPictureUrl;
            return this;
        }

        /**
         * IdThreshold.
         */
        public Builder idThreshold(String idThreshold) {
            this.putBodyParameter("IdThreshold", idThreshold);
            this.idThreshold = idThreshold;
            return this;
        }

        /**
         * MerchantBizId.
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putBodyParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * MerchantUserId.
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putBodyParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * OcrModel.
         */
        public Builder ocrModel(String ocrModel) {
            this.putBodyParameter("OcrModel", ocrModel);
            this.ocrModel = ocrModel;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putBodyParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * Spoof.
         */
        public Builder spoof(String spoof) {
            this.putBodyParameter("Spoof", spoof);
            this.spoof = spoof;
            return this;
        }

        @Override
        public DocOcrMaxRequest build() {
            return new DocOcrMaxRequest(this);
        } 

    } 

}
