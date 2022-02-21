// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAntChainContractContentRequest} extends {@link RequestModel}
 *
 * <p>UpdateAntChainContractContentRequest</p>
 */
public class UpdateAntChainContractContentRequest extends Request {
    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("ContentId")
    @Validation(required = true)
    private String contentId;

    @Body
    @NameInMap("ContentName")
    private String contentName;

    @Body
    @NameInMap("ParentContentId")
    private String parentContentId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateAntChainContractContentRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.contentId = builder.contentId;
        this.contentName = builder.contentName;
        this.parentContentId = builder.parentContentId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAntChainContractContentRequest, Builder> {
        private String content; 
        private String contentId; 
        private String contentName; 
        private String parentContentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAntChainContractContentRequest response) {
            super(response);
            this.content = response.content;
            this.contentId = response.contentId;
            this.contentName = response.contentName;
            this.parentContentId = response.parentContentId;
            this.regionId = response.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateAntChainContractContentRequest build() {
            return new UpdateAntChainContractContentRequest(this);
        } 

    } 

}
