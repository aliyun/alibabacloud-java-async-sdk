// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link OperateAppTemplateLikeRequest} extends {@link RequestModel}
 *
 * <p>OperateAppTemplateLikeRequest</p>
 */
public class OperateAppTemplateLikeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Liked")
    private Boolean liked;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private OperateAppTemplateLikeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.liked = builder.liked;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateAppTemplateLikeRequest create() {
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
     * @return liked
     */
    public Boolean getLiked() {
        return this.liked;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<OperateAppTemplateLikeRequest, Builder> {
        private String regionId; 
        private Boolean liked; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(OperateAppTemplateLikeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.liked = request.liked;
            this.templateId = request.templateId;
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
         * Liked.
         */
        public Builder liked(Boolean liked) {
            this.putQueryParameter("Liked", liked);
            this.liked = liked;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public OperateAppTemplateLikeRequest build() {
            return new OperateAppTemplateLikeRequest(this);
        } 

    } 

}
