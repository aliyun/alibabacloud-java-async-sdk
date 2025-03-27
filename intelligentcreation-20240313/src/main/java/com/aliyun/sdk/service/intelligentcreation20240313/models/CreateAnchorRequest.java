// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateAnchorRequest} extends {@link RequestModel}
 *
 * <p>CreateAnchorRequest</p>
 */
public class CreateAnchorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("anchorMaterialName")
    private String anchorMaterialName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("coverUrl")
    private String coverUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("digitalHumanType")
    private String digitalHumanType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gender")
    private String gender;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("useScene")
    private String useScene;

    private CreateAnchorRequest(Builder builder) {
        super(builder);
        this.anchorMaterialName = builder.anchorMaterialName;
        this.coverUrl = builder.coverUrl;
        this.digitalHumanType = builder.digitalHumanType;
        this.gender = builder.gender;
        this.useScene = builder.useScene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAnchorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anchorMaterialName
     */
    public String getAnchorMaterialName() {
        return this.anchorMaterialName;
    }

    /**
     * @return coverUrl
     */
    public String getCoverUrl() {
        return this.coverUrl;
    }

    /**
     * @return digitalHumanType
     */
    public String getDigitalHumanType() {
        return this.digitalHumanType;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return useScene
     */
    public String getUseScene() {
        return this.useScene;
    }

    public static final class Builder extends Request.Builder<CreateAnchorRequest, Builder> {
        private String anchorMaterialName; 
        private String coverUrl; 
        private String digitalHumanType; 
        private String gender; 
        private String useScene; 

        private Builder() {
            super();
        } 

        private Builder(CreateAnchorRequest request) {
            super(request);
            this.anchorMaterialName = request.anchorMaterialName;
            this.coverUrl = request.coverUrl;
            this.digitalHumanType = request.digitalHumanType;
            this.gender = request.gender;
            this.useScene = request.useScene;
        } 

        /**
         * anchorMaterialName.
         */
        public Builder anchorMaterialName(String anchorMaterialName) {
            this.putBodyParameter("anchorMaterialName", anchorMaterialName);
            this.anchorMaterialName = anchorMaterialName;
            return this;
        }

        /**
         * coverUrl.
         */
        public Builder coverUrl(String coverUrl) {
            this.putBodyParameter("coverUrl", coverUrl);
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * digitalHumanType.
         */
        public Builder digitalHumanType(String digitalHumanType) {
            this.putBodyParameter("digitalHumanType", digitalHumanType);
            this.digitalHumanType = digitalHumanType;
            return this;
        }

        /**
         * gender.
         */
        public Builder gender(String gender) {
            this.putBodyParameter("gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * useScene.
         */
        public Builder useScene(String useScene) {
            this.putBodyParameter("useScene", useScene);
            this.useScene = useScene;
            return this;
        }

        @Override
        public CreateAnchorRequest build() {
            return new CreateAnchorRequest(this);
        } 

    } 

}
