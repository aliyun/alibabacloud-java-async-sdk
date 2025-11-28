// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link CreateTrainPicAvatarRequest} extends {@link RequestModel}
 *
 * <p>CreateTrainPicAvatarRequest</p>
 */
public class CreateTrainPicAvatarRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gender")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gender;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("generateAssets")
    private Boolean generateAssets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("imageOssPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageOssPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("transparent")
    private Boolean transparent;

    private CreateTrainPicAvatarRequest(Builder builder) {
        super(builder);
        this.gender = builder.gender;
        this.generateAssets = builder.generateAssets;
        this.imageOssPath = builder.imageOssPath;
        this.name = builder.name;
        this.templateId = builder.templateId;
        this.transparent = builder.transparent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrainPicAvatarRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return generateAssets
     */
    public Boolean getGenerateAssets() {
        return this.generateAssets;
    }

    /**
     * @return imageOssPath
     */
    public String getImageOssPath() {
        return this.imageOssPath;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return transparent
     */
    public Boolean getTransparent() {
        return this.transparent;
    }

    public static final class Builder extends Request.Builder<CreateTrainPicAvatarRequest, Builder> {
        private String gender; 
        private Boolean generateAssets; 
        private String imageOssPath; 
        private String name; 
        private String templateId; 
        private Boolean transparent; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrainPicAvatarRequest request) {
            super(request);
            this.gender = request.gender;
            this.generateAssets = request.generateAssets;
            this.imageOssPath = request.imageOssPath;
            this.name = request.name;
            this.templateId = request.templateId;
            this.transparent = request.transparent;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FEMALE</p>
         */
        public Builder gender(String gender) {
            this.putQueryParameter("gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * generateAssets.
         */
        public Builder generateAssets(Boolean generateAssets) {
            this.putQueryParameter("generateAssets", generateAssets);
            this.generateAssets = generateAssets;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>material/INPUT_TRAIN_PIC/Mt.CQEJ2DQ6BBYU2/2.jpg</p>
         */
        public Builder imageOssPath(String imageOssPath) {
            this.putQueryParameter("imageOssPath", imageOssPath);
            this.imageOssPath = imageOssPath;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>M16vSG46Pby9HWOrFSZ7QaQA</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * transparent.
         */
        public Builder transparent(Boolean transparent) {
            this.putQueryParameter("transparent", transparent);
            this.transparent = transparent;
            return this;
        }

        @Override
        public CreateTrainPicAvatarRequest build() {
            return new CreateTrainPicAvatarRequest(this);
        } 

    } 

}
