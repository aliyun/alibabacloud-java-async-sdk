// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link GetDataMaskingColumnCountRequest} extends {@link RequestModel}
 *
 * <p>GetDataMaskingColumnCountRequest</p>
 */
public class GetDataMaskingColumnCountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductIds")
    private String productIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private GetDataMaskingColumnCountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.lang = builder.lang;
        this.productIds = builder.productIds;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataMaskingColumnCountRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return productIds
     */
    public String getProductIds() {
        return this.productIds;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<GetDataMaskingColumnCountRequest, Builder> {
        private String regionId; 
        private String lang; 
        private String productIds; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataMaskingColumnCountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.lang = request.lang;
            this.productIds = request.productIds;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ProductIds.
         */
        public Builder productIds(String productIds) {
            this.putQueryParameter("ProductIds", productIds);
            this.productIds = productIds;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetDataMaskingColumnCountRequest build() {
            return new GetDataMaskingColumnCountRequest(this);
        } 

    } 

}
