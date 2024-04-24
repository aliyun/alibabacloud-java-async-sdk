// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRecognizeRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRecognizeRuleRequest</p>
 */
public class DeleteRecognizeRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SensitiveId")
    @Validation(required = true)
    private String sensitiveId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private DeleteRecognizeRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sensitiveId = builder.sensitiveId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRecognizeRuleRequest create() {
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
     * @return sensitiveId
     */
    public String getSensitiveId() {
        return this.sensitiveId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DeleteRecognizeRuleRequest, Builder> {
        private String regionId; 
        private String sensitiveId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRecognizeRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sensitiveId = request.sensitiveId;
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
         * SensitiveId.
         */
        public Builder sensitiveId(String sensitiveId) {
            this.putBodyParameter("SensitiveId", sensitiveId);
            this.sensitiveId = sensitiveId;
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
        public DeleteRecognizeRuleRequest build() {
            return new DeleteRecognizeRuleRequest(this);
        } 

    } 

}
