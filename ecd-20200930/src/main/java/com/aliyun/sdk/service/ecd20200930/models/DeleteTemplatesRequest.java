// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DeleteTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DeleteTemplatesRequest</p>
 */
public class DeleteTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateIds")
    private java.util.List<String> templateIds;

    private DeleteTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizType = builder.bizType;
        this.templateIds = builder.templateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTemplatesRequest create() {
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return templateIds
     */
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    public static final class Builder extends Request.Builder<DeleteTemplatesRequest, Builder> {
        private String regionId; 
        private String bizType; 
        private java.util.List<String> templateIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTemplatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizType = request.bizType;
            this.templateIds = request.templateIds;
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
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The IDs of the templates that you want to delete.</p>
         */
        public Builder templateIds(java.util.List<String> templateIds) {
            this.putBodyParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        @Override
        public DeleteTemplatesRequest build() {
            return new DeleteTemplatesRequest(this);
        } 

    } 

}
