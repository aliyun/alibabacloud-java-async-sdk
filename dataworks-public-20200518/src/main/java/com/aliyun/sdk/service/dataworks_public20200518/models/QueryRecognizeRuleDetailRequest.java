// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecognizeRuleDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryRecognizeRuleDetailRequest</p>
 */
public class QueryRecognizeRuleDetailRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SensitiveName")
    @Validation(required = true)
    private String sensitiveName;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private QueryRecognizeRuleDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sensitiveName = builder.sensitiveName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecognizeRuleDetailRequest create() {
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
     * @return sensitiveName
     */
    public String getSensitiveName() {
        return this.sensitiveName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryRecognizeRuleDetailRequest, Builder> {
        private String regionId; 
        private String sensitiveName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecognizeRuleDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sensitiveName = request.sensitiveName;
            this.tenantId = request.tenantId;
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
         * SensitiveName.
         */
        public Builder sensitiveName(String sensitiveName) {
            this.putBodyParameter("SensitiveName", sensitiveName);
            this.sensitiveName = sensitiveName;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryRecognizeRuleDetailRequest build() {
            return new QueryRecognizeRuleDetailRequest(this);
        } 

    } 

}
