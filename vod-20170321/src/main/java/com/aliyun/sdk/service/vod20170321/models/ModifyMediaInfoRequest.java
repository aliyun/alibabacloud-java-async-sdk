// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyMediaInfoRequest</p>
 */
public class ModifyMediaInfoRequest extends Request {
    @Query
    @NameInMap("AiLabelUrl")
    private String aiLabelUrl;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("BusinessType")
    private Long businessType;

    @Query
    @NameInMap("CateId")
    private Long cateId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DynamicData")
    private String dynamicData;

    @Query
    @NameInMap("EntityId")
    private String entityId;

    @Query
    @NameInMap("Label")
    private String label;

    @Query
    @NameInMap("MediaId")
    @Validation(required = true)
    private String mediaId;

    @Query
    @NameInMap("MediaType")
    private Long mediaType;

    @Query
    @NameInMap("Source")
    private Long source;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("Title")
    private String title;

    private ModifyMediaInfoRequest(Builder builder) {
        super(builder);
        this.aiLabelUrl = builder.aiLabelUrl;
        this.appId = builder.appId;
        this.businessType = builder.businessType;
        this.cateId = builder.cateId;
        this.description = builder.description;
        this.dynamicData = builder.dynamicData;
        this.entityId = builder.entityId;
        this.label = builder.label;
        this.mediaId = builder.mediaId;
        this.mediaType = builder.mediaType;
        this.source = builder.source;
        this.tags = builder.tags;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMediaInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiLabelUrl
     */
    public String getAiLabelUrl() {
        return this.aiLabelUrl;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return businessType
     */
    public Long getBusinessType() {
        return this.businessType;
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dynamicData
     */
    public String getDynamicData() {
        return this.dynamicData;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaType
     */
    public Long getMediaType() {
        return this.mediaType;
    }

    /**
     * @return source
     */
    public Long getSource() {
        return this.source;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<ModifyMediaInfoRequest, Builder> {
        private String aiLabelUrl; 
        private String appId; 
        private Long businessType; 
        private Long cateId; 
        private String description; 
        private String dynamicData; 
        private String entityId; 
        private String label; 
        private String mediaId; 
        private Long mediaType; 
        private Long source; 
        private String tags; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMediaInfoRequest response) {
            super(response);
            this.aiLabelUrl = response.aiLabelUrl;
            this.appId = response.appId;
            this.businessType = response.businessType;
            this.cateId = response.cateId;
            this.description = response.description;
            this.dynamicData = response.dynamicData;
            this.entityId = response.entityId;
            this.label = response.label;
            this.mediaId = response.mediaId;
            this.mediaType = response.mediaType;
            this.source = response.source;
            this.tags = response.tags;
            this.title = response.title;
        } 

        /**
         * OSS存储地址
         */
        public Builder aiLabelUrl(String aiLabelUrl) {
            this.putQueryParameter("AiLabelUrl", aiLabelUrl);
            this.aiLabelUrl = aiLabelUrl;
            return this;
        }

        /**
         * 应用
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 媒资业务类型
         */
        public Builder businessType(Long businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * 分类ID
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * 描述
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 动态数据
         */
        public Builder dynamicData(String dynamicData) {
            this.putQueryParameter("DynamicData", dynamicData);
            this.dynamicData = dynamicData;
            return this;
        }

        /**
         * 元数据实体ID
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * 智能标签，json结构
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * 媒资Id
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * 媒资类型
         */
        public Builder mediaType(Long mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * 媒资来源
         */
        public Builder source(Long source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * 视频标签
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * 标题
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public ModifyMediaInfoRequest build() {
            return new ModifyMediaInfoRequest(this);
        } 

    } 

}
