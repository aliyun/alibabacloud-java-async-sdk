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
 * {@link AnchorResponse} extends {@link TeaModel}
 *
 * <p>AnchorResponse</p>
 */
public class AnchorResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("anchorCategory")
    private String anchorCategory;

    @com.aliyun.core.annotation.NameInMap("anchorId")
    private String anchorId;

    @com.aliyun.core.annotation.NameInMap("anchorMaterialName")
    private String anchorMaterialName;

    @com.aliyun.core.annotation.NameInMap("anchorType")
    private String anchorType;

    @com.aliyun.core.annotation.NameInMap("coverHeight")
    private Integer coverHeight;

    @com.aliyun.core.annotation.NameInMap("coverRate")
    private String coverRate;

    @com.aliyun.core.annotation.NameInMap("coverThumbnailUrl")
    private String coverThumbnailUrl;

    @com.aliyun.core.annotation.NameInMap("coverUrl")
    private String coverUrl;

    @com.aliyun.core.annotation.NameInMap("coverWeight")
    private Integer coverWeight;

    @com.aliyun.core.annotation.NameInMap("digitalHumanType")
    private String digitalHumanType;

    @com.aliyun.core.annotation.NameInMap("gender")
    private String gender;

    @com.aliyun.core.annotation.NameInMap("resourceTypeDesc")
    private String resourceTypeDesc;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("supportBgChange")
    private Integer supportBgChange;

    @com.aliyun.core.annotation.NameInMap("useScene")
    private String useScene;

    private AnchorResponse(BuilderImpl builder) {
        super(builder);
        this.anchorCategory = builder.anchorCategory;
        this.anchorId = builder.anchorId;
        this.anchorMaterialName = builder.anchorMaterialName;
        this.anchorType = builder.anchorType;
        this.coverHeight = builder.coverHeight;
        this.coverRate = builder.coverRate;
        this.coverThumbnailUrl = builder.coverThumbnailUrl;
        this.coverUrl = builder.coverUrl;
        this.coverWeight = builder.coverWeight;
        this.digitalHumanType = builder.digitalHumanType;
        this.gender = builder.gender;
        this.resourceTypeDesc = builder.resourceTypeDesc;
        this.status = builder.status;
        this.supportBgChange = builder.supportBgChange;
        this.useScene = builder.useScene;
    }

    public static AnchorResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return anchorCategory
     */
    public String getAnchorCategory() {
        return this.anchorCategory;
    }

    /**
     * @return anchorId
     */
    public String getAnchorId() {
        return this.anchorId;
    }

    /**
     * @return anchorMaterialName
     */
    public String getAnchorMaterialName() {
        return this.anchorMaterialName;
    }

    /**
     * @return anchorType
     */
    public String getAnchorType() {
        return this.anchorType;
    }

    /**
     * @return coverHeight
     */
    public Integer getCoverHeight() {
        return this.coverHeight;
    }

    /**
     * @return coverRate
     */
    public String getCoverRate() {
        return this.coverRate;
    }

    /**
     * @return coverThumbnailUrl
     */
    public String getCoverThumbnailUrl() {
        return this.coverThumbnailUrl;
    }

    /**
     * @return coverUrl
     */
    public String getCoverUrl() {
        return this.coverUrl;
    }

    /**
     * @return coverWeight
     */
    public Integer getCoverWeight() {
        return this.coverWeight;
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
     * @return resourceTypeDesc
     */
    public String getResourceTypeDesc() {
        return this.resourceTypeDesc;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supportBgChange
     */
    public Integer getSupportBgChange() {
        return this.supportBgChange;
    }

    /**
     * @return useScene
     */
    public String getUseScene() {
        return this.useScene;
    }

    public interface Builder extends Response.Builder<AnchorResponse, Builder> {

        Builder anchorCategory(String anchorCategory);

        Builder anchorId(String anchorId);

        Builder anchorMaterialName(String anchorMaterialName);

        Builder anchorType(String anchorType);

        Builder coverHeight(Integer coverHeight);

        Builder coverRate(String coverRate);

        Builder coverThumbnailUrl(String coverThumbnailUrl);

        Builder coverUrl(String coverUrl);

        Builder coverWeight(Integer coverWeight);

        Builder digitalHumanType(String digitalHumanType);

        Builder gender(String gender);

        Builder resourceTypeDesc(String resourceTypeDesc);

        Builder status(String status);

        Builder supportBgChange(Integer supportBgChange);

        Builder useScene(String useScene);

        @Override
        AnchorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AnchorResponse, Builder>
            implements Builder {
        private String anchorCategory; 
        private String anchorId; 
        private String anchorMaterialName; 
        private String anchorType; 
        private Integer coverHeight; 
        private String coverRate; 
        private String coverThumbnailUrl; 
        private String coverUrl; 
        private Integer coverWeight; 
        private String digitalHumanType; 
        private String gender; 
        private String resourceTypeDesc; 
        private String status; 
        private Integer supportBgChange; 
        private String useScene; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AnchorResponse response) {
            super(response);
            this.anchorCategory = response.anchorCategory;
            this.anchorId = response.anchorId;
            this.anchorMaterialName = response.anchorMaterialName;
            this.anchorType = response.anchorType;
            this.coverHeight = response.coverHeight;
            this.coverRate = response.coverRate;
            this.coverThumbnailUrl = response.coverThumbnailUrl;
            this.coverUrl = response.coverUrl;
            this.coverWeight = response.coverWeight;
            this.digitalHumanType = response.digitalHumanType;
            this.gender = response.gender;
            this.resourceTypeDesc = response.resourceTypeDesc;
            this.status = response.status;
            this.supportBgChange = response.supportBgChange;
            this.useScene = response.useScene;
        } 

        /**
         * anchorCategory.
         */
        @Override
        public Builder anchorCategory(String anchorCategory) {
            this.anchorCategory = anchorCategory;
            return this;
        }

        /**
         * anchorId.
         */
        @Override
        public Builder anchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }

        /**
         * anchorMaterialName.
         */
        @Override
        public Builder anchorMaterialName(String anchorMaterialName) {
            this.anchorMaterialName = anchorMaterialName;
            return this;
        }

        /**
         * anchorType.
         */
        @Override
        public Builder anchorType(String anchorType) {
            this.anchorType = anchorType;
            return this;
        }

        /**
         * coverHeight.
         */
        @Override
        public Builder coverHeight(Integer coverHeight) {
            this.coverHeight = coverHeight;
            return this;
        }

        /**
         * coverRate.
         */
        @Override
        public Builder coverRate(String coverRate) {
            this.coverRate = coverRate;
            return this;
        }

        /**
         * coverThumbnailUrl.
         */
        @Override
        public Builder coverThumbnailUrl(String coverThumbnailUrl) {
            this.coverThumbnailUrl = coverThumbnailUrl;
            return this;
        }

        /**
         * coverUrl.
         */
        @Override
        public Builder coverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * coverWeight.
         */
        @Override
        public Builder coverWeight(Integer coverWeight) {
            this.coverWeight = coverWeight;
            return this;
        }

        /**
         * digitalHumanType.
         */
        @Override
        public Builder digitalHumanType(String digitalHumanType) {
            this.digitalHumanType = digitalHumanType;
            return this;
        }

        /**
         * gender.
         */
        @Override
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * resourceTypeDesc.
         */
        @Override
        public Builder resourceTypeDesc(String resourceTypeDesc) {
            this.resourceTypeDesc = resourceTypeDesc;
            return this;
        }

        /**
         * status.
         */
        @Override
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * supportBgChange.
         */
        @Override
        public Builder supportBgChange(Integer supportBgChange) {
            this.supportBgChange = supportBgChange;
            return this;
        }

        /**
         * useScene.
         */
        @Override
        public Builder useScene(String useScene) {
            this.useScene = useScene;
            return this;
        }

        @Override
        public AnchorResponse build() {
            return new AnchorResponse(this);
        } 

    } 

}
