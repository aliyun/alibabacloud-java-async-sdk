// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatCustomOcrTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreatCustomOcrTemplateRequest</p>
 */
public class CreatCustomOcrTemplateRequest extends Request {
    @Query
    @NameInMap("ImgUrl")
    @Validation(required = true)
    private String imgUrl;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RecognizeArea")
    private String recognizeArea;

    @Query
    @NameInMap("ReferArea")
    private String referArea;

    private CreatCustomOcrTemplateRequest(Builder builder) {
        super(builder);
        this.imgUrl = builder.imgUrl;
        this.name = builder.name;
        this.recognizeArea = builder.recognizeArea;
        this.referArea = builder.referArea;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatCustomOcrTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imgUrl
     */
    public String getImgUrl() {
        return this.imgUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recognizeArea
     */
    public String getRecognizeArea() {
        return this.recognizeArea;
    }

    /**
     * @return referArea
     */
    public String getReferArea() {
        return this.referArea;
    }

    public static final class Builder extends Request.Builder<CreatCustomOcrTemplateRequest, Builder> {
        private String imgUrl; 
        private String name; 
        private String recognizeArea; 
        private String referArea; 

        private Builder() {
            super();
        } 

        private Builder(CreatCustomOcrTemplateRequest request) {
            super(request);
            this.imgUrl = request.imgUrl;
            this.name = request.name;
            this.recognizeArea = request.recognizeArea;
            this.referArea = request.referArea;
        } 

        /**
         * ImgUrl.
         */
        public Builder imgUrl(String imgUrl) {
            this.putQueryParameter("ImgUrl", imgUrl);
            this.imgUrl = imgUrl;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RecognizeArea.
         */
        public Builder recognizeArea(String recognizeArea) {
            this.putQueryParameter("RecognizeArea", recognizeArea);
            this.recognizeArea = recognizeArea;
            return this;
        }

        /**
         * ReferArea.
         */
        public Builder referArea(String referArea) {
            this.putQueryParameter("ReferArea", referArea);
            this.referArea = referArea;
            return this;
        }

        @Override
        public CreatCustomOcrTemplateRequest build() {
            return new CreatCustomOcrTemplateRequest(this);
        } 

    } 

}
