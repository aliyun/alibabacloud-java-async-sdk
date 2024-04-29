// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAssetSelectionConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAssetSelectionConfigRequest</p>
 */
public class GetAssetSelectionConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The feature that is selected for the asset. Valid values:
         * <p>
         * 
         * *   **VIRUS_SCAN_CYCLE_CONFIG**: virus detection and removal
         * *   **VIRUS_SCAN_ONCE_TASK**: one-time scan for viruses
         * *   **AGENTLESS_MALICIOUS_WHITE_LIST_\[ID]**: a whitelist rule for alerts that are detected by using the agentless detection feature
         * *   **AGENTLESS_VUL_WHITE_LIST_\[ID]**: a whitelist rule for vulnerabilities that are detected by using the agentless detection feature
         * *   **FILE_PROTECT_RULE_SWITCH_TYPE_\[ID]**: core file protectioion
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
