// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDataQualityRuleTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetDataQualityRuleTemplateRequest</p>
 */
public class GetDataQualityRuleTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    private GetDataQualityRuleTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.code = builder.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityRuleTemplateRequest create() {
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    public static final class Builder extends Request.Builder<GetDataQualityRuleTemplateRequest, Builder> {
        private String regionId; 
        private String code; 

        private Builder() {
            super();
        } 

        private Builder(GetDataQualityRuleTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.code = request.code;
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
         * <p>The code for the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFINED:123</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        @Override
        public GetDataQualityRuleTemplateRequest build() {
            return new GetDataQualityRuleTemplateRequest(this);
        } 

    } 

}
