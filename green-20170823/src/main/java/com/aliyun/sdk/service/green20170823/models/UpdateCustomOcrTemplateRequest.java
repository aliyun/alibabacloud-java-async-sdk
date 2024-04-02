// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomOcrTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomOcrTemplateRequest</p>
 */
public class UpdateCustomOcrTemplateRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RecognizeArea")
    private String recognizeArea;

    @Query
    @NameInMap("ReferArea")
    private String referArea;

    private UpdateCustomOcrTemplateRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
        this.recognizeArea = builder.recognizeArea;
        this.referArea = builder.referArea;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomOcrTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateCustomOcrTemplateRequest, Builder> {
        private Long id; 
        private String name; 
        private String recognizeArea; 
        private String referArea; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomOcrTemplateRequest request) {
            super(request);
            this.id = request.id;
            this.name = request.name;
            this.recognizeArea = request.recognizeArea;
            this.referArea = request.referArea;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public UpdateCustomOcrTemplateRequest build() {
            return new UpdateCustomOcrTemplateRequest(this);
        } 

    } 

}
