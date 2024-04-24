// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecognizeDataByRuleTypeRequest} extends {@link RequestModel}
 *
 * <p>QueryRecognizeDataByRuleTypeRequest</p>
 */
public class QueryRecognizeDataByRuleTypeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RecognizeRulesType")
    @Validation(required = true)
    private String recognizeRulesType;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private QueryRecognizeDataByRuleTypeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.recognizeRulesType = builder.recognizeRulesType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecognizeDataByRuleTypeRequest create() {
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
     * @return recognizeRulesType
     */
    public String getRecognizeRulesType() {
        return this.recognizeRulesType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryRecognizeDataByRuleTypeRequest, Builder> {
        private String regionId; 
        private String recognizeRulesType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecognizeDataByRuleTypeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.recognizeRulesType = request.recognizeRulesType;
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
         * RecognizeRulesType.
         */
        public Builder recognizeRulesType(String recognizeRulesType) {
            this.putBodyParameter("RecognizeRulesType", recognizeRulesType);
            this.recognizeRulesType = recognizeRulesType;
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
        public QueryRecognizeDataByRuleTypeRequest build() {
            return new QueryRecognizeDataByRuleTypeRequest(this);
        } 

    } 

}
