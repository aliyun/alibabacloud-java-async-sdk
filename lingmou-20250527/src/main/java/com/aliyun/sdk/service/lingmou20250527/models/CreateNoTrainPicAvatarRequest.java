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
 * {@link CreateNoTrainPicAvatarRequest} extends {@link RequestModel}
 *
 * <p>CreateNoTrainPicAvatarRequest</p>
 */
public class CreateNoTrainPicAvatarRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expressiveness")
    private String expressiveness;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gender")
    private String gender;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("generateAssets")
    private Boolean generateAssets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("imageOssPath")
    private String imageOssPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("transparent")
    private Boolean transparent;

    private CreateNoTrainPicAvatarRequest(Builder builder) {
        super(builder);
        this.expressiveness = builder.expressiveness;
        this.gender = builder.gender;
        this.generateAssets = builder.generateAssets;
        this.imageOssPath = builder.imageOssPath;
        this.jwtToken = builder.jwtToken;
        this.name = builder.name;
        this.transparent = builder.transparent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNoTrainPicAvatarRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expressiveness
     */
    public String getExpressiveness() {
        return this.expressiveness;
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
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return transparent
     */
    public Boolean getTransparent() {
        return this.transparent;
    }

    public static final class Builder extends Request.Builder<CreateNoTrainPicAvatarRequest, Builder> {
        private String expressiveness; 
        private String gender; 
        private Boolean generateAssets; 
        private String imageOssPath; 
        private String jwtToken; 
        private String name; 
        private Boolean transparent; 

        private Builder() {
            super();
        } 

        private Builder(CreateNoTrainPicAvatarRequest request) {
            super(request);
            this.expressiveness = request.expressiveness;
            this.gender = request.gender;
            this.generateAssets = request.generateAssets;
            this.imageOssPath = request.imageOssPath;
            this.jwtToken = request.jwtToken;
            this.name = request.name;
            this.transparent = request.transparent;
        } 

        /**
         * expressiveness.
         */
        public Builder expressiveness(String expressiveness) {
            this.putQueryParameter("expressiveness", expressiveness);
            this.expressiveness = expressiveness;
            return this;
        }

        /**
         * gender.
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
         * imageOssPath.
         */
        public Builder imageOssPath(String imageOssPath) {
            this.putQueryParameter("imageOssPath", imageOssPath);
            this.imageOssPath = imageOssPath;
            return this;
        }

        /**
         * jwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("jwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
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
        public CreateNoTrainPicAvatarRequest build() {
            return new CreateNoTrainPicAvatarRequest(this);
        } 

    } 

}
