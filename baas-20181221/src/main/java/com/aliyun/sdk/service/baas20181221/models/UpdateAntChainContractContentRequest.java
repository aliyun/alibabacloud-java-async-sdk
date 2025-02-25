// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAntChainContractContentRequest} extends {@link RequestModel}
 *
 * <p>UpdateAntChainContractContentRequest</p>
 */
public class UpdateAntChainContractContentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentName")
    private String contentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentContentId")
    private String parentContentId;

    private UpdateAntChainContractContentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.content = builder.content;
        this.contentId = builder.contentId;
        this.contentName = builder.contentName;
        this.parentContentId = builder.parentContentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAntChainContractContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentId
     */
    public String getContentId() {
        return this.contentId;
    }

    /**
     * @return contentName
     */
    public String getContentName() {
        return this.contentName;
    }

    /**
     * @return parentContentId
     */
    public String getParentContentId() {
        return this.parentContentId;
    }

    public static final class Builder extends Request.Builder<UpdateAntChainContractContentRequest, Builder> {
        private String regionId; 
        private String content; 
        private String contentId; 
        private String contentName; 
        private String parentContentId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAntChainContractContentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.content = request.content;
            this.contentId = request.contentId;
            this.contentName = request.contentName;
            this.parentContentId = request.parentContentId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ContentId.
         */
        public Builder contentId(String contentId) {
            this.putBodyParameter("ContentId", contentId);
            this.contentId = contentId;
            return this;
        }

        /**
         * ContentName.
         */
        public Builder contentName(String contentName) {
            this.putBodyParameter("ContentName", contentName);
            this.contentName = contentName;
            return this;
        }

        /**
         * ParentContentId.
         */
        public Builder parentContentId(String parentContentId) {
            this.putBodyParameter("ParentContentId", parentContentId);
            this.parentContentId = parentContentId;
            return this;
        }

        @Override
        public UpdateAntChainContractContentRequest build() {
            return new UpdateAntChainContractContentRequest(this);
        } 

    } 

}
