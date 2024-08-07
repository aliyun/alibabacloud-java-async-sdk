// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSelectionKeyByTypeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSelectionKeyByTypeRequest</p>
 */
public class UpdateSelectionKeyByTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectionKey")
    private String selectionKey;

    private UpdateSelectionKeyByTypeRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.selectionKey = builder.selectionKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSelectionKeyByTypeRequest create() {
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
     * @return selectionKey
     */
    public String getSelectionKey() {
        return this.selectionKey;
    }

    public static final class Builder extends Request.Builder<UpdateSelectionKeyByTypeRequest, Builder> {
        private String businessType; 
        private String selectionKey; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSelectionKeyByTypeRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.selectionKey = request.selectionKey;
        } 

        /**
         * The business type of the asset selection. Valid value:
         * <p>
         * 
         * *   **VIRUS_SCAN_CYCLE_CONFIG**: virus detection configuration.
         * *   **VIRUS_SCAN_ONCE_TASK**: one-time scan for virus detection.
         * *   **AGENTLESS_MALICIOUS_WHITE_LIST_\[ID]**: a whitelist rule for alerts that are generated by the agentless detection feature.
         * *   **AGENTLESS_VUL_WHITE_LIST_\[ID]**: a whitelist rule for vulnerabilities that are detected by the agentless detection feature.
         * *   **FILE_PROTECT_RULE_SWITCH_TYPE_\[ID]**: key file protection.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * The unique identifier of the asset selection.
         */
        public Builder selectionKey(String selectionKey) {
            this.putQueryParameter("SelectionKey", selectionKey);
            this.selectionKey = selectionKey;
            return this;
        }

        @Override
        public UpdateSelectionKeyByTypeRequest build() {
            return new UpdateSelectionKeyByTypeRequest(this);
        } 

    } 

}
