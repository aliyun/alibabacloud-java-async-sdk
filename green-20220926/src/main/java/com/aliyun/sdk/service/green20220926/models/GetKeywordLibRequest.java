// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetKeywordLibRequest} extends {@link RequestModel}
 *
 * <p>GetKeywordLibRequest</p>
 */
public class GetKeywordLibRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantCode")
    private String tenantCode;

    private GetKeywordLibRequest(Builder builder) {
        super(builder);
        this.libId = builder.libId;
        this.regionId = builder.regionId;
        this.serviceCode = builder.serviceCode;
        this.tenantCode = builder.tenantCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKeywordLibRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return tenantCode
     */
    public String getTenantCode() {
        return this.tenantCode;
    }

    public static final class Builder extends Request.Builder<GetKeywordLibRequest, Builder> {
        private String libId; 
        private String regionId; 
        private String serviceCode; 
        private String tenantCode; 

        private Builder() {
            super();
        } 

        private Builder(GetKeywordLibRequest request) {
            super(request);
            this.libId = request.libId;
            this.regionId = request.regionId;
            this.serviceCode = request.serviceCode;
            this.tenantCode = request.tenantCode;
        } 

        /**
         * <p>The ID of the keyword library.</p>
         * 
         * <strong>example:</strong>
         * <p>customxx_xxx</p>
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The service code. This parameter is required when you query the preprocessing configurations (PreprocessList) of the library.</p>
         * 
         * <strong>example:</strong>
         * <p>ugc_moderation_byllm_pro</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>The code of the keyword library.</p>
         * <ul>
         * <li>desensitize: Desensitization keyword library.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desensitize</p>
         */
        public Builder tenantCode(String tenantCode) {
            this.putQueryParameter("TenantCode", tenantCode);
            this.tenantCode = tenantCode;
            return this;
        }

        @Override
        public GetKeywordLibRequest build() {
            return new GetKeywordLibRequest(this);
        } 

    } 

}
