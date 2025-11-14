// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetAgentlessTaskUsedSizeEstimateRequest} extends {@link RequestModel}
 *
 * <p>GetAgentlessTaskUsedSizeEstimateRequest</p>
 */
public class GetAgentlessTaskUsedSizeEstimateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetSelectionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetSelectionType;

    private GetAgentlessTaskUsedSizeEstimateRequest(Builder builder) {
        super(builder);
        this.assetSelectionType = builder.assetSelectionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentlessTaskUsedSizeEstimateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetSelectionType
     */
    public String getAssetSelectionType() {
        return this.assetSelectionType;
    }

    public static final class Builder extends Request.Builder<GetAgentlessTaskUsedSizeEstimateRequest, Builder> {
        private String assetSelectionType; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentlessTaskUsedSizeEstimateRequest request) {
            super(request);
            this.assetSelectionType = request.assetSelectionType;
        } 

        /**
         * <p>Asset selection identifier.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENTLESS_SCAN_ONCE_TASK_1720145******</p>
         */
        public Builder assetSelectionType(String assetSelectionType) {
            this.putQueryParameter("AssetSelectionType", assetSelectionType);
            this.assetSelectionType = assetSelectionType;
            return this;
        }

        @Override
        public GetAgentlessTaskUsedSizeEstimateRequest build() {
            return new GetAgentlessTaskUsedSizeEstimateRequest(this);
        } 

    } 

}
