// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApiTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetApiTemplateRequest</p>
 */
public class GetApiTemplateRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private GetApiTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiTemplateRequest create() {
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<GetApiTemplateRequest, Builder> {
        private String regionId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetApiTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.templateId = request.templateId;
        } 

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 集群模板id。
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetApiTemplateRequest build() {
            return new GetApiTemplateRequest(this);
        } 

    } 

}
