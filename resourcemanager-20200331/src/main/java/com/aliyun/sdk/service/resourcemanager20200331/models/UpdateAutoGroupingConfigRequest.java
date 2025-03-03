// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link UpdateAutoGroupingConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateAutoGroupingConfigRequest</p>
 */
public class UpdateAutoGroupingConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableExistingResourcesTransfer")
    private Boolean enableExistingResourcesTransfer;

    private UpdateAutoGroupingConfigRequest(Builder builder) {
        super(builder);
        this.enableExistingResourcesTransfer = builder.enableExistingResourcesTransfer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutoGroupingConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableExistingResourcesTransfer
     */
    public Boolean getEnableExistingResourcesTransfer() {
        return this.enableExistingResourcesTransfer;
    }

    public static final class Builder extends Request.Builder<UpdateAutoGroupingConfigRequest, Builder> {
        private Boolean enableExistingResourcesTransfer; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAutoGroupingConfigRequest request) {
            super(request);
            this.enableExistingResourcesTransfer = request.enableExistingResourcesTransfer;
        } 

        /**
         * <p>Specifies whether to enable the Transfer Existing Associated Resources feature. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableExistingResourcesTransfer(Boolean enableExistingResourcesTransfer) {
            this.putQueryParameter("EnableExistingResourcesTransfer", enableExistingResourcesTransfer);
            this.enableExistingResourcesTransfer = enableExistingResourcesTransfer;
            return this;
        }

        @Override
        public UpdateAutoGroupingConfigRequest build() {
            return new UpdateAutoGroupingConfigRequest(this);
        } 

    } 

}
