// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link GetResourcePredictResultRequest} extends {@link RequestModel}
 *
 * <p>GetResourcePredictResultRequest</p>
 */
public class GetResourcePredictResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private Long resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    private GetResourcePredictResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourcePredictResultRequest create() {
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
     * @return resourceId
     */
    public Long getResourceId() {
        return this.resourceId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<GetResourcePredictResultRequest, Builder> {
        private String regionId; 
        private Long resourceId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetResourcePredictResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
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
         * <p>Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        public Builder resourceId(Long resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>Template ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>315797</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetResourcePredictResultRequest build() {
            return new GetResourcePredictResultRequest(this);
        } 

    } 

}
