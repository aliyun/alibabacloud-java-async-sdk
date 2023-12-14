// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAssetSelectionConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAssetSelectionConfigRequest</p>
 */
public class CreateAssetSelectionConfigRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    @Validation(required = true)
    private String businessType;

    @Query
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    private CreateAssetSelectionConfigRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAssetSelectionConfigRequest create() {
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

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<CreateAssetSelectionConfigRequest, Builder> {
        private String businessType; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAssetSelectionConfigRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.targetType = request.targetType;
        } 

        /**
         * The feature that you want to select for the asset. Valid values:
         * <p>
         * 
         * *   **VIRUS_SCAN_CYCLE_CONFIG**: virus detection and removal
         * *   **VIRUS_SCAN_ONCE_TASK**: one-time scan for viruses
         * *   **AGENTLESS_MALICIOUS_WHITE_LIST_\[ID]**: a whitelist rule for alerts that are detected by using the agentless detection feature
         * *   **AGENTLESS_VUL_WHITE_LIST_\[ID]**: a whitelist rule for vulnerabilities that are detected by using the agentless detection feature
         * *   **FILE_PROTECT_RULE_SWITCH_TYPE_\[ID]**: core file protection
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * The dimension based on which you want to select the asset. Valid values:
         * <p>
         * 
         * *   **instance**: selects the asset by server.
         * *   **group**: selects the asset by group.
         * *   **vpc**: selects the asset by virtual private cloud (VPC).
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public CreateAssetSelectionConfigRequest build() {
            return new CreateAssetSelectionConfigRequest(this);
        } 

    } 

}
