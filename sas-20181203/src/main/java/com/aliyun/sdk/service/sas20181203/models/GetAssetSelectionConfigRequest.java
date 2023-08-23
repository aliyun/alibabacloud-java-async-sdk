// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAssetSelectionConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAssetSelectionConfigRequest</p>
 */
public class GetAssetSelectionConfigRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    @Validation(required = true)
    private String businessType;

    private GetAssetSelectionConfigRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetSelectionConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    public static final class Builder extends Request.Builder<GetAssetSelectionConfigRequest, Builder> {
        private String businessType; 

        private Builder() {
            super();
        } 

        private Builder(GetAssetSelectionConfigRequest request) {
            super(request);
            this.businessType = request.businessType;
        } 

        /**
         * The business type that you want to select for the asset. Valid values:
         * <p>
         * 
         * *   **VIRUS_SCAN_CYCLE_CONFIG**: virus detection configuration
         * *   **VIRUS_SCAN_ONCE_TASK**: one-time scan for virus detection
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        @Override
        public GetAssetSelectionConfigRequest build() {
            return new GetAssetSelectionConfigRequest(this);
        } 

    } 

}
