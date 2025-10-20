// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetApplicationTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetApplicationTemplateRequest</p>
 */
public class GetApplicationTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationTemplateId;

    private GetApplicationTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationTemplateId = builder.applicationTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationTemplateRequest create() {
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
     * @return applicationTemplateId
     */
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    public static final class Builder extends Request.Builder<GetApplicationTemplateRequest, Builder> {
        private String regionId; 
        private String applicationTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(GetApplicationTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationTemplateId = request.applicationTemplateId;
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
         * <p>应用模板id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apt_ramuser_xxxx</p>
         */
        public Builder applicationTemplateId(String applicationTemplateId) {
            this.putQueryParameter("ApplicationTemplateId", applicationTemplateId);
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }

        @Override
        public GetApplicationTemplateRequest build() {
            return new GetApplicationTemplateRequest(this);
        } 

    } 

}
