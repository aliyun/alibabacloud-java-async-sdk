// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopSubmitAITryOnJobRequest} extends {@link RequestModel}
 *
 * <p>PopSubmitAITryOnJobRequest</p>
 */
public class PopSubmitAITryOnJobRequest extends Request {
    @Query
    @NameInMap("BottomsId")
    private String bottomsId;

    @Query
    @NameInMap("ClothingType")
    @Validation(required = true)
    private String clothingType;

    @Query
    @NameInMap("GeneratePictureNum")
    private Integer generatePictureNum;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Query
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    @Query
    @NameInMap("ShoeType")
    private String shoeType;

    @Query
    @NameInMap("SuitId")
    private String suitId;

    @Query
    @NameInMap("TopsId")
    private String topsId;

    private PopSubmitAITryOnJobRequest(Builder builder) {
        super(builder);
        this.bottomsId = builder.bottomsId;
        this.clothingType = builder.clothingType;
        this.generatePictureNum = builder.generatePictureNum;
        this.jwtToken = builder.jwtToken;
        this.modelId = builder.modelId;
        this.shoeType = builder.shoeType;
        this.suitId = builder.suitId;
        this.topsId = builder.topsId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopSubmitAITryOnJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bottomsId
     */
    public String getBottomsId() {
        return this.bottomsId;
    }

    /**
     * @return clothingType
     */
    public String getClothingType() {
        return this.clothingType;
    }

    /**
     * @return generatePictureNum
     */
    public Integer getGeneratePictureNum() {
        return this.generatePictureNum;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return shoeType
     */
    public String getShoeType() {
        return this.shoeType;
    }

    /**
     * @return suitId
     */
    public String getSuitId() {
        return this.suitId;
    }

    /**
     * @return topsId
     */
    public String getTopsId() {
        return this.topsId;
    }

    public static final class Builder extends Request.Builder<PopSubmitAITryOnJobRequest, Builder> {
        private String bottomsId; 
        private String clothingType; 
        private Integer generatePictureNum; 
        private String jwtToken; 
        private String modelId; 
        private String shoeType; 
        private String suitId; 
        private String topsId; 

        private Builder() {
            super();
        } 

        private Builder(PopSubmitAITryOnJobRequest request) {
            super(request);
            this.bottomsId = request.bottomsId;
            this.clothingType = request.clothingType;
            this.generatePictureNum = request.generatePictureNum;
            this.jwtToken = request.jwtToken;
            this.modelId = request.modelId;
            this.shoeType = request.shoeType;
            this.suitId = request.suitId;
            this.topsId = request.topsId;
        } 

        /**
         * BottomsId.
         */
        public Builder bottomsId(String bottomsId) {
            this.putQueryParameter("BottomsId", bottomsId);
            this.bottomsId = bottomsId;
            return this;
        }

        /**
         * ClothingType.
         */
        public Builder clothingType(String clothingType) {
            this.putQueryParameter("ClothingType", clothingType);
            this.clothingType = clothingType;
            return this;
        }

        /**
         * GeneratePictureNum.
         */
        public Builder generatePictureNum(Integer generatePictureNum) {
            this.putQueryParameter("GeneratePictureNum", generatePictureNum);
            this.generatePictureNum = generatePictureNum;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * ShoeType.
         */
        public Builder shoeType(String shoeType) {
            this.putQueryParameter("ShoeType", shoeType);
            this.shoeType = shoeType;
            return this;
        }

        /**
         * SuitId.
         */
        public Builder suitId(String suitId) {
            this.putQueryParameter("SuitId", suitId);
            this.suitId = suitId;
            return this;
        }

        /**
         * TopsId.
         */
        public Builder topsId(String topsId) {
            this.putQueryParameter("TopsId", topsId);
            this.topsId = topsId;
            return this;
        }

        @Override
        public PopSubmitAITryOnJobRequest build() {
            return new PopSubmitAITryOnJobRequest(this);
        } 

    } 

}
